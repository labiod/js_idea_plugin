package com.kgb.js.psi;

import com.intellij.psi.tree.IElementType;
import com.kgb.js.JSLanguage;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

/**
 * Created by labiod : <labiod@wp.pl>
 * Class com.kgb.lisp.psi.LispTokenType
 */
public class JSTokenType extends IElementType {
    public JSTokenType(@NotNull @NonNls String debugName) {
        super(debugName, JSLanguage.INSTANCE);
    }

    @Override
    public String toString() {
        return "JSTokenType." + super.toString();
    }
}
