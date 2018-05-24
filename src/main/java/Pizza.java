public class Pizza {

    private String ser;
    private String ciasto;
    private String oliwki;
    private String salami;
    private String papryka;

    public Pizza(String ser, String ciasto) {
        this.ser = ser;
        this.ciasto = ciasto;
    }

    public void setSalami(String salami) {
        this.salami = salami;
    }

    public void setOliwki(String oliwki){
        this.oliwki = oliwki;
    }

    public void setPapryka(String papryka) {
        this.papryka = papryka;
    }
}
