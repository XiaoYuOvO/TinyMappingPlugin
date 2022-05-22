package net.xiaoyu233.plugin.tinymapping.language;

import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.tree.IElementType;
import net.xiaoyu233.plugin.tinymapping.gen.psi.TinyMappingElementType;
import net.xiaoyu233.plugin.tinymapping.gen.psi.TinyMappingTokenType;
import net.xiaoyu233.plugin.tinymapping.gen.psi.TinyMappingTypes;
import org.jetbrains.annotations.NotNull;

public class TInySyntaxHighlighter extends SyntaxHighlighterBase {
    public static final TextAttributesKey KEYWORD = TextAttributesKey.createTextAttributesKey("KEYWORD", DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey CLASS_NAME = TextAttributesKey.createTextAttributesKey("CLASS_NAME", DefaultLanguageHighlighterColors.CLASS_NAME);
    public static final TextAttributesKey NAMESPACE = TextAttributesKey.createTextAttributesKey("NAMESPACE", DefaultLanguageHighlighterColors.STRING);
    public static final TextAttributesKey FIELD = TextAttributesKey.createTextAttributesKey("FIELD", DefaultLanguageHighlighterColors.INSTANCE_FIELD);
    public static final TextAttributesKey METHOD = TextAttributesKey.createTextAttributesKey("METHOD", DefaultLanguageHighlighterColors.INSTANCE_METHOD);
    public static final TextAttributesKey SIGNATURE = TextAttributesKey.createTextAttributesKey("SIGNATURE", DefaultLanguageHighlighterColors.OPERATION_SIGN);
    private static final TextAttributesKey[] KEYWORD_KEYS = new TextAttributesKey[]{KEYWORD};
    private static final TextAttributesKey[] CLASS_NAME_KEYS = new TextAttributesKey[]{CLASS_NAME};
    private static final TextAttributesKey[] NAMESPACE_KEYS = new TextAttributesKey[]{NAMESPACE};
    private static final TextAttributesKey[] FIELD_KEYS = new TextAttributesKey[]{FIELD};
    private static final TextAttributesKey[] METHOD_KEYS = new TextAttributesKey[]{METHOD};
    private static final TextAttributesKey[] SIGNATURE_KEYS = new TextAttributesKey[]{SIGNATURE};
    private static final TextAttributesKey[] EMPTY_KEYS = new TextAttributesKey[0];
    @Override
    public @NotNull Lexer getHighlightingLexer() {
        return new TinyMappingLexerAdapter();
    }

    @NotNull
    @Override
    public TextAttributesKey[] getTokenHighlights(IElementType tokenType) {
        if(tokenType.equals(TinyMappingTypes.TINY_V_2) ||
                tokenType.equals(TinyMappingTypes.TINY_V2_HEADER) ||
                tokenType.equals(TinyMappingTypes.CLASS_V2) ||
                tokenType.equals(TinyMappingTypes.METHOD_V2) ||
                tokenType.equals(TinyMappingTypes.FIELD_V2) ||
                tokenType.equals(TinyMappingTypes.TINY_V_1) ||
                tokenType.equals(TinyMappingTypes.TINY_V1_HEADER) ||
                tokenType.equals(TinyMappingTypes.CLASS_V1) ||
                tokenType.equals(TinyMappingTypes.METHOD_V1) ||
                tokenType.equals(TinyMappingTypes.FIELD_V1) ){
            return KEYWORD_KEYS;
        }else if (tokenType.equals(TinyMappingTypes.CLASS_NAME)){
            return CLASS_NAME_KEYS;
        }else if (tokenType.equals(TinyMappingTypes.HEADER_NAMESPACE_ELEMENT)) {
            return NAMESPACE_KEYS;
		}else if (tokenType.equals(TinyMappingTypes.FIELD_NAME)){
            return FIELD_KEYS;
        }else if (tokenType.equals(TinyMappingTypes.METHOD_NAME)){
            return METHOD_KEYS;
        }else if (tokenType.equals(TinyMappingTypes.TYPE_SIGNATURE) || tokenType.equals(TinyMappingTypes.METHOD_SIGNATURE)){
            return SIGNATURE_KEYS;
        }
        return EMPTY_KEYS;
    }
}
