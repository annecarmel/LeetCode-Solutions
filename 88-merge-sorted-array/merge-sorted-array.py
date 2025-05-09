class Solution(object):
   def merge(self, nums1, m, nums2, n):
    # Start filling from the end
    i = m - 1  # Pointer for nums1's valid part
    j = n - 1  # Pointer for nums2
    k = m + n - 1  # Pointer for end of nums1 (where to insert)

    # While there are elements in both arrays
    while i >= 0 and j >= 0:
        if nums1[i] > nums2[j]:
            nums1[k] = nums1[i]
            i -= 1
        else:
            nums1[k] = nums2[j]
            j -= 1
        k -= 1

    # If nums2 still has elements, put them in nums1
    while j >= 0:
        nums1[k] = nums2[j]
        j -= 1
        k -= 1
