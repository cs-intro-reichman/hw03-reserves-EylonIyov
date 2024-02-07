/** String processing exercise 1. */
public class LowerCase {
    public static void main(String[] args) {  
        String str = args[0];
        System.out.println(lowerCase(str));
    }

   /**
    * Returns a string which is identical to the original string, 
    * except that all the upper-case letters are converted to lower-case letters.
    * Non-letter characters are left as is.
    */
    public static String lowerCase(String s) {
        String s1 = "";
        char temp = 'a';
        for (int i=0; i<s.length(); i++){
            if (s.charAt(i)<='Z' && s.charAt(i) >= 'A'){
                temp = s.charAt(i);
                temp = (char)(temp+32);
                s1 += temp;
            }else{
                s1+=s.charAt(i);
            }
        }
        return s1;
    }
}