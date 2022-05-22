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

public class TinyMappingHeaderV2Impl extends ASTWrapperPsiElement implements TinyMappingHeaderV2 {

  public TinyMappingHeaderV2Impl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull TinyMappingVisitor visitor) {
    visitor.visitHeaderV2(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof TinyMappingVisitor) accept((TinyMappingVisitor)visitor);
    else super.accept(visitor);
  }

}
