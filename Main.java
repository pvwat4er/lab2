

import java.util.Map;
import java.util.Stack;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Scanner scanner;
        String s;
        Stack<Double> stack = new Stack();

        scanner = new Scanner(System.in);

        Map<String, Double> varMap = new HashMap();

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