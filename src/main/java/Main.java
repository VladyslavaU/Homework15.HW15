import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        takeInput();
    }

    public static void takeInput() {
        System.out.println("Please, enter the numbers your wish to draw");
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNextInt()) {
            System.out.println("Please enter numbers only.");
            tryAgain();
        } else {
            draw(scanner.nextInt());
        }
        System.out.println();
        tryAgain();
    }

    public static void tryAgain() {
        System.out.println("Would you like to try again?");
        Scanner scanner = new Scanner(System.in);
        if (scanner.next().toUpperCase().equals("YES")) {
            takeInput();
        } else {
            System.exit(0);
        }
    }

    public static void draw(int number) {
        String[] digits = Integer.valueOf(number).toString().split("");
        String[][] picture = new String[5][digits.length];
        for (int i = 0; i < digits.length; i++) {
            String[] addNumber = draw(digits[i]);
            picture[0][i] = addNumber[0];
            picture[1][i] = addNumber[1];
            picture[2][i] = addNumber[2];
            picture[3][i] = addNumber[3];
            picture[4][i] = addNumber[4];
        }
        for (int i = 0; i < picture.length; i++) {
            System.out.println();
            for (int j = 0; j < picture[i].length; j++) {
                System.out.print(picture[i][j]);
            }
        }
    }


    public static String[] draw(String digit) {
        String[] number = new String[5];
        switch (digit) {
            case "0":
                number[0] = "@@@@@@  ";
                number[1] = "@@  @@  ";
                number[2] = "@@  @@  ";
                number[3] = "@@  @@  ";
                number[4] = "@@@@@@  ";
                break;
            case "1":
                number[0] = "   @@   ";
                number[1] = "  @@@   ";
                number[2] = " @ @@   ";
                number[3] = "   @@   ";
                number[4] = "@@@@@@  ";
                break;
            case "2":
                number[0] = "@@@@@@  ";
                number[1] = "    @@  ";
                number[2] = " @@@@@  ";
                number[3] = "@@      ";
                number[4] = "@@@@@@  ";
                break;
            case "3":
                number[0] = "@@@@@@  ";
                number[1] = "     @  ";
                number[2] = "@@@@@@  ";
                number[3] = "     @  ";
                number[4] = "@@@@@@  ";
                break;
            case "4":
                number[0] = "@    @  ";
                number[1] = "@    @  ";
                number[2] = "@@@@@@  ";
                number[3] = "     @  ";
                number[4] = "     @  ";
                break;
            case "5":
                number[0] = "@@@@@@  ";
                number[1] = "@@      ";
                number[2] = "@@@@@   ";
                number[3] = "    @@  ";
                number[4] = "@@@@@@  ";
                break;
            case "6":
                number[0] = " @@@@@  ";
                number[1] = "@@      ";
                number[2] = "@@@@@   ";
                number[3] = "@@  @@  ";
                number[4] = " @@@@   ";
                break;
            case "7":
                number[0] = "@@@@@@  ";
                number[1] = "   @@   ";
                number[2] = "  @@    ";
                number[3] = " @@     ";
                number[4] = "@@      ";
                break;
            case "8":
                number[0] = "@@@@@@  ";
                number[1] = "@@  @@  ";
                number[2] = "@@@@@@  ";
                number[3] = "@@  @@  ";
                number[4] = "@@@@@@  ";
                break;
            default:
                number[0] = " @@@@@  ";
                number[1] = "@@  @@  ";
                number[2] = " @@@@@  ";
                number[3] = "    @@  ";
                number[4] = " @@@@   ";
        }
        return number;
    }
}

