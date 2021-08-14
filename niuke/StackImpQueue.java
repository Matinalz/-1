package niuke;
import sun.reflect.generics.tree.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
/**
 * @program:IntelliJ IDEA
 * @Description
 * @Author:Matinal
 * @Date:2021-07-11 09:11
 */
class TreeNode{
    public int value;
    public TreeNode lift=null;
    public TreeNode right=null;
    public TreeNode(int value){
        this.value = value;
    }
}
public class StackImpQueue {
    public ArrayList<ArrayList<Integer>> levelOrder (TreeNode root) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        if(root == null){
            return res;
        }
        Queue<TreeNode> se = new LinkedList<TreeNode>();
        se.offer(root);

        while (!se.isEmpty()){
            ArrayList<Integer> arrayList = new ArrayList<>();
            int index = se.size();
            for (int i = 0; i < index; i++) {
                if(se.peek().lift != null){
                    se.add(se.peek().lift);
                }
                if(se.peek().right != null){
                    se.add(se.peek().right);
                }
                arrayList.add(se.poll().value);
            }
            res.add(arrayList);
        }
        return res;
    }
}
