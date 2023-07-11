class overlapping { //중첩반복문을 이용하여 구구단 출력하기
    public static void main(String args[]){
        for(int i=1;i<=9;i++){
            for(int k=1;k<=9;k++){
                 System.out.println(k+"*"+i+"="+(k*i)); //문자열 + 숫자,불린은 문자열이 됨
            }
            System.out.println();
        }
    }
}    
