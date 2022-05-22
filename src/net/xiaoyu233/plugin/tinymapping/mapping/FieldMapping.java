package net.xiaoyu233.plugin.tinymapping.mapping;

import com.google.common.collect.Lists;

import java.util.List;

public class FieldMapping {
    private final ClassMapping parent;
    private final List<String> fieldNames = Lists.newArrayList();
    private final String signature;

    public FieldMapping(ClassMapping parent, String signature) {
        this.parent = parent;
        this.signature = signature;
    }

    public void addFieldName(String fieldName){
        this.fieldNames.add(fieldName);
    }
}
