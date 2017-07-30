/*
Remove Duplicate follow up II
Follow Up II:
Given a sorted array, remove the duplicates in place such that the duplicated element is removed all 
{1, 2, 2, 3, 3, 3} → {1}
{1, 1, 2, 2, 2, 3} --> {3}
*/


public int removeDuplicates(int[] arr) {
    if (arr == null || arr.length == 0) {
        return 0; 
    }
    int start = 0; 
    boolean dup = false;
    
    for (int end = 1; end < arr.length; end++) { 
        if (arr[end] == arr[start]) {
        dup = true; 
        } else if (dup){
            arr[start] = arr[end];
            dup = false; 
        } else {
            arr[++start] = arr[end]; 
        }
    }
    return dup ? start : start + 1;
  
}

