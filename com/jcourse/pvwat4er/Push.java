package com.jcourse.pvwat4er;

import java.util.Stack;
import java.util.Map;

public class Push implements Command{

    @In(type = RType.STACK)
    private Stack<Double> stack;

    public void execute(Stack<Double> stack, Map<String, Double> define, String[] s){
        stack.push(Double.valueOf(
                define.get(s[1])));

    };
}
