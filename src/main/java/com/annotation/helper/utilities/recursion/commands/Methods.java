package com.annotation.helper.utilities.recursion.commands;

import java.util.ArrayList;
import java.util.List;

public class Methods implements Command {
    private Class objectClass;

    public Methods(Class objectClass){
        this.objectClass = objectClass;
    }

    @Override
    public List<String> getAllAnnotations() {
        List<String> annotations = new ArrayList<String>();

        annotations.addAll(getAnnotations(objectClass.getDeclaredMethods()));

        for (Class classObject : objectClass.getDeclaredClasses()) {
            annotations.addAll(new Methods(classObject).getAllAnnotations());
        }

        return annotations;
    }
}

