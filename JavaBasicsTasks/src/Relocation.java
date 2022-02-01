import java.util.Scanner;

public class Relocation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int widthOfFreeSpace = Integer.parseInt(scanner.nextLine());
        int lengthOfFreeSpace = Integer.parseInt(scanner.nextLine());
        int heightOfFreeSpace = Integer.parseInt(scanner.nextLine());


        int numberOfBoxes = 0;
        String input = scanner.nextLine();
        while (!input.equals("Done")) {
            numberOfBoxes = Integer.parseInt(input);
            numberOfBoxes += numberOfBoxes;
        }

        int freeSpace = widthOfFreeSpace * lengthOfFreeSpace * heightOfFreeSpace;

        int diff = Math.abs(freeSpace - numberOfBoxes);
        if (freeSpace >= numberOfBoxes) {
            System.out.printf("%d Cubic meters left.", diff);
        } else {
            System.out.printf("No more free space! You need %d Cubic meters more.", diff);
        }

    }
}
