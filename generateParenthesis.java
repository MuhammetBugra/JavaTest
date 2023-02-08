package Solution;

import java.util.ArrayList;
import java.util.List;

public class generateParenthesis {
	public List<String> generateParenthesis(int n) {
        List<String> list=new ArrayList();
        backtrack(list,new StringBuilder(),0,0,n);
        return list;
    }
    private void backtrack(List<String> list , StringBuilder cur, int open, int close, int max) {
        if (cur.length() == max * 2) {
            list.add(cur.toString());
            return;
        }
        if (open < max) {
            cur.append("(");
            backtrack(list, cur, open+1, close, max);
            cur.deleteCharAt(cur.length() - 1);
        }
        if (close < open) {
            cur.append(")");
            backtrack(list, cur, open, close+1, max);
            cur.deleteCharAt(cur.length() - 1);
        }
    }
}
