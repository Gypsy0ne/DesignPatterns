internal class BorderDecorator(component: VisualComponent, private val borderWidth: Int) : Decorator(component) {

    override fun draw() {
        super.draw()
        drawBorder()
    }

    private fun drawBorder() {
        // decorating method
    }
}