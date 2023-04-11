package com.geek.design.patterns.creational.factory.factorymethod;

import com.geek.design.patterns.creational.factory.base.parser.IRuleConfigParser;

/**
 * 利用多态将 if 分支逻辑去掉。
 * 这就是工厂方法模式的典型代码实现。
 * 这样当我们新增一种 parser 的时候，只需要新增一个实现了 IRuleConfigParserFactory 接口的 Factory 类即可。
 * 所以，工厂方法模式比起简单工厂模式更加符合开闭原则。
 */
public interface IRuleConfigParserFactory {
    IRuleConfigParser createParser();
}






