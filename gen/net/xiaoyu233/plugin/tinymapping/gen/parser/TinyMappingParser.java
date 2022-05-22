// This is a generated file. Not intended for manual editing.
package net.xiaoyu233.plugin.tinymapping.gen.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static net.xiaoyu233.plugin.tinymapping.gen.psi.TinyMappingTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class TinyMappingParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, null);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    r = parse_root_(t, b);
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b) {
    return parse_root_(t, b, 0);
  }

  static boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return tinyMapping(b, l + 1);
  }

  /* ********************************************************** */
  // CLASS_V1 TAB CLASS_NAME (TAB CLASS_NAME)+
  public static boolean clsv1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "clsv1")) return false;
    if (!nextTokenIs(b, CLASS_V1)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, CLASS_V1, TAB, CLASS_NAME);
    r = r && clsv1_3(b, l + 1);
    exit_section_(b, m, CLSV_1, r);
    return r;
  }

  // (TAB CLASS_NAME)+
  private static boolean clsv1_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "clsv1_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = clsv1_3_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!clsv1_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "clsv1_3", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // TAB CLASS_NAME
  private static boolean clsv1_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "clsv1_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TAB, CLASS_NAME);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // CLASS_V2 TAB CLASS_NAME (TAB CLASS_NAME)+ (NEWLINE (fieldv2 | methodv2) )*
  public static boolean clsv2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "clsv2")) return false;
    if (!nextTokenIs(b, CLASS_V2)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, CLASS_V2, TAB, CLASS_NAME);
    r = r && clsv2_3(b, l + 1);
    r = r && clsv2_4(b, l + 1);
    exit_section_(b, m, CLSV_2, r);
    return r;
  }

  // (TAB CLASS_NAME)+
  private static boolean clsv2_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "clsv2_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = clsv2_3_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!clsv2_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "clsv2_3", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // TAB CLASS_NAME
  private static boolean clsv2_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "clsv2_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TAB, CLASS_NAME);
    exit_section_(b, m, null, r);
    return r;
  }

  // (NEWLINE (fieldv2 | methodv2) )*
  private static boolean clsv2_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "clsv2_4")) return false;
    while (true) {
      int c = current_position_(b);
      if (!clsv2_4_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "clsv2_4", c)) break;
    }
    return true;
  }

  // NEWLINE (fieldv2 | methodv2)
  private static boolean clsv2_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "clsv2_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NEWLINE);
    r = r && clsv2_4_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // fieldv2 | methodv2
  private static boolean clsv2_4_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "clsv2_4_0_1")) return false;
    boolean r;
    r = fieldv2(b, l + 1);
    if (!r) r = methodv2(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // COMMENT
  public static boolean commentv2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "commentv2")) return false;
    if (!nextTokenIs(b, COMMENT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMENT);
    exit_section_(b, m, COMMENTV_2, r);
    return r;
  }

  /* ********************************************************** */
  // FIELD_V1 TAB CLASS_NAME TAB TYPE_SIGNATURE TAB FIELD_NAME (TAB FIELD_NAME)+
  public static boolean fieldv1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "fieldv1")) return false;
    if (!nextTokenIs(b, FIELD_V1)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, FIELD_V1, TAB, CLASS_NAME, TAB, TYPE_SIGNATURE, TAB, FIELD_NAME);
    r = r && fieldv1_7(b, l + 1);
    exit_section_(b, m, FIELDV_1, r);
    return r;
  }

  // (TAB FIELD_NAME)+
  private static boolean fieldv1_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "fieldv1_7")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = fieldv1_7_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!fieldv1_7_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "fieldv1_7", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // TAB FIELD_NAME
  private static boolean fieldv1_7_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "fieldv1_7_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TAB, FIELD_NAME);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // FIELD_V2 TAB TYPE_SIGNATURE TAB FIELD_NAME (TAB FIELD_NAME)+
  public static boolean fieldv2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "fieldv2")) return false;
    if (!nextTokenIs(b, FIELD_V2)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, FIELD_V2, TAB, TYPE_SIGNATURE, TAB, FIELD_NAME);
    r = r && fieldv2_5(b, l + 1);
    exit_section_(b, m, FIELDV_2, r);
    return r;
  }

  // (TAB FIELD_NAME)+
  private static boolean fieldv2_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "fieldv2_5")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = fieldv2_5_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!fieldv2_5_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "fieldv2_5", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // TAB FIELD_NAME
  private static boolean fieldv2_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "fieldv2_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TAB, FIELD_NAME);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // TINY_V1_HEADER(TAB HEADER_NAMESPACE_ELEMENT)+
  public static boolean headerV1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "headerV1")) return false;
    if (!nextTokenIs(b, TINY_V1_HEADER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TINY_V1_HEADER);
    r = r && headerV1_1(b, l + 1);
    exit_section_(b, m, HEADER_V_1, r);
    return r;
  }

  // (TAB HEADER_NAMESPACE_ELEMENT)+
  private static boolean headerV1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "headerV1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = headerV1_1_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!headerV1_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "headerV1_1", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // TAB HEADER_NAMESPACE_ELEMENT
  private static boolean headerV1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "headerV1_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TAB, HEADER_NAMESPACE_ELEMENT);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // TINY_V2_HEADER(TAB HEADER_NAMESPACE_ELEMENT)+
  public static boolean headerV2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "headerV2")) return false;
    if (!nextTokenIs(b, TINY_V2_HEADER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TINY_V2_HEADER);
    r = r && headerV2_1(b, l + 1);
    exit_section_(b, m, HEADER_V_2, r);
    return r;
  }

  // (TAB HEADER_NAMESPACE_ELEMENT)+
  private static boolean headerV2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "headerV2_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = headerV2_1_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!headerV2_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "headerV2_1", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // TAB HEADER_NAMESPACE_ELEMENT
  private static boolean headerV2_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "headerV2_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TAB, HEADER_NAMESPACE_ELEMENT);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // METHOD_V1 TAB CLASS_NAME TAB METHOD_SIGNATURE TAB METHOD_NAME (TAB METHOD_NAME)+
  public static boolean methodv1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "methodv1")) return false;
    if (!nextTokenIs(b, METHOD_V1)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, METHOD_V1, TAB, CLASS_NAME, TAB, METHOD_SIGNATURE, TAB, METHOD_NAME);
    r = r && methodv1_7(b, l + 1);
    exit_section_(b, m, METHODV_1, r);
    return r;
  }

  // (TAB METHOD_NAME)+
  private static boolean methodv1_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "methodv1_7")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = methodv1_7_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!methodv1_7_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "methodv1_7", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // TAB METHOD_NAME
  private static boolean methodv1_7_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "methodv1_7_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TAB, METHOD_NAME);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // METHOD_V2 TAB METHOD_SIGNATURE TAB METHOD_NAME (TAB METHOD_NAME)+ (NEWLINE parameterv2)*
  public static boolean methodv2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "methodv2")) return false;
    if (!nextTokenIs(b, METHOD_V2)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, METHOD_V2, TAB, METHOD_SIGNATURE, TAB, METHOD_NAME);
    r = r && methodv2_5(b, l + 1);
    r = r && methodv2_6(b, l + 1);
    exit_section_(b, m, METHODV_2, r);
    return r;
  }

  // (TAB METHOD_NAME)+
  private static boolean methodv2_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "methodv2_5")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = methodv2_5_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!methodv2_5_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "methodv2_5", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // TAB METHOD_NAME
  private static boolean methodv2_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "methodv2_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TAB, METHOD_NAME);
    exit_section_(b, m, null, r);
    return r;
  }

  // (NEWLINE parameterv2)*
  private static boolean methodv2_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "methodv2_6")) return false;
    while (true) {
      int c = current_position_(b);
      if (!methodv2_6_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "methodv2_6", c)) break;
    }
    return true;
  }

  // NEWLINE parameterv2
  private static boolean methodv2_6_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "methodv2_6_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NEWLINE);
    r = r && parameterv2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // PARAMETER_V2 TAB PARAMETER_INDEX TAB TAB TAB PARAMETER_NAME
  public static boolean parameterv2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameterv2")) return false;
    if (!nextTokenIs(b, PARAMETER_V2)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, PARAMETER_V2, TAB, PARAMETER_INDEX, TAB, TAB, TAB, PARAMETER_NAME);
    exit_section_(b, m, PARAMETERV_2, r);
    return r;
  }

  /* ********************************************************** */
  // tinyV1 | tinyV2
  static boolean tinyMapping(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tinyMapping")) return false;
    if (!nextTokenIs(b, "", TINY_V1_HEADER, TINY_V2_HEADER)) return false;
    boolean r;
    r = tinyV1(b, l + 1);
    if (!r) r = tinyV2(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // headerV1  ((NEWLINE (clsv1 | methodv1 | fieldv1)) | NEWLINE)*  <<eof>>
  public static boolean tinyV1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tinyV1")) return false;
    if (!nextTokenIs(b, TINY_V1_HEADER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = headerV1(b, l + 1);
    r = r && tinyV1_1(b, l + 1);
    r = r && eof(b, l + 1);
    exit_section_(b, m, TINY_V_1, r);
    return r;
  }

  // ((NEWLINE (clsv1 | methodv1 | fieldv1)) | NEWLINE)*
  private static boolean tinyV1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tinyV1_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!tinyV1_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "tinyV1_1", c)) break;
    }
    return true;
  }

  // (NEWLINE (clsv1 | methodv1 | fieldv1)) | NEWLINE
  private static boolean tinyV1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tinyV1_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = tinyV1_1_0_0(b, l + 1);
    if (!r) r = consumeToken(b, NEWLINE);
    exit_section_(b, m, null, r);
    return r;
  }

  // NEWLINE (clsv1 | methodv1 | fieldv1)
  private static boolean tinyV1_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tinyV1_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NEWLINE);
    r = r && tinyV1_1_0_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // clsv1 | methodv1 | fieldv1
  private static boolean tinyV1_1_0_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tinyV1_1_0_0_1")) return false;
    boolean r;
    r = clsv1(b, l + 1);
    if (!r) r = methodv1(b, l + 1);
    if (!r) r = fieldv1(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // headerV2 ((NEWLINE (clsv2 | commentv2)) | NEWLINE )* <<eof>>
  public static boolean tinyV2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tinyV2")) return false;
    if (!nextTokenIs(b, TINY_V2_HEADER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = headerV2(b, l + 1);
    r = r && tinyV2_1(b, l + 1);
    r = r && eof(b, l + 1);
    exit_section_(b, m, TINY_V_2, r);
    return r;
  }

  // ((NEWLINE (clsv2 | commentv2)) | NEWLINE )*
  private static boolean tinyV2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tinyV2_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!tinyV2_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "tinyV2_1", c)) break;
    }
    return true;
  }

  // (NEWLINE (clsv2 | commentv2)) | NEWLINE
  private static boolean tinyV2_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tinyV2_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = tinyV2_1_0_0(b, l + 1);
    if (!r) r = consumeToken(b, NEWLINE);
    exit_section_(b, m, null, r);
    return r;
  }

  // NEWLINE (clsv2 | commentv2)
  private static boolean tinyV2_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tinyV2_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NEWLINE);
    r = r && tinyV2_1_0_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // clsv2 | commentv2
  private static boolean tinyV2_1_0_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tinyV2_1_0_0_1")) return false;
    boolean r;
    r = clsv2(b, l + 1);
    if (!r) r = commentv2(b, l + 1);
    return r;
  }

}
