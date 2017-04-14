package com.kgb.js.psi.impl;

import com.intellij.icons.AllIcons;
import com.intellij.lang.ASTNode;
import com.intellij.navigation.ItemPresentation;
import com.intellij.psi.PsiElement;
import com.intellij.psi.impl.PsiImplUtil;
import com.intellij.psi.util.PsiTreeUtil;
import com.kgb.js.psi.*;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

/**
 * @author Krzysztof Betlej <labiod@wp.pl>
 *         Date: 1/30/17.
 */
public class JSPsiImplUtil {
    //Get Name Identifier block

    public static PsiElement getNameIdentifier(JSProperty property) {
        return property;
    }

    public static PsiElement getNameIdentifier(JSBaseProperty property) {
        return property.getVname();
    }

    public static PsiElement getNameIdentifier(JSFunArgs funArgs) {
        return funArgs;
    }

    public static PsiElement getNameIdentifier(JSFunctionDef functionDef) {
        return functionDef.getVname();
    }


    public static PsiElement getNameIdentifier(JSPropertyDef property) {
        return property.getProperty();
    }

    public static PsiElement getNameIdentifier(JSPropertyValue propertyValue) {
        if (propertyValue.getNumber() != null) {
            return propertyValue.getNumber();
        } else if (propertyValue.getString() != null) {
            return propertyValue.getString();
        } else if (propertyValue.getProperty() != null) {
            return propertyValue.getProperty();
        } else if (propertyValue.getBoolean() != null) {
            return propertyValue.getBoolean();
        } else {
            return propertyValue;
        }
    }

    public static PsiElement getNameIdentifier(JSBoolean jsBoolean) {
        return jsBoolean;
    }

    public static int getLength(JSFunArgs funArgs) {
        int result = 0;
        if (funArgs.getCommaSeparatedList() != null) {
            JSProperty[] properties = PsiTreeUtil.getChildrenOfType(funArgs.getCommaSeparatedList(), JSProperty.class);
            return properties.length;
        }
        return 0;
    }

    public static int getArgsLength(JSFunctionDef functionDef) {
        return functionDef.getFunArgs().getLength();
    }
    //Get Presentation block

    public static ItemPresentation getPresentation(JSClass propertyDef) {
        return new ItemPresentation() {
            @Nullable
            @Override
            public String getPresentableText() {
                return propertyDef.getName();
            }

            @Nullable
            @Override
            public String getLocationString() {
                return propertyDef.getContainingFile().getName();
            }

            @Nullable
            @Override
            public Icon getIcon(boolean b) {
                return AllIcons.Nodes.Variable;
            }
        };
    }
}
