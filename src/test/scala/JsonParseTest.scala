import upickle.default._
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class JsonParseTestSpec extends AnyFlatSpec with Matchers {
  "JsonParseTest" should "correctly parse the JSON data" in {
    val json = """{
  "data": [
    {
      "id": "bitcoin",
      "rank": "1",
      "symbol": "BTC",
      "name": "Bitcoin",
      "supply": "19733525.0000000000000000",
      "maxSupply": "21000000.0000000000000000",
      "marketCapUsd": "1309220023968.9287764761598500",
      "volumeUsd24Hr": "10144839581.4537413471029839",
      "priceUsd": "66344.9649248640968340",
      "changePercent24Hr": "-0.5915374558009233",
      "vwap24Hr": "66338.5681583185897534",
      "explorer": "https://blockchain.info/"
    }],
      "timestamp": 1722389030738
  }
    """
    val cryptoData = read[CryptoData](json)

    cryptoData.data.head.id shouldBe "bitcoin"
    cryptoData.data.head.rank shouldBe 1
    cryptoData.data.head.symbol shouldBe "BTC"
    cryptoData.data.head.name shouldBe "Bitcoin"
  }

}
