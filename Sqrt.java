import java.util.Stack;
import java.util.Map;

public class Sqrt extends Command {

    private Stack<Double> stack;

    public void execute(Stack<Double> stack, Map<String, Double> define){

        double x = stack.pop();
        double z;
        z = Math.sqrt(x);
        stack.push(z);


    };
}
