package com.sree.collections.Generics;

public class GenericClass<T, U, V> {   //T and U indicates Types of values

    public T id;
    public U name;
    public V mark;

    public GenericClass(T id, U name, V mark) {
        this.id = id;
        this.name = name;
        this.mark = mark;
    }

    public T getId() {
        return id;
    }

    public void setId(T id) {
        this.id = id;
    }

    public U getName() {
        return name;
    }

    public void setName(U name) {
        this.name = name;
    }

    public V getMark() {
        return mark;
    }

    public void setMark(V mark) {
        this.mark = mark;
    }
}
