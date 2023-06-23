package practice.designPatterns.builderDesignPattern;

public class Platillo {

    public Plato platoVegano(){
        Plato plato = new Plato();
        plato.addCosa(new AnvorguesaVegetariana());
        plato.addCosa(new Coca());
        return plato;
    }

    public Plato platoNormal(){
        Plato plato = new Plato();
        plato.addCosa(new AnvorguesaDePollo());
        plato.addCosa(new Pepsi());
        return plato;
    }

    public Plato platoMixto(){
        Plato plato = new Plato();
        plato.addCosa(new AnvorguesaDePollo());
        plato.addCosa(new Coca());
        return plato;
    }
}
