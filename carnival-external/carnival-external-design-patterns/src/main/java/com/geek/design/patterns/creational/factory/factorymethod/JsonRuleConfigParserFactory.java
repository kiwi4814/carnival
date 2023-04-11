package com.geek.design.patterns.creational.factory.factorymethod;

import com.geek.design.patterns.creational.factory.base.parser.IRuleConfigParser;
import com.geek.design.patterns.creational.factory.base.parser.impl.JsonRuleConfigParser;

public class JsonRuleConfigParserFactory implements IRuleConfigParserFactory {
  @Override
  public IRuleConfigParser createParser() {
    return new JsonRuleConfigParser();
  }
}