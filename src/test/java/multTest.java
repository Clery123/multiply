import org.junit.Test;

import java.math.BigInteger;

import static org.junit.Assert.*;

public class multTest {

    @Test
    public void multiplyBigInt() {
        mult mbi = new mult();
        BigInteger expected = new BigInteger("152415789940557842278920895872549916321");
        String[] args = {"12345678998765432111", "12345678998765432111"};
        assertEquals(expected, mbi.multiplyBigInt(args));
    }

    @Test
    public void multiply() {
        mult mbi = new mult();
        String[] args = {"12345678998765432111", "12345678998765432111"};
        assertEquals("152415789940557842278920895872549916321", mbi.multiply(args));
    }
    @Test
    public void multiplyAreEqual() {
        mult mbi = new mult();
        String[] args = {"12345678998765432111", "12345678998765432111"};
        assertEquals(mbi.multiplyBigInt(args).toString(), mbi.multiply(args));
    }
}