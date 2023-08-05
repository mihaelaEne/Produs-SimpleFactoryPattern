package ro.mycode.models;

public class Laptop implements Produs {
    private String magazinCumparare;
    private float pret;
    private String IP;


    public Laptop() {
    }

    public Laptop(String magazinCumparare, float pret, String IP) {
        this.magazinCumparare = magazinCumparare;
        this.pret = pret;
        this.IP = IP;
    }

    public Laptop(String prop) {
        String [] split=prop.split(",");
        this.magazinCumparare=split[0];
        this.pret=Float.parseFloat(split[1]);
        this.IP=split[2];
    }

    public String getMagazinCumparare() {
        return magazinCumparare;
    }

    public void setMagazinCumparare(String magazinCumparare) {
        this.magazinCumparare = magazinCumparare;
    }

    public float getPret() {
        return pret;
    }

    public void setPret(float pret) {
        this.pret = pret;
    }

    public String getIP() {
        return IP;
    }

    public void setIP(String IP) {
        this.IP = IP;
    }

    public String descriereLaptop() {
        String text = "";
        text += "Eu sunt un laptop cu urmatoarele caracteristici: " + "\n";
        text += "magazinCumparare: " + this.magazinCumparare + "\n";
        text += "pret: " + this.pret + "\n";
        text += "IP:: " + this.getIP();
        return text;
    }

    @Override
    public void pregatireProdus() {
        System.out.println("Se pregateste laptopul");
    }

    @Override
    public void ambalare() {
        System.out.println("Se ambaleaza laptopul");
    }
}
