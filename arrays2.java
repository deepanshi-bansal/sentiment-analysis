//printing max subarray sum (method-1) by brute force
/*public class arrays2 {
    public static void maxsubarraysum(int numbers[]){
        int currsum=0;
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++){ //outer loop for start
            int start=i;
            for(int j=i;j<numbers.length;j++){ //inner loop for end
                int end=j;
                currsum=0;
                for(int k=start;k<=end;k++){ 
                    //subarray sum
                    currsum+=numbers[k];
                }
                System.out.println(currsum);
                if(maxsum<currsum){
                    maxsum=currsum;
                }
            }
        }
        System.out.println("Max subarray sum = "+maxsum);
    }
    public static void main(String args[]){
        int numbers[]={6,-1,3};
        maxsubarraysum(numbers);
    }
} */
//printing max subarray sum (method-2) by prefix sum
/*public class arrays2{
    public static void maxsubarraysum(int numbers[]){
        int currsum=0;
        int maxsum=Integer.MIN_VALUE;
        int prefix[]=new int[numbers.length];
        prefix[0]=numbers[0];
        //calculate prefix array
        for(int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1]+numbers[i]; 
        }
        for(int i=0;i<numbers.length;i++){ //outer loop for start
            int start=i;
            for(int j=i;j<numbers.length;j++){ //inner loop for end
                int end=j;
                currsum= start==0 ? prefix[end] : prefix[end]-prefix[start-1];
                System.out.println(currsum);
                if(maxsum<currsum){
                    maxsum=currsum;
                }
            }
        }
        System.out.println("Max subarray sum = "+maxsum);

    }
    public static void main(String args[]){
        int numbers[]={6,-1,3};
        maxsubarraysum(numbers);
    }
} */
//priting max subarray sum(method-3) by kadane's algorithm
/*public class arrays2{
    public static void kadanes(int numbers[]){
        int maxsum=Integer.MIN_VALUE;
        int currsum=0;
        for(int i=0;i<numbers.length;i++){
            currsum=currsum+numbers[i];
            if(currsum<0){
                currsum=0;
            }
            System.out.println(currsum);
            maxsum=Math.max(maxsum,currsum); //prints max. of maxsum or currsum or we can use--> if(maxsum<currsum){ maxsum=currsum; }
            }
        System.out.println("Max subarray sum = "+maxsum);
    }
    public static void main(String args[]){
        int numbers[]={-2,-3,4,-1,-2,1,5,-3};
        kadanes(numbers);
    }
} */
//Trapping rainwater-->very very important
/*public class arrays2{
    public static int trappedRainwater(int height[]){
        int n=height.length;
        //calculate left max boundary-array
        int leftmax[]=new int[n];
        leftmax[0]=height[0];
        for(int i=1;i<n;i++){
            leftmax[i]=Math.max(height[i],leftmax[i-1]);
        }
        //calculate right max boundary-array
        int rightmax[]=new int[n];
        rightmax[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){
            rightmax[i]=Math.max(height[i],rightmax[i+1]);
        }
        int trappedwater=0;
        //loop
        for(int i=0;i<n;i++){
            //waterlevel=min(left max bound,right max bound)
            int waterlevel=Math.min(leftmax[i],rightmax[i]);
            //trapped water=waterlevel-height[i]
            trappedwater+=waterlevel-height[i];
        }
        return trappedwater;
    }
    public static void main(String args[]){
        int height[]={4,2,0,6,3,2,5};
        System.out.println(trappedRainwater(height));
    }
} */
//best time to buy and sell stocks
public class arrays2{
    public static int buyAndsellstocks(int prices[]){
        int buyprice=Integer.MAX_VALUE;
        int maxprofit=0;
        for(int i=0;i<prices.length;i++){
            if(buyprice<prices[i]){ //profit
               int profit=prices[i]-buyprice; //today's profit
               maxprofit=Math.max(maxprofit,profit); //global profit
            }else{
                buyprice=prices[i];
            }
        }
        return maxprofit;
    }
    public static void main(String args[]){
        int prices[]={7,1,5,3,6,4};
        System.out.println(buyAndsellstocks(prices)); //5
    }
}

