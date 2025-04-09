package net.guizhanss.minecraft.guizhanlib.updater.universal.v2;

import java.io.File;

import javax.annotation.Nonnull;

import org.bukkit.plugin.Plugin;

import net.guizhanss.guizhanlib.updater.UpdaterConfig;

record UpdaterRecord(
    Plugin plugin,
    File file,
    String githubUser,
    String githubRepo,
    String githubBranch,
    UpdaterConfig updaterConfig
) {

    @Nonnull
    public String getConfigPath() {
        return githubUser + "-" + githubRepo + "-" + githubBranch;
    }
}
