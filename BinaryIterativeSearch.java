public class BinaryIterativeSearch implements Practice2Search {

	public int search (int [] arr, int target){
		int upper = arr.length-1;
		int lower = 0;
		return binaryIterSearch(arr, target, lower, upper);
	}

	/* Return type of search */
	public String searchName (){
		return "Binary Iterative Search";
	}

	/* Find a target and return index of target in array by bysecting the array and iterating */
	public int binaryIterSearch(int [] arr, int target, int lower, int upper){
		int loc = 0;

		/* Get midpoint */
		int mid = (lower + upper)/2;

		/* Base case - check for out of bounds, not in array */
		if (upper < lower){
			return -1;
		} 

		if(arr[mid] == target){
			loc = mid;
		} else if (arr[mid] > target){
			/* Target is before midpoint - assign new upper = mid-1 */
			upper = mid - 1;
			/* Iterate through array with new bounds */
			for(int i = 0; i < mid; i++){
				if(arr[i] == target){
					loc = i;
				}
			}
		} else {
			/* Target is after midpoint - assign new lower = mid+1 */
			lower = mid + 1;
			for(int i = 0; i < upper; i++){
				if(arr[i] == target){
					loc = i;
				}
			}
		}
		return loc;
	}

}