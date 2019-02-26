package ru.kpfu.itis.Graph;

public class Peak{
    private int x;
    private int y;

    public Peak(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString(){
        return "Peak{" + "x=" + x + ", y=" + y + '}';
    }

    public int x(){
        return x;
    }

    public int y(){
        return y;
    }

    public boolean equals(Peak peak){
        return this.x() == peak.x() && this.y() == peak.y();
    }
}
