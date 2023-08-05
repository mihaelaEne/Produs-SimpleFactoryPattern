package ro.mycode;

import ro.mycode.models.Camasa;
import ro.mycode.models.Laptop;
import ro.mycode.models.Produs;
import ro.mycode.models.TelefonMobil;

public class ProdusFactory {


    public Produs createProdus(String comanda,String line){
        Produs produs=null;
        if("Camasa".equals(comanda)){
            produs=new Camasa(line);
        }else if("Laptop".equals(comanda)){
            produs=new Laptop(line);
        }else if("TelefonMobil".equals(comanda)){
            produs=new TelefonMobil(line);
        }
        produs.pregatireProdus();
        produs.ambalare();
        return produs;
    }

}
