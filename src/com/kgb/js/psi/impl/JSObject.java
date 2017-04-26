package com.kgb.js.psi.impl;

import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.kgb.js.psi.JSMethod;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * @author Krzysztof Betlej <labiod@wp.pl>
 *         Date: 4/24/17.
 */
public class JSObject extends JSClassImpl {
    public JSObject(ASTNode node) {
        super(node);
    }

    @NotNull
    @Override
    public JSMethod[] getMethods() {
        return getMethodsInner();
    }

    @Override
    protected JSMethod[] getMethodsInner() {
        return new JSMethod[0];
    }

    @Nullable
    @Override
    public PsiElement getNameIdentifier() {
        return this;
    }

    @Nullable
    @Override
    public String getName() {
        return "JSObject";
    }
}
