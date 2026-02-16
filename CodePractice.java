// 1) string reverse
import java.util.*;

class Main {
    public static void main(String[] args) {
        String str = "rohan";
        // StringBuilder strb = new StringBuilder(str);
        // StringBuffer strb = new StringBuffer(str);
        // System.out.println(strb.reverse());
        System.out.println(reverseString(str));
    }
    
    public static String reverseString(String str){
        
        String[] strArr = str.split("");
        int left = 0;
        int right = strArr.length - 1;
        
        for(int i=0; i < strArr.length -1;i++){
            String temp = strArr[i];
            strArr[left] = strArr[right];
            strArr[right] = temp;
            left++;right--;
        }
        
        return String.join("", strArr);
    }
}
