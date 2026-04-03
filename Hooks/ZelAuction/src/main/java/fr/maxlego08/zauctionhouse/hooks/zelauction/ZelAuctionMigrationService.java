package fr.maxlego08.zauctionhouse.hooks.zelauction;

import fr.maxlego08.zauctionhouse.api.AuctionPlugin;
import fr.maxlego08.zauctionhouse.api.migration.MigrationCallback;

/**
 * Service that handles the actual ZelAuction data migration process.
 * <p>
 * Reads items and transactions from the ZelAuction database and imports them
 * into zAuctionHouse V4 storage.
 * </p>
 */
public class ZelAuctionMigrationService {

    private final AuctionPlugin plugin;
    private MigrationCallback progressCallback = MigrationCallback.empty();

    public ZelAuctionMigrationService(AuctionPlugin plugin) {
        this.plugin = plugin;
    }

    public void onProgress(MigrationCallback callback) {
        this.progressCallback = callback;
    }

    // TODO: Implement migration methods (migrateFromSqlite, migrateFromSql, etc.)
}
