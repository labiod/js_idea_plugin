package com.kgb.js.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.parser.GeneratedParserUtilBase;
import com.kgb.js.psi.JSTypes;

import static com.kgb.js.psi.JSTypes.*;
import static com.kgb.js.psi.JSTypesExernal.*;

/**
 * @author Krzysztof Betlej <labiod@wp.pl>
 *         Date: 4/28/17.
 */
public class JSPsiParserUtil extends GeneratedParserUtilBase {

    public static boolean def_property_external_call(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "def_property")) return false;
        if (!nextTokenIs(b, VAR)) return false;
        boolean r;
        PsiBuilder.Marker m = enter_section_(b);
        r = consumeToken(b, VAR);
        r = r && property_object_external_call(b, l + 1);
        if (nextTokenIs(b, EQ)) {
            r = r && JSParser.prop_value(b, l + 1);
        }
        exit_section_(b, m, DEF_PROPERTY, r);
        return r;
    }

    public static boolean assign_property_external_call(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "def_property")) return false;
        if (!nextTokenIs(b, VAR)) return false;
        boolean r;
        PsiBuilder.Marker m = enter_section_(b);
        r = consumeToken(b, VAR);
        r = r && property_object_external_call(b, l + 1);
        if (nextTokenIs(b, EQ)) {
            r = r && JSParser.prop_value(b, l + 1);
        }
        exit_section_(b, m, DEF_PROPERTY, r);
        return r;
    }

    public static boolean property_object_external_call(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "property_object_external_call")) return false;
        if (b.getTokenType() != VNAME) {
            return false;
        }
        PsiBuilder.Marker m = enter_section_(b);
        boolean result = parse_innner_property(b, l + 1, 0);
        exit_section_(b, m, PROPERTY_OBJECT, result);
        return result;
    }

    private static boolean parse_innner_property(PsiBuilder b, int l, int parseIndex) {
        if (!recursion_guard_(b, l, "parse_inner_property")) return false;
        boolean result = true;
        int i = parseIndex;
        if ((i = getNextDotIndex(b, i)) != -1) {
            PsiBuilder.Marker parentMarker = enter_section_(b);
            result = parse_innner_property(b, l + 1, i + 1);
            exit_section_(b, parentMarker , PROPERTY_SPACE, result);
        }
        if (result) {
            PsiBuilder.Marker m = enter_section_(b);
            result = JSParser.property_base(b, l);
            exit_section_(b, m, PROPERTY_MAIN, result);
            if (nextTokenIs(b, DOT)) {
                result = result && consumeToken(b, DOT);
            }
        }
        return result;
    }

    private static int getNextDotIndex(PsiBuilder builder, int i) {
        while (builder.lookAhead(i) != EQ && builder.lookAhead(i) != SEMI && builder.lookAhead(i) != null) {
            if (builder.lookAhead(i) == DOT) {
                return i;
            }
            i++;
        }
        return -1;
    }
}
