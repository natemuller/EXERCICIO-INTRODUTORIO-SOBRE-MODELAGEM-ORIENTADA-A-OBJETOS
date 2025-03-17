
public class Lampada {

    private boolean estado;
    private boolean queimada;

    public Lampada () {
        this.estado = false;
        this.queimada = false;
    }

    public void Ligar() {
        if (this.queimada) {
            return;
        }
        else if (Math.random() < 0.3) {
            this.queimada = true;
            this.estado = false;
        }
        else {
            this.estado = true;
        }
    }

    public void Desligar() {
        this.estado = false;
    }

    public boolean IsLigada() {
        return this.estado;
    }

    public boolean IsQueimada() {
        return this.queimada;
    } 
}

