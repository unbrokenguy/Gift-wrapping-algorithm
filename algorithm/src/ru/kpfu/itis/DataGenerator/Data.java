package ru.kpfu.itis.DataGenerator;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Data{
    public static Generator g;
    public static void main(Generator generator){
           g = generator;
    }
    public static void generate() throws IOException{
        FileWriter fw = new FileWriter("Data.txt");
        fw.write((String)g.generate(1000) + "\n");
        fw.flush();
        fw.write((String)g.generate(1000) + "\n");
        fw.flush();
        fw.write((String)g.generate(1000) + "\n");
        fw.flush();
        fw.write((String)g.generate(1000) + "\n");
        fw.flush();
        for(int i = 0; i < 101; i++){
            fw.write((String)g.generate()   + "\n");
            fw.flush();
        }
        fw.flush();
        fw.close();
    }
}
