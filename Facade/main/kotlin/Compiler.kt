import model.BytecodeStream
import model.InputStream
import model.Token
import model.node.ExpressionNode
import model.node.ProgramNode
import model.node.StatementNode
import system.CodeGenerator
import system.Parser
import system.ProgramNodeBuilder
import system.Scanner

// facade class
internal abstract class Compiler {

    fun compile(input: InputStream, output: BytecodeStream) {
        val scanner = mockScanner(input)
        mockedParser.parse(scanner, mockedProgramNodeBuilder)
        val generator = mockCodeGenerator(output)
        mockedProgramNodeBuilder.rootNode.traverse(generator)
    }

    private fun mockScanner(input: InputStream) =  object : Scanner(input) {
        override fun scan(): Token = Token()
    }

    private val mockedParser = object : Parser {
        override fun parse(scanner: Scanner, nodeBuilder: ProgramNodeBuilder) {
            //TODO("not implemented")
        }
    }

    private val mockedProgramNodeBuilder = object : ProgramNodeBuilder() {
        override val node: ProgramNode
            get() = mockProgramNode()
        override val rootNode: ProgramNode
            get() = mockProgramNode()

        override fun newVariable(variableName: String) {
            //TODO("not implemented")
        }

        override fun newAssignment(variable: ProgramNode, expression: ProgramNode) {
            //TODO("not implemented")
        }

        override fun newReturnStatement(value: ProgramNode) {
            //TODO("not implemented")
        }

        override fun newCondition(condition: ProgramNode, truePart: ProgramNode, falsePart: ProgramNode) {
            //TODO("not implemented")
        }
    }

    private fun mockProgramNode() = object : ProgramNode() {
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
            //TODO("not implemented")
        }
    }

    private fun mockCodeGenerator(input: BytecodeStream) = object: CodeGenerator(input) {
        override val output: BytecodeStream
            get() = BytecodeStream()

        override fun visit(node: StatementNode) {
            //TODO("not implemented")
        }

        override fun visit(node: ExpressionNode) {
            //TODO("not implemented")
        }
    }
}