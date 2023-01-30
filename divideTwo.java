package Solution;

public class divideTwo {
	public int numberOfSteps(int num) {
        int loop=0;
        while(num!=0) {
            if(num%2==1) {
                num--;
            }
            else {
               num/=2; 
            }
            loop++;
        }
        return loop;
    }
}
