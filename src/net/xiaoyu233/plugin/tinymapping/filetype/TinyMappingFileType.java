package net.xiaoyu233.plugin.tinymapping.filetype;

import com.intellij.lang.Language;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.openapi.fileTypes.LanguageFileType;
import com.intellij.openapi.util.NlsContexts;
import com.intellij.openapi.util.NlsSafe;
import net.xiaoyu233.plugin.tinymapping.language.TinyMappingLanguage;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class TinyMappingFileType extends LanguageFileType {
    public static final TinyMappingFileType INSTANCE = new TinyMappingFileType();
    protected TinyMappingFileType() {
        super(TinyMappingLanguage.INSTANCE);
    }

    @Override
    public @NonNls
    @NotNull String getName() {
        return "TinyMapping";
    }

    @Override
    public @NlsContexts.Label
    @NotNull String getDescription() {
        return "A small-sized mapping file used by fabric";
    }

    @Override
    public @NlsSafe
    @NotNull String getDefaultExtension() {
        return ".tiny";
    }

    @Override
    public @Nullable Icon getIcon() {
        return Icons.FABRIC_ICON;
    }
}
