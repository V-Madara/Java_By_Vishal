import java.util.*;
import java.util.Map.Entry;
public class HashmapSort {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of the Hashmap: ");
        int s = sc.nextInt();
        sc.nextLine();
        Map <String,Integer> scores = new HashMap<>();
        for(int i =0 ;i<s;i++){
            System.out.print("Enter the Name: ");
            String key = sc.nextLine();
            System.out.print("Enter the Score: ");
            int value = sc.nextInt();
            sc.nextLine();
            scores.put(key, value);
        }
		System.out.println(scores);

		scores = sortByValue(scores);

		System.out.println(scores);
	}

	private static Map<String, Integer> sortByValue(Map<String, Integer> scores) {
		Map<String, Integer> sortedByValue = new LinkedHashMap<>();

		// get the entry set
		Set<Entry<String, Integer>> entrySet = scores.entrySet();
		System.out.println(entrySet);

		// create a list since the set is unordered
		List<Entry<String, Integer>> entryList = new ArrayList<>(entrySet);
		System.out.println(entryList);

		// sort the list by value
		entryList.sort((x, y) -> x.getValue().compareTo(y.getValue()));
		System.out.println(entryList);

		// populate the new hash map
		for (Entry<String, Integer> e : entryList)
			sortedByValue.put(e.getKey(), e.getValue());

		return sortedByValue;
	}
}