import java.util.Stack;

public class StringRevers {

    public static String reverse(String s) {

        StringBuilder builder = new StringBuilder(s.length());
        for (int i = s.length() - 1; i >= 0; i--) {
            builder.append(s.charAt(i));
        }
        return builder.toString();
    }

    public static void reverseStack(String string){
        char[] chars = string.toCharArray();
        Stack<Character> characterStack = new Stack<>();

        for (char c:
             chars) {
            characterStack.push(c);
        }

        while (!characterStack.empty())
            System.out.print(characterStack.pop());
    }



    public static void main(String[] args){
        System.out.println(StringRevers.reverse("oscilloscope"));
        StringRevers.reverseStack("oscilloscope");
    }
}
