public class Solution {
    public List<Integer> getRow(int rowIndex) {
        if(rowIndex < 0)
            return new ArrayList<Integer>();

        List<Integer> currentLevel = new ArrayList<Integer>();
        currentLevel.add(1); //rowIndex == 0

        for(int i = 1; i <= rowIndex; i++) {
            List<Integer> prevLevel = new ArrayList<Integer>(currentLevel);
            currentLevel.clear();
            for(int j = 0; j <= i; j++) {
                if(j == 0 || j == i) {
                    currentLevel.add(1);
                } else {
                    currentLevel.add(prevLevel.get(j - 1) + prevLevel.get(j));
                }
            }
        }

        return currentLevel;
    }
}