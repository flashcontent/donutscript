// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class DonutScriptLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PLUS=1, MINUS=2, MULT=3, DIV=4, LPAREN=5, RPAREN=6, LBRACK=7, RBRACK=8, 
		EQ=9, COLON=10, SEMI=11, VAR=12, FUN=13, PRINT=14, INT=15, ID=16, WS=17, 
		COMMENT=18, MULTI_COMMENT=19;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"PLUS", "MINUS", "MULT", "DIV", "LPAREN", "RPAREN", "LBRACK", "RBRACK", 
			"EQ", "COLON", "SEMI", "VAR", "FUN", "PRINT", "INT", "ID", "WS", "COMMENT", 
			"MULTI_COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'+'", "'-'", "'*'", "'/'", "'('", "')'", "'{'", "'}'", "'='", 
			"':'", "';'", "'var'", "'fun'", "'print'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PLUS", "MINUS", "MULT", "DIV", "LPAREN", "RPAREN", "LBRACK", "RBRACK", 
			"EQ", "COLON", "SEMI", "VAR", "FUN", "PRINT", "INT", "ID", "WS", "COMMENT", 
			"MULTI_COMMENT"
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


	public DonutScriptLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "DonutScript.g4"; }

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
		"\u0004\u0000\u0013w\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0004\u000eM\b\u000e\u000b\u000e"+
		"\f\u000eN\u0001\u000f\u0001\u000f\u0005\u000fS\b\u000f\n\u000f\f\u000f"+
		"V\t\u000f\u0001\u0010\u0004\u0010Y\b\u0010\u000b\u0010\f\u0010Z\u0001"+
		"\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0005"+
		"\u0011c\b\u0011\n\u0011\f\u0011f\t\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0005\u0012n\b\u0012\n\u0012"+
		"\f\u0012q\t\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001o\u0000\u0013\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004"+
		"\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017"+
		"\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\u0001"+
		"\u0000\u0005\u0001\u000009\u0003\u0000AZ__az\u0004\u000009AZ__az\u0003"+
		"\u0000\t\n\f\r  \u0002\u0000\n\n\r\r{\u0000\u0001\u0001\u0000\u0000\u0000"+
		"\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000"+
		"\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000"+
		"\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f"+
		"\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013"+
		"\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017"+
		"\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b"+
		"\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f"+
		"\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000"+
		"\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0001\'\u0001\u0000\u0000"+
		"\u0000\u0003)\u0001\u0000\u0000\u0000\u0005+\u0001\u0000\u0000\u0000\u0007"+
		"-\u0001\u0000\u0000\u0000\t/\u0001\u0000\u0000\u0000\u000b1\u0001\u0000"+
		"\u0000\u0000\r3\u0001\u0000\u0000\u0000\u000f5\u0001\u0000\u0000\u0000"+
		"\u00117\u0001\u0000\u0000\u0000\u00139\u0001\u0000\u0000\u0000\u0015;"+
		"\u0001\u0000\u0000\u0000\u0017=\u0001\u0000\u0000\u0000\u0019A\u0001\u0000"+
		"\u0000\u0000\u001bE\u0001\u0000\u0000\u0000\u001dL\u0001\u0000\u0000\u0000"+
		"\u001fP\u0001\u0000\u0000\u0000!X\u0001\u0000\u0000\u0000#^\u0001\u0000"+
		"\u0000\u0000%i\u0001\u0000\u0000\u0000\'(\u0005+\u0000\u0000(\u0002\u0001"+
		"\u0000\u0000\u0000)*\u0005-\u0000\u0000*\u0004\u0001\u0000\u0000\u0000"+
		"+,\u0005*\u0000\u0000,\u0006\u0001\u0000\u0000\u0000-.\u0005/\u0000\u0000"+
		".\b\u0001\u0000\u0000\u0000/0\u0005(\u0000\u00000\n\u0001\u0000\u0000"+
		"\u000012\u0005)\u0000\u00002\f\u0001\u0000\u0000\u000034\u0005{\u0000"+
		"\u00004\u000e\u0001\u0000\u0000\u000056\u0005}\u0000\u00006\u0010\u0001"+
		"\u0000\u0000\u000078\u0005=\u0000\u00008\u0012\u0001\u0000\u0000\u0000"+
		"9:\u0005:\u0000\u0000:\u0014\u0001\u0000\u0000\u0000;<\u0005;\u0000\u0000"+
		"<\u0016\u0001\u0000\u0000\u0000=>\u0005v\u0000\u0000>?\u0005a\u0000\u0000"+
		"?@\u0005r\u0000\u0000@\u0018\u0001\u0000\u0000\u0000AB\u0005f\u0000\u0000"+
		"BC\u0005u\u0000\u0000CD\u0005n\u0000\u0000D\u001a\u0001\u0000\u0000\u0000"+
		"EF\u0005p\u0000\u0000FG\u0005r\u0000\u0000GH\u0005i\u0000\u0000HI\u0005"+
		"n\u0000\u0000IJ\u0005t\u0000\u0000J\u001c\u0001\u0000\u0000\u0000KM\u0007"+
		"\u0000\u0000\u0000LK\u0001\u0000\u0000\u0000MN\u0001\u0000\u0000\u0000"+
		"NL\u0001\u0000\u0000\u0000NO\u0001\u0000\u0000\u0000O\u001e\u0001\u0000"+
		"\u0000\u0000PT\u0007\u0001\u0000\u0000QS\u0007\u0002\u0000\u0000RQ\u0001"+
		"\u0000\u0000\u0000SV\u0001\u0000\u0000\u0000TR\u0001\u0000\u0000\u0000"+
		"TU\u0001\u0000\u0000\u0000U \u0001\u0000\u0000\u0000VT\u0001\u0000\u0000"+
		"\u0000WY\u0007\u0003\u0000\u0000XW\u0001\u0000\u0000\u0000YZ\u0001\u0000"+
		"\u0000\u0000ZX\u0001\u0000\u0000\u0000Z[\u0001\u0000\u0000\u0000[\\\u0001"+
		"\u0000\u0000\u0000\\]\u0006\u0010\u0000\u0000]\"\u0001\u0000\u0000\u0000"+
		"^_\u0005-\u0000\u0000_`\u0005-\u0000\u0000`d\u0001\u0000\u0000\u0000a"+
		"c\b\u0004\u0000\u0000ba\u0001\u0000\u0000\u0000cf\u0001\u0000\u0000\u0000"+
		"db\u0001\u0000\u0000\u0000de\u0001\u0000\u0000\u0000eg\u0001\u0000\u0000"+
		"\u0000fd\u0001\u0000\u0000\u0000gh\u0006\u0011\u0000\u0000h$\u0001\u0000"+
		"\u0000\u0000ij\u0005-\u0000\u0000jk\u0005*\u0000\u0000ko\u0001\u0000\u0000"+
		"\u0000ln\t\u0000\u0000\u0000ml\u0001\u0000\u0000\u0000nq\u0001\u0000\u0000"+
		"\u0000op\u0001\u0000\u0000\u0000om\u0001\u0000\u0000\u0000pr\u0001\u0000"+
		"\u0000\u0000qo\u0001\u0000\u0000\u0000rs\u0005*\u0000\u0000st\u0005-\u0000"+
		"\u0000tu\u0001\u0000\u0000\u0000uv\u0006\u0012\u0000\u0000v&\u0001\u0000"+
		"\u0000\u0000\u0006\u0000NTZdo\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}