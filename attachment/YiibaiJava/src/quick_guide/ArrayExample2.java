package quick_guide;
/*
 * 使用一个for循环来对元素赋值
 */
public class ArrayExample2 {
	public static void main(String[] args) {

		// Declare an array with 5 elements
		int[] myArray = new int[5];

		// Print out element count
		System.out.println("Array Length=" + myArray.length);

		// Using loop assign values to elements of the array.
		System.out.println("给数组赋值，并打印输出所有的数组元素");
		for (int index = 0; index < myArray.length; index++) {
			myArray[index] = 100 * index * index + 3;
			// 打印输出所有的数组元素
			System.out.println("myArray[" + index + "] = " + myArray[index]);
		}

		// Print out the element at index 3
		System.out.println("Print out the element at index 3");
		System.out.println("myArray[3] = " + myArray[3]);
	}
}