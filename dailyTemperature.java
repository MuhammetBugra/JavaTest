package Solution;

public class dailyTemperature {
    public static int[] dailyTemperatures(int[] temperatures) {
    	int []arr=new int[temperatures.length];
    	int i,j;
    	for(i=0;i<temperatures.length;i++) {
    		for(j=i+1;j<temperatures.length;j++) {
    		    if(temperatures[j]>temperatures[i]) {
    		    	arr[i]=j-i;
    		    	break;
    		    }
    		}
    	}
    	return arr;
    }
    public static void main(String[] args) {
		int []temperatures= {73,74,75,71,69,72,76,73};
		int []arr=dailyTemperatures(temperatures);
		for(int i=0;i<temperatures.length;i++) {
			System.out.println(arr[i]);
		}
	}
}
