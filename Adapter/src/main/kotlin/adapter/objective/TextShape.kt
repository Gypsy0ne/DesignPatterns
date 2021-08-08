package adapter.objective

import adaptee.TextView
import adapter.Manipulator
import adapter.Shape
import adapter.TextManipulator
import adapter.model.BoundingBox
import adapter.model.Point

internal class TextShape(private val adaptedTextView: TextView) : Shape {
    override val boundingBox: BoundingBox
        get() {
            val bottomLeft: Point
            val topRight: Point
            with(adaptedTextView.origin) {
                bottomLeft = Point(x = x.coordinateValue, y = y.coordinateValue)

                adaptedTextView.extent.let { viewExtent ->
                    topRight = Point(x = x.coordinateValue + viewExtent.width, y = y.coordinateValue + viewExtent.height)
                }
            }

            return BoundingBox(bottomLeft = bottomLeft, topRight = topRight)
        }

    override fun createManipulator(): Manipulator {
        return TextManipulator(this)
    }

    fun isEmpty() = adaptedTextView.isEmpty()
}