/*
Kalkulačka pro výpočet řádků nebo znaků v novinovém systému Hermes Lidových novin
*/

import java.util.Scanner;

public class Peroutka {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n- PEROUTKOVA KALKULAČKA HERMESU -\n");

        System.out.println("Zadejte počet znaků ve Wordu nebo řádků v Hermesu:");
        int a = scanner.nextInt();

        int pocetRadku = a / 29;                        // 1 řádek = 29 znaků
        float pocetZnaku = a * 29;
        float pocetNormostran = pocetZnaku / 1800;      // 1 normostrana = 1800 znaků
        int pocetOtazekZnaku = a / 608;                 // 1 otázka s odpovědí = 608 znaků
        int pocetOtazekRadku = a / 24;                  // 1 otázka s odpovědí = 24 řádků

        System.out.println("\nMS WORD - " + a + " znaků je " + pocetRadku + " řádků v Hermesu");
        System.out.println("HERMES - " + a + " řádků je " + pocetZnaku + " znaků ve Wordu (což je " + pocetNormostran + " normostran)");

        System.out.println("\nROZHOVOR - " + a + " znaků je " + pocetOtazekZnaku + " otázek s odpověďmi (+ extra perex na 240 znaků)");
        System.out.println("ROZHOVOR - " + a + " řádků je " + pocetOtazekRadku + " otázek s odpověďmi (+ extra perex na 240 znaků)");

        System.out.println("\nDíky za použití a někdy se zase stavte :)");
    }
}
