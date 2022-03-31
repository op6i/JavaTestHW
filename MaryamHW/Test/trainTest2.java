import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by USER on 30/03/2022.
 */
public class trainTest2 {
    train t;
    @Before
    public void setUp()  {
        t=new train();
    }

    @Test
    public  void eight (){
        int actual= t.trainCost("20:00");
        assertEquals('S',actual);
    }
    @Test
    public  void inSeven2 (){
        int actual= t.trainCost("19:31");
        assertEquals('S',actual);
    }

}