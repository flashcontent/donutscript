// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DonutScriptParser}.
 */
public interface DonutScriptListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DonutScriptParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(DonutScriptParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link DonutScriptParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(DonutScriptParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link DonutScriptParser#fun}.
	 * @param ctx the parse tree
	 */
	void enterFun(DonutScriptParser.FunContext ctx);
	/**
	 * Exit a parse tree produced by {@link DonutScriptParser#fun}.
	 * @param ctx the parse tree
	 */
	void exitFun(DonutScriptParser.FunContext ctx);
	/**
	 * Enter a parse tree produced by {@link DonutScriptParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(DonutScriptParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link DonutScriptParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(DonutScriptParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link DonutScriptParser#def}.
	 * @param ctx the parse tree
	 */
	void enterDef(DonutScriptParser.DefContext ctx);
	/**
	 * Exit a parse tree produced by {@link DonutScriptParser#def}.
	 * @param ctx the parse tree
	 */
	void exitDef(DonutScriptParser.DefContext ctx);
}