package pl.saltsoft;

import java.io.*;

public class LatajaceSamochodyNaGaz {

    void readLinesFromFile(String filePath) throws Exception {
        File file = new File(filePath);
        FileReader r = new FileReader(file);
        BufferedReader br = new BufferedReader(r);
        String st = br.readLine();
        while (st != null) {
            System.out.println(st);
            st = br.readLine();

        }
    }

    public void writeFile(String filePath) throws Exception {
        File file = new File(filePath);
        FileWriter w = new FileWriter(file);
        BufferedWriter br = new BufferedWriter(w);

        br.write("Hello World");
        br.newLine();
        br.flush();
        br.close();

    }
}


