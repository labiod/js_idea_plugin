package com.kgb.js.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.lang.Language;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.util.Key;
import com.intellij.openapi.util.TextRange;
import com.intellij.psi.*;
import com.intellij.psi.scope.PsiScopeProcessor;
import com.intellij.psi.search.GlobalSearchScope;
import com.intellij.psi.search.SearchScope;
import com.intellij.psi.util.PsiTreeUtil;
import com.intellij.util.IncorrectOperationException;
import com.kgb.js.JsIcons;
import com.kgb.js.psi.JSClass;
import com.kgb.js.psi.JSField;
import com.kgb.js.psi.JSMethod;
import com.kgb.js.psi.JSProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Krzysztof Betlej <labiod@wp.pl>
 *         Date: 4/14/17.
 */
public abstract class JSClassImpl extends JSPsiBaseImpl implements JSClass {

    public JSClassImpl(@NotNull ASTNode node) {
        super(node);
    }

    @Nullable
    @Override
    public JSClass getSuperClass() {
        return new JSObject(getNode());
    }

    @NotNull
    @Override
    public JSMethod[] getMethods() {
        List<JSMethod> methodList = new ArrayList<>(Arrays.asList(getSuperClass().getMethods()));
        JSMethod[] classMethods = getMethodsInner();
        if (classMethods != null) {
            methodList.addAll(Arrays.asList(classMethods));
        }
        JSMethod[] methods = new JSMethod[methodList.size()];
        return methodList.toArray(methods);
    }

    protected abstract JSMethod[] getMethodsInner();

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
    public String getName() {
        PsiElement name = getNameIdentifier();
        return name != null ? name.getText() : "...";
    }

    @Override
    public PsiElement setName(@NotNull String s) throws IncorrectOperationException {
        return this;
    }

    @Override
    public Icon getIcon(int i) {
        return JsIcons.CLASS_ICON;
    }
}
