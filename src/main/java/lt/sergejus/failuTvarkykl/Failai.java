package lt.sergejus.failuTvarkykl;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;

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

    }


}
