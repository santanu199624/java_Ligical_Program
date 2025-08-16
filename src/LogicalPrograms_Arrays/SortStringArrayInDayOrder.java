package LogicalPrograms_Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SortStringArrayInDayOrder {

	public static void main(String[] args) {
//		HashMap<String, Integer> day = new HashMap<String, Integer>(); 
//		day.put("Sunday", 0);
//		day.put("Monday", 1);
//		day.put("Tuesday", 2);
//		day.put("Wednesday", 3);
//		day.put("Thursday", 4);
//		day.put("Friday", 5);
//		day.put("Saturday", 6);
//		
//		Arrays.sort(days, new Comparator<String>() {
//            @Override
//            public int compare(String day1, String day2) {
//                // Compare days based on their order in the map
//                return Integer.compare(day.get(day1), day.get(day2));
//            }
//        }); 
		
		
		String[] days = {"Tuesday", "Monday", "Sunday", "Wednesday", "Saturday", "Friday", "Thursday"};
		
		List<String> correctOrder = Arrays.asList(
	            "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"
	        );

	        // Create a list to hold sorted result
	        List<String> sortedDays = new ArrayList<>();

	        // Add days in order only if present in original array
	        for (String day : correctOrder) {
	            for (String inputDay : days) {
	                if (inputDay.equals(day)) {
	                    sortedDays.add(inputDay);
	                }
	            }
	        }

	        System.out.println(sortedDays);
	        // Print result
//	        System.out.println("Days in correct order:");
//	        for (String day : sortedDays) {
//	            System.out.println(day);
//	        }
		
		
		
//		System.out.println(Arrays.toString(days));
	}

}
