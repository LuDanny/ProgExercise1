package at.ac.fhcampuswien;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

public class checkPasswordTest {
    @Test
    @DisplayName("Password length")
    public void lengthTest() {
        checkPassword pw = new checkPassword();
        assertTrue(pw.checkPw("ThisIsPerfect"));
        assertFalse(pw.checkPw("OhNo"));
        assertTrue(pw.checkPw("AnotherPerfectOne"));
    }

    @Test
    @DisplayName("Password has right Characters")
    public void validTest5(){
        checkPassword pw = new checkPassword();
        assertTrue(pw.checkPw("aoRighto"));
    }

    @Test
    @DisplayName("Password has special char")
    public void validTest6(){
     checkPassword pw = new checkPassword();
        assertTrue(pw.checkChar("asd(aU2has!der"));
    }

    @Test
    @DisplayName("Has no special char")
    public void validTest7(){
     checkPassword pw = new checkPassword();
        assertFalse(pw.checkChar("Sasofo8heZas"));
    }


    @Test
    @DisplayName("Test password value null")
    public void validTest4(){
        checkPassword pw = new checkPassword();
        assertThrows(IllegalArgumentException.class, () -> pw.checkPw(null));
    }
}
