package lt.vcs.imone;

public class Main {
    public static void main(String[] args) {

     /*   System.out.println("Hello world!");
        char kintCharA = 'A';
        int kintInt = kintCharA;
        System.out.println(kintInt);
*/
        // byte -> Byte
        // short - > Short
        // int - > Integer
        // char - > Character
        // double - > Double
        // float - > Float

        Imone imone = new Imone("Sauni Komanda",2015);


        Darbuotojas darb1 = new Darbuotojas("Charlie", "Chaplin", "30204180123");
        Darbuotojas darb2 = new Darbuotojas("Rowan", "Atkinson", "50004180123");

        Darbuotojas darbuotojas3 = new Darbuotojas("Marilyn", "Monroe", "490041800123");
        Darbuotojas darbuotojas4 = new Darbuotojas("Jennifer", "Aniston", "605041800123");
        Darbuotojas darbuotojas5 = new Darbuotojas("Halle", "Berry", "470041800123");


        darb1.spausdDarbInfo();
    darb2.spausdDarbInfo();
imone.pridekDarbuotoja(darbuotojas3);
        imone.pridekDarbuotoja(darbuotojas4);
        imone.pridekDarbuotoja(darbuotojas5);




    }
}