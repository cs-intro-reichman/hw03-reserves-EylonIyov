/** String processing exercise 2. */
public class UniqueChars {
    public static void main(String[] args) {  
        String str = args[0];
        System.out.println(uniqueChars(str));
    }

    /**
     * Returns a string which is identical to the original string, 
     * except that all the duplicate characters are removed,
     * unless they are space characters.
     */
    public static String uniqueChars(String s) {
        String s1 = "";
        char temp =' ';
        for (int i=0; i<s.length(); i++){
              temp = s.charAt(i);
              if (temp == ' '){
                s1 += temp;
              }else{
              if (Exists(temp,s1) == false){
                s1 += temp;
              }
            }
            }
        
        return s1;
    }

    // checks if a letter exists in a string
    public static boolean Exists(char a, String b){
        boolean flag = false;
        for (int i =0; i< b.length(); i++){
                if (a == b.charAt(i)){
                   flag = true;
                   return flag;
                }
            }
            return false;
    }
}
  
    


