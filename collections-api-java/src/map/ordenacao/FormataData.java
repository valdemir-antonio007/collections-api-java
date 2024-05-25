package map.ordenacao;

import java.time.LocalDate;

public class FormataData {

    public static LocalDate formataData(String data){
        String str[] = data.split("/");
        LocalDate data1 = LocalDate.of(Integer.parseInt(str[2]),Integer.parseInt(str[1]),Integer.parseInt(str[0]));

        return  data1;
    }
}
