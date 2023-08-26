package GenericsLab.JarOfT_01;

import java.util.ArrayDeque;

public class Jar <T>{
    private ArrayDeque<T> deque;

    public Jar(ArrayDeque<T> deque) {
        this.deque = new ArrayDeque<>();
    }

    public void add(T element){
        this.deque.push(element);
    }
    public T remove(T element){
        return this.deque.pop();
    }
}
