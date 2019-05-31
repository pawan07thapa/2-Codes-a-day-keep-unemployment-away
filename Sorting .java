public class Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 82, 42, 49, 8, 25, 52, 36, 93, 59, 0, -1, 0 };

		// BB_sort(arr); // bubble sort
		// Sel_sort(arr);
		// Insert_sort(arr);

		// int [] one={1, 2, 3, 1, 2, 4, 1};
		// int [] two={2, 1, 3, 1, 5, 2, 2};
		// ArrayList<Integer> res = get_intersection(one, two);
		// System.out.println(res);

//		int[][] arri = { { 21, 22, 23, 24 }, { 31, 32, 33, 34 }, { 41, 42, 43, 44 }, { 51, 52, 53, 54 } };
//
//		// wave(arri);
//
//		String str = "abca";
//		for (int i = 0; i < str.length(); i++) {
//			for (int j = i + 1; j <= str.length(); j++) {
//				System.out.println(str.substring(i, j));
//			}
//
//		}
//		System.out.println(str.charAt(3));
		System.out.println(palindrome("pawan"));
	}

	public static void BB_sort(int[] num) {
		int l = num.length;
		for (int i = 0; i < l - 1; i++) {

			for (int j = 0; j < l - 1 - i; j++) {
				if (num[j] > num[j + 1]) {
					int temp = num[j];
					num[j] = num[j + 1];
					num[j + 1] = temp;
				}
			}
		}

		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
		System.out.println();
	}

	public static void Sel_sort(int[] nums) {
		int l = nums.length, min = Integer.MAX_VALUE, ind = 0;
		for (int i = 0; i < l - 1; i++) {
			// compare with the first unsorted element of the upper loop
			for (int j = i + 1; j < l; j++) {
				if (nums[i] > nums[j]) {
					int temp = nums[i];
					nums[i] = nums[j];
					nums[j] = temp;
				}
			}
		}
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println();
	}

	public static void Insert_sort(int[] nums) {
		int l = nums.length;
		for (int i = 1; i < l; i++) { // unsorted array
			for (int j = i; j > 0; j--) {
				if (nums[j - 1] > nums[j]) {
					int temp = nums[j];
					nums[j] = nums[j - 1];
					nums[j - 1] = temp;
				}
			}
		}
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
	}
}