package Solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class groupAnagram {
    public static List<List<String>> groupAnagrams(String[] strs) {
    	List<List<String>> list=new ArrayList<>();
    	List<String> subList=new ArrayList<>();
    	List<Integer> number=new ArrayList<>();
    	int i,j;
    	char []strList; 
    	char []strList1;
    	for(i=0;i<strs.length;i++) {
    		strList=strs[i].toCharArray();
    		Arrays.sort(strList);
    		if(!number.contains(i))
		        subList.add(strs[i]);
    		for(j=i+1;j<strs.length;j++) {
    			strList1=strs[j].toCharArray();
    			Arrays.sort(strList1);
    			if(Arrays.equals(strList, strList1) && !number.contains(j)) {
    		        subList.add(strs[j]);
    		        number.add(j);
    			}
    		}
    		if(!number.contains(i))
    		    list.add(new ArrayList<>(subList));
    		subList.removeAll(subList);
    	}
    	return list;
    }
    public static void main(String[] args) {
    	List<List<String>> list=new ArrayList<>();
    	String []strs= {"eat","tea","tan","ate","nat","bat"};
		list=groupAnagrams(strs);
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
	}
}
