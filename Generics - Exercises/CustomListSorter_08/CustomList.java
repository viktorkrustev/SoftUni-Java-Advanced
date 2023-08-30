package GenericsExercises.CustomListSorter_08;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CustomList <T extends Comparable<T>> {
    private List<T> list;

    public CustomList(){
        this.list = new ArrayList<>();
    }

    public void add(T element){
        this.list.add(element);
    }
    public void remove(int index){
        this.list.remove(index);
    }

    public boolean contains(T element){
        if (!this.list.contains(element)){
            return false;
        }
        return true;
    }
    public void swap(int index1, int index2){
        Collections.swap(list, index1, index2);
    }

    public int countGreaterThan(T element){
        return (int) list.stream().filter(el -> el.compareTo(element) > 0).count();
    }

    public T getMax(){
        if (list.isEmpty()){
            return null;
        }
        return Collections.max(list);
    }

    public T getMin(){
        if (list.isEmpty()){
            return null;
        }
        return Collections.min(list);
    }
    public void print(){
        for (T el:this.list){
            System.out.println(el);
        }
    }
    public void sort(){
        Collections.sort(list);
    }
}
