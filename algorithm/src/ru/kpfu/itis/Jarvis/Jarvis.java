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
        FileWriter fw = new FileWriter("ConvexHull.csv", true);
//        fw.write("Amount of peaks," + "Iterations," + "Time in nanoseconds" + "\n");
//        fw.flush();
        while(gp.hasNext()){
            ArrayList<Peak> peaks = gp.next();
            fw.write(ConvexHull.solve((peaks)));
            fw.flush();
        }
    }
}
