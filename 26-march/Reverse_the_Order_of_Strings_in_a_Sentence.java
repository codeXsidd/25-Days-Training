public class Main {
    public static void main(String[] args) {

        String str = "Hi Hello Great";
        String s = "";
        String word = "";

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                word = word + str.charAt(i);
            } else {
                s = word + " " + s;
                word = "";
            }
        }
        s = word + " " + s;

        System.out.println(s);
    }
}
