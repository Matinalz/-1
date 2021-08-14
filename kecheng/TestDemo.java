package kecheng;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.*;

/**
 * @program:IntelliJ IDEA
 * @Description
 * @Author:Matinal
 * @Date:2021-07-19 08:57
 */
class TreeNode{
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }
}
public class TestDemo {

    //非递归实现前序遍历
    public void preTra(TreeNode root){
        Stack<TreeNode> s = new Stack<>();
        s.push(root);
        while (!s.empty()){
            TreeNode p = s.pop();
            System.out.print(p.val+" ");
            if(p.right != null){
                s.push(p.right);

            }
            if(p.left != null){
                s.push(p.left);
            }
        }
        System.out.println();
    }

    //非递归实现中序遍历
    public void midTra(TreeNode root){
        Stack<TreeNode> s = new Stack<>();
        TreeNode node = root;
        while (node != null || !s.empty()){
            while(node != null){
                s.push(node);
                node = node.left;
            }
            node = s.pop();
            System.out.print(node.val+" ");
            if(node.right != null){
                node = node.right;
            }else{
                node = null;
            }
        }
        System.out.println();
    }

    //非递归实现后序遍历
    public void houTra(TreeNode root){
        Stack<TreeNode> s = new Stack<>();
        TreeNode node = root;
        TreeNode pre = null;
        while (node != null || !s.empty()){
            while(node != null){
                s.push(node);
                node = node.left;
            }
            if(!s.empty()){
                node = s.peek();
                if(node.right == null || node.right == pre){
                    node = s.pop();
                    System.out.print(node.val+" ");
                    pre = node;
                    node = null;
                }else{
                    node = node.right;
                }
            }
        }
        System.out.println();
    }

    //是否为子树
    public boolean isSymmetricChild(TreeNode leftTree,TreeNode rightTree) {
        if(leftTree == null || rightTree == null) return false;
        if(leftTree == null && rightTree == null) return true;
        if(leftTree.val == rightTree.val){
            return true;
        }
        return isSymmetricChild(leftTree.left,rightTree.right)&&isSymmetricChild(leftTree.right,rightTree.left);

    }

    // 层序遍历
    public void levelOrderTraversal(TreeNode root) {
        Queue<TreeNode> s = new LinkedList<>();
        if(root == null){
            return;
        }
        s.add(root);
        while (!s.isEmpty()){
            TreeNode node = s.poll();
            System.out.print(node.val+" ");
            if(node.left != null){
                s.add(node.left);
            }
            if(node.right != null){
                s.add(node.right);
            }
        }
        System.out.println();
    }
    // 判断一棵树是不是完全二叉树
    boolean isCompleteTree(TreeNode root) {
            Queue<TreeNode> s = new LinkedList<>();
            if(root == null){
                return true;
            }
            s.offer(root);
            while (!s.isEmpty()){
                TreeNode node = s.poll();
                if(node != null){
                    s.offer(node.left);
                    s.offer(node.right);
                }else{
                    break;
                }
            }
            while (!s.isEmpty()){
                TreeNode node =s.peek();
                if(node == null){
                    s.poll();
                }else{
                    return false;
                }
            }
            return true;
    }
    //判断q是否等于p
    public boolean sameTree(TreeNode p,TreeNode q){
        if(p == null && q == null) {
            return true;
        }
        if(p == null || q == null){
            return false;
        }
        return p.val == q.val && sameTree(p.left,q.left) && sameTree(p.right,q.right);
    }
    //q是否为p的子树
    public boolean sonTree(TreeNode p,TreeNode q){
        if(p == null){
            return false;
        }
        if(sameTree(p,q)){
            return true;
        }
        return sonTree(p.left,q) || sonTree(p.right,q);
    }

    //求二叉树的最大宽度
    public int maxWidthOfBinaryTree(TreeNode root) {
        int max = 0;
        if(root == null) {
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            List<Integer> list = new ArrayList<>();
            while (size != 0){
                TreeNode top = queue.poll();
                list.add(top.val);
                if(top.left != null) {
                    queue.offer(top.left);
                }
                if(top.right != null) {
                    queue.offer(top.right);
                }
                size--;
            }
            max = Math.max(list.size(),0);
        }
     return max;
    }

