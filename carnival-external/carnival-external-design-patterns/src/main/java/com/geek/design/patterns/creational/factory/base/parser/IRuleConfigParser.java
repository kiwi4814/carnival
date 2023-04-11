package com.geek.design.patterns.creational.factory.base.parser;

import com.geek.design.patterns.creational.factory.base.RuleConfig;

public interface IRuleConfigParser {

    public RuleConfig parse(String configText);
}
