public class FormataCep {

    public static void main(String[] args) {

    }

    public static String formataCep(String cep) throws CepInvalidoException{
        if(cep.length() != 8){
            throw new CepInvalidoException();
        }
        return cep;
    }
}
