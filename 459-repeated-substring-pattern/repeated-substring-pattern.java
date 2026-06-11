class Solution {
    public boolean repeatedSubstringPattern(String s) {
 int n=s.length();
            for(int j=1;j<=n/2;j++){
                if(n%j==0){
                    String sb=s.substring(0,j);
                    StringBuilder sub= new StringBuilder();
int times=n/j;
for(int i=0;i<times;i++){
    sub.append(sb);
}
if(sub.toString().equals(s)) return true;
 
                }
            }
            return false;
      }  
    }
