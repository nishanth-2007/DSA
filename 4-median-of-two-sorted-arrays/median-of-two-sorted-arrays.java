class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        ArrayList<Integer> al=new ArrayList<>();
        int i=0,j=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]<nums2[j]) {
                al.add(nums1[i]);
                i++;
            }
            else{
                al.add(nums2[j]);
                j++;
            }
        }
        while(i<nums1.length){
            al.add(nums1[i]);
            i++;
        }
        while(j<nums2.length){
            al.add(nums2[j]);
            j++;
        }
        int m1,m2;
        int len=al.size();
        if(al.size()%2==0){
            return (al.get(len/2) + al.get(len/2-1))/2.0;
        }
        else{
            return (double) al.get(len/2);
        }
    }
}