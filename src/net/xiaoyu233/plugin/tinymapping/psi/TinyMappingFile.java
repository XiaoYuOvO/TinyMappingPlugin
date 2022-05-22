package net.xiaoyu233.plugin.tinymapping.psi;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.lang.Language;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.openapi.util.TextRange;
import com.intellij.psi.FileViewProvider;
import net.xiaoyu233.plugin.tinymapping.filetype.TinyMappingFileType;
import net.xiaoyu233.plugin.tinymapping.language.TinyMappingLanguage;
import org.jetbrains.annotations.NotNull;

public class TinyMappingFile extends PsiFileBase {
    public TinyMappingFile(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, TinyMappingLanguage.INSTANCE);
    }

    @Override
    public @NotNull FileType getFileType() {
        return TinyMappingFileType.INSTANCE;
    }

    @Override
    public String toString() {
        return "Tiny Mapping";
    }
}
