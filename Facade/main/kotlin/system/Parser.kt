package system

internal interface Parser {
    fun parse(scanner: Scanner, nodeBuilder: ProgramNodeBuilder)
}