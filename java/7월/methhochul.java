public class methhochul {
    public static void main(String args[]){
        printCharacter('*',30);  ///메소드 호출문1
        System.out.println("Hellow, Java");
        printCharacter('-',30);  ///메소드 호출문2

    }
    static void printCharacter(char ch,int num){
        for (int cnt=0; cnt<num;cnt++)
           System.out.print(ch);
        System.out.println();   
    }
}

