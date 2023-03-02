import java.util.Stack;

public class DonutScriptEvaluator extends DonutScriptBaseListener {
    private Stack<Integer> stack = new Stack<>();

    @Override
    public void exitNumber(SimpleLangParser.NumberContext ctx) {
        stack.push(Integer.parseInt(ctx.getText()));
    }

    @Override
    public void exitExpression(SimpleLangParser.ExpressionContext ctx) {
        int right = stack.pop();
        int left = stack.pop();
        String operator = ctx.getChild(1).getText();

        switch (operator) {
            case "+":
                stack.push(left + right);
                break;
            case "-":
                stack.push(left - right);
                break;
            case "*":
                stack.push(left * right);
                break;
            case "/":
                stack.push(left / right);
                break;
            default:
                throw new IllegalArgumentException("Unknown operator: " + operator);
        }
    }

    public int getResult() {
        return stack.pop();
    }
}
