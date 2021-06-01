package at.ac.fhcampuswien;

public class checkPassword {
    public boolean checkPw(String password){
        if(password == null){
            throw new IllegalArgumentException("Password is null.");
        }
        return password.length() >= 8 && password.length() <= 25;
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

    public boolean checkCase(String password){

        return false;
    }
}
