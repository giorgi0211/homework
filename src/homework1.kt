import kotlin.math.max

fun main () {
    val f1 = Fraction()
    f1.numerator = 5F
    f1.denominator = 10F

    val f2 = Fraction()
    f2.numerator = 6F
    f2.denominator = 9F
    println(f2.reduction())
    println(f1.addition(f2))
    println(f1.multiplication(f2))



}

class Fraction  {
    var numerator : Float = 0F
    var denominator : Float = 1F

    override fun toString(): String {
        return "$numerator/$denominator"
    }



    private fun usg(): Float {
        val x = numerator
        val y = denominator
        val maxNumber = max(x, y)
        var usg = 1
        for(i in maxNumber.toInt() downTo 0) {
            if(x.toInt()%i==0 && y.toInt()%i==0) {
                usg = i
                break
            }
        }
        return usg.toFloat()
    }

    fun reduction(): String {
        return " ${numerator/usg()}/${denominator/usg()}"
    }
    fun addition(other: Fraction): Fraction {
        val x = (numerator * other.denominator) + (other.numerator * denominator)
        val y = denominator * other.denominator
        val f3 = Fraction()
        f3.numerator = x
        f3.denominator = y
        return f3

    }
    fun multiplication(other: Fraction): Fraction {
        val x = numerator * other.numerator
        val y = denominator * other.denominator
        val f3 = Fraction()
        f3.numerator = x
        f3.denominator = y
        return f3
    }

}




