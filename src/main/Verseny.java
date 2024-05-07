package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Verseny {
    private List<Csiga> csigak = new ArrayList<>();
    private int korokSzama = 5;

    //csiga példányok létrehozása
    public Verseny() {
        csigak.add(new Csiga("piros"));
        csigak.add(new Csiga("zold"));
        csigak.add(new Csiga("kek"));
    }

    public void indit() {
        for (int i = 0; i < korokSzama; i++) {
            System.out.println((i+1) + ". kör");
            kor();
            System.out.println("");
        }
    }

    private void kor() {
        Random rnd = new Random();
        if (rnd.nextDouble() < 0.2) { // 20% esély egy csiga gyorsítására
            int index = rnd.nextInt(csigak.size());
            csigak.get(index).kapGyorsitot();
        }

        for (Csiga csiga : csigak) {
            csiga.lep();
        }
    }

    public List<Csiga> nyer() {
        List<Csiga> nyertesek = new ArrayList<>();
        int maxTav = 0;
        for (Csiga csiga : csigak) {
            if (csiga.getMessze() > maxTav) {
                maxTav = csiga.getMessze();
                nyertesek.clear();
                nyertesek.add(csiga);
            } else if (csiga.getMessze() == maxTav) {
                nyertesek.add(csiga);
            }
        }
     
        // Kiíratjuk a nyertes csigák színeit
        if (nyertesek.size() > 1) {
            System.out.println("A verseny döntetlen! Nyertes csigák:");
        } else {
        System.out.println("A verseny nyertese:");
        }
        for (Csiga nyertes : nyertesek) {
            System.out.println(nyertes.getSzin() + " csiga");
        }
        System.out.println("");
        return nyertesek;
    }
}
