import java.util.Stack;
import java.util.Map;

public class Define extends Command{

    public void execute(Stack<Double> stack, Map<String, Double> define, String[] s){
        define.put(s[1], Double.valueOf(s[2]));
        System.out.println(1);
    }
}
