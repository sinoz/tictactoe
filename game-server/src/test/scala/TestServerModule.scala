import org.scalatest.FlatSpec

final class TestServerModule extends FlatSpec {
  val myCollection = List()

  "My collection" should "be empty" in {
    assert(myCollection.isEmpty)
  }
}
