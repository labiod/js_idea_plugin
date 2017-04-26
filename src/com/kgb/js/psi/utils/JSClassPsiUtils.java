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

    public static JSMethod[] getMethodsInner(JSBaseProperty property) {
        return new JSMethod[0];
    }

    public static JSMethod[] getMethodsInner(JSProperty property) {
        return new JSMethod[0];
    }

    public static JSMethod[] getMethodsInner(JSPropertyDef propertyDef) {
        return JSPropertyPsiUtils.getMethods(propertyDef);
    }

    public static JSMethod[] getMethodsInner(JSClassDef classDef) {
        if (classDef instanceof JSMethod) {
            return getMethodsInner((JSMethod)classDef);
        } else if (classDef instanceof JSBaseProperty) {
            return getMethodsInner((JSBaseProperty)classDef);
        } else if (classDef instanceof JSProperty) {
            return getMethodsInner((JSProperty)classDef);
        } else if (classDef instanceof JSPropertyDef) {
            return getMethodsInner((JSPropertyDef)classDef);
        }
        return new JSMethod[0];
    }
}
