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
        for (int i= 0; i < password.length(); i++){
            char ch = password.charAt(i);
            for (int j = 0; j <charCheck.length; j++) {
                if (charCheck[j] == ch) {
                    return true;
                }
            }
        }
        return false;
    }
}
