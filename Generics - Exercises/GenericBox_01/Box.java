package GenericsExercises.GenericBox_01;

import java.util.ArrayList;
import java.util.List;

public class Box <T> {
    List<T> list;

    public Box(List<T> list) {
        this.list = new ArrayList<>();
    }
    public void add(T el){
        this.list.add(el);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (T element: list){
            sb.append(element.getClass().getName()).append(": ").append(element).append(System.lineSeparator());
        }
        return sb.toString();
    }
}
