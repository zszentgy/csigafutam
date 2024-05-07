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
            System.out.println(i + ". kör");
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

    public Csiga nyer() {
        Csiga nyertes = null;
        int maxTav = 0;
        for (Csiga csiga : csigak) {
            if (csiga.getMessze() > maxTav) {
                maxTav = csiga.getMessze();
                nyertes = csiga;
            }
        }
        return nyertes;
    }
}
