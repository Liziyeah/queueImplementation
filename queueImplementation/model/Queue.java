package model;
import java.util.ArrayList;

public class  Queue <T> implements Interface <T> {

    private ArrayList<T> elements;
    private int head;
    private int tail;

    @Override
    public void array() {
        elements = new ArrayList<T>();
    }

    @Override
    public void add(T e) {

    }

    @Override
    public void poll(){}

    @Override
    public T peek() {

    }
}
