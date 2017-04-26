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
 *         Date: 1/30/17.
 */
public class JSPsiImplUtil {
    //Get Name Identifier block

    public static PsiElement getNameIdentifier(JSProperty property) {
        return property;
    }

    public static PsiElement getNameIdentifier(JSPropertyDef propertyDef) {
        return propertyDef.getClassDef();
    }

    public static PsiElement getNameIdentifier(JSBaseProperty property) {
        return property.getVname();
    }

    public static PsiElement getNameIdentifier(JSFunctionDef functionDef) {
        if (functionDef.getVname() != null) {
            return functionDef.getVname();
        } else {
            return functionDef.getParent() instanceof JSPropertyValue ? ((JSPropertyDef)functionDef.getParent().getParent())
                    .getClassDef().getNameIdentifier() : null;
        }
    }

    public static PsiElement getNameIdentifier(JSTypeDef typeDef) {
        return typeDef;
    }

    public static int getLength(JSFunArgs funArgs) {
        if (funArgs.getChildren().length > 0) {
            JSFunArg[] args = PsiTreeUtil.getChildrenOfType(funArgs, JSFunArg.class);
            return args != null ? args.length : 0;
        }
        return 0;
    }

    public static int getLength(JSFunParams funParams) {
        if (funParams.getChildren().length > 0) {
            JSFunParam[] params = PsiTreeUtil.getChildrenOfType(funParams, JSFunParam.class);
            return params != null ? params.length : 0;
        }
        return 0;
    }

    public static int getArgsLength(JSFunctionDef functionDef) {
        return functionDef.getFunArgs().getLength();
    }


    public static boolean isFunction(JSPropertyDef propertyDef) {
        return propertyDef.getPropertyValue() != null && propertyDef.getPropertyValue().getFunctionDef() != null;
    }

    // Get methods block

    public static JSMethod[] getMethodsInner(JSClassDef property) {
        return JSClassPsiUtils.getMethodsInner(property);
    }

    public static JSMethod[] getMethodsInner(JSTypeDef typeDef) {
        return new JSMethod[0];
    }

    public static JSClass getType(JSExpr expr) {
        return JSTypeUtils.getType(expr);
    }

    //Get Presentation block

    public static ItemPresentation getPresentation(JSPropertyDef propertyDef) {
        return JSPropertyPsiUtils.getPresentation(propertyDef);
    }

    public static ItemPresentation getPresentation(JSProperty property) {
        return JSPropertyPsiUtils.getPresentation(property);
    }

    public static ItemPresentation getPresentation(JSFunctionDef functionDef) {
        return new ItemPresentation() {
            @Nullable
            @Override
            public String getPresentableText() {
                return functionDef.getName() + "(" + JSFunctionPsiUtils.getFunArgsPresentableText(functionDef) + ")";
            }

            @Nullable
            @Override
            public String getLocationString() {
                return "";
            }

            @Nullable
            @Override
            public Icon getIcon(boolean b) {
                return AllIcons.Nodes.Method;
            }
        };
    }

}
