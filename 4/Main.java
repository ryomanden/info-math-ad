import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("length=> ");
        int n = scan.nextInt();

        int sum = 0;
        double ans = 0,arr[] = new double[n];
        
        for(int i = 0; i < n; i++) {
            System.out.print("num" + (i+1) + "=> ");
            arr[i] = scan.nextDouble();
            sum += arr[i];
        }
        
        for(int i = 0; i < n; i++) {
            ans = ans + ((-arr[i]/sum) * log2((arr[i]/sum)));
        }
        System.out.println("-------");
        System.out.println("entropy = " + ans);
    }
    static double log2(double x) {
        return (Math.log(x) / Math.log(2));
    }
  }
