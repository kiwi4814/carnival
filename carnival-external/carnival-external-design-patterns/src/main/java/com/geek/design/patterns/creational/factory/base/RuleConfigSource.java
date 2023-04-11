package com.geek.design.patterns.creational.factory.base;

import com.geek.design.patterns.creational.factory.base.exception.InvalidRuleConfigException;
import com.geek.design.patterns.creational.factory.base.parser.IRuleConfigParser;
import com.geek.design.patterns.creational.factory.base.parser.impl.JsonRuleConfigParser;
import com.geek.design.patterns.creational.factory.base.parser.impl.PropertiesRuleConfigParser;
import com.geek.design.patterns.creational.factory.base.parser.impl.XmlRuleConfigParser;
import com.geek.design.patterns.creational.factory.base.parser.impl.YamlRuleConfigParser;

/**
 * 根据配置文件的后缀（json、xml、yaml、properties），
 * 选择不同的解析器（JsonRuleConfigParser、XmlRuleConfigParser……），
 * 将存储在文件中的配置解析成内存对象 RuleConfig。
 */
public class RuleConfigSource {

    public RuleConfig load(String ruleConfigFilePath) {
        String ruleConfigFileExtension = getFileExtension(ruleConfigFilePath);
        IRuleConfigParser parser = null;
        if ("json".equalsIgnoreCase(ruleConfigFileExtension)) {
            parser = new JsonRuleConfigParser();
        } else if ("xml".equalsIgnoreCase(ruleConfigFileExtension)) {
            parser = new XmlRuleConfigParser();
        } else if ("yaml".equalsIgnoreCase(ruleConfigFileExtension)) {
            parser = new YamlRuleConfigParser();
        } else if ("properties".equalsIgnoreCase(ruleConfigFileExtension)) {
            parser = new PropertiesRuleConfigParser();
        } else {
            throw new InvalidRuleConfigException("Rule config file format is not supported: " + ruleConfigFilePath);
        }
        String configText = ""; //从ruleConfigFilePath文件中读取配置文本到configText中
        RuleConfig ruleConfig = parser.parse(configText);
        return ruleConfig;
    }

    //解析文件名获取扩展名，比如rule.json，返回json
    private String getFileExtension(String filePath) {
        return "json";
    }
}