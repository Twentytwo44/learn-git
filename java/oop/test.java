import java.util.Scanner;
public class test {
    private static int x = 5;
    private static int y = 2;
    
  
    public static void main(String[] args) {
        int x = 9;
        System.out.println(x);
        System.out.println(getX());
        System.out.println(ShowX());
        y = 1;
        System.out.println(y);
        System.out.println(getY());
        System.out.println(ShowY());
        int y = 11;
        System.out.println(y);
        System.out.println(getY());
        System.out.println(ShowY());

       
        if (x != y) {
            int z = x + y;
            System.out.println(z);

        }
       

        int a= 1,b;
        if (a > 0) {
            b = ++a;
        } else {
            b = ++a;
        }
        System.out.println(b);

        System.out.println("-------------------");
        int[][] numbers = {{1,2,3,4},{5,6,7,8}};
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j <numbers[i].length; j++) {
                System.out.println("Element["+ i +"][" + j + "] is " + numbers[i][j]);
            }
        }

        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int fact = 1;
        int num = s1.nextInt();
        for (int i = 1; i <= num; i++){
            // factorial
            fact = fact * i;
            

        }
        System.out.println("Factorial of " + num + " is " + fact);
    }

    public static int getX() {
        return x;
    }
    public static int getY() {
        return y;
    }
    public static int ShowX(){
        int x = 7;
        return x;
    }

    public static int ShowY(){
        int y = 12;
        return y;
    }

    
}
