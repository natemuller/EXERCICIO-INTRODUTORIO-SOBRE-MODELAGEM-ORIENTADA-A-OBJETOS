public class App {
    public static void main(String[] args) throws Exception {
        Lampada l1 = new Lampada();
        l1.Ligar();
        System.out.println(l1.IsLigada());
        l1.Desligar();
        System.out.println(l1.IsLigada());
    }
}
