package com.znn.injectview.compiler;

import javax.lang.model.type.TypeMirror;

/**
 * @author RANDY.ZHANG
 * @version 1.0
 * @date 2016/5/23 17:06
 */
final class FieldViewBinding {
    private final String name;
    private final TypeMirror type;
    private final int resId;

    public FieldViewBinding(String name, TypeMirror type, int resId) {
        this.name = name;
        this.type = type;
        this.resId = resId;
    }

    public int getResId() {
        return resId;
    }

    public String getName() {
        return name;
    }

    public TypeMirror getType() {
        return type;
    }
}
