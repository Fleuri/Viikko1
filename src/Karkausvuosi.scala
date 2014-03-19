object Karkausvuosi extends App {
println("Anna vuosiväli")
var Alkuvuosi = readInt
var Loppuvuosi = readInt
if (Alkuvuosi < Loppuvuosi) nouseva(Alkuvuosi, Loppuvuosi) else laskeva(Alkuvuosi, Loppuvuosi); 

def nouseva (av: Int, lv: Int) {
  var tmp = av
  while (tmp <= lv) {
    karkausvuosi(tmp);
    tmp += 1 
  }
}
def laskeva (lv: Int, av: Int) {
  var tmp = lv;
  while (tmp >= av) {
    karkausvuosi(tmp);
    tmp -= 1 
  }
}
def karkausvuosi(vuosi: Int) {
if (vuosi % 4 == 0  && (vuosi % 100 != 0 || vuosi % 400 == 0 ) && vuosi != 4000) println(vuosi)
}
}