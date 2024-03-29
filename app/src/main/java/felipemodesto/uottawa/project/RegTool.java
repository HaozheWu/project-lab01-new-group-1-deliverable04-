package felipemodesto.uottawa.project;


import androidx.annotation.Nullable;

import java.util.regex.Pattern;

/**
 */

public class RegTool {

    public static boolean isMatch(String regex, String string) {
        return !isNullString(string) && Pattern.matches(regex, string);
    }

    public static boolean isNullString(@Nullable String str) {
        return str == null || str.length() == 0 || "null".equals(str);
    }

    /**
     * email is vaild or not
     *
     * @param email
     * @return true is valid , false otherwises
     */
    public static boolean isEmail(String email) {
        //"\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*"
        String emailRegex =  "^[a-zA-Z0-9][\\w\\.-]*[a-zA-Z0-9]@[a-zA-Z0-9][\\w\\.-]*[a-zA-Z0-9]\\.[a-zA-Z][a-zA-Z\\.]*[a-zA-Z]$";
        return isMatch(emailRegex, email);
    }

}
