import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Satır sayısını giriniz : ");
        int row = input.nextInt();
        System.out.print("Sütun sayısını giriniz : ");
        int col = input.nextInt();

        int[][] matris = new int[row][col];
        int [][] transpose = new int[col][row];

        for(int i=0; i<row;i++) {
            for(int j=0;j<col;j++) {
                System.out.print(i+1 + ". satır " + (j+1) + ". sütunu giriniz ");
                int x = input.nextInt();
                matris[i][j] = x;
            }
        }

        for(int i=0;i<col;i++) {
            for(int j=0;j<row;j++) {
                if(i==j) {transpose[i][j] = matris[i][j];}
                else{transpose[i][j] = matris[j][i];}

            }
        }
        System.out.println("Matris :");
        for(int[] i : matris) {
            for(int j: i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        System.out.println("Transpose :");
        for(int[] i : transpose) {
            for(int j: i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }
}
