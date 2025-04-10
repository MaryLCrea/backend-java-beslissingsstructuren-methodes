public class main {
    public static void main(String[] args) {
        hello();
        positiveOrNegative(5);
        postiveOrZeroOrNegativ(0);
        bartender("Lisa");
        int result = sum(3, 7);
        System.out.println("The sum is: " + result);
    }

    public static void hello() {
        System.out.println("Hello World!");
    }

    public static void positiveOrNegative(int number) {
        if (number >= 0) {
            System.out.println(number + " this number is positive!");
        } else {
            System.out.println(number + " this number is negative!");
        }
    }

    public static void postiveOrZeroOrNegativ(int number) {
        if (number > 0) {
            System.out.println(number + " this number is positive.");
        } else if (number == 0) {
            System.out.println("This number is zero!");
        } else {
            System.out.println(number + " This number is negative.");
        }
    }

    public static void bartender(String name) {
        System.out.println("Welkom in de bar " + name + ", ik weet dat je graag bacardi-cola drinkt!");
    }

    public static int sum(int input1, int input2) {
        return input1 + input2;
    }
}


