//  X^n(Stack height=log2N)
public class Recurpowerlogn {
    public static int calcPower(int x, int n){
        if(n==0){ //base case 1
            return 1;
        }
        if(x==0){ //base case 2
            return 0;
        }

        //if n is even
        if(n%2==0){
            return calcPower(x, n/2) * calcPower(x, n/2);
            /*
             *               X^4
             *    /                   \
             *   x^4/2=x^2        x^4/2=x^2
             *   /      \           /    \
             * x^4/4=x x^4/4=x x^4/4=x x^4/4=x
             */
        }

        //else n is odd
        else{
            return calcPower(x, n/2) * calcPower(x, n/2) * x;
            /*
             *               X^5
             *    /                   \       \
             *   x^4/2=x^2        x^4/2=x^2    x      *X^5 = x*x*x*x*x 5 times
             *   /      \           /    \
             * x^4/4=x x^4/4=x x^4/4=x x^4/4=x
             */
        }
        
    }
    public static void main(String[] args) {
     int x=2, n=5;
     int ans = calcPower(x, n);
     System.out.println(ans);
    }
}
