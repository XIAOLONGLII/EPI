class ArrayOne {
	public static void main(String[] args) {
		int[] arr = {2, 3, 4, 5, 6, 7, 8, 9};
		int[] res = evenFirst(arr);

		for(int i: res) {
			System.out.print(i + " ");
		}
 
	}
	private static int[] evenFirst(int[] arr) {
		// two pointers 
		// only if the left is odd, the right is even swap 
		int left = 0;
		int right = arr.length - 1;
		while(left < right) {
			if(arr[left] % 2 != 0 && arr[right] % 2 == 0) {
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				left++;
				right--;
			}
			else if(arr[left] % 2 != 0 && arr[right] % 2 != 0) {
				right--;
			}
			else{
				left++;
				right--;
			}
		}
		return arr;
	}

}
