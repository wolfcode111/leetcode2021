package string.statistical;

/**
 * @Author:徐华东
 * @Date:2021/04/13:16
 * @Description:  551. 学生出勤记录 I
 *
 * 可以使用函数 indexOf 简化编程
 */
public class CheckRecord {

    public static void main(String[] args) {
        System.out.println(checkRecord("PPALLP"));
    }

    public static boolean checkRecord(String s) {

//        char[] str = s.toCharArray();
//        int countA = 0;
//        for(int i=0;i<str.length;i++){
//            if(str[i] == 'A'){
//                countA++;
//            }else if(str[i] == 'L' && i+2<str.length && str[i+1]=='L'&& str[i+2]=='L'){
//                return false;
//            }
//        }
//        if(countA<=1) return true;
//        else return false;
        char[] str = s.toCharArray();
        int countA = 0;
        for(char c : str){
            if(c=='A'){
                countA++;
                if(countA>1) return false;
            }
        }
        if(s.indexOf("LLL")<0) return true;
        else return false;
    }
}
