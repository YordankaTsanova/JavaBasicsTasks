import java.util.Scanner;

public class AreaOfFigures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String typeOfFigure = scanner.nextLine();

        if (typeOfFigure.equals("square")) {
            double side = Double.parseDouble(scanner.nextLine());

            double squareArea = side * side;

            System.out.printf("%.3f", squareArea);

        } else if (typeOfFigure.equals(("rectangle"))) {
            double sideA = Double.parseDouble(scanner.nextLine());
            double sideB = Double.parseDouble(scanner.nextLine());

            double rectangleArea = sideA * sideB;

            System.out.printf("%.3f", rectangleArea);

        } else if (typeOfFigure.equals("circle")) {
            double radius = Double.parseDouble(scanner.nextLine());

            double circleArea = Math.PI * radius * radius;

            System.out.printf("%.3f", circleArea);

        } else if (typeOfFigure.equals("triangle")) {
            double side = Double.parseDouble(scanner.nextLine());
            double height = Double.parseDouble(scanner.nextLine());

            double triangleArea = side * height / 2;

            System.out.printf("%.3f", triangleArea);
        }
    }
}
