// Generated from c:/automatas II/nuestrolenguaje3/nuestrolenguaje/nuestrolenguaje/src/main/antlr4/com/nuestrolenguaje/manbel.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class manbelParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SUM=1, REST=2, MUL=3, DIV=4, EQ=5, COMMA=6, SEMI=7, LPAREN=8, RPAREN=9, 
		LCURLY=10, RCURLY=11, MAYOR=12, MENOR=13, MAYOR_EQ=14, MENOR_EQ=15, IGUAL=16, 
		IF=17, ELSE=18, FOR=19, TIPO=20, STRING=21, BOOL=22, NUM=23, ID=24, WS=25;
	public static final int
		RULE_programa = 0, RULE_declaracion = 1, RULE_instruccion = 2, RULE_asig = 3, 
		RULE_floop = 4, RULE_def = 5, RULE_else_if = 6, RULE_else_block = 7, RULE_condicion = 8, 
		RULE_expr = 9, RULE_incremento = 10, RULE_termino = 11, RULE_factor = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "declaracion", "instruccion", "asig", "floop", "def", "else_if", 
			"else_block", "condicion", "expr", "incremento", "termino", "factor"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'+'", "'-'", "'*'", "'/'", "'='", "','", "';'", "'('", "')'", 
			"'{'", "'}'", "'>'", "'<'", "'>='", "'<='", "'=='", "'if'", "'else'", 
			"'for'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SUM", "REST", "MUL", "DIV", "EQ", "COMMA", "SEMI", "LPAREN", "RPAREN", 
			"LCURLY", "RCURLY", "MAYOR", "MENOR", "MAYOR_EQ", "MENOR_EQ", "IGUAL", 
			"IF", "ELSE", "FOR", "TIPO", "STRING", "BOOL", "NUM", "ID", "WS"
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
	public String getGrammarFileName() { return "manbel.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public manbelParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramaContext extends ParserRuleContext {
		public List<InstruccionContext> instruccion() {
			return getRuleContexts(InstruccionContext.class);
		}
		public InstruccionContext instruccion(int i) {
			return getRuleContext(InstruccionContext.class,i);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 33161474L) != 0)) {
				{
				{
				setState(26);
				instruccion();
				}
				}
				setState(31);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclaracionContext extends ParserRuleContext {
		public TerminalNode TIPO() { return getToken(manbelParser.TIPO, 0); }
		public TerminalNode ID() { return getToken(manbelParser.ID, 0); }
		public TerminalNode EQ() { return getToken(manbelParser.EQ, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public DeclaracionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracion; }
	}

	public final DeclaracionContext declaracion() throws RecognitionException {
		DeclaracionContext _localctx = new DeclaracionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declaracion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			match(TIPO);
			setState(33);
			match(ID);
			setState(36);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQ) {
				{
				setState(34);
				match(EQ);
				setState(35);
				expr();
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class InstruccionContext extends ParserRuleContext {
		public DeclaracionContext declaracion() {
			return getRuleContext(DeclaracionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(manbelParser.SEMI, 0); }
		public AsigContext asig() {
			return getRuleContext(AsigContext.class,0);
		}
		public IncrementoContext incremento() {
			return getRuleContext(IncrementoContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public DefContext def() {
			return getRuleContext(DefContext.class,0);
		}
		public FloopContext floop() {
			return getRuleContext(FloopContext.class,0);
		}
		public InstruccionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruccion; }
	}

	public final InstruccionContext instruccion() throws RecognitionException {
		InstruccionContext _localctx = new InstruccionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_instruccion);
		try {
			setState(52);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(38);
				declaracion();
				setState(39);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(41);
				asig();
				setState(42);
				match(SEMI);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(44);
				incremento();
				setState(45);
				match(SEMI);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(47);
				expr();
				setState(48);
				match(SEMI);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(50);
				def();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(51);
				floop();
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

	@SuppressWarnings("CheckReturnValue")
	public static class AsigContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(manbelParser.ID, 0); }
		public TerminalNode EQ() { return getToken(manbelParser.EQ, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AsigContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asig; }
	}

	public final AsigContext asig() throws RecognitionException {
		AsigContext _localctx = new AsigContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_asig);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			match(ID);
			setState(55);
			match(EQ);
			setState(56);
			expr();
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

	@SuppressWarnings("CheckReturnValue")
	public static class FloopContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(manbelParser.FOR, 0); }
		public TerminalNode LPAREN() { return getToken(manbelParser.LPAREN, 0); }
		public List<TerminalNode> SEMI() { return getTokens(manbelParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(manbelParser.SEMI, i);
		}
		public TerminalNode RPAREN() { return getToken(manbelParser.RPAREN, 0); }
		public TerminalNode LCURLY() { return getToken(manbelParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(manbelParser.RCURLY, 0); }
		public AsigContext asig() {
			return getRuleContext(AsigContext.class,0);
		}
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public IncrementoContext incremento() {
			return getRuleContext(IncrementoContext.class,0);
		}
		public List<InstruccionContext> instruccion() {
			return getRuleContexts(InstruccionContext.class);
		}
		public InstruccionContext instruccion(int i) {
			return getRuleContext(InstruccionContext.class,i);
		}
		public FloopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floop; }
	}

	public final FloopContext floop() throws RecognitionException {
		FloopContext _localctx = new FloopContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_floop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			match(FOR);
			setState(59);
			match(LPAREN);
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(60);
				asig();
				}
			}

			setState(63);
			match(SEMI);
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 31457536L) != 0)) {
				{
				setState(64);
				condicion();
				}
			}

			setState(67);
			match(SEMI);
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SUM || _la==ID) {
				{
				setState(68);
				incremento();
				}
			}

			setState(71);
			match(RPAREN);
			setState(72);
			match(LCURLY);
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 33161474L) != 0)) {
				{
				{
				setState(73);
				instruccion();
				}
				}
				setState(78);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(79);
			match(RCURLY);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DefContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(manbelParser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(manbelParser.LPAREN, 0); }
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(manbelParser.RPAREN, 0); }
		public TerminalNode LCURLY() { return getToken(manbelParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(manbelParser.RCURLY, 0); }
		public List<InstruccionContext> instruccion() {
			return getRuleContexts(InstruccionContext.class);
		}
		public InstruccionContext instruccion(int i) {
			return getRuleContext(InstruccionContext.class,i);
		}
		public List<Else_ifContext> else_if() {
			return getRuleContexts(Else_ifContext.class);
		}
		public Else_ifContext else_if(int i) {
			return getRuleContext(Else_ifContext.class,i);
		}
		public Else_blockContext else_block() {
			return getRuleContext(Else_blockContext.class,0);
		}
		public DefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_def; }
	}

	public final DefContext def() throws RecognitionException {
		DefContext _localctx = new DefContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_def);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			match(IF);
			setState(82);
			match(LPAREN);
			setState(83);
			condicion();
			setState(84);
			match(RPAREN);
			setState(85);
			match(LCURLY);
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 33161474L) != 0)) {
				{
				{
				setState(86);
				instruccion();
				}
				}
				setState(91);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(92);
			match(RCURLY);
			setState(96);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(93);
					else_if();
					}
					} 
				}
				setState(98);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(99);
				else_block();
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class Else_ifContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(manbelParser.ELSE, 0); }
		public TerminalNode IF() { return getToken(manbelParser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(manbelParser.LPAREN, 0); }
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(manbelParser.RPAREN, 0); }
		public TerminalNode LCURLY() { return getToken(manbelParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(manbelParser.RCURLY, 0); }
		public List<InstruccionContext> instruccion() {
			return getRuleContexts(InstruccionContext.class);
		}
		public InstruccionContext instruccion(int i) {
			return getRuleContext(InstruccionContext.class,i);
		}
		public Else_ifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_if; }
	}

	public final Else_ifContext else_if() throws RecognitionException {
		Else_ifContext _localctx = new Else_ifContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_else_if);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			match(ELSE);
			setState(103);
			match(IF);
			setState(104);
			match(LPAREN);
			setState(105);
			condicion();
			setState(106);
			match(RPAREN);
			setState(107);
			match(LCURLY);
			setState(111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 33161474L) != 0)) {
				{
				{
				setState(108);
				instruccion();
				}
				}
				setState(113);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(114);
			match(RCURLY);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Else_blockContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(manbelParser.ELSE, 0); }
		public TerminalNode LCURLY() { return getToken(manbelParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(manbelParser.RCURLY, 0); }
		public List<InstruccionContext> instruccion() {
			return getRuleContexts(InstruccionContext.class);
		}
		public InstruccionContext instruccion(int i) {
			return getRuleContext(InstruccionContext.class,i);
		}
		public Else_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_block; }
	}

	public final Else_blockContext else_block() throws RecognitionException {
		Else_blockContext _localctx = new Else_blockContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_else_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(ELSE);
			setState(117);
			match(LCURLY);
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 33161474L) != 0)) {
				{
				{
				setState(118);
				instruccion();
				}
				}
				setState(123);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(124);
			match(RCURLY);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CondicionContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MAYOR() { return getToken(manbelParser.MAYOR, 0); }
		public TerminalNode MENOR() { return getToken(manbelParser.MENOR, 0); }
		public TerminalNode MAYOR_EQ() { return getToken(manbelParser.MAYOR_EQ, 0); }
		public TerminalNode MENOR_EQ() { return getToken(manbelParser.MENOR_EQ, 0); }
		public TerminalNode IGUAL() { return getToken(manbelParser.IGUAL, 0); }
		public CondicionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicion; }
	}

	public final CondicionContext condicion() throws RecognitionException {
		CondicionContext _localctx = new CondicionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_condicion);
		try {
			setState(146);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(126);
				expr();
				setState(127);
				match(MAYOR);
				setState(128);
				expr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(130);
				expr();
				setState(131);
				match(MENOR);
				setState(132);
				expr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(134);
				expr();
				setState(135);
				match(MAYOR_EQ);
				setState(136);
				expr();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(138);
				expr();
				setState(139);
				match(MENOR_EQ);
				setState(140);
				expr();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(142);
				expr();
				setState(143);
				match(IGUAL);
				setState(144);
				expr();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public Token op;
		public List<TerminoContext> termino() {
			return getRuleContexts(TerminoContext.class);
		}
		public TerminoContext termino(int i) {
			return getRuleContext(TerminoContext.class,i);
		}
		public List<TerminalNode> SUM() { return getTokens(manbelParser.SUM); }
		public TerminalNode SUM(int i) {
			return getToken(manbelParser.SUM, i);
		}
		public List<TerminalNode> REST() { return getTokens(manbelParser.REST); }
		public TerminalNode REST(int i) {
			return getToken(manbelParser.REST, i);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			termino();
			setState(153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SUM || _la==REST) {
				{
				{
				setState(149);
				((ExprContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==SUM || _la==REST) ) {
					((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(150);
				termino();
				}
				}
				setState(155);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class IncrementoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(manbelParser.ID, 0); }
		public List<TerminalNode> SUM() { return getTokens(manbelParser.SUM); }
		public TerminalNode SUM(int i) {
			return getToken(manbelParser.SUM, i);
		}
		public IncrementoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_incremento; }
	}

	public final IncrementoContext incremento() throws RecognitionException {
		IncrementoContext _localctx = new IncrementoContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_incremento);
		try {
			setState(162);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(156);
				match(ID);
				setState(157);
				match(SUM);
				setState(158);
				match(SUM);
				}
				break;
			case SUM:
				enterOuterAlt(_localctx, 2);
				{
				setState(159);
				match(SUM);
				setState(160);
				match(SUM);
				setState(161);
				match(ID);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TerminoContext extends ParserRuleContext {
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public List<TerminalNode> MUL() { return getTokens(manbelParser.MUL); }
		public TerminalNode MUL(int i) {
			return getToken(manbelParser.MUL, i);
		}
		public List<TerminalNode> DIV() { return getTokens(manbelParser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(manbelParser.DIV, i);
		}
		public TerminoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termino; }
	}

	public final TerminoContext termino() throws RecognitionException {
		TerminoContext _localctx = new TerminoContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_termino);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			factor();
			setState(169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MUL || _la==DIV) {
				{
				{
				setState(165);
				_la = _input.LA(1);
				if ( !(_la==MUL || _la==DIV) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(166);
				factor();
				}
				}
				setState(171);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FactorContext extends ParserRuleContext {
		public TerminalNode NUM() { return getToken(manbelParser.NUM, 0); }
		public TerminalNode ID() { return getToken(manbelParser.ID, 0); }
		public TerminalNode STRING() { return getToken(manbelParser.STRING, 0); }
		public TerminalNode BOOL() { return getToken(manbelParser.BOOL, 0); }
		public TerminalNode LPAREN() { return getToken(manbelParser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(manbelParser.RPAREN, 0); }
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_factor);
		try {
			setState(180);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM:
				enterOuterAlt(_localctx, 1);
				{
				setState(172);
				match(NUM);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(173);
				match(ID);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(174);
				match(STRING);
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 4);
				{
				setState(175);
				match(BOOL);
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 5);
				{
				setState(176);
				match(LPAREN);
				setState(177);
				expr();
				setState(178);
				match(RPAREN);
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

	public static final String _serializedATN =
		"\u0004\u0001\u0019\u00b7\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0001\u0000\u0005\u0000\u001c\b\u0000\n\u0000\f\u0000"+
		"\u001f\t\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		"%\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u00025\b\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0003\u0004>\b\u0004\u0001\u0004\u0001\u0004\u0003\u0004B\b\u0004\u0001"+
		"\u0004\u0001\u0004\u0003\u0004F\b\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0005\u0004K\b\u0004\n\u0004\f\u0004N\t\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0005\u0005X\b\u0005\n\u0005\f\u0005[\t\u0005\u0001\u0005\u0001"+
		"\u0005\u0005\u0005_\b\u0005\n\u0005\f\u0005b\t\u0005\u0001\u0005\u0003"+
		"\u0005e\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0005\u0006n\b\u0006\n\u0006\f\u0006q\t"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0005"+
		"\u0007x\b\u0007\n\u0007\f\u0007{\t\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0003\b\u0093\b\b\u0001\t\u0001\t\u0001\t\u0005\t\u0098\b\t"+
		"\n\t\f\t\u009b\t\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003"+
		"\n\u00a3\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u00a8\b\u000b"+
		"\n\u000b\f\u000b\u00ab\t\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0003\f\u00b5\b\f\u0001\f\u0000\u0000\r\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u0000\u0002"+
		"\u0001\u0000\u0001\u0002\u0001\u0000\u0003\u0004\u00c4\u0000\u001d\u0001"+
		"\u0000\u0000\u0000\u0002 \u0001\u0000\u0000\u0000\u00044\u0001\u0000\u0000"+
		"\u0000\u00066\u0001\u0000\u0000\u0000\b:\u0001\u0000\u0000\u0000\nQ\u0001"+
		"\u0000\u0000\u0000\ff\u0001\u0000\u0000\u0000\u000et\u0001\u0000\u0000"+
		"\u0000\u0010\u0092\u0001\u0000\u0000\u0000\u0012\u0094\u0001\u0000\u0000"+
		"\u0000\u0014\u00a2\u0001\u0000\u0000\u0000\u0016\u00a4\u0001\u0000\u0000"+
		"\u0000\u0018\u00b4\u0001\u0000\u0000\u0000\u001a\u001c\u0003\u0004\u0002"+
		"\u0000\u001b\u001a\u0001\u0000\u0000\u0000\u001c\u001f\u0001\u0000\u0000"+
		"\u0000\u001d\u001b\u0001\u0000\u0000\u0000\u001d\u001e\u0001\u0000\u0000"+
		"\u0000\u001e\u0001\u0001\u0000\u0000\u0000\u001f\u001d\u0001\u0000\u0000"+
		"\u0000 !\u0005\u0014\u0000\u0000!$\u0005\u0018\u0000\u0000\"#\u0005\u0005"+
		"\u0000\u0000#%\u0003\u0012\t\u0000$\"\u0001\u0000\u0000\u0000$%\u0001"+
		"\u0000\u0000\u0000%\u0003\u0001\u0000\u0000\u0000&\'\u0003\u0002\u0001"+
		"\u0000\'(\u0005\u0007\u0000\u0000(5\u0001\u0000\u0000\u0000)*\u0003\u0006"+
		"\u0003\u0000*+\u0005\u0007\u0000\u0000+5\u0001\u0000\u0000\u0000,-\u0003"+
		"\u0014\n\u0000-.\u0005\u0007\u0000\u0000.5\u0001\u0000\u0000\u0000/0\u0003"+
		"\u0012\t\u000001\u0005\u0007\u0000\u000015\u0001\u0000\u0000\u000025\u0003"+
		"\n\u0005\u000035\u0003\b\u0004\u00004&\u0001\u0000\u0000\u00004)\u0001"+
		"\u0000\u0000\u00004,\u0001\u0000\u0000\u00004/\u0001\u0000\u0000\u0000"+
		"42\u0001\u0000\u0000\u000043\u0001\u0000\u0000\u00005\u0005\u0001\u0000"+
		"\u0000\u000067\u0005\u0018\u0000\u000078\u0005\u0005\u0000\u000089\u0003"+
		"\u0012\t\u00009\u0007\u0001\u0000\u0000\u0000:;\u0005\u0013\u0000\u0000"+
		";=\u0005\b\u0000\u0000<>\u0003\u0006\u0003\u0000=<\u0001\u0000\u0000\u0000"+
		"=>\u0001\u0000\u0000\u0000>?\u0001\u0000\u0000\u0000?A\u0005\u0007\u0000"+
		"\u0000@B\u0003\u0010\b\u0000A@\u0001\u0000\u0000\u0000AB\u0001\u0000\u0000"+
		"\u0000BC\u0001\u0000\u0000\u0000CE\u0005\u0007\u0000\u0000DF\u0003\u0014"+
		"\n\u0000ED\u0001\u0000\u0000\u0000EF\u0001\u0000\u0000\u0000FG\u0001\u0000"+
		"\u0000\u0000GH\u0005\t\u0000\u0000HL\u0005\n\u0000\u0000IK\u0003\u0004"+
		"\u0002\u0000JI\u0001\u0000\u0000\u0000KN\u0001\u0000\u0000\u0000LJ\u0001"+
		"\u0000\u0000\u0000LM\u0001\u0000\u0000\u0000MO\u0001\u0000\u0000\u0000"+
		"NL\u0001\u0000\u0000\u0000OP\u0005\u000b\u0000\u0000P\t\u0001\u0000\u0000"+
		"\u0000QR\u0005\u0011\u0000\u0000RS\u0005\b\u0000\u0000ST\u0003\u0010\b"+
		"\u0000TU\u0005\t\u0000\u0000UY\u0005\n\u0000\u0000VX\u0003\u0004\u0002"+
		"\u0000WV\u0001\u0000\u0000\u0000X[\u0001\u0000\u0000\u0000YW\u0001\u0000"+
		"\u0000\u0000YZ\u0001\u0000\u0000\u0000Z\\\u0001\u0000\u0000\u0000[Y\u0001"+
		"\u0000\u0000\u0000\\`\u0005\u000b\u0000\u0000]_\u0003\f\u0006\u0000^]"+
		"\u0001\u0000\u0000\u0000_b\u0001\u0000\u0000\u0000`^\u0001\u0000\u0000"+
		"\u0000`a\u0001\u0000\u0000\u0000ad\u0001\u0000\u0000\u0000b`\u0001\u0000"+
		"\u0000\u0000ce\u0003\u000e\u0007\u0000dc\u0001\u0000\u0000\u0000de\u0001"+
		"\u0000\u0000\u0000e\u000b\u0001\u0000\u0000\u0000fg\u0005\u0012\u0000"+
		"\u0000gh\u0005\u0011\u0000\u0000hi\u0005\b\u0000\u0000ij\u0003\u0010\b"+
		"\u0000jk\u0005\t\u0000\u0000ko\u0005\n\u0000\u0000ln\u0003\u0004\u0002"+
		"\u0000ml\u0001\u0000\u0000\u0000nq\u0001\u0000\u0000\u0000om\u0001\u0000"+
		"\u0000\u0000op\u0001\u0000\u0000\u0000pr\u0001\u0000\u0000\u0000qo\u0001"+
		"\u0000\u0000\u0000rs\u0005\u000b\u0000\u0000s\r\u0001\u0000\u0000\u0000"+
		"tu\u0005\u0012\u0000\u0000uy\u0005\n\u0000\u0000vx\u0003\u0004\u0002\u0000"+
		"wv\u0001\u0000\u0000\u0000x{\u0001\u0000\u0000\u0000yw\u0001\u0000\u0000"+
		"\u0000yz\u0001\u0000\u0000\u0000z|\u0001\u0000\u0000\u0000{y\u0001\u0000"+
		"\u0000\u0000|}\u0005\u000b\u0000\u0000}\u000f\u0001\u0000\u0000\u0000"+
		"~\u007f\u0003\u0012\t\u0000\u007f\u0080\u0005\f\u0000\u0000\u0080\u0081"+
		"\u0003\u0012\t\u0000\u0081\u0093\u0001\u0000\u0000\u0000\u0082\u0083\u0003"+
		"\u0012\t\u0000\u0083\u0084\u0005\r\u0000\u0000\u0084\u0085\u0003\u0012"+
		"\t\u0000\u0085\u0093\u0001\u0000\u0000\u0000\u0086\u0087\u0003\u0012\t"+
		"\u0000\u0087\u0088\u0005\u000e\u0000\u0000\u0088\u0089\u0003\u0012\t\u0000"+
		"\u0089\u0093\u0001\u0000\u0000\u0000\u008a\u008b\u0003\u0012\t\u0000\u008b"+
		"\u008c\u0005\u000f\u0000\u0000\u008c\u008d\u0003\u0012\t\u0000\u008d\u0093"+
		"\u0001\u0000\u0000\u0000\u008e\u008f\u0003\u0012\t\u0000\u008f\u0090\u0005"+
		"\u0010\u0000\u0000\u0090\u0091\u0003\u0012\t\u0000\u0091\u0093\u0001\u0000"+
		"\u0000\u0000\u0092~\u0001\u0000\u0000\u0000\u0092\u0082\u0001\u0000\u0000"+
		"\u0000\u0092\u0086\u0001\u0000\u0000\u0000\u0092\u008a\u0001\u0000\u0000"+
		"\u0000\u0092\u008e\u0001\u0000\u0000\u0000\u0093\u0011\u0001\u0000\u0000"+
		"\u0000\u0094\u0099\u0003\u0016\u000b\u0000\u0095\u0096\u0007\u0000\u0000"+
		"\u0000\u0096\u0098\u0003\u0016\u000b\u0000\u0097\u0095\u0001\u0000\u0000"+
		"\u0000\u0098\u009b\u0001\u0000\u0000\u0000\u0099\u0097\u0001\u0000\u0000"+
		"\u0000\u0099\u009a\u0001\u0000\u0000\u0000\u009a\u0013\u0001\u0000\u0000"+
		"\u0000\u009b\u0099\u0001\u0000\u0000\u0000\u009c\u009d\u0005\u0018\u0000"+
		"\u0000\u009d\u009e\u0005\u0001\u0000\u0000\u009e\u00a3\u0005\u0001\u0000"+
		"\u0000\u009f\u00a0\u0005\u0001\u0000\u0000\u00a0\u00a1\u0005\u0001\u0000"+
		"\u0000\u00a1\u00a3\u0005\u0018\u0000\u0000\u00a2\u009c\u0001\u0000\u0000"+
		"\u0000\u00a2\u009f\u0001\u0000\u0000\u0000\u00a3\u0015\u0001\u0000\u0000"+
		"\u0000\u00a4\u00a9\u0003\u0018\f\u0000\u00a5\u00a6\u0007\u0001\u0000\u0000"+
		"\u00a6\u00a8\u0003\u0018\f\u0000\u00a7\u00a5\u0001\u0000\u0000\u0000\u00a8"+
		"\u00ab\u0001\u0000\u0000\u0000\u00a9\u00a7\u0001\u0000\u0000\u0000\u00a9"+
		"\u00aa\u0001\u0000\u0000\u0000\u00aa\u0017\u0001\u0000\u0000\u0000\u00ab"+
		"\u00a9\u0001\u0000\u0000\u0000\u00ac\u00b5\u0005\u0017\u0000\u0000\u00ad"+
		"\u00b5\u0005\u0018\u0000\u0000\u00ae\u00b5\u0005\u0015\u0000\u0000\u00af"+
		"\u00b5\u0005\u0016\u0000\u0000\u00b0\u00b1\u0005\b\u0000\u0000\u00b1\u00b2"+
		"\u0003\u0012\t\u0000\u00b2\u00b3\u0005\t\u0000\u0000\u00b3\u00b5\u0001"+
		"\u0000\u0000\u0000\u00b4\u00ac\u0001\u0000\u0000\u0000\u00b4\u00ad\u0001"+
		"\u0000\u0000\u0000\u00b4\u00ae\u0001\u0000\u0000\u0000\u00b4\u00af\u0001"+
		"\u0000\u0000\u0000\u00b4\u00b0\u0001\u0000\u0000\u0000\u00b5\u0019\u0001"+
		"\u0000\u0000\u0000\u0011\u001d$4=AELY`doy\u0092\u0099\u00a2\u00a9\u00b4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}