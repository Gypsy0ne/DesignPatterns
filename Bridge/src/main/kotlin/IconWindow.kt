import impl.WindowImp
import model.Point
import model.View

internal class IconWindow(private val bitmapName: String) : Window() {
    override val windowImp: WindowImp
        get() = TODO("not implemented")
    override val contents: View
        get() = TODO("not implemented")

    override fun drawContents() {
        windowImp.deviceBitmap(bitmapName, Point(0, 0), Point(10, 10))
    }
}