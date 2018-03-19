package com.annotation.helper.utilities;

import com.annotation.helper.utilities.cycle.CycleInvoker;
import com.annotation.helper.utilities.recursion.RecursionInvoker;

public enum FactoryHandler {
    CYCLE {
        @Override
        protected Handler getHandler() {
            return new CycleInvoker();
        }
    }, RECURSION {
        @Override
        protected Handler getHandler() {
            return new RecursionInvoker();
        }
    };

    protected abstract Handler getHandler();

    public static Handler getTypeHandler(FactoryHandler factoryHandler){
        return factoryHandler.getHandler();
    }
}

