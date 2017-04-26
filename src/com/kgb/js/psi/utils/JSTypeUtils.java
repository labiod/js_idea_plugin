package com.kgb.js.psi.utils;

import com.kgb.js.psi.*;

/**
 * @author Krzysztof Betlej <labiod@wp.pl>
 *         Date: 4/24/17.
 */
public class JSTypeUtils {
    public static String getTypeName(JSProperty property) {
        return "Object";
    }

    public static JSClass getType(JSExpr expr) {
        JSPrimaryInner primaryInner = expr.getPrimaryInner();
        if (primaryInner.getTypeDef() != null) {
            return primaryInner.getTypeDef();
        } else if (primaryInner.getClassDef() != null) {
            return primaryInner.getClassDef();
        } else {
            return null;
        }
    }
}
