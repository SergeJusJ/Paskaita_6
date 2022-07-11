package lt.sergejus.failuTvarkykl;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Failai {
    public static void main (String[] args){
        String pirmDir="C:\\Users\\MARTIN\\IdeaProjects\\7_paskaita\\1test.txt";
        File file = new File(pirmDir);
        try {
            boolean arFilsukrts = file.createNewFile();
            System.out.println(arFilsukrts ?  "failas sukurtas: " : "failas nesukurts ");
        } catch (IOException e) {
            e.printStackTrace();
        }

        String textas = "test tests tsesaasdf asdf";

        Path pirmPath = Paths.get(pirmDir);
        try {
            Files.write(pirmPath, textas.getBytes());
            System.out.println("Textas buvo idetas. ");
        } catch (IOException e) {
            e.printStackTrace();
        }

        String antrDir="C:\\Users\\MARTIN\\IdeaProjects\\7_paskaita\\2test.txt";

        Path antrPath = Paths.get(antrDir);

        try {
            Files.copy(pirmPath,antrPath);
            System.out.println("Text buvo nukopijuotas");
        } catch (IOException e) {
            System.out.println("Klaida kopijuojant faila...");
            throw new RuntimeException(e);
        }

        List<String> textEilutes= new ArrayList<>();
        try {
            textEilutes = Files.readAllLines(antrPath);
            textEilutes.forEach(System.out::println);

        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
          boolean arFilIstrintas = Files.deleteIfExists(antrPath);
            System.out.println(arFilIstrintas ? "failas 2.txt buvo istrintas" : "nebuvo istrintas");

            arFilIstrintas = Files.deleteIfExists(pirmPath);
            System.out.println(arFilIstrintas ? "1 fialas istrints" : "neistrints 1 failas");


        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}
