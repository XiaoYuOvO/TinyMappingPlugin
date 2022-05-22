package net.xiaoyu233.plugin.tinymapping.gen.psi;

import com.intellij.psi.tree.IElementType;
import net.xiaoyu233.plugin.tinymapping.language.TinyMappingLanguage;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class TinyMappingElementType extends IElementType {
    public TinyMappingElementType(@NonNls @NotNull String debugName) {
        super(debugName, TinyMappingLanguage.INSTANCE);
    }
}
