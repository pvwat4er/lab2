package com.jcourse.pvwat4er;

import java.io.*;
import java.util.Map;
import java.util.Stack;
import java.util.Scanner;
import java.util.HashMap;
import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner;
        String s;
        Stack<Double> stack = new Stack();

      //  if (args.length > 0) {
      //      scanner = new Scanner(new FileInputStream(args[0]));
      //  } else {
      //      scanner = new Scanner(System.in);
      //  }

        scanner = new Scanner(System.in);

        Map<String, Double> varMap = new HashMap<>();

        CommandsFactory singleton = CommandsFactory.ourInstance();

        int x = 1;
        while (x < 100) {

            s = scanner.nextLine();

            String[] str = s.split(" ");

            if (str[0] == "DEFINE") {
                Command concreetCommand = new Define();
                concreetCommand.execute(stack, varMap, str);
            } else if (str[0] == "PRINT") {
                Command concreetCommand = new Print();
                concreetCommand.execute(stack, varMap, str);
            } else if (str[0] == "POP") {
                Command concreetCommand = new Pop();
                concreetCommand.execute(stack, varMap, str);
            } else if (str[0] == "PUSH") {
                Command concreetCommand = new Push();
                concreetCommand.execute(stack, varMap, str);
            } else if (str[0] == "SQRT") {
                Command concreetCommand = new Sqrt();
                concreetCommand.execute(stack, varMap, str);
            }
        }








        // HashMap<String, Double>

        //  HashMap<String, Double> = s.split;

        //System.out.println(s);

        // Define.execute(s);


    }

}