package fr.maxlego08.zauctionhouse.hooks.zelauction;

import fr.maxlego08.zauctionhouse.api.AuctionPlugin;
import fr.maxlego08.zauctionhouse.api.migration.MigrationCallback;
import fr.maxlego08.zauctionhouse.api.migration.MigrationProvider;
import fr.maxlego08.zauctionhouse.api.migration.MigrationResult;
import org.bukkit.Bukkit;
import org.bukkit.configuration.ConfigurationSection;

import java.util.List;
import java.util.concurrent.CompletableFuture;

/**
 * Migration provider for ZelAuction.
 * <p>
 * This provider handles migration from the ZelAuction plugin to zAuctionHouse V4.
 * It requires the ZelAuction plugin to be active on the server, as it reads data
 * directly from the plugin API rather than from a database configuration.
 * </p>
 */
public class ZelAuctionMigrationProvider implements MigrationProvider {

    @Override
    public String getId() {
        return "zelauction";
    }

    @Override
    public String getDisplayName() {
        return "ZelAuction";
    }

    @Override
    public String getDescription() {
        return "ZelAuction auction plugin (requires ZelAuction to be running)";
    }

    @Override
    public List<String> getAliases() {
        return List.of("zel", "zelauctions");
    }

    @Override
    public String getConfigSection() {
        return null;
    }

    @Override
    public String getDefaultSqlitePath() {
        return null;
    }

    @Override
    public String getDefaultJsonFolder() {
        return null;
    }

    @Override
    public String getDefaultTablePrefix() {
        return null;
    }

    @Override
    public String validateConfig(ConfigurationSection config) {
        var zelAuction = Bukkit.getPluginManager().getPlugin("ZelAuction");
        if (zelAuction == null || !zelAuction.isEnabled()) {
            return "ZelAuction plugin is not running. It must be active on the server to migrate data.";
        }
        return null;
    }

    @Override
    public CompletableFuture<MigrationResult> migrate(AuctionPlugin plugin, ConfigurationSection config, MigrationCallback callback) {
        // TODO: Implement migration logic using the ZelAuction plugin API
        return CompletableFuture.completedFuture(MigrationResult.failure("ZelAuction migration is not yet implemented"));
    }
}
