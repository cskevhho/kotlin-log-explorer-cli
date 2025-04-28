package org.example
import com.github.ajalt.clikt.core.CliktCommand
import com.github.ajalt.clikt.core.main
import com.github.ajalt.clikt.core.subcommands
import com.github.ajalt.clikt.parameters.options.option
import com.github.ajalt.clikt.parameters.options.pair

// thank you Clikt for building --help for me :')

class Klex: CliktCommand(name = "klex") {
    val since by option(help="Takes in <number><unit>, s,m,h,d -- default 1h")
    val level by option(help="Takes in <level> -- <INFO><WARN><ERROR>")
    val pattern by option(help="Takes in <regex>")
    override fun run() = Unit
}

//class Hello: CliktCommand() {
//    override fun run() {
//        echo("Hello World")
//    }
//}
//
//class Tester: CliktCommand() {
//   override fun run() {
//        echo("This is a test run")
//    }
//}

fun main(args: Array<String>) = Klex()
    .main(args)