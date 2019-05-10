import java.util.Scanner;

public class Birthday {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sideA = Integer.parseInt(scanner.nextLine());
        int sideB = Integer.parseInt(scanner.nextLine());
        int sideC = Integer.parseInt(scanner.nextLine());
        double sand = Double.parseDouble(scanner.nextLine());
        double totalWater = (sideA * sideB * sideC) * 0.001;
        double percent = sand * 0.01;
        double total = totalWater * (1 - percent);
        System.out.printf("%.3f", total );


    }
}
