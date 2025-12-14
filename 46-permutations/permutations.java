class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        boolean[] usedelement=new boolean[nums.length];
        backtrack(nums,new ArrayList<>(),usedelement,res);
        return res;
    }
    void backtrack(int[]nums,List<Integer>path,boolean[]usedelement,List<List<Integer>>res){
        if(path.size()==nums.length){
            res.add(new ArrayList<>(path));
            return;

        }
        for(int i=0;i<nums.length;i++){
        if(usedelement[i]) continue;
        path.add(nums[i]);
        usedelement[i]=true;
         
         backtrack(nums,path,usedelement,res);

         path.remove(path.size()-1);
         usedelement[i]=false;
    }
}
}