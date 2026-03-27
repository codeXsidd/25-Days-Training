public class Main {
    public static void main(String[] args) {

        String str = "Programming";
        String s = "";
        boolean flag = false;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            flag = false;

            for (int j = 0; j < s.length(); j++) {
                if (ch == s.charAt(j)) {
                    flag = true;
                    break;
                }
            }

            if (!flag) {
                s = s + ch;
            }
        }

        System.out.println(s);
    }
}
