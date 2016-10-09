import org.scalatest.FlatSpec

final class TestClientModule extends FlatSpec {
  val myCollection = List()

  "My collection" should "be empty" in {
    assert(myCollection.isEmpty)
  }
}
