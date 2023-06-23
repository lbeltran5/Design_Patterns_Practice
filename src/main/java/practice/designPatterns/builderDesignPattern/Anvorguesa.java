package practice.designPatterns.builderDesignPattern;

public abstract class Anvorguesa implements Cosas{
    @Override
    public Paquete paquete(){
        return new Envoltura();
    }

    @Override
    public abstract float precio();
}
