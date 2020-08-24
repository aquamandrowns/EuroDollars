class Main {
  static double rate = 1.18;
  public static void main(String[] args) {
    double euro = Double.parseDouble(args[0]);
    double dollars = euro * rate;
    System.out.printf("€%f is equal to $%f\n", euro,dollars);
  }
}