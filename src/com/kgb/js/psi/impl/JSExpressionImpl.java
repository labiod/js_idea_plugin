package com.kgb.js.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.util.IncorrectOperationException;
import com.kgb.js.psi.*;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * @author Krzysztof Betlej <labiod@wp.pl>
 *         Date: 4/24/17.
 */
public abstract class JSExpressionImpl extends ASTWrapperPsiElement implements JSExpression {
    public JSExpressionImpl(@NotNull ASTNode node) {
        super(node);
    }

    @Nullable
    @Override
    public JSClass getSuperClass() {
        return null;
    }

    @NotNull
    @Override
    public JSMethod[] getMethods() {
        return new JSMethod[0];
    }

    @NotNull
    @Override
    public JSField[] getAllFields() {
        return new JSField[0];
    }

    @NotNull
    @Override
    public JSMethod[] getAllMethods() {
        return new JSMethod[0];
    }

    @Nullable
    @Override
    public PsiElement getNameIdentifier() {
        return null;
    }

    @Override
    public PsiElement setName(@NotNull String s) throws IncorrectOperationException {
        return null;
    }

    @Override
    public JSPropertySpace getNamespace() {
        return null;
    }
}
