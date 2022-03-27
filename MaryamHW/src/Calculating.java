/**
 * Created by Computer on 25/03/2022.
 */
public class Calculating {
    public int binifits(int balance){
        if (balance < 0){
            throw new IllegalStateException("invalid");
        }
        else if (balance < 100 ) return 3;
        else if (balance < 1000 ) return 5;
        else return 7;
    }
}
