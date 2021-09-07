import impl.WindowImp
import impl.WindowSystemFactory
import model.Point
import model.View

internal abstract class Window {
    open fun drawContents() {}
    open fun drawRect(upperLeft: Point, bottomRight: Point) = windowImp.deviceRect(upperLeft, bottomRight)

    protected val windowImp: WindowImp = WindowSystemFactory.makeWindowImpl()
    protected abstract val contents: View
}