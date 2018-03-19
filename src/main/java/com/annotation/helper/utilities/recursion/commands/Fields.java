package com.annotation.helper.utilities.recursion.commands;

import java.util.ArrayList;
import java.util.List;

public class Fields implements Command {
    private Class objectClass;

    public Fields(Class objectClass){
        this.objectClass = objectClass;
    }

    @Override
    public List<String> getAllAnnotations() {
        List<String> annotations = new ArrayList<String>();

        annotations.addAll(getAnnotations(objectClass.getDeclaredFields()));

        for (Class classObject : objectClass.getDeclaredClasses()) {
            annotations.addAll(new Fields(classObject).getAllAnnotations());
        }

        return annotations;
    }
}
