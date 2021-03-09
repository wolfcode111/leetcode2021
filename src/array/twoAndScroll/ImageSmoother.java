package array.twoAndScroll;

public class ImageSmoother {

    public static void main(String[] args) {
      int[][] test = {{2,3,4},{5,6,7},{8,9,10},{11,12,13},{14,15,16}};
      System.out.print(imageSmoother(test));

    }

    public static int[][] imageSmoother(int[][] M) {
        if (M == null || M.length < 1 || M[0] == null || M[0].length == 1) {
            return null;
        }
        int row = M.length;
        int col = M[row - 1].length;
        int[][] temp = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                temp[i][j] = calcul(M, i, j);
            }
        }

        return temp;

    }

    public static int calcul(int[][] M, int i, int j) {
        int[] dirR = {-1, -1, -1, 0, 0, 1, 1, 1};
        int[] dirL = {-1, 0, 1, -1, 1, -1, 0, 1};
        int count=1;
        int sum=M[i][j];
        for(int k=0;k<dirR.length;k++){
            int R = i+dirR[k];
            int L = j+dirL[k];
            if(R>=0 && R<M.length && L>=0 && L<M[M.length-1].length){
                sum+=M[R][L];
                count++;
            }
        }
        return sum/count;
      }
}