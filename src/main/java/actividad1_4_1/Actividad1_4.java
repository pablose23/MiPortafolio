/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package actividad1_4_1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author centr
 */
public class Actividad1_4 {

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf= new SimpleDateFormat("dd-MM-yyyy");
        Date d= new Date();
        System.out.println(sdf.format(d));
        
        String s= "10-10-2010";
        try {
                    d=sdf.parse(s);
        } catch (Exception e) {
            System.out.println("Hubo un error con la fecha");
        }
        System.out.println(d.toString());
    }
}
