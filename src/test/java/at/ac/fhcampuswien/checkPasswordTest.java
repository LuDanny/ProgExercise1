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
        assertTrue(pw.checkLength("doingGoodIThink"));
    }
    @Test
    @DisplayName("Password length")
    public void lengthTest1() {
        checkPassword pw = new checkPassword();
        assertTrue(pw.checkLength("Thispuuuuuurrrfect"));
    }
    @Test
    @DisplayName("Password length")
    public void lengthTest2() {
        checkPassword pw = new checkPassword();
        assertFalse(pw.checkLength("hi"));
    }

    @Test
    @DisplayName("Password has numbers")
    public void testNum(){
        checkPassword pw = new checkPassword();
        assertFalse(pw.checkNum("ashdadkjcbsdgAS!"));
    }
    @Test
    @DisplayName("Password has numbers")
    public void testNum1() {
        checkPassword pw = new checkPassword();
        assertTrue(pw.checkNum("asdo83hkjksf"));
    }


    @Test
    @DisplayName("Password has right Characters")
    public void caseTest(){
        checkPassword pw = new checkPassword();
        assertFalse(pw.checkCase("laksdlasfj34lijasd"));
    }
    @Test
    @DisplayName("Password has right Characters")
    public void caseTest1() {
        checkPassword pw = new checkPassword();
        assertTrue(pw.checkCase("aoRight16o"));
    }
    @Test
    @DisplayName("Password has right Characters")
    public void caseTest2() {
        checkPassword pw = new checkPassword();
        assertFalse(pw.checkCase("ASDASKFAJG21JS"));
    }

    @Test
    @DisplayName("Check for special char")
    public void validTestSpecial(){
     checkPassword pw = new checkPassword();
        assertFalse(pw.checkChar("!%§=%()(%!§%"));
    }
    @Test
    @DisplayName("Check for special char")
    public void validTestSpecial1() {
        checkPassword pw = new checkPassword();
        assertTrue(pw.checkChar("asd(aU2has!der"));
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
        assertFalse(pw.checkPassword("asidj3983hkjc!"));

    }
    @Test
    @DisplayName("Test overall pw in one")
    public void finalTest1() {
        checkPassword pw = new checkPassword();
        assertTrue(pw.checkPassword("Abod30!jfishf/S"));
    }
    @Test
    @DisplayName("Test overall pw in one")
    public void finalTest2() {
        checkPassword pw = new checkPassword();
        assertFalse(pw.checkPassword("!j6dA"));
    }
    @Test
    @DisplayName("Test overall pw in one")
    public void finalTest3(){
        checkPassword pw = new checkPassword();
        assertFalse(pw.checkPassword(""));
    }
    @Test
    @DisplayName("Test overall pw in one")
    public void finalTest4(){
        checkPassword pw = new checkPassword();
        assertFalse(pw.checkPassword("2222Haishd!bc83acuhd"));
    }

    @Test
    @DisplayName("Test overall pw in one")
    public void finalTest5(){
        checkPassword pw = new checkPassword();
        assertFalse(pw.checkPassword("23hahc!uSHH890sakhfAhf"));
    }

    @Test
    @DisplayName("Stream test")
    public void streamTest(){
        checkPassword pw = new checkPassword();
        assertFalse(pw.checkNumStream("H9asu123haki!k"));
    }

    @Test
    @DisplayName("Stream test")
    public void streamTest1() {
        checkPassword pw = new checkPassword();
        assertTrue(pw.checkNumStream("Hus!b23jsu1h8)hs"));
    }

    @Test
    @DisplayName("Stream test")
    public void streamTest2() {
        checkPassword pw = new checkPassword();
        assertFalse(pw.checkNumStream("901hasHuak!bkas"));
    }

    @Test
    @DisplayName("Same numbers")
    public void rowNum(){
        checkPassword pw = new checkPassword();
        assertTrue((pw.checkRow("333hals!jdi222cjaAs#")));
    }

    @Test
    @DisplayName("Same numbers")
    public void rowNum1() {
        checkPassword pw = new checkPassword();
        assertFalse(pw.checkRow("Ajs1111j!seJ85h"));
    }
}
