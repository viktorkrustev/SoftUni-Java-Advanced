package GenericsExercises.GenericSwapMethodStrings_03;

import java.util.ArrayList;
import java.util.List;

public class Box <T> {
    private List<T> list;

    public Box() {
        this.list = new ArrayList<>();
    }
    public void add(T el){
        this.list.add(el);
    }
    public void swap (int firstIndex, int secondIndex){
        T firstElement = list.get(firstIndex);
        T secondElement = list.get(secondIndex);

        this.list.set(firstIndex, secondElement);
        this.list.set(secondIndex, firstElement);
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
