package com.kgb.js.psi.utils;

import com.intellij.psi.util.PsiTreeUtil;
import com.kgb.js.psi.*;

/**
 * @author Krzysztof Betlej <labiod@wp.pl>
 *         Date: 4/25/17.
 */
public class JSClassPsiUtils {


    public static JSMethod[] getMethodsInner(JSMethod method) {
        return PsiTreeUtil.getChildrenOfType(method, JSMethod.class);
    }

    public static JSMethod[] getMethodsInner(JSProperty property) {
        return new JSMethod[0];
    }

    public static JSMethod[] getMethodsInner(JSPropertySpace property) {
        return new JSMethod[0];
    }

    public static JSMethod[] getMethodsInner(JSDefProperty propertyDef) {
        return JSPropertyPsiUtils.getMethods(propertyDef);
    }

    public static JSMethod[] getMethodsInner(JSClass classDef) {
        if (classDef instanceof JSMethod) {
            return getMethodsInner((JSMethod)classDef);
        } else if (classDef instanceof JSProperty) {
            return getMethodsInner((JSProperty)classDef);
        } else if (classDef instanceof JSPropertySpace) {
            return getMethodsInner((JSPropertySpace) classDef);
        } else if (classDef instanceof JSDefProperty) {
            return getMethodsInner((JSDefProperty)classDef);
        }
        return new JSMethod[0];
    }
}
