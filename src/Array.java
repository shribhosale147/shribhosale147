import java.util.Scanner;

public class Array {
    public static void main(String args[]){
        int arr[][]=new int[3][3];
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr.length ; j++) {
                System.out.print("Enter the elements:-");
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Display  the elements");
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr.length ; j++) {
                System.out.print(" "+arr[i][j]);
            }

        }
    }
}
