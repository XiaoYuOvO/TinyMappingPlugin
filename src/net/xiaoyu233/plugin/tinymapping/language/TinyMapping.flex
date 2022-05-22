package net.xiaoyu233.plugin.tinymapping.language;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;import net.xiaoyu233.plugin.tinymapping.gen.psi.TinyMappingTypes;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static net.xiaoyu233.plugin.tinymapping.gen.psi.TinyMappingTypes.*;

%%

%s TINY_V2
%s TINY_V1
%s TINY_V2_HEADER_STATE
%s TINY_V1_HEADER_STATE
%s CLASS_V2_STATE
%s FIELD_V2_STATE
%s METHOD_V2_STATE
%s PARAMETER_V2_STATE
%s CLASS_V1_STATE
%s FIELD_V1_STATE
%s METHOD_V1_STATE
%s FIELD_V1_HEADER_STATE
%s METHOD_V1_HEADER_STATE

%public
%class _TinyMappingLexer
%implements FlexLexer
%function advance
%type IElementType
%unicode

TINY_V2_HEADER = "tiny	2	0"
TINY_V1_HEADER = "v1"
HEADER_NAMESPACE_ELEMENT = \w+
PARAMETER_NAME = (\w|\$|_|\d)+
METHOD_NAME = (\w|\$|_|\d)+
FIELD_NAME = (\w|\$|_|\d)+
CLASS_NAME = (\w|\$|\/|_|\d)+
TYPE_SIGNATURE=(\[*[ZBCSIFDJ]|(\[*L[^;\n]+;))
METHOD_SIGNATURE=\((\[*[ZBCSIFDJ]|(\[*L[^;\n]+;))*\)(\[*[ZBCSIFDJV]|(\[*L[^;\n]+;))
COMMENT = (((\t\t)|(\t\t\t))c\t(\s|\S)+)
NEWLINE = \n
TAB = \t
CLASS_V2 = c
FIELD_V2 = \tf
METHOD_V2 = \tm
PARAMETER_V2 = \t\tp
CLASS_V1 = CLASS
FIELD_V1 = FIELD
METHOD_V1 = METHOD
PARAMETER_INDEX = \d+

%%
<YYINITIAL> {
    {TINY_V1_HEADER}                            	{ yybegin(TINY_V1_HEADER_STATE); return TINY_V1_HEADER; }
    {TINY_V2_HEADER}								{ yybegin(TINY_V2_HEADER_STATE); return TINY_V2_HEADER; }
    {NEWLINE}										{ return NEWLINE;}
    {TAB}									   		{ return TAB;}
}

<TINY_V1_HEADER_STATE> {
	{TAB}									   	 	{ return TAB;}
    {HEADER_NAMESPACE_ELEMENT}						{ return HEADER_NAMESPACE_ELEMENT;}
    {NEWLINE} 										{ yybegin(TINY_V1); return NEWLINE;}
}

<TINY_V2_HEADER_STATE> {
	{TAB}									   	 	{ return TAB;}
    {HEADER_NAMESPACE_ELEMENT}						{ return HEADER_NAMESPACE_ELEMENT;}
    {NEWLINE} 										{ yybegin(TINY_V2); return NEWLINE;}
}
//TINY V1
<TINY_V1> {
	{CLASS_V1}										{ yybegin(CLASS_V1_STATE); return CLASS_V1;}
    {METHOD_V1} 							    	{ yybegin(METHOD_V1_HEADER_STATE); return METHOD_V1;}
    {FIELD_V1} 							    		{ yybegin(FIELD_V1_HEADER_STATE); return FIELD_V1;}
    {NEWLINE} 										{ return NEWLINE;}
}

<CLASS_V1_STATE> {
	{TAB}									   		{ return TAB;}
	{CLASS_NAME} 							    	{ return TinyMappingTypes.CLASS_NAME;}
    {NEWLINE} 										{ yybegin(TINY_V1); return NEWLINE;}
}

<METHOD_V1_HEADER_STATE> {
	{TAB}									   		{ return TAB;}
	{CLASS_NAME} 							    	{ yybegin(METHOD_V1_STATE); return TinyMappingTypes.CLASS_NAME;}
}

<FIELD_V1_HEADER_STATE> {
	{TAB}									   		{ return TAB;}
	{CLASS_NAME} 							    	{ yybegin(FIELD_V1_STATE); return TinyMappingTypes.CLASS_NAME;}
}

<METHOD_V1_STATE> {
	{TAB}									   		{ return TAB;}
    {TYPE_SIGNATURE}								{ return TYPE_SIGNATURE;}
    {METHOD_SIGNATURE}			      				{ return METHOD_SIGNATURE;}
	{METHOD_NAME}									{ return TinyMappingTypes.METHOD_NAME;}
    {NEWLINE} 										{ yybegin(TINY_V1); return NEWLINE;}
}

<FIELD_V1_STATE> {
	{TAB}									   		{ return TAB;}
    {TYPE_SIGNATURE}								{ return TYPE_SIGNATURE;}
	{FIELD_NAME}									{ return TinyMappingTypes.FIELD_NAME;}
    {NEWLINE} 										{ yybegin(TINY_V1); return NEWLINE;}
}
// TINY V2
<TINY_V2> {
	{TAB}									   		{ return TAB;}
    {CLASS_V2}										{ yybegin(CLASS_V2_STATE); return CLASS_V2;}
    {NEWLINE}										{ return NEWLINE;}
}

<CLASS_V2_STATE> {
    {METHOD_V2}										{ yybegin(METHOD_V2_STATE); return METHOD_V2;}
    {FIELD_V2}										{ yybegin(FIELD_V2_STATE); return FIELD_V2;}
    {PARAMETER_V2}									{ yybegin(PARAMETER_V2_STATE); return PARAMETER_V2;}
	{TAB}									   		{ return TAB;}
	{NEWLINE}                                   	{ return NEWLINE;}
	{CLASS_V2} 										{ return CLASS_V2;}
    {CLASS_NAME}									{ return TinyMappingTypes.CLASS_NAME;}
    {COMMENT}							     		{ return COMMENTV_2;}
}

<METHOD_V2_STATE> {
	{TAB}									   		{ return TAB;}
    {NEWLINE}										{ yybegin(CLASS_V2_STATE); return NEWLINE;}
    {TYPE_SIGNATURE}								{ return TYPE_SIGNATURE;}
    {METHOD_SIGNATURE}			      				{ return METHOD_SIGNATURE;}
    {METHOD_NAME}									{ return TinyMappingTypes.METHOD_NAME;}
}

<FIELD_V2_STATE> {
	{TAB}									   		{ return TAB;}
    {NEWLINE}										{ yybegin(CLASS_V2_STATE); return NEWLINE;}
    {TYPE_SIGNATURE}								{ return TYPE_SIGNATURE;}
    {FIELD_NAME}									{ return TinyMappingTypes.FIELD_NAME;}
}

<PARAMETER_V2_STATE> {
    {TAB}									   		{ return TAB;}
    {NEWLINE}										{ yybegin(CLASS_V2_STATE); return NEWLINE;}
	{PARAMETER_INDEX}								{ return PARAMETER_INDEX;}
    {PARAMETER_NAME}								{ return TinyMappingTypes.PARAMETER_NAME;}
}

[^] { return BAD_CHARACTER; }
