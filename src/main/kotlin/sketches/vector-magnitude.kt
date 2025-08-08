/** import org.openrndr.application
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

        val vectorOrigin = Vector2(0.0, 0.0)
        val vectorCenter = Vector2(width/2.0, height/2.0)
        backgroundColor = ColorRGBa.WHITE
        //extend(NoClear())
        extend {
            val vectorL = Vector2((mouse.position - vectorCenter).length, 0.0)
            drawer.stroke = ColorRGBa.BLACK
            drawer.strokeWeight = 50.0
            drawer.lineSegment(vectorOrigin, vectorL)
            drawer.stroke = ColorRGBa.MAGENTA
            drawer.strokeWeight = 20.0
            drawer.lineSegment(vectorCenter, mouse.position)
            //drawer.circle(vectorPos, 25.0)
        }
    }

}**/
