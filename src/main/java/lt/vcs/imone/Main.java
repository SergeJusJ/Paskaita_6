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

        Darbuotojas darb3 = new Darbuotojas("Marilyn", "Monroe", "490041800123");
        Darbuotojas darb4 = new Darbuotojas("Jennifer", "Aniston", "605041800123");
        Darbuotojas darb5 = new Darbuotojas("Halle", "Berry", "470041800123");


        darb1.spausdDarbInfo();
    darb2.spausdDarbInfo();


        imone.pridekDarbuotoja(darb1, Pareigos.DIREKTR, 80);
        imone.pridekDarbuotoja(darb2, Pareigos.PAVADUOTOJAS, 2 );
        imone.pridekDarbuotoja(darb3,Pareigos.SEKRETORE, 20);
        imone.pridekDarbuotoja(darb4, Pareigos.VADYBININKAS, 15);
        imone.pridekDarbuotoja(darb5, Pareigos.VADYBININKAS, 20);

imone.getDarbuotojai().forEach(drb -> drb.spausdDarbInfo());
        System.out.println("-----------------------------------------------");
imone.filtDrb(8);
//spausdink("valio");
//spausdink(0.66);



        }
//    public static <T> void spausdink (T kintamas){
//        System.out.println(kintamas.getClass().getTypeName()+"/"+ kintamas);
//    }
}