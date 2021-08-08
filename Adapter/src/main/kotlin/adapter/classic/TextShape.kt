package adapter.classic

import adaptee.TextView
import adapter.Manipulator
import adapter.Shape
import adapter.TextManipulator
import adapter.model.BoundingBox
import adapter.model.Point

internal class TextShape : TextView(), Shape {

    override val boundingBox: BoundingBox
        get() {
            val bottomLeft = Point(x.coordinateValue, y.coordinateValue)
            val topRight = Point(x.coordinateValue + width, y.coordinateValue + height)

            return BoundingBox(bottomLeft = bottomLeft, topRight = topRight)
        }

    override fun createManipulator(): Manipulator {
        return TextManipulator(this)
    }
}