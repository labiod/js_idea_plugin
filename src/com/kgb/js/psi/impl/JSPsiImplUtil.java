package com.kgb.js.psi.impl;

import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.IElementType;
import com.kgb.js.highlighters.psi.JSTypes;
import com.kgb.js.psi.JSJsDefProperty;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by k.betlej on 12/19/16.
 */
public class JSPsiImplUtil {
    public static List<IElementType> getSubElements(IElementType type) {
        System.out.println(type.toString());
        return new ArrayList<>();
    }

    public static String getKey(JSJsDefProperty element) {
        ASTNode keyNode = element.getNode().findChildByType(JSTypes.JS_KEY);
        if (keyNode != null) {
            return keyNode.getText().replace("\\\\", " ");
        }
        return null;
    }

    public static String getValue(JSJsDefProperty element) {
        ASTNode valueNode = element.getNode().findChildByType(JSTypes.JS_VALUE);
        if (valueNode != null) {
            return valueNode.getText();
        } else {
            return null;
        }
    }
}
