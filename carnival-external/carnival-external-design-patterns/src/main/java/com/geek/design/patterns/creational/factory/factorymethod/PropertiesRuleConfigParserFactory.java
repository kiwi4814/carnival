package com.geek.design.patterns.creational.factory.factorymethod;

import com.geek.design.patterns.creational.factory.base.parser.IRuleConfigParser;
import com.geek.design.patterns.creational.factory.base.parser.impl.PropertiesRuleConfigParser;

public class PropertiesRuleConfigParserFactory implements IRuleConfigParserFactory {
  @Override
  public IRuleConfigParser createParser() {
    return new PropertiesRuleConfigParser();
  }
}