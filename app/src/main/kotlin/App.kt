package junseok.snr.kotlin.app

import junseok.snr.kotlin.utils.Printer

// This is the main entry point of the application.
// It uses the `Printer` class from the `:utils` subproject.
fun main() {
    val message = "Hello JetBrains!"
    val printer = Printer(message)
    printer.printMessage()
}