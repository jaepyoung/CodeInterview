import org.junit.Test;

import static org.junit.Assert.*;

public class UniqueStringTest {

    @Test
    public void testIsUniqueForTrue() throws Exception {
        UniqueString uString = new UniqueString();
        assertTrue(uString.isUnique("abcdefghijklmnopqrstuvwxyz"));

    }
    @Test
    public void testIsUniqueForFalse() throws Exception {
        UniqueString uString = new UniqueString();
        assertFalse(uString.isUnique("test"));

    }
}