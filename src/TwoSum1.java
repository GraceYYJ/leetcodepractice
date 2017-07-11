/**
 * Created by Administrator on 2017/7/11.
 */
public class TwoSum1 {
    public static void main(String args[]){
        TwoSum1 test=new TwoSum1();
        int nums[]={3,3};
        int result[]=test.twoSum(nums,6);
        for(int i=0;i<result.length;i++){
            System.out.print(result[i]+" ");
        }
    }
        public int[] twoSum(int[] nums, int target) {
            int result[]=new int[2];
            outer:for(int i=0;i<nums.length;i++){
                inner:for(int j=i+1;j<nums.length;j++){
                    if(nums[i]+nums[j]==target){
                        result[0]=i;
                        result[1]=j;
                        break outer;
                    }
                }
            }
            return result;
        }
}
