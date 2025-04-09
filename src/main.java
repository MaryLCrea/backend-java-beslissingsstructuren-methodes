public class main {
    public static void main(String[] args) {
        // Voorbeeldaanroepen van de methodes:
        hello();
        positiveOrNegative(5);
        postiveOrZeroOrNegativ(0);
        bartender("Lisa");
        int result = sum(3, 7);
        System.out.println("De som is: " + result);
    }

    public static void hello() {
        System.out.println("Hallo!");
    }

    public static void positiveOrNegative(int number) {
        if (number >= 0) {
            System.out.println(number + " is positief.");
        } else {
            System.out.println(number + " is negatief.");
        }
    }

    public static void postiveOrZeroOrNegativ(int number) {
        if (number > 0) {
            System.out.println(number + " is positief.");
        } else if (number == 0) {
            System.out.println("Het getal is nul.");
        } else {
            System.out.println(number + " is negatief.");
        }
    }

    public static void bartender(String name) {
        System.out.println("Welkom in de bar, " + name + "!");
    }

    public static int sum(int input1, int input2) {
        return input1 + input2;
    }
}


