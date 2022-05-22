package net.xiaoyu233.plugin.tinymapping.mapping;

import org.apache.commons.compress.utils.Lists;

import java.util.List;

public class ClassMapping {
    private final List<String> classNames = Lists.newArrayList();
    private final List<FieldMapping> fieldMappings = Lists.newArrayList();
    private final List<MethodMapping> methodMappings = Lists.newArrayList();

    public void addClass(String className){
        this.classNames.add(className);
    }

    public void addFieldMappings(FieldMapping fieldMapping){
        this.fieldMappings.add(fieldMapping);
    }

    public void addMethodMapping(MethodMapping methodMapping){
        this.methodMappings.add(methodMapping);
    }
}
