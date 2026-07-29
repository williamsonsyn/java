public class array2{
    public static void MaxSubarraySum(int numbers[]){
        //tc = O(n3)
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++){
            for(int j=i;j<numbers.length;j++){
                currSum=0;
                for(int a=i;a<=j;a++){
                    currSum+=numbers[a];
                }
                System.out.println(currSum);
                if(maxSum<currSum){
                    maxSum=currSum;
                }
            }
        }
        System.out.println("max sum= "+maxSum);
    }
    public static void PreMaxSubarraySum(int numbers[]){
        // PREFIX ARRAY is the addition of the current index and previous indexes into the index od prefix array index
        //tc = O(n2)
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;
        int prefix[]= new int[numbers.length];
        prefix[0]=numbers[0];
        for(int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1]+numbers[i];
        }
        for(int i=0;i<numbers.length;i++){
            for(int j=i;j<numbers.length;j++){
                currSum=i==0?prefix[j]:prefix[j]-prefix[i-1];
                if(maxSum<currSum){
                    maxSum=currSum;
                }
            }
        }
    }
    // MAX SUBARRAY SUM IMPORTANT
    public static void KADANS(int numbers[]){
        // here if prefix is negative then it is ignored and considered as 0
        //tc = O(n)
        int ms =  Integer.MIN_VALUE;
        int cs=0;
        for(int i=0 ;i<numbers.length;i++){
            cs = cs +numbers[i];
            if(cs<0){
                cs= 0;
                           
           }
           ms = Math.max(cs,ms);
        }
        System.out.println("our max subarray is : "+ms);

    }
    public static void TrappedRainwater(int numbers[]){
        //trapped water me ek segment uchal uske aju baju ke sabse bade segment le uska min le that will be water level for that column
        //minus height from water level to get trapped water in that segment
        int total=0;
        for(int i = 1;i<numbers.length-1;i++){
            int maxL=Integer.MIN_VALUE;
            int maxR=Integer.MIN_VALUE;
            for(int j=0;j<i;j++){
                if(maxL<numbers[j]){
                    maxL=numbers[j];
                }
            }
            for(int j=i+1;j<numbers.length;j++){
                if(maxR<numbers[j]){
                    maxR=numbers[j];
                }
            }
            int water=Math.min(maxR,maxL);
            if(water>numbers[i]){
                total=total + water-numbers[i];
            }
            

        }
        System.out.println("total trapped water is : "+total);
    }
    public static void buying_selling_stocks(int prices[]){
        int buyPrice=Integer.MAX_VALUE;
        int maxProfit=0;
        for(int i=0;i<prices.length;i++){
            if(buyPrice<prices[i]){
                int profit=prices[i]-buyPrice;
                maxProfit=Math.max(maxProfit,profit);
            }
            else{
                buyPrice=prices[i];
            }
        }
        System.out.println("max profit is: "+maxProfit);
    }
    public static boolean arrayass_1(int string[]){
        for(int i=0;i<string.length;i++){
            for(int j=i+1;j<string.length;j++){
                if(string[i]==string[j]){
                    return true;
            
                }
            }
            
        }
        return false;
    }
    public static int arrayass_2(int nums[]){
         int start=0,end=nums.length-1;
        while(start<=end){
            int mid = (start + end)/2;
           if(nums[start]>nums[mid]){
            end=mid;
           }
           if(nums[start]<nums[mid]){
            start=mid;
           }
            
            
        }
        return -1; 
    }
    public static void main(String[] args){
        int string[]={7,1,5,5,6,4};
        boolean tf= arrayass_1(string);
        System.out.println(tf);
    }
}