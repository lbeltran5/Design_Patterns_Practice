package practice.designPatterns.factoryDesignPattern;

public class ColorFactory {
    //getColor method returns object of input type color
    public Color getColor(String colorType){
        if(colorType == null){
            return null;
        }

        if(colorType.equalsIgnoreCase("Red")){
            return new Red();
        }

        if(colorType.equalsIgnoreCase("Blue")){
            return new Blue();
        }

        if(colorType.equalsIgnoreCase("Pink")){
            return new Pink();
        }

        if(colorType.equalsIgnoreCase("Yellow")){
            return new Yellow();
        }

        return null;
    }
}
