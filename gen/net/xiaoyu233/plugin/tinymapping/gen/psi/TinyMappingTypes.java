// This is a generated file. Not intended for manual editing.
package net.xiaoyu233.plugin.tinymapping.gen.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import net.xiaoyu233.plugin.tinymapping.gen.psi.impl.*;

public interface TinyMappingTypes {

  IElementType CLSV_1 = new TinyMappingElementType("CLSV_1");
  IElementType CLSV_2 = new TinyMappingElementType("CLSV_2");
  IElementType COMMENTV_2 = new TinyMappingElementType("COMMENTV_2");
  IElementType FIELDV_1 = new TinyMappingElementType("FIELDV_1");
  IElementType FIELDV_2 = new TinyMappingElementType("FIELDV_2");
  IElementType HEADER_V_1 = new TinyMappingElementType("HEADER_V_1");
  IElementType HEADER_V_2 = new TinyMappingElementType("HEADER_V_2");
  IElementType METHODV_1 = new TinyMappingElementType("METHODV_1");
  IElementType METHODV_2 = new TinyMappingElementType("METHODV_2");
  IElementType PARAMETERV_2 = new TinyMappingElementType("PARAMETERV_2");
  IElementType TINY_V_1 = new TinyMappingElementType("TINY_V_1");
  IElementType TINY_V_2 = new TinyMappingElementType("TINY_V_2");

  IElementType CLASS_NAME = new TinyMappingTokenType("CLASS_NAME");
  IElementType CLASS_V1 = new TinyMappingTokenType("CLASS_V1");
  IElementType CLASS_V2 = new TinyMappingTokenType("CLASS_V2");
  IElementType COMMENT = new TinyMappingTokenType("COMMENT");
  IElementType FIELD_NAME = new TinyMappingTokenType("FIELD_NAME");
  IElementType FIELD_V1 = new TinyMappingTokenType("FIELD_V1");
  IElementType FIELD_V2 = new TinyMappingTokenType("FIELD_V2");
  IElementType HEADER_NAMESPACE_ELEMENT = new TinyMappingTokenType("HEADER_NAMESPACE_ELEMENT");
  IElementType METHOD_NAME = new TinyMappingTokenType("METHOD_NAME");
  IElementType METHOD_SIGNATURE = new TinyMappingTokenType("METHOD_SIGNATURE");
  IElementType METHOD_V1 = new TinyMappingTokenType("METHOD_V1");
  IElementType METHOD_V2 = new TinyMappingTokenType("METHOD_V2");
  IElementType NEWLINE = new TinyMappingTokenType("NEWLINE");
  IElementType PARAMETER_INDEX = new TinyMappingTokenType("PARAMETER_INDEX");
  IElementType PARAMETER_NAME = new TinyMappingTokenType("PARAMETER_NAME");
  IElementType PARAMETER_V2 = new TinyMappingTokenType("PARAMETER_V2");
  IElementType TAB = new TinyMappingTokenType("TAB");
  IElementType TINY_V1_HEADER = new TinyMappingTokenType("TINY_V1_HEADER");
  IElementType TINY_V2_HEADER = new TinyMappingTokenType("TINY_V2_HEADER");
  IElementType TYPE_SIGNATURE = new TinyMappingTokenType("TYPE_SIGNATURE");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == CLSV_1) {
        return new TinyMappingClsv1Impl(node);
      }
      else if (type == CLSV_2) {
        return new TinyMappingClsv2Impl(node);
      }
      else if (type == COMMENTV_2) {
        return new TinyMappingCommentv2Impl(node);
      }
      else if (type == FIELDV_1) {
        return new TinyMappingFieldv1Impl(node);
      }
      else if (type == FIELDV_2) {
        return new TinyMappingFieldv2Impl(node);
      }
      else if (type == HEADER_V_1) {
        return new TinyMappingHeaderV1Impl(node);
      }
      else if (type == HEADER_V_2) {
        return new TinyMappingHeaderV2Impl(node);
      }
      else if (type == METHODV_1) {
        return new TinyMappingMethodv1Impl(node);
      }
      else if (type == METHODV_2) {
        return new TinyMappingMethodv2Impl(node);
      }
      else if (type == PARAMETERV_2) {
        return new TinyMappingParameterv2Impl(node);
      }
      else if (type == TINY_V_1) {
        return new TinyMappingTinyV1Impl(node);
      }
      else if (type == TINY_V_2) {
        return new TinyMappingTinyV2Impl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
