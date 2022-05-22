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

public class TinyMappingTinyV1Impl extends ASTWrapperPsiElement implements TinyMappingTinyV1 {

  public TinyMappingTinyV1Impl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull TinyMappingVisitor visitor) {
    visitor.visitTinyV1(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof TinyMappingVisitor) accept((TinyMappingVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<TinyMappingClsv1> getClsv1List() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, TinyMappingClsv1.class);
  }

  @Override
  @NotNull
  public List<TinyMappingFieldv1> getFieldv1List() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, TinyMappingFieldv1.class);
  }

  @Override
  @NotNull
  public TinyMappingHeaderV1 getHeaderV1() {
    return findNotNullChildByClass(TinyMappingHeaderV1.class);
  }

  @Override
  @NotNull
  public List<TinyMappingMethodv1> getMethodv1List() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, TinyMappingMethodv1.class);
  }

}
