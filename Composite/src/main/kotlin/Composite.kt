internal class Composite : Component {
    override val composite: Composite?
        get() = this
    private val children = mutableListOf<Component>()

    fun add(component: Component) = children.add(component)
}