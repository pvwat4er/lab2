package com.jcourse.pvwat4er;

import java.util.Stack;
import java.util.Map;

public class Minus implements Command{

    @In(type = RType.STACK)
    private Stack<Double> stack;

    public void execute(Stack<Double> stack, Map<String, Double> define, String[] s){

        if (stack.size() < 2){
            System.out.println("Невозможно выполнить команду! Стек должен содержать более одного элемента!");
        } else {
            stack.push(stack.pop() - stack.pop());
        }

    };

}
