class switchmon2 {
    public static void main(String args[]){
        char ch= 'a';
        switch (ch){
            case 'a':
            case 'A':
              System.out.println("A입니다.");
              break;
            case 'b':
            case 'B':
              System.out.println("B입니다.");
              break;
            case 'c':
            case 'C':
              System.out.println("C입니다."); 
              break; 
            default :
              System.out.println("A,B,C가 아닙니다.");
              break;



        }
    }
    
}
