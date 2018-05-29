import java.util.ArrayList;
import java.util.List;

public class reverseString {
    public class Main{

        public String reverse(String input) {
            StringBuilder sb = new StringBuilder("");
            String[] strArr = input.split("+-*/_");
            List<Character> lst = new ArrayList<Character>();
            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) == '+' || input.charAt(i) == '-'
                        || input.charAt(i) == '*' || input.charAt(i) == '/'
                        || input.charAt(i) == '_') {
                    lst.add(input.charAt(i));
                }
            }
            int p = 0;
            for (String str: strArr) {
                sb.append(helper(str));
                if (p < strArr.length) {
                    sb.append(lst.get(p++).toString());
                }

            }

            return sb.toString();
        }
        private String helper(String s) {
            StringBuilder sb = new StringBuilder(s);
            return sb.reverse().toString();
        }
    }


}
