package com.annotation.helper.utilities.recursion.commands;

import java.util.ArrayList;
import java.util.List;

public class Constructors implements Command {
    private Class objectClass;

    public Constructors(Class objectClass){
        this.objectClass = objectClass;
    }

    @Override
    public List<String> getAllAnnotations() {
        List<String> annotations = new ArrayList<String>();

        annotations.addAll(getAnnotations(objectClass.getDeclaredConstructors()));

        for (Class classObject : objectClass.getDeclaredClasses()) {
            annotations.addAll(new Constructors(classObject).getAllAnnotations());
        }

        return annotations;
    }
}
