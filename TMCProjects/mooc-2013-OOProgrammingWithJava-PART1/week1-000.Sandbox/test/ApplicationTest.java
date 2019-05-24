import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ApplicationTest {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
@Test
    public void hiekkalaatikkoVihreakti() {
        assertTrue(true);
    }

    /**
     * Test of main method, of class Application.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Application.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
