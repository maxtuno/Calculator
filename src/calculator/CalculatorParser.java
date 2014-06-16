// Generated from /Users/maxtuno/NetBeansProjects/Calculator/src/calculator/Calculator.g4 by ANTLR 4.2.2
package calculator;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CalculatorParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		MUL=1, DIV=2, ADD=3, SUB=4, EQ=5, ID=6, INT=7, LEFT=8, RIGTH=9, NEWLINE=10, 
		WS=11;
	public static final String[] tokenNames = {
		"<INVALID>", "'*'", "'/'", "'+'", "'-'", "'='", "ID", "INT", "'('", "')'", 
		"NEWLINE", "WS"
	};
	public static final int
		RULE_prog = 0, RULE_stat = 1, RULE_expr = 2;
	public static final String[] ruleNames = {
		"prog", "stat", "expr"
	};

	@Override
	public String getGrammarFileName() { return "Calculator.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CalculatorParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor ) return ((CalculatorVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(7); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(6); stat();
				}
				}
				setState(9); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << INT) | (1L << LEFT) | (1L << NEWLINE))) != 0) );
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

	public static class StatContext extends ParserRuleContext {
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
	 
		public StatContext() { }
		public void copyFrom(StatContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AssignExpressionContext extends StatContext {
		public TerminalNode ID() { return getToken(CalculatorParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(CalculatorParser.NEWLINE, 0); }
		public TerminalNode EQ() { return getToken(CalculatorParser.EQ, 0); }
		public AssignExpressionContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor ) return ((CalculatorVisitor<? extends T>)visitor).visitAssignExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrintExpressionContext extends StatContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(CalculatorParser.NEWLINE, 0); }
		public PrintExpressionContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor ) return ((CalculatorVisitor<? extends T>)visitor).visitPrintExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BlankExpressionContext extends StatContext {
		public TerminalNode NEWLINE() { return getToken(CalculatorParser.NEWLINE, 0); }
		public BlankExpressionContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor ) return ((CalculatorVisitor<? extends T>)visitor).visitBlankExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stat);
		try {
			setState(20);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new PrintExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(11); expr(0);
				setState(12); match(NEWLINE);
				}
				break;

			case 2:
				_localctx = new AssignExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(14); match(ID);
				setState(15); match(EQ);
				setState(16); expr(0);
				setState(17); match(NEWLINE);
				}
				break;

			case 3:
				_localctx = new BlankExpressionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(19); match(NEWLINE);
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
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AddExpressionContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ADD() { return getToken(CalculatorParser.ADD, 0); }
		public AddExpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor ) return ((CalculatorVisitor<? extends T>)visitor).visitAddExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IDExpressionContext extends ExprContext {
		public TerminalNode ID() { return getToken(CalculatorParser.ID, 0); }
		public IDExpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor ) return ((CalculatorVisitor<? extends T>)visitor).visitIDExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntExpressionContext extends ExprContext {
		public TerminalNode INT() { return getToken(CalculatorParser.INT, 0); }
		public IntExpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor ) return ((CalculatorVisitor<? extends T>)visitor).visitIntExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParentizedExpressionContext extends ExprContext {
		public TerminalNode LEFT() { return getToken(CalculatorParser.LEFT, 0); }
		public TerminalNode RIGTH() { return getToken(CalculatorParser.RIGTH, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParentizedExpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor ) return ((CalculatorVisitor<? extends T>)visitor).visitParentizedExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DivExpressionContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode DIV() { return getToken(CalculatorParser.DIV, 0); }
		public DivExpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor ) return ((CalculatorVisitor<? extends T>)visitor).visitDivExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubExpressionContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode SUB() { return getToken(CalculatorParser.SUB, 0); }
		public SubExpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor ) return ((CalculatorVisitor<? extends T>)visitor).visitSubExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MulExpressionContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MUL() { return getToken(CalculatorParser.MUL, 0); }
		public MulExpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor ) return ((CalculatorVisitor<? extends T>)visitor).visitMulExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			switch (_input.LA(1)) {
			case INT:
				{
				_localctx = new IntExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(23); match(INT);
				}
				break;
			case ID:
				{
				_localctx = new IDExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(24); match(ID);
				}
				break;
			case LEFT:
				{
				_localctx = new ParentizedExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(25); match(LEFT);
				setState(26); expr(0);
				setState(27); match(RIGTH);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(45);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(43);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new MulExpressionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(31);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(32); match(MUL);
						setState(33); expr(8);
						}
						break;

					case 2:
						{
						_localctx = new DivExpressionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(34);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(35); match(DIV);
						setState(36); expr(7);
						}
						break;

					case 3:
						{
						_localctx = new AddExpressionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(37);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(38); match(ADD);
						setState(39); expr(6);
						}
						break;

					case 4:
						{
						_localctx = new SubExpressionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(40);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(41); match(SUB);
						setState(42); expr(5);
						}
						break;
					}
					} 
				}
				setState(47);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2: return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 7);

		case 1: return precpred(_ctx, 6);

		case 2: return precpred(_ctx, 5);

		case 3: return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\r\63\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\3\2\6\2\n\n\2\r\2\16\2\13\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\5\3\27\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4 \n\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4.\n\4\f\4\16\4\61\13\4\3\4\2\3\6\5\2"+
		"\4\6\2\28\2\t\3\2\2\2\4\26\3\2\2\2\6\37\3\2\2\2\b\n\5\4\3\2\t\b\3\2\2"+
		"\2\n\13\3\2\2\2\13\t\3\2\2\2\13\f\3\2\2\2\f\3\3\2\2\2\r\16\5\6\4\2\16"+
		"\17\7\f\2\2\17\27\3\2\2\2\20\21\7\b\2\2\21\22\7\7\2\2\22\23\5\6\4\2\23"+
		"\24\7\f\2\2\24\27\3\2\2\2\25\27\7\f\2\2\26\r\3\2\2\2\26\20\3\2\2\2\26"+
		"\25\3\2\2\2\27\5\3\2\2\2\30\31\b\4\1\2\31 \7\t\2\2\32 \7\b\2\2\33\34\7"+
		"\n\2\2\34\35\5\6\4\2\35\36\7\13\2\2\36 \3\2\2\2\37\30\3\2\2\2\37\32\3"+
		"\2\2\2\37\33\3\2\2\2 /\3\2\2\2!\"\f\t\2\2\"#\7\3\2\2#.\5\6\4\n$%\f\b\2"+
		"\2%&\7\4\2\2&.\5\6\4\t\'(\f\7\2\2()\7\5\2\2).\5\6\4\b*+\f\6\2\2+,\7\6"+
		"\2\2,.\5\6\4\7-!\3\2\2\2-$\3\2\2\2-\'\3\2\2\2-*\3\2\2\2.\61\3\2\2\2/-"+
		"\3\2\2\2/\60\3\2\2\2\60\7\3\2\2\2\61/\3\2\2\2\7\13\26\37-/";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}