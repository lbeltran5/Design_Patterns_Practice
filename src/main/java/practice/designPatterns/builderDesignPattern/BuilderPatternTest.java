package practice.designPatterns.builderDesignPattern;

public class BuilderPatternTest {
    public static void main(String[] args){

        System.out.println("");

        Platillo platillo = new Platillo();

        Plato platoVegano = platillo.platoVegano();
        System.out.println("Platillo Vegano");
        platoVegano.showCosas();
        System.out.println("Costo Total en Dolares: " + platoVegano.getCosto());

        System.out.println("------------------------------------------------");

        Plato platoNormalito = platillo.platoNormal();
        System.out.println("Platillo de Pollo");
        platoNormalito.showCosas();
        System.out.println("Costo Total en Dolares: " + platoNormalito.getCosto());

        System.out.println("------------------------------------------------");

        Plato platoMixto = platillo.platoMixto();
        System.out.println("Platillo Mixto");
        platoMixto.showCosas();
        System.out.println("Costo Total en Dolares: " + platoMixto.getCosto());

        System.out.println("------------------------------------------------");

    }
}
