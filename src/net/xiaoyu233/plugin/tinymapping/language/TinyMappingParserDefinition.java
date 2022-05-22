package net.xiaoyu233.plugin.tinymapping.language;

import com.intellij.lang.ASTNode;
import com.intellij.lang.ParserDefinition;
import com.intellij.lang.PsiParser;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.project.Project;
import com.intellij.psi.FileViewProvider;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IFileElementType;
import com.intellij.psi.tree.TokenSet;
import net.xiaoyu233.plugin.tinymapping.gen.parser.TinyMappingParser;
import net.xiaoyu233.plugin.tinymapping.gen.psi.TinyMappingTypes;
import net.xiaoyu233.plugin.tinymapping.psi.TinyMappingFile;
import org.jetbrains.annotations.NotNull;

public class TinyMappingParserDefinition implements ParserDefinition {
    public static final TokenSet WHITE_SPACES = TokenSet.create(TokenType.WHITE_SPACE);
    public static final IFileElementType FILE = new IFileElementType(TinyMappingLanguage.INSTANCE);
    @Override
    public @NotNull Lexer createLexer(Project project) {
        return new TinyMappingLexerAdapter();
    }

    @Override
    public @NotNull PsiParser createParser(Project project) {
        return new TinyMappingParser();
    }

    @Override
    public @NotNull IFileElementType getFileNodeType() {
        return FILE;
    }

    @Override
    public @NotNull TokenSet getCommentTokens() {
        return TokenSet.EMPTY;
    }

    @Override
    public @NotNull TokenSet getStringLiteralElements() {
        return TokenSet.EMPTY;
    }

    @Override
    public @NotNull PsiElement createElement(ASTNode astNode) {
        return TinyMappingTypes.Factory.createElement(astNode);
    }

    @Override
    public @NotNull PsiFile createFile(@NotNull FileViewProvider fileViewProvider) {
        return new TinyMappingFile(fileViewProvider);
    }
}
