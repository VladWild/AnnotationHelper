package com.annotation.helper.utilities.cycle;

import com.annotation.helper.utilities.cycle.commands.*;

enum FactoryCommandCycle {
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

