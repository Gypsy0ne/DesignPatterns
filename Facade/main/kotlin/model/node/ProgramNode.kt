package model.node

import system.CodeGenerator
import java.util.Collections.emptyList

internal abstract class ProgramNode {
    protected val children: MutableList<ProgramNode> = emptyList()

    abstract fun getSourcePosition(line: Int, index: Int)
    abstract fun add(node: ProgramNode)
    abstract fun remove(node: ProgramNode)
    abstract fun traverse(generator: CodeGenerator)
}