class Solution {
    public int longestConsecutive(int[] nums) {
        int res=0;// for counting the number which is max and taking it.
        Set<Integer> store =new HashSet<>();
        for(int num: nums){
            store.add(num);//for loop 1 is used for unique and making an array and [1,1,1,1,,2,2,3,3]=[1,2,3]
        }
        for(int num:nums){// iterate the loop and getting to find the consectuive number
            int streak =0,curr=num;//curr is tempary and inceres no not distrubing num nos
            while(store.contains(curr)){//if there
                streak++;//streak increases to 1 and calculating the no of consective number how many
                curr++;//and incr the curr and check again while loop exist or not if exist and again streak moves to +1 and curr +1
            }//if curr is true and again increased happens and again enter while loop
            res=Math.max(res,streak);
        }
        return res;
    }
}
