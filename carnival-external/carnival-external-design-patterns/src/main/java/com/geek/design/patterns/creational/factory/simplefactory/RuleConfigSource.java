package com.geek.design.patterns.creational.factory.simplefactory;

import com.geek.design.patterns.creational.factory.base.RuleConfig;
import com.geek.design.patterns.creational.factory.base.exception.InvalidRuleConfigException;
import com.geek.design.patterns.creational.factory.base.parser.IRuleConfigParser;

/**
 * 1.在“规范和重构”那一部分中，我们有讲到，为了让代码逻辑更加清晰，可读性更好，我们要善于将功能独立的代码块封装成函数。
 * 按照这个设计思路，我们可以将代码中涉及 parser 创建的部分逻辑剥离出来，抽象成 createParser() 函数,代码省略。
 * 2.为了让类的职责更加单一、代码更加清晰，我们还可以进一步将 createParser() 函数剥离到一个独立的类中，让这个类只负责对象的创建。
 * 而这个类就是我们现在要讲的简单工厂模式类。具体的代码如下所示：
 */
public class RuleConfigSource {
    public RuleConfig load(String ruleConfigFilePath) {
        String ruleConfigFileExtension = getFileExtension(ruleConfigFilePath);

        /**
         * 简单工厂模式的第一种写法
         */
        //IRuleConfigParser parser = RuleConfigParserFactory1.createParser(ruleConfigFileExtension);
        /**
         * 简单工厂模式的第二种写法：复用parser
         */
        IRuleConfigParser parser = RuleConfigParserFactory2.createParser(ruleConfigFileExtension);
        if (parser == null) {
            throw new InvalidRuleConfigException(
                    "Rule config file format is not supported: " + ruleConfigFilePath);
        }

        String configText = "";
        //从ruleConfigFilePath文件中读取配置文本到configText中
        RuleConfig ruleConfig = parser.parse(configText);
        return ruleConfig;
    }

    private String getFileExtension(String filePath) {
        //...解析文件名获取扩展名，比如rule.json，返回json
        return "json";
    }
}




