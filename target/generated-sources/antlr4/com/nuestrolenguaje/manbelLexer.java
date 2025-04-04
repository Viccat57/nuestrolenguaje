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
		IF=17, ELSE=18, FOR=19, TIPO=20, STRING=21, BOOL=22, NUM=23, ID=24, WS=25;
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
			"IF", "ELSE", "FOR", "TIPO", "STRING", "BOOL", "NUM", "ID", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\33\u00ab\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3"+
		"\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17"+
		"\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23"+
		"\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25{\n\25"+
		"\3\26\3\26\7\26\177\n\26\f\26\16\26\u0082\13\26\3\26\3\26\3\27\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u008f\n\27\3\30\6\30\u0092\n\30"+
		"\r\30\16\30\u0093\3\30\3\30\6\30\u0098\n\30\r\30\16\30\u0099\5\30\u009c"+
		"\n\30\3\31\3\31\7\31\u00a0\n\31\f\31\16\31\u00a3\13\31\3\32\6\32\u00a6"+
		"\n\32\r\32\16\32\u00a7\3\32\3\32\2\2\33\3\3\5\4\7\5\t\6\13\7\r\b\17\t"+
		"\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27"+
		"-\30/\31\61\32\63\33\3\2\7\3\2$$\3\2\62;\5\2C\\aac|\6\2\62;C\\aac|\5\2"+
		"\13\f\17\17\"\"\2\u00b4\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2"+
		"\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2"+
		"\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\3\65\3\2\2\2\5\67\3"+
		"\2\2\2\79\3\2\2\2\t;\3\2\2\2\13=\3\2\2\2\r?\3\2\2\2\17A\3\2\2\2\21C\3"+
		"\2\2\2\23E\3\2\2\2\25G\3\2\2\2\27I\3\2\2\2\31K\3\2\2\2\33M\3\2\2\2\35"+
		"O\3\2\2\2\37R\3\2\2\2!U\3\2\2\2#X\3\2\2\2%[\3\2\2\2\'`\3\2\2\2)z\3\2\2"+
		"\2+|\3\2\2\2-\u008e\3\2\2\2/\u0091\3\2\2\2\61\u009d\3\2\2\2\63\u00a5\3"+
		"\2\2\2\65\66\7-\2\2\66\4\3\2\2\2\678\7/\2\28\6\3\2\2\29:\7,\2\2:\b\3\2"+
		"\2\2;<\7\61\2\2<\n\3\2\2\2=>\7?\2\2>\f\3\2\2\2?@\7.\2\2@\16\3\2\2\2AB"+
		"\7=\2\2B\20\3\2\2\2CD\7*\2\2D\22\3\2\2\2EF\7+\2\2F\24\3\2\2\2GH\7}\2\2"+
		"H\26\3\2\2\2IJ\7\177\2\2J\30\3\2\2\2KL\7@\2\2L\32\3\2\2\2MN\7>\2\2N\34"+
		"\3\2\2\2OP\7@\2\2PQ\7?\2\2Q\36\3\2\2\2RS\7>\2\2ST\7?\2\2T \3\2\2\2UV\7"+
		"?\2\2VW\7?\2\2W\"\3\2\2\2XY\7k\2\2YZ\7h\2\2Z$\3\2\2\2[\\\7g\2\2\\]\7n"+
		"\2\2]^\7u\2\2^_\7g\2\2_&\3\2\2\2`a\7h\2\2ab\7q\2\2bc\7t\2\2c(\3\2\2\2"+
		"de\7k\2\2ef\7p\2\2f{\7v\2\2gh\7f\2\2hi\7q\2\2ij\7w\2\2jk\7d\2\2kl\7n\2"+
		"\2l{\7g\2\2mn\7U\2\2no\7v\2\2op\7t\2\2pq\7k\2\2qr\7p\2\2r{\7i\2\2st\7"+
		"d\2\2tu\7q\2\2uv\7q\2\2vw\7n\2\2wx\7g\2\2xy\7c\2\2y{\7p\2\2zd\3\2\2\2"+
		"zg\3\2\2\2zm\3\2\2\2zs\3\2\2\2{*\3\2\2\2|\u0080\7$\2\2}\177\n\2\2\2~}"+
		"\3\2\2\2\177\u0082\3\2\2\2\u0080~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0083"+
		"\3\2\2\2\u0082\u0080\3\2\2\2\u0083\u0084\7$\2\2\u0084,\3\2\2\2\u0085\u0086"+
		"\7v\2\2\u0086\u0087\7t\2\2\u0087\u0088\7w\2\2\u0088\u008f\7g\2\2\u0089"+
		"\u008a\7h\2\2\u008a\u008b\7c\2\2\u008b\u008c\7n\2\2\u008c\u008d\7u\2\2"+
		"\u008d\u008f\7g\2\2\u008e\u0085\3\2\2\2\u008e\u0089\3\2\2\2\u008f.\3\2"+
		"\2\2\u0090\u0092\t\3\2\2\u0091\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093"+
		"\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u009b\3\2\2\2\u0095\u0097\7\60"+
		"\2\2\u0096\u0098\t\3\2\2\u0097\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099"+
		"\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009c\3\2\2\2\u009b\u0095\3\2"+
		"\2\2\u009b\u009c\3\2\2\2\u009c\60\3\2\2\2\u009d\u00a1\t\4\2\2\u009e\u00a0"+
		"\t\5\2\2\u009f\u009e\3\2\2\2\u00a0\u00a3\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1"+
		"\u00a2\3\2\2\2\u00a2\62\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a4\u00a6\t\6\2"+
		"\2\u00a5\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a7\u00a8"+
		"\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00aa\b\32\2\2\u00aa\64\3\2\2\2\13"+
		"\2z\u0080\u008e\u0093\u0099\u009b\u00a1\u00a7\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}