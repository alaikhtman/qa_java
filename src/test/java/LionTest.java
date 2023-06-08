import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

   @Mock
    Feline feline;

    @Test
    public void checkGetKittensTest() throws Exception {
        Lion testLion = new Lion("Самец", feline);
        testLion.getKittens();
        Mockito.verify(feline, Mockito.times(1)).getKittens();


    }


    @Test
    public void checkGetFoodTest() throws Exception {
        Lion testLion = new Lion("Самец", feline);
        testLion.getFood();
        Mockito.verify(feline, Mockito.times(1)).getFood("Хищник");

    }

}
