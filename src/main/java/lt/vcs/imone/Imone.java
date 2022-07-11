package lt.vcs.imone;

import java.util.ArrayList;
import java.util.List;

public class Imone {
    String pavadinimas;
    int ikurimMetai;
    //kolekcija List, Set, Maps ir t.t
    List<Darbuotojas> darbuotojai;

    public Imone(String pavadinimas, int ikurimMetai) {
        this.pavadinimas = pavadinimas;
        this.ikurimMetai = ikurimMetai;
        this.darbuotojai = new ArrayList<>();
    }



    public String getPavadinimas() {
        return pavadinimas;
    }

    public int getIkurimMetai() {
        return ikurimMetai;
    }

    public List<Darbuotojas> getDarbuotojai() {
        return darbuotojai;
    }


    public void pridekDarbuotoja(Darbuotojas worker, String pareigos, int stazas) {
        this.darbuotojai.add(worker);
        darbuotojai.size();
        worker.setPareigos(pareigos);
        worker.setStazas(stazas);
    }

    public void filtDrb(int stazas) {
        System.out.println("filrDarbSarasas su stazu > : " + stazas);
        darbuotojai.forEach(darb -> {if (darb.getStazas() >= stazas) darb.spausdDarbInfo();} );
    }



}
