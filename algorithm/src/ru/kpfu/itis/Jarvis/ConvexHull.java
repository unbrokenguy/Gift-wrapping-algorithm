package ru.kpfu.itis.Jarvis;

import ru.kpfu.itis.Graph.Peak;

import java.util.ArrayList;

public class ConvexHull{
    public static ArrayList<Peak> Hull = new ArrayList<>();
    private static boolean CCW(Peak p, Peak q, Peak r)
    {
        int val = (q.y() - p.y()) * (r.x() - q.x()) - (q.x() - p.x()) * (r.y() - q.y()  );
        return val < 0;
    }
    public static String solve(ArrayList<Peak> peaks)
    {
        Hull.clear();
        int it = 0;
        int n = peaks.size();
        Long startPoint = System.nanoTime();

        int leftMost = 0;
        for (int i = 1; i < n; i++){
            it++;
            if(peaks.get(i).x() < peaks.get(leftMost).x())
                leftMost = i;
        }
        int p = leftMost, q;

        Hull.add(peaks.get(p));

        do
        {
            it++;
            q = (p + 1) % n;
            for (int i = 0; i < n; i++)
                if (CCW(peaks.get(p), peaks.get(i), peaks.get(q)))
                    q = i;

            Hull.add(peaks.get(q));
            p = q;
        } while (p != leftMost);
        Long endPoint = System.nanoTime();
        Long tempTime = endPoint - startPoint;
        return peaks.size() + ","
                + it + ","
                +(tempTime) + "\n";
    }
}
