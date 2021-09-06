package model.node

import system.CodeGenerator

internal class ExpressionNode : ProgramNode() {
    override fun getSourcePosition(line: Int, index: Int) {
        //TODO("not implemented")
    }

    override fun add(node: ProgramNode) {
        //TODO("not implemented")
    }

    override fun remove(node: ProgramNode) {
        //TODO("not implemented")
    }

    override fun traverse(generator: CodeGenerator) {
        //sample implementation
        generator.visit(this)
        children.forEach { node -> node.traverse(generator) }
    }
}