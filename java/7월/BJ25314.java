import java.util.Scanner;

public class BJ25314 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int a= in.nextInt();
        int div= a/4;

        in.close();
        
        for(int i=0;i<=div;i++){
            System.out.println("long");
        }
        System.out.println("int");
    }
}
