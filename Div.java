import java.util.Stack;
import java.util.Map;

public class Div extends Command{

    private Stack<Double> stack;

    public void execute(Stack<Double> stack, Map<String, Double> define, String[] s){

        double x = stack.pop();
        double y = stack.pop();
        double z = x/y;
        stack.push(z);

    };

}
