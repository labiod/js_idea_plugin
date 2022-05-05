package com.kgb.js.lexer;

import com.intellij.lexer.FlexAdapter;

/**
 * Created by labiod : <labiod@wp.pl>
 * Class com.kgb.lisp.lexer.LispLexerAdapter
 */
public class JSLexerAdapter extends FlexAdapter {
    public JSLexerAdapter() {
        super(new JSLexer(null));
    }
}
