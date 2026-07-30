class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int l=m,r=0;
        while(l<m+n && r<n){
            nums1[l]=nums2[r];
            l++;
            r++;
        }
        Arrays.sort(nums1);
       
    }
}