internal abstract class Decorator(private val component: VisualComponent) : VisualComponent {
    override fun draw() = component.draw()
    override fun resize() = component.resize()
}