package ru.kpfu.itis.Graph;

import java.util.Objects;

public class Peak{
    private int x;
    private int y;
    public Peak(String ... s){
        this.x = Integer.valueOf(s[0]);
        this.y = Integer.valueOf(s[1]);
    }
    public Peak(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object o){
        if(this == o)
            return true;
        if(o == null || getClass() != o.getClass())
            return false;
        Peak peak = (Peak)o;
        return x == peak.x && y == peak.y;
    }

    @Override
    public int hashCode(){
        return Objects.hash(x, y);
    }
    @Override
    public String toString(){
        return x + "," + y;
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
