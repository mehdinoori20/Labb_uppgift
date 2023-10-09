package com.Mehdi.labb;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);

                System.out.print("Ange namn för spelare 1: ");
                String spelare1 = scanner.next();

                System.out.print("Ange namn för spelare 2: ");
                String spelare2 = scanner.next();

                System.out.print("Ange antal tärningar att kasta per tur: ");
                int antalTarningarPerTur = scanner.nextInt();

                int poangSpelare1 = 0;
                int poangSpelare2 = 0;

                Random random = new Random();

                while (true) {
                    // Spelare 1:s tur
                    System.out.println(spelare1 + "'s tur:");
                    int poangTur1 = kastaTarningar(random, antalTarningarPerTur);
                    poangSpelare1 += poangTur1;
                    System.out.println(spelare1 + " fick " + poangTur1 + " poäng i denna tur. Totalt: " + poangSpelare1 + " poäng.");

                    // Spelare 2:s tur
                    System.out.println(spelare2 + "'s tur:");
                    int poangTur2 = kastaTarningar(random, antalTarningarPerTur);
                    poangSpelare2 += poangTur2;
                    System.out.println(spelare2 + " fick " + poangTur2 + " poäng i denna tur. Totalt: " + poangSpelare2 + " poäng.");

                    // Kontrollera om någon av spelarna har vunnit
                    if (poangSpelare1 >= 100 || poangSpelare2 >= 100) {
                        System.out.println("Slutresultat:");
                        System.out.println(spelare1 + ": " + poangSpelare1 + " poäng");
                        System.out.println(spelare2 + ": " + poangSpelare2 + " poäng");

                        if (poangSpelare1 > poangSpelare2) {
                            System.out.println(spelare1 + " vann!");
                        } else if (poangSpelare2 > poangSpelare1) {
                            System.out.println(spelare2 + " vann!");
                        } else {
                            System.out.println("Det blev oavgjort!");
                        }

                        break;
                    }

                    // Vänta på nästa runda
                    System.out.println("Tryck enter för nästa runda...");
                    scanner.nextLine();
                    scanner.nextLine(); // Vänta på enter
                }
            }

            public static int kastaTarningar(Random random, int antalTarningar) {
                int poang = 0;
                for (int i = 0; i < antalTarningar; i++) {
                    int tarning = random.nextInt(6) + 1; // Slumpmässigt kasta en tärning mellan 1 och 6
                    poang += tarning;
                    System.out.println("Tärning " + (i + 1) + ": " + tarning);
                }
                return poang;
            }
        }





