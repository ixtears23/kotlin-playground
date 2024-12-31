package junseok.snr.kotlin.app.junseok.snr.kotlin.app.`fun`


fun log(level: String = "INFO", message: String) {
    println("[$level]$message")
}

fun main() {
  log(message = "인포 로그")
  log(level = "DEBUG", "디버그 로그")
  log("WARN", "워닝 로그")
  log(level = "ERROR", "에러 로그")
}


