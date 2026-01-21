package stackandqueue;
import java.util.Stack;

/*
 * StockSpanProblem
 * ----------------
 * Calculate the span of stock prices.
 * Approach: Use a stack to track indices of days with higher prices.
 */

public class StockSpanProblem {

    public static int[] calculateSpan(int[] prices) {
        int n = prices.length;
        int[] span = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && prices[stack.peek()] <= prices[i]) {
                stack.pop();
            }
            span[i] = stack.isEmpty() ? (i + 1) : (i - stack.peek());
            stack.push(i);
        }
        return span;
    }

    public static void main(String[] args) {
        int[] prices = {100, 80, 60, 70, 60, 75, 85};
        int[] span = calculateSpan(prices);

        System.out.print("Stock spans: ");
        for (int s : span) {
            System.out.print(s + " ");
        }
    }
}
