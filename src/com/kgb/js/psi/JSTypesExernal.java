package com.kgb.js.psi;

import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.tree.IElementType;
import com.kgb.js.psi.impl.JSPropertSpaceImpl;

/**
 * @author Krzysztof Betlej <labiod@wp.pl>
 *         Date: 5/2/17.
 */
public interface JSTypesExernal {
    IElementType PROPERTY_OBJECT_EXTERNAL = new JSElementType("PROPERTY_OBJECT_EXTERNAL");
    IElementType PROPERTY_SPACE = new JSElementType("PROPERTY_SPACE");

    class Factory {
        public static PsiElement createElement(ASTNode node) {
            IElementType type = node.getElementType();
            if (type == PROPERTY_SPACE) {
                return new JSPropertSpaceImpl(node);
            }
            else {
                return new JSTypes.Factory().createElement(node);
            }
        }
    }
}
