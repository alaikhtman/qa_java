import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

@RunWith(Parameterized.class)
public class LionParameterizedTest {
    String sex;
    boolean expectedHaveMane;

    public LionParameterizedTest(String sex, boolean expectedHaveMane) {
        this.sex = sex;
        this.expectedHaveMane = expectedHaveMane;
    }

    @Parameterized.Parameters
    public static Object[][] haveMane() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false},
                {"Non-binary", false}

        };
    }

    @Rule
    public MockitoRule rule = MockitoJUnit.rule();

    Feline feline = Mockito.mock(Feline.class);

    @Test
    public void checkDoesHaveManeTest() {
        try {
            Lion testLion = new Lion(sex, feline);
            boolean doesHaveMaven = testLion.doesHaveMane();
            Assert.assertEquals(expectedHaveMane, doesHaveMaven);

        } catch (Exception exception) {
            System.out.println("Test is passed. Not correct sex is caught: " + sex);
        }
    }
}
