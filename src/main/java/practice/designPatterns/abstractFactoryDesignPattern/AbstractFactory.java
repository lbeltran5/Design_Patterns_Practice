package practice.designPatterns.abstractFactoryDesignPattern;

import org.designPatterns.factoryDesignPattern.*;
import practice.designPatterns.factoryDesignPattern.*;

public abstract class AbstractFactory {
    abstract Color getColor(String color);
    abstract Shape getShape(String shape);
}
