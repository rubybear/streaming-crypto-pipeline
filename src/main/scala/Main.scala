import ResponseParsing.cryptoData
import upickle.default.*


object Main extends App {
  // fetch data
  val data = cryptoData

  // save data to disk as JSON
  os.write.append(os.pwd / "crypto-data.json", write(data))
}
