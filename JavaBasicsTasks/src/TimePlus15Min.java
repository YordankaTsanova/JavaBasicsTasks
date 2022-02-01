import java.util.Scanner;

public class TimePlus15Min {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstHour = Integer.parseInt(scanner.nextLine());
        int firstMinutes = Integer.parseInt(scanner.nextLine());

        int totalMinutes = (firstHour * 60) + firstMinutes + 15;

        int hour = totalMinutes / 60;
        int minutes = totalMinutes % 60;

        if (hour < 24) {
            System.out.printf("%d:%02d", hour, minutes);
        } else {
            hour = 0;
            System.out.printf("%d:%02d", hour, minutes);
        }
    }
}
