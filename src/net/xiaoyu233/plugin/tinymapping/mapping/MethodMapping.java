package net.xiaoyu233.plugin.tinymapping.mapping;

import com.google.common.collect.Lists;

import java.util.List;

public class MethodMapping {
    private final List<String> methodNames = Lists.newArrayList();
    private final String methodSignature;
    private final ClassMapping parent;

    public MethodMapping(ClassMapping parent,String methodSignature) {
        this.methodSignature = methodSignature;
        this.parent = parent;
    }

    public void addMethodName(String methodName){
        this.methodNames.add(methodName);
    }
}
