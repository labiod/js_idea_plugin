package com.kgb.js.psi.utils;

import com.intellij.icons.AllIcons;
import com.intellij.navigation.ItemPresentation;
import com.intellij.psi.PsiElement;
import com.intellij.psi.util.PsiTreeUtil;
import com.kgb.js.psi.JSMethod;
import com.kgb.js.psi.JSProperty;
import com.kgb.js.psi.JSPropertyDef;
import com.kgb.js.psi.JSPropertyValue;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

/**
 * @author Krzysztof Betlej <labiod@wp.pl>
 *         Date: 4/24/17.
 */
public class JSPropertyPsiUtils {
    public static JSMethod[] getMethods(JSPropertyDef propertyDef) {
        if (propertyDef.getPropertyValue() == null) {
            return new JSMethod[0];
        }
        JSPropertyValue propertyValue = propertyDef.getPropertyValue();
        if (propertyValue.getFunctionDef() != null) {
            return PsiTreeUtil.getChildrenOfType(propertyValue.getFunctionDef(), JSMethod.class);
        } else {
            return new JSMethod[0];
        }
    }

    public static PsiElement getNameIdentifier(JSPropertyValue propertyValue) {
        if (propertyValue.getExpr() != null) {
            return propertyValue.getExpr();
        } else {
            return propertyValue;
        }
    }

    public static ItemPresentation getPresentation(JSPropertyDef propertyDef) {
        return new ItemPresentation() {
            @Nullable
            @Override
            public String getPresentableText() {
                if (propertyDef.isFunction()) {
                    return propertyDef.getName() + ": function(" + JSFunctionPsiUtils.getFunArgsPresentableText(
                            propertyDef.getPropertyValue().getFunctionDef()) + ")";
                }
                return propertyDef.getName();
            }

            @Nullable
            @Override
            public String getLocationString() {
                return "";
            }

            @Nullable
            @Override
            public Icon getIcon(boolean b) {
                return propertyDef.isFunction() ? AllIcons.Nodes.MethodReference : AllIcons.Nodes.Property;
            }
        };
    }

    public static ItemPresentation getPresentation(JSProperty property) {
        return new ItemPresentation() {
            @Nullable
            @Override
            public String getPresentableText() {
                return property.getName() + ":" + JSTypeUtils.getTypeName(property);
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
