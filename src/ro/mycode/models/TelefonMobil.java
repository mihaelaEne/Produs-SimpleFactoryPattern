package ro.mycode.models;

public class TelefonMobil implements Produs{
   private String sistemDeOperare;
   private String tipIncarcator;
   private int procentBaterie;

   public TelefonMobil(){}
    public TelefonMobil(String sistemDeOperare, String tipIncarcator, int procentBaterie) {
        this.sistemDeOperare = sistemDeOperare;
        this.tipIncarcator = tipIncarcator;
        this.procentBaterie = procentBaterie;
    }

    public TelefonMobil(String prop){
       String [] split =prop.split(",");
       this.sistemDeOperare=split[0];
       this.tipIncarcator=split[1];
       this.procentBaterie=Integer.parseInt(split[2]);
    }

    public String getSistemDeOperare() {
        return sistemDeOperare;
    }

    public void setSistemDeOperare(String sistemDeOperare) {
        this.sistemDeOperare = sistemDeOperare;
    }

    public String getTipIncarcator() {
        return tipIncarcator;
    }

    public void setTipIncarcator(String tipIncarcator) {
        this.tipIncarcator = tipIncarcator;
    }

    public int getProcentBaterie() {
        return procentBaterie;
    }

    public void setProcentBaterie(int procentBaterie) {
        this.procentBaterie = procentBaterie;
    }


    public String descriereTelefonMobil(){
        String text="";
        text+="Eu sunt o camasa cu urmatoarele caracteristici: "+"\n";

        text+="sistem de operare: "+this.sistemDeOperare+"\n";
        text+="tipIncarcator: "+this.tipIncarcator+"\n";
        text+="procent baterie: "+this.procentBaterie;
        return text;
    }


    @Override
    public void pregatireProdus() {

    }

    @Override
    public void ambalare() {

    }
}
