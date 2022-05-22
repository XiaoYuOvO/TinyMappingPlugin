package net.xiaoyu233.plugin.tinymapping.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import net.xiaoyu233.plugin.tinymapping.psi.TinyMappingNamedElement;
import org.jetbrains.annotations.NotNull;

public abstract class TinyMappingNamedElementImpl extends ASTWrapperPsiElement implements TinyMappingNamedElement {
    public TinyMappingNamedElementImpl(@NotNull ASTNode node) {
        super(node);
    }
}
