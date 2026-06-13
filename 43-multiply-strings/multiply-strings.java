class Solution {
    public String multiply(String num1, String num2) {
        int n=num1.length();
        int m=num2.length();
        if(num1.equals("0") || num2.equals("0")){
            return "0";
        }
        int[] result=new int[n+m];
          for(int i=n-1;i>=0;i--){
            for(int j=m-1;j>=0;j--){
                int d1=num1.charAt(i)-'0';
                int d2=num2.charAt(j)-'0';
                int prod=d1*d2;
                int p1=i+j;
                int p2=i+j+1;
                int sum=prod+result[p2];
                result[p2]=sum%10;
                result[p1]+=sum/10;

                
            }
         }
         StringBuilder sb=new StringBuilder();
         for(int digits:result){
         if(!(sb.length()==0 && digits==0)){
            sb.append(digits);

         }
         }
                 
               
                
                return sb.toString();
            }
        }
         
    