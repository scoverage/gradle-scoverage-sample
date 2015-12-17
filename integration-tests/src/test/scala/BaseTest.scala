import org.junit.Before

trait BaseTest {
  @Before
  def beforeTest() = {
    println("Running test!")
  }
}
