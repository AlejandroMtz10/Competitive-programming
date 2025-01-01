/*
 * Problem: Two Sum.
 * By Alejandro Martinez
 * Difficulty: Easy
 * October 16th 2024
 * */
package leetCode_solutions;

import java.util.HashMap;

public class TwoSum {

	public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer,Integer> indexMap = new HashMap<Integer,Integer>();
        for(int i = 0; i < numbers.length; i++){
            Integer requiredNum = (Integer)(target - numbers[i]);
            if(indexMap.containsKey(requiredNum)){
                int toReturn[] = {indexMap.get(requiredNum), i};
                return toReturn;
            }

            indexMap.put(numbers[i], i);
        }
        return null;
    }

}
