// Generated from project.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link projectParser}.
 */
public interface projectListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link projectParser#root}.
	 * @param ctx the parse tree
	 */
	void enterRoot(projectParser.RootContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#root}.
	 * @param ctx the parse tree
	 */
	void exitRoot(projectParser.RootContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(projectParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(projectParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#declarationlist}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationlist(projectParser.DeclarationlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#declarationlist}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationlist(projectParser.DeclarationlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#declarationtype}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationtype(projectParser.DeclarationtypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#declarationtype}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationtype(projectParser.DeclarationtypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(projectParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(projectParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#datatype}.
	 * @param ctx the parse tree
	 */
	void enterDatatype(projectParser.DatatypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#datatype}.
	 * @param ctx the parse tree
	 */
	void exitDatatype(projectParser.DatatypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(projectParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(projectParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(projectParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(projectParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#defexpression}.
	 * @param ctx the parse tree
	 */
	void enterDefexpression(projectParser.DefexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#defexpression}.
	 * @param ctx the parse tree
	 */
	void exitDefexpression(projectParser.DefexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#defcondition}.
	 * @param ctx the parse tree
	 */
	void enterDefcondition(projectParser.DefconditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#defcondition}.
	 * @param ctx the parse tree
	 */
	void exitDefcondition(projectParser.DefconditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#defloop}.
	 * @param ctx the parse tree
	 */
	void enterDefloop(projectParser.DefloopContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#defloop}.
	 * @param ctx the parse tree
	 */
	void exitDefloop(projectParser.DefloopContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#defdowhile}.
	 * @param ctx the parse tree
	 */
	void enterDefdowhile(projectParser.DefdowhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#defdowhile}.
	 * @param ctx the parse tree
	 */
	void exitDefdowhile(projectParser.DefdowhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#defwhile}.
	 * @param ctx the parse tree
	 */
	void enterDefwhile(projectParser.DefwhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#defwhile}.
	 * @param ctx the parse tree
	 */
	void exitDefwhile(projectParser.DefwhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#whileloopexpr}.
	 * @param ctx the parse tree
	 */
	void enterWhileloopexpr(projectParser.WhileloopexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#whileloopexpr}.
	 * @param ctx the parse tree
	 */
	void exitWhileloopexpr(projectParser.WhileloopexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#deffor}.
	 * @param ctx the parse tree
	 */
	void enterDeffor(projectParser.DefforContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#deffor}.
	 * @param ctx the parse tree
	 */
	void exitDeffor(projectParser.DefforContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#forloopexpr}.
	 * @param ctx the parse tree
	 */
	void enterForloopexpr(projectParser.ForloopexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#forloopexpr}.
	 * @param ctx the parse tree
	 */
	void exitForloopexpr(projectParser.ForloopexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(projectParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(projectParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#increament}.
	 * @param ctx the parse tree
	 */
	void enterIncreament(projectParser.IncreamentContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#increament}.
	 * @param ctx the parse tree
	 */
	void exitIncreament(projectParser.IncreamentContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#relation}.
	 * @param ctx the parse tree
	 */
	void enterRelation(projectParser.RelationContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#relation}.
	 * @param ctx the parse tree
	 */
	void exitRelation(projectParser.RelationContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(projectParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(projectParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#defreturn}.
	 * @param ctx the parse tree
	 */
	void enterDefreturn(projectParser.DefreturnContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#defreturn}.
	 * @param ctx the parse tree
	 */
	void exitDefreturn(projectParser.DefreturnContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#defbreak}.
	 * @param ctx the parse tree
	 */
	void enterDefbreak(projectParser.DefbreakContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#defbreak}.
	 * @param ctx the parse tree
	 */
	void exitDefbreak(projectParser.DefbreakContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#logicop}.
	 * @param ctx the parse tree
	 */
	void enterLogicop(projectParser.LogicopContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#logicop}.
	 * @param ctx the parse tree
	 */
	void exitLogicop(projectParser.LogicopContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#binop}.
	 * @param ctx the parse tree
	 */
	void enterBinop(projectParser.BinopContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#binop}.
	 * @param ctx the parse tree
	 */
	void exitBinop(projectParser.BinopContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#spop}.
	 * @param ctx the parse tree
	 */
	void enterSpop(projectParser.SpopContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#spop}.
	 * @param ctx the parse tree
	 */
	void exitSpop(projectParser.SpopContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#defoutput}.
	 * @param ctx the parse tree
	 */
	void enterDefoutput(projectParser.DefoutputContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#defoutput}.
	 * @param ctx the parse tree
	 */
	void exitDefoutput(projectParser.DefoutputContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#definput}.
	 * @param ctx the parse tree
	 */
	void enterDefinput(projectParser.DefinputContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#definput}.
	 * @param ctx the parse tree
	 */
	void exitDefinput(projectParser.DefinputContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(projectParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(projectParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#inc_or_dec}.
	 * @param ctx the parse tree
	 */
	void enterInc_or_dec(projectParser.Inc_or_decContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#inc_or_dec}.
	 * @param ctx the parse tree
	 */
	void exitInc_or_dec(projectParser.Inc_or_decContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(projectParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(projectParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#join}.
	 * @param ctx the parse tree
	 */
	void enterJoin(projectParser.JoinContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#join}.
	 * @param ctx the parse tree
	 */
	void exitJoin(projectParser.JoinContext ctx);
}