package at.ac.fhcampuswien;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {
    private static checkPassword pw;

    @Test
    @DisplayName("Password valid length")
    public void validTest1(){
        assertTrue(pw.checkPw("pass12"));
    }

    @Test
    @DisplayName("Password has right Characters")
    public void validTest5(){
        assertTrue(pw.checkPw("aoRighto"));
    }

    @Test
    @DisplayName("Password has special char")
    public void validTest6(){
        assertTrue(pw.checkChar("asd(aU2has!der"));
    }

    @Test
    @DisplayName("Has no special char")
    public void validTest7(){
        assertFalse(pw.checkChar("Sasofo8heZas"));
    }

    @Test
    @DisplayName("Password too short")
    public void validTest2(){
        assertFalse(pw.checkPw("hi"));
    }

    @Test
    @DisplayName("Password too long")
    public void validTest3(){
        assertFalse(pw.checkPw("oahfw398rziuhwifhwuejfhw98rzhicuh938fhwofh298fhweifu249gufwue"));
    }

    @Test
    @DisplayName("Test password value null")
    public void validTest4(){
        assertThrows(IllegalArgumentException.class, () -> pw.checkPw(null));
    }
}

