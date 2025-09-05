// Generated from CodejiParser.g4 by ANTLR 4.13.2
package generated;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({ "all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape" })
public class CodejiParser extends Parser {
	static {
		RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION);
	}

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache = new PredictionContextCache();
	public static final int PADHLE = 1, LIKHNA = 2, NAYILINE = 3, PATAHAI = 4, RAKHDO = 5, BOLNA = 6, THIKHAI = 7,
			SAHIME = 8, KUCHNAHI = 9, AGAR = 10, NAHI_AGAR = 11, NAHI_TO = 12, KHATM = 13, JABTAK = 14,
			JODWA = 15, GHATAWA = 16, GUNAK = 17, BATAAK = 18, REMAINDERWA = 19, POWERWA = 20,
			BADA = 21, CHHOTA = 22, BARABAR = 23, BADA_YA_BARAABAR = 24, CHHOTA_YA_BARAABAR = 25,
			NAHI_BARABAR = 26, LPAREN = 27, RPAREN = 28, COMMA = 29, STRING = 30, NUMBER = 31,
			ID = 32, WS = 33, LINE_COMMENT = 34, BLOCK_COMMENT = 35;
	public static final int RULE_program = 0, RULE_statement = 1, RULE_varDeclarationStatement = 2,
			RULE_assignmentStatement = 3, RULE_printStatement = 4, RULE_printLineStatement = 5,
			RULE_padhleStatement = 6, RULE_ifStatement = 7, RULE_whileStatement = 8,
			RULE_statementBlock = 9, RULE_condition = 10, RULE_comparator = 11, RULE_printArguments = 12,
			RULE_printPart = 13, RULE_printValue = 14, RULE_expression = 15, RULE_term = 16,
			RULE_factor = 17, RULE_primary = 18;

	private static String[] makeRuleNames() {
		return new String[] {
				"program", "statement", "varDeclarationStatement", "assignmentStatement",
				"printStatement", "printLineStatement", "padhleStatement", "ifStatement",
				"whileStatement", "statementBlock", "condition", "comparator", "printArguments",
				"printPart", "printValue", "expression", "term", "factor", "primary"
		};
	}

	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
				null, "'padhle'", "'likhna'", "'nayiLine'", "'pataHai'", "'rakhDo'",
				"'bolna'", "'thikHai'", "'sahiMe'", "'kuchNahi'", "'agar'", "'nahi_agar'",
				"'nahi_to'", "'khatm'", "'jabtak'", "'jodwa'", "'ghatawa'", "'gunak'",
				"'bataak'", "'remainderwa'", "'powerwa'", "'bada'", "'chhota'", "'barabar'",
				"'bada_ya_barabar'", "'chhota_ya_barabar'", "'nahi_barabar'", "'('",
				"')'", "','"
		};
	}

	private static final String[] _LITERAL_NAMES = makeLiteralNames();

	private static String[] makeSymbolicNames() {
		return new String[] {
				null, "PADHLE", "LIKHNA", "NAYILINE", "PATAHAI", "RAKHDO", "BOLNA", "THIKHAI",
				"SAHIME", "KUCHNAHI", "AGAR", "NAHI_AGAR", "NAHI_TO", "KHATM", "JABTAK",
				"JODWA", "GHATAWA", "GUNAK", "BATAAK", "REMAINDERWA", "POWERWA", "BADA",
				"CHHOTA", "BARABAR", "BADA_YA_BARAABAR", "CHHOTA_YA_BARAABAR", "NAHI_BARABAR",
				"LPAREN", "RPAREN", "COMMA", "STRING", "NUMBER", "ID", "WS", "LINE_COMMENT",
				"BLOCK_COMMENT"
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
	public String getGrammarFileName() {
		return "CodejiParser.g4";
	}

	@Override
	public String[] getRuleNames() {
		return ruleNames;
	}

	@Override
	public String getSerializedATN() {
		return _serializedATN;
	}

	@Override
	public ATN getATN() {
		return _ATN;
	}

	public CodejiParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() {
			return getToken(CodejiParser.EOF, 0);
		}

		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}

		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class, i);
		}

		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_program;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof CodejiParserListener)
				((CodejiParserListener) listener).enterProgram(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof CodejiParserListener)
				((CodejiParserListener) listener).exitProgram(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof CodejiParserVisitor)
				return ((CodejiParserVisitor<? extends T>) visitor).visitProgram(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(41);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4294984790L) != 0)) {
					{
						{
							setState(38);
							statement();
						}
					}
					setState(43);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(44);
				match(EOF);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public VarDeclarationStatementContext varDeclarationStatement() {
			return getRuleContext(VarDeclarationStatementContext.class, 0);
		}

		public AssignmentStatementContext assignmentStatement() {
			return getRuleContext(AssignmentStatementContext.class, 0);
		}

		public PrintStatementContext printStatement() {
			return getRuleContext(PrintStatementContext.class, 0);
		}

		public PrintLineStatementContext printLineStatement() {
			return getRuleContext(PrintLineStatementContext.class, 0);
		}

		public PadhleStatementContext padhleStatement() {
			return getRuleContext(PadhleStatementContext.class, 0);
		}

		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class, 0);
		}

		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class, 0);
		}

		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_statement;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof CodejiParserListener)
				((CodejiParserListener) listener).enterStatement(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof CodejiParserListener)
				((CodejiParserListener) listener).exitStatement(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof CodejiParserVisitor)
				return ((CodejiParserVisitor<? extends T>) visitor).visitStatement(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(53);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case PATAHAI:
					enterOuterAlt(_localctx, 1); {
					setState(46);
					varDeclarationStatement();
				}
					break;
				case ID:
					enterOuterAlt(_localctx, 2); {
					setState(47);
					assignmentStatement();
				}
					break;
				case BOLNA:
					enterOuterAlt(_localctx, 3); {
					setState(48);
					printStatement();
				}
					break;
				case LIKHNA:
					enterOuterAlt(_localctx, 4); {
					setState(49);
					printLineStatement();
				}
					break;
				case PADHLE:
					enterOuterAlt(_localctx, 5); {
					setState(50);
					padhleStatement();
				}
					break;
				case AGAR:
					enterOuterAlt(_localctx, 6); {
					setState(51);
					ifStatement();
				}
					break;
				case JABTAK:
					enterOuterAlt(_localctx, 7); {
					setState(52);
					whileStatement();
				}
					break;
				default:
					throw new NoViableAltException(this);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VarDeclarationStatementContext extends ParserRuleContext {
		public TerminalNode PATAHAI() {
			return getToken(CodejiParser.PATAHAI, 0);
		}

		public TerminalNode ID() {
			return getToken(CodejiParser.ID, 0);
		}

		public TerminalNode RAKHDO() {
			return getToken(CodejiParser.RAKHDO, 0);
		}

		public PrintValueContext printValue() {
			return getRuleContext(PrintValueContext.class, 0);
		}

		public TerminalNode THIKHAI() {
			return getToken(CodejiParser.THIKHAI, 0);
		}

		public VarDeclarationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_varDeclarationStatement;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof CodejiParserListener)
				((CodejiParserListener) listener).enterVarDeclarationStatement(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof CodejiParserListener)
				((CodejiParserListener) listener).exitVarDeclarationStatement(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof CodejiParserVisitor)
				return ((CodejiParserVisitor<? extends T>) visitor).visitVarDeclarationStatement(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final VarDeclarationStatementContext varDeclarationStatement() throws RecognitionException {
		VarDeclarationStatementContext _localctx = new VarDeclarationStatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_varDeclarationStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(55);
				match(PATAHAI);
				setState(56);
				match(ID);
				setState(57);
				match(RAKHDO);
				setState(58);
				printValue();
				setState(59);
				match(THIKHAI);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentStatementContext extends ParserRuleContext {
		public TerminalNode ID() {
			return getToken(CodejiParser.ID, 0);
		}

		public TerminalNode RAKHDO() {
			return getToken(CodejiParser.RAKHDO, 0);
		}

		public PrintValueContext printValue() {
			return getRuleContext(PrintValueContext.class, 0);
		}

		public TerminalNode THIKHAI() {
			return getToken(CodejiParser.THIKHAI, 0);
		}

		public AssignmentStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_assignmentStatement;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof CodejiParserListener)
				((CodejiParserListener) listener).enterAssignmentStatement(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof CodejiParserListener)
				((CodejiParserListener) listener).exitAssignmentStatement(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof CodejiParserVisitor)
				return ((CodejiParserVisitor<? extends T>) visitor).visitAssignmentStatement(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final AssignmentStatementContext assignmentStatement() throws RecognitionException {
		AssignmentStatementContext _localctx = new AssignmentStatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_assignmentStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(61);
				match(ID);
				setState(62);
				match(RAKHDO);
				setState(63);
				printValue();
				setState(64);
				match(THIKHAI);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrintStatementContext extends ParserRuleContext {
		public TerminalNode BOLNA() {
			return getToken(CodejiParser.BOLNA, 0);
		}

		public PrintArgumentsContext printArguments() {
			return getRuleContext(PrintArgumentsContext.class, 0);
		}

		public TerminalNode THIKHAI() {
			return getToken(CodejiParser.THIKHAI, 0);
		}

		public PrintStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_printStatement;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof CodejiParserListener)
				((CodejiParserListener) listener).enterPrintStatement(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof CodejiParserListener)
				((CodejiParserListener) listener).exitPrintStatement(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof CodejiParserVisitor)
				return ((CodejiParserVisitor<? extends T>) visitor).visitPrintStatement(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final PrintStatementContext printStatement() throws RecognitionException {
		PrintStatementContext _localctx = new PrintStatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_printStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(66);
				match(BOLNA);
				setState(67);
				printArguments();
				setState(68);
				match(THIKHAI);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrintLineStatementContext extends ParserRuleContext {
		public TerminalNode LIKHNA() {
			return getToken(CodejiParser.LIKHNA, 0);
		}

		public PrintArgumentsContext printArguments() {
			return getRuleContext(PrintArgumentsContext.class, 0);
		}

		public TerminalNode THIKHAI() {
			return getToken(CodejiParser.THIKHAI, 0);
		}

		public PrintLineStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_printLineStatement;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof CodejiParserListener)
				((CodejiParserListener) listener).enterPrintLineStatement(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof CodejiParserListener)
				((CodejiParserListener) listener).exitPrintLineStatement(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof CodejiParserVisitor)
				return ((CodejiParserVisitor<? extends T>) visitor).visitPrintLineStatement(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final PrintLineStatementContext printLineStatement() throws RecognitionException {
		PrintLineStatementContext _localctx = new PrintLineStatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_printLineStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(70);
				match(LIKHNA);
				setState(71);
				printArguments();
				setState(72);
				match(THIKHAI);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PadhleStatementContext extends ParserRuleContext {
		public TerminalNode PADHLE() {
			return getToken(CodejiParser.PADHLE, 0);
		}

		public TerminalNode ID() {
			return getToken(CodejiParser.ID, 0);
		}

		public TerminalNode THIKHAI() {
			return getToken(CodejiParser.THIKHAI, 0);
		}

		public PadhleStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_padhleStatement;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof CodejiParserListener)
				((CodejiParserListener) listener).enterPadhleStatement(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof CodejiParserListener)
				((CodejiParserListener) listener).exitPadhleStatement(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof CodejiParserVisitor)
				return ((CodejiParserVisitor<? extends T>) visitor).visitPadhleStatement(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final PadhleStatementContext padhleStatement() throws RecognitionException {
		PadhleStatementContext _localctx = new PadhleStatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_padhleStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(74);
				match(PADHLE);
				setState(75);
				match(ID);
				setState(76);
				match(THIKHAI);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IfStatementContext extends ParserRuleContext {
		public TerminalNode AGAR() {
			return getToken(CodejiParser.AGAR, 0);
		}

		public List<TerminalNode> LPAREN() {
			return getTokens(CodejiParser.LPAREN);
		}

		public TerminalNode LPAREN(int i) {
			return getToken(CodejiParser.LPAREN, i);
		}

		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}

		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class, i);
		}

		public List<TerminalNode> RPAREN() {
			return getTokens(CodejiParser.RPAREN);
		}

		public TerminalNode RPAREN(int i) {
			return getToken(CodejiParser.RPAREN, i);
		}

		public List<StatementBlockContext> statementBlock() {
			return getRuleContexts(StatementBlockContext.class);
		}

		public StatementBlockContext statementBlock(int i) {
			return getRuleContext(StatementBlockContext.class, i);
		}

		public TerminalNode KHATM() {
			return getToken(CodejiParser.KHATM, 0);
		}

		public List<TerminalNode> NAHI_AGAR() {
			return getTokens(CodejiParser.NAHI_AGAR);
		}

		public TerminalNode NAHI_AGAR(int i) {
			return getToken(CodejiParser.NAHI_AGAR, i);
		}

		public TerminalNode NAHI_TO() {
			return getToken(CodejiParser.NAHI_TO, 0);
		}

		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_ifStatement;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof CodejiParserListener)
				((CodejiParserListener) listener).enterIfStatement(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof CodejiParserListener)
				((CodejiParserListener) listener).exitIfStatement(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof CodejiParserVisitor)
				return ((CodejiParserVisitor<? extends T>) visitor).visitIfStatement(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(78);
				match(AGAR);
				setState(79);
				match(LPAREN);
				setState(80);
				condition();
				setState(81);
				match(RPAREN);
				setState(82);
				statementBlock();
				setState(91);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == NAHI_AGAR) {
					{
						{
							setState(83);
							match(NAHI_AGAR);
							setState(84);
							match(LPAREN);
							setState(85);
							condition();
							setState(86);
							match(RPAREN);
							setState(87);
							statementBlock();
						}
					}
					setState(93);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(96);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la == NAHI_TO) {
					{
						setState(94);
						match(NAHI_TO);
						setState(95);
						statementBlock();
					}
				}

				setState(98);
				match(KHATM);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WhileStatementContext extends ParserRuleContext {
		public TerminalNode JABTAK() {
			return getToken(CodejiParser.JABTAK, 0);
		}

		public TerminalNode LPAREN() {
			return getToken(CodejiParser.LPAREN, 0);
		}

		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class, 0);
		}

		public TerminalNode RPAREN() {
			return getToken(CodejiParser.RPAREN, 0);
		}

		public StatementBlockContext statementBlock() {
			return getRuleContext(StatementBlockContext.class, 0);
		}

		public TerminalNode KHATM() {
			return getToken(CodejiParser.KHATM, 0);
		}

		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_whileStatement;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof CodejiParserListener)
				((CodejiParserListener) listener).enterWhileStatement(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof CodejiParserListener)
				((CodejiParserListener) listener).exitWhileStatement(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof CodejiParserVisitor)
				return ((CodejiParserVisitor<? extends T>) visitor).visitWhileStatement(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(100);
				match(JABTAK);
				setState(101);
				match(LPAREN);
				setState(102);
				condition();
				setState(103);
				match(RPAREN);
				setState(104);
				statementBlock();
				setState(105);
				match(KHATM);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementBlockContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}

		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class, i);
		}

		public StatementBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_statementBlock;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof CodejiParserListener)
				((CodejiParserListener) listener).enterStatementBlock(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof CodejiParserListener)
				((CodejiParserListener) listener).exitStatementBlock(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof CodejiParserVisitor)
				return ((CodejiParserVisitor<? extends T>) visitor).visitStatementBlock(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final StatementBlockContext statementBlock() throws RecognitionException {
		StatementBlockContext _localctx = new StatementBlockContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_statementBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(108);
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
						{
							setState(107);
							statement();
						}
					}
					setState(110);
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4294984790L) != 0));
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConditionContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}

		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class, i);
		}

		public ComparatorContext comparator() {
			return getRuleContext(ComparatorContext.class, 0);
		}

		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_condition;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof CodejiParserListener)
				((CodejiParserListener) listener).enterCondition(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof CodejiParserListener)
				((CodejiParserListener) listener).exitCondition(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof CodejiParserVisitor)
				return ((CodejiParserVisitor<? extends T>) visitor).visitCondition(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(112);
				expression();
				setState(113);
				comparator();
				setState(114);
				expression();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComparatorContext extends ParserRuleContext {
		public TerminalNode BADA() {
			return getToken(CodejiParser.BADA, 0);
		}

		public TerminalNode CHHOTA() {
			return getToken(CodejiParser.CHHOTA, 0);
		}

		public TerminalNode BARABAR() {
			return getToken(CodejiParser.BARABAR, 0);
		}

		public TerminalNode BADA_YA_BARAABAR() {
			return getToken(CodejiParser.BADA_YA_BARAABAR, 0);
		}

		public TerminalNode CHHOTA_YA_BARAABAR() {
			return getToken(CodejiParser.CHHOTA_YA_BARAABAR, 0);
		}

		public TerminalNode NAHI_BARABAR() {
			return getToken(CodejiParser.NAHI_BARABAR, 0);
		}

		public ComparatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_comparator;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof CodejiParserListener)
				((CodejiParserListener) listener).enterComparator(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof CodejiParserListener)
				((CodejiParserListener) listener).exitComparator(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof CodejiParserVisitor)
				return ((CodejiParserVisitor<? extends T>) visitor).visitComparator(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final ComparatorContext comparator() throws RecognitionException {
		ComparatorContext _localctx = new ComparatorContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_comparator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(116);
				_la = _input.LA(1);
				if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & 132120576L) != 0))) {
					_errHandler.recoverInline(this);
				} else {
					if (_input.LA(1) == Token.EOF)
						matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrintArgumentsContext extends ParserRuleContext {
		public List<PrintPartContext> printPart() {
			return getRuleContexts(PrintPartContext.class);
		}

		public PrintPartContext printPart(int i) {
			return getRuleContext(PrintPartContext.class, i);
		}

		public List<TerminalNode> COMMA() {
			return getTokens(CodejiParser.COMMA);
		}

		public TerminalNode COMMA(int i) {
			return getToken(CodejiParser.COMMA, i);
		}

		public PrintArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_printArguments;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof CodejiParserListener)
				((CodejiParserListener) listener).enterPrintArguments(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof CodejiParserListener)
				((CodejiParserListener) listener).exitPrintArguments(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof CodejiParserVisitor)
				return ((CodejiParserVisitor<? extends T>) visitor).visitPrintArguments(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final PrintArgumentsContext printArguments() throws RecognitionException {
		PrintArgumentsContext _localctx = new PrintArgumentsContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_printArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(118);
				printPart();
				setState(123);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == COMMA) {
					{
						{
							setState(119);
							match(COMMA);
							setState(120);
							printPart();
						}
					}
					setState(125);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrintPartContext extends ParserRuleContext {
		public PrintValueContext printValue() {
			return getRuleContext(PrintValueContext.class, 0);
		}

		public TerminalNode NAYILINE() {
			return getToken(CodejiParser.NAYILINE, 0);
		}

		public PrintPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_printPart;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof CodejiParserListener)
				((CodejiParserListener) listener).enterPrintPart(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof CodejiParserListener)
				((CodejiParserListener) listener).exitPrintPart(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof CodejiParserVisitor)
				return ((CodejiParserVisitor<? extends T>) visitor).visitPrintPart(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final PrintPartContext printPart() throws RecognitionException {
		PrintPartContext _localctx = new PrintPartContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_printPart);
		try {
			setState(128);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case SAHIME:
				case KUCHNAHI:
				case LPAREN:
				case STRING:
				case NUMBER:
				case ID:
					enterOuterAlt(_localctx, 1); {
					setState(126);
					printValue();
				}
					break;
				case NAYILINE:
					enterOuterAlt(_localctx, 2); {
					setState(127);
					match(NAYILINE);
				}
					break;
				default:
					throw new NoViableAltException(this);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrintValueContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class, 0);
		}

		public TerminalNode STRING() {
			return getToken(CodejiParser.STRING, 0);
		}

		public TerminalNode SAHIME() {
			return getToken(CodejiParser.SAHIME, 0);
		}

		public TerminalNode KUCHNAHI() {
			return getToken(CodejiParser.KUCHNAHI, 0);
		}

		public PrintValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_printValue;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof CodejiParserListener)
				((CodejiParserListener) listener).enterPrintValue(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof CodejiParserListener)
				((CodejiParserListener) listener).exitPrintValue(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof CodejiParserVisitor)
				return ((CodejiParserVisitor<? extends T>) visitor).visitPrintValue(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final PrintValueContext printValue() throws RecognitionException {
		PrintValueContext _localctx = new PrintValueContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_printValue);
		try {
			setState(134);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case LPAREN:
				case NUMBER:
				case ID:
					enterOuterAlt(_localctx, 1); {
					setState(130);
					expression();
				}
					break;
				case STRING:
					enterOuterAlt(_localctx, 2); {
					setState(131);
					match(STRING);
				}
					break;
				case SAHIME:
					enterOuterAlt(_localctx, 3); {
					setState(132);
					match(SAHIME);
				}
					break;
				case KUCHNAHI:
					enterOuterAlt(_localctx, 4); {
					setState(133);
					match(KUCHNAHI);
				}
					break;
				default:
					throw new NoViableAltException(this);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}

		public TermContext term(int i) {
			return getRuleContext(TermContext.class, i);
		}

		public List<TerminalNode> JODWA() {
			return getTokens(CodejiParser.JODWA);
		}

		public TerminalNode JODWA(int i) {
			return getToken(CodejiParser.JODWA, i);
		}

		public List<TerminalNode> GHATAWA() {
			return getTokens(CodejiParser.GHATAWA);
		}

		public TerminalNode GHATAWA(int i) {
			return getToken(CodejiParser.GHATAWA, i);
		}

		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_expression;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof CodejiParserListener)
				((CodejiParserListener) listener).enterExpression(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof CodejiParserListener)
				((CodejiParserListener) listener).exitExpression(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof CodejiParserVisitor)
				return ((CodejiParserVisitor<? extends T>) visitor).visitExpression(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(136);
				term();
				setState(141);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == JODWA || _la == GHATAWA) {
					{
						{
							setState(137);
							_la = _input.LA(1);
							if (!(_la == JODWA || _la == GHATAWA)) {
								_errHandler.recoverInline(this);
							} else {
								if (_input.LA(1) == Token.EOF)
									matchedEOF = true;
								_errHandler.reportMatch(this);
								consume();
							}
							setState(138);
							term();
						}
					}
					setState(143);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TermContext extends ParserRuleContext {
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}

		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class, i);
		}

		public List<TerminalNode> GUNAK() {
			return getTokens(CodejiParser.GUNAK);
		}

		public TerminalNode GUNAK(int i) {
			return getToken(CodejiParser.GUNAK, i);
		}

		public List<TerminalNode> BATAAK() {
			return getTokens(CodejiParser.BATAAK);
		}

		public TerminalNode BATAAK(int i) {
			return getToken(CodejiParser.BATAAK, i);
		}

		public List<TerminalNode> REMAINDERWA() {
			return getTokens(CodejiParser.REMAINDERWA);
		}

		public TerminalNode REMAINDERWA(int i) {
			return getToken(CodejiParser.REMAINDERWA, i);
		}

		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_term;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof CodejiParserListener)
				((CodejiParserListener) listener).enterTerm(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof CodejiParserListener)
				((CodejiParserListener) listener).exitTerm(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof CodejiParserVisitor)
				return ((CodejiParserVisitor<? extends T>) visitor).visitTerm(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(144);
				factor();
				setState(149);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 917504L) != 0)) {
					{
						{
							setState(145);
							_la = _input.LA(1);
							if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & 917504L) != 0))) {
								_errHandler.recoverInline(this);
							} else {
								if (_input.LA(1) == Token.EOF)
									matchedEOF = true;
								_errHandler.reportMatch(this);
								consume();
							}
							setState(146);
							factor();
						}
					}
					setState(151);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FactorContext extends ParserRuleContext {
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class, 0);
		}

		public TerminalNode POWERWA() {
			return getToken(CodejiParser.POWERWA, 0);
		}

		public FactorContext factor() {
			return getRuleContext(FactorContext.class, 0);
		}

		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_factor;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof CodejiParserListener)
				((CodejiParserListener) listener).enterFactor(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof CodejiParserListener)
				((CodejiParserListener) listener).exitFactor(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof CodejiParserVisitor)
				return ((CodejiParserVisitor<? extends T>) visitor).visitFactor(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_factor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(152);
				primary();
				setState(155);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la == POWERWA) {
					{
						setState(153);
						match(POWERWA);
						setState(154);
						factor();
					}
				}

			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryContext extends ParserRuleContext {
		public TerminalNode NUMBER() {
			return getToken(CodejiParser.NUMBER, 0);
		}

		public TerminalNode ID() {
			return getToken(CodejiParser.ID, 0);
		}

		public TerminalNode LPAREN() {
			return getToken(CodejiParser.LPAREN, 0);
		}

		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class, 0);
		}

		public TerminalNode RPAREN() {
			return getToken(CodejiParser.RPAREN, 0);
		}

		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_primary;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof CodejiParserListener)
				((CodejiParserListener) listener).enterPrimary(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof CodejiParserListener)
				((CodejiParserListener) listener).exitPrimary(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof CodejiParserVisitor)
				return ((CodejiParserVisitor<? extends T>) visitor).visitPrimary(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_primary);
		try {
			setState(163);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case NUMBER:
					enterOuterAlt(_localctx, 1); {
					setState(157);
					match(NUMBER);
				}
					break;
				case ID:
					enterOuterAlt(_localctx, 2); {
					setState(158);
					match(ID);
				}
					break;
				case LPAREN:
					enterOuterAlt(_localctx, 3); {
					setState(159);
					match(LPAREN);
					setState(160);
					expression();
					setState(161);
					match(RPAREN);
				}
					break;
				default:
					throw new NoViableAltException(this);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN = "\u0004\u0001#\u00a6\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"
			+
			"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002" +
			"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002" +
			"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002" +
			"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f" +
			"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012" +
			"\u0001\u0000\u0005\u0000(\b\u0000\n\u0000\f\u0000+\t\u0000\u0001\u0000" +
			"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001" +
			"\u0001\u0001\u0001\u0001\u0003\u00016\b\u0001\u0001\u0002\u0001\u0002" +
			"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003" +
			"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004" +
			"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006" +
			"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007" +
			"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007" +
			"\u0001\u0007\u0001\u0007\u0005\u0007Z\b\u0007\n\u0007\f\u0007]\t\u0007" +
			"\u0001\u0007\u0001\u0007\u0003\u0007a\b\u0007\u0001\u0007\u0001\u0007" +
			"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0004" +
			"\tm\b\t\u000b\t\f\tn\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001" +
			"\u000b\u0001\f\u0001\f\u0001\f\u0005\fz\b\f\n\f\f\f}\t\f\u0001\r\u0001" +
			"\r\u0003\r\u0081\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003" +
			"\u000e\u0087\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u008c" +
			"\b\u000f\n\u000f\f\u000f\u008f\t\u000f\u0001\u0010\u0001\u0010\u0001\u0010" +
			"\u0005\u0010\u0094\b\u0010\n\u0010\f\u0010\u0097\t\u0010\u0001\u0011\u0001" +
			"\u0011\u0001\u0011\u0003\u0011\u009c\b\u0011\u0001\u0012\u0001\u0012\u0001" +
			"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u00a4\b\u0012\u0001" +
			"\u0012\u0000\u0000\u0013\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012" +
			"\u0014\u0016\u0018\u001a\u001c\u001e \"$\u0000\u0003\u0001\u0000\u0015" +
			"\u001a\u0001\u0000\u000f\u0010\u0001\u0000\u0011\u0013\u00a6\u0000)\u0001" +
			"\u0000\u0000\u0000\u00025\u0001\u0000\u0000\u0000\u00047\u0001\u0000\u0000" +
			"\u0000\u0006=\u0001\u0000\u0000\u0000\bB\u0001\u0000\u0000\u0000\nF\u0001" +
			"\u0000\u0000\u0000\fJ\u0001\u0000\u0000\u0000\u000eN\u0001\u0000\u0000" +
			"\u0000\u0010d\u0001\u0000\u0000\u0000\u0012l\u0001\u0000\u0000\u0000\u0014" +
			"p\u0001\u0000\u0000\u0000\u0016t\u0001\u0000\u0000\u0000\u0018v\u0001" +
			"\u0000\u0000\u0000\u001a\u0080\u0001\u0000\u0000\u0000\u001c\u0086\u0001" +
			"\u0000\u0000\u0000\u001e\u0088\u0001\u0000\u0000\u0000 \u0090\u0001\u0000" +
			"\u0000\u0000\"\u0098\u0001\u0000\u0000\u0000$\u00a3\u0001\u0000\u0000" +
			"\u0000&(\u0003\u0002\u0001\u0000\'&\u0001\u0000\u0000\u0000(+\u0001\u0000" +
			"\u0000\u0000)\'\u0001\u0000\u0000\u0000)*\u0001\u0000\u0000\u0000*,\u0001" +
			"\u0000\u0000\u0000+)\u0001\u0000\u0000\u0000,-\u0005\u0000\u0000\u0001" +
			"-\u0001\u0001\u0000\u0000\u0000.6\u0003\u0004\u0002\u0000/6\u0003\u0006" +
			"\u0003\u000006\u0003\b\u0004\u000016\u0003\n\u0005\u000026\u0003\f\u0006" +
			"\u000036\u0003\u000e\u0007\u000046\u0003\u0010\b\u00005.\u0001\u0000\u0000" +
			"\u00005/\u0001\u0000\u0000\u000050\u0001\u0000\u0000\u000051\u0001\u0000" +
			"\u0000\u000052\u0001\u0000\u0000\u000053\u0001\u0000\u0000\u000054\u0001" +
			"\u0000\u0000\u00006\u0003\u0001\u0000\u0000\u000078\u0005\u0004\u0000" +
			"\u000089\u0005 \u0000\u00009:\u0005\u0005\u0000\u0000:;\u0003\u001c\u000e" +
			"\u0000;<\u0005\u0007\u0000\u0000<\u0005\u0001\u0000\u0000\u0000=>\u0005" +
			" \u0000\u0000>?\u0005\u0005\u0000\u0000?@\u0003\u001c\u000e\u0000@A\u0005" +
			"\u0007\u0000\u0000A\u0007\u0001\u0000\u0000\u0000BC\u0005\u0006\u0000" +
			"\u0000CD\u0003\u0018\f\u0000DE\u0005\u0007\u0000\u0000E\t\u0001\u0000" +
			"\u0000\u0000FG\u0005\u0002\u0000\u0000GH\u0003\u0018\f\u0000HI\u0005\u0007" +
			"\u0000\u0000I\u000b\u0001\u0000\u0000\u0000JK\u0005\u0001\u0000\u0000" +
			"KL\u0005 \u0000\u0000LM\u0005\u0007\u0000\u0000M\r\u0001\u0000\u0000\u0000" +
			"NO\u0005\n\u0000\u0000OP\u0005\u001b\u0000\u0000PQ\u0003\u0014\n\u0000" +
			"QR\u0005\u001c\u0000\u0000R[\u0003\u0012\t\u0000ST\u0005\u000b\u0000\u0000" +
			"TU\u0005\u001b\u0000\u0000UV\u0003\u0014\n\u0000VW\u0005\u001c\u0000\u0000" +
			"WX\u0003\u0012\t\u0000XZ\u0001\u0000\u0000\u0000YS\u0001\u0000\u0000\u0000" +
			"Z]\u0001\u0000\u0000\u0000[Y\u0001\u0000\u0000\u0000[\\\u0001\u0000\u0000" +
			"\u0000\\`\u0001\u0000\u0000\u0000][\u0001\u0000\u0000\u0000^_\u0005\f" +
			"\u0000\u0000_a\u0003\u0012\t\u0000`^\u0001\u0000\u0000\u0000`a\u0001\u0000" +
			"\u0000\u0000ab\u0001\u0000\u0000\u0000bc\u0005\r\u0000\u0000c\u000f\u0001" +
			"\u0000\u0000\u0000de\u0005\u000e\u0000\u0000ef\u0005\u001b\u0000\u0000" +
			"fg\u0003\u0014\n\u0000gh\u0005\u001c\u0000\u0000hi\u0003\u0012\t\u0000" +
			"ij\u0005\r\u0000\u0000j\u0011\u0001\u0000\u0000\u0000km\u0003\u0002\u0001" +
			"\u0000lk\u0001\u0000\u0000\u0000mn\u0001\u0000\u0000\u0000nl\u0001\u0000" +
			"\u0000\u0000no\u0001\u0000\u0000\u0000o\u0013\u0001\u0000\u0000\u0000" +
			"pq\u0003\u001e\u000f\u0000qr\u0003\u0016\u000b\u0000rs\u0003\u001e\u000f" +
			"\u0000s\u0015\u0001\u0000\u0000\u0000tu\u0007\u0000\u0000\u0000u\u0017" +
			"\u0001\u0000\u0000\u0000v{\u0003\u001a\r\u0000wx\u0005\u001d\u0000\u0000" +
			"xz\u0003\u001a\r\u0000yw\u0001\u0000\u0000\u0000z}\u0001\u0000\u0000\u0000" +
			"{y\u0001\u0000\u0000\u0000{|\u0001\u0000\u0000\u0000|\u0019\u0001\u0000" +
			"\u0000\u0000}{\u0001\u0000\u0000\u0000~\u0081\u0003\u001c\u000e\u0000" +
			"\u007f\u0081\u0005\u0003\u0000\u0000\u0080~\u0001\u0000\u0000\u0000\u0080" +
			"\u007f\u0001\u0000\u0000\u0000\u0081\u001b\u0001\u0000\u0000\u0000\u0082" +
			"\u0087\u0003\u001e\u000f\u0000\u0083\u0087\u0005\u001e\u0000\u0000\u0084" +
			"\u0087\u0005\b\u0000\u0000\u0085\u0087\u0005\t\u0000\u0000\u0086\u0082" +
			"\u0001\u0000\u0000\u0000\u0086\u0083\u0001\u0000\u0000\u0000\u0086\u0084" +
			"\u0001\u0000\u0000\u0000\u0086\u0085\u0001\u0000\u0000\u0000\u0087\u001d" +
			"\u0001\u0000\u0000\u0000\u0088\u008d\u0003 \u0010\u0000\u0089\u008a\u0007" +
			"\u0001\u0000\u0000\u008a\u008c\u0003 \u0010\u0000\u008b\u0089\u0001\u0000" +
			"\u0000\u0000\u008c\u008f\u0001\u0000\u0000\u0000\u008d\u008b\u0001\u0000" +
			"\u0000\u0000\u008d\u008e\u0001\u0000\u0000\u0000\u008e\u001f\u0001\u0000" +
			"\u0000\u0000\u008f\u008d\u0001\u0000\u0000\u0000\u0090\u0095\u0003\"\u0011" +
			"\u0000\u0091\u0092\u0007\u0002\u0000\u0000\u0092\u0094\u0003\"\u0011\u0000" +
			"\u0093\u0091\u0001\u0000\u0000\u0000\u0094\u0097\u0001\u0000\u0000\u0000" +
			"\u0095\u0093\u0001\u0000\u0000\u0000\u0095\u0096\u0001\u0000\u0000\u0000" +
			"\u0096!\u0001\u0000\u0000\u0000\u0097\u0095\u0001\u0000\u0000\u0000\u0098" +
			"\u009b\u0003$\u0012\u0000\u0099\u009a\u0005\u0014\u0000\u0000\u009a\u009c" +
			"\u0003\"\u0011\u0000\u009b\u0099\u0001\u0000\u0000\u0000\u009b\u009c\u0001" +
			"\u0000\u0000\u0000\u009c#\u0001\u0000\u0000\u0000\u009d\u00a4\u0005\u001f" +
			"\u0000\u0000\u009e\u00a4\u0005 \u0000\u0000\u009f\u00a0\u0005\u001b\u0000" +
			"\u0000\u00a0\u00a1\u0003\u001e\u000f\u0000\u00a1\u00a2\u0005\u001c\u0000" +
			"\u0000\u00a2\u00a4\u0001\u0000\u0000\u0000\u00a3\u009d\u0001\u0000\u0000" +
			"\u0000\u00a3\u009e\u0001\u0000\u0000\u0000\u00a3\u009f\u0001\u0000\u0000" +
			"\u0000\u00a4%\u0001\u0000\u0000\u0000\f)5[`n{\u0080\u0086\u008d\u0095" +
			"\u009b\u00a3";
	public static final ATN _ATN = new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}