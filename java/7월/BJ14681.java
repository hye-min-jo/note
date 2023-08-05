import java.util.InputMismatchException;
import java.util.Scanner;

public class BJ14681 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        try {
            System.out.print("X 좌표를 입력하세요: ");
            int X = in.nextInt();

            System.out.print("Y 좌표를 입력하세요: ");
            int Y = in.nextInt();

            in.close();

            if (X > 0 && Y > 0) {
                System.out.println("입력하신 좌표 (" + X + ", " + Y + ")는 1사분면에 위치합니다.");
            } else if (X < 0 && Y > 0) {
                System.out.println("입력하신 좌표 (" + X + ", " + Y + ")는 2사분면에 위치합니다.");
            } else if (X < 0 && Y < 0) {
                System.out.println("입력하신 좌표 (" + X + ", " + Y + ")는 3사분면에 위치합니다.");
            } else if (X > 0 && Y < 0) {
                System.out.println("입력하신 좌표 (" + X + ", " + Y + ")는 4사분면에 위치합니다.");
            } else {
                System.out.println("입력하신 좌표 (" + X + ", " + Y + ")는 좌표축 또는 축에 위치합니다.");
            }

        } catch (InputMismatchException e) {
            System.out.println("정수를 입력해주세요.");
        }
    }

}
