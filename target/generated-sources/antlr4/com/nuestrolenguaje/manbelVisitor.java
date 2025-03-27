// Generated from com\nuestrolenguaje\manbel.g4 by ANTLR 4.9.2
package com.nuestrolenguaje;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link manbelParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface manbelVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link manbelParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(manbelParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link manbelParser#declaracion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracion(manbelParser.DeclaracionContext ctx);
	/**
	 * Visit a parse tree produced by {@link manbelParser#instruccion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruccion(manbelParser.InstruccionContext ctx);
	/**
	 * Visit a parse tree produced by {@link manbelParser#asig}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsig(manbelParser.AsigContext ctx);
	/**
	 * Visit a parse tree produced by {@link manbelParser#floop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloop(manbelParser.FloopContext ctx);
	/**
	 * Visit a parse tree produced by {@link manbelParser#def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDef(manbelParser.DefContext ctx);
	/**
	 * Visit a parse tree produced by {@link manbelParser#else_if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_if(manbelParser.Else_ifContext ctx);
	/**
	 * Visit a parse tree produced by {@link manbelParser#else_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_block(manbelParser.Else_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link manbelParser#condicion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicion(manbelParser.CondicionContext ctx);
	/**
	 * Visit a parse tree produced by {@link manbelParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(manbelParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link manbelParser#incremento}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncremento(manbelParser.IncrementoContext ctx);
	/**
	 * Visit a parse tree produced by {@link manbelParser#termino}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermino(manbelParser.TerminoContext ctx);
	/**
	 * Visit a parse tree produced by {@link manbelParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(manbelParser.FactorContext ctx);
}