package lt.vcs.imone;

import java.time.LocalDateTime;

public class Darbuotojas {
    private String vardas;
    private String pavarde;
    private String asmensKodas;
    private int amzius;
    private String pareigos;
    private int stazas;

    public Darbuotojas(String vardas, String pavarde, String asmensKodas) {
        this.vardas = vardas;
        this.pavarde = pavarde;
        this.asmensKodas = asmensKodas;
        paskaiciuokAmziu();
        this.amzius = paskaiciuokAmziu();
    }

    public String getVardas() {
        return vardas;
    }

    public String getPavarde() {
        return pavarde;
    }

    public String getAsmensKodas() {
        return asmensKodas;
    }

    public int getAmzius() {
        return amzius;
    }

    public String getPareigos() {
        return pareigos;
    }

    public int getStazas() {
        return stazas;
    }


    public void setPareigos(String pareigos) {
        this.pareigos = pareigos;
    }

    public void setStazas(int stazas) {
        this.stazas = stazas;
    }

    //
    private int paskaiciuokAmziu() {
        // 3/4 840208 -> 20 + 1900 = 1920
        // 5/6 nuo 2000  -> 20 + 2000 = 2020
        char pirmasAkSkaic = asmensKodas.charAt(0);
        int gimimoMetai = Integer.parseInt(asmensKodas.substring(1, 3));
        int einamiMetai = LocalDateTime.now().getYear();

        switch (pirmasAkSkaic) {
            case '3':
            case '4':
                gimimoMetai = gimimoMetai + 1900;
                //System.out.println("+1900");
                break;

            case '5':
            case '6':
                gimimoMetai = gimimoMetai + 2000;
                //System.out.println("+2000");
                break;
            default:
                System.out.println("Ivestas klaidingas Asm. Kodas.");
        }
        return einamiMetai - gimimoMetai;

    }

    public void spausdDarbInfo() {
        System.out.println(String.format("Darbuotojas [vardas: %s, pavarde %s, a/k: %s, amzius: %s, pareigos %s, patirtis: %s]",
                this.vardas,
                this.pavarde,
                this.asmensKodas,
                this.amzius,
                this.pareigos,
                this.stazas));

    }


}
