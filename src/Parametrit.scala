object Parametrit {
def main(args: Array[String]) {
var args2 : List[String] = args.toList
println(args2)
args2.sortWith((s, t) => s.toLowerCase < t.toLowerCase)
args2.foreach(arg => print(arg))
}
  }