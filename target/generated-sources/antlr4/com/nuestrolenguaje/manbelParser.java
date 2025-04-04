// Generated from com\nuestrolenguaje\manbel.g4 by ANTLR 4.9.2
package com.nuestrolenguaje;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class manbelParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof manbelListener ) ((manbelListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof manbelListener ) ((manbelListener)listener).exitPrograma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof manbelVisitor ) return ((manbelVisitor<? extends T>)visitor).visitPrograma(this);
			else return visitor.visitChildren(this);
		}
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
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SUM) | (1L << LPAREN) | (1L << IF) | (1L << FOR) | (1L << TIPO) | (1L << STRING) | (1L << BOOL) | (1L << NUM) | (1L << ID))) != 0)) {
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof manbelListener ) ((manbelListener)listener).enterDeclaracion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof manbelListener ) ((manbelListener)listener).exitDeclaracion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof manbelVisitor ) return ((manbelVisitor<? extends T>)visitor).visitDeclaracion(this);
			else return visitor.visitChildren(this);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof manbelListener ) ((manbelListener)listener).enterInstruccion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof manbelListener ) ((manbelListener)listener).exitInstruccion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof manbelVisitor ) return ((manbelVisitor<? extends T>)visitor).visitInstruccion(this);
			else return visitor.visitChildren(this);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof manbelListener ) ((manbelListener)listener).enterAsig(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof manbelListener ) ((manbelListener)listener).exitAsig(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof manbelVisitor ) return ((manbelVisitor<? extends T>)visitor).visitAsig(this);
			else return visitor.visitChildren(this);
		}
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
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof manbelListener ) ((manbelListener)listener).enterFloop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof manbelListener ) ((manbelListener)listener).exitFloop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof manbelVisitor ) return ((manbelVisitor<? extends T>)visitor).visitFloop(this);
			else return visitor.visitChildren(this);
		}
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
			setState(62);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TIPO:
				{
				setState(60);
				declaracion();
				}
				break;
			case ID:
				{
				setState(61);
				asig();
				}
				break;
			case SEMI:
				break;
			default:
				break;
			}
			setState(64);
			match(SEMI);
			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAREN) | (1L << STRING) | (1L << BOOL) | (1L << NUM) | (1L << ID))) != 0)) {
				{
				setState(65);
				condicion();
				}
			}

			setState(68);
			match(SEMI);
			setState(71);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(69);
				asig();
				}
				break;
			case 2:
				{
				setState(70);
				expr();
				}
				break;
			}
			setState(73);
			match(RPAREN);
			setState(74);
			match(LCURLY);
			setState(78);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SUM) | (1L << LPAREN) | (1L << IF) | (1L << FOR) | (1L << TIPO) | (1L << STRING) | (1L << BOOL) | (1L << NUM) | (1L << ID))) != 0)) {
				{
				{
				setState(75);
				instruccion();
				}
				}
				setState(80);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(81);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof manbelListener ) ((manbelListener)listener).enterDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof manbelListener ) ((manbelListener)listener).exitDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof manbelVisitor ) return ((manbelVisitor<? extends T>)visitor).visitDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefContext def() throws RecognitionException {
		DefContext _localctx = new DefContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_def);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(IF);
			setState(84);
			match(LPAREN);
			setState(85);
			condicion();
			setState(86);
			match(RPAREN);
			setState(87);
			match(LCURLY);
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SUM) | (1L << LPAREN) | (1L << IF) | (1L << FOR) | (1L << TIPO) | (1L << STRING) | (1L << BOOL) | (1L << NUM) | (1L << ID))) != 0)) {
				{
				{
				setState(88);
				instruccion();
				}
				}
				setState(93);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(94);
			match(RCURLY);
			setState(98);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(95);
					else_if();
					}
					} 
				}
				setState(100);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(101);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof manbelListener ) ((manbelListener)listener).enterElse_if(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof manbelListener ) ((manbelListener)listener).exitElse_if(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof manbelVisitor ) return ((manbelVisitor<? extends T>)visitor).visitElse_if(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_ifContext else_if() throws RecognitionException {
		Else_ifContext _localctx = new Else_ifContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_else_if);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(ELSE);
			setState(105);
			match(IF);
			setState(106);
			match(LPAREN);
			setState(107);
			condicion();
			setState(108);
			match(RPAREN);
			setState(109);
			match(LCURLY);
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SUM) | (1L << LPAREN) | (1L << IF) | (1L << FOR) | (1L << TIPO) | (1L << STRING) | (1L << BOOL) | (1L << NUM) | (1L << ID))) != 0)) {
				{
				{
				setState(110);
				instruccion();
				}
				}
				setState(115);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(116);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof manbelListener ) ((manbelListener)listener).enterElse_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof manbelListener ) ((manbelListener)listener).exitElse_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof manbelVisitor ) return ((manbelVisitor<? extends T>)visitor).visitElse_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_blockContext else_block() throws RecognitionException {
		Else_blockContext _localctx = new Else_blockContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_else_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(ELSE);
			setState(119);
			match(LCURLY);
			setState(123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SUM) | (1L << LPAREN) | (1L << IF) | (1L << FOR) | (1L << TIPO) | (1L << STRING) | (1L << BOOL) | (1L << NUM) | (1L << ID))) != 0)) {
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof manbelListener ) ((manbelListener)listener).enterCondicion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof manbelListener ) ((manbelListener)listener).exitCondicion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof manbelVisitor ) return ((manbelVisitor<? extends T>)visitor).visitCondicion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondicionContext condicion() throws RecognitionException {
		CondicionContext _localctx = new CondicionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_condicion);
		try {
			setState(148);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(128);
				expr();
				setState(129);
				match(MAYOR);
				setState(130);
				expr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(132);
				expr();
				setState(133);
				match(MENOR);
				setState(134);
				expr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(136);
				expr();
				setState(137);
				match(MAYOR_EQ);
				setState(138);
				expr();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(140);
				expr();
				setState(141);
				match(MENOR_EQ);
				setState(142);
				expr();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(144);
				expr();
				setState(145);
				match(IGUAL);
				setState(146);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof manbelListener ) ((manbelListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof manbelListener ) ((manbelListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof manbelVisitor ) return ((manbelVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			termino();
			setState(155);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SUM || _la==REST) {
				{
				{
				setState(151);
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
				setState(152);
				termino();
				}
				}
				setState(157);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof manbelListener ) ((manbelListener)listener).enterIncremento(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof manbelListener ) ((manbelListener)listener).exitIncremento(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof manbelVisitor ) return ((manbelVisitor<? extends T>)visitor).visitIncremento(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IncrementoContext incremento() throws RecognitionException {
		IncrementoContext _localctx = new IncrementoContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_incremento);
		try {
			setState(164);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(158);
				match(ID);
				setState(159);
				match(SUM);
				setState(160);
				match(SUM);
				}
				break;
			case SUM:
				enterOuterAlt(_localctx, 2);
				{
				setState(161);
				match(SUM);
				setState(162);
				match(SUM);
				setState(163);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof manbelListener ) ((manbelListener)listener).enterTermino(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof manbelListener ) ((manbelListener)listener).exitTermino(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof manbelVisitor ) return ((manbelVisitor<? extends T>)visitor).visitTermino(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TerminoContext termino() throws RecognitionException {
		TerminoContext _localctx = new TerminoContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_termino);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			factor();
			setState(171);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MUL || _la==DIV) {
				{
				{
				setState(167);
				_la = _input.LA(1);
				if ( !(_la==MUL || _la==DIV) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(168);
				factor();
				}
				}
				setState(173);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof manbelListener ) ((manbelListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof manbelListener ) ((manbelListener)listener).exitFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof manbelVisitor ) return ((manbelVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_factor);
		try {
			setState(182);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM:
				enterOuterAlt(_localctx, 1);
				{
				setState(174);
				match(NUM);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(175);
				match(ID);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(176);
				match(STRING);
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 4);
				{
				setState(177);
				match(BOOL);
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 5);
				{
				setState(178);
				match(LPAREN);
				setState(179);
				expr();
				setState(180);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\33\u00bb\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\7\2\36\n\2\f\2\16\2!\13\2\3\3\3\3"+
		"\3\3\3\3\5\3\'\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\5\4\67\n\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\5\6A\n\6\3\6\3\6\5\6E"+
		"\n\6\3\6\3\6\3\6\5\6J\n\6\3\6\3\6\3\6\7\6O\n\6\f\6\16\6R\13\6\3\6\3\6"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\7\7\\\n\7\f\7\16\7_\13\7\3\7\3\7\7\7c\n\7\f\7"+
		"\16\7f\13\7\3\7\5\7i\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\br\n\b\f\b\16\b"+
		"u\13\b\3\b\3\b\3\t\3\t\3\t\7\t|\n\t\f\t\16\t\177\13\t\3\t\3\t\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\5\n\u0097\n\n\3\13\3\13\3\13\7\13\u009c\n\13\f\13\16\13\u009f\13\13"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00a7\n\f\3\r\3\r\3\r\7\r\u00ac\n\r\f\r\16"+
		"\r\u00af\13\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00b9\n\16"+
		"\3\16\2\2\17\2\4\6\b\n\f\16\20\22\24\26\30\32\2\4\3\2\3\4\3\2\5\6\2\u00ca"+
		"\2\37\3\2\2\2\4\"\3\2\2\2\6\66\3\2\2\2\b8\3\2\2\2\n<\3\2\2\2\fU\3\2\2"+
		"\2\16j\3\2\2\2\20x\3\2\2\2\22\u0096\3\2\2\2\24\u0098\3\2\2\2\26\u00a6"+
		"\3\2\2\2\30\u00a8\3\2\2\2\32\u00b8\3\2\2\2\34\36\5\6\4\2\35\34\3\2\2\2"+
		"\36!\3\2\2\2\37\35\3\2\2\2\37 \3\2\2\2 \3\3\2\2\2!\37\3\2\2\2\"#\7\26"+
		"\2\2#&\7\32\2\2$%\7\7\2\2%\'\5\24\13\2&$\3\2\2\2&\'\3\2\2\2\'\5\3\2\2"+
		"\2()\5\4\3\2)*\7\t\2\2*\67\3\2\2\2+,\5\b\5\2,-\7\t\2\2-\67\3\2\2\2./\5"+
		"\26\f\2/\60\7\t\2\2\60\67\3\2\2\2\61\62\5\24\13\2\62\63\7\t\2\2\63\67"+
		"\3\2\2\2\64\67\5\f\7\2\65\67\5\n\6\2\66(\3\2\2\2\66+\3\2\2\2\66.\3\2\2"+
		"\2\66\61\3\2\2\2\66\64\3\2\2\2\66\65\3\2\2\2\67\7\3\2\2\289\7\32\2\29"+
		":\7\7\2\2:;\5\24\13\2;\t\3\2\2\2<=\7\25\2\2=@\7\n\2\2>A\5\4\3\2?A\5\b"+
		"\5\2@>\3\2\2\2@?\3\2\2\2@A\3\2\2\2AB\3\2\2\2BD\7\t\2\2CE\5\22\n\2DC\3"+
		"\2\2\2DE\3\2\2\2EF\3\2\2\2FI\7\t\2\2GJ\5\b\5\2HJ\5\24\13\2IG\3\2\2\2I"+
		"H\3\2\2\2IJ\3\2\2\2JK\3\2\2\2KL\7\13\2\2LP\7\f\2\2MO\5\6\4\2NM\3\2\2\2"+
		"OR\3\2\2\2PN\3\2\2\2PQ\3\2\2\2QS\3\2\2\2RP\3\2\2\2ST\7\r\2\2T\13\3\2\2"+
		"\2UV\7\23\2\2VW\7\n\2\2WX\5\22\n\2XY\7\13\2\2Y]\7\f\2\2Z\\\5\6\4\2[Z\3"+
		"\2\2\2\\_\3\2\2\2][\3\2\2\2]^\3\2\2\2^`\3\2\2\2_]\3\2\2\2`d\7\r\2\2ac"+
		"\5\16\b\2ba\3\2\2\2cf\3\2\2\2db\3\2\2\2de\3\2\2\2eh\3\2\2\2fd\3\2\2\2"+
		"gi\5\20\t\2hg\3\2\2\2hi\3\2\2\2i\r\3\2\2\2jk\7\24\2\2kl\7\23\2\2lm\7\n"+
		"\2\2mn\5\22\n\2no\7\13\2\2os\7\f\2\2pr\5\6\4\2qp\3\2\2\2ru\3\2\2\2sq\3"+
		"\2\2\2st\3\2\2\2tv\3\2\2\2us\3\2\2\2vw\7\r\2\2w\17\3\2\2\2xy\7\24\2\2"+
		"y}\7\f\2\2z|\5\6\4\2{z\3\2\2\2|\177\3\2\2\2}{\3\2\2\2}~\3\2\2\2~\u0080"+
		"\3\2\2\2\177}\3\2\2\2\u0080\u0081\7\r\2\2\u0081\21\3\2\2\2\u0082\u0083"+
		"\5\24\13\2\u0083\u0084\7\16\2\2\u0084\u0085\5\24\13\2\u0085\u0097\3\2"+
		"\2\2\u0086\u0087\5\24\13\2\u0087\u0088\7\17\2\2\u0088\u0089\5\24\13\2"+
		"\u0089\u0097\3\2\2\2\u008a\u008b\5\24\13\2\u008b\u008c\7\20\2\2\u008c"+
		"\u008d\5\24\13\2\u008d\u0097\3\2\2\2\u008e\u008f\5\24\13\2\u008f\u0090"+
		"\7\21\2\2\u0090\u0091\5\24\13\2\u0091\u0097\3\2\2\2\u0092\u0093\5\24\13"+
		"\2\u0093\u0094\7\22\2\2\u0094\u0095\5\24\13\2\u0095\u0097\3\2\2\2\u0096"+
		"\u0082\3\2\2\2\u0096\u0086\3\2\2\2\u0096\u008a\3\2\2\2\u0096\u008e\3\2"+
		"\2\2\u0096\u0092\3\2\2\2\u0097\23\3\2\2\2\u0098\u009d\5\30\r\2\u0099\u009a"+
		"\t\2\2\2\u009a\u009c\5\30\r\2\u009b\u0099\3\2\2\2\u009c\u009f\3\2\2\2"+
		"\u009d\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e\25\3\2\2\2\u009f\u009d"+
		"\3\2\2\2\u00a0\u00a1\7\32\2\2\u00a1\u00a2\7\3\2\2\u00a2\u00a7\7\3\2\2"+
		"\u00a3\u00a4\7\3\2\2\u00a4\u00a5\7\3\2\2\u00a5\u00a7\7\32\2\2\u00a6\u00a0"+
		"\3\2\2\2\u00a6\u00a3\3\2\2\2\u00a7\27\3\2\2\2\u00a8\u00ad\5\32\16\2\u00a9"+
		"\u00aa\t\3\2\2\u00aa\u00ac\5\32\16\2\u00ab\u00a9\3\2\2\2\u00ac\u00af\3"+
		"\2\2\2\u00ad\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\31\3\2\2\2\u00af"+
		"\u00ad\3\2\2\2\u00b0\u00b9\7\31\2\2\u00b1\u00b9\7\32\2\2\u00b2\u00b9\7"+
		"\27\2\2\u00b3\u00b9\7\30\2\2\u00b4\u00b5\7\n\2\2\u00b5\u00b6\5\24\13\2"+
		"\u00b6\u00b7\7\13\2\2\u00b7\u00b9\3\2\2\2\u00b8\u00b0\3\2\2\2\u00b8\u00b1"+
		"\3\2\2\2\u00b8\u00b2\3\2\2\2\u00b8\u00b3\3\2\2\2\u00b8\u00b4\3\2\2\2\u00b9"+
		"\33\3\2\2\2\23\37&\66@DIP]dhs}\u0096\u009d\u00a6\u00ad\u00b8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}