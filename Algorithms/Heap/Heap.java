package Heap;
import java.util.*;
public class Heap<T extends Comparable<T>>  {

    private ArrayList<T> list;

    public Heap(){
        list = new ArrayList<>();
    }

    private void swap(int f,int s){
        T temp = list.get(f);
        list.set(f,list.get(s));
        list.set(s,temp);
    }

    private int parent(int ind){
        return (ind - 1 ) / 2 ;
    }

    private int left(int ind){
        return (2 * ind) + 1;
    }

    private int right(int ind){
        return (2 * ind ) + 2 ;
    }

    public void insert(T val){
        list.add(val);
        // upheap or upsift
        upheap(list.size() - 1);

    }

    public void upheap(int ind){
        if (ind == 0) return ;
        int p = parent(ind);
        if(list.get(ind).compareTo(list.get(p)) < 0){
            swap(ind,p);
            upheap(p);
        }
    }

    public T remove(){
        T temp = list.get(0);
        T last = list.remove(list.size() - 1);
        list.set(0,last);
        // downheap or downsift
        downheap(0);
        return temp;
    }

    public void downheap(int ind){
        int min = ind;
        int l = left(ind);
        int r = right(ind);
        if(l < list.size() && list.get(l).compareTo(list.get(min)) < 0){
            min = l;
        }
        if(r < list.size() && list.get(r).compareTo(list.get(min)) < 0){
            min = r;
        }
        if(min != ind){
            swap(min, ind);
            downheap(min);
        }
    }
    
}