package com.kgb.js.parser;

import com.intellij.lang.ASTNode;
import com.intellij.lang.Language;
import com.intellij.lang.ParserDefinition;
import com.intellij.lang.PsiParser;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.project.Project;
import com.intellij.psi.FileViewProvider;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IFileElementType;
import com.intellij.psi.tree.TokenSet;
import com.kgb.js.JSLanguage;
import com.kgb.js.lexer.JSLexerAdapter;
import com.kgb.js.psi.JSFile;
import com.kgb.js.psi.JSTypes;
import org.jetbrains.annotations.NotNull;

public class JSParserDefinition implements ParserDefinition {
    public static final TokenSet WHITE_SPACE = TokenSet.create(TokenType.WHITE_SPACE);
    public static final TokenSet COMMENTS = TokenSet.create(JSTypes.COMMENT, JSTypes.MULTILINE_COMMENT);
    public static final TokenSet STRING_LITERAL = TokenSet.create(JSTypes.STRING);

    private static final  IFileElementType FILE = new IFileElementType(Language.findInstance(JSLanguage.class));
    @NotNull
    @Override
    public Lexer createLexer(Project project) {
        return new JSLexerAdapter();
    }

    @Override
    public PsiParser createParser(Project project) {
        return new JSParser();
    }

    @Override
    public IFileElementType getFileNodeType() {
        return FILE;
    }

    @NotNull
    @Override
    public TokenSet getWhitespaceTokens() {
        return WHITE_SPACE;
    }

    @NotNull
    @Override
    public TokenSet getCommentTokens() {
        return COMMENTS;
    }

    @NotNull
    @Override
    public TokenSet getStringLiteralElements() {
        return STRING_LITERAL;
    }

    @NotNull
    @Override
    public PsiElement createElement(ASTNode astNode) {
        return new JSTypes.Factory().createElement(astNode);
    }

    @Override
    public PsiFile createFile(FileViewProvider fileViewProvider) {
        return new JSFile(fileViewProvider);
    }

    @Override
    public SpaceRequirements spaceExistanceTypeBetweenTokens(ASTNode astNode, ASTNode astNode1) {
        return SpaceRequirements.MAY;
    }
}
