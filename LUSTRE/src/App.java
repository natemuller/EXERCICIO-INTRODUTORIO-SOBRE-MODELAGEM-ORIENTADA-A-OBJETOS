public class App {
    public static void main(String[] args) throws Exception {
        Lampada l1 = new Lampada();
        l1.Ligar();
        System.out.println(l1.IsLigada());
        l1.Desligar();
        System.out.println(l1.IsLigada());

        Lustre l2 = new Lustre(5);
        l2.ligar();
        System.out.println(l2.temLampadaQueimada());
        l2.desligar();
        System.out.println(l2.temLampadaQueimada());

        System.out.println(l2.posicoesLampadasQueimadas());
    }
}
