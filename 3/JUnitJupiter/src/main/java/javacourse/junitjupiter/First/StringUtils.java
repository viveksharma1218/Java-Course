package javacourse.junitjupiter.First;

public class StringUtils {
    public String reverse(String str){
        if(str == null || str.length() == 0){
            return null;
        }
        return new StringBuilder(str).reverse().toString();
    }
    public Boolean isPalindrome(String str){
        if(str == null || str.length() == 0){
            return false;
        }
        String reversed = reverse(str);
        return str.equals(reversed);
    }
    public int countVowells(String str){
        if(str ==null || str.length()==0){return 0;}
        int count = 0;
        for(int i=0; i < str.length(); i++){

            if(("aeiou".indexOf(str.charAt(i))) != -1){
                count++;
            }
        }
        return count;
    }
}
