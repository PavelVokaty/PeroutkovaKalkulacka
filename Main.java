/**
 * Rychlá kalkulačka pro přepočet novinových řádků na znaky a opačně v redakčním systému Hermes pro různé layouty rubrik Lidových novin
*/

import java.util.Scanner;

public class Peroutka {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n- PEROUTKOVA KALKULAČKA HERMESU -\n");

        // Vstup uživatele
        System.out.println("Zadejte počet znaků ve Wordu nebo řádků v Hermesu:");
        String vstup = scanner.nextLine();
        int a = Integer.parseInt(vstup);

        // Výpočty řádků, znaků a otázek s odpověďmi
        int pocetRadku = a / 29;
        float pocetZnaku = a * 29;
        int pocetRadkuOrientace = a / 35;
        float pocetZnakuOrientace = a * 35;
        float pocetNormostran = pocetZnaku / 1800;
        int pocetOtazekZnaku = a / 608;
        int pocetOtazekRadku = a / 24;

        // Výpis přepočtených znaků a otázek s odpověďmi pro domácí, ekononomickou, zahraniční a kulturní rubriku
        System.out.println("\nZNAKY");
        System.out.println("- MS WORD - " + a + " znaků je " + pocetRadku + " řádků v Hermesu");
        System.out.println("- ROZHOVOR - " + a + " znaků je " + pocetOtazekZnaku + " otázek s odpověďmi (+ extra perex na 240 znaků)");

        // Výpis přepočtených řádků a otázek s odpověďmi pro domácí, ekononomickou, zahraniční a kulturní rubriku
        System.out.println("\nŘÁDKY");
        System.out.println("- HERMES - " + a + " řádků je " + pocetZnaku + " znaků ve Wordu (což je " + pocetNormostran + " normostran)");
        System.out.println("- ROZHOVOR - " + a + " řádků je " + pocetOtazekRadku + " otázek s odpověďmi (+ extra perex na 240 znaků)");

        // Výpis přepočtených řádků, znaků a otázek pro sobotní kritickou přílohu Orientace LN
        System.out.println("\nORIENTACE LN");
        System.out.println("- MS WORD - " + a + " znaků je " + pocetRadkuOrientace + " řádků v Hermesu");
        System.out.println("- HERMES - " + a + " řádků je " + pocetZnakuOrientace + " znaků ve Wordu (což je " + pocetNormostran + " normostran)");

        System.out.println("\nDěkuji za použití a někdy se zase stavte!");
    }
}
