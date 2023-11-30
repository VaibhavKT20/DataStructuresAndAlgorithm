package Stack;
import java.util.Stack;
public class MaxHistogramArea {
        public static int maxHistogramArea(int[] heights) {
            int maxArea = 0;
            Stack<Integer> stack = new Stack<>();
            int i = 0;

            while (i < heights.length) {
                if (stack.isEmpty() || heights[i] >= heights[stack.peek()]) {
                    stack.push(i);
                    i++;
                } else {
                    int top = stack.pop();
                    int width = stack.isEmpty() ? i : i - stack.peek() - 1;
                    maxArea = Math.max(maxArea, heights[top] * width);
                }
            }

            while (!stack.isEmpty()) {
                int top = stack.pop();
                int width = stack.isEmpty() ? i : i - stack.peek() - 1;
                maxArea = Math.max(maxArea, heights[top] * width);
            }

            return maxArea;
        }

        public static void main(String[] args) {
            int[] histogram = {2, 1, 5, 6, 2, 3};
            System.out.println("Maximum area under the histogram: " + maxHistogramArea(histogram));
        }
    }


