package practice.designPatterns.builderDesignPattern;

public abstract class BebidaHelada implements Cosas{
    @Override
    public Paquete paquete(){
        return new Botella();
    }

    @Override
    public abstract float precio();
}
