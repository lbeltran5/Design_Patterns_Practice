package practice.designPatterns.builderDesignPattern;

import java.util.*;

public class Plato {
    private List<Cosas> cosas = new ArrayList<Cosas>();

    public void addCosa(Cosas cosa){
        cosas.add(cosa);
    }

    public float getCosto(){
        float costo = 0.0f;

        for (Cosas cosa: cosas){
            costo += cosa.precio();
        }
       return costo;
}

public void showCosas(){

    for (Cosas cosa : cosas){
        System.out.println("Tipo : " + cosa.nombre());
        System.out.println("Presentacion en : " + cosa.paquete().pack());
        System.out.println("Precio : " + cosa.precio());
    }
}
}
