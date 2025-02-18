package com.sree.collections.Generics;

public class NonGenericClass {

    public Object id;  //Type is Object, non generic
    public Object name;

    public NonGenericClass(Object id, Object name) {
        this.id = id;
        this.name = name;
    }

    public Object getId() {
        return id;
    }

    public void setId(Object id) {
        this.id = id;
    }

    public Object getName() {
        return name;
    }

    public void setName(Object name) {
        this.name = name;
    }
}
