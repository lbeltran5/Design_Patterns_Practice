package practice.designPatterns.builderDesignPattern;

public class AnvorguesaVegetariana extends Anvorguesa{
    @Override
    public float precio(){
        return 3.49f;
    }

    @Override
    public String nombre(){
        return "Anvorguesa Vegetariana";
    }
}
