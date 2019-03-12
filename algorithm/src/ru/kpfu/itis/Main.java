package ru.kpfu.itis;

import ru.kpfu.itis.DataGenerator.Data;
import ru.kpfu.itis.DataGenerator.Generator;
import ru.kpfu.itis.DataGenerator.GraphGenerator;
import ru.kpfu.itis.DataParser.GraphParser;
import ru.kpfu.itis.Jarvis.Jarvis;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringBufferInputStream;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws IOException{
        Generator g = new GraphGenerator();
        Data.main(new GraphGenerator());
        for(int i = 0; i < 10000; i++){ //OutOfMemoryError: Java heap space
            Data.generate();
            Jarvis.main(new FileInputStream("Data.txt"));
        }
    }
}
