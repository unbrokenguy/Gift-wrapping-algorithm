package ru.kpfu.itis.Jarvis;

import ru.kpfu.itis.Graph.Peak;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ConvexHull{
    private static Set<Peak> Hull = new HashSet<>();

    private static String ansToString(){
        StringBuffer sb = new StringBuffer();
        sb.append("[");
        for(Peak peak: Hull){
            sb.append("{" + peak.toString() + "}" + ",");
        }
        sb.append("]\n");
        return sb.toString();
    }

    private static int CCW(Peak p, Peak q, Peak r){ //Counter ClockWise
        return (q.y() - p.y()) * (r.x() - q.x()) - (q.x() - p.x()) * (r.y() - q.y());

    }

    //    public static ArrayList<Peak> solve(ArrayList<Peak> peaks){
    static ArrayList<String> solve(ArrayList<Peak> peaks){
        Hull.clear();
        int it = 0;
        int amountOfPeaks = peaks.size();
        Long startPoint = System.nanoTime();

        int leftMost = 0;
        for(int i = 1; i < amountOfPeaks; i++){
            it++;
            if(peaks.get(i).x() < peaks.get(leftMost).x()){
                leftMost = i;
            }
        }
        int currentPeak = leftMost, potentialPeak;

        Hull.add(peaks.get(currentPeak));

        do{
            it++;
            potentialPeak = (currentPeak + 1) % amountOfPeaks;
            double mostCCW = 0;
            for(int i = 0; i < amountOfPeaks; i++){
                it++;
                if(CCW(peaks.get(currentPeak), peaks.get(i), peaks.get(potentialPeak)) > mostCCW){ //Находим вершину находящуююся дальше всех против часовой стрелки
                    potentialPeak = i;
                    mostCCW = CCW(peaks.get(currentPeak), peaks.get(i), peaks.get(potentialPeak));
                }
            }
            Hull.add(peaks.get(potentialPeak));
            for(Peak p: peaks){ // добавляю вершины лежащие на одной прямой
                it++;
                if(CCW(peaks.get(currentPeak), p, peaks.get(potentialPeak)) == mostCCW){
                    Hull.add(p);
                }
            }
            currentPeak = potentialPeak;
        } while(currentPeak != leftMost);
        long tempTime = System.nanoTime() - startPoint;
        ArrayList<String> ans = new ArrayList<>();
        ans.add(peaks.size() + "," + it + "," + (tempTime) + "\n");
        ans.add(ansToString());
        //        return sb.toString(); }
        return ans;
    }
}