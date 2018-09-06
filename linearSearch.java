public class LinearSearch implements Practice2Search {

	public int search (int [] arr, int target){
		return linSearch(arr, target);
	}

	/* Return type of search */
	public String searchName (){
		return "Linear Search";
	}

	/* Find a target and return index of target in array */
	public int linSearch (int [] arr, int target){
		for(int i = 0; i < arr.length; i++){
			if(arr[i] == target){
				return i;
			} 
		}
		return -1;
	}

}