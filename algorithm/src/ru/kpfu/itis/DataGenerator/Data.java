package ru.kpfu.itis.DataGenerator;


import java.io.FileWriter;
import java.io.IOException;

public class Data{
    private static Generator g;

    public static void main(Generator generator){
        g = generator;
    }

    public static void generate() throws IOException{
        FileWriter fw = new FileWriter("Documents/Data.txt");
        for(int i = 0; i < 101; i++){
            String toWrite = g.generate() + "\n";
            fw.write(toWrite);
            fw.flush();
        }
        fw.flush();
        fw.close();
    }
}
