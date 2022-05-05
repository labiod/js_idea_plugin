package com.kgb.js.highlighters;

import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.editor.HighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IElementType;
import com.kgb.js.highlighters.psi.JSTypes;
import com.kgb.js.lexer.JSLexerAdapter;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

import static com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey;

/**
 * @author labiod : <labiod@wp.pl>;
 * @version 0.0.1; created:22.01.2017
 * Class com.kgb.js.highlighters.BaseSyntaxHighlighter
 */
public class BaseSyntaxHighlighter extends SyntaxHighlighterBase {
    public static final TextAttributesKey SEPARATOR =
            createTextAttributesKey("SIMPLE_SEPARATOR", DefaultLanguageHighlighterColors.OPERATION_SIGN);
    public static final TextAttributesKey KEY =
            createTextAttributesKey("SIMPLE_KEY", DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey VALUE =
            createTextAttributesKey("SIMPLE_VALUE", DefaultLanguageHighlighterColors.CONSTANT);
    public static final TextAttributesKey COMMENT =
            createTextAttributesKey("SIMPLE_COMMENT", DefaultLanguageHighlighterColors.LINE_COMMENT);
    public static final TextAttributesKey STRING =
            createTextAttributesKey("SIMPLE_STRING", DefaultLanguageHighlighterColors.STRING);
    public static final TextAttributesKey BAD_CHARACTER =
            createTextAttributesKey("SIMPLE_BAD_CHARACTER", HighlighterColors.BAD_CHARACTER);

    private static final TextAttributesKey[] BAD_CHAR_KEYS = new TextAttributesKey[]{BAD_CHARACTER};
    private static final TextAttributesKey[] SEPARATOR_KEYS = new TextAttributesKey[]{SEPARATOR};
    private static final TextAttributesKey[] KEY_KEYS = new TextAttributesKey[]{KEY};
    private static final TextAttributesKey[] VALUE_KEYS = new TextAttributesKey[]{VALUE};
    private static final TextAttributesKey[] STRING_KEYS = new TextAttributesKey[]{STRING};
    private static final TextAttributesKey[] COMMENT_KEYS = new TextAttributesKey[]{COMMENT};
    private static final TextAttributesKey[] EMPTY_KEYS = new TextAttributesKey[0];

    private List<IElementType> mKeywordsList = new ArrayList<>();

    public BaseSyntaxHighlighter () {
        mKeywordsList.add(JSTypes.VAR);
        mKeywordsList.add(JSTypes.FUNCTION);
        mKeywordsList.add(JSTypes.IF);
        mKeywordsList.add(JSTypes.ELSE);
        mKeywordsList.add(JSTypes.TRUE);
        mKeywordsList.add(JSTypes.FALSE);
        mKeywordsList.add(JSTypes.RETURN);
        mKeywordsList.add(JSTypes.COMMA);
        mKeywordsList.add(JSTypes.SEMI);
        mKeywordsList.add(JSTypes.FOR);
        mKeywordsList.add(JSTypes.SWITCH);
        mKeywordsList.add(JSTypes.CASE);
        mKeywordsList.add(JSTypes.BREAK);
        mKeywordsList.add(JSTypes.DEFAULT);
        mKeywordsList.add(JSTypes.T_IF);
        mKeywordsList.add(JSTypes.WHILE);
        mKeywordsList.add(JSTypes.DO);
    }

    @NotNull
    @Override
    public Lexer getHighlightingLexer() {
        return new JSLexerAdapter();
    }

    @NotNull
    @Override
    public TextAttributesKey[] getTokenHighlights(IElementType tokenType) {
        if (tokenType.equals(JSTypes.EQ)) {
            return SEPARATOR_KEYS;
        } else if ( mKeywordsList.contains(tokenType)) {
            return KEY_KEYS;
        } else if (tokenType.equals(JSTypes.NUMBER)) {
            return VALUE_KEYS;
        } else if (tokenType.equals(JSTypes.COMMENT)) {
            return COMMENT_KEYS;
        } else if (tokenType.equals(JSTypes.STRING)) {
            return STRING_KEYS;
        } else if (tokenType.equals(TokenType.BAD_CHARACTER)) {
            return BAD_CHAR_KEYS;
        } else {
            return EMPTY_KEYS;
        }
    }
}
