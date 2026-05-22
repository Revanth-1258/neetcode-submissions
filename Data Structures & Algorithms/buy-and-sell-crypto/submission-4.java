class Solution {
    public int maxProfit(int[] prices) {
        int min =prices[0];//intilased already 10 as start min 
        int profit=0;//first finding the profit with and redcalring min
        for(int i=1;i<prices.length;i++){//for loop starts with 1 again why comparing number again it will becomes zero i can made it i=1;
               profit=Math.max(profit,prices[i]-min);
               min=Math.min(min,prices[i]);//get profit by finding .max storing it
               //if(prices[i]<min){//starts with 1 and less 10 
               //min=prices[i];//redeclare 1 as min
               }//now go to top profit=
            //1-10=-9,check min 1<10? min=1,next updating profit again and again.
        return profit;
    }
        //5-1=4,6-1=5,7-1=6 update profit.
//}
    }

