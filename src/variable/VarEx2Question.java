package variable;

public class VarEx2Question {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        int num3 = sum(num1, num2);

        System.out.println(num3);
    }

    private static int sum(int num1, int num2) {
        return num1 + num2;
    }
}