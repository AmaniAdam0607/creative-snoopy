/**import org.openrndr.application
import org.openrndr.color.ColorRGBa
import org.openrndr.color.rgb
import org.openrndr.extra.gui.GUI
import org.openrndr.extra.noclear.NoClear
import org.openrndr.extra.noise.gaussian
import org.openrndr.extra.olive.oliveProgram
import org.openrndr.extra.parameters.Description
import org.openrndr.extra.parameters.DoubleParameter

/// By amani adam
/// Qn:: "Consider a simulation of paint splatter drawn as a collection of colored dots.
//       Most of the paint clusters around a central position, but some dots splatter out toward the edges.
//       Can you use a normal distribution of random numbers to generate the positions of the dots?
//       Can you also use a normal distribution of random numbers to generate a color palette?
//       Try creating a slider to adjust the standard deviation. " - copied from nature of code (https://natureofcode.com/random/)

// my solution
// learned about orx-gui
//  i. you create an object annotated with @Description
//  ii. assign it to a variable
// iii. pass it to the GUI extension using its add() config.
// as to the issue of random generation.. used gaussian but it works well with a big deviation since r(128, 128, 128) is white (learned this too!).
fun main() = application {

    configure {
        width = 768
        height = 576
    }

    oliveProgram {

        val parameters = @Description("Program params") object {
            @DoubleParameter("Deviation", 0.0, 128.0, precision = 2, order = 0)
            var deviation = 120.0
        }

        backgroundColor = ColorRGBa.WHITE
        extend(NoClear())
        extend(GUI()) {
            add (parameters)
        }
        extend {
            val x = gaussian(384.0, 60.0)
            val r = gaussian(128.0, parameters.deviation)
            val g = gaussian(128.0, parameters.deviation)
            val b = gaussian(128.0, parameters.deviation)
            drawer.fill = rgb(r, g, b)
            drawer.circle(x, height / 2.0, 10.0)
        }
    }

}
**/
