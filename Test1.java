给定一个无序的整数数组，找到其中最长上升子序列的长度。
class Solution {
    public int lengthOfLIS(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        int[] res=new int[nums.length];
        int maxlen=0;
        for(int num:nums){
            int l=0;
            int r=maxlen;
            while(l<r){
                int mid=(l+r)>>>1;
                if(res[mid]<num){
                    l=mid+1;
                }else{
                    r=mid;
                }
            }
            res[l]=num;
            if(l==maxlen){
                maxlen++;
            }
        }
        return maxlen;
    }
}

//
class Solution {
    public int singleNumber(int[] nums) {
        int res=nums[0];
        for(int i=1;i<nums.length;i++){
            res^=nums[i];
        }
        return res;
    }
}

//求众数
class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length>>>1];
    }
}

class Solution {
    public int majorityElement(int[] nums) {
        int res=nums[0];
        int count=1;
       for(int i=1;i<nums.length;i++){
           if(nums[i]==res){
               count++;
           }else{
               count--;
               if(count==0){
                   res=nums[i+1];
               }
           }
       }
        return res;
    }
}

//颠倒二进制位
public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int a=0;
        for(int i=0;i<32;i++){
           int b=1&(n>>i);
            a+=b<<(31-i);
        }
        return a;
    }
}

public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int a=0;
        for(int i=0;i<32;i++){
           a<<=1;
            a+=n&1;
            n>>=1;
        }
        return a;
    }
}

//
class Solution {
    public boolean isPowerOfTwo(int n) {
       return n>0&&(n&(n-1))==0;
    }
}
class Solution {
    public boolean isPowerOfFour(int num) {
        if(num<1){
            return false;
        }
        while(num%4==0){
            num/=4;
        }
        return num==1;
    }
}
class Solution {
    public int missingNumber(int[] nums) {
       int num=nums.length;
        for(int i=0;i<nums.length;i++){
            num^=nums[i];
            num^=i;
        }
        return num;
    }
}
class Solution {
    public int getSum(int a, int b) {
        int sum=a^b;
        int carry=(a&b)<<1;
        if(carry!=0){
            return getSum(sum,carry);
        }
        return sum;
    }
}
class Solution {
    public char findTheDifference(String s, String t) {
       int res=0;
        for(int i=0;i<s.length();i++){
            res^=s.charAt(i);
        } for(int i=0;i<t.length();i++){
            res^=t.charAt(i);
        }
        return (char)res;
    }
}
class Solution {
    public String toHex(int num) {
        if(num==0){
            return "0";
        }
        char[] chars={'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        String s="";
        while(num!=0){
            s=chars[num&15]+s;
            num>>>=4;
        }
        return s;
    }
}
class Solution {
    public int hammingDistance(int x, int y) {
        int a=x^y;
        int count=0;
        while(a!=0){
            count++;
            a&=(a-1);
        }
        return count;
    }
}
class Solution {
    public int findComplement(int num) {
        int sum=0;
        int i=0;
        while(num!=0){
            sum+=(1^(1&num))<<i;
            i++;
            num>>=1;
        }
        return sum;
    }
}
class Solution {
    public boolean hasAlternatingBits(int n) {
        n=n^(n>>>1);
        return (n&(n+1))==0;
    }
}