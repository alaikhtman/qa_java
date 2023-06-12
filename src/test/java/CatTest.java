import com.example.Cat;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;



@RunWith(MockitoJUnitRunner.class)
public class CatTest {


    @Mock
    Feline feline;

    @Test
    public void checkGetSoundTest() {

        Cat testCat = new Cat(feline);
        Assert.assertEquals("Мяу", testCat.getSound());

    }

    @Test
    public void checkGetFoodTest() throws Exception {

        Cat testCat2 = new Cat(feline);
        testCat2.getFood();
        Mockito.verify(feline, Mockito.times(1)).eatMeat();

    }
}
