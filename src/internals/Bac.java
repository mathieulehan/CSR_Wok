package internals;

public class Bac {

    private TypesBac typeBac;
    private int quantiteGrammes;
    private boolean unClientSeSert;

    public Bac(TypesBac typeBac, int quantiteGrammes) {
        this.typeBac = typeBac;
        this.quantiteGrammes = quantiteGrammes;
    }

    public TypesBac getTypeBac() {
        return typeBac;
    }

    public void setTypeBac(TypesBac typeBac) {
        this.typeBac = typeBac;
    }

    public int getQuantiteGrammes() {
        return quantiteGrammes;
    }

    public void setQuantiteGrammes(int quantiteGrammes) {
        this.quantiteGrammes = quantiteGrammes;
    }

    public void prendrePortion(int quantiteGrammes) {
        this.quantiteGrammes -= quantiteGrammes;
    }

    public void employeArrive() {
        while(unClientSeSert) {}
        setQuantiteGrammes(1000);
        notify();
    }
}
