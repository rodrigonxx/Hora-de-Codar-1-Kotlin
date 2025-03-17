fun main() {

    //DOUBLE é igual a REAL do PORTUGOL

    var formas: Int
    var raio: Double
    var b_maior: Double
    var b_menor: Double
    var b: Double
    var alt: Double
    var d_maior: Double
    var d_menor: Double
    var retangulo: Double
    var quadrado: Double
    var losango: Double
    var trapezio: Double
    var paralelograma: Double
    var triangulo: Double
    var circulo: Double
    val pi = 3.14 //Não precisa declarar como DOUBLE, o programa entende que é um numero DOUBLE
    println("Formas:")

    println("1) Retângulo")
    println("2) Quadrado")
    println("3) Losango")
    println("4) Trapézio")
    println("5) Paralelograma")
    println("6) Triângulo")
    println("7) Círculo")

    print("Digite a Forma Escolhida: ")

    formas = readln().toInt()

    //WHEN é utilizado para permitir que o usuario escolha algumas das formas apresentadas para ele

    when (formas) {
        1 -> { //RETÂNGULO
            println("Informe o valor da Base: ")
            b = readln().toDouble()

            println("Informe o valor da Altura: ")
            alt = readln().toDouble()

            println("Retângulo: " + b * alt)
        }

        2 -> { //QUADRADO
            println("Informe o valor da Base: ")
            b = readln().toDouble()

            println("Informe o valor da Base: ")
            b = readln().toDouble()

            println("Quadrado: " + b * b)
        }

        3 -> { //LOSANGO
            println("Informe o valor da Diagonal Maior: ")
            d_maior = readln().toDouble()

            println("Informe o valor da Diagonal menor: ")
            d_menor = readln().toDouble()

            // primeiro e ultimo "(" e utilizado PARA LER a conta,1 enquanto o
            // 2º "(" e utilizado PARA FAZER a conta

            println("Losango: " + (d_maior * d_menor) / 2)

        }

        4 -> { //TRAPÉZIO
            println("Informe o valor da Base Maior: ")
            b_maior = readln().toDouble()

            println("Informe o valor da Base Menor: ")
            b_menor = readln().toDouble()

            println("Informe o valor da Altura: ")
            alt = readln().toDouble()

            println("Trapézio: " + (b_maior + b_menor) * alt / 2)

        }

        5 -> { //PARALELOGRAMA
            println("Informe o valor da Base: ")
            b = readln().toDouble()

            println("Informe o valor da Altura: ")
            alt = readln().toDouble()

            println("Paralelograma: " + b * alt)
        }

        6 -> { //TRIÂNGULO
            println("Informe o valor da Base: ")
            b = readln().toDouble()

            println("Informe o valor da Altura: ")
            alt = readln().toDouble()

            println("Triângulo: " + b * alt/2)
        }

        7 -> { //CÍRCULO
            println("Informe o valor de Raio: ")
            raio = readln().toDouble()

            println("Círculo: " + pi * raio * raio)
        }
    }
}



