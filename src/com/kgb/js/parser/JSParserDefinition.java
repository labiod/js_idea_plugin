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
import com.kgb.js.highlighters.psi.JSTypes;
import com.kgb.js.lexer.JSLexerAdapter;
import com.kgb.js.psi.JSFile;
import org.jetbrains.annotations.NotNull;

public class JSParserDefinition implements ParserDefinition {
    public static final TokenSet WHITE_SPACE = TokenSet.create(TokenType.WHITE_SPACE);
    public static final TokenSet COMMENTS = TokenSet.create(JSTypes.MULTILINE_COMMENT, JSTypes.COMMENT);
    public static final TokenSet STRING_LITERAL = TokenSet.create(JSTypes.STRING);

    private static final  IFileElementType FILE = new IFileElementType(JSLanguage.INSTANCE);

    @NotNull
    @Override
    public Lexer createLexer(Project project) {
        return new JSLexerAdapter();
    }

    @NotNull
    @Override
    public PsiParser createParser(Project project) {
        return new JSParser();
    }

    @NotNull
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
        return JSTypes.Factory.createElement(astNode);
    }

    @NotNull
    @Override
    public PsiFile createFile(@NotNull FileViewProvider fileViewProvider) {
        return new JSFile(fileViewProvider);
    }

    @Override
    public SpaceRequirements spaceExistenceTypeBetweenTokens(ASTNode astNode, ASTNode astNode1) {
        return SpaceRequirements.MAY;
    }
}
