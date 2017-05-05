package com.kgb.js.psi.utils;

import com.intellij.icons.AllIcons;
import com.intellij.navigation.ItemPresentation;
import com.intellij.psi.PsiElement;
import com.intellij.psi.util.PsiTreeUtil;
import com.kgb.js.psi.*;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

/**
 * @author Krzysztof Betlej <labiod@wp.pl>
 *         Date: 4/24/17.
 */
public class JSPropertyPsiUtils {
    public static JSMethod[] getMethods(JSDefProperty propertyDef) {
        if (propertyDef.getValue() == null) {
            return new JSMethod[0];
        }
        JSValue propertyValue = propertyDef.getValue();
        if (propertyValue.getFunctionDef() != null) {
            return PsiTreeUtil.getChildrenOfType(propertyValue.getFunctionDef(), JSMethod.class);
        } else {
            return new JSMethod[0];
        }
    }

    public static PsiElement getNameIdentifier(JSValue propertyValue) {
        if (propertyValue.getExpr() != null) {
            return propertyValue.getExpr();
        } else {
            return propertyValue;
        }
    }

    public static ItemPresentation getPresentation(JSPropertySpace propertySpace) {
        return new ItemPresentation() {
            @Nullable
            @Override
            public String getPresentableText() {
                return propertySpace.getName() + ":" + JSTypeUtils.getTypeName(propertySpace);
            }

            @Nullable
            @Override
            public String getLocationString() {
                return "";
            }

            @Nullable
            @Override
            public Icon getIcon(boolean b) {
                return AllIcons.Nodes.Variable;
            }
        };
    }
}
