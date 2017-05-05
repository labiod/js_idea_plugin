package com.kgb.js.psi.impl;

import com.intellij.icons.AllIcons;
import com.intellij.lang.ASTNode;
import com.intellij.navigation.ItemPresentation;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.kgb.js.psi.*;
import com.kgb.js.psi.utils.JSFunctionPsiUtils;
import com.kgb.js.psi.utils.JSPsiImplUtil;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class JSDefPropertyImpl extends JSClassDefImpl implements JSDefProperty {

    private final JSPropertyObject mObject;
    private final JSValue mValue;

    public JSDefPropertyImpl(ASTNode node) {
        super(node);
        mObject = findChildByClass(JSPropertyObject.class);
        mValue = findChildByClass(JSValue.class);
    }

    public void accept(@NotNull PsiElementVisitor visitor) {
        if (visitor instanceof JSVisitor) accept((JSVisitor) visitor);
        else super.accept(visitor);
    }

    public PsiElement getNameIdentifier() {
        return getPropertyObject();
    }

    public boolean isFunctionRef() {
        return JSPsiImplUtil.isFunctionRef(this);
    }

    public ItemPresentation getPresentation() {
        return new ItemPresentation() {
            @Nullable
            @Override
            public String getPresentableText() {
                if (isFunctionRef()) {
                    return getPropertyObject().getName() + ": function(" + JSFunctionPsiUtils.getFunArgsPresentableText(
                            getValue().getFunctionDef()) + ")";
                }
                return getPropertyObject().getName();
            }

            @Nullable
            @Override
            public String getLocationString() {
                return "";
            }

            @Nullable
            @Override
            public Icon getIcon(boolean b) {
                return isFunctionRef() ? AllIcons.Nodes.MethodReference : AllIcons.Nodes.Property;
            }
        };
    }

    public JSMethod[] getMethodsInner() {
        return JSPsiImplUtil.getMethodsInner(this);
    }

    @Override
    public JSProperty getPropertyObject() {
        return mObject;
    }

    public JSValue getValue() {
        return mValue;
    }
}
