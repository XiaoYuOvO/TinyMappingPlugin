package net.xiaoyu233.plugin.tinymapping.gen.psi;

import com.intellij.lang.Language;
import com.intellij.psi.tree.IElementType;
import net.xiaoyu233.plugin.tinymapping.language.TinyMappingLanguage;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class TinyMappingTokenType extends IElementType {
    public TinyMappingTokenType(@NonNls @NotNull String debugName) {
        super(debugName, TinyMappingLanguage.INSTANCE);
    }
}
