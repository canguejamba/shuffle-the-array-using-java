package string_dsa;

public class Shuffle_String {
    public static void main(String[] args) {
        String str = "abcdef";
        char [] chars = str.toCharArray();
        for ( int index = 1; index < chars.length; index = index + 2){

            char temp = chars[index -1];
            chars[index -1] = chars[index];
            chars[index] = temp;
        }
        for ( int index = 0; index < chars.length; index ++){
            System.out.print(""+chars[index]);
        }
        System.out.println(" ");
        for (char index : chars){

            System.out.print(""+index);
        }

    }
}
//output-:badcfe