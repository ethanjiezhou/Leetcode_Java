public class Solution {
    public String getHint(String secret, String guess) {
        int bull = 0;
        int cow = 0;
        int length = secret.length();
        int[] countS = new int[10];
        int[] countG = new int[10];
        
        for(int i = 0; i < length; i++) {
            int S = secret.charAt(i) - '0';
            int G = guess.charAt(i) - '0';
            
            if(S == G) {
                bull++;
                continue;
            }
            
            if(countG[S] == 0) {
                countS[S]++;
            } else {
                cow++;
                countG[S]--;
            }
            
            if(countS[G] == 0) {
                countG[G]++;
            } else {
                cow++;
                countS[G]--;
            }
        }
        
        return bull + "A" + cow + "B";
    }
}