package com.annotation.helper.utilities;

import java.util.List;

public interface Handler {
    List<String> getAnnotations(String name) throws ClassNotFoundException;
}
