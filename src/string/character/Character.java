package string.character;

public class Character {

    public static void main(String[] args) {

        System.out.println(detectCapitalUse("UAS"));
    }

    public static boolean detectCapitalUse(String word) {
         int count=0;
         boolean tag = false;
         char[] words = word.toCharArray();  //转为字符串数组
         if(word.length() == 1){
             return true;
         }
         for(int i=0;i< words.length;i++){
             if(i==0 && words[i]<97) tag=true;
             else if(words[i]<97){
                  count++;
             }
         }
        if(count== 0 || (count== 0 && tag)  || (count== words.length-1 && tag)  ) return true;
         return false;
    }
}
