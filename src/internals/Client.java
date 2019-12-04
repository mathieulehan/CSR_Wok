package internals;

import database.api.impl.Restaurant;

import java.util.Random;

public class Client {

    private boolean aCuitSonTruc;

    public enum etatsClient {WAITING_TO_ENTER, AT_THE_BUFFET, WAITING_THE_COOK, EATING, OUT}
    private etatsClient etat;

    public boolean isaCuitSonTruc() {
        return aCuitSonTruc;
    }

    public void setaCuitSonTruc(boolean aCuitSonTruc) {
        this.aCuitSonTruc = aCuitSonTruc;
    }

    public void start() {
        try {
            setEtat(etatsClient.WAITING_TO_ENTER);
            Restaurant.entrer(this);
            Buffet buffet = Restaurant.buffet;
            Random r = new Random();
            buffet.seServir(this, TypesBac.POISSON, r.nextInt((100 - 100) + 1) + 100);
            buffet.seServir(this, TypesBac.VIANDE, r.nextInt((100 - 100) + 1) + 100);
            buffet.seServir(this, TypesBac.LEGUMES, r.nextInt((100 - 100) + 1) + 100);
            buffet.seServir(this, TypesBac.NOUILLES, r.nextInt((100 - 100) + 1) + 100);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setEtat(etatsClient e) {
        this.etat = e;
    }
}
