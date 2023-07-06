class enOutput { //0부터 10까지 짝수만 출력하는 프로그램 
    public static void main(String args[]){
        int i=0;
        while (i++<10){
            if (i%2!=0)
                 continue;
            System.out.println(i);     

        }
    }
    
}
