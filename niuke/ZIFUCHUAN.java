package niuke;
import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * @program:IntelliJ IDEA
 * @Description
 * @Author:Matinal
 * @Date:2021-06-19 10:16
 */
public class ZIFUCHUAN {
    public String longestCommonPrefix (String[] strs) {
        // write code here
        if (strs == null || strs.length == 0)
            return "";
        int begin = 1;
        int end = strs[0].length();
        int maxcomidx = -1;
        while(begin <= end) {
            int mid = (begin + end) >> 1;
            if(isCommonPrefix(strs, mid)) {
                begin = mid + 1;
                maxcomidx = mid;
            }else {
                end = mid - 1;
            }
        }
        if(maxcomidx == -1) {
            return "";
        }else {
            return strs[0].substring(0, maxcomidx);
        }
    }
    public static boolean isCommonPrefix(String[] strs, int idx) {
        String prefix = strs[0].substring(0, idx);
        for(int i = 1; i < strs.length; i++) {
            if(!strs[i].startsWith(prefix)) {
                return false;
            }
        }
        return true;
    }
}
