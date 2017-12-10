package com.jcourse.pvwat4er;


import java.util.Map;
import java.util.Stack;

public class Note implements Command{

    @In(type = RType.STACK)
    private Stack<Double> stack;

    public void execute(Stack<Double> stack, Map<String, Double> define, String[] s) {
        System.out.println("comment");
    }
}