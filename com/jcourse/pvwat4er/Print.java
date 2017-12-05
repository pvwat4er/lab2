package com.jcourse.pvwat4er;

import java.util.Stack;
import java.util.Map;

public class Print extends Command{

    private Stack<Double> stack;

    public void execute(Stack<Double> stack, Map<String, Double> define, String[] s){

        System.out.println(stack.peek());

    };

}
