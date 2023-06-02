package templatemethod

import java.io.File

fun main(){
    val logDir = "C:\\Users\\Moises Carrasco\\Documents\\AbstractFactory\\src\\mediator.mediat.main\\kotlin\\logs"
    val processDir = "C:\\Users\\Moises Carrasco\\Documents\\AbstractFactory\\src\\mediator.mediat.main\\kotlin<\\process"
    val files = arrayOf("C:\\Users\\Moises Carrasco\\Documents\\AbstractFactory\\src\\mediator.mediat.main\\kotlin\\abc.drug",
        "C:\\Users\\Moises Carrasco\\Documents\\AbstractFactory\\src\\mediator.mediat.main\\kotlin\\123.grys" )
    println("> Monitoring start")

    val fileDrug = File(files[0])

    DrugstoreFileProcess(fileDrug, logDir, processDir).execute()

    println("File processed  > " + fileDrug.name)

    val fileGry = File(files[1])
    GroceryFileProcess(fileGry, logDir, processDir).execute()
    println("File processed  > " + fileGry.name)

}