package com.kgb.js.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.impl.PsiImplUtil;
import com.intellij.psi.impl.source.tree.CompositeElement;
import com.intellij.util.IncorrectOperationException;
import com.kgb.js.psi.JSIdentifier;
import com.kgb.js.psi.JSPsiElement;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * @author labiod : <labiod@wp.pl>;
 * @version 0.0.1; created:11.02.2017
 *          Class com.kgb.js.psi.impl.JSWrapperElement
 */
public class JSWrapperElement extends ASTWrapperPsiElement implements JSPsiElement {
    public JSWrapperElement(@NotNull ASTNode node) {
        super(node);
    }

    @Nullable
    @Override
    public PsiElement getNameIdentifier() {
        return this;
    }

    @Override
    public PsiElement setName(@NonNls @NotNull String name) throws IncorrectOperationException {
        PsiImplUtil.setName(this, name);
        return this;
    }
}
