//파이를 로컬변수로 지정하여 반지름의 길이가 2.0인 원의 넓이와 둘레를 구하는 프로그램
class Final {
    public static void main(String args[]){
        final double pi= 3.14;
        double radius =2.0, circum, area;
        circum=2*pi*radius;
        area=pi*radius*radius;
        System.out.println(circum);
        System.out.println(area);



    }
    
}
