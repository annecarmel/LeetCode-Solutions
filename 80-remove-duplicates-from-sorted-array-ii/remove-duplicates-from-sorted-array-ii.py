class Solution(object):
   
  def removeDuplicates(self, nums):
    if len(nums) <= 2:
        return len(nums)  # If array is size 2 or less, it's already valid
    
    i = 2  # Pointer to where we insert the next valid element
    
    for j in range(2, len(nums)):
        if nums[j] != nums[i - 2]:
            nums[i] = nums[j]  # Put the number at the next valid spot
            i += 1  # Move the pointer forward

    return i  # i is the length of the result
