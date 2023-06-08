import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class FelineParameterizedTest {
    public int kittensCount;
    public int expectedKittensCount;

    public FelineParameterizedTest(int kittensCount, int expectedKittensCount) {
        this.kittensCount = kittensCount;
        this.expectedKittensCount = expectedKittensCount;

    }

    @Parameterized.Parameters
    public static Object[][] countKittens() {
        return new Object[][]{
                {1, 1},
                {10, 10},
                {0, 0},
                {5, 5},
        };
    }

    @Test
    public void checkSeveralKittensCountTest() {
        Feline testFeline = new Feline();
        int actualKittens = testFeline.getKittens(kittensCount);
        Assert.assertEquals(expectedKittensCount, actualKittens);
    }

}
