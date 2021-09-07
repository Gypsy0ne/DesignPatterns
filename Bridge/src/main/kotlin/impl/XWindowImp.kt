package impl

import model.Display
import model.Drawable
import model.Point

internal class XWindowImp(private val display: Display, private val windowId: Drawable) : WindowImp {
    override fun deviceRect(upperLeft: Point, bottomRight: Point) {
        super.deviceRect(upperLeft, bottomRight)
        // specific implementation
    }
}