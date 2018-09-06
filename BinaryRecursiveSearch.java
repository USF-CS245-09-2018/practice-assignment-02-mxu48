public class BinaryRecursiveSearch implements Practice2Search {

	public int search (int [] arr, int target){
		int upper = arr.length-1;
		int lower = 0;
		return binaryRecSearch(arr, target, lower, upper);
	}

	/* Return type of search */
	public String searchName (){
		return "Binary Recursive Search";
	}


	/* Find a target and return index of target in array recursively and by bisecting the array */
	public int binaryRecSearch (int [] arr, int target, int lower, int upper){
		int loc = 0; 
		/* Get midpoint */
		int mid = (lower + upper)/2;

		/* Base case */
		if(upper < lower){
			return -1;
		} 

		if(arr[mid] == target){
			loc = mid;
		} else if(arr[mid] > target){
			/* Target is before midpoint - call function with new upper = mid-1 */
			return binaryRecSearch(arr, target, lower, mid-1);
		} else {
			/* Target is after midpoint - call function with new lower = mid-1 */
			return binaryRecSearch(arr, target, mid+1, upper);
		}
		return loc;
	}
}