// Generated from /Users/maxtuno/NetBeansProjects/Calculator/src/calculator/Calculator.g4 by ANTLR 4.2.2
package calculator;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CalculatorLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		MUL=1, DIV=2, ADD=3, SUB=4, EQ=5, ID=6, INT=7, LEFT=8, RIGTH=9, NEWLINE=10, 
		WS=11;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'*'", "'/'", "'+'", "'-'", "'='", "ID", "INT", "'('", "')'", "NEWLINE", 
		"WS"
	};
	public static final String[] ruleNames = {
		"MUL", "DIV", "ADD", "SUB", "EQ", "ID", "INT", "LEFT", "RIGTH", "NEWLINE", 
		"WS"
	};


	public CalculatorLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Calculator.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\r=\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\6\7%\n\7\r\7\16"+
		"\7&\3\b\6\b*\n\b\r\b\16\b+\3\t\3\t\3\n\3\n\3\13\5\13\63\n\13\3\13\3\13"+
		"\3\f\6\f8\n\f\r\f\16\f9\3\f\3\f\2\2\r\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21"+
		"\n\23\13\25\f\27\r\3\2\5\4\2C\\c|\3\2\62;\4\2\13\13\"\"@\2\3\3\2\2\2\2"+
		"\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2"+
		"\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\3\31\3\2\2\2\5"+
		"\33\3\2\2\2\7\35\3\2\2\2\t\37\3\2\2\2\13!\3\2\2\2\r$\3\2\2\2\17)\3\2\2"+
		"\2\21-\3\2\2\2\23/\3\2\2\2\25\62\3\2\2\2\27\67\3\2\2\2\31\32\7,\2\2\32"+
		"\4\3\2\2\2\33\34\7\61\2\2\34\6\3\2\2\2\35\36\7-\2\2\36\b\3\2\2\2\37 \7"+
		"/\2\2 \n\3\2\2\2!\"\7?\2\2\"\f\3\2\2\2#%\t\2\2\2$#\3\2\2\2%&\3\2\2\2&"+
		"$\3\2\2\2&\'\3\2\2\2\'\16\3\2\2\2(*\t\3\2\2)(\3\2\2\2*+\3\2\2\2+)\3\2"+
		"\2\2+,\3\2\2\2,\20\3\2\2\2-.\7*\2\2.\22\3\2\2\2/\60\7+\2\2\60\24\3\2\2"+
		"\2\61\63\7\17\2\2\62\61\3\2\2\2\62\63\3\2\2\2\63\64\3\2\2\2\64\65\7\f"+
		"\2\2\65\26\3\2\2\2\668\t\4\2\2\67\66\3\2\2\289\3\2\2\29\67\3\2\2\29:\3"+
		"\2\2\2:;\3\2\2\2;<\b\f\2\2<\30\3\2\2\2\7\2&+\629\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}