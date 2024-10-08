class Solution {
    public int largestRectangleArea(int[] heights) {
        int max_area = 0;
        Stack<Integer> st = new Stack<>();
        int n = heights.length;
        for (int i=0; i<=n; ++i) {
            int currHeight = (i == n) ? 0 : heights[i];
            // prev - smaller - element
            while (!st.isEmpty() && currHeight < heights[st.peek()]) {
                int height = heights[st.pop()];
                int width = st.isEmpty() ? i : i - st.peek() - 1;
                max_area = Math.max(max_area, height * width);
            }
            st.push(i);
        }
        return max_area;
    }
}