import java.util.*;
class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
         
           List<Integer>ans=new ArrayList<>();
           int carry=0;
           int i=num.length-1;
           while(i>=0 || carry>0 || k>0){
            int digit=(i>=0)?num[i]:0;
            int kdigit=k%10;
            k/=10;
            int sum=digit+kdigit+carry;
            ans.add(sum%10);
            carry=sum/10;
            i--;
           }
        
        Collections.reverse(ans);
        return ans;

    }
}