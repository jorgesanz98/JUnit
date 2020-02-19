package FechaExamen;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Fecha {

    public static String getFechaConFormato(int tipo) {
        SimpleDateFormat formato;
        Date hoy = new Date();
        String cad = "";
        switch (tipo) {
            case 1: {
                formato = new SimpleDateFormat("yyyy/MM");
                cad = formato.format(hoy);
                break;
            }
            case 2: {
                formato = new SimpleDateFormat("MM/yyyy");
                cad = formato.format(hoy);
                break;
            }
            case 3: {
                formato = new SimpleDateFormat("MM/yy");
                cad = formato.format(hoy);
                break;
            }
            default: {
                cad = "ERROR";
            }
        }
        return cad;
    }
}