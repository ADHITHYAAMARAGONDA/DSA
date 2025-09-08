class Solution {
    public String countAndSay(int n) {
        if(n==1){
            return "1";
        }
        String prev=countAndSay(n-1);
        StringBuilder sb=new StringBuilder();
        int count=1;
        for(int j=1;j<prev.length();j++){
            if(prev.charAt(j)==prev.charAt(j-1)){
                count++;
            }else{
                sb.append(count).append(prev.charAt(j-1));
                count=1;
            }
        }
        sb.append(count).append(prev.charAt(prev.length()-1));
        return sb.toString();
    }
}