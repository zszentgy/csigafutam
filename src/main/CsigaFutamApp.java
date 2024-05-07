package main;

import java.util.Scanner;

public class CsigaFutamApp {
    public static void main(String[] args) throws Exception {
        System.out.println("Csiga verseny");
        
        Verseny verseny = new Verseny();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tippeld meg, melyik csiga nyer (piros, zold, kek):");
        String tipp = scanner.nextLine();
        verseny.indit();
        Csiga nyertes = verseny.nyer();

        System.out.println("A nyertes csiga: " + nyertes.getSzin());
        if (nyertes.getSzin().equals(tipp)) {
            System.out.println("Gratulálunk, eltaláltad!");
        } else {
            System.out.println("Sajnos nem találtad el.");
        }
        scanner.close();
    }
}
