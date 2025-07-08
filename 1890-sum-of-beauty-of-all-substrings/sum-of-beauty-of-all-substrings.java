class Solution {
    public int beautySum(String s) {
        int result=0;
        for(int i=0;i<s.length();i++){
            int maxfreq=0;
            int[] freq=new int[26];
            for(int j=i;j<s.length();j++){
                int charIndex=s.charAt(j)-'a';
                freq[charIndex]++;
                maxfreq=Math.max(maxfreq,freq[charIndex]);
                int minfreq=Integer.MAX_VALUE;
                for(int k=0;k<26;k++){
                    if(freq[k]>0){
                        minfreq=Math.min(minfreq,freq[k]);
                    }
                }
                result+= (maxfreq-minfreq);
            }
        }
        return result;
    }
}