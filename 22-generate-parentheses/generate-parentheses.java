class Solution {
    public List<String> generateParenthesis(int n) {
        List<String>res=new ArrayList<>();
        dfs(0,0,"",n,res);
        return res;

    }
    void dfs(int openp,int closep,String str,int n,List<String> res){
        if(openp==closep && openp+closep==n*2){
            res.add(str);
            return;
        }
        if(openp<n){
            dfs(openp+1,closep,str+"(",n,res);
        }
        if(closep<openp){
            dfs(openp,closep+1,str+")",n,res);
        }
    }
}