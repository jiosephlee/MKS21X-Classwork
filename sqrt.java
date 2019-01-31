public class sqrt{
    public static double sqrt(int n){
        return sqrthelper(n, 1);
    }
    public static double sqrthelper(int n, int guess){
        if ((n-guess)/n * 100 <= .01){
            return sqrthelper(n , (n / guess + guess) / 2);
        }
        return guess;
    }
}
