// Generated from src\parser\Grammar.g4 by ANTLR 4.7.2
package parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GrammarParser extends Parser {
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
		T__38=39, INT_CONSTANT=40, REAL_CONSTANT=41, IDENT=42, CHAR_CONSTANT=43, 
		LINE_COMMENT=44, MULTILINE_COMMENT=45, WHITESPACE=46;
	public static final int
		RULE_start = 0, RULE_definitions = 1, RULE_defFunc = 2, RULE_mainFunction = 3, 
		RULE_defVar = 4, RULE_defStruct = 5, RULE_variable = 6, RULE_var = 7, 
		RULE_statements = 8, RULE_expression = 9, RULE_type = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "definitions", "defFunc", "mainFunction", "defVar", "defStruct", 
			"variable", "var", "statements", "expression", "type"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "':'", "','", "')'", "'{'", "'}'", "'main'", "'var'", "';'", 
			"'struct'", "'['", "']'", "'.'", "'return'", "'if'", "'else'", "'while'", 
			"'printsp'", "'println'", "'read'", "'='", "'as'", "'-'", "'!'", "'<'", 
			"'>'", "'*'", "'/'", "'%'", "'+'", "'>='", "'<='", "'!='", "'=='", "'&&'", 
			"'||'", "'int'", "'char'", "'float'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "INT_CONSTANT", "REAL_CONSTANT", "IDENT", "CHAR_CONSTANT", 
			"LINE_COMMENT", "MULTILINE_COMMENT", "WHITESPACE"
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
	public String getGrammarFileName() { return "Grammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StartContext extends ParserRuleContext {
		public MainFunctionContext mainFunction() {
			return getRuleContext(MainFunctionContext.class,0);
		}
		public List<DefinitionsContext> definitions() {
			return getRuleContexts(DefinitionsContext.class);
		}
		public DefinitionsContext definitions(int i) {
			return getRuleContext(DefinitionsContext.class,i);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__9) | (1L << IDENT))) != 0)) {
				{
				{
				setState(22);
				definitions();
				}
				}
				setState(27);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(28);
			mainFunction();
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

	public static class DefinitionsContext extends ParserRuleContext {
		public DefVarContext defVar() {
			return getRuleContext(DefVarContext.class,0);
		}
		public DefStructContext defStruct() {
			return getRuleContext(DefStructContext.class,0);
		}
		public DefFuncContext defFunc() {
			return getRuleContext(DefFuncContext.class,0);
		}
		public DefinitionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definitions; }
	}

	public final DefinitionsContext definitions() throws RecognitionException {
		DefinitionsContext _localctx = new DefinitionsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_definitions);
		try {
			setState(33);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(30);
				defVar();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				setState(31);
				defStruct();
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 3);
				{
				setState(32);
				defFunc();
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

	public static class DefFuncContext extends ParserRuleContext {
		public List<TerminalNode> IDENT() { return getTokens(GrammarParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(GrammarParser.IDENT, i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
		public DefFuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defFunc; }
	}

	public final DefFuncContext defFunc() throws RecognitionException {
		DefFuncContext _localctx = new DefFuncContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_defFunc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			match(IDENT);
			setState(36);
			match(T__0);
			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENT) {
				{
				setState(37);
				match(IDENT);
				setState(38);
				match(T__1);
				setState(39);
				type();
				setState(46);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(40);
					match(T__2);
					setState(41);
					match(IDENT);
					setState(42);
					match(T__1);
					setState(43);
					type();
					}
					}
					setState(48);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(51);
			match(T__3);
			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(52);
				match(T__1);
				setState(53);
				type();
				}
			}

			setState(56);
			match(T__4);
			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__7) | (1L << T__10) | (1L << T__13) | (1L << T__14) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << INT_CONSTANT) | (1L << REAL_CONSTANT) | (1L << IDENT) | (1L << CHAR_CONSTANT))) != 0)) {
				{
				{
				setState(57);
				statements();
				}
				}
				setState(62);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(63);
			match(T__5);
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

	public static class MainFunctionContext extends ParserRuleContext {
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
		public MainFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainFunction; }
	}

	public final MainFunctionContext mainFunction() throws RecognitionException {
		MainFunctionContext _localctx = new MainFunctionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_mainFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			match(T__6);
			setState(66);
			match(T__0);
			setState(67);
			match(T__3);
			setState(68);
			match(T__4);
			setState(72);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__7) | (1L << T__10) | (1L << T__13) | (1L << T__14) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << INT_CONSTANT) | (1L << REAL_CONSTANT) | (1L << IDENT) | (1L << CHAR_CONSTANT))) != 0)) {
				{
				{
				setState(69);
				statements();
				}
				}
				setState(74);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(75);
			match(T__5);
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

	public static class DefVarContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public DefVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defVar; }
	}

	public final DefVarContext defVar() throws RecognitionException {
		DefVarContext _localctx = new DefVarContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_defVar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(T__7);
			setState(78);
			variable();
			setState(79);
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

	public static class DefStructContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(GrammarParser.IDENT, 0); }
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public DefStructContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defStruct; }
	}

	public final DefStructContext defStruct() throws RecognitionException {
		DefStructContext _localctx = new DefStructContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_defStruct);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			match(T__9);
			setState(82);
			match(IDENT);
			setState(83);
			match(T__4);
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENT) {
				{
				{
				setState(84);
				variable();
				setState(85);
				match(T__8);
				}
				}
				setState(91);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(92);
			match(T__5);
			setState(93);
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

	public static class VariableContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(GrammarParser.IDENT, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> INT_CONSTANT() { return getTokens(GrammarParser.INT_CONSTANT); }
		public TerminalNode INT_CONSTANT(int i) {
			return getToken(GrammarParser.INT_CONSTANT, i);
		}
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_variable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			match(IDENT);
			setState(96);
			match(T__1);
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__10) {
				{
				{
				setState(97);
				match(T__10);
				setState(98);
				match(INT_CONSTANT);
				setState(99);
				match(T__11);
				}
				}
				setState(104);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(105);
			type();
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
		public List<TerminalNode> IDENT() { return getTokens(GrammarParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(GrammarParser.IDENT, i);
		}
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public List<TerminalNode> INT_CONSTANT() { return getTokens(GrammarParser.INT_CONSTANT); }
		public TerminalNode INT_CONSTANT(int i) {
			return getToken(GrammarParser.INT_CONSTANT, i);
		}
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_var);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(IDENT);
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__10) {
				{
				{
				setState(108);
				match(T__10);
				setState(109);
				_la = _input.LA(1);
				if ( !(_la==INT_CONSTANT || _la==IDENT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(110);
				match(T__11);
				}
				}
				setState(115);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(120);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(116);
					match(T__12);
					setState(117);
					var();
					}
					} 
				}
				setState(122);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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

	public static class StatementsContext extends ParserRuleContext {
		public DefVarContext defVar() {
			return getRuleContext(DefVarContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(GrammarParser.IDENT, 0); }
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_statements);
		int _la;
		try {
			setState(208);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(123);
				defVar();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(124);
				match(T__13);
				setState(128);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__10) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << INT_CONSTANT) | (1L << REAL_CONSTANT) | (1L << IDENT) | (1L << CHAR_CONSTANT))) != 0)) {
					{
					{
					setState(125);
					expression(0);
					}
					}
					setState(130);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(131);
				match(T__8);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(132);
				match(T__14);
				setState(133);
				match(T__0);
				setState(137);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__10) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << INT_CONSTANT) | (1L << REAL_CONSTANT) | (1L << IDENT) | (1L << CHAR_CONSTANT))) != 0)) {
					{
					{
					setState(134);
					expression(0);
					}
					}
					setState(139);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(140);
				match(T__3);
				setState(141);
				match(T__4);
				setState(145);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__7) | (1L << T__10) | (1L << T__13) | (1L << T__14) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << INT_CONSTANT) | (1L << REAL_CONSTANT) | (1L << IDENT) | (1L << CHAR_CONSTANT))) != 0)) {
					{
					{
					setState(142);
					statements();
					}
					}
					setState(147);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(148);
				match(T__5);
				setState(158);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__15) {
					{
					setState(149);
					match(T__15);
					setState(150);
					match(T__4);
					setState(154);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__7) | (1L << T__10) | (1L << T__13) | (1L << T__14) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << INT_CONSTANT) | (1L << REAL_CONSTANT) | (1L << IDENT) | (1L << CHAR_CONSTANT))) != 0)) {
						{
						{
						setState(151);
						statements();
						}
						}
						setState(156);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(157);
					match(T__5);
					}
				}

				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(160);
				match(T__16);
				setState(161);
				match(T__0);
				setState(165);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__10) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << INT_CONSTANT) | (1L << REAL_CONSTANT) | (1L << IDENT) | (1L << CHAR_CONSTANT))) != 0)) {
					{
					{
					setState(162);
					expression(0);
					}
					}
					setState(167);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(168);
				match(T__3);
				setState(169);
				match(T__4);
				setState(173);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__7) | (1L << T__10) | (1L << T__13) | (1L << T__14) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << INT_CONSTANT) | (1L << REAL_CONSTANT) | (1L << IDENT) | (1L << CHAR_CONSTANT))) != 0)) {
					{
					{
					setState(170);
					statements();
					}
					}
					setState(175);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(176);
				match(T__5);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(177);
				match(T__17);
				setState(178);
				var();
				setState(179);
				match(T__8);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(181);
				match(T__18);
				setState(182);
				expression(0);
				setState(183);
				match(T__8);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(185);
				match(T__19);
				setState(186);
				var();
				setState(187);
				match(T__8);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(189);
				expression(0);
				setState(190);
				match(T__20);
				setState(191);
				expression(0);
				setState(192);
				match(T__8);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(194);
				match(IDENT);
				setState(195);
				match(T__0);
				setState(204);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__10) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << INT_CONSTANT) | (1L << REAL_CONSTANT) | (1L << IDENT) | (1L << CHAR_CONSTANT))) != 0)) {
					{
					setState(196);
					expression(0);
					setState(201);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(197);
						match(T__2);
						setState(198);
						expression(0);
						}
						}
						setState(203);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(206);
				match(T__3);
				setState(207);
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

	public static class ExpressionContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(GrammarParser.IDENT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode INT_CONSTANT() { return getToken(GrammarParser.INT_CONSTANT, 0); }
		public TerminalNode CHAR_CONSTANT() { return getToken(GrammarParser.CHAR_CONSTANT, 0); }
		public TerminalNode REAL_CONSTANT() { return getToken(GrammarParser.REAL_CONSTANT, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(211);
				match(IDENT);
				setState(212);
				match(T__0);
				setState(221);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__10) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << INT_CONSTANT) | (1L << REAL_CONSTANT) | (1L << IDENT) | (1L << CHAR_CONSTANT))) != 0)) {
					{
					setState(213);
					expression(0);
					setState(218);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(214);
						match(T__2);
						setState(215);
						expression(0);
						}
						}
						setState(220);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(223);
				match(T__3);
				}
				break;
			case 2:
				{
				setState(224);
				match(INT_CONSTANT);
				}
				break;
			case 3:
				{
				setState(225);
				match(CHAR_CONSTANT);
				}
				break;
			case 4:
				{
				setState(226);
				match(REAL_CONSTANT);
				}
				break;
			case 5:
				{
				setState(227);
				match(IDENT);
				}
				break;
			case 6:
				{
				setState(228);
				match(T__0);
				setState(229);
				expression(0);
				setState(230);
				match(T__3);
				}
				break;
			case 7:
				{
				setState(232);
				match(T__10);
				setState(233);
				expression(0);
				setState(234);
				match(T__11);
				}
				break;
			case 8:
				{
				setState(236);
				match(T__22);
				setState(237);
				expression(8);
				}
				break;
			case 9:
				{
				setState(238);
				match(T__23);
				setState(239);
				expression(7);
				}
				break;
			case 10:
				{
				setState(240);
				match(T__24);
				setState(241);
				type();
				setState(242);
				match(T__25);
				setState(243);
				match(T__0);
				setState(244);
				expression(0);
				setState(245);
				match(T__3);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(277);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(275);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(249);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(250);
						match(T__12);
						setState(251);
						expression(11);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(252);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(253);
						match(T__20);
						setState(254);
						expression(6);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(255);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(256);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__26) | (1L << T__27) | (1L << T__28))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(257);
						expression(5);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(258);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(259);
						_la = _input.LA(1);
						if ( !(_la==T__22 || _la==T__29) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(260);
						expression(4);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(261);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(262);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__24) | (1L << T__25) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(263);
						expression(3);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(264);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(265);
						_la = _input.LA(1);
						if ( !(_la==T__34 || _la==T__35) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(266);
						expression(2);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(267);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(268);
						match(T__10);
						setState(269);
						expression(0);
						setState(270);
						match(T__11);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(272);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(273);
						match(T__21);
						setState(274);
						type();
						}
						break;
					}
					} 
				}
				setState(279);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(GrammarParser.IDENT, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << IDENT))) != 0)) ) {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 9:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 10);
		case 1:
			return precpred(_ctx, 5);
		case 2:
			return precpred(_ctx, 4);
		case 3:
			return precpred(_ctx, 3);
		case 4:
			return precpred(_ctx, 2);
		case 5:
			return precpred(_ctx, 1);
		case 6:
			return precpred(_ctx, 11);
		case 7:
			return precpred(_ctx, 9);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\60\u011d\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\3\2\7\2\32\n\2\f\2\16\2\35\13\2\3\2\3\2\3\3\3\3\3\3\5\3"+
		"$\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4/\n\4\f\4\16\4\62\13\4\5"+
		"\4\64\n\4\3\4\3\4\3\4\5\49\n\4\3\4\3\4\7\4=\n\4\f\4\16\4@\13\4\3\4\3\4"+
		"\3\5\3\5\3\5\3\5\3\5\7\5I\n\5\f\5\16\5L\13\5\3\5\3\5\3\6\3\6\3\6\3\6\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\7\7Z\n\7\f\7\16\7]\13\7\3\7\3\7\3\7\3\b\3\b\3\b"+
		"\3\b\3\b\7\bg\n\b\f\b\16\bj\13\b\3\b\3\b\3\t\3\t\3\t\3\t\7\tr\n\t\f\t"+
		"\16\tu\13\t\3\t\3\t\7\ty\n\t\f\t\16\t|\13\t\3\n\3\n\3\n\7\n\u0081\n\n"+
		"\f\n\16\n\u0084\13\n\3\n\3\n\3\n\3\n\7\n\u008a\n\n\f\n\16\n\u008d\13\n"+
		"\3\n\3\n\3\n\7\n\u0092\n\n\f\n\16\n\u0095\13\n\3\n\3\n\3\n\3\n\7\n\u009b"+
		"\n\n\f\n\16\n\u009e\13\n\3\n\5\n\u00a1\n\n\3\n\3\n\3\n\7\n\u00a6\n\n\f"+
		"\n\16\n\u00a9\13\n\3\n\3\n\3\n\7\n\u00ae\n\n\f\n\16\n\u00b1\13\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\7\n\u00ca\n\n\f\n\16\n\u00cd\13\n\5\n\u00cf\n\n\3\n\3"+
		"\n\5\n\u00d3\n\n\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u00db\n\13\f\13\16"+
		"\13\u00de\13\13\5\13\u00e0\n\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\5\13\u00fa\n\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\7\13\u0116\n\13\f\13\16\13\u0119\13\13\3\f\3\f\3\f\2\3"+
		"\24\r\2\4\6\b\n\f\16\20\22\24\26\2\b\4\2**,,\3\2\35\37\4\2\31\31  \4\2"+
		"\33\34!$\3\2%&\4\2\'),,\2\u0141\2\33\3\2\2\2\4#\3\2\2\2\6%\3\2\2\2\bC"+
		"\3\2\2\2\nO\3\2\2\2\fS\3\2\2\2\16a\3\2\2\2\20m\3\2\2\2\22\u00d2\3\2\2"+
		"\2\24\u00f9\3\2\2\2\26\u011a\3\2\2\2\30\32\5\4\3\2\31\30\3\2\2\2\32\35"+
		"\3\2\2\2\33\31\3\2\2\2\33\34\3\2\2\2\34\36\3\2\2\2\35\33\3\2\2\2\36\37"+
		"\5\b\5\2\37\3\3\2\2\2 $\5\n\6\2!$\5\f\7\2\"$\5\6\4\2# \3\2\2\2#!\3\2\2"+
		"\2#\"\3\2\2\2$\5\3\2\2\2%&\7,\2\2&\63\7\3\2\2\'(\7,\2\2()\7\4\2\2)\60"+
		"\5\26\f\2*+\7\5\2\2+,\7,\2\2,-\7\4\2\2-/\5\26\f\2.*\3\2\2\2/\62\3\2\2"+
		"\2\60.\3\2\2\2\60\61\3\2\2\2\61\64\3\2\2\2\62\60\3\2\2\2\63\'\3\2\2\2"+
		"\63\64\3\2\2\2\64\65\3\2\2\2\658\7\6\2\2\66\67\7\4\2\2\679\5\26\f\28\66"+
		"\3\2\2\289\3\2\2\29:\3\2\2\2:>\7\7\2\2;=\5\22\n\2<;\3\2\2\2=@\3\2\2\2"+
		"><\3\2\2\2>?\3\2\2\2?A\3\2\2\2@>\3\2\2\2AB\7\b\2\2B\7\3\2\2\2CD\7\t\2"+
		"\2DE\7\3\2\2EF\7\6\2\2FJ\7\7\2\2GI\5\22\n\2HG\3\2\2\2IL\3\2\2\2JH\3\2"+
		"\2\2JK\3\2\2\2KM\3\2\2\2LJ\3\2\2\2MN\7\b\2\2N\t\3\2\2\2OP\7\n\2\2PQ\5"+
		"\16\b\2QR\7\13\2\2R\13\3\2\2\2ST\7\f\2\2TU\7,\2\2U[\7\7\2\2VW\5\16\b\2"+
		"WX\7\13\2\2XZ\3\2\2\2YV\3\2\2\2Z]\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\^\3\2"+
		"\2\2][\3\2\2\2^_\7\b\2\2_`\7\13\2\2`\r\3\2\2\2ab\7,\2\2bh\7\4\2\2cd\7"+
		"\r\2\2de\7*\2\2eg\7\16\2\2fc\3\2\2\2gj\3\2\2\2hf\3\2\2\2hi\3\2\2\2ik\3"+
		"\2\2\2jh\3\2\2\2kl\5\26\f\2l\17\3\2\2\2ms\7,\2\2no\7\r\2\2op\t\2\2\2p"+
		"r\7\16\2\2qn\3\2\2\2ru\3\2\2\2sq\3\2\2\2st\3\2\2\2tz\3\2\2\2us\3\2\2\2"+
		"vw\7\17\2\2wy\5\20\t\2xv\3\2\2\2y|\3\2\2\2zx\3\2\2\2z{\3\2\2\2{\21\3\2"+
		"\2\2|z\3\2\2\2}\u00d3\5\n\6\2~\u0082\7\20\2\2\177\u0081\5\24\13\2\u0080"+
		"\177\3\2\2\2\u0081\u0084\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0083\3\2\2"+
		"\2\u0083\u0085\3\2\2\2\u0084\u0082\3\2\2\2\u0085\u00d3\7\13\2\2\u0086"+
		"\u0087\7\21\2\2\u0087\u008b\7\3\2\2\u0088\u008a\5\24\13\2\u0089\u0088"+
		"\3\2\2\2\u008a\u008d\3\2\2\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c"+
		"\u008e\3\2\2\2\u008d\u008b\3\2\2\2\u008e\u008f\7\6\2\2\u008f\u0093\7\7"+
		"\2\2\u0090\u0092\5\22\n\2\u0091\u0090\3\2\2\2\u0092\u0095\3\2\2\2\u0093"+
		"\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0096\3\2\2\2\u0095\u0093\3\2"+
		"\2\2\u0096\u00a0\7\b\2\2\u0097\u0098\7\22\2\2\u0098\u009c\7\7\2\2\u0099"+
		"\u009b\5\22\n\2\u009a\u0099\3\2\2\2\u009b\u009e\3\2\2\2\u009c\u009a\3"+
		"\2\2\2\u009c\u009d\3\2\2\2\u009d\u009f\3\2\2\2\u009e\u009c\3\2\2\2\u009f"+
		"\u00a1\7\b\2\2\u00a0\u0097\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00d3\3\2"+
		"\2\2\u00a2\u00a3\7\23\2\2\u00a3\u00a7\7\3\2\2\u00a4\u00a6\5\24\13\2\u00a5"+
		"\u00a4\3\2\2\2\u00a6\u00a9\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a7\u00a8\3\2"+
		"\2\2\u00a8\u00aa\3\2\2\2\u00a9\u00a7\3\2\2\2\u00aa\u00ab\7\6\2\2\u00ab"+
		"\u00af\7\7\2\2\u00ac\u00ae\5\22\n\2\u00ad\u00ac\3\2\2\2\u00ae\u00b1\3"+
		"\2\2\2\u00af\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b2\3\2\2\2\u00b1"+
		"\u00af\3\2\2\2\u00b2\u00d3\7\b\2\2\u00b3\u00b4\7\24\2\2\u00b4\u00b5\5"+
		"\20\t\2\u00b5\u00b6\7\13\2\2\u00b6\u00d3\3\2\2\2\u00b7\u00b8\7\25\2\2"+
		"\u00b8\u00b9\5\24\13\2\u00b9\u00ba\7\13\2\2\u00ba\u00d3\3\2\2\2\u00bb"+
		"\u00bc\7\26\2\2\u00bc\u00bd\5\20\t\2\u00bd\u00be\7\13\2\2\u00be\u00d3"+
		"\3\2\2\2\u00bf\u00c0\5\24\13\2\u00c0\u00c1\7\27\2\2\u00c1\u00c2\5\24\13"+
		"\2\u00c2\u00c3\7\13\2\2\u00c3\u00d3\3\2\2\2\u00c4\u00c5\7,\2\2\u00c5\u00ce"+
		"\7\3\2\2\u00c6\u00cb\5\24\13\2\u00c7\u00c8\7\5\2\2\u00c8\u00ca\5\24\13"+
		"\2\u00c9\u00c7\3\2\2\2\u00ca\u00cd\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cb\u00cc"+
		"\3\2\2\2\u00cc\u00cf\3\2\2\2\u00cd\u00cb\3\2\2\2\u00ce\u00c6\3\2\2\2\u00ce"+
		"\u00cf\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d1\7\6\2\2\u00d1\u00d3\7\13"+
		"\2\2\u00d2}\3\2\2\2\u00d2~\3\2\2\2\u00d2\u0086\3\2\2\2\u00d2\u00a2\3\2"+
		"\2\2\u00d2\u00b3\3\2\2\2\u00d2\u00b7\3\2\2\2\u00d2\u00bb\3\2\2\2\u00d2"+
		"\u00bf\3\2\2\2\u00d2\u00c4\3\2\2\2\u00d3\23\3\2\2\2\u00d4\u00d5\b\13\1"+
		"\2\u00d5\u00d6\7,\2\2\u00d6\u00df\7\3\2\2\u00d7\u00dc\5\24\13\2\u00d8"+
		"\u00d9\7\5\2\2\u00d9\u00db\5\24\13\2\u00da\u00d8\3\2\2\2\u00db\u00de\3"+
		"\2\2\2\u00dc\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00e0\3\2\2\2\u00de"+
		"\u00dc\3\2\2\2\u00df\u00d7\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e1\3\2"+
		"\2\2\u00e1\u00fa\7\6\2\2\u00e2\u00fa\7*\2\2\u00e3\u00fa\7-\2\2\u00e4\u00fa"+
		"\7+\2\2\u00e5\u00fa\7,\2\2\u00e6\u00e7\7\3\2\2\u00e7\u00e8\5\24\13\2\u00e8"+
		"\u00e9\7\6\2\2\u00e9\u00fa\3\2\2\2\u00ea\u00eb\7\r\2\2\u00eb\u00ec\5\24"+
		"\13\2\u00ec\u00ed\7\16\2\2\u00ed\u00fa\3\2\2\2\u00ee\u00ef\7\31\2\2\u00ef"+
		"\u00fa\5\24\13\n\u00f0\u00f1\7\32\2\2\u00f1\u00fa\5\24\13\t\u00f2\u00f3"+
		"\7\33\2\2\u00f3\u00f4\5\26\f\2\u00f4\u00f5\7\34\2\2\u00f5\u00f6\7\3\2"+
		"\2\u00f6\u00f7\5\24\13\2\u00f7\u00f8\7\6\2\2\u00f8\u00fa\3\2\2\2\u00f9"+
		"\u00d4\3\2\2\2\u00f9\u00e2\3\2\2\2\u00f9\u00e3\3\2\2\2\u00f9\u00e4\3\2"+
		"\2\2\u00f9\u00e5\3\2\2\2\u00f9\u00e6\3\2\2\2\u00f9\u00ea\3\2\2\2\u00f9"+
		"\u00ee\3\2\2\2\u00f9\u00f0\3\2\2\2\u00f9\u00f2\3\2\2\2\u00fa\u0117\3\2"+
		"\2\2\u00fb\u00fc\f\f\2\2\u00fc\u00fd\7\17\2\2\u00fd\u0116\5\24\13\r\u00fe"+
		"\u00ff\f\7\2\2\u00ff\u0100\7\27\2\2\u0100\u0116\5\24\13\b\u0101\u0102"+
		"\f\6\2\2\u0102\u0103\t\3\2\2\u0103\u0116\5\24\13\7\u0104\u0105\f\5\2\2"+
		"\u0105\u0106\t\4\2\2\u0106\u0116\5\24\13\6\u0107\u0108\f\4\2\2\u0108\u0109"+
		"\t\5\2\2\u0109\u0116\5\24\13\5\u010a\u010b\f\3\2\2\u010b\u010c\t\6\2\2"+
		"\u010c\u0116\5\24\13\4\u010d\u010e\f\r\2\2\u010e\u010f\7\r\2\2\u010f\u0110"+
		"\5\24\13\2\u0110\u0111\7\16\2\2\u0111\u0116\3\2\2\2\u0112\u0113\f\13\2"+
		"\2\u0113\u0114\7\30\2\2\u0114\u0116\5\26\f\2\u0115\u00fb\3\2\2\2\u0115"+
		"\u00fe\3\2\2\2\u0115\u0101\3\2\2\2\u0115\u0104\3\2\2\2\u0115\u0107\3\2"+
		"\2\2\u0115\u010a\3\2\2\2\u0115\u010d\3\2\2\2\u0115\u0112\3\2\2\2\u0116"+
		"\u0119\3\2\2\2\u0117\u0115\3\2\2\2\u0117\u0118\3\2\2\2\u0118\25\3\2\2"+
		"\2\u0119\u0117\3\2\2\2\u011a\u011b\t\7\2\2\u011b\27\3\2\2\2\34\33#\60"+
		"\638>J[hsz\u0082\u008b\u0093\u009c\u00a0\u00a7\u00af\u00cb\u00ce\u00d2"+
		"\u00dc\u00df\u00f9\u0115\u0117";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}