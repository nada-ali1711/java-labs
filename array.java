import java.util.Scanner;

public class array {
    public static void main (String[] args){
        System.out.println("hello");
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();

        //System.out.println(size);
        int[] array = new int[size];
        for (int i=0;i<size;i++){

            array[i] = scan.nextInt();
            }
        for (int i=1;i<=size;i++){
            if (i==size){
                System.out.println(array[0]);}

                else{

                System.out.println(array[i]);
            }}
}
    }
