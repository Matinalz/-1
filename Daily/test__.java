package Daily;

import java.util.*;

/**
 * @program:IntelliJ IDEA
 * @Description
 * @Author:Matinal
 * @Date:2021-07-21 14:40
 */
public class test__ {
    public boolean isValid(String s) {
        if(s.length()%2 != 0){
            return false;
        }
        Stack<Character> stack = new Stack();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '['){
                stack.push(s.charAt(i));
            }else{

                if(!stack.empty()){
                    if(isSame(stack.peek(),s.charAt(i)) == false){
                        return false;
                    }else{
                        stack.pop();
                    }
                }else{
                    return false;
                }
            }
        }
        return stack.empty();
    }
    public boolean isSame(char a,char b){
        return (a == '(' && b == ')' || a == '[' && b == ']' ||a == '{' && b == '}');
    }

    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        List<List<Integer>> List = new ArrayList<>();

        for(;k > 0;k--){
            int tmp = grid[grid.length-1][grid[0].length-1];
            for (int i = 0; i < grid.length; i++) {
                for (int j = 0; j < grid[0].length; j++) {
                    int value = grid[i][j];
                    grid[i][j] = tmp;
                    tmp = value;
                }
            }
        }

        for (int i = 0; i < grid.length; i++) {
            List<Integer> listmin = new ArrayList<>();

            for (int j = 0; j < grid[0].length; j++) {
                listmin.add(grid[i][j]);
            }
            List.add(listmin);
        }

        return List;
    }
    public static void main1(String[] args) {
        List<List<Integer>> List = new ArrayList<>();

        int[][] d = {{1,2,3},{23,4,3},{5,4,2}};
        for (int i = 0; i < d.length; i++) {
            List<Integer> listmin = new ArrayList<>();
            for (int j = 0; j < d[0].length; j++) {
                final boolean add = listmin.add(d[i][j]);
            }
            List.add(listmin);
        }

    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10_0000; i++) {
            list.add(random.nextInt(10000));
        }
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            if(map.containsKey(list.get(i))){
                int tmp = 1;
                map.put(list.get(i),tmp+1);
            }
        }
        for ( Map.Entry<Integer,Integer> d: map.entrySet()) {
            System.out.println(d.getValue());
        }
    }
}
