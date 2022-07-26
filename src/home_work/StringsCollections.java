package home_work;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

public class StringsCollections {
    public static void main(String[] args) {
        String str = "масло, масло, колбаса, молоко.";
        prinText(str);
    }
    public static void prinText(String str) {
        Set <String> list = new HashSet<>(Arrays.asList(str.replace(".", "").split(", ")));
        for (String st:list) {
            String s1 = st.substring(0, 1).toUpperCase();
            String s2 = st.substring(1);
            String result = s1 + s2;
            System.out.println(result);
        }
    }
}
