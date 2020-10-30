fun main() {
    val f1: Point = Point()
    f1.x = 5F
    f1.y = 8F
    println(f1.toString())


}


class Point {
    var x = 0F
    var y = 1F
    override fun toString(): String {
        return "$x, $y"
    }

    override fun equals(other: Any?): Boolean {
        if (other is Point){
            if ((x==other.x) and (y==other.y)){
                return true
            }
        }
        return false
    }
    fun symetrical() {
        x = -x
        return println("y ღერძის მიმართ სიმეტრიული იქნება ($x,$y)")
    }

}