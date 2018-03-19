package com.annotation.helper.utilities.cycle.commands;

import java.util.*;

public class ClassObj implements Command{
    private Class objectClass;

    public ClassObj(Class objectClass){
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

            //если очередь на верхнем элементе стека не пустая, то выполняем следующие действия
            if (!stack.peek().isEmpty()){

                //если в начале очереди верхнего элемента стека есть класс, в котором есть внутренние классы
                if (stack.peek().peek().getDeclaredClasses().length > 0) {

                    //записываем все аннотации этого класса в annotations
                    annotations.addAll(getAnnotations(new Class[]{stack.peek().peek()}));

                    //удаляя из начала очереди этот класс, создаем новую очередь внутренних классов этого удаляемого класса и помещаем эту очередь в вершину стека
                    stack.push(new ArrayDeque<Class>(Arrays.asList(stack.peek().poll().getDeclaredClasses())));

                } else {
                    //записываем все аннотации этого класса в annotations, удаляя из начала очереди этот класс
                    annotations.addAll(getAnnotations(new Class[]{stack.peek().poll()}));
                }
            } else {
                //удаляем верхний элемент из очереди
                stack.pop();
            }

        } while (!stack.empty());

        return annotations;
    }
}
