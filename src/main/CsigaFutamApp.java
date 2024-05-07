package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CsigaFutamApp {
    public static void main(String[] args) throws Exception {
        System.out.println("Csiga verseny");
        
        Verseny verseny = new Verseny();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tippeld meg, melyik csiga nyer (piros, zold, kek):");
        String tipp = scanner.nextLine();
        verseny.indit();
        List<Csiga> nyertesek = new ArrayList<>();
        nyertesek = verseny.nyer();
        boolean nyert = false;

        for (Csiga nyertes : nyertesek) {
            if (nyertes.getSzin().equals(tipp)) {
                nyert = true;
            }
        }

        if (nyert) {
            System.out.println("Gratulálunk, eltaláltad!");
        } else {
            System.out.println("Sajnos rosszul tippeltél.");
        }

        scanner.close();
    }
}
