package ru.kpfu.itis.Graph;

public class Edge{
    private Peak first;
    private Peak second;

    public Edge(){

    }

    public Edge(Peak first){
        this.first = first;
    }

    public Edge(Peak first, Peak second){
        this(first);
        this.second = second;
    }

    public Peak getFirst(){
        return first;
    }

    public Peak getSecond(){
        return second;
    }

    public void setFirst(Peak first){
        this.first = first;
    }

    public void setSecond(Peak second){
        this.second = second;
    }
}
