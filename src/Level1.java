import java.util.*;

public class Level1 {
    public static String Keymaker(int k) {
        char[] resChar = new char[k];
        for (int i = 1; i <= k; i++) {
            for (int j = i - 1; j < k; j += i) {
                resChar[j] = resChar[j] == '1' ? '0' : '1';
            }
        }
        return new String(resChar);
    }
}