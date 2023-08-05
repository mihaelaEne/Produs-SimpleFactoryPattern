package ro.mycode.controllers;

import ro.mycode.ProdusFactory;
import ro.mycode.models.Produs;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class ProdusController {

    private ArrayList<Produs>produse;

    public ProdusController(){
        this.produse=new ArrayList<>();
        //this.load();
    }

    public void load(){
        try {
            File file=new File("C:\\mycode\\OOP\\mostenirea\\Teme\\Produs\\src\\ro\\mycode\\data\\produs.txt");
            Scanner scanner=new Scanner(file);
            while (scanner.hasNextLine()){
                String line=scanner.nextLine();
                ProdusFactory produsFactory=new ProdusFactory();
              this.produse.add(produsFactory.createProdus(line.split(",")[0],line));
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
