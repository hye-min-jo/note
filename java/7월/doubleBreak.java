public class doubleBreak { ///중첩 반복문과 break
    public static void main(String args[]){
        for (int row=0;row<3;row++){
            for (int col=0;col<5;col++){
                System.out.println("("+row+","+col+")");///안쪽 반복문만 빠져나감. 잘못된 코딩.
                if ((row==1)&&(col==3))
                break;
            }
        }
    }
    
}
