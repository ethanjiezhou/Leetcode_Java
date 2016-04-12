public class Solution {
    public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        int left = Math.max(A, E);
        int right = Math.min(C, G);
        int top = Math.min(D, H);
        int bottom = Math.max(F, B);

        int overlap = 0;
        if(right > left && top > bottom)
            overlap = (right - left) * (top - bottom);
        return (C - A)*(D - B) + (G - E)*(H - F) - overlap;
    }
}