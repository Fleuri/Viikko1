
import java.math

object Kolmio extends App{
  println("Anna korkeus")
  var korkeus = readInt
  var tahtia = 1;
  var valeja = korkeus -1;
  while (valeja >= 0) {
    printSpaces(valeja)
    printStars(tahtia)
    printSpaces(valeja)
    tahtia += 2
    valeja -= 1
    println("")
  }  
println("Moi")

def printSpaces(valeja: Double) {
  var counter = 0;
  while (counter < valeja) {
    print(" ")
    counter += 1
  }
}
  def printStars(tahtia: Double) {
  var counter = 0;
  while (counter < tahtia) {
    print("*")
    counter += 1
  }
}

}