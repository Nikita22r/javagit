class Main {
  public static void main(String[] args) {

    int n = 15, f1 = 0, f2 = 1;
    System.out.println("Fibonacci Series till " + n + " terms:");

    for (int i = 1; i <= n; ++i) {
      System.out.print(f1 + ", ");

      // compute the next term
      int nextTerm = f1+ f2;
      f1 = f2;
      f2= nextTerm;
    }
  }
}