package graphics

object Game {
    def main(args:Array[String]):Unit = {
        val e1 = new Entity(0,0)
        val e2 =  new Entity(0.5,0.5)
        println(e1.intersects(e2))
    }
}