// Generated from com\nuestrolenguaje\manbel.g4 by ANTLR 4.9.2
package com.nuestrolenguaje;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class manbelLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SUM=1, REST=2, MUL=3, DIV=4, EQ=5, COMMA=6, SEMI=7, LPAREN=8, RPAREN=9, 
		LCURLY=10, RCURLY=11, MAYOR=12, MENOR=13, MAYOR_EQ=14, MENOR_EQ=15, IGUAL=16, 
		IF=17, ELSE=18, FOR=19, MOSTRAR=20, COMMENT=21, TIPO=22, STRING=23, BOOL=24, 
		NUM=25, ID=26, WS=27;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"SUM", "REST", "MUL", "DIV", "EQ", "COMMA", "SEMI", "LPAREN", "RPAREN", 
			"LCURLY", "RCURLY", "MAYOR", "MENOR", "MAYOR_EQ", "MENOR_EQ", "IGUAL", 
			"IF", "ELSE", "FOR", "MOSTRAR", "COMMENT", "TIPO", "STRING", "BOOL", 
			"NUM", "ID", "WS"
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


	public manbelLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "manbel.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\35\u00cf\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3"+
		"\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16"+
		"\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\7\26z\n\26\f\26"+
		"\16\26}\13\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\5\27\u009d\n\27\3\30\3\30\7\30\u00a1\n\30\f\30"+
		"\16\30\u00a4\13\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3"+
		"\31\3\31\3\31\5\31\u00b3\n\31\3\32\6\32\u00b6\n\32\r\32\16\32\u00b7\3"+
		"\32\3\32\6\32\u00bc\n\32\r\32\16\32\u00bd\5\32\u00c0\n\32\3\33\3\33\7"+
		"\33\u00c4\n\33\f\33\16\33\u00c7\13\33\3\34\6\34\u00ca\n\34\r\34\16\34"+
		"\u00cb\3\34\3\34\3{\2\35\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f"+
		"\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63"+
		"\33\65\34\67\35\3\2\7\3\2$$\3\2\62;\5\2C\\aac|\6\2\62;C\\aac|\5\2\13\f"+
		"\17\17\"\"\2\u00d9\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3"+
		"\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2"+
		"\39\3\2\2\2\5;\3\2\2\2\7=\3\2\2\2\t?\3\2\2\2\13A\3\2\2\2\rC\3\2\2\2\17"+
		"E\3\2\2\2\21G\3\2\2\2\23I\3\2\2\2\25K\3\2\2\2\27M\3\2\2\2\31O\3\2\2\2"+
		"\33Q\3\2\2\2\35S\3\2\2\2\37V\3\2\2\2!Y\3\2\2\2#\\\3\2\2\2%b\3\2\2\2\'"+
		"g\3\2\2\2)m\3\2\2\2+u\3\2\2\2-\u009c\3\2\2\2/\u009e\3\2\2\2\61\u00b2\3"+
		"\2\2\2\63\u00b5\3\2\2\2\65\u00c1\3\2\2\2\67\u00c9\3\2\2\29:\7-\2\2:\4"+
		"\3\2\2\2;<\7/\2\2<\6\3\2\2\2=>\7,\2\2>\b\3\2\2\2?@\7\61\2\2@\n\3\2\2\2"+
		"AB\7?\2\2B\f\3\2\2\2CD\7.\2\2D\16\3\2\2\2EF\7=\2\2F\20\3\2\2\2GH\7*\2"+
		"\2H\22\3\2\2\2IJ\7+\2\2J\24\3\2\2\2KL\7}\2\2L\26\3\2\2\2MN\7\177\2\2N"+
		"\30\3\2\2\2OP\7@\2\2P\32\3\2\2\2QR\7>\2\2R\34\3\2\2\2ST\7@\2\2TU\7?\2"+
		"\2U\36\3\2\2\2VW\7>\2\2WX\7?\2\2X \3\2\2\2YZ\7?\2\2Z[\7?\2\2[\"\3\2\2"+
		"\2\\]\7e\2\2]^\7j\2\2^_\7g\2\2_`\7e\2\2`a\7c\2\2a$\3\2\2\2bc\7u\2\2cd"+
		"\7k\2\2de\7p\2\2ef\7q\2\2f&\3\2\2\2gh\7h\2\2hi\7q\2\2ij\7q\2\2jk\7r\2"+
		"\2kl\7k\2\2l(\3\2\2\2mn\7o\2\2no\7q\2\2op\7u\2\2pq\7v\2\2qr\7t\2\2rs\7"+
		"c\2\2st\7t\2\2t*\3\2\2\2uv\7\61\2\2vw\7\61\2\2w{\3\2\2\2xz\13\2\2\2yx"+
		"\3\2\2\2z}\3\2\2\2{|\3\2\2\2{y\3\2\2\2|~\3\2\2\2}{\3\2\2\2~\177\7\f\2"+
		"\2\177\u0080\3\2\2\2\u0080\u0081\b\26\2\2\u0081,\3\2\2\2\u0082\u0083\7"+
		"g\2\2\u0083\u0084\7p\2\2\u0084\u0085\7v\2\2\u0085\u0086\7g\2\2\u0086\u0087"+
		"\7t\2\2\u0087\u0088\7k\2\2\u0088\u0089\7v\2\2\u0089\u009d\7q\2\2\u008a"+
		"\u008b\7r\2\2\u008b\u008c\7g\2\2\u008c\u008d\7f\2\2\u008d\u008e\7c\2\2"+
		"\u008e\u008f\7e\2\2\u008f\u0090\7k\2\2\u0090\u0091\7v\2\2\u0091\u009d"+
		"\7q\2\2\u0092\u0093\7v\2\2\u0093\u0094\7g\2\2\u0094\u0095\7z\2\2\u0095"+
		"\u0096\7v\2\2\u0096\u009d\7q\2\2\u0097\u0098\7d\2\2\u0098\u0099\7q\2\2"+
		"\u0099\u009a\7n\2\2\u009a\u009b\7c\2\2\u009b\u009d\7u\2\2\u009c\u0082"+
		"\3\2\2\2\u009c\u008a\3\2\2\2\u009c\u0092\3\2\2\2\u009c\u0097\3\2\2\2\u009d"+
		".\3\2\2\2\u009e\u00a2\7$\2\2\u009f\u00a1\n\2\2\2\u00a0\u009f\3\2\2\2\u00a1"+
		"\u00a4\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a5\3\2"+
		"\2\2\u00a4\u00a2\3\2\2\2\u00a5\u00a6\7$\2\2\u00a6\60\3\2\2\2\u00a7\u00a8"+
		"\7p\2\2\u00a8\u00a9\7g\2\2\u00a9\u00aa\7v\2\2\u00aa\u00b3\7c\2\2\u00ab"+
		"\u00ac\7h\2\2\u00ac\u00ad\7c\2\2\u00ad\u00ae\7n\2\2\u00ae\u00af\7c\2\2"+
		"\u00af\u00b0\7e\2\2\u00b0\u00b1\7k\2\2\u00b1\u00b3\7c\2\2\u00b2\u00a7"+
		"\3\2\2\2\u00b2\u00ab\3\2\2\2\u00b3\62\3\2\2\2\u00b4\u00b6\t\3\2\2\u00b5"+
		"\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b7\u00b8\3\2"+
		"\2\2\u00b8\u00bf\3\2\2\2\u00b9\u00bb\7\60\2\2\u00ba\u00bc\t\3\2\2\u00bb"+
		"\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd\u00be\3\2"+
		"\2\2\u00be\u00c0\3\2\2\2\u00bf\u00b9\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0"+
		"\64\3\2\2\2\u00c1\u00c5\t\4\2\2\u00c2\u00c4\t\5\2\2\u00c3\u00c2\3\2\2"+
		"\2\u00c4\u00c7\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\66"+
		"\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c8\u00ca\t\6\2\2\u00c9\u00c8\3\2\2\2\u00ca"+
		"\u00cb\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00cd\3\2"+
		"\2\2\u00cd\u00ce\b\34\2\2\u00ce8\3\2\2\2\f\2{\u009c\u00a2\u00b2\u00b7"+
		"\u00bd\u00bf\u00c5\u00cb\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}