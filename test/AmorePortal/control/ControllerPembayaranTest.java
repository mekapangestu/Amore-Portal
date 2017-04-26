package AmorePortal.control;

import AmorePortal.model.ModelPembayaran;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mekapangestu
 */
public class ControllerPembayaranTest {
    
    public ControllerPembayaranTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    
    /**
     * Test of simpanPembayaran method, of class ControllerPembayaran.
     */
    @Test
    public void testSimpanPembayaran() throws Exception {
        System.out.println("simpanPembayaran");
        ModelPembayaran pembayaran = null;
        ControllerPembayaran instance = new ControllerPembayaran();
        instance.simpanPembayaran(pembayaran);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
