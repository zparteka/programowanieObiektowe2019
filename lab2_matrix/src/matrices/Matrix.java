package matrices;
import java.util.Arrays;
import java.util.Random;

public class Matrix {
    private int[][] matrix;

    public Matrix(int n, int m){
        matrix = new int[n][m];
    }

    public void Fill(){
        Random random = new Random();
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                matrix[i][j] = random.nextInt(9) + 1;
            }
        }
    }

    public void Print(){
        System.out.println(Arrays.deepToString(matrix));
    }

    public int Even(){
        int even = 0;
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                if ((matrix[i][j] % 2) == 0){
                    even = even + 1;
                }
            }
        }
        return even;
    }

    public int Odd(){
        int odd = 0;
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                if ((matrix[i][j] % 2) != 0){
                    odd = odd + 1;
                }
            }
        }
        return odd;
    }

    public int Odd1(){
        //konstrukcja petli for each
        int odd1 = 0;
        for (int[] row: matrix) {
            for (int value: row) {
                if ((value % 2) != 0){
                    odd1 += 1;
                }
            }
        }
        return odd1;
    }

}
