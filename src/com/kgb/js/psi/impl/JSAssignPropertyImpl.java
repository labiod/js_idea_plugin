// This is a generated file. Not intended for manual editing.
package com.kgb.js.psi.impl;

import com.intellij.icons.AllIcons;
import com.intellij.lang.ASTNode;
import com.intellij.navigation.ItemPresentation;
import com.intellij.psi.PsiElement;
import com.kgb.js.psi.JSAssignProperty;
import com.kgb.js.psi.JSMethod;
import com.kgb.js.psi.JSPropertyObject;
import com.kgb.js.psi.JSValue;
import com.kgb.js.psi.utils.JSFunctionPsiUtils;
import com.kgb.js.psi.utils.JSPsiImplUtil;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class JSAssignPropertyImpl extends JSClassDefImpl implements JSAssignProperty {

    public JSAssignPropertyImpl(ASTNode node) {
        super(node);
    }

    @Override
    public JSPropertyObject getPropertyObject() {
        return findChildByClass(JSPropertyObject.class);
    }

    @Override
    @NotNull
    public JSValue getValue() {
        return findNotNullChildByClass(JSValue.class);
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
}
