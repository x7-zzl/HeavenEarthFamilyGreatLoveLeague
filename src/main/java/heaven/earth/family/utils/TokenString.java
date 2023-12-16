package heaven.earth.family.utils;

import java.util.Random;
import java.util.UUID;

/**
 * @author nightmare
 * @date 2023/10/15 19:21
 */
public class TokenString {
    public static String getToken(){
        return UUID.randomUUID().toString();
    }
}
