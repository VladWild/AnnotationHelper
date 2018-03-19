package com.annotation.helper.utilities.cycle.commands;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.util.ArrayList;
import java.util.List;

public interface Command {
    List<String> getAllAnnotations();

    default List<String> getAnnotations(AnnotatedElement[] elements){
        List<String> annotations = new ArrayList<String>();

        for (AnnotatedElement element : elements) {
            for (Annotation annotation : element.getAnnotations()){
                annotations.add(annotation.toString());
            }
        }

        return annotations;
    }
}
