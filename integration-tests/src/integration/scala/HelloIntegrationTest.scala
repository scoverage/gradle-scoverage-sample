import org.junit.Test
import org.junit.Assert.assertEquals

class HelloIntegrationTest {

  @Test def testText() {
    assertEquals("Hello Real World", new Hello().integrate)
  }

}
