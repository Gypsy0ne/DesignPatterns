package adaptee

import adaptee.model.Coord
import adaptee.model.Extent
import adaptee.model.Origin

internal open class TextView(
    protected val x: Coord = Coord(),
    protected val y: Coord = Coord(),
    protected val width: Int = 0,
    protected val height: Int = 0,
    private val text: String = ""
) {
    val origin: Origin
        get() = Origin(x = x, y = y)

    val extent: Extent
        get() = Extent(width = width, height = height)

    open fun isEmpty(): Boolean = text.isEmpty()
}