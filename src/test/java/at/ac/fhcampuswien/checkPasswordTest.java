package at.ac.fhcampuswien;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

//https://github.com/LuDanny/ProgExercise1

public class checkPasswordTest {
    @Test
    @DisplayName("Password length")
    public void lengthTest() {
        checkPassword pw = new checkPassword();
        assertTrue(pw.checkLength("Thispuuuuuurrrfect"));
        assertFalse(pw.checkLength("hi"));
        assertTrue(pw.checkLength("doingGoodIThink"));
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
        assertFalse(pw.checkCase("aslldankfjskdfhsdfh"));
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
        assertThrows(IllegalArgumentException.class, () -> pw.checkLength(null));
    }

    @Test
    @DisplayName("Test overall pw in one")
    public void finalTest(){
        checkPassword pw = new checkPassword();
        assertTrue(pw.checkPw("Abod30!jfishf/S"));
        assertFalse(pw.checkPw("asidj3983hkjc!"));
        assertFalse(pw.checkPw("AJSFZ38J<HUAICZS"));
        assertFalse(pw.checkPw("!j6dA"));
        assertFalse(pw.checkPw("fia!93HaOas<nA29"));
        assertFalse(pw.checkPw(""));
    }

    @Test
    @DisplayName("Stream test")
    public void streamTest(){
        checkPassword pw = new checkPassword();
        assertTrue (pw.checkNumStream("Hus!b23jsu1h8)hs"));
        assertFalse(pw.checkNumStream("H9asu123haki!k"));
        assertFalse(pw.checkNumStream("901hasHuak!bkas"));
        assertFalse(pw.checkNumStream("012u!bsUbaQjw2"));
    }
}
