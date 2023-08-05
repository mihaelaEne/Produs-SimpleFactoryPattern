package ro.mycode.models;

public class Camasa implements Produs {

    private String model;
    private String culoare;
    private int marime;

    public Camasa() {
    }

    public Camasa(String model, String culoare, int marime) {
        this.model = model;
        this.culoare = culoare;
        this.marime = marime;
    }


    public Camasa(String prop) {
        String[] split = prop.split(",");
        this.model=split[0];
        this.culoare=split[1];
        this.marime=Integer.parseInt(split[2]);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCuloare() {
        return culoare;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public int getMarime() {
        return marime;
    }

    public void setMarime(int marime) {
        this.marime = marime;
    }


    public String descriereCamasa() {
        String text = "";
        text += "Eu sunt o camasa cu urmatoarele caracteristici: " + "\n";
        text += "model: " + this.model + "\n";
        text += "culoare: " + this.culoare + "\n";
        text += "marime: " + this.marime;
        return text;
    }

    @Override
    public void pregatireProdus() {
        System.out.println("Se pregateste camasa");
    }

    @Override
    public void ambalare() {
        System.out.println("Camasa este ambalata");
    }


}
