package practice.designPatterns.abstractFactoryDesignPattern;


import practice.designPatterns.factoryDesignPattern.*;

public class ColorFactoryAbs extends AbstractFactory{
    @Override
    Color getColor(String color) {
        if(color == null){
            return null;
        }

        if(color.equalsIgnoreCase("Red")){
            return new Red();

        }else if(color.equalsIgnoreCase("Blue")){
            return new Blue();

        }else if(color.equalsIgnoreCase("Pink")){
            return new Pink();

        }else if(color.equalsIgnoreCase("Yellow")){
            return new Yellow();
        }

        return null;
    }

    @Override
    public Shape getShape(String shapeType){
        return null;
    }
}
