package Solution;

import java.util.ArrayList;
import java.util.List;

public class combinationSum {
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
    	List<List<Integer>> list=new ArrayList<>();
    	List<Integer> subList=new ArrayList<>();
    	int i=0;
    	combination(candidates,target,i,subList,list);
    	return list;
    }
    public static void combination(int[] candidates, int target, int index, List<Integer> sublist, List<List<Integer>> list) {
    	if(index==candidates.length) {
    		if (target==0){
                list.add(new ArrayList<>(sublist));
            }
            return;
    	}
    	if (candidates[index]<=target){
            sublist.add(candidates[index]);
            combination(candidates,target-candidates[index],index,sublist,list);
            sublist.remove(sublist.size()-1);
        }
    	combination(candidates,target,index+1,sublist,list);
    }
    public static void main(String[] args) {
    	List<List<Integer>> list=new ArrayList<>();
    	int []candidates= {2,3,6,7};
		list=combinationSum(candidates,7);
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
	}
}
