package ru.kpfu.itis.DataParser;

import ru.kpfu.itis.Graph.Peak;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class GraphParser implements Parser<ArrayList<Peak>>{
    public static File data;
    private static Scanner sc;
    @Override
    public GraphParser data(InputStream cin) throws FileNotFoundException{
        sc = new Scanner(cin);
        return this;
    }
    public ArrayList<Peak> next(){
        ArrayList<Peak> peaks = new ArrayList<>();
        String str = sc.nextLine();
        String[] strings = str.split(" ");
        String[] peaklist = strings[1].split(";");
        for(String s: peaklist){
            peaks.add(new Peak(s.split(",")));
        }
        return peaks;
    }
    public boolean hasNext(){
        return sc.hasNext();
    }
}
