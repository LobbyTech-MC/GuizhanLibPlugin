package net.guizhanss.minecraft.guizhanlib.utils;

import java.util.Locale;

import javax.annotation.Nonnull;

import org.bukkit.NamespacedKey;

import lombok.experimental.UtilityClass;
import net.guizhanss.guizhanlib.common.utils.StringUtil;

/**
 * {@link NamespacedKey} utilities.
 *
 * @author ybw0014
 */
@UtilityClass
public class NamespacedKeyUtils {

    /**
     * Get the minecraft {@link NamespacedKey} from the key.
     *
     * @param key The key
     * @return The minecraft {@link NamespacedKey}
     */
    @Nonnull
    public static NamespacedKey getMinecraft(@Nonnull String key) {
        return NamespacedKey.minecraft(StringUtil.dehumanize(key).toLowerCase(Locale.ROOT));
    }
}
