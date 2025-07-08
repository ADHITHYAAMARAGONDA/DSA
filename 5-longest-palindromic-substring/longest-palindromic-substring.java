class Solution {
    public String longestPalindrome(String s) {
        int n=s.length();
        if(n==0){
            return "";
        }
        String result=s.substring(0,1);
        for(int i=0;i<n;i++){
            result=expand(s,i,i,result);
            result=expand(s,i,i+1,result);
        }
        return result;

    }
    public String expand(String s,int left,int right,String best){
        int n=s.length();
        while(left>=0 && right<n && s.charAt(left)==s.charAt(right)){
            left--;
            right++;
        }
        String newPalindrome=s.substring(left+1,right);
        if(newPalindrome.length()>best.length()){
            return newPalindrome;
        }else{
            return best;
        }
    }
}