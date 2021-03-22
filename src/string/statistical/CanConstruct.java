package string.statistical;

public class CanConstruct {

    public static void main(String[] args) {
        String ransomNote = "aa";
        String  magazine = "ab";
        System.out.print(canConstruct(ransomNote,magazine));
    }

    public static boolean canConstruct(String ransomNote, String magazine) {
        char[] smagazine = magazine.toCharArray();
        char[] sransomNote = ransomNote.toCharArray();
        int[] hash = new int[26];
        for(int i=0;i<smagazine.length;i++){
            hash[smagazine[i]-'a']++;
        }
        for(int i=0;i<sransomNote.length;i++){
            hash[sransomNote[i]-'a']--;
            if(hash[sransomNote[i]-'a'] <0) return false;
        }

        return true;
    }
}
