import java.util.Scanner;
///성적을 입력받아 A,B,C,D 등급 매기기

public class BJ9498 {
    public static void main(String arg[]){
        Scanner in= new Scanner(System.in);
        int A = in.nextInt();
        in.close();

        if(A>=90) System.out.println("A");
        else if(A>=80) System.out.println("B");
        else if(A>=70) System.out.println("C");
        else if(A>=60) System.out.println("D");
        else System.out.println("F");


    }

    
}