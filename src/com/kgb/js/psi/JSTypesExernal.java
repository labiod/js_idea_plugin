package com.kgb.js.psi;

import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.tree.IElementType;
import com.kgb.js.psi.impl.JSDefPropertyImpl;
import com.kgb.js.psi.impl.JSPropertySpaceImpl;
import com.kgb.js.psi.impl.JSPropertyMainImpl;
import com.kgb.js.psi.impl.JSPropertyObjectImpl;

/**
 * @author Krzysztof Betlej <labiod@wp.pl>
 *         Date: 5/2/17.
 */
public interface JSTypesExernal {
    IElementType PROPERTY_OBJECT = new JSElementType("PROPERTY_OBJECT");
    IElementType PROPERTY_SPACE = new JSElementType("PROPERTY_SPACE");
    IElementType PROPERTY_MAIN = new JSElementType("PROPERTY_MAIN");
    IElementType DEF_PROPERTY = new JSElementType("DEF_PROPERTY");

    class Factory {
        public static PsiElement createElement(ASTNode node) {
            IElementType type = node.getElementType();
            if (type == PROPERTY_SPACE) {
                return new JSPropertySpaceImpl(node);
            } else if (type == PROPERTY_OBJECT) {
                return new JSPropertyObjectImpl(node);
            } else if (type == PROPERTY_MAIN) {
                return new JSPropertyMainImpl(node);
            } else if (type == DEF_PROPERTY) {
                return new JSDefPropertyImpl(node);
            } else {
                return new JSTypes.Factory().createElement(node);
            }
        }
    }
}
