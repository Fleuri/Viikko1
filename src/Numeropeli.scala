object Numeropeli extends App {
var saldo = 0;

  while (true) {
  
  println("Arvaa luku") 
  val luku1: Int = readInt
  val luku2: Int = readInt
  val luku3: Int = readInt
  val list = Seq(luku1,luku2,luku3);
 
  val koneenLuku = (10*math.random).toInt
  println("Koneen luku oli: " + koneenLuku)


  if (luku1==koneenLuku) saldo += 400;
  if (luku2==koneenLuku) saldo += 200;
  if (luku3==koneenLuku) saldo += 100;
  if (!list.contains(koneenLuku)) saldo -= 100;
  
  println("Saldosi: " + saldo)
  
}


}