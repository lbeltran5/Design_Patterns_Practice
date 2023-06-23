package practice.designPatterns.abstractFactoryDesignPattern;

import practice.designPatterns.factoryDesignPattern.*;

public class ShapeFactory extends AbstractFactory{

    //getShape method returns object of input type shape
    @Override
    public Shape getShape(String shapeType){
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("Circle")){
            return new Circle();
        }
        if(shapeType.equalsIgnoreCase("Square")){
            return new Square();
        }
        if(shapeType.equalsIgnoreCase("Rectangle")){
            return new Rectangle();
        }
        if(shapeType.equalsIgnoreCase("Triangle")){
            return new Triangle();
        }
        return null;
    }

    @Override
    Color getColor(String color){
        return null;
    }
}