    //求节点的个数
    public int nodeInt(TreeNode root){
        Stack<TreeNode> s = new Stack<>();
        s.push(root);
        int sum = 0;
        while (!s.empty()){
            TreeNode p = s.pop();
            ++sum;
            if(p.right != null){
                s.push(p.right);

            }
            if(p.left != null){
                s.push(p.left);
            }
        }
        return sum;
    }

    //叶子节点个数
    public int laefNodeInt(TreeNode root){
        if(root == null) {
            return 0;
        }
        if(root.left ==null && root.right == null){
            return 1;
        }
        return laefNodeInt(root.left)+laefNodeInt(root.right);
    }
    //求第K层的节点个数
    public int nodeIntOfBinaryTree(TreeNode root,int k) {
        int tmp = 0;
        if(root == null) {
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            List<Integer> list = new ArrayList<>();
            while (size != 0){
                TreeNode top = queue.poll();
                list.add(top.val);
                if(top.left != null) {
                    queue.offer(top.left);
                }
                if(top.right != null) {
                    queue.offer(top.right);
                }
                size--;
            }
            tmp = tmp+1;
            if(tmp == k){
                tmp = list.size();
                break;
            }
        }
        return tmp;
    }

    //查找节点
    public boolean nodeSearch(TreeNode root,int val){
        if(root == null){
            return false;
        }
        if(root.val == val){
            return true;
        }
        return nodeSearch(root.left,val) || nodeSearch(root.right,val);
    }

    //二叉树是否对称
    public boolean symmetricBinaryTree(TreeNode root){
        if(root == null){
            return false;
        }
        if(root.left == null || root.right == null){
            return false;
        }
        if(root.left.val == root.right.val){
            return true;
        }
        return symmetricBinaryTree(root.left) && symmetricBinaryTree(root.right);
    }

    //层序遍历
    public void cengTra(TreeNode root){
        if(root == null){
            return;
        }
        Queue<TreeNode> queue =new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            TreeNode node = queue.poll();
            System.out.print(node.val+" ");
            if (node.left != null){
                queue.offer(node.left);
            }
            if (node.right != null){
                queue.offer(node.right);
            }
        }
        System.out.println();
    }
    //是否完全二叉树
    public boolean completeBinaryTree(TreeNode root){
        if(root == null) {
            return false;
        }
        if(root.left == null && root.right == null){
            return true;
        }
        if(root.right == null && root.left != null){
            return true;
        }
        return completeBinaryTree(root.left) && completeBinaryTree(root.right);
    }
    public static void main(String[] args) {
        TreeNode A = new TreeNode(1);
        TreeNode B = new TreeNode(2);
        TreeNode C = new TreeNode(3);
        TreeNode D = new TreeNode(4);
        TreeNode E = new TreeNode(5);
        TreeNode F = new TreeNode(6);
        TreeNode G = new TreeNode(7);
        A.left = B;
        A.right = C;
        B.left = D;
        B.right = E;
        C.left = F;
        C.right = G;
        TreeNode Q = new TreeNode(2);
        TreeNode W = new TreeNode(2);
        TreeNode R = new TreeNode(4);
        Q.left = W;
        Q.right = R;
        TestDemo test = new TestDemo();
        System.out.println("先序遍历");
        test.preTra(A);
        System.out.println("中序遍历");
        test.midTra(A);
        System.out.println("后序遍历");
        test.houTra(A);
        System.out.println("节点个数：" + test.nodeInt(A));
        System.out.println("叶子节点的个数："+test.laefNodeInt(A));
        System.out.println("第3层的节点个数："+test.nodeIntOfBinaryTree(A,3));
        System.out.println("这ke树中是否存在这个节点："+test.nodeSearch(A, 8));
        System.out.println("=====================================================");
        System.out.println("用来判断的树");
        test.preTra(Q);
        System.out.println("二叉树是否为对称二叉树："+test.symmetricBinaryTree(Q));
        test.cengTra(A);
        test.cengTra(Q);
        System.out.println("二叉树是否为完全二叉树："+test.completeBinaryTree(A));
    }
}
