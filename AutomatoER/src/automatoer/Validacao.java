package automatoer;

public class Validacao {
    
        public boolean validateAlphabet(String value) {

        boolean returnValue = false;
        char[] fragmentedValue = value.toCharArray();

        for (int i = 0; i < fragmentedValue.length; i++) {
            if (Character.isAlphabetic(fragmentedValue[i])) {
                returnValue = true;
                break;
            }
        }
        return returnValue;
    }
    
}
