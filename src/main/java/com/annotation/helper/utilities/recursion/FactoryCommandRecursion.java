package com.annotation.helper.utilities.recursion;

import com.annotation.helper.utilities.recursion.commands.*;

enum FactoryCommandRecursion {
    CLASS {
        ClassObj getCommand(Class classObject) {
            return new ClassObj(classObject);
        }
    }, CONSTRUCTORS {
        @Override
        Command getCommand(Class classObject) {
            return new Constructors(classObject);
        }
    }, FIELDS {
        @Override
        Command getCommand(Class classObject) {
            return new Fields(classObject);
        }
    }, METHODS {
        @Override
        Command getCommand(Class classObject) {
            return new Methods(classObject);
        }
    };

    abstract Command getCommand(Class classObject);
}
