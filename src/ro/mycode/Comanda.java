package ro.mycode;

import ro.mycode.models.Produs;

public class Comanda {

    public Produs orderProdus(String comanda, String linie){
        ProdusFactory factory=new ProdusFactory();
        Produs produs=factory.createProdus(comanda, linie);
        produs.pregatireProdus();
        produs.ambalare();
        return produs;
    }
}
