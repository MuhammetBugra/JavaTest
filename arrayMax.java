package Solution;

public class arrayMax {
	public int maximumWealth(int[][] accounts) {
        int add=0,tempAdd=0;
        for(int i=0;i<accounts.length;i++) {
            for(int j=0;j<accounts[i].length;j++) {
                add+=accounts[i][j];
            }
            if(add>=tempAdd) {
                tempAdd=add;
            }
            add=0;
        }
        return tempAdd;
    }
}
