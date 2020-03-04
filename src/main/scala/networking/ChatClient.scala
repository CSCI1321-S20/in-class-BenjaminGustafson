package networking

import java.io.BufferedReader
import java.io.InputStreamReader
import java.io.PrintStream
import java.net.Socket
import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global

object ChatClient extends App {
    val sock = new Socket("localhost", 4000)
    val in = new BufferedReader(new InputStreamReader(sock.getInputStream))
    val out = new PrintStream(sock.getOutputStream)
    var running = true
    Future {
        while(running){
            val p = in.readLine()
            println(p)
        }
    }  
    var input = ""
    while(input != ":quit"){
        val input = readLine()
        out.println(input)
    }
    sock.close
    running = false
}