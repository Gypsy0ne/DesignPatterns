import impl.WindowImp
import model.View

internal class ApplicationWindow : Window() {
    override fun drawContents() {
        contents.drawOn(this)
    }

    override val windowImp: WindowImp
        get() = TODO("not implemented")
    override val contents: View
        get() = TODO("not implemented")
}