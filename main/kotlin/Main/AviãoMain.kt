import Classe.Avião
import Classe.destino

fun main(){
    /*

    2) Crie uma classe avião e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto avião, defina as instancias deste
objeto e apresente as informações deste objeto no console.

     */

    print("Qual o seu nome:  ")
    val nome = readln()

   print("Digite a compania da sua viagem: ")
    val compania = readln()

    print("Digite a classe da sua viagem: ")
    val classe = readln()

    print("Qual o seu destino:  ")
    val destino = readln()

    val avião = Avião(compania, nome, classe, destino)
    destino(destino)

      println( "                                       Compra de passagem finalizada!            " )
      println( "Informações da passagem: " )
      println("\nNome do passageiro: $nome")
      println("Companhia área:  $compania")
      println("O seu destino: $destino")
      println("Classe: $classe")



}