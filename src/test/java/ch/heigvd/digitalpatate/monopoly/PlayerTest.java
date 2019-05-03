package ch.heigvd.digitalpatate.monopoly;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {

    private Player p;
    @BeforeEach
    void init(){
        this.p=new Player("TestPlayer",new Cup(new Die(6),new Die(6)),new Board());
    }

    @ParameterizedTest
    @ValueSource(ints = 1500)
    void playerShoudlHaveMoney(int param){
        assertEquals(p.getNetWorth(),param);

    }

    @Test
    void addANegativeCashValueShouldThrow(){
        assertThrows(IllegalArgumentException.class,()->p.addCash(-10));
    }
    @Test
    void addCashShouldRetrunADifferentValue() {
        int beforeCash = p.getNetWorth();
        p.addCash(100);

        assertNotEquals(beforeCash,p.getNetWorth());
    }

    @Test
    void cashSouldNotBeNull() {
        assertNotNull(p.getNetWorth());
    }

    @Test
    void reduceCashShouldRetrunADifferentValue() {
        int beforeCash = p.getNetWorth();
        p.reduceCash(100);
        assertNotEquals(beforeCash,p.getNetWorth());
    }
    @Test
    void reduceANegativeCashValueShouldThrow(){
        assertThrows(IllegalArgumentException.class,()->p.reduceCash(-10));
    }
    @Test
    void connatReduceMoneyUnderZero(){
        assertThrows(RuntimeException.class,()->p.reduceCash(10000));

    }

    @Test
    void getPiece() {
        assertNotNull(p.getPiece());
    }
}