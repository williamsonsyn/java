
import java.util.Scanner;

public class array2d{
    public static void printSpiral(int matrix[][]){
        int startCol = 0;
        int startRow = 0;
        int endRow = matrix.length;
        int endCol = matrix[0].length;

        while(startRow <= endRow && startCol <= endCol){
            //top
            for(int j=startCol; j<endCol; j++){
                System.out.print(matrix[startRow][j]+" ");
            }
            //right
            for(int j=startRow + 1; j<endRow; j++){
                System.out.print(matrix[j][endCol-1]+" ");
            }
            //bottom
            for(int j=endCol - 2; j>=startCol; j--){
                System.out.print(matrix[endRow-1][j]+" ");
            }
            //left
            for(int j=endRow - 2; j>=startRow + 1; j--){
                System.out.print(matrix[j][startCol]+" ");
            }
            startRow++;
            endRow--;
            startCol++;
            endCol--;
        }
    }
        public static void main(String[] args){
        int matrix[][]= new int[4][4];
        int n=matrix.length,m=matrix[0].length;
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        printSpiral(matrix);
    }

}