package pub.developers.forum.common.support;

import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.util.ObjectUtils;

/**
 * @author 13
 * @create 2025.7
 * @desc
 **/
public class AvatarUtil {

    // https://www.gravatar.com/avatar/
    private static final String GRAVATAR_URL = "https://sdn.geekzu.org/avatar/%s?d=retro";

    public static String get(String avatar, String email) {
        return ObjectUtils.isEmpty(avatar) ? String.format(GRAVATAR_URL, DigestUtils.md5Hex(ObjectUtils.isEmpty(email) ? "" : email)) : avatar;
    }

}
