package com.kgb.js.psi.impl;

import com.intellij.lang.ASTNode;
import com.intellij.lang.Language;
import com.intellij.navigation.ItemPresentation;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.util.Key;
import com.intellij.openapi.util.TextRange;
import com.intellij.psi.*;
import com.intellij.psi.scope.PsiScopeProcessor;
import com.intellij.psi.search.GlobalSearchScope;
import com.intellij.psi.search.SearchScope;
import com.intellij.util.IncorrectOperationException;
import com.kgb.js.psi.*;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;
import java.util.List;

/**
 * @author Krzysztof Betlej <labiod@wp.pl>
 *         Date: 5/2/17.
 */
public class JSPropertySpaceImpl extends JSPropertyImpl implements JSPropertySpace {
    private JSProperty mProperty;
    private JSProperty mPropertySpace;
    public JSPropertySpaceImpl(@NotNull ASTNode node) {
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
    public JSProperty getProperty() {
        return mProperty;
    }

    @Override
    public void setNameSpace(JSProperty property) {
        mPropertySpace = property;
    }
}
