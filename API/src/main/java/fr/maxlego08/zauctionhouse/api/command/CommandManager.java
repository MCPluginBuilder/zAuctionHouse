package fr.maxlego08.zauctionhouse.api.command;

import java.util.List;

/**
 * Manages command registration and lookup. External plugins can use this interface
 * to register additional sub-commands on the main auction command tree.
 */
public interface CommandManager {

    /**
     * Registers a command in the command manager.
     *
     * @param command the command to register
     * @return the registered command
     */
    VCommand registerCommand(VCommand command);

    /**
     * Returns all registered commands (including sub-commands).
     *
     * @return an unmodifiable view or copy of the registered commands
     */
    List<VCommand> getCommands();

}
