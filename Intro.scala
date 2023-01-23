//Création d'un objet qui hérite de App
object c1 extends App {
  println("Bonjour")
}

//Création d'un objet avec une méthode main
object Main {
  def main(args: Array[String]): Unit = {
    println("Bonjour")
  }
}

//Déclaration de variables
val x = 10 //x est non modifiable
var y = 7 //y est modifiable

var y = 3 //Variable non typée (il est obligatoire de l'initialiser avec une valeur)
var x: Int = 0 //Variable typée (ici Int)

//Types de variables

//Numériques
var a: Short = 2 //Signés sur 2 octets
var b: Int = 3 //Signés sur 4 octets
var c: Long = 4l //Signés sur 8 octets 
var d: Float = 13.4f //Simple précision
var e: Double = 13.4e10 //Double précision

//Caractères
var ch: Char = 'A' //Sur 1 octet
var str: String = "Bonjour Alice !"

//Boolean
var bool: Boolean = true //2 valeurs possibles : true ou false

//Autres types
var n: Null = null //Pointeur null
var emp: Unit = () //Aucun type
var av: AnyVal = null //N'importe quelle valeur des types de base

//Structures de contrôle
//If/else
var a = 12
var b = 14

if(a < b) {
  println("a =" + a)
} else {
  println("b = "+ b)
}

//Structures de controle
var a = 12
var b = 14

var res = if(a < b) a else b //en scala, il est possible de retourner le résultat dans une variable
println("res = " + res)


// While:
var mr = 0
while(mr < 12) {
  println(mr)
  mr += 2
}

// For loops:
for (cmp <- 1 to 6) {
  println("cmp = " + cmp) // la boucle s'arrête à 6 (inclu)  to
}

for (cmp <- 1 until 6) {
  println("cmp = " + cmp) // la boucle s'arrête à 6 (exclu)  until
}

for (cmp <- 1 to 6; cmp2 <- 1 to 10 ) {
  println("cmp = " + cmp + "; cmp2 = " + cmp2) // boucle imbriquée cmp <- 1 to 6(cmp <- 1 to 10)
}

val liste = List(1,2,3,6)
for (elet <- liste) {
  println(elet) // parcourt la "liste"
}

val liste = List(1,2,3,6)
for (elet <- liste if elet > 3) {
  println(elet) // parcourt la "liste" et uniquement supérieur strict à 3
}

val liste = List(1,2,3,6)
val res = for (elet <- liste) yield elet + elet // retourne dans une variable le résultat d'une boucle for yield
println("Resultat liste : " + res) 

// Exemple de match/case en Scala

// Demander à l'utilisateur de saisir un entier
print("Entrez un entier : ")
val x = readInt()

// Associer l'entier à un cas spécifique
val res = x match {
  case 10 => x
  case 20 => x
  case 30 => x
  case _ => "ERREUR" // Cas par défaut
}

// Afficher le résultat
println("Résultat : " + res)

// Autre exemple de match/case avec plusieurs cas combinés
print("Entrez un entier : ")
val x = readInt()
val res = x match {
  case 10 | 20 | 30 | 40 | 50 => "Multiple de 10"
  case 3 | 9 | 15 => "Multiple de 3"
  case _ => "ERREUR" // Cas par défaut
}
println("Résultat : " + res)

// Exemple d'entrée/sortie en Scala
import scala.io.StdIn

object c1 extends App {
  println("Entrez un entier : ")
  val a = readInt() // readInt(),readShort(),readLong(),readDouble(),readFloat(),readChar(),readLine() //str
  println("a = " + a)
}

