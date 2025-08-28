class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] res=new int[nums1.length+nums2.length];
        int sum=0;
        for(int i=0;i<nums1.length;i++){
res[i]=nums1[i];
        }
        for(int j=0;j<nums2.length;j++){
            res[j+nums1.length]=nums2[j];
        }
        Arrays.sort(res);
         int total=res.length;
         if(total%2==0){
            return (res[total/2-1]+res[total/2])/2.0;
         }else{
            return res[total/2];
         }
    }
}