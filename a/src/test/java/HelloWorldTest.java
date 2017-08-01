
import org.junit.*;
import static org.junit.Assert.*;


public class HelloWorldTest {
   
    @Test
    public void test() {
         HelloWorld main = new HelloWorld();
         assertNotNull(main);
    }
}