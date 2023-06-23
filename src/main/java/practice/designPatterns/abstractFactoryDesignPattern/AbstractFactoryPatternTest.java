package practice.designPatterns.abstractFactoryDesignPattern;

import practice.designPatterns.factoryDesignPattern.*;

public class AbstractFactoryPatternTest {
    public static void main(String[] args){
        //get color factory
        AbstractFactory shapeFactory = FactoryGenerator.getFactory("Shape");

        //Get Circle class object
        assert shapeFactory != null;
        Shape shape1 = shapeFactory.getShape("Circle");

        //call drawShape method of Circle
        shape1.drawShape();

        //Get Rectangle class object
        Shape shape2 = shapeFactory.getShape("Rectangle");

        //call drawShape method of Rectangle
        shape2.drawShape();

        //Get Square class object
        Shape shape3 = shapeFactory.getShape("Square");

        //call drawShape method of Square
        shape3.drawShape();

        Shape shape4 = shapeFactory.getShape("Triangle");
        shape4.drawShape();

        //get color factory
        AbstractFactory colorFactory = FactoryGenerator.getFactory("Color");

        //get an object of Color Red
        Color color1 = colorFactory.getColor("Red");
        color1.fillColor();

        //get an object of Color Green
        Color color2 = colorFactory.getColor("Blue");
        color2.fillColor();

        //get an object of Color Blue
        Color color3 = colorFactory.getColor("Pink");

        //call fillColor method of Color Blue
        color3.fillColor();

        Color color4 = colorFactory.getColor("Yellow");
        color4.fillColor();
    }
}