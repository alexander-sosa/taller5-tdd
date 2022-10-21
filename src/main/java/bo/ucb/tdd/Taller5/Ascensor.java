package bo.ucb.tdd.Taller5;

public class Ascensor {

    // variables
    private int piso;
    private boolean enCamino;
    private int destino;
    private boolean lleno;

    // constructor
    public Ascensor(){
        piso = 1;
    }

    // getters
    public int getPiso(){
        return piso;
    }

    public boolean estaEnCamino(){
        return enCamino;
    }

    public int getDestino(){
        return destino;
    }

    public boolean estaLleno(){
        return lleno;
    }

    // methods
    public void recibirLlamada(int pisoDestino){
        enCamino = true;
        destino = pisoDestino;
    }

    public void recogerPersona(int nuevoDestino){
        enCamino = true;
        lleno = true;

        // El ascensor llega a su destino, por lo que este se vuelve su piso actual. Ahora su
        // destino es el de la persona.
        piso = destino;
        destino = nuevoDestino;
    }

    public void dejarPersona(){
        enCamino = false;
        lleno = false;
        piso = destino;
    }
}
