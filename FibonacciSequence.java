//Fibonnacci Sequence
public class FibonacciSequence {
    public static void main(String[] args) {
        int n1=0;int n2=1; int n3=0;
        System.out.print(n1 + " " + n2);


        while(n1+n2<=100){
            n3=n1+n2;
            System.out.print(" " +n3);
            n1=n2;
            n2=n3;
        }
         
    }
}
