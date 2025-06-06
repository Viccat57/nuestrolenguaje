// Generated from c:/Users/Paulina/Documents/TECNM/Automatas2/visual/nuestrolenguaje/src/main/antlr4/com/nuestrolenguaje/manbel.g4 by ANTLR 4.13.1
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
		"\u0004\u0000\u001b\u00cd\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0002\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001"+
		"\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0005\u0014x\b\u0014\n\u0014\f\u0014{\t\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u009b"+
		"\b\u0015\u0001\u0016\u0001\u0016\u0005\u0016\u009f\b\u0016\n\u0016\f\u0016"+
		"\u00a2\t\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0003\u0017\u00b1\b\u0017\u0001\u0018\u0004\u0018"+
		"\u00b4\b\u0018\u000b\u0018\f\u0018\u00b5\u0001\u0018\u0001\u0018\u0004"+
		"\u0018\u00ba\b\u0018\u000b\u0018\f\u0018\u00bb\u0003\u0018\u00be\b\u0018"+
		"\u0001\u0019\u0001\u0019\u0005\u0019\u00c2\b\u0019\n\u0019\f\u0019\u00c5"+
		"\t\u0019\u0001\u001a\u0004\u001a\u00c8\b\u001a\u000b\u001a\f\u001a\u00c9"+
		"\u0001\u001a\u0001\u001a\u0001y\u0000\u001b\u0001\u0001\u0003\u0002\u0005"+
		"\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n"+
		"\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011"+
		"#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017/\u00181\u00193\u001a5\u001b"+
		"\u0001\u0000\u0005\u0001\u0000\"\"\u0001\u000009\u0003\u0000AZ__az\u0004"+
		"\u000009AZ__az\u0003\u0000\t\n\r\r  \u00d7\u0000\u0001\u0001\u0000\u0000"+
		"\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000"+
		"\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000"+
		"\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000"+
		"\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000"+
		"\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000"+
		"\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000"+
		"\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000"+
		"\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001"+
		"\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000"+
		"\u0000\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000"+
		"\u0000-\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000\u00001"+
		"\u0001\u0000\u0000\u0000\u00003\u0001\u0000\u0000\u0000\u00005\u0001\u0000"+
		"\u0000\u0000\u00017\u0001\u0000\u0000\u0000\u00039\u0001\u0000\u0000\u0000"+
		"\u0005;\u0001\u0000\u0000\u0000\u0007=\u0001\u0000\u0000\u0000\t?\u0001"+
		"\u0000\u0000\u0000\u000bA\u0001\u0000\u0000\u0000\rC\u0001\u0000\u0000"+
		"\u0000\u000fE\u0001\u0000\u0000\u0000\u0011G\u0001\u0000\u0000\u0000\u0013"+
		"I\u0001\u0000\u0000\u0000\u0015K\u0001\u0000\u0000\u0000\u0017M\u0001"+
		"\u0000\u0000\u0000\u0019O\u0001\u0000\u0000\u0000\u001bQ\u0001\u0000\u0000"+
		"\u0000\u001dT\u0001\u0000\u0000\u0000\u001fW\u0001\u0000\u0000\u0000!"+
		"Z\u0001\u0000\u0000\u0000#`\u0001\u0000\u0000\u0000%e\u0001\u0000\u0000"+
		"\u0000\'k\u0001\u0000\u0000\u0000)s\u0001\u0000\u0000\u0000+\u009a\u0001"+
		"\u0000\u0000\u0000-\u009c\u0001\u0000\u0000\u0000/\u00b0\u0001\u0000\u0000"+
		"\u00001\u00b3\u0001\u0000\u0000\u00003\u00bf\u0001\u0000\u0000\u00005"+
		"\u00c7\u0001\u0000\u0000\u000078\u0005+\u0000\u00008\u0002\u0001\u0000"+
		"\u0000\u00009:\u0005-\u0000\u0000:\u0004\u0001\u0000\u0000\u0000;<\u0005"+
		"*\u0000\u0000<\u0006\u0001\u0000\u0000\u0000=>\u0005/\u0000\u0000>\b\u0001"+
		"\u0000\u0000\u0000?@\u0005=\u0000\u0000@\n\u0001\u0000\u0000\u0000AB\u0005"+
		",\u0000\u0000B\f\u0001\u0000\u0000\u0000CD\u0005;\u0000\u0000D\u000e\u0001"+
		"\u0000\u0000\u0000EF\u0005(\u0000\u0000F\u0010\u0001\u0000\u0000\u0000"+
		"GH\u0005)\u0000\u0000H\u0012\u0001\u0000\u0000\u0000IJ\u0005{\u0000\u0000"+
		"J\u0014\u0001\u0000\u0000\u0000KL\u0005}\u0000\u0000L\u0016\u0001\u0000"+
		"\u0000\u0000MN\u0005>\u0000\u0000N\u0018\u0001\u0000\u0000\u0000OP\u0005"+
		"<\u0000\u0000P\u001a\u0001\u0000\u0000\u0000QR\u0005>\u0000\u0000RS\u0005"+
		"=\u0000\u0000S\u001c\u0001\u0000\u0000\u0000TU\u0005<\u0000\u0000UV\u0005"+
		"=\u0000\u0000V\u001e\u0001\u0000\u0000\u0000WX\u0005=\u0000\u0000XY\u0005"+
		"=\u0000\u0000Y \u0001\u0000\u0000\u0000Z[\u0005c\u0000\u0000[\\\u0005"+
		"h\u0000\u0000\\]\u0005e\u0000\u0000]^\u0005c\u0000\u0000^_\u0005a\u0000"+
		"\u0000_\"\u0001\u0000\u0000\u0000`a\u0005s\u0000\u0000ab\u0005i\u0000"+
		"\u0000bc\u0005n\u0000\u0000cd\u0005o\u0000\u0000d$\u0001\u0000\u0000\u0000"+
		"ef\u0005f\u0000\u0000fg\u0005o\u0000\u0000gh\u0005o\u0000\u0000hi\u0005"+
		"p\u0000\u0000ij\u0005i\u0000\u0000j&\u0001\u0000\u0000\u0000kl\u0005m"+
		"\u0000\u0000lm\u0005o\u0000\u0000mn\u0005s\u0000\u0000no\u0005t\u0000"+
		"\u0000op\u0005r\u0000\u0000pq\u0005a\u0000\u0000qr\u0005r\u0000\u0000"+
		"r(\u0001\u0000\u0000\u0000st\u0005/\u0000\u0000tu\u0005/\u0000\u0000u"+
		"y\u0001\u0000\u0000\u0000vx\t\u0000\u0000\u0000wv\u0001\u0000\u0000\u0000"+
		"x{\u0001\u0000\u0000\u0000yz\u0001\u0000\u0000\u0000yw\u0001\u0000\u0000"+
		"\u0000z|\u0001\u0000\u0000\u0000{y\u0001\u0000\u0000\u0000|}\u0005\n\u0000"+
		"\u0000}~\u0001\u0000\u0000\u0000~\u007f\u0006\u0014\u0000\u0000\u007f"+
		"*\u0001\u0000\u0000\u0000\u0080\u0081\u0005e\u0000\u0000\u0081\u0082\u0005"+
		"n\u0000\u0000\u0082\u0083\u0005t\u0000\u0000\u0083\u0084\u0005e\u0000"+
		"\u0000\u0084\u0085\u0005r\u0000\u0000\u0085\u0086\u0005i\u0000\u0000\u0086"+
		"\u0087\u0005t\u0000\u0000\u0087\u009b\u0005o\u0000\u0000\u0088\u0089\u0005"+
		"p\u0000\u0000\u0089\u008a\u0005e\u0000\u0000\u008a\u008b\u0005d\u0000"+
		"\u0000\u008b\u008c\u0005a\u0000\u0000\u008c\u008d\u0005c\u0000\u0000\u008d"+
		"\u008e\u0005i\u0000\u0000\u008e\u008f\u0005t\u0000\u0000\u008f\u009b\u0005"+
		"o\u0000\u0000\u0090\u0091\u0005t\u0000\u0000\u0091\u0092\u0005e\u0000"+
		"\u0000\u0092\u0093\u0005x\u0000\u0000\u0093\u0094\u0005t\u0000\u0000\u0094"+
		"\u009b\u0005o\u0000\u0000\u0095\u0096\u0005b\u0000\u0000\u0096\u0097\u0005"+
		"o\u0000\u0000\u0097\u0098\u0005l\u0000\u0000\u0098\u0099\u0005a\u0000"+
		"\u0000\u0099\u009b\u0005s\u0000\u0000\u009a\u0080\u0001\u0000\u0000\u0000"+
		"\u009a\u0088\u0001\u0000\u0000\u0000\u009a\u0090\u0001\u0000\u0000\u0000"+
		"\u009a\u0095\u0001\u0000\u0000\u0000\u009b,\u0001\u0000\u0000\u0000\u009c"+
		"\u00a0\u0005\"\u0000\u0000\u009d\u009f\b\u0000\u0000\u0000\u009e\u009d"+
		"\u0001\u0000\u0000\u0000\u009f\u00a2\u0001\u0000\u0000\u0000\u00a0\u009e"+
		"\u0001\u0000\u0000\u0000\u00a0\u00a1\u0001\u0000\u0000\u0000\u00a1\u00a3"+
		"\u0001\u0000\u0000\u0000\u00a2\u00a0\u0001\u0000\u0000\u0000\u00a3\u00a4"+
		"\u0005\"\u0000\u0000\u00a4.\u0001\u0000\u0000\u0000\u00a5\u00a6\u0005"+
		"n\u0000\u0000\u00a6\u00a7\u0005e\u0000\u0000\u00a7\u00a8\u0005t\u0000"+
		"\u0000\u00a8\u00b1\u0005a\u0000\u0000\u00a9\u00aa\u0005f\u0000\u0000\u00aa"+
		"\u00ab\u0005a\u0000\u0000\u00ab\u00ac\u0005l\u0000\u0000\u00ac\u00ad\u0005"+
		"a\u0000\u0000\u00ad\u00ae\u0005c\u0000\u0000\u00ae\u00af\u0005i\u0000"+
		"\u0000\u00af\u00b1\u0005a\u0000\u0000\u00b0\u00a5\u0001\u0000\u0000\u0000"+
		"\u00b0\u00a9\u0001\u0000\u0000\u0000\u00b10\u0001\u0000\u0000\u0000\u00b2"+
		"\u00b4\u0007\u0001\u0000\u0000\u00b3\u00b2\u0001\u0000\u0000\u0000\u00b4"+
		"\u00b5\u0001\u0000\u0000\u0000\u00b5\u00b3\u0001\u0000\u0000\u0000\u00b5"+
		"\u00b6\u0001\u0000\u0000\u0000\u00b6\u00bd\u0001\u0000\u0000\u0000\u00b7"+
		"\u00b9\u0005.\u0000\u0000\u00b8\u00ba\u0007\u0001\u0000\u0000\u00b9\u00b8"+
		"\u0001\u0000\u0000\u0000\u00ba\u00bb\u0001\u0000\u0000\u0000\u00bb\u00b9"+
		"\u0001\u0000\u0000\u0000\u00bb\u00bc\u0001\u0000\u0000\u0000\u00bc\u00be"+
		"\u0001\u0000\u0000\u0000\u00bd\u00b7\u0001\u0000\u0000\u0000\u00bd\u00be"+
		"\u0001\u0000\u0000\u0000\u00be2\u0001\u0000\u0000\u0000\u00bf\u00c3\u0007"+
		"\u0002\u0000\u0000\u00c0\u00c2\u0007\u0003\u0000\u0000\u00c1\u00c0\u0001"+
		"\u0000\u0000\u0000\u00c2\u00c5\u0001\u0000\u0000\u0000\u00c3\u00c1\u0001"+
		"\u0000\u0000\u0000\u00c3\u00c4\u0001\u0000\u0000\u0000\u00c44\u0001\u0000"+
		"\u0000\u0000\u00c5\u00c3\u0001\u0000\u0000\u0000\u00c6\u00c8\u0007\u0004"+
		"\u0000\u0000\u00c7\u00c6\u0001\u0000\u0000\u0000\u00c8\u00c9\u0001\u0000"+
		"\u0000\u0000\u00c9\u00c7\u0001\u0000\u0000\u0000\u00c9\u00ca\u0001\u0000"+
		"\u0000\u0000\u00ca\u00cb\u0001\u0000\u0000\u0000\u00cb\u00cc\u0006\u001a"+
		"\u0000\u0000\u00cc6\u0001\u0000\u0000\u0000\n\u0000y\u009a\u00a0\u00b0"+
		"\u00b5\u00bb\u00bd\u00c3\u00c9\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}