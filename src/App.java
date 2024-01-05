import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        sc.close();

        double perimetro = a + b + c;
        double area = (a + b) * c/2;

        if(a + b > c && b + c > a && c + a > b){
            System.out.printf("Perimetro = %.1f", perimetro);
        }else{
            System.out.printf("Area = %.1f", area);
        }
    }
}
