package graphics

class Entity (val x:Double, val y:Double){
    def width:Double = 1
    def height:Double = 1
    def intersects(e:Entity) = (e.x-x).abs < (e.width+width)/2 && (e.y-y).abs < (e.height+height)/2

}
