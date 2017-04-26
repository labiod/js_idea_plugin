package com.kgb.js.psi.utils;

import com.intellij.psi.util.PsiTreeUtil;
import com.kgb.js.psi.JSFunArg;
import com.kgb.js.psi.JSFunArgs;
import com.kgb.js.psi.JSMethod;
import com.kgb.js.psi.JSProperty;

/**
 * @author Krzysztof Betlej <labiod@wp.pl>
 *         Date: 4/24/17.
 */
public class JSFunctionPsiUtils {
    public static String getFunArgsPresentableText(JSMethod functionDef) {
        JSFunArgs funArgs = functionDef.getFunArgs();
        JSFunArg[] funArgsList = PsiTreeUtil.getChildrenOfType(funArgs, JSFunArg.class);
        if (funArgsList != null) {
            StringBuilder builder = new StringBuilder();
            boolean first = true;
            for (JSFunArg funArg : funArgsList) {
                if (!first) {
                    builder.append(", ");
                }
                builder.append(funArg.getVname().getText());
                first = false;
            }
            return builder.toString();
        }
        return "";
    }
}
