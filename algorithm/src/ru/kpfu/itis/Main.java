package ru.kpfu.itis;

import ru.kpfu.itis.DataGenerator.Data;
import ru.kpfu.itis.DataGenerator.Generator;
import ru.kpfu.itis.DataGenerator.GraphGenerator;
import ru.kpfu.itis.Graph.Peak;
import ru.kpfu.itis.Jarvis.ConvexHull;
import ru.kpfu.itis.Jarvis.Jarvis;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

public class Main{
    public static void main(String[] args) throws IOException{
//        ArrayList<Peak> p = new ArrayList<>();
//        p.add(new Peak(0,0));
//        p.add(new Peak(10,10));
//        p.add(new Peak(10,0));
//        p.add(new Peak(5,0));
//        p.add(new Peak(0,5));
//        p.add(new Peak(0,10));
//        p.add(new Peak(0,4));
//        p.add(new Peak(0,6));
//        System.out.println(ConvexHull.solve(p));
        //        Generator g = new GraphGenerator();
//                Data.main(new GraphGenerator());
//        Long startPoint = System.nanoTime();
//        for(int i = 0; i < 100; i++){ //OutOfMemoryError: Java heap space
//            Data.generate();
            Jarvis.main(new FileInputStream("Documents/BigData.txt"));
//        }
//        System.out.print((System.nanoTime() - startPoint)/1000000000.0);
    }
}
