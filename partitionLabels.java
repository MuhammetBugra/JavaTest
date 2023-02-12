package Solution;

import java.util.ArrayList;
import java.util.List;

public class partitionLabels {
	public static List<Integer> partitionLabels(String s) {
		List<Integer> list=new ArrayList<>();
        int number=0, temp, max=s.length(), i;
        char c;
        while(number<max) {
        	c=s.charAt(number);
        	temp=number;
            number=s.lastIndexOf(c)+1;
            for(i=temp;i<number;i++) {
            	c=s.charAt(i);
            	if(s.lastIndexOf(c)+1 >= number) {
            		number=s.lastIndexOf(c)+1;
            	}
            }
            list.add(number-temp);
        }
        return list;
    }
	public static void main(String[] args) {
		String s="eaaaabaaec";
		List<Integer> list=new ArrayList<>();
		list=partitionLabels(s);
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
	}
}