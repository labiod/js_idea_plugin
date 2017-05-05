package com.kgb.js.psi.impl;

import com.intellij.lang.ASTNode;
import com.intellij.openapi.wm.IdeFrame;
import com.intellij.psi.PsiElement;
import com.kgb.js.psi.*;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Krzysztof Betlej <labiod@wp.pl>
 *         Date: 5/4/17.
 */
public class JSPropertyObjectImpl extends JSPropertyImpl implements JSPropertyObject {
    private JSProperty mProperty;
    private JSProperty mPropertySpace;
    public JSPropertyObjectImpl(@NotNull ASTNode node) {
        super(node);
        mProperty = findChildByClass(JSPropertyMain.class);
        mPropertySpace = findChildByClass(JSPropertySpace.class);
    }

    @Override
    public JSMethod[] getMethodsInner() {
        return new JSMethod[0];
    }

    @Override
    public JSProperty getNamespace() {
        return mPropertySpace;
    }

    @Nullable
    @Override
    public PsiElement getNameIdentifier() {
        return mProperty;
    }

    @Override
    public JSProperty getParentProperty() {
        return mPropertySpace;
    }

    @Override
    public void setNameSpace(JSProperty property) {
        mPropertySpace = property;
    }
}
