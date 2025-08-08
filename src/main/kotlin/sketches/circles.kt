import org.openrndr.application
import org.openrndr.color.ColorRGBa
import org.openrndr.extra.noclear.NoClear
import org.openrndr.extra.noise.random
import org.openrndr.extra.olive.oliveProgram

// lovely right? that God is willing to take us all as His children, regardless of what we think about our self or Him.

/// By amani adam
/// "Random Circles"
/// this project helped me to test and verify :-
///     i.  live reloading by using the olive extension
///     ii. sketching like experience by enabling the no-clear extension.
/// God is great.
fun getRandomWithinBounds(y: Int) : Double {

    //TODO rewrite this as such every circle generated does not touch the bounds either in x or y direction
    // that is the circle is fully-contained

    return random(0.0, y.toDouble())
}

fun main() = application {

    configure {
        width = 768
        height = 576
    }

    oliveProgram {
        backgroundColor = ColorRGBa.WHITE
        extend(NoClear())
        extend {
            drawer.circle(getRandomWithinBounds(width),getRandomWithinBounds(height), 100.0)
        }
    }

}

