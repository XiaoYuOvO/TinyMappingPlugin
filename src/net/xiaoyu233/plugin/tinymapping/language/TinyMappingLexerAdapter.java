package net.xiaoyu233.plugin.tinymapping.language;

import com.intellij.lexer.FlexAdapter;
import com.intellij.lexer.FlexLexer;
import org.jetbrains.annotations.NotNull;

public class TinyMappingLexerAdapter extends FlexAdapter {
    public TinyMappingLexerAdapter() {
        super(new _TinyMappingLexer(null));
    }
}
