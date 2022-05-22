/* The following code was generated by JFlex 1.7.0 tweaked for IntelliJ platform */

package net.xiaoyu233.plugin.tinymapping.language;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;import net.xiaoyu233.plugin.tinymapping.gen.psi.TinyMappingTypes;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static net.xiaoyu233.plugin.tinymapping.gen.psi.TinyMappingTypes.*;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.7.0
 * from the specification file <tt>TinyMapping.flex</tt>
 */
public class _TinyMappingLexer implements FlexLexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;
  public static final int TINY_V2 = 2;
  public static final int TINY_V1 = 4;
  public static final int TINY_V2_HEADER_STATE = 6;
  public static final int TINY_V1_HEADER_STATE = 8;
  public static final int CLASS_V2_STATE = 10;
  public static final int FIELD_V2_STATE = 12;
  public static final int METHOD_V2_STATE = 14;
  public static final int PARAMETER_V2_STATE = 16;
  public static final int CLASS_V1_STATE = 18;
  public static final int FIELD_V1_STATE = 20;
  public static final int METHOD_V1_STATE = 22;
  public static final int FIELD_V1_HEADER_STATE = 24;
  public static final int METHOD_V1_HEADER_STATE = 26;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1,  1,  2,  2,  3,  3,  4,  4,  5,  5,  6,  6,  7,  7, 
     8,  8,  9,  9, 10, 10, 11, 11, 12, 12, 13, 13
  };

  /** 
   * Translates characters to character classes
   * Chosen bits are [11, 6, 4]
   * Total runtime size is 15616 bytes
   */
  public static int ZZ_CMAP(int ch) {
    return ZZ_CMAP_A[(ZZ_CMAP_Y[(ZZ_CMAP_Z[ch>>10]<<6)|((ch>>4)&0x3f)]<<4)|(ch&0xf)];
  }

  /* The ZZ_CMAP_Z table has 1088 entries */
  static final char ZZ_CMAP_Z[] = zzUnpackCMap(
    "\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\6\15\1\16\23\15"+
    "\1\17\1\15\1\20\1\21\12\15\1\22\10\12\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1"+
    "\32\1\33\1\34\1\35\1\36\2\12\1\15\1\37\3\12\1\40\10\12\1\41\1\42\5\15\1\43"+
    "\1\44\11\12\1\45\2\12\1\46\4\12\1\47\1\50\1\51\1\12\1\52\1\12\1\53\1\54\1"+
    "\55\3\12\51\15\1\56\3\15\1\57\1\60\4\15\1\61\12\12\1\62\u02c1\12\1\63\277"+
    "\12");

  /* The ZZ_CMAP_Y table has 3328 entries */
  static final char ZZ_CMAP_Y[] = zzUnpackCMap(
    "\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\2\1\1\10\1\11\1\12\1\13\1\12\1\13\34\12\1"+
    "\14\1\15\1\16\1\1\7\12\1\17\1\20\1\12\1\21\4\12\1\22\10\12\1\21\12\12\1\23"+
    "\1\12\1\24\1\23\1\12\1\25\1\23\1\12\1\26\1\27\1\12\1\30\1\31\1\1\1\30\4\12"+
    "\1\32\6\12\1\33\1\34\1\35\1\1\3\12\1\36\6\12\1\15\1\37\2\12\1\40\2\12\1\41"+
    "\1\1\1\12\1\42\4\1\1\12\1\43\1\1\1\44\1\21\7\12\1\45\1\23\1\33\1\46\1\34\1"+
    "\47\1\50\1\51\1\45\1\15\1\52\1\46\1\34\1\53\1\54\1\55\1\56\1\57\1\60\1\21"+
    "\1\34\1\61\1\62\1\63\1\45\1\64\1\65\1\46\1\34\1\61\1\66\1\67\1\45\1\70\1\71"+
    "\1\72\1\73\1\74\1\75\1\76\1\56\1\1\1\77\1\100\1\34\1\101\1\102\1\103\1\45"+
    "\1\1\1\77\1\100\1\34\1\104\1\102\1\105\1\45\1\106\1\107\1\100\1\12\1\36\1"+
    "\110\1\111\1\45\1\112\1\113\1\114\1\12\1\115\1\116\1\117\1\56\1\120\1\23\2"+
    "\12\1\30\1\121\1\122\2\1\1\123\1\124\1\125\1\126\1\127\1\130\2\1\1\63\1\131"+
    "\1\122\1\132\1\133\1\12\1\134\1\23\1\135\1\133\1\12\1\134\1\136\3\1\4\12\1"+
    "\122\4\12\1\137\2\12\1\140\2\12\1\141\24\12\1\142\1\143\2\12\1\142\2\12\1"+
    "\144\1\145\1\13\3\12\1\145\3\12\1\36\2\1\1\12\1\1\5\12\1\146\1\23\45\12\1"+
    "\147\1\12\1\23\1\30\4\12\1\150\1\151\1\152\1\153\1\12\1\153\1\12\1\154\1\152"+
    "\1\155\5\12\1\156\1\122\1\1\1\157\1\122\5\12\1\25\2\12\1\30\4\12\1\57\1\12"+
    "\1\121\2\42\1\56\1\12\1\41\1\153\2\12\1\42\1\12\1\160\1\122\2\1\1\12\1\42"+
    "\3\12\1\121\1\12\1\147\2\122\1\161\1\121\4\1\4\12\1\42\1\122\1\162\1\154\3"+
    "\12\1\37\3\12\1\154\3\12\1\25\1\163\1\37\1\12\1\41\1\151\4\1\1\164\1\12\1"+
    "\165\17\12\1\166\21\12\1\146\2\12\1\146\1\167\1\12\1\41\3\12\1\170\1\171\1"+
    "\172\1\134\1\171\3\1\1\173\1\63\1\174\1\1\1\175\1\1\1\134\3\1\2\12\1\63\1"+
    "\176\1\177\1\200\1\201\1\202\1\1\2\12\1\151\62\1\1\203\2\12\1\160\161\1\2"+
    "\12\1\121\2\12\1\121\10\12\1\204\1\154\2\12\1\140\3\12\1\205\1\173\1\12\1"+
    "\206\4\207\2\12\2\1\1\173\35\1\1\210\1\1\1\23\1\211\1\23\4\12\1\212\1\23\4"+
    "\12\1\141\1\213\1\12\1\41\1\23\4\12\1\121\1\1\1\12\1\30\3\1\1\12\40\1\133"+
    "\12\1\57\4\1\135\12\1\57\2\1\10\12\1\134\4\1\2\12\1\41\20\12\1\134\1\12\1"+
    "\214\1\1\3\12\1\215\7\12\1\15\1\1\1\216\1\217\5\12\1\220\1\12\1\121\1\25\3"+
    "\1\1\216\2\12\1\25\1\1\3\12\1\154\4\12\1\57\1\122\1\12\1\221\1\37\1\12\1\41"+
    "\2\12\1\154\1\12\1\134\4\12\1\222\1\122\1\12\1\223\3\12\1\206\1\41\1\122\1"+
    "\12\1\114\4\12\1\31\1\157\1\12\1\224\1\225\1\226\1\207\2\12\1\141\1\57\7\12"+
    "\1\227\1\122\72\12\1\154\1\12\1\230\2\12\1\42\20\1\26\12\1\41\6\12\1\160\2"+
    "\1\1\206\1\231\1\34\1\232\1\233\6\12\1\15\1\1\1\234\25\12\1\41\1\1\4\12\1"+
    "\217\2\12\1\25\2\1\1\42\1\12\1\1\1\12\1\235\1\236\2\1\1\135\7\12\1\134\1\1"+
    "\1\122\1\23\1\237\1\23\1\30\1\203\4\12\1\121\1\240\1\241\2\1\1\242\1\12\1"+
    "\13\1\243\2\41\2\1\7\12\1\30\4\1\3\12\1\153\7\1\1\244\10\1\1\12\1\134\3\12"+
    "\2\63\1\1\2\12\1\1\1\12\1\30\2\12\1\30\1\12\1\41\2\12\1\245\1\246\2\1\11\12"+
    "\1\41\1\122\2\12\1\245\1\12\1\42\2\12\1\25\3\12\1\154\11\1\23\12\1\206\1\12"+
    "\1\57\1\25\11\1\1\247\2\12\1\250\1\12\1\57\1\12\1\206\1\12\1\121\4\1\1\12"+
    "\1\251\1\12\1\57\1\12\1\160\4\1\3\12\1\252\4\1\1\253\1\254\1\12\1\255\2\1"+
    "\1\12\1\134\1\12\1\134\2\1\1\133\1\12\1\206\1\1\3\12\1\57\1\12\1\57\1\12\1"+
    "\31\1\12\1\15\6\1\4\12\1\151\3\1\3\12\1\31\3\12\1\31\60\1\4\12\1\206\1\1\1"+
    "\56\1\173\3\12\1\30\1\1\1\12\1\151\1\122\3\12\1\256\1\1\2\12\1\257\4\12\1"+
    "\260\1\261\2\1\1\12\1\21\1\12\1\262\4\1\1\263\1\26\1\151\3\12\1\30\1\122\1"+
    "\33\1\46\1\34\1\61\1\66\1\264\1\265\1\153\10\1\4\12\1\30\1\122\2\1\4\12\1"+
    "\266\1\122\12\1\3\12\1\267\1\63\1\270\2\1\4\12\1\271\1\122\2\1\3\12\1\25\1"+
    "\122\3\1\1\12\1\101\1\42\1\122\26\1\4\12\1\122\1\173\34\1\3\12\1\151\20\1"+
    "\1\34\2\12\1\13\1\63\1\122\1\1\1\217\1\12\1\217\1\133\1\206\64\1\71\12\1\160"+
    "\6\1\6\12\1\121\1\1\14\12\1\154\53\1\2\12\1\121\75\1\44\12\1\206\33\1\43\12"+
    "\1\151\1\12\1\121\1\122\6\1\1\12\1\41\1\153\3\12\1\206\1\154\1\122\1\234\1"+
    "\272\1\12\67\1\4\12\1\153\2\12\1\121\1\173\1\12\4\1\1\63\1\1\76\12\1\134\1"+
    "\1\57\12\1\31\20\1\1\15\77\1\6\12\1\30\1\134\1\151\1\273\114\1\1\274\1\275"+
    "\1\276\1\1\1\277\11\1\1\300\33\1\5\12\1\135\3\12\1\152\1\301\1\302\1\303\3"+
    "\12\1\304\1\305\1\12\1\306\1\307\1\100\24\12\1\267\1\12\1\100\1\141\1\12\1"+
    "\141\1\12\1\135\1\12\1\135\1\121\1\12\1\121\1\12\1\34\1\12\1\34\1\12\1\310"+
    "\3\311\40\1\3\12\1\230\2\12\1\134\1\312\1\174\1\162\1\23\25\1\1\13\1\220\1"+
    "\313\75\1\14\12\1\153\1\206\2\1\4\12\1\30\1\122\112\1\1\303\1\12\1\314\1\315"+
    "\1\316\1\317\1\320\1\321\1\322\1\42\1\323\1\42\47\1\1\12\1\160\1\12\1\160"+
    "\1\12\1\160\47\1\55\12\1\206\2\1\103\12\1\153\15\12\1\41\150\12\1\15\25\1"+
    "\41\12\1\41\56\1\17\12\41\1");

  /* The ZZ_CMAP_A table has 3392 entries */
  static final char ZZ_CMAP_A[] = zzUnpackCMap(
    "\11\0\1\5\1\21\31\0\1\13\3\0\1\23\1\24\5\0\1\15\1\7\1\11\1\6\7\14\1\0\1\22"+
    "\5\0\1\33\1\17\1\32\1\40\1\37\1\35\1\12\1\43\1\36\1\17\1\12\1\20\1\41\1\12"+
    "\1\44\3\12\1\34\1\42\1\12\1\25\3\12\1\17\1\16\3\0\1\12\1\0\2\12\1\26\2\12"+
    "\1\27\2\12\1\2\3\12\1\30\1\3\1\12\1\31\3\12\1\1\1\12\1\10\2\12\1\4\1\12\17"+
    "\0\1\12\12\0\1\12\4\0\1\12\5\0\27\12\1\0\12\12\4\0\14\12\16\0\5\12\7\0\1\12"+
    "\1\0\1\12\1\0\5\12\1\0\2\12\2\0\4\12\1\0\1\12\6\0\1\12\1\0\3\12\1\0\1\12\1"+
    "\0\4\12\1\0\23\12\1\0\11\12\1\0\26\12\2\0\1\12\6\0\10\12\10\0\16\12\1\0\1"+
    "\12\1\0\2\12\1\0\2\12\1\0\1\12\10\0\13\12\5\0\3\12\15\0\12\14\4\0\6\12\1\0"+
    "\10\12\2\0\12\12\1\0\6\12\12\14\3\12\2\0\14\12\2\0\3\12\12\14\14\12\4\0\1"+
    "\12\5\0\16\12\2\0\14\12\4\0\5\12\1\0\10\12\6\0\20\12\2\0\12\14\1\12\2\0\16"+
    "\12\1\0\1\12\3\0\4\12\2\0\11\12\2\0\2\12\2\0\4\12\10\0\1\12\4\0\2\12\1\0\1"+
    "\12\1\0\3\12\1\0\6\12\4\0\2\12\1\0\2\12\1\0\2\12\1\0\2\12\2\0\1\12\1\0\5\12"+
    "\4\0\2\12\2\0\3\12\3\0\1\12\7\0\4\12\1\0\1\12\7\0\12\14\6\12\13\0\3\12\1\0"+
    "\11\12\1\0\2\12\1\0\2\12\1\0\5\12\2\0\12\12\1\0\3\12\1\0\3\12\2\0\1\12\30"+
    "\0\1\12\7\0\3\12\1\0\10\12\2\0\6\12\2\0\2\12\2\0\3\12\10\0\2\12\4\0\2\12\1"+
    "\0\1\12\1\0\1\12\20\0\2\12\1\0\6\12\3\0\3\12\1\0\4\12\3\0\2\12\1\0\1\12\1"+
    "\0\2\12\3\0\2\12\3\0\3\12\3\0\14\12\4\0\5\12\3\0\3\12\1\0\4\12\2\0\1\12\6"+
    "\0\1\12\10\0\4\12\1\0\10\12\1\0\3\12\1\0\30\12\3\0\10\12\1\0\3\12\1\0\4\12"+
    "\7\0\2\12\1\0\3\12\5\0\4\12\1\0\5\12\2\0\4\12\5\0\2\12\7\0\1\12\2\0\2\12\16"+
    "\0\3\12\1\0\10\12\1\0\7\12\1\0\3\12\1\0\5\12\5\0\4\12\7\0\1\12\12\0\6\12\2"+
    "\0\2\12\1\0\22\12\3\0\10\12\1\0\11\12\1\0\1\12\2\0\7\12\3\0\1\12\4\0\6\12"+
    "\1\0\1\12\1\0\10\12\2\0\2\12\14\0\17\12\1\0\12\14\7\0\2\12\1\0\1\12\2\0\2"+
    "\12\1\0\1\12\2\0\1\12\6\0\4\12\1\0\7\12\1\0\3\12\1\0\1\12\1\0\1\12\2\0\2\12"+
    "\1\0\15\12\1\0\3\12\2\0\5\12\1\0\1\12\1\0\6\12\2\0\12\14\2\0\4\12\10\0\2\12"+
    "\13\0\1\12\1\0\1\12\1\0\1\12\4\0\12\12\1\0\24\12\3\0\5\12\1\0\12\12\6\0\1"+
    "\12\11\0\12\14\4\12\2\0\6\12\1\0\1\12\5\0\1\12\2\0\13\12\1\0\15\12\1\0\4\12"+
    "\2\0\7\12\1\0\1\12\1\0\4\12\2\0\1\12\1\0\4\12\2\0\7\12\1\0\1\12\1\0\4\12\2"+
    "\0\16\12\2\0\6\12\2\0\15\12\2\0\14\12\3\0\13\12\7\0\15\12\1\0\7\12\13\0\4"+
    "\12\14\0\1\12\1\0\2\12\14\0\4\12\3\0\1\12\4\0\2\12\15\0\3\12\2\0\12\12\15"+
    "\0\1\12\23\0\5\12\12\14\3\0\6\12\1\0\23\12\1\0\2\12\6\0\6\12\5\0\15\12\1\0"+
    "\1\12\1\0\1\12\1\0\1\12\1\0\6\12\1\0\7\12\1\0\1\12\3\0\3\12\1\0\7\12\3\0\4"+
    "\12\2\0\6\12\23\0\1\12\4\0\1\12\14\0\1\12\15\0\1\12\2\0\1\12\4\0\1\12\2\0"+
    "\12\12\1\0\1\12\3\0\5\12\6\0\1\12\1\0\1\12\1\0\1\12\1\0\4\12\1\0\13\12\2\0"+
    "\4\12\5\0\5\12\4\0\1\12\7\0\17\12\6\0\15\12\7\0\10\12\11\0\7\12\1\0\7\12\6"+
    "\0\3\12\11\0\5\12\2\0\5\12\3\0\7\12\2\0\2\12\2\0\3\12\5\0\13\12\12\14\2\12"+
    "\4\0\3\12\1\0\12\12\1\0\1\12\7\0\11\12\2\0\27\12\2\0\15\12\3\0\1\12\1\0\1"+
    "\12\2\0\1\12\16\0\1\12\12\14\5\12\3\0\5\12\12\0\6\12\2\0\6\12\2\0\6\12\11"+
    "\0\13\12\1\0\2\12\2\0\7\12\4\0\5\12\3\0\5\12\5\0\12\12\1\0\5\12\1\0\1\12\1"+
    "\0\2\12\1\0\2\12\1\0\12\12\3\0\15\12\3\0\2\12\30\0\16\12\4\0\1\12\2\0\6\12"+
    "\2\0\6\12\2\0\6\12\2\0\3\12\3\0\14\12\1\0\16\12\1\0\2\12\1\0\1\12\15\0\1\12"+
    "\2\0\4\12\4\0\10\12\1\0\5\12\12\0\6\12\2\0\1\12\1\0\14\12\1\0\2\12\3\0\1\12"+
    "\2\0\4\12\1\0\2\12\12\0\10\12\6\0\6\12\1\0\2\12\5\0\10\12\1\0\3\12\1\0\13"+
    "\12\4\0\3\12\4\0\6\12\1\0\12\14\4\12\2\0\1\12\11\0\5\12\5\0\3\12\3\0\12\14"+
    "\1\12\1\0\1\12\3\0\10\12\6\0\1\12\1\0\7\12\1\0\1\12\1\0\4\12\1\0\2\12\6\0"+
    "\1\12\5\0\7\12\2\0\7\12\3\0\6\12\1\0\1\12\10\0\6\12\2\0\10\12\10\0\6\12\2"+
    "\0\1\12\3\0\1\12\13\0\10\12\5\0\15\12\3\0\2\12\6\0\5\12\3\0\6\12\10\0\10\12"+
    "\2\0\7\12\16\0\4\12\4\0\3\12\15\0\1\12\2\0\2\12\2\0\4\12\1\0\14\12\1\0\1\12"+
    "\1\0\7\12\1\0\21\12\1\0\4\12\2\0\10\12\1\0\7\12\1\0\14\12\1\0\4\12\1\0\5\12"+
    "\1\0\1\12\3\0\11\12\1\0\10\12\2\0\22\14\5\0\1\12\12\0\2\12\1\0\2\12\1\0\5"+
    "\12\6\0\2\12\1\0\1\12\2\0\1\12\1\0\12\12\1\0\4\12\1\0\1\12\1\0\1\12\6\0\1"+
    "\12\4\0\1\12\1\0\1\12\1\0\1\12\1\0\3\12\1\0\2\12\1\0\1\12\2\0\1\12\1\0\1\12"+
    "\1\0\1\12\1\0\1\12\1\0\1\12\1\0\2\12\1\0\1\12\2\0\4\12\1\0\7\12\1\0\4\12\1"+
    "\0\4\12\1\0\1\12\1\0\12\12\1\0\5\12\1\0\3\12\1\0\5\12\1\0\5\12");

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\16\0\2\1\1\2\1\1\1\3\1\4\3\1\1\5"+
    "\1\6\1\7\1\10\1\2\1\11\1\12\1\1\1\13"+
    "\1\12\1\14\1\15\1\13\1\15\1\1\1\16\1\17"+
    "\1\20\1\21\1\0\1\22\4\0\1\23\1\24\1\0"+
    "\1\13\2\0\1\12\1\15\12\0\1\25\1\0\1\26"+
    "\10\0\1\27\1\30\1\0\1\31\1\0\1\32\1\0"+
    "\1\33";

  private static int [] zzUnpackAction() {
    int [] result = new int[85];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\45\0\112\0\157\0\224\0\271\0\336\0\u0103"+
    "\0\u0128\0\u014d\0\u0172\0\u0197\0\u01bc\0\u01e1\0\u0206\0\u022b"+
    "\0\u0206\0\u0250\0\u0206\0\u0206\0\u0275\0\u029a\0\u02bf\0\u02e4"+
    "\0\u0206\0\u0206\0\u0309\0\u032e\0\u0309\0\u0353\0\u0378\0\u0353"+
    "\0\u039d\0\u0206\0\u03c2\0\u03c2\0\u03e7\0\u040c\0\u0431\0\u0456"+
    "\0\u047b\0\u04a0\0\u04c5\0\u0206\0\u04ea\0\u050f\0\u0534\0\u0559"+
    "\0\u0206\0\u0206\0\u0378\0\u0206\0\u057e\0\u05a3\0\u05c8\0\u05ed"+
    "\0\u0612\0\u040c\0\u0637\0\u065c\0\u0681\0\u06a6\0\u06cb\0\u06f0"+
    "\0\u0715\0\u073a\0\u0206\0\u075f\0\u0206\0\u0784\0\u07a9\0\u07ce"+
    "\0\u07f3\0\u0818\0\u083d\0\u0862\0\u0887\0\u0206\0\u0206\0\u08ac"+
    "\0\u083d\0\u08d1\0\u0206\0\u08f6\0\u0206";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[85];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\17\1\20\3\17\1\21\2\17\1\22\10\17\1\23"+
    "\30\17\1\21\13\17\1\23\4\17\1\24\37\17\1\23"+
    "\10\17\1\25\2\17\1\26\3\17\1\27\4\17\4\30"+
    "\1\21\5\30\1\17\1\30\2\17\2\30\1\31\3\17"+
    "\20\30\1\17\4\30\1\21\5\30\1\17\1\30\2\17"+
    "\2\30\1\32\3\17\20\30\1\17\4\33\1\34\10\33"+
    "\1\17\2\33\1\23\3\17\1\33\1\35\16\33\1\17"+
    "\4\36\1\21\7\36\1\17\1\37\1\40\1\41\1\42"+
    "\3\17\5\36\1\40\1\36\3\40\1\36\1\40\4\36"+
    "\1\17\4\43\1\21\7\43\1\17\1\37\1\44\1\45"+
    "\1\42\1\17\1\46\1\17\5\43\1\44\1\43\3\44"+
    "\1\43\1\44\4\43\1\17\4\47\1\21\2\50\1\47"+
    "\1\50\2\47\1\50\2\17\2\47\1\42\3\17\20\47"+
    "\1\17\4\33\1\21\10\33\1\17\2\33\1\32\3\17"+
    "\20\33\1\17\4\36\1\21\7\36\1\17\1\37\1\40"+
    "\1\41\1\32\3\17\5\36\1\40\1\36\3\40\1\36"+
    "\1\40\4\36\1\17\4\43\1\21\7\43\1\17\1\37"+
    "\1\44\1\45\1\32\1\17\1\46\1\17\5\43\1\44"+
    "\1\43\3\44\1\43\1\44\4\43\1\17\4\51\1\21"+
    "\10\51\1\17\2\51\4\17\20\51\1\17\4\52\1\21"+
    "\10\52\1\17\2\52\4\17\20\52\47\0\1\53\53\0"+
    "\1\54\53\0\1\55\62\0\1\56\45\0\1\57\6\0"+
    "\4\30\1\0\5\30\1\0\1\30\2\0\2\30\4\0"+
    "\20\30\1\0\4\33\1\0\10\33\1\0\2\33\4\0"+
    "\20\33\5\0\1\60\21\0\1\61\1\62\15\0\4\36"+
    "\1\0\7\36\2\0\2\36\4\0\20\36\16\0\1\63"+
    "\1\64\1\65\11\0\1\64\1\0\3\64\1\0\1\64"+
    "\4\0\1\66\4\67\1\66\7\67\2\66\2\67\2\0"+
    "\2\66\20\67\1\0\4\43\1\0\7\43\2\0\2\43"+
    "\4\0\20\43\1\66\4\70\1\66\7\70\2\66\2\70"+
    "\2\0\2\66\20\70\16\0\1\71\1\72\1\73\3\0"+
    "\1\74\5\0\1\72\1\0\3\72\1\0\1\72\5\0"+
    "\4\47\1\0\7\47\2\0\2\47\4\0\20\47\1\0"+
    "\4\47\1\0\2\50\1\47\1\50\2\47\1\50\2\0"+
    "\2\47\4\0\20\47\1\0\4\51\1\0\10\51\1\0"+
    "\2\51\4\0\20\51\1\0\4\52\1\0\10\52\1\0"+
    "\2\52\4\0\20\52\3\0\1\75\74\0\1\76\50\0"+
    "\1\77\47\0\1\100\7\0\1\101\20\0\1\102\2\0"+
    "\1\103\13\0\21\66\2\0\43\66\1\0\1\64\23\66"+
    "\4\67\1\66\7\67\2\66\2\67\1\0\1\64\2\66"+
    "\20\67\1\66\4\70\1\66\7\70\2\66\2\70\1\0"+
    "\1\64\2\66\20\70\16\0\1\71\1\72\1\73\11\0"+
    "\1\72\1\0\3\72\1\0\1\72\4\0\21\104\2\0"+
    "\22\104\16\0\1\74\1\105\1\106\4\0\1\105\4\0"+
    "\1\105\1\0\3\105\1\0\1\105\10\0\1\107\74\0"+
    "\1\110\30\0\1\111\67\0\1\112\27\0\1\102\23\0"+
    "\1\113\37\0\21\104\1\0\1\72\22\104\21\114\2\0"+
    "\22\114\5\0\1\115\73\0\1\116\50\0\1\117\50\0"+
    "\1\120\45\121\21\114\1\0\1\105\22\114\6\0\1\122"+
    "\76\0\1\123\11\0\1\124\46\0\1\125\35\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[2331];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String[] ZZ_ERROR_MSG = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\16\0\1\11\1\1\1\11\1\1\2\11\4\1\2\11"+
    "\7\1\1\11\10\1\1\0\1\11\4\0\2\11\1\0"+
    "\1\11\2\0\2\1\12\0\1\11\1\0\1\11\10\0"+
    "\2\11\1\0\1\1\1\0\1\11\1\0\1\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[85];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private CharSequence zzBuffer = "";

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /**
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public _TinyMappingLexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    int size = 0;
    for (int i = 0, length = packed.length(); i < length; i += 2) {
      size += packed.charAt(i);
    }
    char[] map = new char[size];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < packed.length()) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }

  public final int getTokenStart() {
    return zzStartRead;
  }

  public final int getTokenEnd() {
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end, int initialState) {
    zzBuffer = buffer;
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return      {@code false}, iff there was new input.
   *
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {
    return true;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final CharSequence yytext() {
    return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
  }


  /**
   * Returns the character at position {@code pos} from the
   * matched text.
   *
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch.
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer.charAt(zzStartRead+pos);
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occurred while scanning.
   *
   * In a wellformed scanner (no or only correct usage of
   * yypushback(int) and a match-all fallback rule) this method
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public IElementType advance() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    CharSequence zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + ZZ_CMAP(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
        return null;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { return BAD_CHARACTER;
            } 
            // fall through
          case 28: break;
          case 2: 
            { return TAB;
            } 
            // fall through
          case 29: break;
          case 3: 
            { return NEWLINE;
            } 
            // fall through
          case 30: break;
          case 4: 
            { yybegin(CLASS_V2_STATE); return CLASS_V2;
            } 
            // fall through
          case 31: break;
          case 5: 
            { return HEADER_NAMESPACE_ELEMENT;
            } 
            // fall through
          case 32: break;
          case 6: 
            { yybegin(TINY_V2); return NEWLINE;
            } 
            // fall through
          case 33: break;
          case 7: 
            { yybegin(TINY_V1); return NEWLINE;
            } 
            // fall through
          case 34: break;
          case 8: 
            { return TinyMappingTypes.CLASS_NAME;
            } 
            // fall through
          case 35: break;
          case 9: 
            { return CLASS_V2;
            } 
            // fall through
          case 36: break;
          case 10: 
            { return TinyMappingTypes.FIELD_NAME;
            } 
            // fall through
          case 37: break;
          case 11: 
            { return TYPE_SIGNATURE;
            } 
            // fall through
          case 38: break;
          case 12: 
            { yybegin(CLASS_V2_STATE); return NEWLINE;
            } 
            // fall through
          case 39: break;
          case 13: 
            { return TinyMappingTypes.METHOD_NAME;
            } 
            // fall through
          case 40: break;
          case 14: 
            { return TinyMappingTypes.PARAMETER_NAME;
            } 
            // fall through
          case 41: break;
          case 15: 
            { return PARAMETER_INDEX;
            } 
            // fall through
          case 42: break;
          case 16: 
            { yybegin(FIELD_V1_STATE); return TinyMappingTypes.CLASS_NAME;
            } 
            // fall through
          case 43: break;
          case 17: 
            { yybegin(METHOD_V1_STATE); return TinyMappingTypes.CLASS_NAME;
            } 
            // fall through
          case 44: break;
          case 18: 
            { yybegin(TINY_V1_HEADER_STATE); return TINY_V1_HEADER;
            } 
            // fall through
          case 45: break;
          case 19: 
            { yybegin(FIELD_V2_STATE); return FIELD_V2;
            } 
            // fall through
          case 46: break;
          case 20: 
            { yybegin(METHOD_V2_STATE); return METHOD_V2;
            } 
            // fall through
          case 47: break;
          case 21: 
            { yybegin(PARAMETER_V2_STATE); return PARAMETER_V2;
            } 
            // fall through
          case 48: break;
          case 22: 
            { return METHOD_SIGNATURE;
            } 
            // fall through
          case 49: break;
          case 23: 
            { yybegin(CLASS_V1_STATE); return CLASS_V1;
            } 
            // fall through
          case 50: break;
          case 24: 
            { yybegin(FIELD_V1_HEADER_STATE); return FIELD_V1;
            } 
            // fall through
          case 51: break;
          case 25: 
            { return COMMENTV_2;
            } 
            // fall through
          case 52: break;
          case 26: 
            { yybegin(METHOD_V1_HEADER_STATE); return METHOD_V1;
            } 
            // fall through
          case 53: break;
          case 27: 
            { yybegin(TINY_V2_HEADER_STATE); return TINY_V2_HEADER;
            } 
            // fall through
          case 54: break;
          default:
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
