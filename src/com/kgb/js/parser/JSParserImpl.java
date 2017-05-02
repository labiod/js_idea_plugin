package com.kgb.js.parser;
/**
 *
 */

import com.intellij.lang.ASTNode;
import com.intellij.lang.PsiBuilder;
import com.intellij.psi.tree.IElementType;

/**
 * @author labiod : <labiod@wp.pl>;
 * @version 0.0.1; created:02.02.2017
 *          Class com.kgb.js.parser.JSParserImpl
 */
public class JSParserImpl extends JSParser {
    @Override
    public ASTNode parse(IElementType t, PsiBuilder b) {
        b.setDebugMode(true);
        return super.parse(t, b);
    }
}
