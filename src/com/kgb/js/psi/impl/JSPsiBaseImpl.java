package com.kgb.js.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.util.IncorrectOperationException;
import com.kgb.js.psi.JSPsiBase;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * @author Krzysztof Betlej <labiod@wp.pl>
 *         Date: 4/25/17.
 */
public abstract class JSPsiBaseImpl extends ASTWrapperPsiElement implements JSPsiBase {
    public JSPsiBaseImpl(@NotNull ASTNode node) {
        super(node);
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
}
