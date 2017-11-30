import java.util.Stack;
import java.util.Map;

public abstract class Command {

    public abstract void execute(Stack<Double> stack, Map<String, Double> define);
}
