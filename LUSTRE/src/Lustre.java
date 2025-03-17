public class Lustre {

    private boolean ligado;

    private Lampada[] lampadas;

    public Lustre(int qtdLampadas) {
        int qtdLampadasACriar = (qtdLampadas > 0) ? qtdLampadas : 1;
        this.lampadas = new Lampada[qtdLampadasACriar];

        for (int i = 0; i < qtdLampadasACriar; i++) {
            this.lampadas[i] = new Lampada();
        }
        this.ligado = false;
    }
    
    public void ligar() {
        for (int i = 0; i < this.lampadas.length; i++) {
            this.lampadas[i].Ligar();
        }
        this.ligado = true;
    }

    public void desligar() {
        for (int i = 0; i < this.lampadas.length; i++) {
            this.lampadas[i].Desligar();
        }
        this.ligado = false;
    
    }

    public boolean temLampadaQueimada() {
        for (int i = 0; i < this.lampadas.length; i++) {
            if (this.lampadas[i].IsQueimada()) {
                return true;
            }
        }
        return false;
    }
}
