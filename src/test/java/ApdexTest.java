// Nome: Otavio Miklos Nogueira
// RM: 554513

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.otaviomiklos.cp4_qa.Apdex;

public class ApdexTest {
    
    private Apdex apdex;
    private int total = 554513;

    private float excellent = 0.94F;
    private float good = 0.85F;
    private float fair = 0.70F;
    private float poor = 0.50F;

    @BeforeEach
    public void arrange() {
        this.apdex = new Apdex();
    }

    @Test
    public void validExcellentApdex() {
        float score = apdex.calcApdex(550000, 1000, total);
        boolean isExcellent = score >= excellent; // score >= 0.94
        assertTrue(isExcellent);
    }

    @Test
    public void validGoodApdex() {
        float score = apdex.calcApdex(500000, 2000, total);
        boolean isGood = score >= good && score < excellent; // 0.94 > score >= 0.85
        assertTrue(isGood);
    }

    @Test
    public void validFairApdex() {
        float score = apdex.calcApdex(400000, 3000, total);
        boolean isFair = score >= fair && score < good; // 0.85 > score >= 0.70
        assertTrue(isFair);
    }

    @Test
    public void validPoorApdex() {
        float score = apdex.calcApdex(300000, 4000, total);
        boolean isPoor = score >= poor && score < fair; // 0.70 > score >= 0.50
        assertTrue(isPoor);
    }

    @Test
    public void validBadApdex() {
        float score = apdex.calcApdex(100000, 5000, total);
        boolean isBad = score < poor; // 0.50 > score
        assertTrue(isBad);
    }

}
