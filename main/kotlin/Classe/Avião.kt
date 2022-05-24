package Classe

data class Avião constructor(
    val compania : String, val nome : String,
    val classe : String, val destino : String) {



}

fun destino( destino: String  ){

    if ( destino =="São Paulo" && destino != "" ){

        println( "O preço da passagem ficou no total de R$: 1500.00\n" )

    }else if (destino == "Orlando" && destino != "" ) {

        println( "O preço da passagem ficou no total de  de R$: 5500.00\n" )

    }else if( destino == "Dubai" && destino != "" ){

        println( "O preço da passagem ficou no total de R$: 10.800\n" )

    }else if ( destino == "França" && destino != "" ){

        println( "O preço da passagem ficou no total de R$: 7000.00\n" )

    }else if ( destino == "Alemanha " && destino != "" ){

        println( "O preço da passagem ficou no total de R$: 5000.00\n" )

    }else{

        println("Informações invalídas")

    }


}