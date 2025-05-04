class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int insertPointer = m+n-1;
        int pointerOne = m-1;
        int pointerTwo = n-1;

        while (pointerOne >= 0 && pointerTwo >=0) {
            if (nums1[pointerOne]>nums2[pointerTwo]){
                nums1[insertPointer] = nums1[pointerOne];
                insertPointer--;
                pointerOne--;
            } else {
                nums1[insertPointer] = nums2[pointerTwo];
                insertPointer--;
                pointerTwo--;
            }
        }

        while (pointerTwo >= 0){
            nums1[insertPointer] = nums2[pointerTwo];
            insertPointer--;
            pointerTwo--;
        }
    }
}