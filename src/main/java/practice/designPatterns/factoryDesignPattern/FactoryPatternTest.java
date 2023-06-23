package practice.designPatterns.factoryDesignPattern;

public class FactoryPatternTest {
    public static void main(String[] args){
        ColorFactory colorFactory = new ColorFactory();

        //Get Color class object
        Color color1 = colorFactory.getColor("Red");
        color1.fillColor();

        Color color2 = colorFactory.getColor("Blue");
        color2.fillColor();

        Color color3 = colorFactory.getColor("Pink");
        color3.fillColor();

        Color color4 = colorFactory.getColor("Yellow");
        color4.fillColor();
    }
}
