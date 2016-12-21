package com.kgb.js.psi;

import com.intellij.psi.tree.IElementType;
import com.kgb.js.JSLanguage;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

/**
 * Created by labiod : <labiod@wp.pl>
 * Class com.kgb.lisp.psi.LispElementType
 */
public class JSElementType extends IElementType {
    public JSElementType(@NotNull @NonNls String debugName) {
        super(debugName, JSLanguage.INSTANCE);
    }
}
