fun main(args: Array<String>) {

    var cont=0
    var media = 0.0
    var nota = 0.0

    while(cont < 4){
        print("Informe a nota: ")
        nota= readLine()!!.toDouble()
        media += nota
        cont++
    }
    media = media / 4
    println("O valor da sua media é igual a: $media")

}


