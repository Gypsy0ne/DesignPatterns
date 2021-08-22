package system

import model.BytecodeStream
import model.node.ExpressionNode
import model.node.StatementNode

internal abstract class CodeGenerator(protected val input: BytecodeStream) {
    protected abstract val output: BytecodeStream

    abstract fun visit(node: StatementNode)
    abstract fun visit(node: ExpressionNode)

}