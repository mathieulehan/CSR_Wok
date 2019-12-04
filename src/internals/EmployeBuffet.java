package internals;

public class EmployeBuffet extends Thread {

    private Buffet buffet;
    public enum etatsEmploye {REMPLIT, MARCHE}
    private etatsEmploye etat;

    public EmployeBuffet(Buffet buffet) {
        this.buffet = buffet;
    }

    public void run() {
        try {
            faireSonTour();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void faireSonTour() throws InterruptedException {
        for (Bac bac : buffet.getBacs().values()) {
            this.etat = etatsEmploye.REMPLIT;
            bac.employeArrive();
            this.etat = etatsEmploye.MARCHE;
            try { Thread.sleep(100); } catch(InterruptedException e) {}
        }
    }

}
