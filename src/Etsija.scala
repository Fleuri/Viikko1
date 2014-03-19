import scala.io.Source
object Etsija extends App {

  if (args.length > 0) {
    println("Anna etsittävä sana")
    val sana = readLine
    var lineNumber = 1;
    for (line <- Source.fromFile(args(0)).getLines) {
      if(line.contains(sana)) println(lineNumber +" "+ line)
      lineNumber += 1;
    }
  }
  else
    Console.err.println("Please enter filename")
  
}