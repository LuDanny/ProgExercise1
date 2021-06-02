package at.ac.fhcampuswien;

public class checkPassword {
    public boolean checkLength(String password){
        if(password == null){
            throw new IllegalArgumentException("Password is null.");
        }
        return password.length() >= 8 && password.length() <= 25;
    }


    public boolean checkPassword(String password){
        if (checkLength(password) == true && checkChar(password) == true && checkCase(password) == true && checkNum(password) == true && checkNumStream(password)==true && checkRow(password)==true)
            return true;
        return false;
    }

    public boolean checkChar(String password){
        char[] charCheck = {'(', ')', '#', '$', '!', '?', '%', '/', '@'};
        char[] invalid = {'"', '§', '&', '=', '´', '*', '-', '^', '°', '{', '[', ']', '}', '´', '+', '~', ',', '.', ';', ':', '_', '€', '<', '>', '|',
                'µ'};
        for (int i= 0; i < password.length(); i++){
            char ch = password.charAt(i);
            for(int k = 0; k < invalid.length; k++){
                if(invalid[k] == ch){
                    return false;
                }
            }
        }
        for (int i = 0; i< password.length(); i++){
            char ch = password.charAt(i);
            for (int j = 0; j <charCheck.length; j++) {
                if (charCheck[j] == ch) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean checkNum(String password){
        char[] numCheck = {'1', '2', '3', '4', '5', '6', '7', '8', '9', '0'};
        for (int i = 0; i < password.length(); i++){
            char num = password.charAt(i);
            for (int j = 0; j < numCheck.length; j++){
                if (numCheck[j] == num){
                    return true;
                }
            }
        }
        return false;
    }

    public boolean checkCase(String password) {
        if (checkLower(password) == true && checkUpper(password) == true){
            return true;
        }
        return false;
    }

    public boolean checkLower(String password){
        char[] lower = {'q', 'w', 'e', 'r', 't','z', 'u','i','o','p','ü','a','s','d','f','g','h','j','k','l','ö','ä','y','x','c','v','b','n','m'};
        for (int i = 0; i < password.length(); i++){
            char low = password.charAt(i);
            for (int j = 0; j < lower.length; j++){
                if (lower[j] == low){
                    return true;
                }
            }
        }return false;
    }

    public boolean checkUpper(String password){
        char[] upper = {'Q', 'W', 'E', 'R', 'T','Z', 'U','I','O','P','Ü','A','S','D','F','G','H','J','K','L','Ö','Ä','Y','X','C','V','B','N','M'};
        for (int i = 0; i < password.length(); i++){
            char up = password.charAt(i);
            for (int j = 0; j < upper.length; j++){
                if (upper[j] == up){
                    return true;
                }
            }
        }return false;
    }

    public boolean checkNumStream(String password){
        char[] numCheck = {'0','1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '1'};
        for (int i = 0; i < password.length()-2; i++){
            if (Character.isDigit(password.charAt(i))){
                for (int j = 0; j < numCheck.length; j++){
                    if (numCheck[j] == password.charAt(i)){
                        if (numCheck[j+1] == password.charAt(i+1)){
                            if (numCheck[j+2] == password.charAt(i+2)){
                                return false;
                            }else break;
                        }else break;
                    }
                }
            }
        }
        return true;
    }

    public boolean checkRow(String password){
        for (int i = 0; i < password.length(); i++){
            if (Character.isDigit((password.charAt(i)))){
                if (password.charAt(i) == password.charAt(i+1) && password.charAt(i) == password.charAt(i+2) && password.charAt(i) == password.charAt(i+3)) return false;
            }
        }
        return true;
    }
}
