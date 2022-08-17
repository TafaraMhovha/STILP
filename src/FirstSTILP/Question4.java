package FirstSTILP;
//while loop to print out all the squares that are less the 500. (Note* a square is a whole number
public class Question4 {
    public static void main (String []ar) {
        int v;
        int a=1;
        while (a*a<=500 ){
            a++;
            v=a*a;
            System.out.println(v);
        }
    }
}
