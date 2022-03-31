import com.sun.tools.internal.ws.wsdl.document.jaxws.Exception;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Computer on 25/03/2022.
 */
public class trainTest {
    train t;
    @Before
    public void setUp()  {
        t=new train();
    }
    @Test 
    public  void notTime (){
        int actual= t.trainCost("ma");
        assertEquals('n',actual);
    }
    @Test
    public  void eleven (){
        int actual= t.trainCost("11:00");
        assertEquals('F',actual);
    }
    @Test
    public  void eight (){
        int actual= t.trainCost("20:00");
        assertEquals('S',actual);
    }
    @Test
    public  void nine (){
        int actual= t.trainCost("09:00");
        assertEquals('F',actual);
    }
    @Test
    public  void boNine (){
        int actual= t.trainCost("09:30");
        assertEquals('F',actual);
    }
    @Test
    public  void boSeven (){
        int actual= t.trainCost("19:30");
        assertEquals('F',actual);
    }
    @Test
    public  void boFour (){
        int actual= t.trainCost("16:00");
        assertEquals('F',actual);
    }
    @Test
    public  void inNine (){
        int actual= t.trainCost("09:29");
        assertEquals('F',actual);
    }
    @Test
    public  void inNine2 (){
        int actual= t.trainCost("09:31");
        assertEquals('S',actual);
    }
    @Test
    public  void infour (){
        int actual= t.trainCost("15:59");
        assertEquals('S',actual);
    }
    @Test
    public  void infour2 (){
        int actual= t.trainCost("16:01");
        assertEquals('F',actual);
    }
    @Test
    public  void inSeven (){
        int actual= t.trainCost( "19:29");
        assertEquals('S',actual);
    }
    @Test
    public  void inSeven2 (){
        int actual= t.trainCost("19:31");
        assertEquals('F',actual);
    }
    @After
    public void tearDown()  {

    }

}