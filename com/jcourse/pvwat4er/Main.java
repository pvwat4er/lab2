package com.jcourse.pvwat4er;

import java.io.*;
import java.util.Map;
import java.util.Stack;
import java.util.Scanner;
import java.util.HashMap;
import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner;
        String s;
        Stack<Double> stack = new Stack();

        if (args.length > 0) {
            scanner = new Scanner(new FileInputStream(args[0]));
        } else {
            scanner = new Scanner(System.in);
        }

        //scanner = new Scanner(System.in);

        Map<String, Double> varMap = new HashMap<>();

       // CommandsFactory singleton = CommandsFactory.getInstance();


        while ( scanner.hasNextLine() ) {

            s = scanner.nextLine();

            String[] str = s.split(" ");

            CommandsFactory singleton = CommandsFactory.getInstance();
            Command kom = singleton.getCommandByName(str[0]);

            if (kom != null){
                try{
                    kom.execute(stack, varMap, str);
                }catch (NumberFormatException e){
                    System.out.println("Введена неизвестная команда");
                }
            }
            else{
                System.out.println("Команда не определена");
            }
        }
    }
}