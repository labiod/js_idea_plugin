package com.kgb.js.psi.impl;

import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.kgb.js.psi.JSMethod;
import com.kgb.js.psi.JSPropertyBase;
import com.kgb.js.psi.JSPropertyMain;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * @author Krzysztof Betlej <labiod@wp.pl>
 *         Date: 5/5/17.
 */
public class JSPropertyMainImpl extends JSPropertyImpl implements JSPropertyMain {
    public JSPropertyMainImpl(@NotNull ASTNode node) {
        super(node);
    }

    @Override
    public JSMethod[] getMethodsInner() {
        return new JSMethod[0];
    }

    @Nullable
    @Override
    public PsiElement getNameIdentifier() {
        return findChildByClass(JSPropertyBase.class);
    }
}
