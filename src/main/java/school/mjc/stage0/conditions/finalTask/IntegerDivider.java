package school.mjc.stage0.conditions.finalTask;

public class IntegerDivider {
    public void printCompletelyDivided(int dividend, int divider) {
        if (divider == 0) {
            System.out.println("Division by zero");
        }

        int result = dividend / divider;
        int multiplied = result * divider;

        if (multiplied == dividend) {
            System.out.println("Can be divided completely");
        } else {
            System.out.println("Cannot be divided completely");
        }
    }
}
