package array.twoAndScroll;

public class CountBattleships {

    public static void main(String[] args) {

        char[][] temp = {{'X', '.', '.', 'X'}, {'.', '.', '.', 'X'}, {'.', '.', '.', 'X'}};

        System.out.println(countBattleships(temp));

    }

    public static int countBattleships(char[][] board) {
          int count=0;
          for(int i=0;i<board.length;i++) {
              for (int j = 0; j < board[board.length - 1].length; j++) {
                  if (board[i][j] == 'X') {
                      count++;

                      int a = i + 1;
                      int b = j;
                      //这里的关键就是用了这样的循环来将所有下面出现的X给变化为.的形式
                      while (a < board.length && board[a][b] == 'X') {
                          board[a][b] = '.';
                          a++;
                      }
                      int m = i;
                      int n = j + 1;
                      while (n < board[0].length && board[m][n] == 'X') {
                          board[m][n] = '.';
                          n++;
                      }

                  }
              }
          }
          return count;
    }
}
