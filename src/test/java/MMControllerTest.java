
import miw.controller.MMController;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MMControllerTest {
    private MMController mm = new MMController();

    @Test
    void testMMController(){
        assertEquals(mm.answer.length(), 4);
    }
}
