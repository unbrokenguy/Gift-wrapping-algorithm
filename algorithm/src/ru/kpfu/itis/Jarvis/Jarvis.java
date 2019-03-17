package ru.kpfu.itis.Jarvis;

import ru.kpfu.itis.DataParser.GraphParser;
import ru.kpfu.itis.Graph.Peak;

import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

public class Jarvis{

    public static void main(InputStream cin) throws IOException{
        GraphParser gp = new GraphParser().data(cin);
        FileWriter fw = new FileWriter("Documents/ConvexHull.csv", true);
        FileWriter fw1 = new FileWriter("Documents/ConvexHull.txt", true);
//        fw.write("Amount of peaks," + "Iterations," + "Time in nanoseconds" + "\n");
//        fw.flush();
        while(gp.hasNext()){
            ArrayList<Peak> peaks = gp.next();
            ArrayList<String> toWrite = ConvexHull.solve((peaks));
            fw.write(toWrite.get(0));
            fw1.write(toWrite.get(1));
            fw1.flush();
            fw.flush();
        }
        fw1.close();
        fw.close();
    }
}
