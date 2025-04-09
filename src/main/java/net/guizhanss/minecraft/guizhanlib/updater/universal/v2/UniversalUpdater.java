package net.guizhanss.minecraft.guizhanlib.updater.universal.v2;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.bukkit.plugin.Plugin;

import lombok.Getter;
import net.guizhanss.guizhanlib.updater.UpdaterConfig;
import net.guizhanss.minecraft.guizhanlib.GuizhanLib;

/**
 * This is a universal updater. It will put all the updater tasks in a queue and execute them one by one.
 *
 * @author ybw0014
 */
@Getter
public final class UniversalUpdater {

    private final List<UpdaterRecord> records = new ArrayList<>();

    public void add(Plugin plugin, File file, String githubUser, String githubRepo, String githubBranch,
                    UpdaterConfig updaterConfig) {
        records.add(new UpdaterRecord(plugin, file, githubUser, githubRepo, githubBranch, updaterConfig));
    }

    public void start() {
        GuizhanLib.getScheduler().runAsync(new UniversalUpdaterTask(this));
    }
}
