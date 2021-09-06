package system

import model.node.ProgramNode

internal abstract class ProgramNodeBuilder {
    protected abstract val node: ProgramNode
    abstract val rootNode: ProgramNode

    abstract fun newVariable(variableName: String)

    abstract fun newAssignment(variable: ProgramNode, expression: ProgramNode)

    abstract fun newReturnStatement(value: ProgramNode)

    abstract fun newCondition(condition: ProgramNode, truePart: ProgramNode, falsePart: ProgramNode)
}