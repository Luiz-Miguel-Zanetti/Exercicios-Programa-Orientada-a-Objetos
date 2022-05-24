package Main

import Classe.Avião
import Classe.Produto

fun main(){

    println("                       Bem vindo. Para começarmos, digite uma das opções abaixo             ")

    println()
    println("1- Boneca / Carrinho / Bola de futebol ")
    print("2- Fogão   / Geladeira ")

    println("\nOpção escolhida: ")
    val opçãoEscolhida = readln()

    println(" Digite o valor entre R$ 45.00 e 1600.00 que deseja gastar:  ")
    val valor = readln().toString()

    val avião = Produto( opçãoEscolhida, valor )

    if( opçãoEscolhida == "1" ){

        avião.valorMenor(opçãoEscolhida, valor)

    }else if(opçãoEscolhida == "2" && opçãoEscolhida != ""){

        avião.valorMaior(opçãoEscolhida, valor)

    }else{

    println("Informações ínvalidas")

    }


}