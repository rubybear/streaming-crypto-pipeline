import sttp.client3.{SimpleHttpClient, UriContext, basicRequest}
import sttp.client3.upicklejson._
import upickle.default._
import java.time.LocalDateTime
import java.util.Date

object ResponseParsing {
  val client = SimpleHttpClient()

  val response = client.send(
    basicRequest
      .get(uri"https://api.coincap.io/v2/assets")
      .response(asJson[CryptoData])
  )

  val cryptoData = response.body match {
    case Right(data) => data
  }

}
