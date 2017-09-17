package quick_guide;

/*
 *   java中的main方法是java应用程序的入口，java程序在运行时，首先调用执行main方法。但并不是说java中只能有一个main方法，不同类中都可以包含main方法。当JVM进行编译时，会提示选择其中一个main方法作为编译的入口。
 */

public class VariableExample2 {

    public static void main(String[] args) {

        // Declare three 64-bit integer (long)
        long firstNumber, secondNumber, thirdNumber;

        // Assign value to firstNumber
        // L at the end to tell java a long type, distinguished from type int.
        firstNumber = 100L;

        // Assign values to secondNumber
        secondNumber = 200L;

        // Assign values to thirdNumber
        thirdNumber = firstNumber + secondNumber;

        System.out.println("First Number = " + firstNumber);
        System.out.println("Second Number = " + secondNumber);
        System.out.println("Third Number = " + thirdNumber);
    }

}
