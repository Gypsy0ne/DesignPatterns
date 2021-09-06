internal class ScrollDecorator(component: VisualComponent) : Decorator(component) {
    private val scrollPosition: Int = 0

    override fun draw() {
        super.draw()
        addScroller()
    }

    private fun addScroller() {
        // decorating method
    }
}