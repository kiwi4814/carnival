package com.geek.principle.solid.isp.config.inter;

import java.util.Map;

public interface Viewer {
    String outputInPlainText();

    Map<String, String> output();
}