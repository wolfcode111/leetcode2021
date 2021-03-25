package hashTable.operation;

public class JudgeSquareSum {

    public static void main(String[] args) {

        System.out.print(judgeSquareSum(5));
    }

    public static boolean judgeSquareSum(int c) {

        //使用双指针的方法来计算
         int right =(int)Math.floor( Math.sqrt(c));
         int left  = 0;
         int result = right*right +left*left ;
         while(result!=c){
             result = right*right +left*left ;
             if(left<=right) {
                 if (result < c) {
                     left++;
                 }
                 if (result > c) {
                     right--;
                 }
             }else{
                 return false;
             }

         }
         return true;
    }
}
