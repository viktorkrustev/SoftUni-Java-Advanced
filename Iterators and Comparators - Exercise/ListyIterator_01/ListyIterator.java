package IteratorsAndComparatorsExercise.ListyIterator_01;

import java.util.List;

public class ListyIterator {
    private List<String> list;
    private int index;

    public ListyIterator(List<String> list) {
        this.list = list;
        if (this.list.isEmpty()){
            this.index = -1;
        } else {
            this.index = 0;
        }
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public boolean Move(){
        return this.index++<this.list.size()-1;
    }
    public boolean HasNext(){
        if (this.index < this.list.size()-1){
            return true;
        }
        return false;
    }
    public void Print(){
        if (getList().isEmpty()){
            System.out.println("Invalid Operation!");
        } else {
            System.out.println(getList().get(this.index));
        }
    }
}
