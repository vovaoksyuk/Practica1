public class Task1 {
    static int calculate (int b, int c, int d){
        return (b+c+d)/3 ;
    }

    public static void main(String[] args) {
        int a = 6 ,b = 3, c = 4;
        int sum =calculate(a,b,c);
        System.out.println("Cреднее значение ="+ sum );

    }
}
