public class HelloWorld { {

    public static int someCode(int a, int b, int c){
        if((a<b) && (b<c)) {
            return a;
        }
        if((a>=b) && (b>=c)) {
            return b;
        }
        if((a==b) || (a==c) || (b==c)) {
            return c;
        }
    }



