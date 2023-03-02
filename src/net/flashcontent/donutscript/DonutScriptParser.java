// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class DonutScriptParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PLUS=1, MINUS=2, MULT=3, DIV=4, LPAREN=5, RPAREN=6, LBRACK=7, RBRACK=8, 
		EQ=9, COLON=10, SEMI=11, VAR=12, FUN=13, PRINT=14, INT=15, ID=16, WS=17;
	public static final int
		RULE_program = 0, RULE_fun = 1, RULE_var = 2, RULE_def = 3;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "fun", "var", "def"
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
			"EQ", "COLON", "SEMI", "VAR", "FUN", "PRINT", "INT", "ID", "WS"
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
	public String getGrammarFileName() { return "java-escape"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public DonutScriptParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public TerminalNode EOF() { return getToken(DonutScriptParser.EOF, 0); }
		public DefContext def() {
			return getRuleContext(DefContext.class,0);
		}
		public FunContext fun() {
			return getRuleContext(FunContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DonutScriptListener ) ((DonutScriptListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DonutScriptListener ) ((DonutScriptListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			setState(17);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(8);
				var();
				setState(9);
				match(EOF);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(11);
				def();
				setState(12);
				match(EOF);
				}
				break;
			case FUN:
				enterOuterAlt(_localctx, 3);
				{
				setState(14);
				fun();
				setState(15);
				match(EOF);
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
	public static class FunContext extends ParserRuleContext {
		public TerminalNode FUN() { return getToken(DonutScriptParser.FUN, 0); }
		public List<DefContext> def() {
			return getRuleContexts(DefContext.class);
		}
		public DefContext def(int i) {
			return getRuleContext(DefContext.class,i);
		}
		public TerminalNode LPAREN() { return getToken(DonutScriptParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(DonutScriptParser.RPAREN, 0); }
		public FunContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fun; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DonutScriptListener ) ((DonutScriptListener)listener).enterFun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DonutScriptListener ) ((DonutScriptListener)listener).exitFun(this);
		}
	}

	public final FunContext fun() throws RecognitionException {
		FunContext _localctx = new FunContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_fun);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(19);
			match(FUN);
			setState(20);
			def();
			setState(21);
			match(LPAREN);
			setState(22);
			def();
			setState(23);
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
	public static class VarContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(DonutScriptParser.VAR, 0); }
		public List<DefContext> def() {
			return getRuleContexts(DefContext.class);
		}
		public DefContext def(int i) {
			return getRuleContext(DefContext.class,i);
		}
		public TerminalNode EQ() { return getToken(DonutScriptParser.EQ, 0); }
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DonutScriptListener ) ((DonutScriptListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DonutScriptListener ) ((DonutScriptListener)listener).exitVar(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25);
			match(VAR);
			setState(26);
			def();
			setState(27);
			match(EQ);
			setState(28);
			def();
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
		public TerminalNode ID() { return getToken(DonutScriptParser.ID, 0); }
		public DefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DonutScriptListener ) ((DonutScriptListener)listener).enterDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DonutScriptListener ) ((DonutScriptListener)listener).exitDef(this);
		}
	}

	public final DefContext def() throws RecognitionException {
		DefContext _localctx = new DefContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
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

	public static final String _serializedATN =
		"\u0004\u0001\u0011!\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0003\u0000\u0012\b\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0000\u0000\u0004"+
		"\u0000\u0002\u0004\u0006\u0000\u0000\u001e\u0000\u0011\u0001\u0000\u0000"+
		"\u0000\u0002\u0013\u0001\u0000\u0000\u0000\u0004\u0019\u0001\u0000\u0000"+
		"\u0000\u0006\u001e\u0001\u0000\u0000\u0000\b\t\u0003\u0004\u0002\u0000"+
		"\t\n\u0005\u0000\u0000\u0001\n\u0012\u0001\u0000\u0000\u0000\u000b\f\u0003"+
		"\u0006\u0003\u0000\f\r\u0005\u0000\u0000\u0001\r\u0012\u0001\u0000\u0000"+
		"\u0000\u000e\u000f\u0003\u0002\u0001\u0000\u000f\u0010\u0005\u0000\u0000"+
		"\u0001\u0010\u0012\u0001\u0000\u0000\u0000\u0011\b\u0001\u0000\u0000\u0000"+
		"\u0011\u000b\u0001\u0000\u0000\u0000\u0011\u000e\u0001\u0000\u0000\u0000"+
		"\u0012\u0001\u0001\u0000\u0000\u0000\u0013\u0014\u0005\r\u0000\u0000\u0014"+
		"\u0015\u0003\u0006\u0003\u0000\u0015\u0016\u0005\u0005\u0000\u0000\u0016"+
		"\u0017\u0003\u0006\u0003\u0000\u0017\u0018\u0005\u0006\u0000\u0000\u0018"+
		"\u0003\u0001\u0000\u0000\u0000\u0019\u001a\u0005\f\u0000\u0000\u001a\u001b"+
		"\u0003\u0006\u0003\u0000\u001b\u001c\u0005\t\u0000\u0000\u001c\u001d\u0003"+
		"\u0006\u0003\u0000\u001d\u0005\u0001\u0000\u0000\u0000\u001e\u001f\u0005"+
		"\u0010\u0000\u0000\u001f\u0007\u0001\u0000\u0000\u0000\u0001\u0011";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}