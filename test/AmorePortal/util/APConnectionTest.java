package AmorePortal.util;

import java.sql.Connection;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mekapangestu
 */
public class APConnectionTest {

    public APConnectionTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testGetConnection_3args() {
        System.out.println("getConnection");
        String url = "jdbc:mysql://localhost/amoreportal";
        String user = "root";
        String pass = "";
        Connection expResult = null;
        Connection result = APConnection.getConnection(url, user, pass);
        assertNotEquals(expResult, result);
    }

}
