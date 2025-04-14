class Solution(object):
    def countGoodTriplets(self, arr, a, b, c):
    
     count = 0  # start with 0 good triplets

     for i in range(len(arr)):
        for j in range(i + 1, len(arr)):
            if abs(arr[i] - arr[j]) <= a:
                for k in range(j + 1, len(arr)):
                    if abs(arr[j] - arr[k]) <= b and abs(arr[i] - arr[k]) <= c:
                        count += 1  # we found a good triplet!

     return count
