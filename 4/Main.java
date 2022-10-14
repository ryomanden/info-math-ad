class Main {
    public static void main(String[] args) {
        System.out.println(-log2(1.0/4.0));
    }
    static double log2(double x) {
        return (Math.log(x) / Math.log(2));
    }
  }
