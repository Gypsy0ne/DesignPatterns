import model.View

internal class ApplicationWindow : Window() {
    override fun drawContents() {
        contents.drawOn(this)
    }

    override val contents: View
        get() = TODO("not implemented")
}