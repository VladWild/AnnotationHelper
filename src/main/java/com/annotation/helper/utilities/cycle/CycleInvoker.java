package com.annotation.helper.utilities.cycle;

import com.annotation.helper.utilities.Handler;

import java.util.ArrayList;
import java.util.List;

public class CycleInvoker implements Handler {
    @Override
    public List<String> getAnnotations(String name) throws ClassNotFoundException {
        List<String> annotations = new ArrayList<String>();

        for (FactoryCommandCycle command : FactoryCommandCycle.values()) {
            annotations.addAll(command.getCommand(Class.forName(name)).getAllAnnotations());
        }

        return annotations;
    }
}

