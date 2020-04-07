// Generated from project.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class projectParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, ID=49, Digit=50, Termspec=51;
	public static final int
		RULE_root = 0, RULE_declaration = 1, RULE_declarationlist = 2, RULE_declarationtype = 3, 
		RULE_function = 4, RULE_datatype = 5, RULE_block = 6, RULE_statement = 7, 
		RULE_defexpression = 8, RULE_defcondition = 9, RULE_defloop = 10, RULE_defdowhile = 11, 
		RULE_defwhile = 12, RULE_whileloopexpr = 13, RULE_deffor = 14, RULE_forloopexpr = 15, 
		RULE_condition = 16, RULE_increament = 17, RULE_relation = 18, RULE_expression = 19, 
		RULE_defreturn = 20, RULE_defbreak = 21, RULE_logicop = 22, RULE_binop = 23, 
		RULE_spop = 24, RULE_defoutput = 25, RULE_definput = 26, RULE_var = 27, 
		RULE_inc_or_dec = 28, RULE_term = 29, RULE_join = 30;
	private static String[] makeRuleNames() {
		return new String[] {
			"root", "declaration", "declarationlist", "declarationtype", "function", 
			"datatype", "block", "statement", "defexpression", "defcondition", "defloop", 
			"defdowhile", "defwhile", "whileloopexpr", "deffor", "forloopexpr", "condition", 
			"increament", "relation", "expression", "defreturn", "defbreak", "logicop", 
			"binop", "spop", "defoutput", "definput", "var", "inc_or_dec", "term", 
			"join"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'@'", "'import'", "'define'", "'\"'", "'as'", "'.'", "'<'", "'>'", 
			"':'", "'int'", "'float'", "'bool'", "'char'", "'string'", "'['", "']'", 
			"'if'", "'~'", "'else'", "'do'", "'while'", "'for'", "'is_equal'", "'isnot_equal'", 
			"'greater_than'", "'less_than'", "'greater_or_equal'", "'less_or_equal'", 
			"'assign'", "'('", "')'", "','", "'return'", "'break'", "'and'", "'or'", 
			"'add'", "'sub'", "'multi'", "'div'", "'mod'", "'power'", "'root'", "'print>>'", 
			"'scan<<'", "'inc'", "'dec'", "'_'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "ID", "Digit", "Termspec"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "project.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public projectParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class RootContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public RootContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_root; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof projectListener ) ((projectListener)listener).enterRoot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof projectListener ) ((projectListener)listener).exitRoot(this);
		}
	}

	public final RootContext root() throws RecognitionException {
		RootContext _localctx = new RootContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_root);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			declaration();
			setState(63);
			function();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationContext extends ParserRuleContext {
		public List<DeclarationlistContext> declarationlist() {
			return getRuleContexts(DeclarationlistContext.class);
		}
		public DeclarationlistContext declarationlist(int i) {
			return getRuleContext(DeclarationlistContext.class,i);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof projectListener ) ((projectListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof projectListener ) ((projectListener)listener).exitDeclaration(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(65);
				match(T__0);
				setState(66);
				declarationlist();
				}
				}
				setState(69); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__0 );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationlistContext extends ParserRuleContext {
		public DeclarationtypeContext declarationtype() {
			return getRuleContext(DeclarationtypeContext.class,0);
		}
		public DatatypeContext datatype() {
			return getRuleContext(DatatypeContext.class,0);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminalNode Digit() { return getToken(projectParser.Digit, 0); }
		public DeclarationlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof projectListener ) ((projectListener)listener).enterDeclarationlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof projectListener ) ((projectListener)listener).exitDeclarationlist(this);
		}
	}

	public final DeclarationlistContext declarationlist() throws RecognitionException {
		DeclarationlistContext _localctx = new DeclarationlistContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declarationlist);
		try {
			setState(81);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(71);
				match(T__1);
				setState(72);
				declarationtype();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(73);
				match(T__2);
				setState(74);
				match(T__3);
				setState(75);
				datatype();
				setState(76);
				term();
				setState(77);
				match(T__4);
				setState(78);
				match(Digit);
				setState(79);
				match(T__3);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationtypeContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public DeclarationtypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationtype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof projectListener ) ((projectListener)listener).enterDeclarationtype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof projectListener ) ((projectListener)listener).exitDeclarationtype(this);
		}
	}

	public final DeclarationtypeContext declarationtype() throws RecognitionException {
		DeclarationtypeContext _localctx = new DeclarationtypeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declarationtype);
		try {
			setState(93);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(83);
				match(T__3);
				setState(84);
				term();
				setState(85);
				match(T__3);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(87);
				match(T__3);
				setState(88);
				term();
				setState(89);
				match(T__5);
				setState(90);
				term();
				setState(91);
				match(T__3);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionContext extends ParserRuleContext {
		public DatatypeContext datatype() {
			return getRuleContext(DatatypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(projectParser.ID, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof projectListener ) ((projectListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof projectListener ) ((projectListener)listener).exitFunction(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_function);
		try {
			setState(121);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(95);
				datatype();
				setState(96);
				match(ID);
				setState(97);
				match(T__6);
				setState(98);
				match(T__7);
				setState(99);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(101);
				datatype();
				setState(102);
				match(ID);
				setState(103);
				match(T__6);
				setState(104);
				statement();
				setState(105);
				match(T__7);
				setState(106);
				block();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(108);
				datatype();
				setState(109);
				match(ID);
				setState(110);
				match(T__6);
				setState(111);
				statement();
				setState(112);
				match(T__7);
				setState(113);
				match(T__8);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(115);
				datatype();
				setState(116);
				match(ID);
				setState(117);
				match(T__6);
				setState(118);
				match(T__7);
				setState(119);
				match(T__8);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DatatypeContext extends ParserRuleContext {
		public DatatypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_datatype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof projectListener ) ((projectListener)listener).enterDatatype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof projectListener ) ((projectListener)listener).exitDatatype(this);
		}
	}

	public final DatatypeContext datatype() throws RecognitionException {
		DatatypeContext _localctx = new DatatypeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_datatype);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof projectListener ) ((projectListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof projectListener ) ((projectListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_block);
		try {
			setState(130);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__14:
				enterOuterAlt(_localctx, 1);
				{
				setState(125);
				match(T__14);
				setState(126);
				statement();
				setState(127);
				match(T__15);
				}
				break;
			case T__9:
			case T__10:
			case T__11:
			case T__12:
			case T__13:
			case T__16:
			case T__19:
			case T__20:
			case T__21:
			case T__29:
			case T__32:
			case T__33:
			case T__42:
			case T__43:
			case T__44:
			case T__45:
			case T__46:
			case ID:
			case Digit:
				enterOuterAlt(_localctx, 2);
				{
				setState(129);
				statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public List<DefexpressionContext> defexpression() {
			return getRuleContexts(DefexpressionContext.class);
		}
		public DefexpressionContext defexpression(int i) {
			return getRuleContext(DefexpressionContext.class,i);
		}
		public List<DefconditionContext> defcondition() {
			return getRuleContexts(DefconditionContext.class);
		}
		public DefconditionContext defcondition(int i) {
			return getRuleContext(DefconditionContext.class,i);
		}
		public List<DefloopContext> defloop() {
			return getRuleContexts(DefloopContext.class);
		}
		public DefloopContext defloop(int i) {
			return getRuleContext(DefloopContext.class,i);
		}
		public List<DefreturnContext> defreturn() {
			return getRuleContexts(DefreturnContext.class);
		}
		public DefreturnContext defreturn(int i) {
			return getRuleContext(DefreturnContext.class,i);
		}
		public List<DefoutputContext> defoutput() {
			return getRuleContexts(DefoutputContext.class);
		}
		public DefoutputContext defoutput(int i) {
			return getRuleContext(DefoutputContext.class,i);
		}
		public List<DefinputContext> definput() {
			return getRuleContexts(DefinputContext.class);
		}
		public DefinputContext definput(int i) {
			return getRuleContext(DefinputContext.class,i);
		}
		public List<DefbreakContext> defbreak() {
			return getRuleContexts(DefbreakContext.class);
		}
		public DefbreakContext defbreak(int i) {
			return getRuleContext(DefbreakContext.class,i);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof projectListener ) ((projectListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof projectListener ) ((projectListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_statement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(139); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(139);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__9:
					case T__10:
					case T__11:
					case T__12:
					case T__13:
					case T__29:
					case T__42:
					case T__45:
					case T__46:
					case ID:
					case Digit:
						{
						setState(132);
						defexpression();
						}
						break;
					case T__16:
						{
						setState(133);
						defcondition();
						}
						break;
					case T__19:
					case T__20:
					case T__21:
						{
						setState(134);
						defloop();
						}
						break;
					case T__32:
						{
						setState(135);
						defreturn();
						}
						break;
					case T__43:
						{
						setState(136);
						defoutput();
						}
						break;
					case T__44:
						{
						setState(137);
						definput();
						}
						break;
					case T__33:
						{
						setState(138);
						defbreak();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(141); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefexpressionContext extends ParserRuleContext {
		public DatatypeContext datatype() {
			return getRuleContext(DatatypeContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DefexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof projectListener ) ((projectListener)listener).enterDefexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof projectListener ) ((projectListener)listener).exitDefexpression(this);
		}
	}

	public final DefexpressionContext defexpression() throws RecognitionException {
		DefexpressionContext _localctx = new DefexpressionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_defexpression);
		try {
			setState(153);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(143);
				datatype();
				setState(144);
				expression(0);
				setState(145);
				match(T__8);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(147);
				expression(0);
				setState(148);
				match(T__8);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(150);
				datatype();
				setState(151);
				expression(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefconditionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public DefconditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defcondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof projectListener ) ((projectListener)listener).enterDefcondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof projectListener ) ((projectListener)listener).exitDefcondition(this);
		}
	}

	public final DefconditionContext defcondition() throws RecognitionException {
		DefconditionContext _localctx = new DefconditionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_defcondition);
		try {
			setState(169);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(155);
				match(T__16);
				setState(156);
				match(T__17);
				setState(157);
				expression(0);
				setState(158);
				match(T__8);
				setState(159);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(161);
				match(T__16);
				setState(162);
				match(T__17);
				setState(163);
				expression(0);
				setState(164);
				match(T__8);
				setState(165);
				block();
				setState(166);
				match(T__18);
				setState(167);
				block();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefloopContext extends ParserRuleContext {
		public DefwhileContext defwhile() {
			return getRuleContext(DefwhileContext.class,0);
		}
		public DefforContext deffor() {
			return getRuleContext(DefforContext.class,0);
		}
		public DefdowhileContext defdowhile() {
			return getRuleContext(DefdowhileContext.class,0);
		}
		public DefloopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defloop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof projectListener ) ((projectListener)listener).enterDefloop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof projectListener ) ((projectListener)listener).exitDefloop(this);
		}
	}

	public final DefloopContext defloop() throws RecognitionException {
		DefloopContext _localctx = new DefloopContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_defloop);
		try {
			setState(174);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__20:
				enterOuterAlt(_localctx, 1);
				{
				setState(171);
				defwhile();
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 2);
				{
				setState(172);
				deffor();
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 3);
				{
				setState(173);
				defdowhile();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefdowhileContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public WhileloopexprContext whileloopexpr() {
			return getRuleContext(WhileloopexprContext.class,0);
		}
		public DefdowhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defdowhile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof projectListener ) ((projectListener)listener).enterDefdowhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof projectListener ) ((projectListener)listener).exitDefdowhile(this);
		}
	}

	public final DefdowhileContext defdowhile() throws RecognitionException {
		DefdowhileContext _localctx = new DefdowhileContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_defdowhile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			match(T__19);
			setState(177);
			block();
			setState(178);
			match(T__20);
			setState(179);
			match(T__6);
			setState(180);
			whileloopexpr();
			setState(181);
			match(T__7);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefwhileContext extends ParserRuleContext {
		public WhileloopexprContext whileloopexpr() {
			return getRuleContext(WhileloopexprContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public DefwhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defwhile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof projectListener ) ((projectListener)listener).enterDefwhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof projectListener ) ((projectListener)listener).exitDefwhile(this);
		}
	}

	public final DefwhileContext defwhile() throws RecognitionException {
		DefwhileContext _localctx = new DefwhileContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_defwhile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			match(T__20);
			setState(184);
			match(T__6);
			setState(185);
			whileloopexpr();
			setState(186);
			match(T__7);
			setState(187);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileloopexprContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public RelationContext relation() {
			return getRuleContext(RelationContext.class,0);
		}
		public WhileloopexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileloopexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof projectListener ) ((projectListener)listener).enterWhileloopexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof projectListener ) ((projectListener)listener).exitWhileloopexpr(this);
		}
	}

	public final WhileloopexprContext whileloopexpr() throws RecognitionException {
		WhileloopexprContext _localctx = new WhileloopexprContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_whileloopexpr);
		try {
			setState(194);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(189);
				term();
				setState(190);
				relation();
				setState(191);
				term();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(193);
				term();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefforContext extends ParserRuleContext {
		public ForloopexprContext forloopexpr() {
			return getRuleContext(ForloopexprContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public DefforContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deffor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof projectListener ) ((projectListener)listener).enterDeffor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof projectListener ) ((projectListener)listener).exitDeffor(this);
		}
	}

	public final DefforContext deffor() throws RecognitionException {
		DefforContext _localctx = new DefforContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_deffor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			match(T__21);
			setState(197);
			match(T__6);
			setState(198);
			forloopexpr();
			setState(199);
			match(T__7);
			setState(200);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForloopexprContext extends ParserRuleContext {
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public IncreamentContext increament() {
			return getRuleContext(IncreamentContext.class,0);
		}
		public ForloopexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forloopexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof projectListener ) ((projectListener)listener).enterForloopexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof projectListener ) ((projectListener)listener).exitForloopexpr(this);
		}
	}

	public final ForloopexprContext forloopexpr() throws RecognitionException {
		ForloopexprContext _localctx = new ForloopexprContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_forloopexpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			condition();
			setState(203);
			increament();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionContext extends ParserRuleContext {
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public List<RelationContext> relation() {
			return getRuleContexts(RelationContext.class);
		}
		public RelationContext relation(int i) {
			return getRuleContext(RelationContext.class,i);
		}
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof projectListener ) ((projectListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof projectListener ) ((projectListener)listener).exitCondition(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			var();
			setState(206);
			relation();
			setState(207);
			term();
			setState(208);
			match(T__8);
			setState(209);
			var();
			setState(210);
			relation();
			setState(211);
			term();
			setState(212);
			match(T__8);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IncreamentContext extends ParserRuleContext {
		public Inc_or_decContext inc_or_dec() {
			return getRuleContext(Inc_or_decContext.class,0);
		}
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public IncreamentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_increament; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof projectListener ) ((projectListener)listener).enterIncreament(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof projectListener ) ((projectListener)listener).exitIncreament(this);
		}
	}

	public final IncreamentContext increament() throws RecognitionException {
		IncreamentContext _localctx = new IncreamentContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_increament);
		try {
			setState(220);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__45:
			case T__46:
				enterOuterAlt(_localctx, 1);
				{
				setState(214);
				inc_or_dec();
				setState(215);
				var();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(217);
				var();
				setState(218);
				inc_or_dec();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelationContext extends ParserRuleContext {
		public RelationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof projectListener ) ((projectListener)listener).enterRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof projectListener ) ((projectListener)listener).exitRelation(this);
		}
	}

	public final RelationContext relation() throws RecognitionException {
		RelationContext _localctx = new RelationContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_relation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public SpopContext spop() {
			return getRuleContext(SpopContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Inc_or_decContext inc_or_dec() {
			return getRuleContext(Inc_or_decContext.class,0);
		}
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public JoinContext join() {
			return getRuleContext(JoinContext.class,0);
		}
		public BinopContext binop() {
			return getRuleContext(BinopContext.class,0);
		}
		public RelationContext relation() {
			return getRuleContext(RelationContext.class,0);
		}
		public LogicopContext logicop() {
			return getRuleContext(LogicopContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof projectListener ) ((projectListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof projectListener ) ((projectListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(225);
				spop();
				setState(226);
				expression(9);
				}
				break;
			case 2:
				{
				setState(228);
				match(T__29);
				setState(229);
				expression(0);
				setState(230);
				match(T__30);
				}
				break;
			case 3:
				{
				setState(232);
				inc_or_dec();
				setState(233);
				term();
				}
				break;
			case 4:
				{
				setState(235);
				term();
				setState(236);
				inc_or_dec();
				}
				break;
			case 5:
				{
				setState(238);
				term();
				}
				break;
			case 6:
				{
				setState(239);
				term();
				setState(240);
				join();
				setState(241);
				term();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(262);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(260);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(245);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(246);
						binop();
						setState(247);
						expression(11);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(249);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(250);
						relation();
						setState(251);
						expression(9);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(253);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(254);
						logicop();
						setState(255);
						expression(8);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(257);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(258);
						match(T__31);
						setState(259);
						expression(4);
						}
						break;
					}
					} 
				}
				setState(264);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class DefreturnContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DefreturnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defreturn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof projectListener ) ((projectListener)listener).enterDefreturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof projectListener ) ((projectListener)listener).exitDefreturn(this);
		}
	}

	public final DefreturnContext defreturn() throws RecognitionException {
		DefreturnContext _localctx = new DefreturnContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_defreturn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			match(T__32);
			setState(266);
			expression(0);
			setState(267);
			match(T__8);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefbreakContext extends ParserRuleContext {
		public DefbreakContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defbreak; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof projectListener ) ((projectListener)listener).enterDefbreak(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof projectListener ) ((projectListener)listener).exitDefbreak(this);
		}
	}

	public final DefbreakContext defbreak() throws RecognitionException {
		DefbreakContext _localctx = new DefbreakContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_defbreak);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			match(T__33);
			setState(270);
			match(T__8);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LogicopContext extends ParserRuleContext {
		public LogicopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof projectListener ) ((projectListener)listener).enterLogicop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof projectListener ) ((projectListener)listener).exitLogicop(this);
		}
	}

	public final LogicopContext logicop() throws RecognitionException {
		LogicopContext _localctx = new LogicopContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_logicop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			_la = _input.LA(1);
			if ( !(_la==T__34 || _la==T__35) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BinopContext extends ParserRuleContext {
		public BinopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof projectListener ) ((projectListener)listener).enterBinop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof projectListener ) ((projectListener)listener).exitBinop(this);
		}
	}

	public final BinopContext binop() throws RecognitionException {
		BinopContext _localctx = new BinopContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_binop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SpopContext extends ParserRuleContext {
		public SpopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_spop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof projectListener ) ((projectListener)listener).enterSpop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof projectListener ) ((projectListener)listener).exitSpop(this);
		}
	}

	public final SpopContext spop() throws RecognitionException {
		SpopContext _localctx = new SpopContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_spop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			match(T__42);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefoutputContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DefoutputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defoutput; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof projectListener ) ((projectListener)listener).enterDefoutput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof projectListener ) ((projectListener)listener).exitDefoutput(this);
		}
	}

	public final DefoutputContext defoutput() throws RecognitionException {
		DefoutputContext _localctx = new DefoutputContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_defoutput);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			match(T__43);
			setState(279);
			expression(0);
			setState(280);
			match(T__8);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefinputContext extends ParserRuleContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public DefinputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definput; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof projectListener ) ((projectListener)listener).enterDefinput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof projectListener ) ((projectListener)listener).exitDefinput(this);
		}
	}

	public final DefinputContext definput() throws RecognitionException {
		DefinputContext _localctx = new DefinputContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_definput);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			match(T__44);
			setState(283);
			term();
			setState(284);
			match(T__8);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(projectParser.ID, 0); }
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof projectListener ) ((projectListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof projectListener ) ((projectListener)listener).exitVar(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Inc_or_decContext extends ParserRuleContext {
		public Inc_or_decContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inc_or_dec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof projectListener ) ((projectListener)listener).enterInc_or_dec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof projectListener ) ((projectListener)listener).exitInc_or_dec(this);
		}
	}

	public final Inc_or_decContext inc_or_dec() throws RecognitionException {
		Inc_or_decContext _localctx = new Inc_or_decContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_inc_or_dec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			_la = _input.LA(1);
			if ( !(_la==T__45 || _la==T__46) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TermContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(projectParser.ID, 0); }
		public TerminalNode Digit() { return getToken(projectParser.Digit, 0); }
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof projectListener ) ((projectListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof projectListener ) ((projectListener)listener).exitTerm(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==Digit) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JoinContext extends ParserRuleContext {
		public JoinContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof projectListener ) ((projectListener)listener).enterJoin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof projectListener ) ((projectListener)listener).exitJoin(this);
		}
	}

	public final JoinContext join() throws RecognitionException {
		JoinContext _localctx = new JoinContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_join);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			match(T__47);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 19:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 10);
		case 1:
			return precpred(_ctx, 8);
		case 2:
			return precpred(_ctx, 7);
		case 3:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\65\u0129\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \3\2"+
		"\3\2\3\2\3\3\3\3\6\3F\n\3\r\3\16\3G\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\5\4T\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5`\n\5\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6|\n\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\5\b"+
		"\u0085\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\6\t\u008e\n\t\r\t\16\t\u008f\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u009c\n\n\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00ac\n\13"+
		"\3\f\3\f\3\f\5\f\u00b1\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\5\17\u00c5\n\17\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00df\n\23\3\24\3\24\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\5\25\u00f6\n\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\7\25\u0107\n\25\f\25\16\25\u010a\13"+
		"\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3"+
		"\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3"+
		" \3 \3 \2\3(!\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64"+
		"\668:<>\2\b\3\2\f\20\3\2\31\37\3\2%&\3\2\',\3\2\60\61\3\2\63\64\2\u0127"+
		"\2@\3\2\2\2\4E\3\2\2\2\6S\3\2\2\2\b_\3\2\2\2\n{\3\2\2\2\f}\3\2\2\2\16"+
		"\u0084\3\2\2\2\20\u008d\3\2\2\2\22\u009b\3\2\2\2\24\u00ab\3\2\2\2\26\u00b0"+
		"\3\2\2\2\30\u00b2\3\2\2\2\32\u00b9\3\2\2\2\34\u00c4\3\2\2\2\36\u00c6\3"+
		"\2\2\2 \u00cc\3\2\2\2\"\u00cf\3\2\2\2$\u00de\3\2\2\2&\u00e0\3\2\2\2(\u00f5"+
		"\3\2\2\2*\u010b\3\2\2\2,\u010f\3\2\2\2.\u0112\3\2\2\2\60\u0114\3\2\2\2"+
		"\62\u0116\3\2\2\2\64\u0118\3\2\2\2\66\u011c\3\2\2\28\u0120\3\2\2\2:\u0122"+
		"\3\2\2\2<\u0124\3\2\2\2>\u0126\3\2\2\2@A\5\4\3\2AB\5\n\6\2B\3\3\2\2\2"+
		"CD\7\3\2\2DF\5\6\4\2EC\3\2\2\2FG\3\2\2\2GE\3\2\2\2GH\3\2\2\2H\5\3\2\2"+
		"\2IJ\7\4\2\2JT\5\b\5\2KL\7\5\2\2LM\7\6\2\2MN\5\f\7\2NO\5<\37\2OP\7\7\2"+
		"\2PQ\7\64\2\2QR\7\6\2\2RT\3\2\2\2SI\3\2\2\2SK\3\2\2\2T\7\3\2\2\2UV\7\6"+
		"\2\2VW\5<\37\2WX\7\6\2\2X`\3\2\2\2YZ\7\6\2\2Z[\5<\37\2[\\\7\b\2\2\\]\5"+
		"<\37\2]^\7\6\2\2^`\3\2\2\2_U\3\2\2\2_Y\3\2\2\2`\t\3\2\2\2ab\5\f\7\2bc"+
		"\7\63\2\2cd\7\t\2\2de\7\n\2\2ef\5\16\b\2f|\3\2\2\2gh\5\f\7\2hi\7\63\2"+
		"\2ij\7\t\2\2jk\5\20\t\2kl\7\n\2\2lm\5\16\b\2m|\3\2\2\2no\5\f\7\2op\7\63"+
		"\2\2pq\7\t\2\2qr\5\20\t\2rs\7\n\2\2st\7\13\2\2t|\3\2\2\2uv\5\f\7\2vw\7"+
		"\63\2\2wx\7\t\2\2xy\7\n\2\2yz\7\13\2\2z|\3\2\2\2{a\3\2\2\2{g\3\2\2\2{"+
		"n\3\2\2\2{u\3\2\2\2|\13\3\2\2\2}~\t\2\2\2~\r\3\2\2\2\177\u0080\7\21\2"+
		"\2\u0080\u0081\5\20\t\2\u0081\u0082\7\22\2\2\u0082\u0085\3\2\2\2\u0083"+
		"\u0085\5\20\t\2\u0084\177\3\2\2\2\u0084\u0083\3\2\2\2\u0085\17\3\2\2\2"+
		"\u0086\u008e\5\22\n\2\u0087\u008e\5\24\13\2\u0088\u008e\5\26\f\2\u0089"+
		"\u008e\5*\26\2\u008a\u008e\5\64\33\2\u008b\u008e\5\66\34\2\u008c\u008e"+
		"\5,\27\2\u008d\u0086\3\2\2\2\u008d\u0087\3\2\2\2\u008d\u0088\3\2\2\2\u008d"+
		"\u0089\3\2\2\2\u008d\u008a\3\2\2\2\u008d\u008b\3\2\2\2\u008d\u008c\3\2"+
		"\2\2\u008e\u008f\3\2\2\2\u008f\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090"+
		"\21\3\2\2\2\u0091\u0092\5\f\7\2\u0092\u0093\5(\25\2\u0093\u0094\7\13\2"+
		"\2\u0094\u009c\3\2\2\2\u0095\u0096\5(\25\2\u0096\u0097\7\13\2\2\u0097"+
		"\u009c\3\2\2\2\u0098\u0099\5\f\7\2\u0099\u009a\5(\25\2\u009a\u009c\3\2"+
		"\2\2\u009b\u0091\3\2\2\2\u009b\u0095\3\2\2\2\u009b\u0098\3\2\2\2\u009c"+
		"\23\3\2\2\2\u009d\u009e\7\23\2\2\u009e\u009f\7\24\2\2\u009f\u00a0\5(\25"+
		"\2\u00a0\u00a1\7\13\2\2\u00a1\u00a2\5\16\b\2\u00a2\u00ac\3\2\2\2\u00a3"+
		"\u00a4\7\23\2\2\u00a4\u00a5\7\24\2\2\u00a5\u00a6\5(\25\2\u00a6\u00a7\7"+
		"\13\2\2\u00a7\u00a8\5\16\b\2\u00a8\u00a9\7\25\2\2\u00a9\u00aa\5\16\b\2"+
		"\u00aa\u00ac\3\2\2\2\u00ab\u009d\3\2\2\2\u00ab\u00a3\3\2\2\2\u00ac\25"+
		"\3\2\2\2\u00ad\u00b1\5\32\16\2\u00ae\u00b1\5\36\20\2\u00af\u00b1\5\30"+
		"\r\2\u00b0\u00ad\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b0\u00af\3\2\2\2\u00b1"+
		"\27\3\2\2\2\u00b2\u00b3\7\26\2\2\u00b3\u00b4\5\16\b\2\u00b4\u00b5\7\27"+
		"\2\2\u00b5\u00b6\7\t\2\2\u00b6\u00b7\5\34\17\2\u00b7\u00b8\7\n\2\2\u00b8"+
		"\31\3\2\2\2\u00b9\u00ba\7\27\2\2\u00ba\u00bb\7\t\2\2\u00bb\u00bc\5\34"+
		"\17\2\u00bc\u00bd\7\n\2\2\u00bd\u00be\5\16\b\2\u00be\33\3\2\2\2\u00bf"+
		"\u00c0\5<\37\2\u00c0\u00c1\5&\24\2\u00c1\u00c2\5<\37\2\u00c2\u00c5\3\2"+
		"\2\2\u00c3\u00c5\5<\37\2\u00c4\u00bf\3\2\2\2\u00c4\u00c3\3\2\2\2\u00c5"+
		"\35\3\2\2\2\u00c6\u00c7\7\30\2\2\u00c7\u00c8\7\t\2\2\u00c8\u00c9\5 \21"+
		"\2\u00c9\u00ca\7\n\2\2\u00ca\u00cb\5\16\b\2\u00cb\37\3\2\2\2\u00cc\u00cd"+
		"\5\"\22\2\u00cd\u00ce\5$\23\2\u00ce!\3\2\2\2\u00cf\u00d0\58\35\2\u00d0"+
		"\u00d1\5&\24\2\u00d1\u00d2\5<\37\2\u00d2\u00d3\7\13\2\2\u00d3\u00d4\5"+
		"8\35\2\u00d4\u00d5\5&\24\2\u00d5\u00d6\5<\37\2\u00d6\u00d7\7\13\2\2\u00d7"+
		"#\3\2\2\2\u00d8\u00d9\5:\36\2\u00d9\u00da\58\35\2\u00da\u00df\3\2\2\2"+
		"\u00db\u00dc\58\35\2\u00dc\u00dd\5:\36\2\u00dd\u00df\3\2\2\2\u00de\u00d8"+
		"\3\2\2\2\u00de\u00db\3\2\2\2\u00df%\3\2\2\2\u00e0\u00e1\t\3\2\2\u00e1"+
		"\'\3\2\2\2\u00e2\u00e3\b\25\1\2\u00e3\u00e4\5\62\32\2\u00e4\u00e5\5(\25"+
		"\13\u00e5\u00f6\3\2\2\2\u00e6\u00e7\7 \2\2\u00e7\u00e8\5(\25\2\u00e8\u00e9"+
		"\7!\2\2\u00e9\u00f6\3\2\2\2\u00ea\u00eb\5:\36\2\u00eb\u00ec\5<\37\2\u00ec"+
		"\u00f6\3\2\2\2\u00ed\u00ee\5<\37\2\u00ee\u00ef\5:\36\2\u00ef\u00f6\3\2"+
		"\2\2\u00f0\u00f6\5<\37\2\u00f1\u00f2\5<\37\2\u00f2\u00f3\5> \2\u00f3\u00f4"+
		"\5<\37\2\u00f4\u00f6\3\2\2\2\u00f5\u00e2\3\2\2\2\u00f5\u00e6\3\2\2\2\u00f5"+
		"\u00ea\3\2\2\2\u00f5\u00ed\3\2\2\2\u00f5\u00f0\3\2\2\2\u00f5\u00f1\3\2"+
		"\2\2\u00f6\u0108\3\2\2\2\u00f7\u00f8\f\f\2\2\u00f8\u00f9\5\60\31\2\u00f9"+
		"\u00fa\5(\25\r\u00fa\u0107\3\2\2\2\u00fb\u00fc\f\n\2\2\u00fc\u00fd\5&"+
		"\24\2\u00fd\u00fe\5(\25\13\u00fe\u0107\3\2\2\2\u00ff\u0100\f\t\2\2\u0100"+
		"\u0101\5.\30\2\u0101\u0102\5(\25\n\u0102\u0107\3\2\2\2\u0103\u0104\f\5"+
		"\2\2\u0104\u0105\7\"\2\2\u0105\u0107\5(\25\6\u0106\u00f7\3\2\2\2\u0106"+
		"\u00fb\3\2\2\2\u0106\u00ff\3\2\2\2\u0106\u0103\3\2\2\2\u0107\u010a\3\2"+
		"\2\2\u0108\u0106\3\2\2\2\u0108\u0109\3\2\2\2\u0109)\3\2\2\2\u010a\u0108"+
		"\3\2\2\2\u010b\u010c\7#\2\2\u010c\u010d\5(\25\2\u010d\u010e\7\13\2\2\u010e"+
		"+\3\2\2\2\u010f\u0110\7$\2\2\u0110\u0111\7\13\2\2\u0111-\3\2\2\2\u0112"+
		"\u0113\t\4\2\2\u0113/\3\2\2\2\u0114\u0115\t\5\2\2\u0115\61\3\2\2\2\u0116"+
		"\u0117\7-\2\2\u0117\63\3\2\2\2\u0118\u0119\7.\2\2\u0119\u011a\5(\25\2"+
		"\u011a\u011b\7\13\2\2\u011b\65\3\2\2\2\u011c\u011d\7/\2\2\u011d\u011e"+
		"\5<\37\2\u011e\u011f\7\13\2\2\u011f\67\3\2\2\2\u0120\u0121\7\63\2\2\u0121"+
		"9\3\2\2\2\u0122\u0123\t\6\2\2\u0123;\3\2\2\2\u0124\u0125\t\7\2\2\u0125"+
		"=\3\2\2\2\u0126\u0127\7\62\2\2\u0127?\3\2\2\2\21GS_{\u0084\u008d\u008f"+
		"\u009b\u00ab\u00b0\u00c4\u00de\u00f5\u0106\u0108";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}