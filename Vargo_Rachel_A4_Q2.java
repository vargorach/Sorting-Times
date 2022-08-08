/*File name: Vargo_Rachel_A4_Q2
Author: Rachel Vargo
Date: 10/16/2020
The purpose of this code is for a user to find out the times of each
sorting method. The main input are the random values in each length of 
array going from 10, 50, 100, 500, 1000, 5000, and 10,000 values in each.
The output is the time it took to complete the sort. To use this code the
user has no input and it runs automatically outputting the time values
in nanoseconds. The key variables are the randomly generated integers
named rand and the arrays containing them. 
*/
package algorithms;
import java.util.*;
import java.util.Random;
public class Q2 {
	/* The integer rand is a key variable and is used to generate
	 * the random values in each array. It has a global scope. 
	 */
	static Random rand = new Random();

	public static void main(String[] args) { 
		/* The ten array is for 10 integers in the 10 length array.
		 * It has a local scope.
		 */
		int[] ten = new int[10];
		/* The fifty array is for 50 integers in the 50 length array.
		 * It has a local scope.
		 */
		int[] fifty = new int[50];
		/* The one_hundred array is for 100 integers in the 100 length
		 * array. It has a local scope.
		 */
		int[] one_hundred = new int[100];
		/* The five_hundred array is for 500 integers in the 500 length
		 * array. It has a local scope.
		 */
		int[] five_hundred = new int[500];
		/* The one_thousand array is for 1000 integers in the 1000 length
		 * array. It has a local scope.
		 */
		int[] one_thousand = new int[1000];
		/* The five_thousand array is for 5000 integers in the 5000 length
		 * array. It has a local scope.
		 */
		int[] five_thousand = new int[5000];
		/* The ten_thousand array is for 100000 integers in the 100000
		 *length array. It has a local scope.
		 */
		int[] ten_thousand = new int[10000];
		for (int i = 0; i < 10; i++) {
			int rand10 = rand.nextInt(10);
			ten[i] = rand10;
		}
		System.out.println(System.nanoTime());
		 BubbleSort(ten);
		 System.out.println("10 Bubble: " + System.nanoTime());
		 RadixSort(ten, ten.length);
		 System.out.println("10 Radix: " + System.nanoTime());
		 QuickSort(ten, 0, ten.length-1);
		 System.out.println("10 Quick: " + System.nanoTime());
		 HeapSort(ten);
		 System.out.println("10 Heap: " + System.nanoTime());
		
		for (int i = 0; i < 50; i++) {
			int rand50 = rand.nextInt(50);
			fifty[i] = rand50;
		}
		 HeapSort(fifty);
		 System.out.println("50 Heap: " + System.nanoTime());
		 QuickSort(fifty, 0, fifty.length-1);
		 System.out.println("50 Quick: " + System.nanoTime());
		 RadixSort(fifty, fifty.length);
		 System.out.println("50 Radix: " + System.nanoTime());
		 BubbleSort(fifty);
		 System.out.println("50 Bubble: " + System.nanoTime());
		for (int i = 0; i < 100; i++) {
			int rand100 = rand.nextInt(100);
			one_hundred[i] = rand100;
		}
		 HeapSort(one_hundred);
		 System.out.println("100 Heap: " + System.nanoTime());
		 QuickSort(one_hundred, 0, one_hundred.length-1);
		 System.out.println("100 Quick: " + System.nanoTime());
		 RadixSort(one_hundred, one_hundred.length);
		 System.out.println("100 Radix: " + System.nanoTime());
		 BubbleSort(one_hundred);
		 System.out.println("100 Bubble: " + System.nanoTime());
		for (int i = 0; i < 500; i++) {
			int rand500 = rand.nextInt(500);
			five_hundred[i] = rand500;
		}
		 HeapSort(five_hundred);
		 System.out.println("500 Heap: " + System.nanoTime());
		 QuickSort(five_hundred, 0, five_hundred.length-1);
		 System.out.println("500 Quick: " + System.nanoTime());
		 RadixSort(five_hundred, five_hundred.length);
		 System.out.println("500 Radix: " + System.nanoTime());
		 BubbleSort(five_hundred);
		 System.out.println("500 Bubble: " + System.nanoTime());
		for (int i = 0; i < 1000; i++) {
			int rand1000 = rand.nextInt(1000);
			one_thousand[i] = rand1000;
		}
		 HeapSort(one_thousand);
		 System.out.println("1000 Heap: " + System.nanoTime());
		 QuickSort(one_thousand, 0, one_thousand.length-1);
		 System.out.println("1000 Quick: " + System.nanoTime());
		 RadixSort(one_thousand, one_thousand.length);
		 System.out.println("1000 Radix: " + System.nanoTime());
		 BubbleSort(one_thousand);
		 System.out.println("1000 Bubble: " + System.nanoTime());
		for (int i = 0; i < 5000; i++) {
			int rand5000 = rand.nextInt(5000);
			five_thousand[i] = rand5000;
		}
		 HeapSort(five_thousand);
		 System.out.println("5000 Heap: " + System.nanoTime());
		 QuickSort(five_thousand, 0, five_thousand.length-1);
		 System.out.println("5000 Quick: " + System.nanoTime());
		 RadixSort(five_thousand, five_thousand.length);
		 System.out.println("5000 Radix: " + System.nanoTime());
		 BubbleSort(five_thousand);
		 System.out.println("5000 Bubble: " + System.nanoTime());
		for (int i = 0; i < 10000; i++) {
			int rand10000 = rand.nextInt(10000);
			ten_thousand[i] = rand10000;
		}
		 HeapSort(ten_thousand);
		 System.out.println("10000 Heap: " + System.nanoTime());
		 QuickSort(ten_thousand, 0, ten_thousand.length-1);
		 System.out.println("10000 Quick: " + System.nanoTime());
		 RadixSort(ten_thousand, ten_thousand.length);
		 System.out.println("10000 Radix: " + System.nanoTime());
		 BubbleSort(ten_thousand);
		 System.out.println("10000 Bubble: " + System.nanoTime());
		}
	/* The Heapsort method is used to test the runtime of the heap
	 * sort. It's arguments are the randArray[] and it has no return
	 * value.
	 */
	public static void HeapSort(int randArray[]) {
		/* The integer l is used for the length of the array. It has
		 * a local scope.
		 */
		int l = randArray.length;
		for (int i = l / 2 - 1; i >= 0; i--) {
			heapify(randArray, l, i);
		}
		for (int i = l - 1; i > 0; i--) {
			/* The integer swap is used to have the numbers switch
			 * places with it. It has a local scope
			 */
			int swap = randArray[0];
			randArray[0] = randArray[i];
			randArray[i] = swap;
			heapify(randArray, i, 0);
		}
	}
	/* The heapify method is used with the HeapSort method to 
	 * heapify the values. It's arguments are the random array
	 * randArray[], integer i, and integer n. Those integers are
	 * used to check which is higher and if they need to swap
	 * positions. It has no return value.
	 */
	static void heapify (int randArray[], int n, int i) {
		/* The integer largest is used to read the reason easier
		 * and has a local scope.
		 */
		int largest = i;
		/* The integer l is used to check the left side and has
		 * a local scope.
		 */
		int l = 2 * i + 1;
		/* The integer r is used to check the right side and has
		 * a local scope.
		 */
		int r = 2 * i + 2;
		if (l < n && randArray[l] > randArray[largest]) {
			largest = l;
		}
		if (r < n && randArray[r] > randArray[largest]) {
			largest = r;
		}
		if (largest != i) {
			int swap = randArray[i];
			randArray[i] = randArray[largest];
			randArray[largest] = swap;
			heapify(randArray, n, largest);
		}
	}
	/* The QuickSort method is used to test the runtime of the quick
	 * sort. It's arguments are the randArray[], low which is the lowest
	 * value and high as the highest value and it has no return value.
	 */
	public static void QuickSort (int[] ten, int low, int high) {
		if (low >= high) {
			return;
		}
		/* The integer middle is used to find the middle of the numbers
		 * and has a local scope.
		 */
		int middle = low + (high-low) / 2;
		/* The integer pivot is used to check above and below the middle
		 * and has a local scope.
		 */
		int pivot = ten[middle];
		while (ten[low] < pivot) {
			low++;
		}
		while (ten[high] > pivot) {
			high--;
		}
		if (low <= high) {
			int swap = ten[low];
			ten[low] = ten[high];
			ten[high] = swap;
			low++;
			high--;
		}
		if (low < high) {
			QuickSort(ten, low, high);
		}
		if (high > low) {
			QuickSort(ten, low, high);
		}
	}
	/* The RadixSort method is used to test the runtime of the radix
	 * sort. It's arguments are the randArray[], and integer n where n
	 * is the length of the array and it has no return value.
	 */
	public static void RadixSort (int randArray[], int n) {
		/* The integer m is used to find the max of the array and is a 
		 * shortcut. It has a local scope.
		 */
		int m = getMax(randArray, n);
		for (int exp = 1; m / exp > 0; exp *= 10) {
			CountSort(randArray, n, exp);
		}
	}
	/* The getMax method is used with RadixSort to find the maximum
	 * value. It's arguments are the random array randArray[] and
	 * the integer n where n is the length of the array. It returns
	 * mx.
	 */
	static int getMax(int randArray[], int n) {
		/* The integer mx is used to check if the value is higher
		 * than the first integer in the array and has a local scope.
		 */
		int mx = randArray[0];
		for (int i = 1; i < n; i++) {
			if (randArray[i] > mx) {
				mx = randArray[i];
			}
		}
		return mx;
	}
	/* The CountSort method is used with RadixSort to find the maximum
	 * value and find that values length. It's arguments are the random 
	 * array randArray[], the integer n, and the integer exp where n is 
	 * the length of the array and exp is the place value. It has no 
	 * return value.
	 */
	public static void CountSort (int randArray[], int n, int exp) {
		/* The array output[] is used to move the values over. It has 
		 * a local scope.
		 */
		int output[] = new int[n];
		/* The integer i is to have less writing in the for loops as 
		 * the initial value and has a local scope.
		 */
		int i;
		/* The array count[] is used to count the values in order. It has
		 * a local scope.
		 */
		int count[] = new int[10];
		Arrays.fill(count, 0);
		for (i = 0; i < n; i++) {
			count[(randArray[i] / exp) % 10]++;
		}
		for (i = 1; i < 10; i++) {
			count[i] += count[i - 1];
		}
		for (i = n - 1; i >= 0; i--) {
			output[count[(randArray[i] / exp) % 10] - 1] = randArray[i];
			count[(randArray[i] / exp) % 10]--;
		}
		for (i = 0; i < n; i++) {
			randArray[i] = output[i];
		}
	}
	/* The Bubblesort method is used to test the runtime of the bubble
	 * sort. It's arguments are the randArray[] and it has no return
	 * value.
	 */
	public static void BubbleSort (int randArray[]) {
		/* The integer a is used as the array length and has a local scope.
		 */
		int a = randArray.length;
		for (int i = 0; i < a - 1; i++) {
			for (int j = 0; j < a - i - 1; j++) {
				if (randArray[j] > randArray[j + 1]) {
					int swap = randArray[j];
					randArray[j] = randArray[j + 1];
					randArray[j + 1] = swap;
				}
			}
			
		}
		
	}
}

