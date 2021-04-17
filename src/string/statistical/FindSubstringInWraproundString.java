package string.statistical;

/**
 * @Author:徐华东
 * @Date:2021/04/21:55
 * @Description:  467. 环绕字符串中唯一的子字符串
 * 这里最关键的问题就是我们应该如何去解决一个重复计算的问题
 * 实际上我们只要计算以每个字符为结尾的最大值得到后
 * 就可以得到整个的子串
 */
public class FindSubstringInWraproundString {

    public static void main(String[] args) {
          System.out.println(findSubstringInWraproundString("zab"));
    }

    public static int findSubstringInWraproundString(String p) {

        int[] dp = new int [26];
        int count = 0;
        char[] str = p.toCharArray();
        for(int i=0;i<str.length;i++){
            if(i>0 && ((str[i]-str[i-1]==1)  || (str[i]-str[i-1]==-25))){
                count++;
            }else{
                count = 1;
            }
            //这里是计算以某个字母结尾的字符串最长的是多少，其实就是为了去避免重复的问题
            dp[str[i]-'a'] = Math.max(dp[str[i]-'a'],count);
        }
        int res = 0;
        for(int i : dp){
            res+= i;
        }
       return res;
    }

}
