package com.annotation.helper.utilities.cycle.commands;

import java.util.*;

public class Constructors implements Command {
    private Class objectClass;

    public Constructors(Class objectClass){
        this.objectClass = objectClass;
    }

    @Override
    public List<String> getAllAnnotations() {
        List<String> annotations = new ArrayList<String>();
        Queue<Class> classes = new ArrayDeque<Class>();
        Stack<Queue<Class>> stack = new Stack<Queue<Class>>();

        classes.offer(objectClass);
        stack.push(classes);

        do {
            if (!stack.peek().isEmpty()){
                if (stack.peek().peek().getDeclaredClasses().length > 0) {
                    annotations.addAll(getAnnotations(stack.peek().peek().getDeclaredConstructors()));
                    stack.push(new ArrayDeque<Class>(Arrays.asList(stack.peek().poll().getDeclaredClasses())));
                } else {
                    annotations.addAll(getAnnotations(stack.peek().poll().getDeclaredConstructors()));
                }
            } else {
                stack.pop();
            }
        } while (!stack.empty());

        return annotations;
    }
}
