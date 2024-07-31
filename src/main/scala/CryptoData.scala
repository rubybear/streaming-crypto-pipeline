import upickle.default._

case class Crypto(
  id: String,
  rank: Int,
  symbol: String,
  name: String,
  supply: BigDecimal,
  maxSupply: BigDecimal,
  marketCapUsd: BigDecimal,
  volumeUsd24Hr: BigDecimal,
  priceUsd: BigDecimal,
  changePercent24Hr: BigDecimal,
  vwap24Hr: BigDecimal,
  explorer: String
) derives ReadWriter

final case class CryptoData(data: List[Crypto], timestamp: Long)
    derives ReadWriter
