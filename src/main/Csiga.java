package main;

public class Csiga {
    private String szin;
    private int messze; // a csiga által összesen megtett távolság
    private int sebesseg; // szorzó a gyorsításhoz

    public Csiga(String szin) {
        this.szin = szin;
        this.messze = 0;
        this.sebesseg = 1; // alap sebesség, nincs gyorsítás
    }

    public void lep() {
        int lepes = (int) (Math.random() * 4); // 0-3 közötti lépések
        messze += lepes * sebesseg;
    }

    public void kapGyorsitot() {
        sebesseg = 2; // gyorsítás, dupla lépés
    }

    public int getMessze() {
        return messze;
    }

    public String getSzin() {
        return szin;
    }

    public int getSebesseg() {
        return sebesseg;
    }

}
