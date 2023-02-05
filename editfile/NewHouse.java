package editfile;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class NewHouse {
    public static void main(String[] args) throws ParseException {
        String date_s = " 2011-01-18 00:00:00.0";
        SimpleDateFormat dt = new SimpleDateFormat("yyyyy-mm-dd hh:mm:ss");
        Date date = dt.parse(date_s);
        SimpleDateFormat dt1 = new SimpleDateFormat("yyyyy-mm-dd");
        System.out.println(dt1.format(date));
    }
}
