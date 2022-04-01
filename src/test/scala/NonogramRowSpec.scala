import org.scalatest._
import flatspec._
import matchers._

class NonogramRowSpec extends AnyFlatSpec with should.Matchers {

  import NonogramRow._

  "methodNon" should "be Array(1, 1) for Array(1,0,1)" in {
    countOneConsecutive(Array(1,0,1)) shouldBe Array(1,1)
  }

  it should "be Array(1, 2) for Array(0,1,0,1,1)" in {
    countOneConsecutive(Array(0,1,0,1,1)) shouldBe Array(1,2)
  }

  it should "be Array(1, 2) for Array(0,0,0,1,0,1,1)" in {
    countOneConsecutive(Array(0,0,0,1,0,1,1)) shouldBe Array(1,2)
  }

  it should "be Array(1, 2) for Array(0,0,0,1,0,0,0,0,1,1,1)" in {
    countOneConsecutive(Array(0,0,0,1,0,0,0,0,1,1,1)) shouldBe Array(1,3)
  }

  it should "be Array(1, 2, 4) for Array(0,0,0,1,0,1,1,0,0,1,1,1,1)" in {
    countOneConsecutive(Array(0,0,0,1,0,1,1,0,0,1,1,1,1)) shouldBe Array(1,2,4)
  }
}