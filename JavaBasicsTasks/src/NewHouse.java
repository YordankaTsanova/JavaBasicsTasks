import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String typeOfFlowers = scanner.nextLine();
        int numberFlowers = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());

        double totalSum = 0;

        switch (typeOfFlowers) {
            case "Roses":
                totalSum = numberFlowers * 5.0;
                if (numberFlowers > 80) {
                    totalSum = totalSum * 0.90;
                }
                break;
            case "Dahlias":
                totalSum = numberFlowers * 3.80;
                if (numberFlowers > 90) {
                    totalSum = totalSum * 0.85;
                }
                break;
            case "Tulips":
                totalSum = numberFlowers * 2.80;
                if (numberFlowers > 80) {
                    totalSum = numberFlowers * 0.85;
                }
                break;
            case "Narcissus":
                totalSum = numberFlowers * 3.0;
                if (numberFlowers < 120) {
                    totalSum = totalSum * 1.15;
                }
                break;
            case "Gladiolus":
                totalSum = numberFlowers * 2.50;
                if (numberFlowers < 80) {
                    totalSum = totalSum * 1.20;
                }
                break;
        }
        double deff = Math.abs(budget - totalSum);

        if (budget >= totalSum) {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left."
                    , numberFlowers, typeOfFlowers, deff);
        } else {
            System.out.printf("Not enough money, you need %.2f leva more.", deff);
        }
    }
}
