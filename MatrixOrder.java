
public class MatrixOrder {

    public static void main(String[] args) {
        handlematrixOrder(7,7);
    }

    static void handlematrixOrder(int m, int n) {
        int[][] mat = new int[m][n];
        int ele = 1;
        int i = 0;
        int j = n - 1;
        boolean rev = true;
//  && 
        while (ele != m*n+1 && i < m && j >= 0 && i >= 0 && j < n) {

            mat[i][j] = ele;
            
            if ((i % 2 == 0 && j == n - 1 && i!= m-1 )|| (j == 0 && i%2 == 1) ) {
                i++;
            }
            else if ((i == 0 && j % 2 == 1) || (i == m-1 && j%2 == 0)  ) {
                j--;
            }  
            else if (rev) {
                i--;
                j--;
                if (i == 0 || j == 0) {
                    rev = !rev;
                }
            }
            else if(!rev){
                i++;
                j++;
                if ((i == m-1 || j == m-1) ) {
                    rev = !rev;
                }
            }  
            ele++;
        } 
        printMat(mat);
    }

    static void printMat(int[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                System.out.print(" "+mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}
