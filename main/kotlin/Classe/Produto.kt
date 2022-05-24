package Classe

class Produto constructor(

    val produto: String,  val preço : String) {


    fun valorMenor (produto: String, preço : String){

        if(preço in "45.00".."900.00"){

            println("O preço ficou no total de R$: $preço ")

        }else if ( preço in " 900.00" .. "1600.00" && produto == "" ){

            println("O preço ficou no total de R$ $preço")

        }else {

            println("Informações ínvalidas")

        }



    }

    fun valorMaior(produto: String, preço: String){

    if( preço in "900.00" .. "1600.00" && produto == ""   ){

        println("O preço ficou no total de R$ $preço")


    }else{

        println("Informações ínvalidas")



    }


    }


}







