class Calc{

private int factorial;


public void  Calc(int factorial){
    this.factorial = factorial;

}


public static long calculateFactorial(int n) {
    if (n < 0) {
        
    }

    long factorial = 1;
    for (int i = 1; i <= n; i++) {
        factorial *= i;
    }
    return factorial;
}
}