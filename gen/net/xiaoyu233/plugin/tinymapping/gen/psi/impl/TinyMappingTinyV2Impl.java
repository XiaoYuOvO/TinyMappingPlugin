// This is a generated file. Not intended for manual editing.
package net.xiaoyu233.plugin.tinymapping.gen.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static net.xiaoyu233.plugin.tinymapping.gen.psi.TinyMappingTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import net.xiaoyu233.plugin.tinymapping.gen.psi.*;

public class TinyMappingTinyV2Impl extends ASTWrapperPsiElement implements TinyMappingTinyV2 {

  public TinyMappingTinyV2Impl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull TinyMappingVisitor visitor) {
    visitor.visitTinyV2(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof TinyMappingVisitor) accept((TinyMappingVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<TinyMappingClsv2> getClsv2List() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, TinyMappingClsv2.class);
  }

  @Override
  @NotNull
  public List<TinyMappingCommentv2> getCommentv2List() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, TinyMappingCommentv2.class);
  }

  @Override
  @NotNull
  public TinyMappingHeaderV2 getHeaderV2() {
    return findNotNullChildByClass(TinyMappingHeaderV2.class);
  }

}
