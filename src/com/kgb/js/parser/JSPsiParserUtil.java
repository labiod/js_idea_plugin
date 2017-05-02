package com.kgb.js.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.parser.GeneratedParserUtilBase;
import com.intellij.openapi.diagnostic.Logger;

import static com.kgb.js.psi.JSTypes.DOT;
import static com.kgb.js.psi.JSTypesExernal.PROPERTY_SPACE;

/**
 * @author Krzysztof Betlej <labiod@wp.pl>
 *         Date: 4/28/17.
 */
public class JSPsiParserUtil extends GeneratedParserUtilBase {
    private final static int MAX_OBJECT_REC = 10;

//    public static boolean property_object_external_call(PsiBuilder b, int l) {
//        Logger LOG = Logger.getInstance(JSPsiParserUtil.class);
//        LOG.info(b.getTokenText());
//        LOG.info(b.getTreeBuilt().getText());
//        return property_object_external_call(b, l, 0);
//    }
//
//    public static boolean property_object_external_call(PsiBuilder b, int l, int rec) {
//        if (!recursion_guard_(b, l, "property_object_external_call")) return false;
//        if (rec > MAX_OBJECT_REC) return false;
//        PsiBuilder.Marker m = enter_section_(b);
//        boolean r = property_object_external_call(b, l + 1, rec + 1);
//        if (!r) {
//            if (!r) {
//                r = JSParser.property_base(b, l + 1);
//                r = r && consumeToken(b, DOT);
//            } else {
//                r = JSParser.property_base(b, l + 1);
//                r = !nextTokenIs(b, DOT) || consumeToken(b, DOT);
//            }
//        }
//
//        exit_section_(b, m, PROPERTY_SPACE, r);
//        return r;
//    }

    public static boolean property_object_external_call(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "property_object_external_call")) return false;
        PsiBuilder.Marker m = enter_section_(b);
        boolean r;
        r = JSParser.property_base(b, l + 1);
        if (nextTokenIs(b, DOT)) {
            r = r && consumeToken(b, DOT);
            r = r && property_object_external_call(b, l + 1);
        }

        exit_section_(b, m, PROPERTY_SPACE, r);
        return r;
    }
}
