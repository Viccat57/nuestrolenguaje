// Generated from c:/automatas II/nuestrolenguajeV2/nuestrolenguaje/src/main/antlr4/com/nuestrolenguaje/manbel.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class manbelLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

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
		"\u0004\u0000\u0019\u00a9\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0002\u0018\u0007\u0018\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b"+
		"\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0003\u0013y\b\u0013\u0001\u0014\u0001\u0014\u0005"+
		"\u0014}\b\u0014\n\u0014\f\u0014\u0080\t\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u008d\b\u0015\u0001\u0016"+
		"\u0004\u0016\u0090\b\u0016\u000b\u0016\f\u0016\u0091\u0001\u0016\u0001"+
		"\u0016\u0004\u0016\u0096\b\u0016\u000b\u0016\f\u0016\u0097\u0003\u0016"+
		"\u009a\b\u0016\u0001\u0017\u0001\u0017\u0005\u0017\u009e\b\u0017\n\u0017"+
		"\f\u0017\u00a1\t\u0017\u0001\u0018\u0004\u0018\u00a4\b\u0018\u000b\u0018"+
		"\f\u0018\u00a5\u0001\u0018\u0001\u0018\u0000\u0000\u0019\u0001\u0001\u0003"+
		"\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011"+
		"\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010"+
		"!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017/\u00181\u0019\u0001"+
		"\u0000\u0005\u0001\u0000\"\"\u0001\u000009\u0003\u0000AZ__az\u0004\u0000"+
		"09AZ__az\u0003\u0000\t\n\r\r  \u00b2\u0000\u0001\u0001\u0000\u0000\u0000"+
		"\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000"+
		"\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000"+
		"\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f"+
		"\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013"+
		"\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017"+
		"\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b"+
		"\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f"+
		"\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000"+
		"\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000"+
		"\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000"+
		"-\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000\u00001\u0001"+
		"\u0000\u0000\u0000\u00013\u0001\u0000\u0000\u0000\u00035\u0001\u0000\u0000"+
		"\u0000\u00057\u0001\u0000\u0000\u0000\u00079\u0001\u0000\u0000\u0000\t"+
		";\u0001\u0000\u0000\u0000\u000b=\u0001\u0000\u0000\u0000\r?\u0001\u0000"+
		"\u0000\u0000\u000fA\u0001\u0000\u0000\u0000\u0011C\u0001\u0000\u0000\u0000"+
		"\u0013E\u0001\u0000\u0000\u0000\u0015G\u0001\u0000\u0000\u0000\u0017I"+
		"\u0001\u0000\u0000\u0000\u0019K\u0001\u0000\u0000\u0000\u001bM\u0001\u0000"+
		"\u0000\u0000\u001dP\u0001\u0000\u0000\u0000\u001fS\u0001\u0000\u0000\u0000"+
		"!V\u0001\u0000\u0000\u0000#Y\u0001\u0000\u0000\u0000%^\u0001\u0000\u0000"+
		"\u0000\'x\u0001\u0000\u0000\u0000)z\u0001\u0000\u0000\u0000+\u008c\u0001"+
		"\u0000\u0000\u0000-\u008f\u0001\u0000\u0000\u0000/\u009b\u0001\u0000\u0000"+
		"\u00001\u00a3\u0001\u0000\u0000\u000034\u0005+\u0000\u00004\u0002\u0001"+
		"\u0000\u0000\u000056\u0005-\u0000\u00006\u0004\u0001\u0000\u0000\u0000"+
		"78\u0005*\u0000\u00008\u0006\u0001\u0000\u0000\u00009:\u0005/\u0000\u0000"+
		":\b\u0001\u0000\u0000\u0000;<\u0005=\u0000\u0000<\n\u0001\u0000\u0000"+
		"\u0000=>\u0005,\u0000\u0000>\f\u0001\u0000\u0000\u0000?@\u0005;\u0000"+
		"\u0000@\u000e\u0001\u0000\u0000\u0000AB\u0005(\u0000\u0000B\u0010\u0001"+
		"\u0000\u0000\u0000CD\u0005)\u0000\u0000D\u0012\u0001\u0000\u0000\u0000"+
		"EF\u0005{\u0000\u0000F\u0014\u0001\u0000\u0000\u0000GH\u0005}\u0000\u0000"+
		"H\u0016\u0001\u0000\u0000\u0000IJ\u0005>\u0000\u0000J\u0018\u0001\u0000"+
		"\u0000\u0000KL\u0005<\u0000\u0000L\u001a\u0001\u0000\u0000\u0000MN\u0005"+
		">\u0000\u0000NO\u0005=\u0000\u0000O\u001c\u0001\u0000\u0000\u0000PQ\u0005"+
		"<\u0000\u0000QR\u0005=\u0000\u0000R\u001e\u0001\u0000\u0000\u0000ST\u0005"+
		"=\u0000\u0000TU\u0005=\u0000\u0000U \u0001\u0000\u0000\u0000VW\u0005i"+
		"\u0000\u0000WX\u0005f\u0000\u0000X\"\u0001\u0000\u0000\u0000YZ\u0005e"+
		"\u0000\u0000Z[\u0005l\u0000\u0000[\\\u0005s\u0000\u0000\\]\u0005e\u0000"+
		"\u0000]$\u0001\u0000\u0000\u0000^_\u0005f\u0000\u0000_`\u0005o\u0000\u0000"+
		"`a\u0005r\u0000\u0000a&\u0001\u0000\u0000\u0000bc\u0005i\u0000\u0000c"+
		"d\u0005n\u0000\u0000dy\u0005t\u0000\u0000ef\u0005d\u0000\u0000fg\u0005"+
		"o\u0000\u0000gh\u0005u\u0000\u0000hi\u0005b\u0000\u0000ij\u0005l\u0000"+
		"\u0000jy\u0005e\u0000\u0000kl\u0005S\u0000\u0000lm\u0005t\u0000\u0000"+
		"mn\u0005r\u0000\u0000no\u0005i\u0000\u0000op\u0005n\u0000\u0000py\u0005"+
		"g\u0000\u0000qr\u0005b\u0000\u0000rs\u0005o\u0000\u0000st\u0005o\u0000"+
		"\u0000tu\u0005l\u0000\u0000uv\u0005e\u0000\u0000vw\u0005a\u0000\u0000"+
		"wy\u0005n\u0000\u0000xb\u0001\u0000\u0000\u0000xe\u0001\u0000\u0000\u0000"+
		"xk\u0001\u0000\u0000\u0000xq\u0001\u0000\u0000\u0000y(\u0001\u0000\u0000"+
		"\u0000z~\u0005\"\u0000\u0000{}\b\u0000\u0000\u0000|{\u0001\u0000\u0000"+
		"\u0000}\u0080\u0001\u0000\u0000\u0000~|\u0001\u0000\u0000\u0000~\u007f"+
		"\u0001\u0000\u0000\u0000\u007f\u0081\u0001\u0000\u0000\u0000\u0080~\u0001"+
		"\u0000\u0000\u0000\u0081\u0082\u0005\"\u0000\u0000\u0082*\u0001\u0000"+
		"\u0000\u0000\u0083\u0084\u0005t\u0000\u0000\u0084\u0085\u0005r\u0000\u0000"+
		"\u0085\u0086\u0005u\u0000\u0000\u0086\u008d\u0005e\u0000\u0000\u0087\u0088"+
		"\u0005f\u0000\u0000\u0088\u0089\u0005a\u0000\u0000\u0089\u008a\u0005l"+
		"\u0000\u0000\u008a\u008b\u0005s\u0000\u0000\u008b\u008d\u0005e\u0000\u0000"+
		"\u008c\u0083\u0001\u0000\u0000\u0000\u008c\u0087\u0001\u0000\u0000\u0000"+
		"\u008d,\u0001\u0000\u0000\u0000\u008e\u0090\u0007\u0001\u0000\u0000\u008f"+
		"\u008e\u0001\u0000\u0000\u0000\u0090\u0091\u0001\u0000\u0000\u0000\u0091"+
		"\u008f\u0001\u0000\u0000\u0000\u0091\u0092\u0001\u0000\u0000\u0000\u0092"+
		"\u0099\u0001\u0000\u0000\u0000\u0093\u0095\u0005.\u0000\u0000\u0094\u0096"+
		"\u0007\u0001\u0000\u0000\u0095\u0094\u0001\u0000\u0000\u0000\u0096\u0097"+
		"\u0001\u0000\u0000\u0000\u0097\u0095\u0001\u0000\u0000\u0000\u0097\u0098"+
		"\u0001\u0000\u0000\u0000\u0098\u009a\u0001\u0000\u0000\u0000\u0099\u0093"+
		"\u0001\u0000\u0000\u0000\u0099\u009a\u0001\u0000\u0000\u0000\u009a.\u0001"+
		"\u0000\u0000\u0000\u009b\u009f\u0007\u0002\u0000\u0000\u009c\u009e\u0007"+
		"\u0003\u0000\u0000\u009d\u009c\u0001\u0000\u0000\u0000\u009e\u00a1\u0001"+
		"\u0000\u0000\u0000\u009f\u009d\u0001\u0000\u0000\u0000\u009f\u00a0\u0001"+
		"\u0000\u0000\u0000\u00a00\u0001\u0000\u0000\u0000\u00a1\u009f\u0001\u0000"+
		"\u0000\u0000\u00a2\u00a4\u0007\u0004\u0000\u0000\u00a3\u00a2\u0001\u0000"+
		"\u0000\u0000\u00a4\u00a5\u0001\u0000\u0000\u0000\u00a5\u00a3\u0001\u0000"+
		"\u0000\u0000\u00a5\u00a6\u0001\u0000\u0000\u0000\u00a6\u00a7\u0001\u0000"+
		"\u0000\u0000\u00a7\u00a8\u0006\u0018\u0000\u0000\u00a82\u0001\u0000\u0000"+
		"\u0000\t\u0000x~\u008c\u0091\u0097\u0099\u009f\u00a5\u0001\u0006\u0000"+
		"\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}