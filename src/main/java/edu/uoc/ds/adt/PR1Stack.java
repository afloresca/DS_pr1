package edu.uoc.ds.adt;


import edu.uoc.ds.adt.sequential.Stack;
import edu.uoc.ds.adt.sequential.StackArrayImpl;
import edu.uoc.ds.adt.util.Point;

public class PR1Stack {
    public final int CAPACITY = 10;

    private Stack<Point> stack;

    public PR1Stack() {
        newStack();
    }

    public PR1Stack(int i){
        newStack(i);
    }

    public void newStack() {
        stack = new StackArrayImpl<Point>(CAPACITY);
    }

    public void newStack(int i) {
        stack = new StackArrayImpl<Point>(i);
    }

    public Stack<Point> getStack() {
        return this.stack;
    }

    public void push(Point c) {
        this.stack.push(c);
    }

    public Point pop() {
        return this.stack.pop();
    }
}
