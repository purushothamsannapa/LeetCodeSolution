import java.util.*;
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] nums=new int[m+n];
        for(int i=0;i<m;i++)
        {
            nums[i]=nums1[i];
        }
        int k=m;
        for(int j=0;j<n;j++)
        {
            nums[k]=nums2[j];
            k++;
        }
        Arrays.sort(nums);
        for(int i = 0; i < m + n; i++) {
            nums1[i] = nums[i];
        }
    }
}