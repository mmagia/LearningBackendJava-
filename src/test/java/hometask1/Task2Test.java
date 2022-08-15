package hometask1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task2Test {
    @Test
    void test(){

        Command cmd = Command.fromText("/help");
        assertEquals("/greet /help /exit /test  ", cmd.getReply());

        cmd = Command.fromText("/greet");
        assertEquals("Hello world!", cmd.getReply());

        cmd = Command.fromText("/test");
        assertEquals("test", cmd.getReply());

        cmd = Command.fromText("/exit");
        assertEquals("shutting down...", cmd.getReply());

        assertThrows(IllegalArgumentException.class, () -> Command.fromText("adsadwsa"));
    }
}