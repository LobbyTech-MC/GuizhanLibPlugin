package net.guizhanss.guizhanlib.minecraft.helper.entity;

import javax.annotation.Nonnull;

import org.bukkit.entity.EntityType;

import lombok.experimental.UtilityClass;

/**
 * @deprecated 请使用 {@link net.guizhanss.minecraft.guizhanlib.gugu.minecraft.helpers.entity.EntityTypeHelper} 代替
 */
@Deprecated(since = "2.0.0", forRemoval = true)
@UtilityClass
@SuppressWarnings("unused")
public final class EntityTypeHelper {

    @Nonnull
    public static String getName(@Nonnull EntityType entityType) {
        return net.guizhanss.minecraft.guizhanlib.gugu.minecraft.helpers.entity.EntityTypeHelper.getName(entityType);
    }

    @Nonnull
    public static String getKey(@Nonnull EntityType entityType) {
        return net.guizhanss.minecraft.guizhanlib.gugu.minecraft.helpers.entity.EntityTypeHelper.getKey(entityType);
    }

    @Nonnull
    public static String getName(@Nonnull String entityType) {
        return getName(entityType, false);
    }

    @Nonnull
    public static String getName(@Nonnull String entityType, boolean emptyString) {
        return net.guizhanss.minecraft.guizhanlib.gugu.minecraft.helpers.entity.EntityTypeHelper.getName(entityType, emptyString);
    }
}
