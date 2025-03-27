// Generated from c:/automatas II/nuestrolenguajeV2/nuestrolenguaje/src/main/antlr4/com/nuestrolenguaje/manbel.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link manbelParser}.
 */
public interface manbelListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link manbelParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(manbelParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link manbelParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(manbelParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link manbelParser#declaracion}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracion(manbelParser.DeclaracionContext ctx);
	/**
	 * Exit a parse tree produced by {@link manbelParser#declaracion}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracion(manbelParser.DeclaracionContext ctx);
	/**
	 * Enter a parse tree produced by {@link manbelParser#instruccion}.
	 * @param ctx the parse tree
	 */
	void enterInstruccion(manbelParser.InstruccionContext ctx);
	/**
	 * Exit a parse tree produced by {@link manbelParser#instruccion}.
	 * @param ctx the parse tree
	 */
	void exitInstruccion(manbelParser.InstruccionContext ctx);
	/**
	 * Enter a parse tree produced by {@link manbelParser#asig}.
	 * @param ctx the parse tree
	 */
	void enterAsig(manbelParser.AsigContext ctx);
	/**
	 * Exit a parse tree produced by {@link manbelParser#asig}.
	 * @param ctx the parse tree
	 */
	void exitAsig(manbelParser.AsigContext ctx);
	/**
	 * Enter a parse tree produced by {@link manbelParser#floop}.
	 * @param ctx the parse tree
	 */
	void enterFloop(manbelParser.FloopContext ctx);
	/**
	 * Exit a parse tree produced by {@link manbelParser#floop}.
	 * @param ctx the parse tree
	 */
	void exitFloop(manbelParser.FloopContext ctx);
	/**
	 * Enter a parse tree produced by {@link manbelParser#def}.
	 * @param ctx the parse tree
	 */
	void enterDef(manbelParser.DefContext ctx);
	/**
	 * Exit a parse tree produced by {@link manbelParser#def}.
	 * @param ctx the parse tree
	 */
	void exitDef(manbelParser.DefContext ctx);
	/**
	 * Enter a parse tree produced by {@link manbelParser#else_if}.
	 * @param ctx the parse tree
	 */
	void enterElse_if(manbelParser.Else_ifContext ctx);
	/**
	 * Exit a parse tree produced by {@link manbelParser#else_if}.
	 * @param ctx the parse tree
	 */
	void exitElse_if(manbelParser.Else_ifContext ctx);
	/**
	 * Enter a parse tree produced by {@link manbelParser#else_block}.
	 * @param ctx the parse tree
	 */
	void enterElse_block(manbelParser.Else_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link manbelParser#else_block}.
	 * @param ctx the parse tree
	 */
	void exitElse_block(manbelParser.Else_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link manbelParser#condicion}.
	 * @param ctx the parse tree
	 */
	void enterCondicion(manbelParser.CondicionContext ctx);
	/**
	 * Exit a parse tree produced by {@link manbelParser#condicion}.
	 * @param ctx the parse tree
	 */
	void exitCondicion(manbelParser.CondicionContext ctx);
	/**
	 * Enter a parse tree produced by {@link manbelParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(manbelParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link manbelParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(manbelParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link manbelParser#incremento}.
	 * @param ctx the parse tree
	 */
	void enterIncremento(manbelParser.IncrementoContext ctx);
	/**
	 * Exit a parse tree produced by {@link manbelParser#incremento}.
	 * @param ctx the parse tree
	 */
	void exitIncremento(manbelParser.IncrementoContext ctx);
	/**
	 * Enter a parse tree produced by {@link manbelParser#termino}.
	 * @param ctx the parse tree
	 */
	void enterTermino(manbelParser.TerminoContext ctx);
	/**
	 * Exit a parse tree produced by {@link manbelParser#termino}.
	 * @param ctx the parse tree
	 */
	void exitTermino(manbelParser.TerminoContext ctx);
	/**
	 * Enter a parse tree produced by {@link manbelParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(manbelParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link manbelParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(manbelParser.FactorContext ctx);
}