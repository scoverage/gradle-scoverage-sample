import org.junit.Test
import org.junit.Assert.assertEquals

class HelloTest extends BaseTest {

  @Test def testText() {
    assertEquals("Hello World", new Hello().text)
  }

}
