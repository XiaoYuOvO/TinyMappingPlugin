package net.xiaoyu233.plugin.tinymapping.psi.impl;

import com.intellij.psi.PsiElement;
import net.xiaoyu233.plugin.tinymapping.gen.psi.TinyMappingClsv2;
import net.xiaoyu233.plugin.tinymapping.gen.psi.TinyMappingFieldv2;
import net.xiaoyu233.plugin.tinymapping.gen.psi.TinyMappingMethodv2;
import net.xiaoyu233.plugin.tinymapping.gen.psi.TinyMappingTypes;
import net.xiaoyu233.plugin.tinymapping.mapping.ClassMapping;

public class TInyMappingUtil {
    public static ClassMapping getClassMapping(TinyMappingClsv2 clsv2){
        for (PsiElement child : clsv2.getChildren()) {

        }
        for (TinyMappingFieldv2 tinyMappingFieldv2 : clsv2.getFieldv2List()) {

        }
        for (TinyMappingMethodv2 tinyMappingMethodv2 : clsv2.getMethodv2List()) {

        }
    }
}
