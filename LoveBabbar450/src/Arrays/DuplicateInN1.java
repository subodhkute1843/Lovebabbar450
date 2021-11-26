package Arrays;

import java.util.*;

public class DuplicateInN1 {

	public static void main(String[] args) {

		DuplicateInN1 ob  = new DuplicateInN1();
		
		int a[] = {1,2,4,5,2};
		System.out.println(ob.findDuplicate(a));
	}

	public int findDuplicate(int[] nums) {
        Set<Integer> s = new HashSet<>();
        for (int i=0;i<nums.length;i++){
            if(s.contains(nums[i])){
                return nums[i];
            }
            s.add(nums[i]);
            
        }
        
        return -1;
    }
	
}
