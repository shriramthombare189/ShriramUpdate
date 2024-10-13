Series/
    ├── FibonacciSeries.java
    ├── CubeSeries.java
    ├── SquareSeries.java
    └── SeriesDemo.java

    
    
    
    
    
    package Series;

    public class FibonacciSeries {
        public void printFibonacci(int n) {
            int a = 0, b = 1;
            System.out.print("Fibonacci Series: ");
            for (int i = 1; i <= n; i++) {
                System.out.print(a + " ");
                int next = a + b;
                a = b;
                b = next;
            }
            System.out.println();
        }
    }

    
    
    
    
    package Series;

    public class CubeSeries {
        public void printCubes(int n) {
            System.out.print("Cube Series: ");
            for (int i = 1; i <= n; i++) {
                System.out.print((i * i * i) + " ");
            }
            System.out.println();
        }
    }

    
    
    
    
    package Series;

    public class SquareSeries {
        public void printSquares(int n) {
            System.out.print("Square Series: ");
            for (int i = 1; i <= n; i++) {
                System.out.print((i * i) + " ");
            }
            System.out.println();
        }
    }

    
    
    
    
    
    
    package Series;

    import java.util.Scanner;

    public class SeriesDemo {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            
            System.out.print("Enter the number of terms (n): ");
            int n = scanner.nextInt();

            FibonacciSeries fibonacci = new FibonacciSeries();
            fibonacci.printFibonacci(n);

            CubeSeries cube = new CubeSeries();
            cube.printCubes(n);

            SquareSeries square = new SquareSeries();
            square.printSquares(n);

            scanner.close();
        }
    }

    
    
    
    
    
    javac Series/*.java

    
    java Series.SeriesDemo

    
    Enter the number of terms (n): 5
    Fibonacci Series: 0 1 1 2 3 
    Cube Series: 1 8 27 64 125 
    Square Series: 1 4 9 16 25 
