package seedu.address.logic.parser;

import static seedu.address.logic.Messages.MESSAGE_INVALID_COMMAND_FORMAT;
import static seedu.address.logic.parser.CommandParserTestUtil.assertParseFailure;
import static seedu.address.logic.parser.CommandParserTestUtil.assertParseSuccess;
import static seedu.address.testutil.TypicalIndexes.INDEX_FIRST_DRINK;

import org.junit.jupiter.api.Test;

import seedu.address.logic.commands.DeleteDrinkCommand;

/**
 * As we are only doing white-box testing, our test cases do not cover path variations
 * outside of the DeleteDrinkCommand code. For example, inputs "1" and "1 abc" take the
 * same path through the DeleteDrinkCommand, and therefore we test only one of them.
 */
public class DeleteDrinkCommandParserTest {

    private DeleteDrinkCommandParser parser = new DeleteDrinkCommandParser();

    @Test
    public void parse_validArgs_returnsDeleteDrinkCommand() {
        assertParseSuccess(parser, "1", new DeleteDrinkCommand(INDEX_FIRST_DRINK));
    }

    @Test
    public void parse_invalidArgs_throwsParseException() {
        assertParseFailure(parser, "a", String.format(MESSAGE_INVALID_COMMAND_FORMAT,
                DeleteDrinkCommand.MESSAGE_USAGE));
    }
}
