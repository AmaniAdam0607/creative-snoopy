/**import org.openrndr.application
import org.openrndr.color.ColorRGBa
import org.openrndr.extra.olive.oliveProgram
import org.openrndr.math.Vector2

/// By amani adam
fun main() = application {

    configure {
        width = 768
        height = 576
    }

    oliveProgram {

        var vectorPos = Vector2(100.0, 100.0)
        var vectorVel = Vector2(1.0, 3.3)
        val yd = Vector2(1.0, -1.0)
        val xd = Vector2(-1.0, 1.0)

        backgroundColor = ColorRGBa.WHITE
        //extend(NoClear())
        extend {
            if ( vectorPos.x > width || vectorPos.x < 0) {
                vectorVel *= xd
            }
            if ( vectorPos.y > height || vectorPos.y < 0) {
                vectorVel *= yd
            }
            vectorPos += vectorVel
            //drawer.stroke = ColorRGBa.BLACK
            drawer.fill = ColorRGBa.MAGENTA
            drawer.circle(vectorPos, 25.0)
        }
    }

}
**/
