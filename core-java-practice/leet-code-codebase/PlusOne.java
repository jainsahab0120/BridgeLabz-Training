import java.util.*;

public class PlusOne
{   
    // https://leetcode.com/problems/plus-one/

    public int[] plusOne(int[] digits) {
        int n = digits.length;
        int carry = 0;
        if ((digits[n - 1] + 1 )<= 9) {
            digits[n - 1] += 1;
        } else {
            carry = 1;
            
            for (int i = digits.length - 1 ; i >= 0; i--) {
                if(carry != 0){
                    digits[i]+=1;
                    
                }
                if(digits[i]>9){
                    digits[i] = digits[i]% 10;
                    carry = 1;

                }else {
                    carry = 0;
                    break;
                }
            }
        }
        if(carry == 0){
            return digits;
        }
        int[] ans = new int[digits.length+1];
        ans[0] = 1;
    
        return ans;

    }
}
