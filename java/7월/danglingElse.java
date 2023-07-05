class danglingElse {
    public static void main(String args[]){
        int num1=154;
        int num2=171;
        if (num1>num2){   //if와 else에 종속된 명령문들을 중괄호로 묶어서 블록으로 만들어야됨
          if (num1>100)
            System.out.println("num1="+num1);
        }
        else{
          if (num2>100)
            System.out.println("num2="+num2);
        }    
        System.out.println("Done.");    
    }
}
