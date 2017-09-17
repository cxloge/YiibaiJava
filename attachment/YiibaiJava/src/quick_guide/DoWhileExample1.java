package quick_guide;

public class DoWhileExample1 {

    public static void main(String[] args) {

        int value = 3;

        // do-while loop will execute at least once
        do {

            System.out.println("Value = " + value);

            // Increase 3
            value = value + 3;

        } while (value < 10);

    }
}
