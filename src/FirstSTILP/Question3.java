package FirstSTILP;
// program to print sum of numbers between 1-100
public class Question3 {
    public static void main(String[]args){
        int v =0;
        for(int a=1;a<=100;a++){
            v +=a; // or alternatively v=v+a;
        }
        System.out.println("The sum of numbers between 1and 100 inclussive is \t" + v);
    }
}
