class Solution {
    public int maxDepth(String s) {
        int count=-1;
    int sum=0;
    for(int i=0;i<s.length();i++){
        char a=s.charAt(i);
        if(a=='('){
            sum++;
        }else if(a==')'){
            sum--;
        }
            count= Math.max(count,sum);


    }
    return  count;
    }
}