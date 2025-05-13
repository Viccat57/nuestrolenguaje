// Generated from c:/automatas II/nuestrolenguajeV2/nuestrolenguaje/src/main/antlr4/com/nuestrolenguaje/manbel.g4 by ANTLR 4.13.1
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
		IF=17, ELSE=18, FOR=19, MOSTRAR=20, COMMENT=21, TIPO=22, STRING=23, BOOL=24, 
		NUM=25, ID=26, WS=27;
	public static final int
		RULE_programa = 0, RULE_declaracion = 1, RULE_instruccion = 2, RULE_asig = 3, 
		RULE_mostrar = 4, RULE_floop = 5, RULE_def = 6, RULE_else_if = 7, RULE_else_block = 8, 
		RULE_condicion = 9, RULE_expr = 10, RULE_incremento = 11, RULE_termino = 12, 
		RULE_factor = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "declaracion", "instruccion", "asig", "mostrar", "floop", 
			"def", "else_if", "else_block", "condicion", "expr", "incremento", "termino", 
			"factor"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'+'", "'-'", "'*'", "'/'", "'='", "','", "';'", "'('", "')'", 
			"'{'", "'}'", "'>'", "'<'", "'>='", "'<='", "'=='", "'checa'", "'sino'", 
			"'foopi'", "'mostrar'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SUM", "REST", "MUL", "DIV", "EQ", "COMMA", "SEMI", "LPAREN", "RPAREN", 
			"LCURLY", "RCURLY", "MAYOR", "MENOR", "MAYOR_EQ", "MENOR_EQ", "IGUAL", 
			"IF", "ELSE", "FOR", "MOSTRAR", "COMMENT", "TIPO", "STRING", "BOOL", 
			"NUM", "ID", "WS"
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
			setState(31);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 131727618L) != 0)) {
				{
				{
				setState(28);
				instruccion();
				}
				}
				setState(33);
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
			setState(34);
			match(TIPO);
			setState(35);
			match(ID);
			setState(38);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQ) {
				{
				setState(36);
				match(EQ);
				setState(37);
				expr(0);
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
		public MostrarContext mostrar() {
			return getRuleContext(MostrarContext.class,0);
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
			setState(57);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(40);
				declaracion();
				setState(41);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(43);
				asig();
				setState(44);
				match(SEMI);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(46);
				incremento();
				setState(47);
				match(SEMI);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(49);
				expr(0);
				setState(50);
				match(SEMI);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(52);
				def();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(53);
				floop();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(54);
				mostrar();
				setState(55);
				match(SEMI);
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
			setState(59);
			match(ID);
			setState(60);
			match(EQ);
			setState(61);
			expr(0);
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
	public static class MostrarContext extends ParserRuleContext {
		public TerminalNode MOSTRAR() { return getToken(manbelParser.MOSTRAR, 0); }
		public TerminalNode LPAREN() { return getToken(manbelParser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(manbelParser.RPAREN, 0); }
		public MostrarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mostrar; }
	}

	public final MostrarContext mostrar() throws RecognitionException {
		MostrarContext _localctx = new MostrarContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_mostrar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			match(MOSTRAR);
			setState(64);
			match(LPAREN);
			setState(65);
			expr(0);
			setState(66);
			match(RPAREN);
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
		public DeclaracionContext declaracion() {
			return getRuleContext(DeclaracionContext.class,0);
		}
		public List<AsigContext> asig() {
			return getRuleContexts(AsigContext.class);
		}
		public AsigContext asig(int i) {
			return getRuleContext(AsigContext.class,i);
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
		enterRule(_localctx, 10, RULE_floop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(FOR);
			setState(69);
			match(LPAREN);
			setState(72);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TIPO:
				{
				setState(70);
				declaracion();
				}
				break;
			case ID:
				{
				setState(71);
				asig();
				}
				break;
			case SEMI:
				break;
			default:
				break;
			}
			setState(74);
			match(SEMI);
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 125829378L) != 0)) {
				{
				setState(75);
				condicion();
				}
			}

			setState(78);
			match(SEMI);
			setState(81);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(79);
				asig();
				}
				break;
			case 2:
				{
				setState(80);
				incremento();
				}
				break;
			}
			setState(83);
			match(RPAREN);
			setState(84);
			match(LCURLY);
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 131727618L) != 0)) {
				{
				{
				setState(85);
				instruccion();
				}
				}
				setState(90);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(91);
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
		enterRule(_localctx, 12, RULE_def);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(IF);
			setState(94);
			match(LPAREN);
			setState(95);
			condicion();
			setState(96);
			match(RPAREN);
			setState(97);
			match(LCURLY);
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 131727618L) != 0)) {
				{
				{
				setState(98);
				instruccion();
				}
				}
				setState(103);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(104);
			match(RCURLY);
			setState(108);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(105);
					else_if();
					}
					} 
				}
				setState(110);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(111);
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
		enterRule(_localctx, 14, RULE_else_if);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(ELSE);
			setState(115);
			match(IF);
			setState(116);
			match(LPAREN);
			setState(117);
			condicion();
			setState(118);
			match(RPAREN);
			setState(119);
			match(LCURLY);
			setState(123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 131727618L) != 0)) {
				{
				{
				setState(120);
				instruccion();
				}
				}
				setState(125);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(126);
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
		enterRule(_localctx, 16, RULE_else_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(ELSE);
			setState(129);
			match(LCURLY);
			setState(133);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 131727618L) != 0)) {
				{
				{
				setState(130);
				instruccion();
				}
				}
				setState(135);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(136);
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
		enterRule(_localctx, 18, RULE_condicion);
		try {
			setState(158);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(138);
				expr(0);
				setState(139);
				match(MAYOR);
				setState(140);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(142);
				expr(0);
				setState(143);
				match(MENOR);
				setState(144);
				expr(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(146);
				expr(0);
				setState(147);
				match(MAYOR_EQ);
				setState(148);
				expr(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(150);
				expr(0);
				setState(151);
				match(MENOR_EQ);
				setState(152);
				expr(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(154);
				expr(0);
				setState(155);
				match(IGUAL);
				setState(156);
				expr(0);
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
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpresionComparacionContext extends ExprContext {
		public Token op;
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
		public ExpresionComparacionContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpresionIncrementoContext extends ExprContext {
		public IncrementoContext incremento() {
			return getRuleContext(IncrementoContext.class,0);
		}
		public ExpresionIncrementoContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpresionAritmeticaContext extends ExprContext {
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
		public ExpresionAritmeticaContext(ExprContext ctx) { copyFrom(ctx); }
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				_localctx = new ExpresionAritmeticaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(161);
				termino();
				setState(166);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(162);
						((ExpresionAritmeticaContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==SUM || _la==REST) ) {
							((ExpresionAritmeticaContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(163);
						termino();
						}
						} 
					}
					setState(168);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				}
				}
				break;
			case 2:
				{
				_localctx = new ExpresionIncrementoContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(169);
				incremento();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(177);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpresionComparacionContext(new ExprContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_expr);
					setState(172);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(173);
					((ExpresionComparacionContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 126976L) != 0)) ) {
						((ExpresionComparacionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(174);
					expr(3);
					}
					} 
				}
				setState(179);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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
		enterRule(_localctx, 22, RULE_incremento);
		try {
			setState(186);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(180);
				match(ID);
				setState(181);
				match(SUM);
				setState(182);
				match(SUM);
				}
				break;
			case SUM:
				enterOuterAlt(_localctx, 2);
				{
				setState(183);
				match(SUM);
				setState(184);
				match(SUM);
				setState(185);
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
		enterRule(_localctx, 24, RULE_termino);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			factor();
			setState(193);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(189);
					_la = _input.LA(1);
					if ( !(_la==MUL || _la==DIV) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(190);
					factor();
					}
					} 
				}
				setState(195);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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
		enterRule(_localctx, 26, RULE_factor);
		try {
			setState(204);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM:
				enterOuterAlt(_localctx, 1);
				{
				setState(196);
				match(NUM);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(197);
				match(ID);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(198);
				match(STRING);
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 4);
				{
				setState(199);
				match(BOOL);
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 5);
				{
				setState(200);
				match(LPAREN);
				setState(201);
				expr(0);
				setState(202);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 10:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u001b\u00cf\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0001\u0000\u0005\u0000\u001e\b\u0000"+
		"\n\u0000\f\u0000!\t\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0003\u0001\'\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0003\u0002:\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005I\b\u0005"+
		"\u0001\u0005\u0001\u0005\u0003\u0005M\b\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0003\u0005R\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0005\u0005W\b\u0005\n\u0005\f\u0005Z\t\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0005\u0006d\b\u0006\n\u0006\f\u0006g\t\u0006\u0001\u0006\u0001\u0006"+
		"\u0005\u0006k\b\u0006\n\u0006\f\u0006n\t\u0006\u0001\u0006\u0003\u0006"+
		"q\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0005\u0007z\b\u0007\n\u0007\f\u0007}\t\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0005\b\u0084\b\b\n\b"+
		"\f\b\u0087\t\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t"+
		"\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u009f\b\t\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0005\n\u00a5\b\n\n\n\f\n\u00a8\t\n\u0001\n"+
		"\u0003\n\u00ab\b\n\u0001\n\u0001\n\u0001\n\u0005\n\u00b0\b\n\n\n\f\n\u00b3"+
		"\t\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0003\u000b\u00bb\b\u000b\u0001\f\u0001\f\u0001\f\u0005\f\u00c0"+
		"\b\f\n\f\f\f\u00c3\t\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r"+
		"\u0001\r\u0001\r\u0003\r\u00cd\b\r\u0001\r\u0000\u0001\u0014\u000e\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u0000"+
		"\u0003\u0001\u0000\u0001\u0002\u0001\u0000\f\u0010\u0001\u0000\u0003\u0004"+
		"\u00e0\u0000\u001f\u0001\u0000\u0000\u0000\u0002\"\u0001\u0000\u0000\u0000"+
		"\u00049\u0001\u0000\u0000\u0000\u0006;\u0001\u0000\u0000\u0000\b?\u0001"+
		"\u0000\u0000\u0000\nD\u0001\u0000\u0000\u0000\f]\u0001\u0000\u0000\u0000"+
		"\u000er\u0001\u0000\u0000\u0000\u0010\u0080\u0001\u0000\u0000\u0000\u0012"+
		"\u009e\u0001\u0000\u0000\u0000\u0014\u00aa\u0001\u0000\u0000\u0000\u0016"+
		"\u00ba\u0001\u0000\u0000\u0000\u0018\u00bc\u0001\u0000\u0000\u0000\u001a"+
		"\u00cc\u0001\u0000\u0000\u0000\u001c\u001e\u0003\u0004\u0002\u0000\u001d"+
		"\u001c\u0001\u0000\u0000\u0000\u001e!\u0001\u0000\u0000\u0000\u001f\u001d"+
		"\u0001\u0000\u0000\u0000\u001f \u0001\u0000\u0000\u0000 \u0001\u0001\u0000"+
		"\u0000\u0000!\u001f\u0001\u0000\u0000\u0000\"#\u0005\u0016\u0000\u0000"+
		"#&\u0005\u001a\u0000\u0000$%\u0005\u0005\u0000\u0000%\'\u0003\u0014\n"+
		"\u0000&$\u0001\u0000\u0000\u0000&\'\u0001\u0000\u0000\u0000\'\u0003\u0001"+
		"\u0000\u0000\u0000()\u0003\u0002\u0001\u0000)*\u0005\u0007\u0000\u0000"+
		"*:\u0001\u0000\u0000\u0000+,\u0003\u0006\u0003\u0000,-\u0005\u0007\u0000"+
		"\u0000-:\u0001\u0000\u0000\u0000./\u0003\u0016\u000b\u0000/0\u0005\u0007"+
		"\u0000\u00000:\u0001\u0000\u0000\u000012\u0003\u0014\n\u000023\u0005\u0007"+
		"\u0000\u00003:\u0001\u0000\u0000\u00004:\u0003\f\u0006\u00005:\u0003\n"+
		"\u0005\u000067\u0003\b\u0004\u000078\u0005\u0007\u0000\u00008:\u0001\u0000"+
		"\u0000\u00009(\u0001\u0000\u0000\u00009+\u0001\u0000\u0000\u00009.\u0001"+
		"\u0000\u0000\u000091\u0001\u0000\u0000\u000094\u0001\u0000\u0000\u0000"+
		"95\u0001\u0000\u0000\u000096\u0001\u0000\u0000\u0000:\u0005\u0001\u0000"+
		"\u0000\u0000;<\u0005\u001a\u0000\u0000<=\u0005\u0005\u0000\u0000=>\u0003"+
		"\u0014\n\u0000>\u0007\u0001\u0000\u0000\u0000?@\u0005\u0014\u0000\u0000"+
		"@A\u0005\b\u0000\u0000AB\u0003\u0014\n\u0000BC\u0005\t\u0000\u0000C\t"+
		"\u0001\u0000\u0000\u0000DE\u0005\u0013\u0000\u0000EH\u0005\b\u0000\u0000"+
		"FI\u0003\u0002\u0001\u0000GI\u0003\u0006\u0003\u0000HF\u0001\u0000\u0000"+
		"\u0000HG\u0001\u0000\u0000\u0000HI\u0001\u0000\u0000\u0000IJ\u0001\u0000"+
		"\u0000\u0000JL\u0005\u0007\u0000\u0000KM\u0003\u0012\t\u0000LK\u0001\u0000"+
		"\u0000\u0000LM\u0001\u0000\u0000\u0000MN\u0001\u0000\u0000\u0000NQ\u0005"+
		"\u0007\u0000\u0000OR\u0003\u0006\u0003\u0000PR\u0003\u0016\u000b\u0000"+
		"QO\u0001\u0000\u0000\u0000QP\u0001\u0000\u0000\u0000QR\u0001\u0000\u0000"+
		"\u0000RS\u0001\u0000\u0000\u0000ST\u0005\t\u0000\u0000TX\u0005\n\u0000"+
		"\u0000UW\u0003\u0004\u0002\u0000VU\u0001\u0000\u0000\u0000WZ\u0001\u0000"+
		"\u0000\u0000XV\u0001\u0000\u0000\u0000XY\u0001\u0000\u0000\u0000Y[\u0001"+
		"\u0000\u0000\u0000ZX\u0001\u0000\u0000\u0000[\\\u0005\u000b\u0000\u0000"+
		"\\\u000b\u0001\u0000\u0000\u0000]^\u0005\u0011\u0000\u0000^_\u0005\b\u0000"+
		"\u0000_`\u0003\u0012\t\u0000`a\u0005\t\u0000\u0000ae\u0005\n\u0000\u0000"+
		"bd\u0003\u0004\u0002\u0000cb\u0001\u0000\u0000\u0000dg\u0001\u0000\u0000"+
		"\u0000ec\u0001\u0000\u0000\u0000ef\u0001\u0000\u0000\u0000fh\u0001\u0000"+
		"\u0000\u0000ge\u0001\u0000\u0000\u0000hl\u0005\u000b\u0000\u0000ik\u0003"+
		"\u000e\u0007\u0000ji\u0001\u0000\u0000\u0000kn\u0001\u0000\u0000\u0000"+
		"lj\u0001\u0000\u0000\u0000lm\u0001\u0000\u0000\u0000mp\u0001\u0000\u0000"+
		"\u0000nl\u0001\u0000\u0000\u0000oq\u0003\u0010\b\u0000po\u0001\u0000\u0000"+
		"\u0000pq\u0001\u0000\u0000\u0000q\r\u0001\u0000\u0000\u0000rs\u0005\u0012"+
		"\u0000\u0000st\u0005\u0011\u0000\u0000tu\u0005\b\u0000\u0000uv\u0003\u0012"+
		"\t\u0000vw\u0005\t\u0000\u0000w{\u0005\n\u0000\u0000xz\u0003\u0004\u0002"+
		"\u0000yx\u0001\u0000\u0000\u0000z}\u0001\u0000\u0000\u0000{y\u0001\u0000"+
		"\u0000\u0000{|\u0001\u0000\u0000\u0000|~\u0001\u0000\u0000\u0000}{\u0001"+
		"\u0000\u0000\u0000~\u007f\u0005\u000b\u0000\u0000\u007f\u000f\u0001\u0000"+
		"\u0000\u0000\u0080\u0081\u0005\u0012\u0000\u0000\u0081\u0085\u0005\n\u0000"+
		"\u0000\u0082\u0084\u0003\u0004\u0002\u0000\u0083\u0082\u0001\u0000\u0000"+
		"\u0000\u0084\u0087\u0001\u0000\u0000\u0000\u0085\u0083\u0001\u0000\u0000"+
		"\u0000\u0085\u0086\u0001\u0000\u0000\u0000\u0086\u0088\u0001\u0000\u0000"+
		"\u0000\u0087\u0085\u0001\u0000\u0000\u0000\u0088\u0089\u0005\u000b\u0000"+
		"\u0000\u0089\u0011\u0001\u0000\u0000\u0000\u008a\u008b\u0003\u0014\n\u0000"+
		"\u008b\u008c\u0005\f\u0000\u0000\u008c\u008d\u0003\u0014\n\u0000\u008d"+
		"\u009f\u0001\u0000\u0000\u0000\u008e\u008f\u0003\u0014\n\u0000\u008f\u0090"+
		"\u0005\r\u0000\u0000\u0090\u0091\u0003\u0014\n\u0000\u0091\u009f\u0001"+
		"\u0000\u0000\u0000\u0092\u0093\u0003\u0014\n\u0000\u0093\u0094\u0005\u000e"+
		"\u0000\u0000\u0094\u0095\u0003\u0014\n\u0000\u0095\u009f\u0001\u0000\u0000"+
		"\u0000\u0096\u0097\u0003\u0014\n\u0000\u0097\u0098\u0005\u000f\u0000\u0000"+
		"\u0098\u0099\u0003\u0014\n\u0000\u0099\u009f\u0001\u0000\u0000\u0000\u009a"+
		"\u009b\u0003\u0014\n\u0000\u009b\u009c\u0005\u0010\u0000\u0000\u009c\u009d"+
		"\u0003\u0014\n\u0000\u009d\u009f\u0001\u0000\u0000\u0000\u009e\u008a\u0001"+
		"\u0000\u0000\u0000\u009e\u008e\u0001\u0000\u0000\u0000\u009e\u0092\u0001"+
		"\u0000\u0000\u0000\u009e\u0096\u0001\u0000\u0000\u0000\u009e\u009a\u0001"+
		"\u0000\u0000\u0000\u009f\u0013\u0001\u0000\u0000\u0000\u00a0\u00a1\u0006"+
		"\n\uffff\uffff\u0000\u00a1\u00a6\u0003\u0018\f\u0000\u00a2\u00a3\u0007"+
		"\u0000\u0000\u0000\u00a3\u00a5\u0003\u0018\f\u0000\u00a4\u00a2\u0001\u0000"+
		"\u0000\u0000\u00a5\u00a8\u0001\u0000\u0000\u0000\u00a6\u00a4\u0001\u0000"+
		"\u0000\u0000\u00a6\u00a7\u0001\u0000\u0000\u0000\u00a7\u00ab\u0001\u0000"+
		"\u0000\u0000\u00a8\u00a6\u0001\u0000\u0000\u0000\u00a9\u00ab\u0003\u0016"+
		"\u000b\u0000\u00aa\u00a0\u0001\u0000\u0000\u0000\u00aa\u00a9\u0001\u0000"+
		"\u0000\u0000\u00ab\u00b1\u0001\u0000\u0000\u0000\u00ac\u00ad\n\u0002\u0000"+
		"\u0000\u00ad\u00ae\u0007\u0001\u0000\u0000\u00ae\u00b0\u0003\u0014\n\u0003"+
		"\u00af\u00ac\u0001\u0000\u0000\u0000\u00b0\u00b3\u0001\u0000\u0000\u0000"+
		"\u00b1\u00af\u0001\u0000\u0000\u0000\u00b1\u00b2\u0001\u0000\u0000\u0000"+
		"\u00b2\u0015\u0001\u0000\u0000\u0000\u00b3\u00b1\u0001\u0000\u0000\u0000"+
		"\u00b4\u00b5\u0005\u001a\u0000\u0000\u00b5\u00b6\u0005\u0001\u0000\u0000"+
		"\u00b6\u00bb\u0005\u0001\u0000\u0000\u00b7\u00b8\u0005\u0001\u0000\u0000"+
		"\u00b8\u00b9\u0005\u0001\u0000\u0000\u00b9\u00bb\u0005\u001a\u0000\u0000"+
		"\u00ba\u00b4\u0001\u0000\u0000\u0000\u00ba\u00b7\u0001\u0000\u0000\u0000"+
		"\u00bb\u0017\u0001\u0000\u0000\u0000\u00bc\u00c1\u0003\u001a\r\u0000\u00bd"+
		"\u00be\u0007\u0002\u0000\u0000\u00be\u00c0\u0003\u001a\r\u0000\u00bf\u00bd"+
		"\u0001\u0000\u0000\u0000\u00c0\u00c3\u0001\u0000\u0000\u0000\u00c1\u00bf"+
		"\u0001\u0000\u0000\u0000\u00c1\u00c2\u0001\u0000\u0000\u0000\u00c2\u0019"+
		"\u0001\u0000\u0000\u0000\u00c3\u00c1\u0001\u0000\u0000\u0000\u00c4\u00cd"+
		"\u0005\u0019\u0000\u0000\u00c5\u00cd\u0005\u001a\u0000\u0000\u00c6\u00cd"+
		"\u0005\u0017\u0000\u0000\u00c7\u00cd\u0005\u0018\u0000\u0000\u00c8\u00c9"+
		"\u0005\b\u0000\u0000\u00c9\u00ca\u0003\u0014\n\u0000\u00ca\u00cb\u0005"+
		"\t\u0000\u0000\u00cb\u00cd\u0001\u0000\u0000\u0000\u00cc\u00c4\u0001\u0000"+
		"\u0000\u0000\u00cc\u00c5\u0001\u0000\u0000\u0000\u00cc\u00c6\u0001\u0000"+
		"\u0000\u0000\u00cc\u00c7\u0001\u0000\u0000\u0000\u00cc\u00c8\u0001\u0000"+
		"\u0000\u0000\u00cd\u001b\u0001\u0000\u0000\u0000\u0013\u001f&9HLQXelp"+
		"{\u0085\u009e\u00a6\u00aa\u00b1\u00ba\u00c1\u00cc";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}