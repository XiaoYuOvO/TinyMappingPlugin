package net.xiaoyu233.plugin.tinymapping.language;

import com.intellij.lang.Language;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class TinyMappingLanguage extends Language {
    public static final Language INSTANCE = new TinyMappingLanguage();

    protected TinyMappingLanguage() {
        super("TinyMapping");
    }
}
