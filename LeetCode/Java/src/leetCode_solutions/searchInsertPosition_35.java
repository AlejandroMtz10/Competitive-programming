package leetCode_solutions;

import java.util.Scanner;

public class searchInsertPosition_35 {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int target=0, lenNums;
		searchInsertPosition_35 search = new searchInsertPosition_35();
		System.out.println("Array lenght: ");
        lenNums = sc.nextInt();
		
        int nums[] = new int[lenNums];
		
        for(int i = 0; i <= nums.length-1; i++) {
        	System.out.println("Reading the number: ");
        	nums[i] = sc.nextInt();
        }
        
        target = sc.nextInt();
        
        System.out.println(search.searchInsert(nums, target));
        
    }
	
	//Solution LeetCode
    public int searchInsert(int[] nums, int target) {
    	
    	int start=0;
        int end=nums.length-1;

        while(start<=end)
        {
            int mid=start+(end-start)/2;

            if(nums[mid]==target)
            {
                return mid;
            }
            else if(nums[mid]<target)
            {
                start=mid+1;
            }
            else
            {
                end=mid-1;
            }
        }
        return start;
    }
}
