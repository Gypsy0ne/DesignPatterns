import impl.WindowImp
import impl.WindowSystemFactory
import model.Point
import model.View

internal abstract class Window {
    open fun drawContents() {}
    open fun open() {}
    open fun close() {}
    open fun iconify() {}
    open fun deiconify() {}

    open fun setOrigin(at: Point) {}
    open fun setExtent(extent: Point) {}
    open fun raise() {}
    open fun lower() {}

    open fun drawLine(from: Point, to: Point) {}
    open fun drawRect(upperLeft: Point, bottomRight: Point) = windowImp.deviceRect(upperLeft, bottomRight)
    open fun drawPolygon(vertexes: List<Point>) {}
    open fun drawText(at: Point, text: String) {}

    protected val windowImp: WindowImp = WindowSystemFactory.makeWindowImpl()
    protected abstract val contents: View
}