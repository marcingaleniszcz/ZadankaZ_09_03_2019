package Człowiek_Zerknij_statyczna;

public class Czlowiek {

    private String imie;

    public Czlowiek() { System.out.println("Tworzę człowieka!"); }
    public Czlowiek(String imie) { this.imie = imie; }

    public static void przywitajSie(){
        System.out.println("Cześć - metoda statyczna.");
    }

    public void ziewnij(){
        System.out.println("AAAAaaaaAAAAAaaaaaaa - metoda instancji.");
    }

    public static void zerknijNa(String cos){
        System.out.println("Zerkam na: " + cos + " - metoda statyczna.");
    }

    public void przygladajSie(String czemus){
        System.out.println("Przygladam się: " + czemus + " - metoda instancji.");
    }

    public String getImie() {
        return this.imie;
    }

    public String toString() {
        return this.imie;
    }
}