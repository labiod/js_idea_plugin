package com.kgb.js.psi.impl;

import com.kgb.js.psi.JSVarDeclaration;
import com.kgb.js.psi.JSVarName;
import com.kgb.js.psi.JSVarValue;

/**
 * @author Krzysztof Betlej <labiod@wp.pl>
 *         Date: 1/30/17.
 */
public class JSPsiImplUtil {
    public static String getVar(JSVarDeclaration element) {
        JSVarName var = element.getVarName();
        if (var.getVarProperty() != null) {
            return var.getVarProperty().getText().replace("\\\\ ", " ");
        } else if (var.getThisType() != null){
            return var.getThisType().getText().replace("\\\\ ", " ");
        }
        return null;
    }

    public static String getValue(JSVarDeclaration element) {
        JSVarValue value = element.getVarValue();
        return value.getText();
    }
}
