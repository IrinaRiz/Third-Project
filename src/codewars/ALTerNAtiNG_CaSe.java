package codewars;

import org.jetbrains.annotations.NotNull;

public class ALTerNAtiNG_CaSe {
    public static String toAlternativeString(String string) {
        StringBuffer str = new StringBuffer(string);
        for( int i = 0; i < string.length(); i ++) {
            Character c = str.charAt(i);
            if (Character.isLowerCase(c)) {
                str.replace(i, i + 1, Character.toUpperCase(c) + "");
            } else {
                str.replace(i, i + 1, Character.toLowerCase(c) + "");
            }
        }
        return String.valueOf(str);
        }
        public static void main(String[]args){
        System.out.println(toAlternativeString("hello world"));
        System.out.println(toAlternativeString("HelLo wOrld"));
        System.out.println(toAlternativeString("hello World"));
        System.out.println(toAlternativeString("heLlo WORLD"));
    }
}
