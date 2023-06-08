import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class FelineTest {


    @Test
    public void checkOneKittenCountTest() {
        Feline testFeline = new Feline();
        int actualKittens = testFeline.getKittens();
        Assert.assertEquals(1, actualKittens);
    }

    @Test
    public void checkGetFamilyTest() {
        Feline testFeline = new Feline();
        String felineFamily = testFeline.getFamily();
        Assert.assertEquals("Кошачьи", felineFamily);

    }

    @Test
    public void checkEatMeatTest() throws Exception {
        Feline testFeline = new Feline();
        List<String> felineEatMeat = testFeline.eatMeat();
        Assert.assertEquals(List.of("Животные", "Птицы", "Рыба"), felineEatMeat);

    }

}
