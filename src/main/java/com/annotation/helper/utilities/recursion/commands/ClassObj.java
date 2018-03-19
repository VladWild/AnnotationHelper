package com.annotation.helper.utilities.recursion.commands;

import java.util.ArrayList;
import java.util.List;

public class ClassObj implements Command {
    private Class objectClass;

    public ClassObj(Class objectClass){
        this.objectClass = objectClass;
    }

    @Override
    public List<String> getAllAnnotations() {
        List<String> annotations = new ArrayList<String>();

        annotations.addAll(getAnnotations(new Class[]{objectClass}));

        for (Class classObject : objectClass.getDeclaredClasses()) {
            annotations.addAll(new ClassObj(classObject).getAllAnnotations());
        }

        return annotations;
    }
}
