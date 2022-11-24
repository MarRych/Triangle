import java.util.Scanner;
public class Triangle {

        public static void main(String[] args) {

       /* 11. Napisz program umożliwiający
        obliczenie pola i obwodu trójkąta równoramiennego.
        p = (a*h)/2
        ob = a+(b*2)
        */
            Scanner scanner = new Scanner(System.in);
            double a, side, h, circuit, field;

            System.out.println("Field of isosceles triangle: ");
            System.out.println("Base: ");
            a = scanner.nextInt();
            System.out.println("Height: ");
            h = scanner.nextInt();

            field = (a*h)/2;
            System.out.println("Field:\n "+field);
           // c*c = a*a + b*b
            side = Math.sqrt((a*a)/2+(h*h));
            circuit = (a+(side*2));
            System.out.println("Circuit: " );
            System.out.format("%.2f",circuit);



        }
    }
