package quick_guide;

/*
 * 从1至100的数字求和
 */
public class ForLoopExample2 {
	public static void main(String[] args) {
		// 定义求和保存的变量
		int sum = 0;

		for (int i = 0; i <= 100; i++) {

			sum = sum + i;

		}
		System.out.println(sum);

	}
}
