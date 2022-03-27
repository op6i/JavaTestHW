import com.sun.tools.internal.ws.wsdl.document.jaxws.Exception;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Computer on 25/03/2022.
 */
public class CalculatingTest {
    Calculating c;
    @Before
    public void setUp()  {
        c=new Calculating();
    }
    @Test(expected = IllegalStateException.class)
    public  void negative (){
        int actual= c.binifits(-5);
    }
    @Test
    public  void fifty (){
        int actual= c.binifits(50);
        assertEquals(3,actual);
    }
    @Test
    public  void fiveHund (){
        int actual= c.binifits(500);
        assertEquals(5,actual);
    }
    @Test
    public  void twoTh (){
        int actual= c.binifits(2000);
        assertEquals(7,actual);
    }
    @Test
    public  void zero (){
        int actual= c.binifits(0);
        assertEquals(3,actual);
    }@Test
    public  void hund (){
        int actual= c.binifits(1000);
        assertEquals(7,actual);
    }@Test
    public  void oneHund (){
        int actual= c.binifits(100);
        assertEquals(5,actual);
    }
    @After
    public void tearDown() {

    }

}