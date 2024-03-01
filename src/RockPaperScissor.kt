class RockPaperScissor {
    private var playerOne : Int = -1
    private var playerTwo : Int = -1

    private fun printHeader(){
        println(""""
            ===============================
            Gunting Batu Kertas
            ===============================
            0. Rock
            1. Paper
            2. Scissor
        """.trimIndent())
    }

    private fun inputPlayerOne(){
        print("Masukkan pilihan Player 1: ")
        playerOne = readln().toInt()
    }

    private fun inputPlayerTwo(){
        print("Masukkan pilihan Player 2: ")
        playerTwo = readln().toInt()
    }

    private fun showResult(a: Int, b: Int) : String{
        return if (((a + 1) % 3) == b){
            "Player 2 Menang"
        }else if (a == b){
            "Seri"
        }else{
            "Player 1 Menang"
        }
    }

    fun run(){
        printHeader()
        inputPlayerOne()
        inputPlayerTwo()
        showResult(playerOne, playerTwo)
    }
}