class Sorting{
	
	public static int minValue(int[] a, int start, int size){
		int min = a[start];
		int result = start;
		for (int i = start; i < size; i++){
			if (a[i] < min){
				min = a[i];
				result = i;
			}
		}
		return result;
	}
	
	public static void selectionSort(int[] a){
		int temp;
		int minIndex;
		for (int i = 0; i < a.length; i++){
			minIndex = minValue(a, i, a.length);
			temp = a[i];
			a[i] = a[minIndex];
			a[minIndex] = temp;
		}
	}
	
	public static void insertionSorting(int[] a){
		int min;
		int j;
		for (int i = 1; i < a.length; i++){
			min = a[i];
			for (j = i -1; (j >= 0) && (min < a[j]); j--){
				a[j+1] = a[j];
			}
			a[j+1] = min;
		}
	}
	
	public static void cocktailSort(int[] a){
		boolean swapped = false;
		do {
			swapped = false;
			for(int i = 0; i < a.length - 2; i++){
				if (a[i] > a[i+1]){
					int temp = a[i];
					a[i] = a[i+1];
					a[i+1] = temp;
					swapped = true;
				}
			}
			
			for (int i = a.length - 2; i > 0; i--){
				if (a[i] > a[i+1]){
					int temp = a[i];
					a[i] = a[i+1];
					a[i+1] = temp;
					swapped = true;
				}
			}
		} while (swapped);
		
	}
	
	public static void main(String[] args){
		int[] a = new int[5];
		a[0] = 8;
		a[1] = 15;
		a[2] = 5;
		a[3] = 3;
		a[4] = 12;
		
		System.out.println("Unsorted list");
		
		
		for (int i = 0; i < a.length; i++){
			System.out.println(a[i]);
		}
		
		//selectionSort(a);
		//insertionSorting(a);
		cocktailSort(a);
		
		System.out.println("Sorted list");
		
		for (int i = 0; i < a.length; i++){
			System.out.println(a[i]);
		}
		
	}
}