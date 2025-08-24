// Nome: Otavio Miklos Nogueira
// RM: 554513

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.otaviomiklos.cp4_qa.Apdex;

public class ApdexTest {
    
    private Apdex apdex;
    private int total = 554513;

    @BeforeEach
    public void arrange() {
        this.apdex = new Apdex();
    }

    @Test
    public void validExcellentApdex() {
        float score = apdex.calcApdex(550000, 1000, total);
        assertEquals(0.99, score, 0.01);
    }

    @Test
    public void validGoodApdex() {
        float score = apdex.calcApdex(500000, 2000, total);
        assertEquals(0.90, score, 0.01);
    }

    @Test
    public void validFairApdex() {
        float score = apdex.calcApdex(400000, 3000, total);
        assertEquals(0.72, score, 0.01);
    }

    @Test
    public void validPoorApdex() {
        float score = apdex.calcApdex(300000, 4000, total);
        assertEquals(0.54, score, 0.01);
    }

    @Test
    public void validBadApdex() {
        float score = apdex.calcApdex(100000, 5000, total);
        assertEquals(0.18, score, 0.01);
    }

}
