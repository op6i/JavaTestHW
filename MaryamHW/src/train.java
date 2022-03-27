import com.sun.jdi.LongType;
import com.sun.tools.corba.se.idl.constExpr.Expression;
import com.sun.tools.corba.se.idl.constExpr.Times;
import java.time.LocalTime; // import the LocalTime class
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

import static com.sun.tools.doclint.Entity.nabla;
import static com.sun.tools.doclint.Entity.or;

/**
 * Created by Computer on 25/03/2022.
 */
public class train {
    //S= saver ticket
    //F=full fare
    //n= invalid input
    public char trainCost (String time){
        try {
            String four = "16:00";
            String seven = "19:30";
            String nine = "09:30";
            LocalTime fourTime = LocalTime.parse(four);
            LocalTime sevenTime = LocalTime.parse(seven);
            LocalTime nineTime = LocalTime.parse(nine);
            LocalTime userTime = LocalTime.parse(time);

            if ( (userTime.isBefore(nineTime) && userTime.isAfter (fourTime))|| userTime.isAfter (sevenTime)){
                return 'S';
            }
            else return 'F';
        }
        catch (Exception e){
            return 'n';
        }
        }}


