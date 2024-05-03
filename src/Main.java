import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

double x;
double y;
double z;

Scanner sc = new Scanner(System.in);

System.out.println("Enter X: ");
x = sc.nextDouble();
System.out.println("Enter Y: ");
y = sc.nextDouble();

z = Math.sqrt((x*x)+(y*y));

        System.out.println("The hypotenuse is : "+z);
sc.close();


/*
double x = 3.14;
double y = -10;
double z = Math.max(x,y);
double z = Math.min(x,y)
double z = Math.abs(y)
double z = Math.sqrt(x);
double z = Math.round(x);
double z = Math.ceil(x);
double z = Math.floor(x);
*/


    }
}