/**
 * Rychlá kalkulačka pro přepočet novinových řádků na znaky a opačně v redakčním systému Hermes Lidových novin
*/

import java.util.Scanner;

public class Peroutka {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n- PEROUTKOVA KALKULAČKA HERMESU -\n");

        // Vstup uživatele
        System.out.println("Zadejte počet znaků ve Wordu nebo řádků v Hermesu:");
        int a = scanner.nextInt();

        // Výpočty řádků, znaků a otázek s odpověďmi
        int pocetRadku = a / 29;                        // 1 řádek = 29 znaků
        float pocetZnaku = a * 29;
        int pocetRadkuOrientace = a / 35;               // 1 řádek = 35 znaků
        float pocetZnakuOrientace = a * 35;
        float pocetNormostran = pocetZnaku / 1800;      // 1 normostrana = 1800 znaků
        int pocetOtazekZnaku = a / 608;                 // 1 otázka s odpovědí = 608 znaků
        int pocetOtazekRadku = a / 24;                  // 1 otázka s odpovědí = 24 řádků

        // Výpis přepočtených řádků, znaků a otázek s odpověďmi
        System.out.println("\nZNAKY");
        System.out.println("- MS WORD - " + a + " znaků je " + pocetRadku + " řádků v Hermesu");
        System.out.println("- ROZHOVOR - " + a + " znaků je " + pocetOtazekZnaku + " otázek s odpověďmi (+ extra perex na 240 znaků)");

        System.out.println("\nŘÁDKY");
        System.out.println("- HERMES - " + a + " řádků je " + pocetZnaku + " znaků ve Wordu (což je " + pocetNormostran + " normostran)");
        System.out.println("- ROZHOVOR - " + a + " řádků je " + pocetOtazekRadku + " otázek s odpověďmi (+ extra perex na 240 znaků)");

        System.out.println("\nORIENTACE LN");
        System.out.println("- MS WORD - " + a + " znaků je " + pocetRadkuOrientace + " řádků v Hermesu");
        System.out.println("- HERMES - " + a + " řádků je " + pocetZnakuOrientace + " znaků ve Wordu (což je " + pocetNormostran + " normostran)");

        System.out.println("\nDěkuji za použití a někdy se zase stavte!");
    }
}
