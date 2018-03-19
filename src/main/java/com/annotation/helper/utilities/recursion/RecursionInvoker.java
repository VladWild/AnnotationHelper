package com.annotation.helper.utilities.recursion;

import com.annotation.helper.utilities.Handler;

import java.util.ArrayList;
import java.util.List;

public class RecursionInvoker implements Handler {
    @Override
    public List<String> getAnnotations(String name) throws ClassNotFoundException {
        List<String> annotations = new ArrayList<String>();

        for (FactoryCommandRecursion command : FactoryCommandRecursion.values()) {
            annotations.addAll(command.getCommand(Class.forName(name)).getAllAnnotations());
        }

        return annotations;
    }
}

