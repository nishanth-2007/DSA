class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i=m;i<m+n;i++){
            nums1[i]=nums2[i-m];
        }

         if(m==0) {
            for(int i=0;i<nums2.length;i++) nums1[i]=nums2[i];
        }

        Arrays.sort(nums1);
       
    }
}