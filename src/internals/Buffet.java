package internals;

import java.util.HashMap;
import java.util.Map;

public class Buffet {

    private HashMap<TypesBac, Bac> bacs = new HashMap<>();

    public Buffet() {
        this.bacs.put(TypesBac.POISSON, new Bac(TypesBac.POISSON, 1000));
        this.bacs.put(TypesBac.VIANDE, new Bac(TypesBac.VIANDE, 1000));
        this.bacs.put(TypesBac.LEGUMES, new Bac(TypesBac.LEGUMES, 1000));
        this.bacs.put(TypesBac.NOUILLES, new Bac(TypesBac.NOUILLES, 1000));
    }

    public synchronized void seServir(Client client, TypesBac typeBac, Integer qteGrammes) {
        while(this.bacs.get(typeBac).getQuantiteGrammes() < qteGrammes) {}
        try { Thread.sleep(300); } catch(InterruptedException e) {}
        this.bacs.get(typeBac).prendrePortion(qteGrammes);
        client.setaCuitSonTruc(true);
    }

    public Map<TypesBac, Bac> getBacs() {
        return bacs;
    }
}
