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
        assertFalse(pw.checkPw("hi"));
        assertTrue(pw.checkPw("AnotherPerfectOne"));
    }

    @Test
    @DisplayName("Password has numbers")
    public void testNum(){
        checkPassword pw = new checkPassword();
        assertTrue(pw.checkNum("asdo83hkjksf"));
        assertFalse(pw.checkNum("ashdadkjcbsdgAS!"));
    }


    @Test
    @DisplayName("Password has right Characters")
    public void caseTest(){
        checkPassword pw = new checkPassword();
        assertTrue(pw.checkCase("aoRight16o"));
        assertFalse(pw.checkCase("laksdlasfj34lijasd"));
        assertFalse(pw.checkCase("ASDASKFAJG21JS"));
    }

    @Test
    @DisplayName("Check for special char")
    public void validTestSpecial(){
     checkPassword pw = new checkPassword();
        assertTrue(pw.checkChar("asd(aU2has!der"));
        assertFalse(pw.checkChar("Sasofo8heZas"));
        assertFalse(pw.checkChar("!%§=%()(%!§%"));
    }


    @Test
    @DisplayName("Test password value null")
    public void validTest4(){
        checkPassword pw = new checkPassword();
        assertThrows(IllegalArgumentException.class, () -> pw.checkPw(null));
    }
}
