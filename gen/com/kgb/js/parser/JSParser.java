// This is a generated file. Not intended for manual editing.
package com.kgb.js.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static com.kgb.js.psi.JSTypes.*;
import static com.kgb.js.parser.JSPsiParserUtil.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class JSParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, EXTENDS_SETS_);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    if (t == AND_EXPR) {
      r = and_expr(b, 0);
    }
    else if (t == ARRAY_PARAM) {
      r = array_param(b, 0);
    }
    else if (t == ARRAY_PARAMS) {
      r = array_params(b, 0);
    }
    else if (t == ARRAY_VALUE) {
      r = array_value(b, 0);
    }
    else if (t == ASSIGN_PROPERTY) {
      r = assign_property(b, 0);
    }
    else if (t == BOOLEAN_TYPE) {
      r = boolean_type(b, 0);
    }
    else if (t == CALL) {
      r = call(b, 0);
    }
    else if (t == CASE_BLOCK) {
      r = case_block(b, 0);
    }
    else if (t == CLASS_DEF) {
      r = classDef(b, 0);
    }
    else if (t == COND) {
      r = cond(b, 0);
    }
    else if (t == COND_EXPR) {
      r = cond_expr(b, 0);
    }
    else if (t == DEF_PROPERTY) {
      r = def_property(b, 0);
    }
    else if (t == DEFAULT_BLOCK) {
      r = default_block(b, 0);
    }
    else if (t == DO_WHILE_STATEMENT) {
      r = do_while_statement(b, 0);
    }
    else if (t == ELSE_IF_STATEMENT) {
      r = else_if_statement(b, 0);
    }
    else if (t == ELSE_STATEMENT) {
      r = else_statement(b, 0);
    }
    else if (t == EXPR) {
      r = expr(b, 0);
    }
    else if (t == FOR_STATEMENT) {
      r = for_statement(b, 0);
    }
    else if (t == FUN_ARG) {
      r = fun_arg(b, 0);
    }
    else if (t == FUN_ARGS) {
      r = fun_args(b, 0);
    }
    else if (t == FUN_PARAM) {
      r = fun_param(b, 0);
    }
    else if (t == FUN_PARAMS) {
      r = fun_params(b, 0);
    }
    else if (t == FUNCTION_CALL) {
      r = function_call(b, 0);
    }
    else if (t == FUNCTION_DEF) {
      r = function_def(b, 0);
    }
    else if (t == IF_STATEMENT) {
      r = if_statement(b, 0);
    }
    else if (t == NULL_TYPE) {
      r = null_type(b, 0);
    }
    else if (t == NUMBER_TYPE) {
      r = number_type(b, 0);
    }
    else if (t == OR_EXPR) {
      r = or_expr(b, 0);
    }
    else if (t == PRIMARY_INNER) {
      r = primary_inner(b, 0);
    }
    else if (t == PROP_ARRAY_INNER) {
      r = prop_array_inner(b, 0);
    }
    else if (t == PROPERTY_ARRAY) {
      r = property_array(b, 0);
    }
    else if (t == PROPERTY_BASE) {
      r = property_base(b, 0);
    }
    else if (t == PROPERTY_OBJECT) {
      r = property_object(b, 0);
    }
    else if (t == RETURN_STATEMENT) {
      r = return_statement(b, 0);
    }
    else if (t == STRING_TYPE) {
      r = string_type(b, 0);
    }
    else if (t == SWITCH_DEF) {
      r = switch_def(b, 0);
    }
    else if (t == TERNARY_BLOCK) {
      r = ternary_block(b, 0);
    }
    else if (t == TYPE_DEF) {
      r = typeDef(b, 0);
    }
    else if (t == VALUE) {
      r = value(b, 0);
    }
    else if (t == VAR_INC_DEC) {
      r = var_inc_dec(b, 0);
    }
    else if (t == WHILE_STATEMENT) {
      r = while_statement(b, 0);
    }
    else {
      r = parse_root_(t, b, 0);
    }
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return root(b, l + 1);
  }

  public static final TokenSet[] EXTENDS_SETS_ = new TokenSet[] {
    create_token_set_(ASSIGN_PROPERTY, CLASS_DEF, DEF_PROPERTY, FUNCTION_DEF),
    create_token_set_(BOOLEAN_TYPE, NULL_TYPE, NUMBER_TYPE, STRING_TYPE,
      TYPE_DEF),
  };

  /* ********************************************************** */
  // AND primary_cond
  public static boolean and_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "and_expr")) return false;
    if (!nextTokenIs(b, AND)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _LEFT_, AND_EXPR, null);
    r = consumeToken(b, AND);
    r = r && primary_cond(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // property_object | function_call | literal_expr
  public static boolean array_param(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_param")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ARRAY_PARAM, "<array param>");
    r = property_object(b, l + 1);
    if (!r) r = function_call(b, l + 1);
    if (!r) r = literal_expr(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // <<comma_separated_list(array_param)>>?
  public static boolean array_params(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_params")) return false;
    Marker m = enter_section_(b, l, _NONE_, ARRAY_PARAMS, "<array params>");
    comma_separated_list(b, l + 1, array_params_0_0_parser_);
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  // (array_param)
  private static boolean array_params_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_params_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = array_param(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // LP3 array_params RP3
  public static boolean array_value(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_value")) return false;
    if (!nextTokenIs(b, LP3)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LP3);
    r = r && array_params(b, l + 1);
    r = r && consumeToken(b, RP3);
    exit_section_(b, m, ARRAY_VALUE, r);
    return r;
  }

  /* ********************************************************** */
  // property_object EQ value
  public static boolean assign_property(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "assign_property")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ASSIGN_PROPERTY, "<assign property>");
    r = property_object(b, l + 1);
    r = r && consumeToken(b, EQ);
    r = r && value(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // root_item*
  static boolean body(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "body")) return false;
    int c = current_position_(b);
    while (true) {
      if (!root_item(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "body", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // TRUE | FALSE
  public static boolean boolean_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "boolean_type")) return false;
    if (!nextTokenIs(b, "<boolean type>", FALSE, TRUE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BOOLEAN_TYPE, "<boolean type>");
    r = consumeToken(b, TRUE);
    if (!r) r = consumeToken(b, FALSE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // break ';'
  static boolean break_def(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "break_def")) return false;
    if (!nextTokenIs(b, BREAK)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, BREAK, SEMI);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // property_object SEMI
  public static boolean call(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "call")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CALL, "<call>");
    r = property_object(b, l + 1);
    r = r && consumeToken(b, SEMI);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // case (literal_expr | vname) ':' body break_def?
  public static boolean case_block(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "case_block")) return false;
    if (!nextTokenIs(b, CASE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CASE);
    r = r && case_block_1(b, l + 1);
    r = r && consumeToken(b, COLON);
    r = r && body(b, l + 1);
    r = r && case_block_4(b, l + 1);
    exit_section_(b, m, CASE_BLOCK, r);
    return r;
  }

  // literal_expr | vname
  private static boolean case_block_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "case_block_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = literal_expr(b, l + 1);
    if (!r) r = consumeToken(b, VNAME);
    exit_section_(b, m, null, r);
    return r;
  }

  // break_def?
  private static boolean case_block_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "case_block_4")) return false;
    break_def(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  public static boolean classDef(PsiBuilder b, int l) {
    Marker m = enter_section_(b);
    exit_section_(b, m, CLASS_DEF, true);
    return true;
  }

  /* ********************************************************** */
  // <<param>> (',' <<param>>) *
  static boolean comma_separated_list(PsiBuilder b, int l, Parser _param) {
    if (!recursion_guard_(b, l, "comma_separated_list")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = _param.parse(b, l);
    r = r && comma_separated_list_1(b, l + 1, _param);
    exit_section_(b, m, null, r);
    return r;
  }

  // (',' <<param>>) *
  private static boolean comma_separated_list_1(PsiBuilder b, int l, Parser _param) {
    if (!recursion_guard_(b, l, "comma_separated_list_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!comma_separated_list_1_0(b, l + 1, _param)) break;
      if (!empty_element_parsed_guard_(b, "comma_separated_list_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ',' <<param>>
  private static boolean comma_separated_list_1_0(PsiBuilder b, int l, Parser _param) {
    if (!recursion_guard_(b, l, "comma_separated_list_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && _param.parse(b, l);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // factor_cond or_expr *
  public static boolean cond(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cond")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _COLLAPSE_, COND, "<cond>");
    r = factor_cond(b, l + 1);
    r = r && cond_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // or_expr *
  private static boolean cond_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cond_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!or_expr(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "cond_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // expr ((eq_st | lw_st | gr_st) expr)?
  public static boolean cond_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cond_expr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, COND_EXPR, "<cond expr>");
    r = expr(b, l + 1);
    r = r && cond_expr_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ((eq_st | lw_st | gr_st) expr)?
  private static boolean cond_expr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cond_expr_1")) return false;
    cond_expr_1_0(b, l + 1);
    return true;
  }

  // (eq_st | lw_st | gr_st) expr
  private static boolean cond_expr_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cond_expr_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = cond_expr_1_0_0(b, l + 1);
    r = r && expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // eq_st | lw_st | gr_st
  private static boolean cond_expr_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cond_expr_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = eq_st(b, l + 1);
    if (!r) r = lw_st(b, l + 1);
    if (!r) r = gr_st(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // var property_object (EQ value)?
  public static boolean def_property(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "def_property")) return false;
    if (!nextTokenIs(b, VAR)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, VAR);
    r = r && property_object(b, l + 1);
    r = r && def_property_2(b, l + 1);
    exit_section_(b, m, DEF_PROPERTY, r);
    return r;
  }

  // (EQ value)?
  private static boolean def_property_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "def_property_2")) return false;
    def_property_2_0(b, l + 1);
    return true;
  }

  // EQ value
  private static boolean def_property_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "def_property_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, EQ);
    r = r && value(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // default ':' body
  public static boolean default_block(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "default_block")) return false;
    if (!nextTokenIs(b, DEFAULT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, DEFAULT, COLON);
    r = r && body(b, l + 1);
    exit_section_(b, m, DEFAULT_BLOCK, r);
    return r;
  }

  /* ********************************************************** */
  // (def_property SEMI) | (assign_property SEMI) | function_def
  static boolean definition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "definition")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = definition_0(b, l + 1);
    if (!r) r = definition_1(b, l + 1);
    if (!r) r = function_def(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // def_property SEMI
  private static boolean definition_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "definition_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = def_property(b, l + 1);
    r = r && consumeToken(b, SEMI);
    exit_section_(b, m, null, r);
    return r;
  }

  // assign_property SEMI
  private static boolean definition_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "definition_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = assign_property(b, l + 1);
    r = r && consumeToken(b, SEMI);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // do LP body RP while LP2 (ternary_block | cond) RP2
  public static boolean do_while_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "do_while_statement")) return false;
    if (!nextTokenIs(b, DO)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, DO, LP);
    r = r && body(b, l + 1);
    r = r && consumeTokens(b, 0, RP, WHILE, LP2);
    r = r && do_while_statement_6(b, l + 1);
    r = r && consumeToken(b, RP2);
    exit_section_(b, m, DO_WHILE_STATEMENT, r);
    return r;
  }

  // ternary_block | cond
  private static boolean do_while_statement_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "do_while_statement_6")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ternary_block(b, l + 1);
    if (!r) r = cond(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // <<param>> ('.' <<param>>) *
  public static boolean dot_separated_list(PsiBuilder b, int l, Parser _param) {
    if (!recursion_guard_(b, l, "dot_separated_list")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = _param.parse(b, l);
    r = r && dot_separated_list_1(b, l + 1, _param);
    exit_section_(b, m, DOT_SEPARATED_LIST, r);
    return r;
  }

  // ('.' <<param>>) *
  private static boolean dot_separated_list_1(PsiBuilder b, int l, Parser _param) {
    if (!recursion_guard_(b, l, "dot_separated_list_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!dot_separated_list_1_0(b, l + 1, _param)) break;
      if (!empty_element_parsed_guard_(b, "dot_separated_list_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // '.' <<param>>
  private static boolean dot_separated_list_1_0(PsiBuilder b, int l, Parser _param) {
    if (!recursion_guard_(b, l, "dot_separated_list_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DOT);
    r = r && _param.parse(b, l);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (else if LP2 (ternary_block | cond) RP2 LP body RP) | else_statement
  public static boolean else_if_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "else_if_statement")) return false;
    if (!nextTokenIs(b, ELSE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = else_if_statement_0(b, l + 1);
    if (!r) r = else_statement(b, l + 1);
    exit_section_(b, m, ELSE_IF_STATEMENT, r);
    return r;
  }

  // else if LP2 (ternary_block | cond) RP2 LP body RP
  private static boolean else_if_statement_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "else_if_statement_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, ELSE, IF, LP2);
    r = r && else_if_statement_0_3(b, l + 1);
    r = r && consumeTokens(b, 0, RP2, LP);
    r = r && body(b, l + 1);
    r = r && consumeToken(b, RP);
    exit_section_(b, m, null, r);
    return r;
  }

  // ternary_block | cond
  private static boolean else_if_statement_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "else_if_statement_0_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ternary_block(b, l + 1);
    if (!r) r = cond(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // else LP body RP
  public static boolean else_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "else_statement")) return false;
    if (!nextTokenIs(b, ELSE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, ELSE, LP);
    r = r && body(b, l + 1);
    r = r && consumeToken(b, RP);
    exit_section_(b, m, ELSE_STATEMENT, r);
    return r;
  }

  /* ********************************************************** */
  // EQ | EQ2 | EQ3 | DEQ | DEQ2
  static boolean eq_st(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "eq_st")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, EQ);
    if (!r) r = consumeToken(b, EQ2);
    if (!r) r = consumeToken(b, EQ3);
    if (!r) r = consumeToken(b, DEQ);
    if (!r) r = consumeToken(b, DEQ2);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // factor plus_expr *
  public static boolean expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPR, "<expr>");
    r = factor(b, l + 1);
    r = r && expr_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // plus_expr *
  private static boolean expr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!plus_expr(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "expr_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // primary mul_expr *
  static boolean factor(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "factor")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = primary(b, l + 1);
    r = r && factor_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // mul_expr *
  private static boolean factor_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "factor_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!mul_expr(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "factor_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // primary_cond and_expr *
  static boolean factor_cond(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "factor_cond")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = primary_cond(b, l + 1);
    r = r && factor_cond_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // and_expr *
  private static boolean factor_cond_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "factor_cond_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!and_expr(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "factor_cond_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // op_5
  static boolean factorial_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "factorial_expr")) return false;
    if (!nextTokenIs(b, OP_5)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _LEFT_INNER_);
    r = consumeToken(b, OP_5);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // <<comma_separated_list(var_inc_dec)>>
  static boolean for_final_expr(PsiBuilder b, int l) {
    return comma_separated_list(b, l + 1, for_final_expr_0_0_parser_);
  }

  // (var_inc_dec)
  private static boolean for_final_expr_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "for_final_expr_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = var_inc_dec(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // <<comma_separated_list(def_property)>>
  static boolean for_init(PsiBuilder b, int l) {
    return comma_separated_list(b, l + 1, for_init_0_0_parser_);
  }

  // (def_property)
  private static boolean for_init_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "for_init_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = def_property(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // for LP2 for_init SEMI cond SEMI for_final_expr RP2 LP body RP
  public static boolean for_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "for_statement")) return false;
    if (!nextTokenIs(b, FOR)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, FOR, LP2);
    r = r && for_init(b, l + 1);
    r = r && consumeToken(b, SEMI);
    r = r && cond(b, l + 1);
    r = r && consumeToken(b, SEMI);
    r = r && for_final_expr(b, l + 1);
    r = r && consumeTokens(b, 0, RP2, LP);
    r = r && body(b, l + 1);
    r = r && consumeToken(b, RP);
    exit_section_(b, m, FOR_STATEMENT, r);
    return r;
  }

  /* ********************************************************** */
  // vname
  public static boolean fun_arg(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "fun_arg")) return false;
    if (!nextTokenIs(b, VNAME)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, VNAME);
    exit_section_(b, m, FUN_ARG, r);
    return r;
  }

  /* ********************************************************** */
  // LP2 <<comma_separated_list(fun_arg)>>? RP2
  public static boolean fun_args(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "fun_args")) return false;
    if (!nextTokenIs(b, LP2)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LP2);
    r = r && fun_args_1(b, l + 1);
    r = r && consumeToken(b, RP2);
    exit_section_(b, m, FUN_ARGS, r);
    return r;
  }

  // <<comma_separated_list(fun_arg)>>?
  private static boolean fun_args_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "fun_args_1")) return false;
    comma_separated_list(b, l + 1, fun_args_1_0_0_parser_);
    return true;
  }

  // (fun_arg)
  private static boolean fun_args_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "fun_args_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = fun_arg(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // property_object | function_call | literal_expr
  public static boolean fun_param(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "fun_param")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FUN_PARAM, "<fun param>");
    r = property_object(b, l + 1);
    if (!r) r = function_call(b, l + 1);
    if (!r) r = literal_expr(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // LP2 <<comma_separated_list(fun_param)>>? RP2
  public static boolean fun_params(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "fun_params")) return false;
    if (!nextTokenIs(b, LP2)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LP2);
    r = r && fun_params_1(b, l + 1);
    r = r && consumeToken(b, RP2);
    exit_section_(b, m, FUN_PARAMS, r);
    return r;
  }

  // <<comma_separated_list(fun_param)>>?
  private static boolean fun_params_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "fun_params_1")) return false;
    comma_separated_list(b, l + 1, fun_params_1_0_0_parser_);
    return true;
  }

  // (fun_param)
  private static boolean fun_params_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "fun_params_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = fun_param(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // vname fun_params
  public static boolean function_call(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_call")) return false;
    if (!nextTokenIs(b, VNAME)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, VNAME);
    r = r && fun_params(b, l + 1);
    exit_section_(b, m, FUNCTION_CALL, r);
    return r;
  }

  /* ********************************************************** */
  // function vname? fun_args LP body RP
  public static boolean function_def(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_def")) return false;
    if (!nextTokenIs(b, FUNCTION)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, FUNCTION);
    r = r && function_def_1(b, l + 1);
    r = r && fun_args(b, l + 1);
    r = r && consumeToken(b, LP);
    r = r && body(b, l + 1);
    r = r && consumeToken(b, RP);
    exit_section_(b, m, FUNCTION_DEF, r);
    return r;
  }

  // vname?
  private static boolean function_def_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_def_1")) return false;
    consumeToken(b, VNAME);
    return true;
  }

  /* ********************************************************** */
  // op_6 | op_7
  static boolean gr_st(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "gr_st")) return false;
    if (!nextTokenIs(b, "", OP_6, OP_7)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_6);
    if (!r) r = consumeToken(b, OP_7);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // if LP2 (ternary_block | cond) RP2 LP body RP else_if_statement*
  public static boolean if_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_statement")) return false;
    if (!nextTokenIs(b, IF)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, IF, LP2);
    r = r && if_statement_2(b, l + 1);
    r = r && consumeTokens(b, 0, RP2, LP);
    r = r && body(b, l + 1);
    r = r && consumeToken(b, RP);
    r = r && if_statement_7(b, l + 1);
    exit_section_(b, m, IF_STATEMENT, r);
    return r;
  }

  // ternary_block | cond
  private static boolean if_statement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_statement_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ternary_block(b, l + 1);
    if (!r) r = cond(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // else_if_statement*
  private static boolean if_statement_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_statement_7")) return false;
    int c = current_position_(b);
    while (true) {
      if (!else_if_statement(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "if_statement_7", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // if_statement | for_statement | switch_def | return_statement | while_statement | do_while_statement
  static boolean js_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "js_statement")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = if_statement(b, l + 1);
    if (!r) r = for_statement(b, l + 1);
    if (!r) r = switch_def(b, l + 1);
    if (!r) r = return_statement(b, l + 1);
    if (!r) r = while_statement(b, l + 1);
    if (!r) r = do_while_statement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // string_type | number_type | null_type | boolean_type
  static boolean literal_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "literal_expr")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = string_type(b, l + 1);
    if (!r) r = number_type(b, l + 1);
    if (!r) r = null_type(b, l + 1);
    if (!r) r = boolean_type(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // op_8 | op_9
  static boolean lw_st(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lw_st")) return false;
    if (!nextTokenIs(b, "", OP_8, OP_9)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_8);
    if (!r) r = consumeToken(b, OP_9);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // mul_op primary
  static boolean mul_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "mul_expr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _LEFT_INNER_);
    r = mul_op(b, l + 1);
    r = r && primary(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // op_3 | op_4 | op_10
  static boolean mul_op(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "mul_op")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_3);
    if (!r) r = consumeToken(b, OP_4);
    if (!r) r = consumeToken(b, OP_10);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // NULL
  public static boolean null_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "null_type")) return false;
    if (!nextTokenIs(b, NULL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NULL);
    exit_section_(b, m, NULL_TYPE, r);
    return r;
  }

  /* ********************************************************** */
  // number
  public static boolean number_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "number_type")) return false;
    if (!nextTokenIs(b, NUMBER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NUMBER);
    exit_section_(b, m, NUMBER_TYPE, r);
    return r;
  }

  /* ********************************************************** */
  // OR factor_cond
  public static boolean or_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "or_expr")) return false;
    if (!nextTokenIs(b, OR)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _LEFT_, OR_EXPR, null);
    r = consumeToken(b, OR);
    r = r && factor_cond(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '(' (cond | expr) ')'
  static boolean parent(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parent")) return false;
    if (!nextTokenIs(b, LP2)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, LP2);
    p = r; // pin = 1
    r = r && report_error_(b, parent_1(b, l + 1));
    r = p && consumeToken(b, RP2) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // cond | expr
  private static boolean parent_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parent_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = cond(b, l + 1);
    if (!r) r = expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // plus_op factor
  static boolean plus_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "plus_expr")) return false;
    if (!nextTokenIs(b, "", OP_1, OP_2)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _LEFT_INNER_);
    r = plus_op(b, l + 1);
    r = r && factor(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // op_1 | op_2
  static boolean plus_op(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "plus_op")) return false;
    if (!nextTokenIs(b, "", OP_1, OP_2)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_1);
    if (!r) r = consumeToken(b, OP_2);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // primary_inner factorial_expr ?
  static boolean primary(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primary")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = primary_inner(b, l + 1);
    r = r && primary_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // factorial_expr ?
  private static boolean primary_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primary_1")) return false;
    factorial_expr(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // factorial_expr ? primary_inner_cond
  static boolean primary_cond(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primary_cond")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = primary_cond_0(b, l + 1);
    r = r && primary_inner_cond(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // factorial_expr ?
  private static boolean primary_cond_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primary_cond_0")) return false;
    factorial_expr(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // property_object | array_value | literal_expr | parent
  public static boolean primary_inner(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primary_inner")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PRIMARY_INNER, "<primary inner>");
    r = property_object(b, l + 1);
    if (!r) r = array_value(b, l + 1);
    if (!r) r = literal_expr(b, l + 1);
    if (!r) r = parent(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // cond_expr | parent
  static boolean primary_inner_cond(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primary_inner_cond")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = cond_expr(b, l + 1);
    if (!r) r = parent(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // LP3 (vname | literal_expr) RP3
  public static boolean prop_array_inner(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "prop_array_inner")) return false;
    if (!nextTokenIs(b, LP3)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LP3);
    r = r && prop_array_inner_1(b, l + 1);
    r = r && consumeToken(b, RP3);
    exit_section_(b, m, PROP_ARRAY_INNER, r);
    return r;
  }

  // vname | literal_expr
  private static boolean prop_array_inner_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "prop_array_inner_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, VNAME);
    if (!r) r = literal_expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // vname prop_array_inner
  public static boolean property_array(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "property_array")) return false;
    if (!nextTokenIs(b, VNAME)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, VNAME);
    r = r && prop_array_inner(b, l + 1);
    exit_section_(b, m, PROPERTY_ARRAY, r);
    return r;
  }

  /* ********************************************************** */
  // function_call | property_array | vname
  public static boolean property_base(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "property_base")) return false;
    if (!nextTokenIs(b, VNAME)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = function_call(b, l + 1);
    if (!r) r = property_array(b, l + 1);
    if (!r) r = consumeToken(b, VNAME);
    exit_section_(b, m, PROPERTY_BASE, r);
    return r;
  }

  /* ********************************************************** */
  // property_object_external
  public static boolean property_object(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "property_object")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PROPERTY_OBJECT, "<property object>");
    r = property_object_external_call(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // return (expr | ternary_block | cond) SEMI
  public static boolean return_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "return_statement")) return false;
    if (!nextTokenIs(b, RETURN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, RETURN);
    r = r && return_statement_1(b, l + 1);
    r = r && consumeToken(b, SEMI);
    exit_section_(b, m, RETURN_STATEMENT, r);
    return r;
  }

  // expr | ternary_block | cond
  private static boolean return_statement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "return_statement_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expr(b, l + 1);
    if (!r) r = ternary_block(b, l + 1);
    if (!r) r = cond(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // !<<eof>> body
  static boolean root(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "root")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = root_0(b, l + 1);
    r = r && body(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // !<<eof>>
  private static boolean root_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "root_0")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !eof(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // js_statement | definition | call
  static boolean root_item(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "root_item")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = js_statement(b, l + 1);
    if (!r) r = definition(b, l + 1);
    if (!r) r = call(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // string
  public static boolean string_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "string_type")) return false;
    if (!nextTokenIs(b, STRING)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, STRING);
    exit_section_(b, m, STRING_TYPE, r);
    return r;
  }

  /* ********************************************************** */
  // case_block* default_block?
  static boolean switch_body(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "switch_body")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = switch_body_0(b, l + 1);
    r = r && switch_body_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // case_block*
  private static boolean switch_body_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "switch_body_0")) return false;
    int c = current_position_(b);
    while (true) {
      if (!case_block(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "switch_body_0", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // default_block?
  private static boolean switch_body_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "switch_body_1")) return false;
    default_block(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // switch LP2 property_object RP2 LP switch_body RP
  public static boolean switch_def(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "switch_def")) return false;
    if (!nextTokenIs(b, SWITCH)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, SWITCH, LP2);
    r = r && property_object(b, l + 1);
    r = r && consumeTokens(b, 0, RP2, LP);
    r = r && switch_body(b, l + 1);
    r = r && consumeToken(b, RP);
    exit_section_(b, m, SWITCH_DEF, r);
    return r;
  }

  /* ********************************************************** */
  // cond '?' (ternary_block | property_object | literal_expr) ':' (ternary_block | property_object | literal_expr)
  public static boolean ternary_block(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ternary_block")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TERNARY_BLOCK, "<ternary block>");
    r = cond(b, l + 1);
    r = r && consumeToken(b, T_IF);
    r = r && ternary_block_2(b, l + 1);
    r = r && consumeToken(b, COLON);
    r = r && ternary_block_4(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ternary_block | property_object | literal_expr
  private static boolean ternary_block_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ternary_block_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ternary_block(b, l + 1);
    if (!r) r = property_object(b, l + 1);
    if (!r) r = literal_expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ternary_block | property_object | literal_expr
  private static boolean ternary_block_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ternary_block_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ternary_block(b, l + 1);
    if (!r) r = property_object(b, l + 1);
    if (!r) r = literal_expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  public static boolean typeDef(PsiBuilder b, int l) {
    Marker m = enter_section_(b);
    exit_section_(b, m, TYPE_DEF, true);
    return true;
  }

  /* ********************************************************** */
  // ternary_block | cond | expr | function_def
  public static boolean value(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "value")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, VALUE, "<value>");
    r = ternary_block(b, l + 1);
    if (!r) r = cond(b, l + 1);
    if (!r) r = expr(b, l + 1);
    if (!r) r = function_def(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // (vname (INCREMENT | DECREMENT)) | ((INCREMENT | DECREMENT) vname)
  public static boolean var_inc_dec(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "var_inc_dec")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, VAR_INC_DEC, "<var inc dec>");
    r = var_inc_dec_0(b, l + 1);
    if (!r) r = var_inc_dec_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // vname (INCREMENT | DECREMENT)
  private static boolean var_inc_dec_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "var_inc_dec_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, VNAME);
    r = r && var_inc_dec_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // INCREMENT | DECREMENT
  private static boolean var_inc_dec_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "var_inc_dec_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, INCREMENT);
    if (!r) r = consumeToken(b, DECREMENT);
    exit_section_(b, m, null, r);
    return r;
  }

  // (INCREMENT | DECREMENT) vname
  private static boolean var_inc_dec_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "var_inc_dec_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = var_inc_dec_1_0(b, l + 1);
    r = r && consumeToken(b, VNAME);
    exit_section_(b, m, null, r);
    return r;
  }

  // INCREMENT | DECREMENT
  private static boolean var_inc_dec_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "var_inc_dec_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, INCREMENT);
    if (!r) r = consumeToken(b, DECREMENT);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // while LP2 (ternary_block | cond) RP2 LP body RP
  public static boolean while_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "while_statement")) return false;
    if (!nextTokenIs(b, WHILE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, WHILE, LP2);
    r = r && while_statement_2(b, l + 1);
    r = r && consumeTokens(b, 0, RP2, LP);
    r = r && body(b, l + 1);
    r = r && consumeToken(b, RP);
    exit_section_(b, m, WHILE_STATEMENT, r);
    return r;
  }

  // ternary_block | cond
  private static boolean while_statement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "while_statement_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ternary_block(b, l + 1);
    if (!r) r = cond(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  final static Parser array_params_0_0_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return array_params_0_0(b, l + 1);
    }
  };
  final static Parser for_final_expr_0_0_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return for_final_expr_0_0(b, l + 1);
    }
  };
  final static Parser for_init_0_0_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return for_init_0_0(b, l + 1);
    }
  };
  final static Parser fun_args_1_0_0_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return fun_args_1_0_0(b, l + 1);
    }
  };
  final static Parser fun_params_1_0_0_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return fun_params_1_0_0(b, l + 1);
    }
  };
}
