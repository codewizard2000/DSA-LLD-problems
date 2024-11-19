package Heap;

public class Pair implements Comparable<Pair>{
    public int first;
    public int second;

    public Pair(int first, int second){
        this.first=first;
        this.second=second;
    }

    @Override
    public int compareTo(Pair o) {
        return Integer.compare(this.first,o.first);// methods allow to compare
    }
}
