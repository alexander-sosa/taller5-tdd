package bo.ucb.tdd.Taller5;

public class Persona {
    private int piso;
    private int destino;

    public Persona(){
        piso = (int) (Math.random()*(3-1+1)+1);
    }

    public int getPiso(){
        return piso;
    }

    public void setDestino(){
        do {
            System.out.println("Setting destino...");
            destino = (int) (Math.random() * (3 - 1 + 1) + 1);
        } while(destino == piso);
    }

    public int getDestino() {
        return destino;
    }
}
