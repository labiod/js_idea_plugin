package com.kgb.js.psi.utils;

import com.kgb.js.psi.*;

/**
 * @author Krzysztof Betlej <labiod@wp.pl>
 *         Date: 4/24/17.
 */
public class JSTypeUtils {
    public static String getTypeName(JSPropertySpace property) {
        return "Object";
    }

    public static JSClass getType(JSExpr expr) {
        JSPrimaryInner primaryInner = expr.getPrimaryInner();
        if (primaryInner.getTypeDef() != null) {
            return primaryInner.getTypeDef();
        } else if (primaryInner.getFirstChild() != null && primaryInner.getFirstChild() instanceof JSClass) {
            return (JSClass) primaryInner.getFirstChild();
        } else {
            return null;
        }
    }
}