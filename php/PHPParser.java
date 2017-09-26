// Generated from PHPParser.g4 by ANTLR 4.7
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PHPParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SeaWhitespace=1, HtmlText=2, PHPStart=3, HtmlScriptOpen=4, HtmlStyleOpen=5, 
		HtmlComment=6, HtmlDtd=7, HtmlOpen=8, Shebang=9, Error=10, PHPStartInside=11, 
		HtmlClose=12, HtmlSlashClose=13, HtmlSlash=14, HtmlEquals=15, HtmlStartQuoteString=16, 
		HtmlStartDoubleQuoteString=17, HtmlHex=18, HtmlDecimal=19, HtmlSpace=20, 
		HtmlName=21, ErrorInside=22, PHPStartInsideQuoteString=23, HtmlEndQuoteString=24, 
		HtmlQuoteString=25, ErrorHtmlQuote=26, PHPStartDoubleQuoteString=27, HtmlEndDoubleQuoteString=28, 
		HtmlDoubleQuoteString=29, ErrorHtmlDoubleQuote=30, ScriptText=31, ScriptClose=32, 
		PHPStartInsideScript=33, StyleBody=34, PHPEnd=35, Whitespace=36, MultiLineComment=37, 
		SingleLineComment=38, ShellStyleComment=39, Abstract=40, Array=41, As=42, 
		BinaryCast=43, BoolType=44, BooleanConstant=45, Break=46, Callable=47, 
		Case=48, Catch=49, Class=50, Clone=51, Const=52, Continue=53, Declare=54, 
		Default=55, Do=56, DoubleCast=57, DoubleType=58, Echo=59, Else=60, ElseIf=61, 
		Empty=62, EndDeclare=63, EndFor=64, EndForeach=65, EndIf=66, EndSwitch=67, 
		EndWhile=68, Eval=69, Exit=70, Extends=71, Final=72, Finally=73, FloatCast=74, 
		For=75, Foreach=76, Function=77, Global=78, Goto=79, If=80, Implements=81, 
		Import=82, Include=83, IncludeOnce=84, InstanceOf=85, InsteadOf=86, Int8Cast=87, 
		Int16Cast=88, Int64Type=89, IntType=90, Interface=91, IsSet=92, List=93, 
		LogicalAnd=94, LogicalOr=95, LogicalXor=96, Namespace=97, New=98, Null=99, 
		ObjectType=100, Parent_=101, Partial=102, Print=103, Private=104, Protected=105, 
		Public=106, Require=107, RequireOnce=108, Resource=109, Return=110, Static=111, 
		StringType=112, Switch=113, Throw=114, Trait=115, Try=116, Typeof=117, 
		UintCast=118, UnicodeCast=119, Unset=120, Use=121, Var=122, While=123, 
		Yield=124, Get=125, Set=126, Call=127, CallStatic=128, Constructor=129, 
		Destruct=130, Wakeup=131, Sleep=132, Autoload=133, IsSet__=134, Unset__=135, 
		ToString__=136, Invoke=137, SetState=138, Clone__=139, DebugInfo=140, 
		Namespace__=141, Class__=142, Traic__=143, Function__=144, Method__=145, 
		Line__=146, File__=147, Dir__=148, Lgeneric=149, Rgeneric=150, DoubleArrow=151, 
		Inc=152, Dec=153, IsIdentical=154, IsNoidentical=155, IsEqual=156, IsNotEq=157, 
		IsSmallerOrEqual=158, IsGreaterOrEqual=159, PlusEqual=160, MinusEqual=161, 
		MulEqual=162, Pow=163, PowEqual=164, DivEqual=165, Concaequal=166, ModEqual=167, 
		ShiftLeftEqual=168, ShiftRightEqual=169, AndEqual=170, OrEqual=171, XorEqual=172, 
		BooleanOr=173, BooleanAnd=174, ShiftLeft=175, ShiftRight=176, DoubleColon=177, 
		ObjectOperator=178, NamespaceSeparator=179, Ellipsis=180, Less=181, Greater=182, 
		Ampersand=183, Pipe=184, Bang=185, Caret=186, Plus=187, Minus=188, Asterisk=189, 
		Percent=190, Divide=191, Tilde=192, SuppressWarnings=193, Dollar=194, 
		Dot=195, QuestionMark=196, OpenRoundBracket=197, CloseRoundBracket=198, 
		OpenSquareBracket=199, CloseSquareBracket=200, OpenCurlyBracket=201, CloseCurlyBracket=202, 
		Comma=203, Colon=204, SemiColon=205, Eq=206, Quote=207, BackQuote=208, 
		VarName=209, Label=210, Octal=211, Decimal=212, Real=213, Hex=214, Binary=215, 
		BackQuoteString=216, SingleQuoteString=217, DoubleQuote=218, StartNowDoc=219, 
		StartHereDoc=220, ErrorPhp=221, CurlyDollar=222, StringPart=223, Comment=224, 
		PHPEndSingleLineComment=225, CommentEnd=226, HereDocText=227;
	public static final int
		RULE_htmlDocument = 0, RULE_htmlElementOrPhpBlock = 1, RULE_htmlElements = 2, 
		RULE_htmlElement = 3, RULE_scriptTextPart = 4, RULE_phpBlock = 5, RULE_importStatement = 6, 
		RULE_topStatement = 7, RULE_useDeclaration = 8, RULE_useDeclarationContentList = 9, 
		RULE_useDeclarationContent = 10, RULE_namespaceDeclaration = 11, RULE_namespaceStatement = 12, 
		RULE_functionDeclaration = 13, RULE_classDeclaration = 14, RULE_classEntryType = 15, 
		RULE_interfaceList = 16, RULE_typeParameterListInBrackets = 17, RULE_typeParameterList = 18, 
		RULE_typeParameterWithDefaultsList = 19, RULE_typeParameterDecl = 20, 
		RULE_typeParameterWithDefaultDecl = 21, RULE_genericDynamicArgs = 22, 
		RULE_attributes = 23, RULE_attributesGroup = 24, RULE_attribute = 25, 
		RULE_attributeArgList = 26, RULE_attributeNamedArgList = 27, RULE_attributeNamedArg = 28, 
		RULE_innerStatementList = 29, RULE_innerStatement = 30, RULE_statement = 31, 
		RULE_emptyStatement = 32, RULE_nonEmptyStatement = 33, RULE_blockStatement = 34, 
		RULE_ifStatement = 35, RULE_elseIfStatement = 36, RULE_elseIfColonStatement = 37, 
		RULE_elseStatement = 38, RULE_elseColonStatement = 39, RULE_whileStatement = 40, 
		RULE_doWhileStatement = 41, RULE_forStatement = 42, RULE_forInit = 43, 
		RULE_forUpdate = 44, RULE_switchStatement = 45, RULE_switchBlock = 46, 
		RULE_breakStatement = 47, RULE_continueStatement = 48, RULE_returnStatement = 49, 
		RULE_expressionStatement = 50, RULE_unsetStatement = 51, RULE_foreachStatement = 52, 
		RULE_tryCatchFinally = 53, RULE_catchClause = 54, RULE_finallyStatement = 55, 
		RULE_throwStatement = 56, RULE_gotoStatement = 57, RULE_declareStatement = 58, 
		RULE_inlineHtml = 59, RULE_declareList = 60, RULE_formalParameterList = 61, 
		RULE_formalParameter = 62, RULE_typeHint = 63, RULE_globalStatement = 64, 
		RULE_globalVar = 65, RULE_echoStatement = 66, RULE_staticVariableStatement = 67, 
		RULE_classStatement = 68, RULE_traitAdaptations = 69, RULE_traitAdaptationStatement = 70, 
		RULE_traitPrecedence = 71, RULE_traitAlias = 72, RULE_traitMethodReference = 73, 
		RULE_baseCtorCall = 74, RULE_methodBody = 75, RULE_propertyModifiers = 76, 
		RULE_memberModifiers = 77, RULE_variableInitializer = 78, RULE_identifierInititalizer = 79, 
		RULE_globalConstantDeclaration = 80, RULE_expressionList = 81, RULE_parenthesis = 82, 
		RULE_expression = 83, RULE_newExpr = 84, RULE_assignmentOperator = 85, 
		RULE_yieldExpression = 86, RULE_arrayItemList = 87, RULE_arrayItem = 88, 
		RULE_lambdaFunctionUseVars = 89, RULE_lambdaFunctionUseVar = 90, RULE_qualifiedStaticTypeRef = 91, 
		RULE_typeRef = 92, RULE_indirectTypeRef = 93, RULE_qualifiedNamespaceName = 94, 
		RULE_namespaceNameList = 95, RULE_qualifiedNamespaceNameList = 96, RULE_arguments = 97, 
		RULE_actualArgument = 98, RULE_constantInititalizer = 99, RULE_constantArrayItemList = 100, 
		RULE_constantArrayItem = 101, RULE_constant = 102, RULE_literalConstant = 103, 
		RULE_numericConstant = 104, RULE_classConstant = 105, RULE_stringConstant = 106, 
		RULE_string = 107, RULE_interpolatedStringPart = 108, RULE_chainList = 109, 
		RULE_chain = 110, RULE_memberAccess = 111, RULE_functionCall = 112, RULE_functionCallName = 113, 
		RULE_actualArguments = 114, RULE_chainBase = 115, RULE_keyedFieldName = 116, 
		RULE_keyedSimpleFieldName = 117, RULE_keyedVariable = 118, RULE_squareCurlyExpression = 119, 
		RULE_assignmentList = 120, RULE_assignmentListElement = 121, RULE_modifier = 122, 
		RULE_identifier = 123, RULE_memberModifier = 124, RULE_magicConstant = 125, 
		RULE_magicMethod = 126, RULE_primitiveType = 127, RULE_castOperation = 128;
	public static final String[] ruleNames = {
		"htmlDocument", "htmlElementOrPhpBlock", "htmlElements", "htmlElement", 
		"scriptTextPart", "phpBlock", "importStatement", "topStatement", "useDeclaration", 
		"useDeclarationContentList", "useDeclarationContent", "namespaceDeclaration", 
		"namespaceStatement", "functionDeclaration", "classDeclaration", "classEntryType", 
		"interfaceList", "typeParameterListInBrackets", "typeParameterList", "typeParameterWithDefaultsList", 
		"typeParameterDecl", "typeParameterWithDefaultDecl", "genericDynamicArgs", 
		"attributes", "attributesGroup", "attribute", "attributeArgList", "attributeNamedArgList", 
		"attributeNamedArg", "innerStatementList", "innerStatement", "statement", 
		"emptyStatement", "nonEmptyStatement", "blockStatement", "ifStatement", 
		"elseIfStatement", "elseIfColonStatement", "elseStatement", "elseColonStatement", 
		"whileStatement", "doWhileStatement", "forStatement", "forInit", "forUpdate", 
		"switchStatement", "switchBlock", "breakStatement", "continueStatement", 
		"returnStatement", "expressionStatement", "unsetStatement", "foreachStatement", 
		"tryCatchFinally", "catchClause", "finallyStatement", "throwStatement", 
		"gotoStatement", "declareStatement", "inlineHtml", "declareList", "formalParameterList", 
		"formalParameter", "typeHint", "globalStatement", "globalVar", "echoStatement", 
		"staticVariableStatement", "classStatement", "traitAdaptations", "traitAdaptationStatement", 
		"traitPrecedence", "traitAlias", "traitMethodReference", "baseCtorCall", 
		"methodBody", "propertyModifiers", "memberModifiers", "variableInitializer", 
		"identifierInititalizer", "globalConstantDeclaration", "expressionList", 
		"parenthesis", "expression", "newExpr", "assignmentOperator", "yieldExpression", 
		"arrayItemList", "arrayItem", "lambdaFunctionUseVars", "lambdaFunctionUseVar", 
		"qualifiedStaticTypeRef", "typeRef", "indirectTypeRef", "qualifiedNamespaceName", 
		"namespaceNameList", "qualifiedNamespaceNameList", "arguments", "actualArgument", 
		"constantInititalizer", "constantArrayItemList", "constantArrayItem", 
		"constant", "literalConstant", "numericConstant", "classConstant", "stringConstant", 
		"string", "interpolatedStringPart", "chainList", "chain", "memberAccess", 
		"functionCall", "functionCallName", "actualArguments", "chainBase", "keyedFieldName", 
		"keyedSimpleFieldName", "keyedVariable", "squareCurlyExpression", "assignmentList", 
		"assignmentListElement", "modifier", "identifier", "memberModifier", "magicConstant", 
		"magicMethod", "primitiveType", "castOperation"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, "'/>'", null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, "'abstract'", "'array'", "'as'", "'binary'", null, 
		null, "'break'", "'callable'", "'case'", "'catch'", "'class'", "'clone'", 
		"'const'", "'continue'", "'declare'", "'default'", "'do'", "'real'", "'double'", 
		"'echo'", "'else'", "'elseif'", "'empty'", "'enddeclare'", "'endfor'", 
		"'endforeach'", "'endif'", "'endswitch'", "'endwhile'", "'eval'", "'die'", 
		"'extends'", "'final'", "'finally'", "'float'", "'for'", "'foreach'", 
		"'function'", "'global'", "'goto'", "'if'", "'implements'", "'import'", 
		"'include'", "'include_once'", "'instanceof'", "'insteadof'", "'int8'", 
		"'int16'", "'int64'", null, "'interface'", "'isset'", "'list'", "'and'", 
		"'or'", "'xor'", "'namespace'", "'new'", "'null'", "'object'", "'parent'", 
		"'partial'", "'print'", "'private'", "'protected'", "'public'", "'require'", 
		"'require_once'", "'resource'", "'return'", "'static'", "'string'", "'switch'", 
		"'throw'", "'trait'", "'try'", "'clrtypeof'", null, "'unicode'", "'unset'", 
		"'use'", "'var'", "'while'", "'yield'", "'__get'", "'__set'", "'__call'", 
		"'__callstatic'", "'__construct'", "'__destruct'", "'__wakeup'", "'__sleep'", 
		"'__autoload'", "'__isset'", "'__unset'", "'__tostring'", "'__invoke'", 
		"'__set_state'", "'__clone'", "'__debuginfo'", "'__namespace__'", "'__class__'", 
		"'__trait__'", "'__function__'", "'__method__'", "'__line__'", "'__file__'", 
		"'__dir__'", "'<:'", "':>'", "'=>'", "'++'", "'--'", "'==='", "'!=='", 
		"'=='", null, "'<='", "'>='", "'+='", "'-='", "'*='", "'**'", "'**='", 
		"'/='", "'.='", "'%='", "'<<='", "'>>='", "'&='", "'|='", "'^='", "'||'", 
		"'&&'", "'<<'", "'>>'", "'::'", "'->'", "'\\'", "'...'", null, null, "'&'", 
		"'|'", "'!'", "'^'", "'+'", "'-'", "'*'", "'%'", null, "'~'", "'@'", null, 
		"'.'", "'?'", "'('", "')'", "'['", "']'", null, "'}'", "','", "':'", "';'", 
		null, "'''", "'`'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "SeaWhitespace", "HtmlText", "PHPStart", "HtmlScriptOpen", "HtmlStyleOpen", 
		"HtmlComment", "HtmlDtd", "HtmlOpen", "Shebang", "Error", "PHPStartInside", 
		"HtmlClose", "HtmlSlashClose", "HtmlSlash", "HtmlEquals", "HtmlStartQuoteString", 
		"HtmlStartDoubleQuoteString", "HtmlHex", "HtmlDecimal", "HtmlSpace", "HtmlName", 
		"ErrorInside", "PHPStartInsideQuoteString", "HtmlEndQuoteString", "HtmlQuoteString", 
		"ErrorHtmlQuote", "PHPStartDoubleQuoteString", "HtmlEndDoubleQuoteString", 
		"HtmlDoubleQuoteString", "ErrorHtmlDoubleQuote", "ScriptText", "ScriptClose", 
		"PHPStartInsideScript", "StyleBody", "PHPEnd", "Whitespace", "MultiLineComment", 
		"SingleLineComment", "ShellStyleComment", "Abstract", "Array", "As", "BinaryCast", 
		"BoolType", "BooleanConstant", "Break", "Callable", "Case", "Catch", "Class", 
		"Clone", "Const", "Continue", "Declare", "Default", "Do", "DoubleCast", 
		"DoubleType", "Echo", "Else", "ElseIf", "Empty", "EndDeclare", "EndFor", 
		"EndForeach", "EndIf", "EndSwitch", "EndWhile", "Eval", "Exit", "Extends", 
		"Final", "Finally", "FloatCast", "For", "Foreach", "Function", "Global", 
		"Goto", "If", "Implements", "Import", "Include", "IncludeOnce", "InstanceOf", 
		"InsteadOf", "Int8Cast", "Int16Cast", "Int64Type", "IntType", "Interface", 
		"IsSet", "List", "LogicalAnd", "LogicalOr", "LogicalXor", "Namespace", 
		"New", "Null", "ObjectType", "Parent_", "Partial", "Print", "Private", 
		"Protected", "Public", "Require", "RequireOnce", "Resource", "Return", 
		"Static", "StringType", "Switch", "Throw", "Trait", "Try", "Typeof", "UintCast", 
		"UnicodeCast", "Unset", "Use", "Var", "While", "Yield", "Get", "Set", 
		"Call", "CallStatic", "Constructor", "Destruct", "Wakeup", "Sleep", "Autoload", 
		"IsSet__", "Unset__", "ToString__", "Invoke", "SetState", "Clone__", "DebugInfo", 
		"Namespace__", "Class__", "Traic__", "Function__", "Method__", "Line__", 
		"File__", "Dir__", "Lgeneric", "Rgeneric", "DoubleArrow", "Inc", "Dec", 
		"IsIdentical", "IsNoidentical", "IsEqual", "IsNotEq", "IsSmallerOrEqual", 
		"IsGreaterOrEqual", "PlusEqual", "MinusEqual", "MulEqual", "Pow", "PowEqual", 
		"DivEqual", "Concaequal", "ModEqual", "ShiftLeftEqual", "ShiftRightEqual", 
		"AndEqual", "OrEqual", "XorEqual", "BooleanOr", "BooleanAnd", "ShiftLeft", 
		"ShiftRight", "DoubleColon", "ObjectOperator", "NamespaceSeparator", "Ellipsis", 
		"Less", "Greater", "Ampersand", "Pipe", "Bang", "Caret", "Plus", "Minus", 
		"Asterisk", "Percent", "Divide", "Tilde", "SuppressWarnings", "Dollar", 
		"Dot", "QuestionMark", "OpenRoundBracket", "CloseRoundBracket", "OpenSquareBracket", 
		"CloseSquareBracket", "OpenCurlyBracket", "CloseCurlyBracket", "Comma", 
		"Colon", "SemiColon", "Eq", "Quote", "BackQuote", "VarName", "Label", 
		"Octal", "Decimal", "Real", "Hex", "Binary", "BackQuoteString", "SingleQuoteString", 
		"DoubleQuote", "StartNowDoc", "StartHereDoc", "ErrorPhp", "CurlyDollar", 
		"StringPart", "Comment", "PHPEndSingleLineComment", "CommentEnd", "HereDocText"
	};
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
	public String getGrammarFileName() { return "PHPParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PHPParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class HtmlDocumentContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(PHPParser.EOF, 0); }
		public TerminalNode Shebang() { return getToken(PHPParser.Shebang, 0); }
		public List<HtmlElementOrPhpBlockContext> htmlElementOrPhpBlock() {
			return getRuleContexts(HtmlElementOrPhpBlockContext.class);
		}
		public HtmlElementOrPhpBlockContext htmlElementOrPhpBlock(int i) {
			return getRuleContext(HtmlElementOrPhpBlockContext.class,i);
		}
		public HtmlDocumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlDocument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterHtmlDocument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitHtmlDocument(this);
		}
	}

	public final HtmlDocumentContext htmlDocument() throws RecognitionException {
		HtmlDocumentContext _localctx = new HtmlDocumentContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_htmlDocument);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Shebang) {
				{
				setState(258);
				match(Shebang);
				}
			}

			setState(264);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << HtmlText) | (1L << HtmlScriptOpen) | (1L << HtmlStyleOpen) | (1L << HtmlDtd) | (1L << HtmlOpen) | (1L << HtmlClose) | (1L << HtmlSlashClose) | (1L << HtmlSlash) | (1L << HtmlEquals) | (1L << HtmlStartQuoteString) | (1L << HtmlStartDoubleQuoteString) | (1L << HtmlHex) | (1L << HtmlDecimal) | (1L << HtmlName) | (1L << HtmlEndQuoteString) | (1L << HtmlQuoteString) | (1L << HtmlEndDoubleQuoteString) | (1L << HtmlDoubleQuoteString) | (1L << ScriptText) | (1L << ScriptClose) | (1L << StyleBody) | (1L << Abstract) | (1L << Array) | (1L << As) | (1L << BinaryCast) | (1L << BoolType) | (1L << BooleanConstant) | (1L << Break) | (1L << Callable) | (1L << Case) | (1L << Catch) | (1L << Class) | (1L << Clone) | (1L << Const) | (1L << Continue) | (1L << Declare) | (1L << Default) | (1L << Do) | (1L << DoubleCast) | (1L << DoubleType) | (1L << Echo) | (1L << Else) | (1L << ElseIf) | (1L << Empty) | (1L << EndDeclare))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (EndFor - 64)) | (1L << (EndForeach - 64)) | (1L << (EndIf - 64)) | (1L << (EndSwitch - 64)) | (1L << (EndWhile - 64)) | (1L << (Eval - 64)) | (1L << (Exit - 64)) | (1L << (Extends - 64)) | (1L << (Final - 64)) | (1L << (Finally - 64)) | (1L << (FloatCast - 64)) | (1L << (For - 64)) | (1L << (Foreach - 64)) | (1L << (Function - 64)) | (1L << (Global - 64)) | (1L << (Goto - 64)) | (1L << (If - 64)) | (1L << (Implements - 64)) | (1L << (Import - 64)) | (1L << (Include - 64)) | (1L << (IncludeOnce - 64)) | (1L << (InstanceOf - 64)) | (1L << (InsteadOf - 64)) | (1L << (Int8Cast - 64)) | (1L << (Int16Cast - 64)) | (1L << (Int64Type - 64)) | (1L << (IntType - 64)) | (1L << (Interface - 64)) | (1L << (IsSet - 64)) | (1L << (List - 64)) | (1L << (LogicalAnd - 64)) | (1L << (LogicalOr - 64)) | (1L << (LogicalXor - 64)) | (1L << (Namespace - 64)) | (1L << (New - 64)) | (1L << (Null - 64)) | (1L << (ObjectType - 64)) | (1L << (Parent_ - 64)) | (1L << (Partial - 64)) | (1L << (Print - 64)) | (1L << (Private - 64)) | (1L << (Protected - 64)) | (1L << (Public - 64)) | (1L << (Require - 64)) | (1L << (RequireOnce - 64)) | (1L << (Resource - 64)) | (1L << (Return - 64)) | (1L << (Static - 64)) | (1L << (StringType - 64)) | (1L << (Switch - 64)) | (1L << (Throw - 64)) | (1L << (Trait - 64)) | (1L << (Try - 64)) | (1L << (Typeof - 64)) | (1L << (UintCast - 64)) | (1L << (UnicodeCast - 64)) | (1L << (Unset - 64)) | (1L << (Use - 64)) | (1L << (Var - 64)) | (1L << (While - 64)) | (1L << (Yield - 64)) | (1L << (Get - 64)) | (1L << (Set - 64)) | (1L << (Call - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (CallStatic - 128)) | (1L << (Constructor - 128)) | (1L << (Destruct - 128)) | (1L << (Wakeup - 128)) | (1L << (Sleep - 128)) | (1L << (Autoload - 128)) | (1L << (IsSet__ - 128)) | (1L << (Unset__ - 128)) | (1L << (ToString__ - 128)) | (1L << (Invoke - 128)) | (1L << (SetState - 128)) | (1L << (Clone__ - 128)) | (1L << (DebugInfo - 128)) | (1L << (Namespace__ - 128)) | (1L << (Class__ - 128)) | (1L << (Traic__ - 128)) | (1L << (Function__ - 128)) | (1L << (Method__ - 128)) | (1L << (Line__ - 128)) | (1L << (File__ - 128)) | (1L << (Dir__ - 128)) | (1L << (Inc - 128)) | (1L << (Dec - 128)) | (1L << (NamespaceSeparator - 128)) | (1L << (Bang - 128)) | (1L << (Plus - 128)) | (1L << (Minus - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (Tilde - 192)) | (1L << (SuppressWarnings - 192)) | (1L << (Dollar - 192)) | (1L << (OpenRoundBracket - 192)) | (1L << (OpenSquareBracket - 192)) | (1L << (OpenCurlyBracket - 192)) | (1L << (SemiColon - 192)) | (1L << (VarName - 192)) | (1L << (Label - 192)) | (1L << (Octal - 192)) | (1L << (Decimal - 192)) | (1L << (Real - 192)) | (1L << (Hex - 192)) | (1L << (Binary - 192)) | (1L << (BackQuoteString - 192)) | (1L << (SingleQuoteString - 192)) | (1L << (DoubleQuote - 192)) | (1L << (StartNowDoc - 192)) | (1L << (StartHereDoc - 192)))) != 0)) {
				{
				{
				setState(261);
				htmlElementOrPhpBlock();
				}
				}
				setState(266);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(267);
			match(EOF);
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

	public static class HtmlElementOrPhpBlockContext extends ParserRuleContext {
		public HtmlElementsContext htmlElements() {
			return getRuleContext(HtmlElementsContext.class,0);
		}
		public PhpBlockContext phpBlock() {
			return getRuleContext(PhpBlockContext.class,0);
		}
		public ScriptTextPartContext scriptTextPart() {
			return getRuleContext(ScriptTextPartContext.class,0);
		}
		public HtmlElementOrPhpBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlElementOrPhpBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterHtmlElementOrPhpBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitHtmlElementOrPhpBlock(this);
		}
	}

	public final HtmlElementOrPhpBlockContext htmlElementOrPhpBlock() throws RecognitionException {
		HtmlElementOrPhpBlockContext _localctx = new HtmlElementOrPhpBlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_htmlElementOrPhpBlock);
		try {
			setState(272);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(269);
				htmlElements();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(270);
				phpBlock();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(271);
				scriptTextPart();
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

	public static class HtmlElementsContext extends ParserRuleContext {
		public List<HtmlElementContext> htmlElement() {
			return getRuleContexts(HtmlElementContext.class);
		}
		public HtmlElementContext htmlElement(int i) {
			return getRuleContext(HtmlElementContext.class,i);
		}
		public HtmlElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlElements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterHtmlElements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitHtmlElements(this);
		}
	}

	public final HtmlElementsContext htmlElements() throws RecognitionException {
		HtmlElementsContext _localctx = new HtmlElementsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_htmlElements);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(275); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(274);
					htmlElement();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(277); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class HtmlElementContext extends ParserRuleContext {
		public TerminalNode HtmlDtd() { return getToken(PHPParser.HtmlDtd, 0); }
		public TerminalNode HtmlScriptOpen() { return getToken(PHPParser.HtmlScriptOpen, 0); }
		public TerminalNode HtmlClose() { return getToken(PHPParser.HtmlClose, 0); }
		public TerminalNode HtmlStyleOpen() { return getToken(PHPParser.HtmlStyleOpen, 0); }
		public TerminalNode HtmlOpen() { return getToken(PHPParser.HtmlOpen, 0); }
		public TerminalNode HtmlName() { return getToken(PHPParser.HtmlName, 0); }
		public TerminalNode HtmlSlashClose() { return getToken(PHPParser.HtmlSlashClose, 0); }
		public TerminalNode HtmlSlash() { return getToken(PHPParser.HtmlSlash, 0); }
		public TerminalNode HtmlText() { return getToken(PHPParser.HtmlText, 0); }
		public TerminalNode HtmlEquals() { return getToken(PHPParser.HtmlEquals, 0); }
		public TerminalNode HtmlStartQuoteString() { return getToken(PHPParser.HtmlStartQuoteString, 0); }
		public TerminalNode HtmlEndQuoteString() { return getToken(PHPParser.HtmlEndQuoteString, 0); }
		public TerminalNode HtmlStartDoubleQuoteString() { return getToken(PHPParser.HtmlStartDoubleQuoteString, 0); }
		public TerminalNode HtmlEndDoubleQuoteString() { return getToken(PHPParser.HtmlEndDoubleQuoteString, 0); }
		public TerminalNode HtmlHex() { return getToken(PHPParser.HtmlHex, 0); }
		public TerminalNode HtmlDecimal() { return getToken(PHPParser.HtmlDecimal, 0); }
		public TerminalNode HtmlQuoteString() { return getToken(PHPParser.HtmlQuoteString, 0); }
		public TerminalNode HtmlDoubleQuoteString() { return getToken(PHPParser.HtmlDoubleQuoteString, 0); }
		public TerminalNode StyleBody() { return getToken(PHPParser.StyleBody, 0); }
		public TerminalNode ScriptClose() { return getToken(PHPParser.ScriptClose, 0); }
		public HtmlElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterHtmlElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitHtmlElement(this);
		}
	}

	public final HtmlElementContext htmlElement() throws RecognitionException {
		HtmlElementContext _localctx = new HtmlElementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_htmlElement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << HtmlText) | (1L << HtmlScriptOpen) | (1L << HtmlStyleOpen) | (1L << HtmlDtd) | (1L << HtmlOpen) | (1L << HtmlClose) | (1L << HtmlSlashClose) | (1L << HtmlSlash) | (1L << HtmlEquals) | (1L << HtmlStartQuoteString) | (1L << HtmlStartDoubleQuoteString) | (1L << HtmlHex) | (1L << HtmlDecimal) | (1L << HtmlName) | (1L << HtmlEndQuoteString) | (1L << HtmlQuoteString) | (1L << HtmlEndDoubleQuoteString) | (1L << HtmlDoubleQuoteString) | (1L << ScriptClose) | (1L << StyleBody))) != 0)) ) {
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

	public static class ScriptTextPartContext extends ParserRuleContext {
		public List<TerminalNode> ScriptText() { return getTokens(PHPParser.ScriptText); }
		public TerminalNode ScriptText(int i) {
			return getToken(PHPParser.ScriptText, i);
		}
		public ScriptTextPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scriptTextPart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterScriptTextPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitScriptTextPart(this);
		}
	}

	public final ScriptTextPartContext scriptTextPart() throws RecognitionException {
		ScriptTextPartContext _localctx = new ScriptTextPartContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_scriptTextPart);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(282); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(281);
					match(ScriptText);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(284); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class PhpBlockContext extends ParserRuleContext {
		public List<ImportStatementContext> importStatement() {
			return getRuleContexts(ImportStatementContext.class);
		}
		public ImportStatementContext importStatement(int i) {
			return getRuleContext(ImportStatementContext.class,i);
		}
		public List<TopStatementContext> topStatement() {
			return getRuleContexts(TopStatementContext.class);
		}
		public TopStatementContext topStatement(int i) {
			return getRuleContext(TopStatementContext.class,i);
		}
		public PhpBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_phpBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterPhpBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitPhpBlock(this);
		}
	}

	public final PhpBlockContext phpBlock() throws RecognitionException {
		PhpBlockContext _localctx = new PhpBlockContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_phpBlock);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(286);
					importStatement();
					}
					} 
				}
				setState(291);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			setState(293); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(292);
					topStatement();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(295); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class ImportStatementContext extends ParserRuleContext {
		public TerminalNode Import() { return getToken(PHPParser.Import, 0); }
		public TerminalNode Namespace() { return getToken(PHPParser.Namespace, 0); }
		public NamespaceNameListContext namespaceNameList() {
			return getRuleContext(NamespaceNameListContext.class,0);
		}
		public ImportStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterImportStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitImportStatement(this);
		}
	}

	public final ImportStatementContext importStatement() throws RecognitionException {
		ImportStatementContext _localctx = new ImportStatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_importStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			match(Import);
			setState(298);
			match(Namespace);
			setState(299);
			namespaceNameList();
			setState(300);
			match(SemiColon);
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

	public static class TopStatementContext extends ParserRuleContext {
		public EmptyStatementContext emptyStatement() {
			return getRuleContext(EmptyStatementContext.class,0);
		}
		public NonEmptyStatementContext nonEmptyStatement() {
			return getRuleContext(NonEmptyStatementContext.class,0);
		}
		public UseDeclarationContext useDeclaration() {
			return getRuleContext(UseDeclarationContext.class,0);
		}
		public NamespaceDeclarationContext namespaceDeclaration() {
			return getRuleContext(NamespaceDeclarationContext.class,0);
		}
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public GlobalConstantDeclarationContext globalConstantDeclaration() {
			return getRuleContext(GlobalConstantDeclarationContext.class,0);
		}
		public TopStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_topStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterTopStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitTopStatement(this);
		}
	}

	public final TopStatementContext topStatement() throws RecognitionException {
		TopStatementContext _localctx = new TopStatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_topStatement);
		try {
			setState(309);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(302);
				emptyStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(303);
				nonEmptyStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(304);
				useDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(305);
				namespaceDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(306);
				functionDeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(307);
				classDeclaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(308);
				globalConstantDeclaration();
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

	public static class UseDeclarationContext extends ParserRuleContext {
		public TerminalNode Use() { return getToken(PHPParser.Use, 0); }
		public UseDeclarationContentListContext useDeclarationContentList() {
			return getRuleContext(UseDeclarationContentListContext.class,0);
		}
		public TerminalNode Function() { return getToken(PHPParser.Function, 0); }
		public TerminalNode Const() { return getToken(PHPParser.Const, 0); }
		public UseDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_useDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterUseDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitUseDeclaration(this);
		}
	}

	public final UseDeclarationContext useDeclaration() throws RecognitionException {
		UseDeclarationContext _localctx = new UseDeclarationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_useDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			match(Use);
			setState(313);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(312);
				_la = _input.LA(1);
				if ( !(_la==Const || _la==Function) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
			setState(315);
			useDeclarationContentList();
			setState(316);
			match(SemiColon);
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

	public static class UseDeclarationContentListContext extends ParserRuleContext {
		public List<UseDeclarationContentContext> useDeclarationContent() {
			return getRuleContexts(UseDeclarationContentContext.class);
		}
		public UseDeclarationContentContext useDeclarationContent(int i) {
			return getRuleContext(UseDeclarationContentContext.class,i);
		}
		public UseDeclarationContentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_useDeclarationContentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterUseDeclarationContentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitUseDeclarationContentList(this);
		}
	}

	public final UseDeclarationContentListContext useDeclarationContentList() throws RecognitionException {
		UseDeclarationContentListContext _localctx = new UseDeclarationContentListContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_useDeclarationContentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NamespaceSeparator) {
				{
				setState(318);
				match(NamespaceSeparator);
				}
			}

			setState(321);
			useDeclarationContent();
			setState(329);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(322);
				match(Comma);
				setState(324);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NamespaceSeparator) {
					{
					setState(323);
					match(NamespaceSeparator);
					}
				}

				setState(326);
				useDeclarationContent();
				}
				}
				setState(331);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class UseDeclarationContentContext extends ParserRuleContext {
		public NamespaceNameListContext namespaceNameList() {
			return getRuleContext(NamespaceNameListContext.class,0);
		}
		public TerminalNode As() { return getToken(PHPParser.As, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public UseDeclarationContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_useDeclarationContent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterUseDeclarationContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitUseDeclarationContent(this);
		}
	}

	public final UseDeclarationContentContext useDeclarationContent() throws RecognitionException {
		UseDeclarationContentContext _localctx = new UseDeclarationContentContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_useDeclarationContent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332);
			namespaceNameList();
			setState(335);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==As) {
				{
				setState(333);
				match(As);
				setState(334);
				identifier();
				}
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

	public static class NamespaceDeclarationContext extends ParserRuleContext {
		public TerminalNode Namespace() { return getToken(PHPParser.Namespace, 0); }
		public TerminalNode OpenCurlyBracket() { return getToken(PHPParser.OpenCurlyBracket, 0); }
		public NamespaceNameListContext namespaceNameList() {
			return getRuleContext(NamespaceNameListContext.class,0);
		}
		public List<NamespaceStatementContext> namespaceStatement() {
			return getRuleContexts(NamespaceStatementContext.class);
		}
		public NamespaceStatementContext namespaceStatement(int i) {
			return getRuleContext(NamespaceStatementContext.class,i);
		}
		public NamespaceDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespaceDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterNamespaceDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitNamespaceDeclaration(this);
		}
	}

	public final NamespaceDeclarationContext namespaceDeclaration() throws RecognitionException {
		NamespaceDeclarationContext _localctx = new NamespaceDeclarationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_namespaceDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			match(Namespace);
			setState(352);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(339);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 40)) & ~0x3f) == 0 && ((1L << (_la - 40)) & ((1L << (Abstract - 40)) | (1L << (Array - 40)) | (1L << (As - 40)) | (1L << (BinaryCast - 40)) | (1L << (BoolType - 40)) | (1L << (BooleanConstant - 40)) | (1L << (Break - 40)) | (1L << (Callable - 40)) | (1L << (Case - 40)) | (1L << (Catch - 40)) | (1L << (Class - 40)) | (1L << (Clone - 40)) | (1L << (Const - 40)) | (1L << (Continue - 40)) | (1L << (Declare - 40)) | (1L << (Default - 40)) | (1L << (Do - 40)) | (1L << (DoubleCast - 40)) | (1L << (DoubleType - 40)) | (1L << (Echo - 40)) | (1L << (Else - 40)) | (1L << (ElseIf - 40)) | (1L << (Empty - 40)) | (1L << (EndDeclare - 40)) | (1L << (EndFor - 40)) | (1L << (EndForeach - 40)) | (1L << (EndIf - 40)) | (1L << (EndSwitch - 40)) | (1L << (EndWhile - 40)) | (1L << (Eval - 40)) | (1L << (Exit - 40)) | (1L << (Extends - 40)) | (1L << (Final - 40)) | (1L << (Finally - 40)) | (1L << (FloatCast - 40)) | (1L << (For - 40)) | (1L << (Foreach - 40)) | (1L << (Function - 40)) | (1L << (Global - 40)) | (1L << (Goto - 40)) | (1L << (If - 40)) | (1L << (Implements - 40)) | (1L << (Import - 40)) | (1L << (Include - 40)) | (1L << (IncludeOnce - 40)) | (1L << (InstanceOf - 40)) | (1L << (InsteadOf - 40)) | (1L << (Int8Cast - 40)) | (1L << (Int16Cast - 40)) | (1L << (Int64Type - 40)) | (1L << (IntType - 40)) | (1L << (Interface - 40)) | (1L << (IsSet - 40)) | (1L << (List - 40)) | (1L << (LogicalAnd - 40)) | (1L << (LogicalOr - 40)) | (1L << (LogicalXor - 40)) | (1L << (Namespace - 40)) | (1L << (New - 40)) | (1L << (Null - 40)) | (1L << (ObjectType - 40)) | (1L << (Parent_ - 40)) | (1L << (Partial - 40)) | (1L << (Print - 40)))) != 0) || ((((_la - 104)) & ~0x3f) == 0 && ((1L << (_la - 104)) & ((1L << (Private - 104)) | (1L << (Protected - 104)) | (1L << (Public - 104)) | (1L << (Require - 104)) | (1L << (RequireOnce - 104)) | (1L << (Resource - 104)) | (1L << (Return - 104)) | (1L << (Static - 104)) | (1L << (StringType - 104)) | (1L << (Switch - 104)) | (1L << (Throw - 104)) | (1L << (Trait - 104)) | (1L << (Try - 104)) | (1L << (Typeof - 104)) | (1L << (UintCast - 104)) | (1L << (UnicodeCast - 104)) | (1L << (Unset - 104)) | (1L << (Use - 104)) | (1L << (Var - 104)) | (1L << (While - 104)) | (1L << (Yield - 104)) | (1L << (Get - 104)) | (1L << (Set - 104)) | (1L << (Call - 104)) | (1L << (CallStatic - 104)) | (1L << (Constructor - 104)) | (1L << (Destruct - 104)) | (1L << (Wakeup - 104)) | (1L << (Sleep - 104)) | (1L << (Autoload - 104)) | (1L << (IsSet__ - 104)) | (1L << (Unset__ - 104)) | (1L << (ToString__ - 104)) | (1L << (Invoke - 104)) | (1L << (SetState - 104)) | (1L << (Clone__ - 104)) | (1L << (DebugInfo - 104)) | (1L << (Namespace__ - 104)) | (1L << (Class__ - 104)) | (1L << (Traic__ - 104)) | (1L << (Function__ - 104)) | (1L << (Method__ - 104)) | (1L << (Line__ - 104)) | (1L << (File__ - 104)) | (1L << (Dir__ - 104)))) != 0) || _la==Label) {
					{
					setState(338);
					namespaceNameList();
					}
				}

				setState(341);
				match(OpenCurlyBracket);
				setState(345);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << HtmlText) | (1L << HtmlScriptOpen) | (1L << HtmlStyleOpen) | (1L << HtmlDtd) | (1L << HtmlOpen) | (1L << HtmlClose) | (1L << HtmlSlashClose) | (1L << HtmlSlash) | (1L << HtmlEquals) | (1L << HtmlStartQuoteString) | (1L << HtmlStartDoubleQuoteString) | (1L << HtmlHex) | (1L << HtmlDecimal) | (1L << HtmlName) | (1L << HtmlEndQuoteString) | (1L << HtmlQuoteString) | (1L << HtmlEndDoubleQuoteString) | (1L << HtmlDoubleQuoteString) | (1L << ScriptText) | (1L << ScriptClose) | (1L << StyleBody) | (1L << Abstract) | (1L << Array) | (1L << As) | (1L << BinaryCast) | (1L << BoolType) | (1L << BooleanConstant) | (1L << Break) | (1L << Callable) | (1L << Case) | (1L << Catch) | (1L << Class) | (1L << Clone) | (1L << Const) | (1L << Continue) | (1L << Declare) | (1L << Default) | (1L << Do) | (1L << DoubleCast) | (1L << DoubleType) | (1L << Echo) | (1L << Else) | (1L << ElseIf) | (1L << Empty) | (1L << EndDeclare))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (EndFor - 64)) | (1L << (EndForeach - 64)) | (1L << (EndIf - 64)) | (1L << (EndSwitch - 64)) | (1L << (EndWhile - 64)) | (1L << (Eval - 64)) | (1L << (Exit - 64)) | (1L << (Extends - 64)) | (1L << (Final - 64)) | (1L << (Finally - 64)) | (1L << (FloatCast - 64)) | (1L << (For - 64)) | (1L << (Foreach - 64)) | (1L << (Function - 64)) | (1L << (Global - 64)) | (1L << (Goto - 64)) | (1L << (If - 64)) | (1L << (Implements - 64)) | (1L << (Import - 64)) | (1L << (Include - 64)) | (1L << (IncludeOnce - 64)) | (1L << (InstanceOf - 64)) | (1L << (InsteadOf - 64)) | (1L << (Int8Cast - 64)) | (1L << (Int16Cast - 64)) | (1L << (Int64Type - 64)) | (1L << (IntType - 64)) | (1L << (Interface - 64)) | (1L << (IsSet - 64)) | (1L << (List - 64)) | (1L << (LogicalAnd - 64)) | (1L << (LogicalOr - 64)) | (1L << (LogicalXor - 64)) | (1L << (Namespace - 64)) | (1L << (New - 64)) | (1L << (Null - 64)) | (1L << (ObjectType - 64)) | (1L << (Parent_ - 64)) | (1L << (Partial - 64)) | (1L << (Print - 64)) | (1L << (Private - 64)) | (1L << (Protected - 64)) | (1L << (Public - 64)) | (1L << (Require - 64)) | (1L << (RequireOnce - 64)) | (1L << (Resource - 64)) | (1L << (Return - 64)) | (1L << (Static - 64)) | (1L << (StringType - 64)) | (1L << (Switch - 64)) | (1L << (Throw - 64)) | (1L << (Trait - 64)) | (1L << (Try - 64)) | (1L << (Typeof - 64)) | (1L << (UintCast - 64)) | (1L << (UnicodeCast - 64)) | (1L << (Unset - 64)) | (1L << (Use - 64)) | (1L << (Var - 64)) | (1L << (While - 64)) | (1L << (Yield - 64)) | (1L << (Get - 64)) | (1L << (Set - 64)) | (1L << (Call - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (CallStatic - 128)) | (1L << (Constructor - 128)) | (1L << (Destruct - 128)) | (1L << (Wakeup - 128)) | (1L << (Sleep - 128)) | (1L << (Autoload - 128)) | (1L << (IsSet__ - 128)) | (1L << (Unset__ - 128)) | (1L << (ToString__ - 128)) | (1L << (Invoke - 128)) | (1L << (SetState - 128)) | (1L << (Clone__ - 128)) | (1L << (DebugInfo - 128)) | (1L << (Namespace__ - 128)) | (1L << (Class__ - 128)) | (1L << (Traic__ - 128)) | (1L << (Function__ - 128)) | (1L << (Method__ - 128)) | (1L << (Line__ - 128)) | (1L << (File__ - 128)) | (1L << (Dir__ - 128)) | (1L << (Inc - 128)) | (1L << (Dec - 128)) | (1L << (NamespaceSeparator - 128)) | (1L << (Bang - 128)) | (1L << (Plus - 128)) | (1L << (Minus - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (Tilde - 192)) | (1L << (SuppressWarnings - 192)) | (1L << (Dollar - 192)) | (1L << (OpenRoundBracket - 192)) | (1L << (OpenSquareBracket - 192)) | (1L << (OpenCurlyBracket - 192)) | (1L << (VarName - 192)) | (1L << (Label - 192)) | (1L << (Octal - 192)) | (1L << (Decimal - 192)) | (1L << (Real - 192)) | (1L << (Hex - 192)) | (1L << (Binary - 192)) | (1L << (BackQuoteString - 192)) | (1L << (SingleQuoteString - 192)) | (1L << (DoubleQuote - 192)) | (1L << (StartNowDoc - 192)) | (1L << (StartHereDoc - 192)))) != 0)) {
					{
					{
					setState(342);
					namespaceStatement();
					}
					}
					setState(347);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(348);
				match(CloseCurlyBracket);
				}
				break;
			case 2:
				{
				setState(349);
				namespaceNameList();
				setState(350);
				match(SemiColon);
				}
				break;
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

	public static class NamespaceStatementContext extends ParserRuleContext {
		public NonEmptyStatementContext nonEmptyStatement() {
			return getRuleContext(NonEmptyStatementContext.class,0);
		}
		public UseDeclarationContext useDeclaration() {
			return getRuleContext(UseDeclarationContext.class,0);
		}
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public GlobalConstantDeclarationContext globalConstantDeclaration() {
			return getRuleContext(GlobalConstantDeclarationContext.class,0);
		}
		public NamespaceStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespaceStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterNamespaceStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitNamespaceStatement(this);
		}
	}

	public final NamespaceStatementContext namespaceStatement() throws RecognitionException {
		NamespaceStatementContext _localctx = new NamespaceStatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_namespaceStatement);
		try {
			setState(359);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(354);
				nonEmptyStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(355);
				useDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(356);
				functionDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(357);
				classDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(358);
				globalConstantDeclaration();
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

	public static class FunctionDeclarationContext extends ParserRuleContext {
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public TerminalNode Function() { return getToken(PHPParser.Function, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public BlockStatementContext blockStatement() {
			return getRuleContext(BlockStatementContext.class,0);
		}
		public TypeParameterListInBracketsContext typeParameterListInBrackets() {
			return getRuleContext(TypeParameterListInBracketsContext.class,0);
		}
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitFunctionDeclaration(this);
		}
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_functionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(361);
			attributes();
			setState(362);
			match(Function);
			setState(364);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Ampersand) {
				{
				setState(363);
				match(Ampersand);
				}
			}

			setState(366);
			identifier();
			setState(368);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Lgeneric) {
				{
				setState(367);
				typeParameterListInBrackets();
				}
			}

			setState(370);
			match(OpenRoundBracket);
			setState(371);
			formalParameterList();
			setState(372);
			match(CloseRoundBracket);
			setState(373);
			blockStatement();
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

	public static class ClassDeclarationContext extends ParserRuleContext {
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public TerminalNode OpenCurlyBracket() { return getToken(PHPParser.OpenCurlyBracket, 0); }
		public ClassEntryTypeContext classEntryType() {
			return getRuleContext(ClassEntryTypeContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode Interface() { return getToken(PHPParser.Interface, 0); }
		public TerminalNode Private() { return getToken(PHPParser.Private, 0); }
		public ModifierContext modifier() {
			return getRuleContext(ModifierContext.class,0);
		}
		public TerminalNode Partial() { return getToken(PHPParser.Partial, 0); }
		public List<ClassStatementContext> classStatement() {
			return getRuleContexts(ClassStatementContext.class);
		}
		public ClassStatementContext classStatement(int i) {
			return getRuleContext(ClassStatementContext.class,i);
		}
		public TypeParameterListInBracketsContext typeParameterListInBrackets() {
			return getRuleContext(TypeParameterListInBracketsContext.class,0);
		}
		public TerminalNode Extends() { return getToken(PHPParser.Extends, 0); }
		public QualifiedStaticTypeRefContext qualifiedStaticTypeRef() {
			return getRuleContext(QualifiedStaticTypeRefContext.class,0);
		}
		public TerminalNode Implements() { return getToken(PHPParser.Implements, 0); }
		public InterfaceListContext interfaceList() {
			return getRuleContext(InterfaceListContext.class,0);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitClassDeclaration(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(375);
			attributes();
			setState(377);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Private) {
				{
				setState(376);
				match(Private);
				}
			}

			setState(380);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Abstract || _la==Final) {
				{
				setState(379);
				modifier();
				}
			}

			setState(383);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Partial) {
				{
				setState(382);
				match(Partial);
				}
			}

			setState(407);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Class:
			case Trait:
				{
				setState(385);
				classEntryType();
				setState(386);
				identifier();
				setState(388);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Lgeneric) {
					{
					setState(387);
					typeParameterListInBrackets();
					}
				}

				setState(392);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Extends) {
					{
					setState(390);
					match(Extends);
					setState(391);
					qualifiedStaticTypeRef();
					}
				}

				setState(396);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Implements) {
					{
					setState(394);
					match(Implements);
					setState(395);
					interfaceList();
					}
				}

				}
				break;
			case Interface:
				{
				setState(398);
				match(Interface);
				setState(399);
				identifier();
				setState(401);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Lgeneric) {
					{
					setState(400);
					typeParameterListInBrackets();
					}
				}

				setState(405);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Extends) {
					{
					setState(403);
					match(Extends);
					setState(404);
					interfaceList();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(409);
			match(OpenCurlyBracket);
			setState(413);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Abstract || _la==Const || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (Final - 72)) | (1L << (Function - 72)) | (1L << (Private - 72)) | (1L << (Protected - 72)) | (1L << (Public - 72)) | (1L << (Static - 72)) | (1L << (Use - 72)) | (1L << (Var - 72)))) != 0) || _la==OpenSquareBracket) {
				{
				{
				setState(410);
				classStatement();
				}
				}
				setState(415);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(416);
			match(CloseCurlyBracket);
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

	public static class ClassEntryTypeContext extends ParserRuleContext {
		public TerminalNode Class() { return getToken(PHPParser.Class, 0); }
		public TerminalNode Trait() { return getToken(PHPParser.Trait, 0); }
		public ClassEntryTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classEntryType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterClassEntryType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitClassEntryType(this);
		}
	}

	public final ClassEntryTypeContext classEntryType() throws RecognitionException {
		ClassEntryTypeContext _localctx = new ClassEntryTypeContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_classEntryType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(418);
			_la = _input.LA(1);
			if ( !(_la==Class || _la==Trait) ) {
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

	public static class InterfaceListContext extends ParserRuleContext {
		public List<QualifiedStaticTypeRefContext> qualifiedStaticTypeRef() {
			return getRuleContexts(QualifiedStaticTypeRefContext.class);
		}
		public QualifiedStaticTypeRefContext qualifiedStaticTypeRef(int i) {
			return getRuleContext(QualifiedStaticTypeRefContext.class,i);
		}
		public InterfaceListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterInterfaceList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitInterfaceList(this);
		}
	}

	public final InterfaceListContext interfaceList() throws RecognitionException {
		InterfaceListContext _localctx = new InterfaceListContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_interfaceList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(420);
			qualifiedStaticTypeRef();
			setState(425);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(421);
				match(Comma);
				setState(422);
				qualifiedStaticTypeRef();
				}
				}
				setState(427);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class TypeParameterListInBracketsContext extends ParserRuleContext {
		public TypeParameterListContext typeParameterList() {
			return getRuleContext(TypeParameterListContext.class,0);
		}
		public TypeParameterWithDefaultsListContext typeParameterWithDefaultsList() {
			return getRuleContext(TypeParameterWithDefaultsListContext.class,0);
		}
		public TypeParameterListInBracketsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameterListInBrackets; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterTypeParameterListInBrackets(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitTypeParameterListInBrackets(this);
		}
	}

	public final TypeParameterListInBracketsContext typeParameterListInBrackets() throws RecognitionException {
		TypeParameterListInBracketsContext _localctx = new TypeParameterListInBracketsContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_typeParameterListInBrackets);
		try {
			setState(442);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(428);
				match(Lgeneric);
				setState(429);
				typeParameterList();
				setState(430);
				match(Rgeneric);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(432);
				match(Lgeneric);
				setState(433);
				typeParameterWithDefaultsList();
				setState(434);
				match(Rgeneric);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(436);
				match(Lgeneric);
				setState(437);
				typeParameterList();
				setState(438);
				match(Comma);
				setState(439);
				typeParameterWithDefaultsList();
				setState(440);
				match(Rgeneric);
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

	public static class TypeParameterListContext extends ParserRuleContext {
		public List<TypeParameterDeclContext> typeParameterDecl() {
			return getRuleContexts(TypeParameterDeclContext.class);
		}
		public TypeParameterDeclContext typeParameterDecl(int i) {
			return getRuleContext(TypeParameterDeclContext.class,i);
		}
		public TypeParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterTypeParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitTypeParameterList(this);
		}
	}

	public final TypeParameterListContext typeParameterList() throws RecognitionException {
		TypeParameterListContext _localctx = new TypeParameterListContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_typeParameterList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(444);
			typeParameterDecl();
			setState(449);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(445);
					match(Comma);
					setState(446);
					typeParameterDecl();
					}
					} 
				}
				setState(451);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
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

	public static class TypeParameterWithDefaultsListContext extends ParserRuleContext {
		public List<TypeParameterWithDefaultDeclContext> typeParameterWithDefaultDecl() {
			return getRuleContexts(TypeParameterWithDefaultDeclContext.class);
		}
		public TypeParameterWithDefaultDeclContext typeParameterWithDefaultDecl(int i) {
			return getRuleContext(TypeParameterWithDefaultDeclContext.class,i);
		}
		public TypeParameterWithDefaultsListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameterWithDefaultsList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterTypeParameterWithDefaultsList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitTypeParameterWithDefaultsList(this);
		}
	}

	public final TypeParameterWithDefaultsListContext typeParameterWithDefaultsList() throws RecognitionException {
		TypeParameterWithDefaultsListContext _localctx = new TypeParameterWithDefaultsListContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_typeParameterWithDefaultsList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(452);
			typeParameterWithDefaultDecl();
			setState(457);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(453);
				match(Comma);
				setState(454);
				typeParameterWithDefaultDecl();
				}
				}
				setState(459);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class TypeParameterDeclContext extends ParserRuleContext {
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TypeParameterDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameterDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterTypeParameterDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitTypeParameterDecl(this);
		}
	}

	public final TypeParameterDeclContext typeParameterDecl() throws RecognitionException {
		TypeParameterDeclContext _localctx = new TypeParameterDeclContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_typeParameterDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(460);
			attributes();
			setState(461);
			identifier();
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

	public static class TypeParameterWithDefaultDeclContext extends ParserRuleContext {
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode Eq() { return getToken(PHPParser.Eq, 0); }
		public QualifiedStaticTypeRefContext qualifiedStaticTypeRef() {
			return getRuleContext(QualifiedStaticTypeRefContext.class,0);
		}
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public TypeParameterWithDefaultDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameterWithDefaultDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterTypeParameterWithDefaultDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitTypeParameterWithDefaultDecl(this);
		}
	}

	public final TypeParameterWithDefaultDeclContext typeParameterWithDefaultDecl() throws RecognitionException {
		TypeParameterWithDefaultDeclContext _localctx = new TypeParameterWithDefaultDeclContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_typeParameterWithDefaultDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(463);
			attributes();
			setState(464);
			identifier();
			setState(465);
			match(Eq);
			setState(468);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				{
				setState(466);
				qualifiedStaticTypeRef();
				}
				break;
			case 2:
				{
				setState(467);
				primitiveType();
				}
				break;
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

	public static class GenericDynamicArgsContext extends ParserRuleContext {
		public List<TypeRefContext> typeRef() {
			return getRuleContexts(TypeRefContext.class);
		}
		public TypeRefContext typeRef(int i) {
			return getRuleContext(TypeRefContext.class,i);
		}
		public GenericDynamicArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericDynamicArgs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterGenericDynamicArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitGenericDynamicArgs(this);
		}
	}

	public final GenericDynamicArgsContext genericDynamicArgs() throws RecognitionException {
		GenericDynamicArgsContext _localctx = new GenericDynamicArgsContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_genericDynamicArgs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(470);
			match(Lgeneric);
			setState(471);
			typeRef();
			setState(476);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(472);
				match(Comma);
				setState(473);
				typeRef();
				}
				}
				setState(478);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(479);
			match(Rgeneric);
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

	public static class AttributesContext extends ParserRuleContext {
		public List<AttributesGroupContext> attributesGroup() {
			return getRuleContexts(AttributesGroupContext.class);
		}
		public AttributesGroupContext attributesGroup(int i) {
			return getRuleContext(AttributesGroupContext.class,i);
		}
		public AttributesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterAttributes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitAttributes(this);
		}
	}

	public final AttributesContext attributes() throws RecognitionException {
		AttributesContext _localctx = new AttributesContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_attributes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(484);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OpenSquareBracket) {
				{
				{
				setState(481);
				attributesGroup();
				}
				}
				setState(486);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class AttributesGroupContext extends ParserRuleContext {
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public AttributesGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributesGroup; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterAttributesGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitAttributesGroup(this);
		}
	}

	public final AttributesGroupContext attributesGroup() throws RecognitionException {
		AttributesGroupContext _localctx = new AttributesGroupContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_attributesGroup);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(487);
			match(OpenSquareBracket);
			setState(491);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				setState(488);
				identifier();
				setState(489);
				match(Colon);
				}
				break;
			}
			setState(493);
			attribute();
			setState(498);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(494);
				match(Comma);
				setState(495);
				attribute();
				}
				}
				setState(500);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(501);
			match(CloseSquareBracket);
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

	public static class AttributeContext extends ParserRuleContext {
		public QualifiedNamespaceNameContext qualifiedNamespaceName() {
			return getRuleContext(QualifiedNamespaceNameContext.class,0);
		}
		public AttributeArgListContext attributeArgList() {
			return getRuleContext(AttributeArgListContext.class,0);
		}
		public AttributeNamedArgListContext attributeNamedArgList() {
			return getRuleContext(AttributeNamedArgListContext.class,0);
		}
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitAttribute(this);
		}
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_attribute);
		try {
			setState(521);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(503);
				qualifiedNamespaceName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(504);
				qualifiedNamespaceName();
				setState(505);
				match(OpenRoundBracket);
				setState(506);
				attributeArgList();
				setState(507);
				match(CloseRoundBracket);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(509);
				qualifiedNamespaceName();
				setState(510);
				match(OpenRoundBracket);
				setState(511);
				attributeNamedArgList();
				setState(512);
				match(CloseRoundBracket);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(514);
				qualifiedNamespaceName();
				setState(515);
				match(OpenRoundBracket);
				setState(516);
				attributeArgList();
				setState(517);
				match(Comma);
				setState(518);
				attributeNamedArgList();
				setState(519);
				match(CloseRoundBracket);
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

	public static class AttributeArgListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public AttributeArgListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeArgList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterAttributeArgList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitAttributeArgList(this);
		}
	}

	public final AttributeArgListContext attributeArgList() throws RecognitionException {
		AttributeArgListContext _localctx = new AttributeArgListContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_attributeArgList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(523);
			expression(0);
			setState(528);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(524);
					match(Comma);
					setState(525);
					expression(0);
					}
					} 
				}
				setState(530);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
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

	public static class AttributeNamedArgListContext extends ParserRuleContext {
		public List<AttributeNamedArgContext> attributeNamedArg() {
			return getRuleContexts(AttributeNamedArgContext.class);
		}
		public AttributeNamedArgContext attributeNamedArg(int i) {
			return getRuleContext(AttributeNamedArgContext.class,i);
		}
		public AttributeNamedArgListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeNamedArgList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterAttributeNamedArgList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitAttributeNamedArgList(this);
		}
	}

	public final AttributeNamedArgListContext attributeNamedArgList() throws RecognitionException {
		AttributeNamedArgListContext _localctx = new AttributeNamedArgListContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_attributeNamedArgList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(531);
			attributeNamedArg();
			setState(536);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(532);
				match(Comma);
				setState(533);
				attributeNamedArg();
				}
				}
				setState(538);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class AttributeNamedArgContext extends ParserRuleContext {
		public TerminalNode VarName() { return getToken(PHPParser.VarName, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AttributeNamedArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeNamedArg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterAttributeNamedArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitAttributeNamedArg(this);
		}
	}

	public final AttributeNamedArgContext attributeNamedArg() throws RecognitionException {
		AttributeNamedArgContext _localctx = new AttributeNamedArgContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_attributeNamedArg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(539);
			match(VarName);
			setState(540);
			match(DoubleArrow);
			setState(541);
			expression(0);
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

	public static class InnerStatementListContext extends ParserRuleContext {
		public List<InnerStatementContext> innerStatement() {
			return getRuleContexts(InnerStatementContext.class);
		}
		public InnerStatementContext innerStatement(int i) {
			return getRuleContext(InnerStatementContext.class,i);
		}
		public InnerStatementListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_innerStatementList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterInnerStatementList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitInnerStatementList(this);
		}
	}

	public final InnerStatementListContext innerStatementList() throws RecognitionException {
		InnerStatementListContext _localctx = new InnerStatementListContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_innerStatementList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(546);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(543);
					innerStatement();
					}
					} 
				}
				setState(548);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
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

	public static class InnerStatementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public InnerStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_innerStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterInnerStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitInnerStatement(this);
		}
	}

	public final InnerStatementContext innerStatement() throws RecognitionException {
		InnerStatementContext _localctx = new InnerStatementContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_innerStatement);
		try {
			setState(552);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(549);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(550);
				functionDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(551);
				classDeclaration();
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

	public static class StatementContext extends ParserRuleContext {
		public NonEmptyStatementContext nonEmptyStatement() {
			return getRuleContext(NonEmptyStatementContext.class,0);
		}
		public EmptyStatementContext emptyStatement() {
			return getRuleContext(EmptyStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_statement);
		try {
			setState(556);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HtmlText:
			case HtmlScriptOpen:
			case HtmlStyleOpen:
			case HtmlDtd:
			case HtmlOpen:
			case HtmlClose:
			case HtmlSlashClose:
			case HtmlSlash:
			case HtmlEquals:
			case HtmlStartQuoteString:
			case HtmlStartDoubleQuoteString:
			case HtmlHex:
			case HtmlDecimal:
			case HtmlName:
			case HtmlEndQuoteString:
			case HtmlQuoteString:
			case HtmlEndDoubleQuoteString:
			case HtmlDoubleQuoteString:
			case ScriptText:
			case ScriptClose:
			case StyleBody:
			case Abstract:
			case Array:
			case As:
			case BinaryCast:
			case BoolType:
			case BooleanConstant:
			case Break:
			case Callable:
			case Case:
			case Catch:
			case Class:
			case Clone:
			case Const:
			case Continue:
			case Declare:
			case Default:
			case Do:
			case DoubleCast:
			case DoubleType:
			case Echo:
			case Else:
			case ElseIf:
			case Empty:
			case EndDeclare:
			case EndFor:
			case EndForeach:
			case EndIf:
			case EndSwitch:
			case EndWhile:
			case Eval:
			case Exit:
			case Extends:
			case Final:
			case Finally:
			case FloatCast:
			case For:
			case Foreach:
			case Function:
			case Global:
			case Goto:
			case If:
			case Implements:
			case Import:
			case Include:
			case IncludeOnce:
			case InstanceOf:
			case InsteadOf:
			case Int8Cast:
			case Int16Cast:
			case Int64Type:
			case IntType:
			case Interface:
			case IsSet:
			case List:
			case LogicalAnd:
			case LogicalOr:
			case LogicalXor:
			case Namespace:
			case New:
			case Null:
			case ObjectType:
			case Parent_:
			case Partial:
			case Print:
			case Private:
			case Protected:
			case Public:
			case Require:
			case RequireOnce:
			case Resource:
			case Return:
			case Static:
			case StringType:
			case Switch:
			case Throw:
			case Trait:
			case Try:
			case Typeof:
			case UintCast:
			case UnicodeCast:
			case Unset:
			case Use:
			case Var:
			case While:
			case Yield:
			case Get:
			case Set:
			case Call:
			case CallStatic:
			case Constructor:
			case Destruct:
			case Wakeup:
			case Sleep:
			case Autoload:
			case IsSet__:
			case Unset__:
			case ToString__:
			case Invoke:
			case SetState:
			case Clone__:
			case DebugInfo:
			case Namespace__:
			case Class__:
			case Traic__:
			case Function__:
			case Method__:
			case Line__:
			case File__:
			case Dir__:
			case Inc:
			case Dec:
			case NamespaceSeparator:
			case Bang:
			case Plus:
			case Minus:
			case Tilde:
			case SuppressWarnings:
			case Dollar:
			case OpenRoundBracket:
			case OpenSquareBracket:
			case OpenCurlyBracket:
			case VarName:
			case Label:
			case Octal:
			case Decimal:
			case Real:
			case Hex:
			case Binary:
			case BackQuoteString:
			case SingleQuoteString:
			case DoubleQuote:
			case StartNowDoc:
			case StartHereDoc:
				enterOuterAlt(_localctx, 1);
				{
				setState(554);
				nonEmptyStatement();
				}
				break;
			case SemiColon:
				enterOuterAlt(_localctx, 2);
				{
				setState(555);
				emptyStatement();
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

	public static class EmptyStatementContext extends ParserRuleContext {
		public EmptyStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emptyStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterEmptyStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitEmptyStatement(this);
		}
	}

	public final EmptyStatementContext emptyStatement() throws RecognitionException {
		EmptyStatementContext _localctx = new EmptyStatementContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_emptyStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(558);
			match(SemiColon);
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

	public static class NonEmptyStatementContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public BlockStatementContext blockStatement() {
			return getRuleContext(BlockStatementContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public DoWhileStatementContext doWhileStatement() {
			return getRuleContext(DoWhileStatementContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public SwitchStatementContext switchStatement() {
			return getRuleContext(SwitchStatementContext.class,0);
		}
		public BreakStatementContext breakStatement() {
			return getRuleContext(BreakStatementContext.class,0);
		}
		public ContinueStatementContext continueStatement() {
			return getRuleContext(ContinueStatementContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public YieldExpressionContext yieldExpression() {
			return getRuleContext(YieldExpressionContext.class,0);
		}
		public GlobalStatementContext globalStatement() {
			return getRuleContext(GlobalStatementContext.class,0);
		}
		public StaticVariableStatementContext staticVariableStatement() {
			return getRuleContext(StaticVariableStatementContext.class,0);
		}
		public EchoStatementContext echoStatement() {
			return getRuleContext(EchoStatementContext.class,0);
		}
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public UnsetStatementContext unsetStatement() {
			return getRuleContext(UnsetStatementContext.class,0);
		}
		public ForeachStatementContext foreachStatement() {
			return getRuleContext(ForeachStatementContext.class,0);
		}
		public TryCatchFinallyContext tryCatchFinally() {
			return getRuleContext(TryCatchFinallyContext.class,0);
		}
		public ThrowStatementContext throwStatement() {
			return getRuleContext(ThrowStatementContext.class,0);
		}
		public GotoStatementContext gotoStatement() {
			return getRuleContext(GotoStatementContext.class,0);
		}
		public DeclareStatementContext declareStatement() {
			return getRuleContext(DeclareStatementContext.class,0);
		}
		public InlineHtmlContext inlineHtml() {
			return getRuleContext(InlineHtmlContext.class,0);
		}
		public NonEmptyStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonEmptyStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterNonEmptyStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitNonEmptyStatement(this);
		}
	}

	public final NonEmptyStatementContext nonEmptyStatement() throws RecognitionException {
		NonEmptyStatementContext _localctx = new NonEmptyStatementContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_nonEmptyStatement);
		try {
			setState(586);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(560);
				identifier();
				setState(561);
				match(Colon);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(563);
				blockStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(564);
				ifStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(565);
				whileStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(566);
				doWhileStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(567);
				forStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(568);
				switchStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(569);
				breakStatement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(570);
				continueStatement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(571);
				returnStatement();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(572);
				yieldExpression();
				setState(573);
				match(SemiColon);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(575);
				globalStatement();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(576);
				staticVariableStatement();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(577);
				echoStatement();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(578);
				expressionStatement();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(579);
				unsetStatement();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(580);
				foreachStatement();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(581);
				tryCatchFinally();
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(582);
				throwStatement();
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(583);
				gotoStatement();
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(584);
				declareStatement();
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(585);
				inlineHtml();
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

	public static class BlockStatementContext extends ParserRuleContext {
		public TerminalNode OpenCurlyBracket() { return getToken(PHPParser.OpenCurlyBracket, 0); }
		public InnerStatementListContext innerStatementList() {
			return getRuleContext(InnerStatementListContext.class,0);
		}
		public BlockStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterBlockStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitBlockStatement(this);
		}
	}

	public final BlockStatementContext blockStatement() throws RecognitionException {
		BlockStatementContext _localctx = new BlockStatementContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_blockStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(588);
			match(OpenCurlyBracket);
			setState(589);
			innerStatementList();
			setState(590);
			match(CloseCurlyBracket);
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

	public static class IfStatementContext extends ParserRuleContext {
		public TerminalNode If() { return getToken(PHPParser.If, 0); }
		public ParenthesisContext parenthesis() {
			return getRuleContext(ParenthesisContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public List<ElseIfStatementContext> elseIfStatement() {
			return getRuleContexts(ElseIfStatementContext.class);
		}
		public ElseIfStatementContext elseIfStatement(int i) {
			return getRuleContext(ElseIfStatementContext.class,i);
		}
		public ElseStatementContext elseStatement() {
			return getRuleContext(ElseStatementContext.class,0);
		}
		public InnerStatementListContext innerStatementList() {
			return getRuleContext(InnerStatementListContext.class,0);
		}
		public TerminalNode EndIf() { return getToken(PHPParser.EndIf, 0); }
		public List<ElseIfColonStatementContext> elseIfColonStatement() {
			return getRuleContexts(ElseIfColonStatementContext.class);
		}
		public ElseIfColonStatementContext elseIfColonStatement(int i) {
			return getRuleContext(ElseIfColonStatementContext.class,i);
		}
		public ElseColonStatementContext elseColonStatement() {
			return getRuleContext(ElseColonStatementContext.class,0);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitIfStatement(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_ifStatement);
		int _la;
		try {
			int _alt;
			setState(620);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(592);
				match(If);
				setState(593);
				parenthesis();
				setState(594);
				statement();
				setState(598);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(595);
						elseIfStatement();
						}
						} 
					}
					setState(600);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
				}
				setState(602);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
				case 1:
					{
					setState(601);
					elseStatement();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(604);
				match(If);
				setState(605);
				parenthesis();
				setState(606);
				match(Colon);
				setState(607);
				innerStatementList();
				setState(611);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ElseIf) {
					{
					{
					setState(608);
					elseIfColonStatement();
					}
					}
					setState(613);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(615);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Else) {
					{
					setState(614);
					elseColonStatement();
					}
				}

				setState(617);
				match(EndIf);
				setState(618);
				match(SemiColon);
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

	public static class ElseIfStatementContext extends ParserRuleContext {
		public TerminalNode ElseIf() { return getToken(PHPParser.ElseIf, 0); }
		public ParenthesisContext parenthesis() {
			return getRuleContext(ParenthesisContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ElseIfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseIfStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterElseIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitElseIfStatement(this);
		}
	}

	public final ElseIfStatementContext elseIfStatement() throws RecognitionException {
		ElseIfStatementContext _localctx = new ElseIfStatementContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_elseIfStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(622);
			match(ElseIf);
			setState(623);
			parenthesis();
			setState(624);
			statement();
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

	public static class ElseIfColonStatementContext extends ParserRuleContext {
		public TerminalNode ElseIf() { return getToken(PHPParser.ElseIf, 0); }
		public ParenthesisContext parenthesis() {
			return getRuleContext(ParenthesisContext.class,0);
		}
		public InnerStatementListContext innerStatementList() {
			return getRuleContext(InnerStatementListContext.class,0);
		}
		public ElseIfColonStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseIfColonStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterElseIfColonStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitElseIfColonStatement(this);
		}
	}

	public final ElseIfColonStatementContext elseIfColonStatement() throws RecognitionException {
		ElseIfColonStatementContext _localctx = new ElseIfColonStatementContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_elseIfColonStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(626);
			match(ElseIf);
			setState(627);
			parenthesis();
			setState(628);
			match(Colon);
			setState(629);
			innerStatementList();
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

	public static class ElseStatementContext extends ParserRuleContext {
		public TerminalNode Else() { return getToken(PHPParser.Else, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ElseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterElseStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitElseStatement(this);
		}
	}

	public final ElseStatementContext elseStatement() throws RecognitionException {
		ElseStatementContext _localctx = new ElseStatementContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_elseStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(631);
			match(Else);
			setState(632);
			statement();
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

	public static class ElseColonStatementContext extends ParserRuleContext {
		public TerminalNode Else() { return getToken(PHPParser.Else, 0); }
		public InnerStatementListContext innerStatementList() {
			return getRuleContext(InnerStatementListContext.class,0);
		}
		public ElseColonStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseColonStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterElseColonStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitElseColonStatement(this);
		}
	}

	public final ElseColonStatementContext elseColonStatement() throws RecognitionException {
		ElseColonStatementContext _localctx = new ElseColonStatementContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_elseColonStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(634);
			match(Else);
			setState(635);
			match(Colon);
			setState(636);
			innerStatementList();
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

	public static class WhileStatementContext extends ParserRuleContext {
		public TerminalNode While() { return getToken(PHPParser.While, 0); }
		public ParenthesisContext parenthesis() {
			return getRuleContext(ParenthesisContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public InnerStatementListContext innerStatementList() {
			return getRuleContext(InnerStatementListContext.class,0);
		}
		public TerminalNode EndWhile() { return getToken(PHPParser.EndWhile, 0); }
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitWhileStatement(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(638);
			match(While);
			setState(639);
			parenthesis();
			setState(646);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HtmlText:
			case HtmlScriptOpen:
			case HtmlStyleOpen:
			case HtmlDtd:
			case HtmlOpen:
			case HtmlClose:
			case HtmlSlashClose:
			case HtmlSlash:
			case HtmlEquals:
			case HtmlStartQuoteString:
			case HtmlStartDoubleQuoteString:
			case HtmlHex:
			case HtmlDecimal:
			case HtmlName:
			case HtmlEndQuoteString:
			case HtmlQuoteString:
			case HtmlEndDoubleQuoteString:
			case HtmlDoubleQuoteString:
			case ScriptText:
			case ScriptClose:
			case StyleBody:
			case Abstract:
			case Array:
			case As:
			case BinaryCast:
			case BoolType:
			case BooleanConstant:
			case Break:
			case Callable:
			case Case:
			case Catch:
			case Class:
			case Clone:
			case Const:
			case Continue:
			case Declare:
			case Default:
			case Do:
			case DoubleCast:
			case DoubleType:
			case Echo:
			case Else:
			case ElseIf:
			case Empty:
			case EndDeclare:
			case EndFor:
			case EndForeach:
			case EndIf:
			case EndSwitch:
			case EndWhile:
			case Eval:
			case Exit:
			case Extends:
			case Final:
			case Finally:
			case FloatCast:
			case For:
			case Foreach:
			case Function:
			case Global:
			case Goto:
			case If:
			case Implements:
			case Import:
			case Include:
			case IncludeOnce:
			case InstanceOf:
			case InsteadOf:
			case Int8Cast:
			case Int16Cast:
			case Int64Type:
			case IntType:
			case Interface:
			case IsSet:
			case List:
			case LogicalAnd:
			case LogicalOr:
			case LogicalXor:
			case Namespace:
			case New:
			case Null:
			case ObjectType:
			case Parent_:
			case Partial:
			case Print:
			case Private:
			case Protected:
			case Public:
			case Require:
			case RequireOnce:
			case Resource:
			case Return:
			case Static:
			case StringType:
			case Switch:
			case Throw:
			case Trait:
			case Try:
			case Typeof:
			case UintCast:
			case UnicodeCast:
			case Unset:
			case Use:
			case Var:
			case While:
			case Yield:
			case Get:
			case Set:
			case Call:
			case CallStatic:
			case Constructor:
			case Destruct:
			case Wakeup:
			case Sleep:
			case Autoload:
			case IsSet__:
			case Unset__:
			case ToString__:
			case Invoke:
			case SetState:
			case Clone__:
			case DebugInfo:
			case Namespace__:
			case Class__:
			case Traic__:
			case Function__:
			case Method__:
			case Line__:
			case File__:
			case Dir__:
			case Inc:
			case Dec:
			case NamespaceSeparator:
			case Bang:
			case Plus:
			case Minus:
			case Tilde:
			case SuppressWarnings:
			case Dollar:
			case OpenRoundBracket:
			case OpenSquareBracket:
			case OpenCurlyBracket:
			case SemiColon:
			case VarName:
			case Label:
			case Octal:
			case Decimal:
			case Real:
			case Hex:
			case Binary:
			case BackQuoteString:
			case SingleQuoteString:
			case DoubleQuote:
			case StartNowDoc:
			case StartHereDoc:
				{
				setState(640);
				statement();
				}
				break;
			case Colon:
				{
				setState(641);
				match(Colon);
				setState(642);
				innerStatementList();
				setState(643);
				match(EndWhile);
				setState(644);
				match(SemiColon);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class DoWhileStatementContext extends ParserRuleContext {
		public TerminalNode Do() { return getToken(PHPParser.Do, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode While() { return getToken(PHPParser.While, 0); }
		public ParenthesisContext parenthesis() {
			return getRuleContext(ParenthesisContext.class,0);
		}
		public DoWhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doWhileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterDoWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitDoWhileStatement(this);
		}
	}

	public final DoWhileStatementContext doWhileStatement() throws RecognitionException {
		DoWhileStatementContext _localctx = new DoWhileStatementContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_doWhileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(648);
			match(Do);
			setState(649);
			statement();
			setState(650);
			match(While);
			setState(651);
			parenthesis();
			setState(652);
			match(SemiColon);
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

	public static class ForStatementContext extends ParserRuleContext {
		public TerminalNode For() { return getToken(PHPParser.For, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public InnerStatementListContext innerStatementList() {
			return getRuleContext(InnerStatementListContext.class,0);
		}
		public TerminalNode EndFor() { return getToken(PHPParser.EndFor, 0); }
		public ForInitContext forInit() {
			return getRuleContext(ForInitContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ForUpdateContext forUpdate() {
			return getRuleContext(ForUpdateContext.class,0);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitForStatement(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_forStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(654);
			match(For);
			setState(655);
			match(OpenRoundBracket);
			setState(657);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 40)) & ~0x3f) == 0 && ((1L << (_la - 40)) & ((1L << (Abstract - 40)) | (1L << (Array - 40)) | (1L << (As - 40)) | (1L << (BinaryCast - 40)) | (1L << (BoolType - 40)) | (1L << (BooleanConstant - 40)) | (1L << (Break - 40)) | (1L << (Callable - 40)) | (1L << (Case - 40)) | (1L << (Catch - 40)) | (1L << (Class - 40)) | (1L << (Clone - 40)) | (1L << (Const - 40)) | (1L << (Continue - 40)) | (1L << (Declare - 40)) | (1L << (Default - 40)) | (1L << (Do - 40)) | (1L << (DoubleCast - 40)) | (1L << (DoubleType - 40)) | (1L << (Echo - 40)) | (1L << (Else - 40)) | (1L << (ElseIf - 40)) | (1L << (Empty - 40)) | (1L << (EndDeclare - 40)) | (1L << (EndFor - 40)) | (1L << (EndForeach - 40)) | (1L << (EndIf - 40)) | (1L << (EndSwitch - 40)) | (1L << (EndWhile - 40)) | (1L << (Eval - 40)) | (1L << (Exit - 40)) | (1L << (Extends - 40)) | (1L << (Final - 40)) | (1L << (Finally - 40)) | (1L << (FloatCast - 40)) | (1L << (For - 40)) | (1L << (Foreach - 40)) | (1L << (Function - 40)) | (1L << (Global - 40)) | (1L << (Goto - 40)) | (1L << (If - 40)) | (1L << (Implements - 40)) | (1L << (Import - 40)) | (1L << (Include - 40)) | (1L << (IncludeOnce - 40)) | (1L << (InstanceOf - 40)) | (1L << (InsteadOf - 40)) | (1L << (Int8Cast - 40)) | (1L << (Int16Cast - 40)) | (1L << (Int64Type - 40)) | (1L << (IntType - 40)) | (1L << (Interface - 40)) | (1L << (IsSet - 40)) | (1L << (List - 40)) | (1L << (LogicalAnd - 40)) | (1L << (LogicalOr - 40)) | (1L << (LogicalXor - 40)) | (1L << (Namespace - 40)) | (1L << (New - 40)) | (1L << (Null - 40)) | (1L << (ObjectType - 40)) | (1L << (Parent_ - 40)) | (1L << (Partial - 40)) | (1L << (Print - 40)))) != 0) || ((((_la - 104)) & ~0x3f) == 0 && ((1L << (_la - 104)) & ((1L << (Private - 104)) | (1L << (Protected - 104)) | (1L << (Public - 104)) | (1L << (Require - 104)) | (1L << (RequireOnce - 104)) | (1L << (Resource - 104)) | (1L << (Return - 104)) | (1L << (Static - 104)) | (1L << (StringType - 104)) | (1L << (Switch - 104)) | (1L << (Throw - 104)) | (1L << (Trait - 104)) | (1L << (Try - 104)) | (1L << (Typeof - 104)) | (1L << (UintCast - 104)) | (1L << (UnicodeCast - 104)) | (1L << (Unset - 104)) | (1L << (Use - 104)) | (1L << (Var - 104)) | (1L << (While - 104)) | (1L << (Yield - 104)) | (1L << (Get - 104)) | (1L << (Set - 104)) | (1L << (Call - 104)) | (1L << (CallStatic - 104)) | (1L << (Constructor - 104)) | (1L << (Destruct - 104)) | (1L << (Wakeup - 104)) | (1L << (Sleep - 104)) | (1L << (Autoload - 104)) | (1L << (IsSet__ - 104)) | (1L << (Unset__ - 104)) | (1L << (ToString__ - 104)) | (1L << (Invoke - 104)) | (1L << (SetState - 104)) | (1L << (Clone__ - 104)) | (1L << (DebugInfo - 104)) | (1L << (Namespace__ - 104)) | (1L << (Class__ - 104)) | (1L << (Traic__ - 104)) | (1L << (Function__ - 104)) | (1L << (Method__ - 104)) | (1L << (Line__ - 104)) | (1L << (File__ - 104)) | (1L << (Dir__ - 104)) | (1L << (Inc - 104)) | (1L << (Dec - 104)))) != 0) || ((((_la - 179)) & ~0x3f) == 0 && ((1L << (_la - 179)) & ((1L << (NamespaceSeparator - 179)) | (1L << (Bang - 179)) | (1L << (Plus - 179)) | (1L << (Minus - 179)) | (1L << (Tilde - 179)) | (1L << (SuppressWarnings - 179)) | (1L << (Dollar - 179)) | (1L << (OpenRoundBracket - 179)) | (1L << (OpenSquareBracket - 179)) | (1L << (VarName - 179)) | (1L << (Label - 179)) | (1L << (Octal - 179)) | (1L << (Decimal - 179)) | (1L << (Real - 179)) | (1L << (Hex - 179)) | (1L << (Binary - 179)) | (1L << (BackQuoteString - 179)) | (1L << (SingleQuoteString - 179)) | (1L << (DoubleQuote - 179)) | (1L << (StartNowDoc - 179)) | (1L << (StartHereDoc - 179)))) != 0)) {
				{
				setState(656);
				forInit();
				}
			}

			setState(659);
			match(SemiColon);
			setState(661);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 40)) & ~0x3f) == 0 && ((1L << (_la - 40)) & ((1L << (Abstract - 40)) | (1L << (Array - 40)) | (1L << (As - 40)) | (1L << (BinaryCast - 40)) | (1L << (BoolType - 40)) | (1L << (BooleanConstant - 40)) | (1L << (Break - 40)) | (1L << (Callable - 40)) | (1L << (Case - 40)) | (1L << (Catch - 40)) | (1L << (Class - 40)) | (1L << (Clone - 40)) | (1L << (Const - 40)) | (1L << (Continue - 40)) | (1L << (Declare - 40)) | (1L << (Default - 40)) | (1L << (Do - 40)) | (1L << (DoubleCast - 40)) | (1L << (DoubleType - 40)) | (1L << (Echo - 40)) | (1L << (Else - 40)) | (1L << (ElseIf - 40)) | (1L << (Empty - 40)) | (1L << (EndDeclare - 40)) | (1L << (EndFor - 40)) | (1L << (EndForeach - 40)) | (1L << (EndIf - 40)) | (1L << (EndSwitch - 40)) | (1L << (EndWhile - 40)) | (1L << (Eval - 40)) | (1L << (Exit - 40)) | (1L << (Extends - 40)) | (1L << (Final - 40)) | (1L << (Finally - 40)) | (1L << (FloatCast - 40)) | (1L << (For - 40)) | (1L << (Foreach - 40)) | (1L << (Function - 40)) | (1L << (Global - 40)) | (1L << (Goto - 40)) | (1L << (If - 40)) | (1L << (Implements - 40)) | (1L << (Import - 40)) | (1L << (Include - 40)) | (1L << (IncludeOnce - 40)) | (1L << (InstanceOf - 40)) | (1L << (InsteadOf - 40)) | (1L << (Int8Cast - 40)) | (1L << (Int16Cast - 40)) | (1L << (Int64Type - 40)) | (1L << (IntType - 40)) | (1L << (Interface - 40)) | (1L << (IsSet - 40)) | (1L << (List - 40)) | (1L << (LogicalAnd - 40)) | (1L << (LogicalOr - 40)) | (1L << (LogicalXor - 40)) | (1L << (Namespace - 40)) | (1L << (New - 40)) | (1L << (Null - 40)) | (1L << (ObjectType - 40)) | (1L << (Parent_ - 40)) | (1L << (Partial - 40)) | (1L << (Print - 40)))) != 0) || ((((_la - 104)) & ~0x3f) == 0 && ((1L << (_la - 104)) & ((1L << (Private - 104)) | (1L << (Protected - 104)) | (1L << (Public - 104)) | (1L << (Require - 104)) | (1L << (RequireOnce - 104)) | (1L << (Resource - 104)) | (1L << (Return - 104)) | (1L << (Static - 104)) | (1L << (StringType - 104)) | (1L << (Switch - 104)) | (1L << (Throw - 104)) | (1L << (Trait - 104)) | (1L << (Try - 104)) | (1L << (Typeof - 104)) | (1L << (UintCast - 104)) | (1L << (UnicodeCast - 104)) | (1L << (Unset - 104)) | (1L << (Use - 104)) | (1L << (Var - 104)) | (1L << (While - 104)) | (1L << (Yield - 104)) | (1L << (Get - 104)) | (1L << (Set - 104)) | (1L << (Call - 104)) | (1L << (CallStatic - 104)) | (1L << (Constructor - 104)) | (1L << (Destruct - 104)) | (1L << (Wakeup - 104)) | (1L << (Sleep - 104)) | (1L << (Autoload - 104)) | (1L << (IsSet__ - 104)) | (1L << (Unset__ - 104)) | (1L << (ToString__ - 104)) | (1L << (Invoke - 104)) | (1L << (SetState - 104)) | (1L << (Clone__ - 104)) | (1L << (DebugInfo - 104)) | (1L << (Namespace__ - 104)) | (1L << (Class__ - 104)) | (1L << (Traic__ - 104)) | (1L << (Function__ - 104)) | (1L << (Method__ - 104)) | (1L << (Line__ - 104)) | (1L << (File__ - 104)) | (1L << (Dir__ - 104)) | (1L << (Inc - 104)) | (1L << (Dec - 104)))) != 0) || ((((_la - 179)) & ~0x3f) == 0 && ((1L << (_la - 179)) & ((1L << (NamespaceSeparator - 179)) | (1L << (Bang - 179)) | (1L << (Plus - 179)) | (1L << (Minus - 179)) | (1L << (Tilde - 179)) | (1L << (SuppressWarnings - 179)) | (1L << (Dollar - 179)) | (1L << (OpenRoundBracket - 179)) | (1L << (OpenSquareBracket - 179)) | (1L << (VarName - 179)) | (1L << (Label - 179)) | (1L << (Octal - 179)) | (1L << (Decimal - 179)) | (1L << (Real - 179)) | (1L << (Hex - 179)) | (1L << (Binary - 179)) | (1L << (BackQuoteString - 179)) | (1L << (SingleQuoteString - 179)) | (1L << (DoubleQuote - 179)) | (1L << (StartNowDoc - 179)) | (1L << (StartHereDoc - 179)))) != 0)) {
				{
				setState(660);
				expressionList();
				}
			}

			setState(663);
			match(SemiColon);
			setState(665);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 40)) & ~0x3f) == 0 && ((1L << (_la - 40)) & ((1L << (Abstract - 40)) | (1L << (Array - 40)) | (1L << (As - 40)) | (1L << (BinaryCast - 40)) | (1L << (BoolType - 40)) | (1L << (BooleanConstant - 40)) | (1L << (Break - 40)) | (1L << (Callable - 40)) | (1L << (Case - 40)) | (1L << (Catch - 40)) | (1L << (Class - 40)) | (1L << (Clone - 40)) | (1L << (Const - 40)) | (1L << (Continue - 40)) | (1L << (Declare - 40)) | (1L << (Default - 40)) | (1L << (Do - 40)) | (1L << (DoubleCast - 40)) | (1L << (DoubleType - 40)) | (1L << (Echo - 40)) | (1L << (Else - 40)) | (1L << (ElseIf - 40)) | (1L << (Empty - 40)) | (1L << (EndDeclare - 40)) | (1L << (EndFor - 40)) | (1L << (EndForeach - 40)) | (1L << (EndIf - 40)) | (1L << (EndSwitch - 40)) | (1L << (EndWhile - 40)) | (1L << (Eval - 40)) | (1L << (Exit - 40)) | (1L << (Extends - 40)) | (1L << (Final - 40)) | (1L << (Finally - 40)) | (1L << (FloatCast - 40)) | (1L << (For - 40)) | (1L << (Foreach - 40)) | (1L << (Function - 40)) | (1L << (Global - 40)) | (1L << (Goto - 40)) | (1L << (If - 40)) | (1L << (Implements - 40)) | (1L << (Import - 40)) | (1L << (Include - 40)) | (1L << (IncludeOnce - 40)) | (1L << (InstanceOf - 40)) | (1L << (InsteadOf - 40)) | (1L << (Int8Cast - 40)) | (1L << (Int16Cast - 40)) | (1L << (Int64Type - 40)) | (1L << (IntType - 40)) | (1L << (Interface - 40)) | (1L << (IsSet - 40)) | (1L << (List - 40)) | (1L << (LogicalAnd - 40)) | (1L << (LogicalOr - 40)) | (1L << (LogicalXor - 40)) | (1L << (Namespace - 40)) | (1L << (New - 40)) | (1L << (Null - 40)) | (1L << (ObjectType - 40)) | (1L << (Parent_ - 40)) | (1L << (Partial - 40)) | (1L << (Print - 40)))) != 0) || ((((_la - 104)) & ~0x3f) == 0 && ((1L << (_la - 104)) & ((1L << (Private - 104)) | (1L << (Protected - 104)) | (1L << (Public - 104)) | (1L << (Require - 104)) | (1L << (RequireOnce - 104)) | (1L << (Resource - 104)) | (1L << (Return - 104)) | (1L << (Static - 104)) | (1L << (StringType - 104)) | (1L << (Switch - 104)) | (1L << (Throw - 104)) | (1L << (Trait - 104)) | (1L << (Try - 104)) | (1L << (Typeof - 104)) | (1L << (UintCast - 104)) | (1L << (UnicodeCast - 104)) | (1L << (Unset - 104)) | (1L << (Use - 104)) | (1L << (Var - 104)) | (1L << (While - 104)) | (1L << (Yield - 104)) | (1L << (Get - 104)) | (1L << (Set - 104)) | (1L << (Call - 104)) | (1L << (CallStatic - 104)) | (1L << (Constructor - 104)) | (1L << (Destruct - 104)) | (1L << (Wakeup - 104)) | (1L << (Sleep - 104)) | (1L << (Autoload - 104)) | (1L << (IsSet__ - 104)) | (1L << (Unset__ - 104)) | (1L << (ToString__ - 104)) | (1L << (Invoke - 104)) | (1L << (SetState - 104)) | (1L << (Clone__ - 104)) | (1L << (DebugInfo - 104)) | (1L << (Namespace__ - 104)) | (1L << (Class__ - 104)) | (1L << (Traic__ - 104)) | (1L << (Function__ - 104)) | (1L << (Method__ - 104)) | (1L << (Line__ - 104)) | (1L << (File__ - 104)) | (1L << (Dir__ - 104)) | (1L << (Inc - 104)) | (1L << (Dec - 104)))) != 0) || ((((_la - 179)) & ~0x3f) == 0 && ((1L << (_la - 179)) & ((1L << (NamespaceSeparator - 179)) | (1L << (Bang - 179)) | (1L << (Plus - 179)) | (1L << (Minus - 179)) | (1L << (Tilde - 179)) | (1L << (SuppressWarnings - 179)) | (1L << (Dollar - 179)) | (1L << (OpenRoundBracket - 179)) | (1L << (OpenSquareBracket - 179)) | (1L << (VarName - 179)) | (1L << (Label - 179)) | (1L << (Octal - 179)) | (1L << (Decimal - 179)) | (1L << (Real - 179)) | (1L << (Hex - 179)) | (1L << (Binary - 179)) | (1L << (BackQuoteString - 179)) | (1L << (SingleQuoteString - 179)) | (1L << (DoubleQuote - 179)) | (1L << (StartNowDoc - 179)) | (1L << (StartHereDoc - 179)))) != 0)) {
				{
				setState(664);
				forUpdate();
				}
			}

			setState(667);
			match(CloseRoundBracket);
			setState(674);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HtmlText:
			case HtmlScriptOpen:
			case HtmlStyleOpen:
			case HtmlDtd:
			case HtmlOpen:
			case HtmlClose:
			case HtmlSlashClose:
			case HtmlSlash:
			case HtmlEquals:
			case HtmlStartQuoteString:
			case HtmlStartDoubleQuoteString:
			case HtmlHex:
			case HtmlDecimal:
			case HtmlName:
			case HtmlEndQuoteString:
			case HtmlQuoteString:
			case HtmlEndDoubleQuoteString:
			case HtmlDoubleQuoteString:
			case ScriptText:
			case ScriptClose:
			case StyleBody:
			case Abstract:
			case Array:
			case As:
			case BinaryCast:
			case BoolType:
			case BooleanConstant:
			case Break:
			case Callable:
			case Case:
			case Catch:
			case Class:
			case Clone:
			case Const:
			case Continue:
			case Declare:
			case Default:
			case Do:
			case DoubleCast:
			case DoubleType:
			case Echo:
			case Else:
			case ElseIf:
			case Empty:
			case EndDeclare:
			case EndFor:
			case EndForeach:
			case EndIf:
			case EndSwitch:
			case EndWhile:
			case Eval:
			case Exit:
			case Extends:
			case Final:
			case Finally:
			case FloatCast:
			case For:
			case Foreach:
			case Function:
			case Global:
			case Goto:
			case If:
			case Implements:
			case Import:
			case Include:
			case IncludeOnce:
			case InstanceOf:
			case InsteadOf:
			case Int8Cast:
			case Int16Cast:
			case Int64Type:
			case IntType:
			case Interface:
			case IsSet:
			case List:
			case LogicalAnd:
			case LogicalOr:
			case LogicalXor:
			case Namespace:
			case New:
			case Null:
			case ObjectType:
			case Parent_:
			case Partial:
			case Print:
			case Private:
			case Protected:
			case Public:
			case Require:
			case RequireOnce:
			case Resource:
			case Return:
			case Static:
			case StringType:
			case Switch:
			case Throw:
			case Trait:
			case Try:
			case Typeof:
			case UintCast:
			case UnicodeCast:
			case Unset:
			case Use:
			case Var:
			case While:
			case Yield:
			case Get:
			case Set:
			case Call:
			case CallStatic:
			case Constructor:
			case Destruct:
			case Wakeup:
			case Sleep:
			case Autoload:
			case IsSet__:
			case Unset__:
			case ToString__:
			case Invoke:
			case SetState:
			case Clone__:
			case DebugInfo:
			case Namespace__:
			case Class__:
			case Traic__:
			case Function__:
			case Method__:
			case Line__:
			case File__:
			case Dir__:
			case Inc:
			case Dec:
			case NamespaceSeparator:
			case Bang:
			case Plus:
			case Minus:
			case Tilde:
			case SuppressWarnings:
			case Dollar:
			case OpenRoundBracket:
			case OpenSquareBracket:
			case OpenCurlyBracket:
			case SemiColon:
			case VarName:
			case Label:
			case Octal:
			case Decimal:
			case Real:
			case Hex:
			case Binary:
			case BackQuoteString:
			case SingleQuoteString:
			case DoubleQuote:
			case StartNowDoc:
			case StartHereDoc:
				{
				setState(668);
				statement();
				}
				break;
			case Colon:
				{
				setState(669);
				match(Colon);
				setState(670);
				innerStatementList();
				setState(671);
				match(EndFor);
				setState(672);
				match(SemiColon);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ForInitContext extends ParserRuleContext {
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ForInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterForInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitForInit(this);
		}
	}

	public final ForInitContext forInit() throws RecognitionException {
		ForInitContext _localctx = new ForInitContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_forInit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(676);
			expressionList();
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

	public static class ForUpdateContext extends ParserRuleContext {
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ForUpdateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forUpdate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterForUpdate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitForUpdate(this);
		}
	}

	public final ForUpdateContext forUpdate() throws RecognitionException {
		ForUpdateContext _localctx = new ForUpdateContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_forUpdate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(678);
			expressionList();
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

	public static class SwitchStatementContext extends ParserRuleContext {
		public TerminalNode Switch() { return getToken(PHPParser.Switch, 0); }
		public ParenthesisContext parenthesis() {
			return getRuleContext(ParenthesisContext.class,0);
		}
		public TerminalNode OpenCurlyBracket() { return getToken(PHPParser.OpenCurlyBracket, 0); }
		public TerminalNode EndSwitch() { return getToken(PHPParser.EndSwitch, 0); }
		public List<SwitchBlockContext> switchBlock() {
			return getRuleContexts(SwitchBlockContext.class);
		}
		public SwitchBlockContext switchBlock(int i) {
			return getRuleContext(SwitchBlockContext.class,i);
		}
		public SwitchStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterSwitchStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitSwitchStatement(this);
		}
	}

	public final SwitchStatementContext switchStatement() throws RecognitionException {
		SwitchStatementContext _localctx = new SwitchStatementContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_switchStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(680);
			match(Switch);
			setState(681);
			parenthesis();
			setState(705);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OpenCurlyBracket:
				{
				setState(682);
				match(OpenCurlyBracket);
				setState(684);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SemiColon) {
					{
					setState(683);
					match(SemiColon);
					}
				}

				setState(689);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Case || _la==Default) {
					{
					{
					setState(686);
					switchBlock();
					}
					}
					setState(691);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(692);
				match(CloseCurlyBracket);
				}
				break;
			case Colon:
				{
				setState(693);
				match(Colon);
				setState(695);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SemiColon) {
					{
					setState(694);
					match(SemiColon);
					}
				}

				setState(700);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Case || _la==Default) {
					{
					{
					setState(697);
					switchBlock();
					}
					}
					setState(702);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(703);
				match(EndSwitch);
				setState(704);
				match(SemiColon);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class SwitchBlockContext extends ParserRuleContext {
		public InnerStatementListContext innerStatementList() {
			return getRuleContext(InnerStatementListContext.class,0);
		}
		public List<TerminalNode> Case() { return getTokens(PHPParser.Case); }
		public TerminalNode Case(int i) {
			return getToken(PHPParser.Case, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> Default() { return getTokens(PHPParser.Default); }
		public TerminalNode Default(int i) {
			return getToken(PHPParser.Default, i);
		}
		public SwitchBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterSwitchBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitSwitchBlock(this);
		}
	}

	public final SwitchBlockContext switchBlock() throws RecognitionException {
		SwitchBlockContext _localctx = new SwitchBlockContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_switchBlock);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(713); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(710);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case Case:
						{
						setState(707);
						match(Case);
						setState(708);
						expression(0);
						}
						break;
					case Default:
						{
						setState(709);
						match(Default);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(712);
					_la = _input.LA(1);
					if ( !(_la==Colon || _la==SemiColon) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(715); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(717);
			innerStatementList();
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

	public static class BreakStatementContext extends ParserRuleContext {
		public TerminalNode Break() { return getToken(PHPParser.Break, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BreakStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterBreakStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitBreakStatement(this);
		}
	}

	public final BreakStatementContext breakStatement() throws RecognitionException {
		BreakStatementContext _localctx = new BreakStatementContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_breakStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(719);
			match(Break);
			setState(721);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 40)) & ~0x3f) == 0 && ((1L << (_la - 40)) & ((1L << (Abstract - 40)) | (1L << (Array - 40)) | (1L << (As - 40)) | (1L << (BinaryCast - 40)) | (1L << (BoolType - 40)) | (1L << (BooleanConstant - 40)) | (1L << (Break - 40)) | (1L << (Callable - 40)) | (1L << (Case - 40)) | (1L << (Catch - 40)) | (1L << (Class - 40)) | (1L << (Clone - 40)) | (1L << (Const - 40)) | (1L << (Continue - 40)) | (1L << (Declare - 40)) | (1L << (Default - 40)) | (1L << (Do - 40)) | (1L << (DoubleCast - 40)) | (1L << (DoubleType - 40)) | (1L << (Echo - 40)) | (1L << (Else - 40)) | (1L << (ElseIf - 40)) | (1L << (Empty - 40)) | (1L << (EndDeclare - 40)) | (1L << (EndFor - 40)) | (1L << (EndForeach - 40)) | (1L << (EndIf - 40)) | (1L << (EndSwitch - 40)) | (1L << (EndWhile - 40)) | (1L << (Eval - 40)) | (1L << (Exit - 40)) | (1L << (Extends - 40)) | (1L << (Final - 40)) | (1L << (Finally - 40)) | (1L << (FloatCast - 40)) | (1L << (For - 40)) | (1L << (Foreach - 40)) | (1L << (Function - 40)) | (1L << (Global - 40)) | (1L << (Goto - 40)) | (1L << (If - 40)) | (1L << (Implements - 40)) | (1L << (Import - 40)) | (1L << (Include - 40)) | (1L << (IncludeOnce - 40)) | (1L << (InstanceOf - 40)) | (1L << (InsteadOf - 40)) | (1L << (Int8Cast - 40)) | (1L << (Int16Cast - 40)) | (1L << (Int64Type - 40)) | (1L << (IntType - 40)) | (1L << (Interface - 40)) | (1L << (IsSet - 40)) | (1L << (List - 40)) | (1L << (LogicalAnd - 40)) | (1L << (LogicalOr - 40)) | (1L << (LogicalXor - 40)) | (1L << (Namespace - 40)) | (1L << (New - 40)) | (1L << (Null - 40)) | (1L << (ObjectType - 40)) | (1L << (Parent_ - 40)) | (1L << (Partial - 40)) | (1L << (Print - 40)))) != 0) || ((((_la - 104)) & ~0x3f) == 0 && ((1L << (_la - 104)) & ((1L << (Private - 104)) | (1L << (Protected - 104)) | (1L << (Public - 104)) | (1L << (Require - 104)) | (1L << (RequireOnce - 104)) | (1L << (Resource - 104)) | (1L << (Return - 104)) | (1L << (Static - 104)) | (1L << (StringType - 104)) | (1L << (Switch - 104)) | (1L << (Throw - 104)) | (1L << (Trait - 104)) | (1L << (Try - 104)) | (1L << (Typeof - 104)) | (1L << (UintCast - 104)) | (1L << (UnicodeCast - 104)) | (1L << (Unset - 104)) | (1L << (Use - 104)) | (1L << (Var - 104)) | (1L << (While - 104)) | (1L << (Yield - 104)) | (1L << (Get - 104)) | (1L << (Set - 104)) | (1L << (Call - 104)) | (1L << (CallStatic - 104)) | (1L << (Constructor - 104)) | (1L << (Destruct - 104)) | (1L << (Wakeup - 104)) | (1L << (Sleep - 104)) | (1L << (Autoload - 104)) | (1L << (IsSet__ - 104)) | (1L << (Unset__ - 104)) | (1L << (ToString__ - 104)) | (1L << (Invoke - 104)) | (1L << (SetState - 104)) | (1L << (Clone__ - 104)) | (1L << (DebugInfo - 104)) | (1L << (Namespace__ - 104)) | (1L << (Class__ - 104)) | (1L << (Traic__ - 104)) | (1L << (Function__ - 104)) | (1L << (Method__ - 104)) | (1L << (Line__ - 104)) | (1L << (File__ - 104)) | (1L << (Dir__ - 104)) | (1L << (Inc - 104)) | (1L << (Dec - 104)))) != 0) || ((((_la - 179)) & ~0x3f) == 0 && ((1L << (_la - 179)) & ((1L << (NamespaceSeparator - 179)) | (1L << (Bang - 179)) | (1L << (Plus - 179)) | (1L << (Minus - 179)) | (1L << (Tilde - 179)) | (1L << (SuppressWarnings - 179)) | (1L << (Dollar - 179)) | (1L << (OpenRoundBracket - 179)) | (1L << (OpenSquareBracket - 179)) | (1L << (VarName - 179)) | (1L << (Label - 179)) | (1L << (Octal - 179)) | (1L << (Decimal - 179)) | (1L << (Real - 179)) | (1L << (Hex - 179)) | (1L << (Binary - 179)) | (1L << (BackQuoteString - 179)) | (1L << (SingleQuoteString - 179)) | (1L << (DoubleQuote - 179)) | (1L << (StartNowDoc - 179)) | (1L << (StartHereDoc - 179)))) != 0)) {
				{
				setState(720);
				expression(0);
				}
			}

			setState(723);
			match(SemiColon);
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

	public static class ContinueStatementContext extends ParserRuleContext {
		public TerminalNode Continue() { return getToken(PHPParser.Continue, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ContinueStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continueStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterContinueStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitContinueStatement(this);
		}
	}

	public final ContinueStatementContext continueStatement() throws RecognitionException {
		ContinueStatementContext _localctx = new ContinueStatementContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_continueStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(725);
			match(Continue);
			setState(727);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 40)) & ~0x3f) == 0 && ((1L << (_la - 40)) & ((1L << (Abstract - 40)) | (1L << (Array - 40)) | (1L << (As - 40)) | (1L << (BinaryCast - 40)) | (1L << (BoolType - 40)) | (1L << (BooleanConstant - 40)) | (1L << (Break - 40)) | (1L << (Callable - 40)) | (1L << (Case - 40)) | (1L << (Catch - 40)) | (1L << (Class - 40)) | (1L << (Clone - 40)) | (1L << (Const - 40)) | (1L << (Continue - 40)) | (1L << (Declare - 40)) | (1L << (Default - 40)) | (1L << (Do - 40)) | (1L << (DoubleCast - 40)) | (1L << (DoubleType - 40)) | (1L << (Echo - 40)) | (1L << (Else - 40)) | (1L << (ElseIf - 40)) | (1L << (Empty - 40)) | (1L << (EndDeclare - 40)) | (1L << (EndFor - 40)) | (1L << (EndForeach - 40)) | (1L << (EndIf - 40)) | (1L << (EndSwitch - 40)) | (1L << (EndWhile - 40)) | (1L << (Eval - 40)) | (1L << (Exit - 40)) | (1L << (Extends - 40)) | (1L << (Final - 40)) | (1L << (Finally - 40)) | (1L << (FloatCast - 40)) | (1L << (For - 40)) | (1L << (Foreach - 40)) | (1L << (Function - 40)) | (1L << (Global - 40)) | (1L << (Goto - 40)) | (1L << (If - 40)) | (1L << (Implements - 40)) | (1L << (Import - 40)) | (1L << (Include - 40)) | (1L << (IncludeOnce - 40)) | (1L << (InstanceOf - 40)) | (1L << (InsteadOf - 40)) | (1L << (Int8Cast - 40)) | (1L << (Int16Cast - 40)) | (1L << (Int64Type - 40)) | (1L << (IntType - 40)) | (1L << (Interface - 40)) | (1L << (IsSet - 40)) | (1L << (List - 40)) | (1L << (LogicalAnd - 40)) | (1L << (LogicalOr - 40)) | (1L << (LogicalXor - 40)) | (1L << (Namespace - 40)) | (1L << (New - 40)) | (1L << (Null - 40)) | (1L << (ObjectType - 40)) | (1L << (Parent_ - 40)) | (1L << (Partial - 40)) | (1L << (Print - 40)))) != 0) || ((((_la - 104)) & ~0x3f) == 0 && ((1L << (_la - 104)) & ((1L << (Private - 104)) | (1L << (Protected - 104)) | (1L << (Public - 104)) | (1L << (Require - 104)) | (1L << (RequireOnce - 104)) | (1L << (Resource - 104)) | (1L << (Return - 104)) | (1L << (Static - 104)) | (1L << (StringType - 104)) | (1L << (Switch - 104)) | (1L << (Throw - 104)) | (1L << (Trait - 104)) | (1L << (Try - 104)) | (1L << (Typeof - 104)) | (1L << (UintCast - 104)) | (1L << (UnicodeCast - 104)) | (1L << (Unset - 104)) | (1L << (Use - 104)) | (1L << (Var - 104)) | (1L << (While - 104)) | (1L << (Yield - 104)) | (1L << (Get - 104)) | (1L << (Set - 104)) | (1L << (Call - 104)) | (1L << (CallStatic - 104)) | (1L << (Constructor - 104)) | (1L << (Destruct - 104)) | (1L << (Wakeup - 104)) | (1L << (Sleep - 104)) | (1L << (Autoload - 104)) | (1L << (IsSet__ - 104)) | (1L << (Unset__ - 104)) | (1L << (ToString__ - 104)) | (1L << (Invoke - 104)) | (1L << (SetState - 104)) | (1L << (Clone__ - 104)) | (1L << (DebugInfo - 104)) | (1L << (Namespace__ - 104)) | (1L << (Class__ - 104)) | (1L << (Traic__ - 104)) | (1L << (Function__ - 104)) | (1L << (Method__ - 104)) | (1L << (Line__ - 104)) | (1L << (File__ - 104)) | (1L << (Dir__ - 104)) | (1L << (Inc - 104)) | (1L << (Dec - 104)))) != 0) || ((((_la - 179)) & ~0x3f) == 0 && ((1L << (_la - 179)) & ((1L << (NamespaceSeparator - 179)) | (1L << (Bang - 179)) | (1L << (Plus - 179)) | (1L << (Minus - 179)) | (1L << (Tilde - 179)) | (1L << (SuppressWarnings - 179)) | (1L << (Dollar - 179)) | (1L << (OpenRoundBracket - 179)) | (1L << (OpenSquareBracket - 179)) | (1L << (VarName - 179)) | (1L << (Label - 179)) | (1L << (Octal - 179)) | (1L << (Decimal - 179)) | (1L << (Real - 179)) | (1L << (Hex - 179)) | (1L << (Binary - 179)) | (1L << (BackQuoteString - 179)) | (1L << (SingleQuoteString - 179)) | (1L << (DoubleQuote - 179)) | (1L << (StartNowDoc - 179)) | (1L << (StartHereDoc - 179)))) != 0)) {
				{
				setState(726);
				expression(0);
				}
			}

			setState(729);
			match(SemiColon);
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

	public static class ReturnStatementContext extends ParserRuleContext {
		public TerminalNode Return() { return getToken(PHPParser.Return, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitReturnStatement(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_returnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(731);
			match(Return);
			setState(733);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 40)) & ~0x3f) == 0 && ((1L << (_la - 40)) & ((1L << (Abstract - 40)) | (1L << (Array - 40)) | (1L << (As - 40)) | (1L << (BinaryCast - 40)) | (1L << (BoolType - 40)) | (1L << (BooleanConstant - 40)) | (1L << (Break - 40)) | (1L << (Callable - 40)) | (1L << (Case - 40)) | (1L << (Catch - 40)) | (1L << (Class - 40)) | (1L << (Clone - 40)) | (1L << (Const - 40)) | (1L << (Continue - 40)) | (1L << (Declare - 40)) | (1L << (Default - 40)) | (1L << (Do - 40)) | (1L << (DoubleCast - 40)) | (1L << (DoubleType - 40)) | (1L << (Echo - 40)) | (1L << (Else - 40)) | (1L << (ElseIf - 40)) | (1L << (Empty - 40)) | (1L << (EndDeclare - 40)) | (1L << (EndFor - 40)) | (1L << (EndForeach - 40)) | (1L << (EndIf - 40)) | (1L << (EndSwitch - 40)) | (1L << (EndWhile - 40)) | (1L << (Eval - 40)) | (1L << (Exit - 40)) | (1L << (Extends - 40)) | (1L << (Final - 40)) | (1L << (Finally - 40)) | (1L << (FloatCast - 40)) | (1L << (For - 40)) | (1L << (Foreach - 40)) | (1L << (Function - 40)) | (1L << (Global - 40)) | (1L << (Goto - 40)) | (1L << (If - 40)) | (1L << (Implements - 40)) | (1L << (Import - 40)) | (1L << (Include - 40)) | (1L << (IncludeOnce - 40)) | (1L << (InstanceOf - 40)) | (1L << (InsteadOf - 40)) | (1L << (Int8Cast - 40)) | (1L << (Int16Cast - 40)) | (1L << (Int64Type - 40)) | (1L << (IntType - 40)) | (1L << (Interface - 40)) | (1L << (IsSet - 40)) | (1L << (List - 40)) | (1L << (LogicalAnd - 40)) | (1L << (LogicalOr - 40)) | (1L << (LogicalXor - 40)) | (1L << (Namespace - 40)) | (1L << (New - 40)) | (1L << (Null - 40)) | (1L << (ObjectType - 40)) | (1L << (Parent_ - 40)) | (1L << (Partial - 40)) | (1L << (Print - 40)))) != 0) || ((((_la - 104)) & ~0x3f) == 0 && ((1L << (_la - 104)) & ((1L << (Private - 104)) | (1L << (Protected - 104)) | (1L << (Public - 104)) | (1L << (Require - 104)) | (1L << (RequireOnce - 104)) | (1L << (Resource - 104)) | (1L << (Return - 104)) | (1L << (Static - 104)) | (1L << (StringType - 104)) | (1L << (Switch - 104)) | (1L << (Throw - 104)) | (1L << (Trait - 104)) | (1L << (Try - 104)) | (1L << (Typeof - 104)) | (1L << (UintCast - 104)) | (1L << (UnicodeCast - 104)) | (1L << (Unset - 104)) | (1L << (Use - 104)) | (1L << (Var - 104)) | (1L << (While - 104)) | (1L << (Yield - 104)) | (1L << (Get - 104)) | (1L << (Set - 104)) | (1L << (Call - 104)) | (1L << (CallStatic - 104)) | (1L << (Constructor - 104)) | (1L << (Destruct - 104)) | (1L << (Wakeup - 104)) | (1L << (Sleep - 104)) | (1L << (Autoload - 104)) | (1L << (IsSet__ - 104)) | (1L << (Unset__ - 104)) | (1L << (ToString__ - 104)) | (1L << (Invoke - 104)) | (1L << (SetState - 104)) | (1L << (Clone__ - 104)) | (1L << (DebugInfo - 104)) | (1L << (Namespace__ - 104)) | (1L << (Class__ - 104)) | (1L << (Traic__ - 104)) | (1L << (Function__ - 104)) | (1L << (Method__ - 104)) | (1L << (Line__ - 104)) | (1L << (File__ - 104)) | (1L << (Dir__ - 104)) | (1L << (Inc - 104)) | (1L << (Dec - 104)))) != 0) || ((((_la - 179)) & ~0x3f) == 0 && ((1L << (_la - 179)) & ((1L << (NamespaceSeparator - 179)) | (1L << (Bang - 179)) | (1L << (Plus - 179)) | (1L << (Minus - 179)) | (1L << (Tilde - 179)) | (1L << (SuppressWarnings - 179)) | (1L << (Dollar - 179)) | (1L << (OpenRoundBracket - 179)) | (1L << (OpenSquareBracket - 179)) | (1L << (VarName - 179)) | (1L << (Label - 179)) | (1L << (Octal - 179)) | (1L << (Decimal - 179)) | (1L << (Real - 179)) | (1L << (Hex - 179)) | (1L << (Binary - 179)) | (1L << (BackQuoteString - 179)) | (1L << (SingleQuoteString - 179)) | (1L << (DoubleQuote - 179)) | (1L << (StartNowDoc - 179)) | (1L << (StartHereDoc - 179)))) != 0)) {
				{
				setState(732);
				expression(0);
				}
			}

			setState(735);
			match(SemiColon);
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

	public static class ExpressionStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitExpressionStatement(this);
		}
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_expressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(737);
			expression(0);
			setState(738);
			match(SemiColon);
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

	public static class UnsetStatementContext extends ParserRuleContext {
		public TerminalNode Unset() { return getToken(PHPParser.Unset, 0); }
		public ChainListContext chainList() {
			return getRuleContext(ChainListContext.class,0);
		}
		public UnsetStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unsetStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterUnsetStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitUnsetStatement(this);
		}
	}

	public final UnsetStatementContext unsetStatement() throws RecognitionException {
		UnsetStatementContext _localctx = new UnsetStatementContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_unsetStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(740);
			match(Unset);
			setState(741);
			match(OpenRoundBracket);
			setState(742);
			chainList();
			setState(743);
			match(CloseRoundBracket);
			setState(744);
			match(SemiColon);
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

	public static class ForeachStatementContext extends ParserRuleContext {
		public TerminalNode Foreach() { return getToken(PHPParser.Foreach, 0); }
		public List<ChainContext> chain() {
			return getRuleContexts(ChainContext.class);
		}
		public ChainContext chain(int i) {
			return getRuleContext(ChainContext.class,i);
		}
		public TerminalNode As() { return getToken(PHPParser.As, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode List() { return getToken(PHPParser.List, 0); }
		public AssignmentListContext assignmentList() {
			return getRuleContext(AssignmentListContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public InnerStatementListContext innerStatementList() {
			return getRuleContext(InnerStatementListContext.class,0);
		}
		public TerminalNode EndForeach() { return getToken(PHPParser.EndForeach, 0); }
		public ForeachStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreachStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterForeachStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitForeachStatement(this);
		}
	}

	public final ForeachStatementContext foreachStatement() throws RecognitionException {
		ForeachStatementContext _localctx = new ForeachStatementContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_foreachStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(746);
			match(Foreach);
			setState(785);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				{
				setState(747);
				match(OpenRoundBracket);
				setState(748);
				chain();
				setState(749);
				match(As);
				setState(751);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Ampersand) {
					{
					setState(750);
					match(Ampersand);
					}
				}

				setState(753);
				chain();
				setState(759);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DoubleArrow) {
					{
					setState(754);
					match(DoubleArrow);
					setState(756);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Ampersand) {
						{
						setState(755);
						match(Ampersand);
						}
					}

					setState(758);
					chain();
					}
				}

				setState(761);
				match(CloseRoundBracket);
				}
				break;
			case 2:
				{
				setState(763);
				match(OpenRoundBracket);
				setState(764);
				expression(0);
				setState(765);
				match(As);
				setState(766);
				chain();
				setState(772);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DoubleArrow) {
					{
					setState(767);
					match(DoubleArrow);
					setState(769);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Ampersand) {
						{
						setState(768);
						match(Ampersand);
						}
					}

					setState(771);
					chain();
					}
				}

				setState(774);
				match(CloseRoundBracket);
				}
				break;
			case 3:
				{
				setState(776);
				match(OpenRoundBracket);
				setState(777);
				chain();
				setState(778);
				match(As);
				setState(779);
				match(List);
				setState(780);
				match(OpenRoundBracket);
				setState(781);
				assignmentList();
				setState(782);
				match(CloseRoundBracket);
				setState(783);
				match(CloseRoundBracket);
				}
				break;
			}
			setState(793);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HtmlText:
			case HtmlScriptOpen:
			case HtmlStyleOpen:
			case HtmlDtd:
			case HtmlOpen:
			case HtmlClose:
			case HtmlSlashClose:
			case HtmlSlash:
			case HtmlEquals:
			case HtmlStartQuoteString:
			case HtmlStartDoubleQuoteString:
			case HtmlHex:
			case HtmlDecimal:
			case HtmlName:
			case HtmlEndQuoteString:
			case HtmlQuoteString:
			case HtmlEndDoubleQuoteString:
			case HtmlDoubleQuoteString:
			case ScriptText:
			case ScriptClose:
			case StyleBody:
			case Abstract:
			case Array:
			case As:
			case BinaryCast:
			case BoolType:
			case BooleanConstant:
			case Break:
			case Callable:
			case Case:
			case Catch:
			case Class:
			case Clone:
			case Const:
			case Continue:
			case Declare:
			case Default:
			case Do:
			case DoubleCast:
			case DoubleType:
			case Echo:
			case Else:
			case ElseIf:
			case Empty:
			case EndDeclare:
			case EndFor:
			case EndForeach:
			case EndIf:
			case EndSwitch:
			case EndWhile:
			case Eval:
			case Exit:
			case Extends:
			case Final:
			case Finally:
			case FloatCast:
			case For:
			case Foreach:
			case Function:
			case Global:
			case Goto:
			case If:
			case Implements:
			case Import:
			case Include:
			case IncludeOnce:
			case InstanceOf:
			case InsteadOf:
			case Int8Cast:
			case Int16Cast:
			case Int64Type:
			case IntType:
			case Interface:
			case IsSet:
			case List:
			case LogicalAnd:
			case LogicalOr:
			case LogicalXor:
			case Namespace:
			case New:
			case Null:
			case ObjectType:
			case Parent_:
			case Partial:
			case Print:
			case Private:
			case Protected:
			case Public:
			case Require:
			case RequireOnce:
			case Resource:
			case Return:
			case Static:
			case StringType:
			case Switch:
			case Throw:
			case Trait:
			case Try:
			case Typeof:
			case UintCast:
			case UnicodeCast:
			case Unset:
			case Use:
			case Var:
			case While:
			case Yield:
			case Get:
			case Set:
			case Call:
			case CallStatic:
			case Constructor:
			case Destruct:
			case Wakeup:
			case Sleep:
			case Autoload:
			case IsSet__:
			case Unset__:
			case ToString__:
			case Invoke:
			case SetState:
			case Clone__:
			case DebugInfo:
			case Namespace__:
			case Class__:
			case Traic__:
			case Function__:
			case Method__:
			case Line__:
			case File__:
			case Dir__:
			case Inc:
			case Dec:
			case NamespaceSeparator:
			case Bang:
			case Plus:
			case Minus:
			case Tilde:
			case SuppressWarnings:
			case Dollar:
			case OpenRoundBracket:
			case OpenSquareBracket:
			case OpenCurlyBracket:
			case SemiColon:
			case VarName:
			case Label:
			case Octal:
			case Decimal:
			case Real:
			case Hex:
			case Binary:
			case BackQuoteString:
			case SingleQuoteString:
			case DoubleQuote:
			case StartNowDoc:
			case StartHereDoc:
				{
				setState(787);
				statement();
				}
				break;
			case Colon:
				{
				setState(788);
				match(Colon);
				setState(789);
				innerStatementList();
				setState(790);
				match(EndForeach);
				setState(791);
				match(SemiColon);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class TryCatchFinallyContext extends ParserRuleContext {
		public TerminalNode Try() { return getToken(PHPParser.Try, 0); }
		public BlockStatementContext blockStatement() {
			return getRuleContext(BlockStatementContext.class,0);
		}
		public FinallyStatementContext finallyStatement() {
			return getRuleContext(FinallyStatementContext.class,0);
		}
		public List<CatchClauseContext> catchClause() {
			return getRuleContexts(CatchClauseContext.class);
		}
		public CatchClauseContext catchClause(int i) {
			return getRuleContext(CatchClauseContext.class,i);
		}
		public TryCatchFinallyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tryCatchFinally; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterTryCatchFinally(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitTryCatchFinally(this);
		}
	}

	public final TryCatchFinallyContext tryCatchFinally() throws RecognitionException {
		TryCatchFinallyContext _localctx = new TryCatchFinallyContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_tryCatchFinally);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(795);
			match(Try);
			setState(796);
			blockStatement();
			setState(812);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				{
				setState(798); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(797);
						catchClause();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(800); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,72,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(803);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
				case 1:
					{
					setState(802);
					finallyStatement();
					}
					break;
				}
				}
				break;
			case 2:
				{
				setState(808);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Catch) {
					{
					{
					setState(805);
					catchClause();
					}
					}
					setState(810);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(811);
				finallyStatement();
				}
				break;
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

	public static class CatchClauseContext extends ParserRuleContext {
		public TerminalNode Catch() { return getToken(PHPParser.Catch, 0); }
		public QualifiedStaticTypeRefContext qualifiedStaticTypeRef() {
			return getRuleContext(QualifiedStaticTypeRefContext.class,0);
		}
		public TerminalNode VarName() { return getToken(PHPParser.VarName, 0); }
		public BlockStatementContext blockStatement() {
			return getRuleContext(BlockStatementContext.class,0);
		}
		public CatchClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterCatchClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitCatchClause(this);
		}
	}

	public final CatchClauseContext catchClause() throws RecognitionException {
		CatchClauseContext _localctx = new CatchClauseContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_catchClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(814);
			match(Catch);
			setState(815);
			match(OpenRoundBracket);
			setState(816);
			qualifiedStaticTypeRef();
			setState(817);
			match(VarName);
			setState(818);
			match(CloseRoundBracket);
			setState(819);
			blockStatement();
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

	public static class FinallyStatementContext extends ParserRuleContext {
		public TerminalNode Finally() { return getToken(PHPParser.Finally, 0); }
		public BlockStatementContext blockStatement() {
			return getRuleContext(BlockStatementContext.class,0);
		}
		public FinallyStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finallyStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterFinallyStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitFinallyStatement(this);
		}
	}

	public final FinallyStatementContext finallyStatement() throws RecognitionException {
		FinallyStatementContext _localctx = new FinallyStatementContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_finallyStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(821);
			match(Finally);
			setState(822);
			blockStatement();
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

	public static class ThrowStatementContext extends ParserRuleContext {
		public TerminalNode Throw() { return getToken(PHPParser.Throw, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ThrowStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_throwStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterThrowStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitThrowStatement(this);
		}
	}

	public final ThrowStatementContext throwStatement() throws RecognitionException {
		ThrowStatementContext _localctx = new ThrowStatementContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_throwStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(824);
			match(Throw);
			setState(825);
			expression(0);
			setState(826);
			match(SemiColon);
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

	public static class GotoStatementContext extends ParserRuleContext {
		public TerminalNode Goto() { return getToken(PHPParser.Goto, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public GotoStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gotoStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterGotoStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitGotoStatement(this);
		}
	}

	public final GotoStatementContext gotoStatement() throws RecognitionException {
		GotoStatementContext _localctx = new GotoStatementContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_gotoStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(828);
			match(Goto);
			setState(829);
			identifier();
			setState(830);
			match(SemiColon);
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

	public static class DeclareStatementContext extends ParserRuleContext {
		public TerminalNode Declare() { return getToken(PHPParser.Declare, 0); }
		public DeclareListContext declareList() {
			return getRuleContext(DeclareListContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public InnerStatementListContext innerStatementList() {
			return getRuleContext(InnerStatementListContext.class,0);
		}
		public TerminalNode EndDeclare() { return getToken(PHPParser.EndDeclare, 0); }
		public DeclareStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declareStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterDeclareStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitDeclareStatement(this);
		}
	}

	public final DeclareStatementContext declareStatement() throws RecognitionException {
		DeclareStatementContext _localctx = new DeclareStatementContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_declareStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(832);
			match(Declare);
			setState(833);
			match(OpenRoundBracket);
			setState(834);
			declareList();
			setState(835);
			match(CloseRoundBracket);
			setState(842);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HtmlText:
			case HtmlScriptOpen:
			case HtmlStyleOpen:
			case HtmlDtd:
			case HtmlOpen:
			case HtmlClose:
			case HtmlSlashClose:
			case HtmlSlash:
			case HtmlEquals:
			case HtmlStartQuoteString:
			case HtmlStartDoubleQuoteString:
			case HtmlHex:
			case HtmlDecimal:
			case HtmlName:
			case HtmlEndQuoteString:
			case HtmlQuoteString:
			case HtmlEndDoubleQuoteString:
			case HtmlDoubleQuoteString:
			case ScriptText:
			case ScriptClose:
			case StyleBody:
			case Abstract:
			case Array:
			case As:
			case BinaryCast:
			case BoolType:
			case BooleanConstant:
			case Break:
			case Callable:
			case Case:
			case Catch:
			case Class:
			case Clone:
			case Const:
			case Continue:
			case Declare:
			case Default:
			case Do:
			case DoubleCast:
			case DoubleType:
			case Echo:
			case Else:
			case ElseIf:
			case Empty:
			case EndDeclare:
			case EndFor:
			case EndForeach:
			case EndIf:
			case EndSwitch:
			case EndWhile:
			case Eval:
			case Exit:
			case Extends:
			case Final:
			case Finally:
			case FloatCast:
			case For:
			case Foreach:
			case Function:
			case Global:
			case Goto:
			case If:
			case Implements:
			case Import:
			case Include:
			case IncludeOnce:
			case InstanceOf:
			case InsteadOf:
			case Int8Cast:
			case Int16Cast:
			case Int64Type:
			case IntType:
			case Interface:
			case IsSet:
			case List:
			case LogicalAnd:
			case LogicalOr:
			case LogicalXor:
			case Namespace:
			case New:
			case Null:
			case ObjectType:
			case Parent_:
			case Partial:
			case Print:
			case Private:
			case Protected:
			case Public:
			case Require:
			case RequireOnce:
			case Resource:
			case Return:
			case Static:
			case StringType:
			case Switch:
			case Throw:
			case Trait:
			case Try:
			case Typeof:
			case UintCast:
			case UnicodeCast:
			case Unset:
			case Use:
			case Var:
			case While:
			case Yield:
			case Get:
			case Set:
			case Call:
			case CallStatic:
			case Constructor:
			case Destruct:
			case Wakeup:
			case Sleep:
			case Autoload:
			case IsSet__:
			case Unset__:
			case ToString__:
			case Invoke:
			case SetState:
			case Clone__:
			case DebugInfo:
			case Namespace__:
			case Class__:
			case Traic__:
			case Function__:
			case Method__:
			case Line__:
			case File__:
			case Dir__:
			case Inc:
			case Dec:
			case NamespaceSeparator:
			case Bang:
			case Plus:
			case Minus:
			case Tilde:
			case SuppressWarnings:
			case Dollar:
			case OpenRoundBracket:
			case OpenSquareBracket:
			case OpenCurlyBracket:
			case SemiColon:
			case VarName:
			case Label:
			case Octal:
			case Decimal:
			case Real:
			case Hex:
			case Binary:
			case BackQuoteString:
			case SingleQuoteString:
			case DoubleQuote:
			case StartNowDoc:
			case StartHereDoc:
				{
				setState(836);
				statement();
				}
				break;
			case Colon:
				{
				setState(837);
				match(Colon);
				setState(838);
				innerStatementList();
				setState(839);
				match(EndDeclare);
				setState(840);
				match(SemiColon);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class InlineHtmlContext extends ParserRuleContext {
		public List<HtmlElementsContext> htmlElements() {
			return getRuleContexts(HtmlElementsContext.class);
		}
		public HtmlElementsContext htmlElements(int i) {
			return getRuleContext(HtmlElementsContext.class,i);
		}
		public List<ScriptTextPartContext> scriptTextPart() {
			return getRuleContexts(ScriptTextPartContext.class);
		}
		public ScriptTextPartContext scriptTextPart(int i) {
			return getRuleContext(ScriptTextPartContext.class,i);
		}
		public InlineHtmlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inlineHtml; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterInlineHtml(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitInlineHtml(this);
		}
	}

	public final InlineHtmlContext inlineHtml() throws RecognitionException {
		InlineHtmlContext _localctx = new InlineHtmlContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_inlineHtml);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(846); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(846);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case HtmlText:
					case HtmlScriptOpen:
					case HtmlStyleOpen:
					case HtmlDtd:
					case HtmlOpen:
					case HtmlClose:
					case HtmlSlashClose:
					case HtmlSlash:
					case HtmlEquals:
					case HtmlStartQuoteString:
					case HtmlStartDoubleQuoteString:
					case HtmlHex:
					case HtmlDecimal:
					case HtmlName:
					case HtmlEndQuoteString:
					case HtmlQuoteString:
					case HtmlEndDoubleQuoteString:
					case HtmlDoubleQuoteString:
					case ScriptClose:
					case StyleBody:
						{
						setState(844);
						htmlElements();
						}
						break;
					case ScriptText:
						{
						setState(845);
						scriptTextPart();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(848); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class DeclareListContext extends ParserRuleContext {
		public List<IdentifierInititalizerContext> identifierInititalizer() {
			return getRuleContexts(IdentifierInititalizerContext.class);
		}
		public IdentifierInititalizerContext identifierInititalizer(int i) {
			return getRuleContext(IdentifierInititalizerContext.class,i);
		}
		public DeclareListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declareList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterDeclareList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitDeclareList(this);
		}
	}

	public final DeclareListContext declareList() throws RecognitionException {
		DeclareListContext _localctx = new DeclareListContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_declareList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(850);
			identifierInititalizer();
			setState(855);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(851);
				match(Comma);
				setState(852);
				identifierInititalizer();
				}
				}
				setState(857);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class FormalParameterListContext extends ParserRuleContext {
		public List<FormalParameterContext> formalParameter() {
			return getRuleContexts(FormalParameterContext.class);
		}
		public FormalParameterContext formalParameter(int i) {
			return getRuleContext(FormalParameterContext.class,i);
		}
		public FormalParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterFormalParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitFormalParameterList(this);
		}
	}

	public final FormalParameterListContext formalParameterList() throws RecognitionException {
		FormalParameterListContext _localctx = new FormalParameterListContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_formalParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(859);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 40)) & ~0x3f) == 0 && ((1L << (_la - 40)) & ((1L << (Abstract - 40)) | (1L << (Array - 40)) | (1L << (As - 40)) | (1L << (BinaryCast - 40)) | (1L << (BoolType - 40)) | (1L << (BooleanConstant - 40)) | (1L << (Break - 40)) | (1L << (Callable - 40)) | (1L << (Case - 40)) | (1L << (Catch - 40)) | (1L << (Class - 40)) | (1L << (Clone - 40)) | (1L << (Const - 40)) | (1L << (Continue - 40)) | (1L << (Declare - 40)) | (1L << (Default - 40)) | (1L << (Do - 40)) | (1L << (DoubleCast - 40)) | (1L << (DoubleType - 40)) | (1L << (Echo - 40)) | (1L << (Else - 40)) | (1L << (ElseIf - 40)) | (1L << (Empty - 40)) | (1L << (EndDeclare - 40)) | (1L << (EndFor - 40)) | (1L << (EndForeach - 40)) | (1L << (EndIf - 40)) | (1L << (EndSwitch - 40)) | (1L << (EndWhile - 40)) | (1L << (Eval - 40)) | (1L << (Exit - 40)) | (1L << (Extends - 40)) | (1L << (Final - 40)) | (1L << (Finally - 40)) | (1L << (FloatCast - 40)) | (1L << (For - 40)) | (1L << (Foreach - 40)) | (1L << (Function - 40)) | (1L << (Global - 40)) | (1L << (Goto - 40)) | (1L << (If - 40)) | (1L << (Implements - 40)) | (1L << (Import - 40)) | (1L << (Include - 40)) | (1L << (IncludeOnce - 40)) | (1L << (InstanceOf - 40)) | (1L << (InsteadOf - 40)) | (1L << (Int8Cast - 40)) | (1L << (Int16Cast - 40)) | (1L << (Int64Type - 40)) | (1L << (IntType - 40)) | (1L << (Interface - 40)) | (1L << (IsSet - 40)) | (1L << (List - 40)) | (1L << (LogicalAnd - 40)) | (1L << (LogicalOr - 40)) | (1L << (LogicalXor - 40)) | (1L << (Namespace - 40)) | (1L << (New - 40)) | (1L << (Null - 40)) | (1L << (ObjectType - 40)) | (1L << (Parent_ - 40)) | (1L << (Partial - 40)) | (1L << (Print - 40)))) != 0) || ((((_la - 104)) & ~0x3f) == 0 && ((1L << (_la - 104)) & ((1L << (Private - 104)) | (1L << (Protected - 104)) | (1L << (Public - 104)) | (1L << (Require - 104)) | (1L << (RequireOnce - 104)) | (1L << (Resource - 104)) | (1L << (Return - 104)) | (1L << (Static - 104)) | (1L << (StringType - 104)) | (1L << (Switch - 104)) | (1L << (Throw - 104)) | (1L << (Trait - 104)) | (1L << (Try - 104)) | (1L << (Typeof - 104)) | (1L << (UintCast - 104)) | (1L << (UnicodeCast - 104)) | (1L << (Unset - 104)) | (1L << (Use - 104)) | (1L << (Var - 104)) | (1L << (While - 104)) | (1L << (Yield - 104)) | (1L << (Get - 104)) | (1L << (Set - 104)) | (1L << (Call - 104)) | (1L << (CallStatic - 104)) | (1L << (Constructor - 104)) | (1L << (Destruct - 104)) | (1L << (Wakeup - 104)) | (1L << (Sleep - 104)) | (1L << (Autoload - 104)) | (1L << (IsSet__ - 104)) | (1L << (Unset__ - 104)) | (1L << (ToString__ - 104)) | (1L << (Invoke - 104)) | (1L << (SetState - 104)) | (1L << (Clone__ - 104)) | (1L << (DebugInfo - 104)) | (1L << (Namespace__ - 104)) | (1L << (Class__ - 104)) | (1L << (Traic__ - 104)) | (1L << (Function__ - 104)) | (1L << (Method__ - 104)) | (1L << (Line__ - 104)) | (1L << (File__ - 104)) | (1L << (Dir__ - 104)))) != 0) || ((((_la - 179)) & ~0x3f) == 0 && ((1L << (_la - 179)) & ((1L << (NamespaceSeparator - 179)) | (1L << (Ellipsis - 179)) | (1L << (Ampersand - 179)) | (1L << (OpenSquareBracket - 179)) | (1L << (VarName - 179)) | (1L << (Label - 179)))) != 0)) {
				{
				setState(858);
				formalParameter();
				}
			}

			setState(865);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(861);
				match(Comma);
				setState(862);
				formalParameter();
				}
				}
				setState(867);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class FormalParameterContext extends ParserRuleContext {
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class,0);
		}
		public TypeHintContext typeHint() {
			return getRuleContext(TypeHintContext.class,0);
		}
		public FormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterFormalParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitFormalParameter(this);
		}
	}

	public final FormalParameterContext formalParameter() throws RecognitionException {
		FormalParameterContext _localctx = new FormalParameterContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_formalParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(868);
			attributes();
			setState(870);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 40)) & ~0x3f) == 0 && ((1L << (_la - 40)) & ((1L << (Abstract - 40)) | (1L << (Array - 40)) | (1L << (As - 40)) | (1L << (BinaryCast - 40)) | (1L << (BoolType - 40)) | (1L << (BooleanConstant - 40)) | (1L << (Break - 40)) | (1L << (Callable - 40)) | (1L << (Case - 40)) | (1L << (Catch - 40)) | (1L << (Class - 40)) | (1L << (Clone - 40)) | (1L << (Const - 40)) | (1L << (Continue - 40)) | (1L << (Declare - 40)) | (1L << (Default - 40)) | (1L << (Do - 40)) | (1L << (DoubleCast - 40)) | (1L << (DoubleType - 40)) | (1L << (Echo - 40)) | (1L << (Else - 40)) | (1L << (ElseIf - 40)) | (1L << (Empty - 40)) | (1L << (EndDeclare - 40)) | (1L << (EndFor - 40)) | (1L << (EndForeach - 40)) | (1L << (EndIf - 40)) | (1L << (EndSwitch - 40)) | (1L << (EndWhile - 40)) | (1L << (Eval - 40)) | (1L << (Exit - 40)) | (1L << (Extends - 40)) | (1L << (Final - 40)) | (1L << (Finally - 40)) | (1L << (FloatCast - 40)) | (1L << (For - 40)) | (1L << (Foreach - 40)) | (1L << (Function - 40)) | (1L << (Global - 40)) | (1L << (Goto - 40)) | (1L << (If - 40)) | (1L << (Implements - 40)) | (1L << (Import - 40)) | (1L << (Include - 40)) | (1L << (IncludeOnce - 40)) | (1L << (InstanceOf - 40)) | (1L << (InsteadOf - 40)) | (1L << (Int8Cast - 40)) | (1L << (Int16Cast - 40)) | (1L << (Int64Type - 40)) | (1L << (IntType - 40)) | (1L << (Interface - 40)) | (1L << (IsSet - 40)) | (1L << (List - 40)) | (1L << (LogicalAnd - 40)) | (1L << (LogicalOr - 40)) | (1L << (LogicalXor - 40)) | (1L << (Namespace - 40)) | (1L << (New - 40)) | (1L << (Null - 40)) | (1L << (ObjectType - 40)) | (1L << (Parent_ - 40)) | (1L << (Partial - 40)) | (1L << (Print - 40)))) != 0) || ((((_la - 104)) & ~0x3f) == 0 && ((1L << (_la - 104)) & ((1L << (Private - 104)) | (1L << (Protected - 104)) | (1L << (Public - 104)) | (1L << (Require - 104)) | (1L << (RequireOnce - 104)) | (1L << (Resource - 104)) | (1L << (Return - 104)) | (1L << (Static - 104)) | (1L << (StringType - 104)) | (1L << (Switch - 104)) | (1L << (Throw - 104)) | (1L << (Trait - 104)) | (1L << (Try - 104)) | (1L << (Typeof - 104)) | (1L << (UintCast - 104)) | (1L << (UnicodeCast - 104)) | (1L << (Unset - 104)) | (1L << (Use - 104)) | (1L << (Var - 104)) | (1L << (While - 104)) | (1L << (Yield - 104)) | (1L << (Get - 104)) | (1L << (Set - 104)) | (1L << (Call - 104)) | (1L << (CallStatic - 104)) | (1L << (Constructor - 104)) | (1L << (Destruct - 104)) | (1L << (Wakeup - 104)) | (1L << (Sleep - 104)) | (1L << (Autoload - 104)) | (1L << (IsSet__ - 104)) | (1L << (Unset__ - 104)) | (1L << (ToString__ - 104)) | (1L << (Invoke - 104)) | (1L << (SetState - 104)) | (1L << (Clone__ - 104)) | (1L << (DebugInfo - 104)) | (1L << (Namespace__ - 104)) | (1L << (Class__ - 104)) | (1L << (Traic__ - 104)) | (1L << (Function__ - 104)) | (1L << (Method__ - 104)) | (1L << (Line__ - 104)) | (1L << (File__ - 104)) | (1L << (Dir__ - 104)))) != 0) || _la==NamespaceSeparator || _la==Label) {
				{
				setState(869);
				typeHint();
				}
			}

			setState(873);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Ampersand) {
				{
				setState(872);
				match(Ampersand);
				}
			}

			setState(876);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Ellipsis) {
				{
				setState(875);
				match(Ellipsis);
				}
			}

			setState(878);
			variableInitializer();
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

	public static class TypeHintContext extends ParserRuleContext {
		public QualifiedStaticTypeRefContext qualifiedStaticTypeRef() {
			return getRuleContext(QualifiedStaticTypeRefContext.class,0);
		}
		public TerminalNode Callable() { return getToken(PHPParser.Callable, 0); }
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public TypeHintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeHint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterTypeHint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitTypeHint(this);
		}
	}

	public final TypeHintContext typeHint() throws RecognitionException {
		TypeHintContext _localctx = new TypeHintContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_typeHint);
		try {
			setState(883);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(880);
				qualifiedStaticTypeRef();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(881);
				match(Callable);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(882);
				primitiveType();
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

	public static class GlobalStatementContext extends ParserRuleContext {
		public TerminalNode Global() { return getToken(PHPParser.Global, 0); }
		public List<GlobalVarContext> globalVar() {
			return getRuleContexts(GlobalVarContext.class);
		}
		public GlobalVarContext globalVar(int i) {
			return getRuleContext(GlobalVarContext.class,i);
		}
		public GlobalStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_globalStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterGlobalStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitGlobalStatement(this);
		}
	}

	public final GlobalStatementContext globalStatement() throws RecognitionException {
		GlobalStatementContext _localctx = new GlobalStatementContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_globalStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(885);
			match(Global);
			setState(886);
			globalVar();
			setState(891);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(887);
				match(Comma);
				setState(888);
				globalVar();
				}
				}
				setState(893);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(894);
			match(SemiColon);
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

	public static class GlobalVarContext extends ParserRuleContext {
		public TerminalNode VarName() { return getToken(PHPParser.VarName, 0); }
		public TerminalNode Dollar() { return getToken(PHPParser.Dollar, 0); }
		public ChainContext chain() {
			return getRuleContext(ChainContext.class,0);
		}
		public TerminalNode OpenCurlyBracket() { return getToken(PHPParser.OpenCurlyBracket, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public GlobalVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_globalVar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterGlobalVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitGlobalVar(this);
		}
	}

	public final GlobalVarContext globalVar() throws RecognitionException {
		GlobalVarContext _localctx = new GlobalVarContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_globalVar);
		try {
			setState(904);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(896);
				match(VarName);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(897);
				match(Dollar);
				setState(898);
				chain();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(899);
				match(Dollar);
				setState(900);
				match(OpenCurlyBracket);
				setState(901);
				expression(0);
				setState(902);
				match(CloseCurlyBracket);
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

	public static class EchoStatementContext extends ParserRuleContext {
		public TerminalNode Echo() { return getToken(PHPParser.Echo, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public EchoStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_echoStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterEchoStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitEchoStatement(this);
		}
	}

	public final EchoStatementContext echoStatement() throws RecognitionException {
		EchoStatementContext _localctx = new EchoStatementContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_echoStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(906);
			match(Echo);
			setState(907);
			expressionList();
			setState(908);
			match(SemiColon);
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

	public static class StaticVariableStatementContext extends ParserRuleContext {
		public TerminalNode Static() { return getToken(PHPParser.Static, 0); }
		public List<VariableInitializerContext> variableInitializer() {
			return getRuleContexts(VariableInitializerContext.class);
		}
		public VariableInitializerContext variableInitializer(int i) {
			return getRuleContext(VariableInitializerContext.class,i);
		}
		public StaticVariableStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_staticVariableStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterStaticVariableStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitStaticVariableStatement(this);
		}
	}

	public final StaticVariableStatementContext staticVariableStatement() throws RecognitionException {
		StaticVariableStatementContext _localctx = new StaticVariableStatementContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_staticVariableStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(910);
			match(Static);
			setState(911);
			variableInitializer();
			setState(916);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(912);
				match(Comma);
				setState(913);
				variableInitializer();
				}
				}
				setState(918);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(919);
			match(SemiColon);
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

	public static class ClassStatementContext extends ParserRuleContext {
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public PropertyModifiersContext propertyModifiers() {
			return getRuleContext(PropertyModifiersContext.class,0);
		}
		public List<VariableInitializerContext> variableInitializer() {
			return getRuleContexts(VariableInitializerContext.class);
		}
		public VariableInitializerContext variableInitializer(int i) {
			return getRuleContext(VariableInitializerContext.class,i);
		}
		public TerminalNode Const() { return getToken(PHPParser.Const, 0); }
		public List<IdentifierInititalizerContext> identifierInititalizer() {
			return getRuleContexts(IdentifierInititalizerContext.class);
		}
		public IdentifierInititalizerContext identifierInititalizer(int i) {
			return getRuleContext(IdentifierInititalizerContext.class,i);
		}
		public TerminalNode Function() { return getToken(PHPParser.Function, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public MemberModifiersContext memberModifiers() {
			return getRuleContext(MemberModifiersContext.class,0);
		}
		public TypeParameterListInBracketsContext typeParameterListInBrackets() {
			return getRuleContext(TypeParameterListInBracketsContext.class,0);
		}
		public BaseCtorCallContext baseCtorCall() {
			return getRuleContext(BaseCtorCallContext.class,0);
		}
		public TerminalNode Use() { return getToken(PHPParser.Use, 0); }
		public QualifiedNamespaceNameListContext qualifiedNamespaceNameList() {
			return getRuleContext(QualifiedNamespaceNameListContext.class,0);
		}
		public TraitAdaptationsContext traitAdaptations() {
			return getRuleContext(TraitAdaptationsContext.class,0);
		}
		public ClassStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterClassStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitClassStatement(this);
		}
	}

	public final ClassStatementContext classStatement() throws RecognitionException {
		ClassStatementContext _localctx = new ClassStatementContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_classStatement);
		int _la;
		try {
			setState(969);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(921);
				attributes();
				setState(922);
				propertyModifiers();
				setState(923);
				variableInitializer();
				setState(928);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(924);
					match(Comma);
					setState(925);
					variableInitializer();
					}
					}
					setState(930);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(931);
				match(SemiColon);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(933);
				attributes();
				setState(934);
				match(Const);
				setState(935);
				identifierInititalizer();
				setState(940);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(936);
					match(Comma);
					setState(937);
					identifierInititalizer();
					}
					}
					setState(942);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(943);
				match(SemiColon);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(945);
				attributes();
				setState(947);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Abstract || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (Final - 72)) | (1L << (Private - 72)) | (1L << (Protected - 72)) | (1L << (Public - 72)) | (1L << (Static - 72)))) != 0)) {
					{
					setState(946);
					memberModifiers();
					}
				}

				setState(949);
				match(Function);
				setState(951);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Ampersand) {
					{
					setState(950);
					match(Ampersand);
					}
				}

				setState(953);
				identifier();
				setState(955);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Lgeneric) {
					{
					setState(954);
					typeParameterListInBrackets();
					}
				}

				setState(957);
				match(OpenRoundBracket);
				setState(958);
				formalParameterList();
				setState(959);
				match(CloseRoundBracket);
				setState(961);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Colon) {
					{
					setState(960);
					baseCtorCall();
					}
				}

				setState(963);
				methodBody();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(965);
				match(Use);
				setState(966);
				qualifiedNamespaceNameList();
				setState(967);
				traitAdaptations();
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

	public static class TraitAdaptationsContext extends ParserRuleContext {
		public TerminalNode OpenCurlyBracket() { return getToken(PHPParser.OpenCurlyBracket, 0); }
		public List<TraitAdaptationStatementContext> traitAdaptationStatement() {
			return getRuleContexts(TraitAdaptationStatementContext.class);
		}
		public TraitAdaptationStatementContext traitAdaptationStatement(int i) {
			return getRuleContext(TraitAdaptationStatementContext.class,i);
		}
		public TraitAdaptationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_traitAdaptations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterTraitAdaptations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitTraitAdaptations(this);
		}
	}

	public final TraitAdaptationsContext traitAdaptations() throws RecognitionException {
		TraitAdaptationsContext _localctx = new TraitAdaptationsContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_traitAdaptations);
		int _la;
		try {
			setState(980);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SemiColon:
				enterOuterAlt(_localctx, 1);
				{
				setState(971);
				match(SemiColon);
				}
				break;
			case OpenCurlyBracket:
				enterOuterAlt(_localctx, 2);
				{
				setState(972);
				match(OpenCurlyBracket);
				setState(976);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 40)) & ~0x3f) == 0 && ((1L << (_la - 40)) & ((1L << (Abstract - 40)) | (1L << (Array - 40)) | (1L << (As - 40)) | (1L << (BinaryCast - 40)) | (1L << (BoolType - 40)) | (1L << (BooleanConstant - 40)) | (1L << (Break - 40)) | (1L << (Callable - 40)) | (1L << (Case - 40)) | (1L << (Catch - 40)) | (1L << (Class - 40)) | (1L << (Clone - 40)) | (1L << (Const - 40)) | (1L << (Continue - 40)) | (1L << (Declare - 40)) | (1L << (Default - 40)) | (1L << (Do - 40)) | (1L << (DoubleCast - 40)) | (1L << (DoubleType - 40)) | (1L << (Echo - 40)) | (1L << (Else - 40)) | (1L << (ElseIf - 40)) | (1L << (Empty - 40)) | (1L << (EndDeclare - 40)) | (1L << (EndFor - 40)) | (1L << (EndForeach - 40)) | (1L << (EndIf - 40)) | (1L << (EndSwitch - 40)) | (1L << (EndWhile - 40)) | (1L << (Eval - 40)) | (1L << (Exit - 40)) | (1L << (Extends - 40)) | (1L << (Final - 40)) | (1L << (Finally - 40)) | (1L << (FloatCast - 40)) | (1L << (For - 40)) | (1L << (Foreach - 40)) | (1L << (Function - 40)) | (1L << (Global - 40)) | (1L << (Goto - 40)) | (1L << (If - 40)) | (1L << (Implements - 40)) | (1L << (Import - 40)) | (1L << (Include - 40)) | (1L << (IncludeOnce - 40)) | (1L << (InstanceOf - 40)) | (1L << (InsteadOf - 40)) | (1L << (Int8Cast - 40)) | (1L << (Int16Cast - 40)) | (1L << (Int64Type - 40)) | (1L << (IntType - 40)) | (1L << (Interface - 40)) | (1L << (IsSet - 40)) | (1L << (List - 40)) | (1L << (LogicalAnd - 40)) | (1L << (LogicalOr - 40)) | (1L << (LogicalXor - 40)) | (1L << (Namespace - 40)) | (1L << (New - 40)) | (1L << (Null - 40)) | (1L << (ObjectType - 40)) | (1L << (Parent_ - 40)) | (1L << (Partial - 40)) | (1L << (Print - 40)))) != 0) || ((((_la - 104)) & ~0x3f) == 0 && ((1L << (_la - 104)) & ((1L << (Private - 104)) | (1L << (Protected - 104)) | (1L << (Public - 104)) | (1L << (Require - 104)) | (1L << (RequireOnce - 104)) | (1L << (Resource - 104)) | (1L << (Return - 104)) | (1L << (Static - 104)) | (1L << (StringType - 104)) | (1L << (Switch - 104)) | (1L << (Throw - 104)) | (1L << (Trait - 104)) | (1L << (Try - 104)) | (1L << (Typeof - 104)) | (1L << (UintCast - 104)) | (1L << (UnicodeCast - 104)) | (1L << (Unset - 104)) | (1L << (Use - 104)) | (1L << (Var - 104)) | (1L << (While - 104)) | (1L << (Yield - 104)) | (1L << (Get - 104)) | (1L << (Set - 104)) | (1L << (Call - 104)) | (1L << (CallStatic - 104)) | (1L << (Constructor - 104)) | (1L << (Destruct - 104)) | (1L << (Wakeup - 104)) | (1L << (Sleep - 104)) | (1L << (Autoload - 104)) | (1L << (IsSet__ - 104)) | (1L << (Unset__ - 104)) | (1L << (ToString__ - 104)) | (1L << (Invoke - 104)) | (1L << (SetState - 104)) | (1L << (Clone__ - 104)) | (1L << (DebugInfo - 104)) | (1L << (Namespace__ - 104)) | (1L << (Class__ - 104)) | (1L << (Traic__ - 104)) | (1L << (Function__ - 104)) | (1L << (Method__ - 104)) | (1L << (Line__ - 104)) | (1L << (File__ - 104)) | (1L << (Dir__ - 104)))) != 0) || _la==NamespaceSeparator || _la==Label) {
					{
					{
					setState(973);
					traitAdaptationStatement();
					}
					}
					setState(978);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(979);
				match(CloseCurlyBracket);
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

	public static class TraitAdaptationStatementContext extends ParserRuleContext {
		public TraitPrecedenceContext traitPrecedence() {
			return getRuleContext(TraitPrecedenceContext.class,0);
		}
		public TraitAliasContext traitAlias() {
			return getRuleContext(TraitAliasContext.class,0);
		}
		public TraitAdaptationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_traitAdaptationStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterTraitAdaptationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitTraitAdaptationStatement(this);
		}
	}

	public final TraitAdaptationStatementContext traitAdaptationStatement() throws RecognitionException {
		TraitAdaptationStatementContext _localctx = new TraitAdaptationStatementContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_traitAdaptationStatement);
		try {
			setState(984);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(982);
				traitPrecedence();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(983);
				traitAlias();
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

	public static class TraitPrecedenceContext extends ParserRuleContext {
		public QualifiedNamespaceNameContext qualifiedNamespaceName() {
			return getRuleContext(QualifiedNamespaceNameContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode InsteadOf() { return getToken(PHPParser.InsteadOf, 0); }
		public QualifiedNamespaceNameListContext qualifiedNamespaceNameList() {
			return getRuleContext(QualifiedNamespaceNameListContext.class,0);
		}
		public TraitPrecedenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_traitPrecedence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterTraitPrecedence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitTraitPrecedence(this);
		}
	}

	public final TraitPrecedenceContext traitPrecedence() throws RecognitionException {
		TraitPrecedenceContext _localctx = new TraitPrecedenceContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_traitPrecedence);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(986);
			qualifiedNamespaceName();
			setState(987);
			match(DoubleColon);
			setState(988);
			identifier();
			setState(989);
			match(InsteadOf);
			setState(990);
			qualifiedNamespaceNameList();
			setState(991);
			match(SemiColon);
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

	public static class TraitAliasContext extends ParserRuleContext {
		public TraitMethodReferenceContext traitMethodReference() {
			return getRuleContext(TraitMethodReferenceContext.class,0);
		}
		public TerminalNode As() { return getToken(PHPParser.As, 0); }
		public MemberModifierContext memberModifier() {
			return getRuleContext(MemberModifierContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TraitAliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_traitAlias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterTraitAlias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitTraitAlias(this);
		}
	}

	public final TraitAliasContext traitAlias() throws RecognitionException {
		TraitAliasContext _localctx = new TraitAliasContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_traitAlias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(993);
			traitMethodReference();
			setState(994);
			match(As);
			setState(1000);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
			case 1:
				{
				setState(995);
				memberModifier();
				}
				break;
			case 2:
				{
				setState(997);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
				case 1:
					{
					setState(996);
					memberModifier();
					}
					break;
				}
				setState(999);
				identifier();
				}
				break;
			}
			setState(1002);
			match(SemiColon);
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

	public static class TraitMethodReferenceContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public QualifiedNamespaceNameContext qualifiedNamespaceName() {
			return getRuleContext(QualifiedNamespaceNameContext.class,0);
		}
		public TraitMethodReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_traitMethodReference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterTraitMethodReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitTraitMethodReference(this);
		}
	}

	public final TraitMethodReferenceContext traitMethodReference() throws RecognitionException {
		TraitMethodReferenceContext _localctx = new TraitMethodReferenceContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_traitMethodReference);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1007);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
			case 1:
				{
				setState(1004);
				qualifiedNamespaceName();
				setState(1005);
				match(DoubleColon);
				}
				break;
			}
			setState(1009);
			identifier();
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

	public static class BaseCtorCallContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public BaseCtorCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_baseCtorCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterBaseCtorCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitBaseCtorCall(this);
		}
	}

	public final BaseCtorCallContext baseCtorCall() throws RecognitionException {
		BaseCtorCallContext _localctx = new BaseCtorCallContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_baseCtorCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1011);
			match(Colon);
			setState(1012);
			identifier();
			setState(1013);
			arguments();
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

	public static class MethodBodyContext extends ParserRuleContext {
		public BlockStatementContext blockStatement() {
			return getRuleContext(BlockStatementContext.class,0);
		}
		public MethodBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterMethodBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitMethodBody(this);
		}
	}

	public final MethodBodyContext methodBody() throws RecognitionException {
		MethodBodyContext _localctx = new MethodBodyContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_methodBody);
		try {
			setState(1017);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SemiColon:
				enterOuterAlt(_localctx, 1);
				{
				setState(1015);
				match(SemiColon);
				}
				break;
			case OpenCurlyBracket:
				enterOuterAlt(_localctx, 2);
				{
				setState(1016);
				blockStatement();
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

	public static class PropertyModifiersContext extends ParserRuleContext {
		public MemberModifiersContext memberModifiers() {
			return getRuleContext(MemberModifiersContext.class,0);
		}
		public TerminalNode Var() { return getToken(PHPParser.Var, 0); }
		public PropertyModifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyModifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterPropertyModifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitPropertyModifiers(this);
		}
	}

	public final PropertyModifiersContext propertyModifiers() throws RecognitionException {
		PropertyModifiersContext _localctx = new PropertyModifiersContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_propertyModifiers);
		try {
			setState(1021);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Abstract:
			case Final:
			case Private:
			case Protected:
			case Public:
			case Static:
				enterOuterAlt(_localctx, 1);
				{
				setState(1019);
				memberModifiers();
				}
				break;
			case Var:
				enterOuterAlt(_localctx, 2);
				{
				setState(1020);
				match(Var);
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

	public static class MemberModifiersContext extends ParserRuleContext {
		public List<MemberModifierContext> memberModifier() {
			return getRuleContexts(MemberModifierContext.class);
		}
		public MemberModifierContext memberModifier(int i) {
			return getRuleContext(MemberModifierContext.class,i);
		}
		public MemberModifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberModifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterMemberModifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitMemberModifiers(this);
		}
	}

	public final MemberModifiersContext memberModifiers() throws RecognitionException {
		MemberModifiersContext _localctx = new MemberModifiersContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_memberModifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1024); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1023);
				memberModifier();
				}
				}
				setState(1026); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Abstract || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (Final - 72)) | (1L << (Private - 72)) | (1L << (Protected - 72)) | (1L << (Public - 72)) | (1L << (Static - 72)))) != 0) );
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

	public static class VariableInitializerContext extends ParserRuleContext {
		public TerminalNode VarName() { return getToken(PHPParser.VarName, 0); }
		public TerminalNode Eq() { return getToken(PHPParser.Eq, 0); }
		public ConstantInititalizerContext constantInititalizer() {
			return getRuleContext(ConstantInititalizerContext.class,0);
		}
		public VariableInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterVariableInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitVariableInitializer(this);
		}
	}

	public final VariableInitializerContext variableInitializer() throws RecognitionException {
		VariableInitializerContext _localctx = new VariableInitializerContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_variableInitializer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1028);
			match(VarName);
			setState(1031);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Eq) {
				{
				setState(1029);
				match(Eq);
				setState(1030);
				constantInititalizer();
				}
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

	public static class IdentifierInititalizerContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode Eq() { return getToken(PHPParser.Eq, 0); }
		public ConstantInititalizerContext constantInititalizer() {
			return getRuleContext(ConstantInititalizerContext.class,0);
		}
		public IdentifierInititalizerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierInititalizer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterIdentifierInititalizer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitIdentifierInititalizer(this);
		}
	}

	public final IdentifierInititalizerContext identifierInititalizer() throws RecognitionException {
		IdentifierInititalizerContext _localctx = new IdentifierInititalizerContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_identifierInititalizer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1033);
			identifier();
			setState(1034);
			match(Eq);
			setState(1035);
			constantInititalizer();
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

	public static class GlobalConstantDeclarationContext extends ParserRuleContext {
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public TerminalNode Const() { return getToken(PHPParser.Const, 0); }
		public List<IdentifierInititalizerContext> identifierInititalizer() {
			return getRuleContexts(IdentifierInititalizerContext.class);
		}
		public IdentifierInititalizerContext identifierInititalizer(int i) {
			return getRuleContext(IdentifierInititalizerContext.class,i);
		}
		public GlobalConstantDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_globalConstantDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterGlobalConstantDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitGlobalConstantDeclaration(this);
		}
	}

	public final GlobalConstantDeclarationContext globalConstantDeclaration() throws RecognitionException {
		GlobalConstantDeclarationContext _localctx = new GlobalConstantDeclarationContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_globalConstantDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1037);
			attributes();
			setState(1038);
			match(Const);
			setState(1039);
			identifierInititalizer();
			setState(1044);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(1040);
				match(Comma);
				setState(1041);
				identifierInititalizer();
				}
				}
				setState(1046);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1047);
			match(SemiColon);
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

	public static class ExpressionListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitExpressionList(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1049);
			expression(0);
			setState(1054);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(1050);
				match(Comma);
				setState(1051);
				expression(0);
				}
				}
				setState(1056);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class ParenthesisContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public YieldExpressionContext yieldExpression() {
			return getRuleContext(YieldExpressionContext.class,0);
		}
		public ParenthesisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parenthesis; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterParenthesis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitParenthesis(this);
		}
	}

	public final ParenthesisContext parenthesis() throws RecognitionException {
		ParenthesisContext _localctx = new ParenthesisContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_parenthesis);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1057);
			match(OpenRoundBracket);
			setState(1060);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
			case 1:
				{
				setState(1058);
				expression(0);
				}
				break;
			case 2:
				{
				setState(1059);
				yieldExpression();
				}
				break;
			}
			setState(1062);
			match(CloseRoundBracket);
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
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ChainExpressionContext extends ExpressionContext {
		public ChainContext chain() {
			return getRuleContext(ChainContext.class,0);
		}
		public ChainExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterChainExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitChainExpression(this);
		}
	}
	public static class UnaryOperatorExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public UnaryOperatorExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterUnaryOperatorExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitUnaryOperatorExpression(this);
		}
	}
	public static class SpecialWordExpressionContext extends ExpressionContext {
		public TerminalNode Yield() { return getToken(PHPParser.Yield, 0); }
		public TerminalNode List() { return getToken(PHPParser.List, 0); }
		public AssignmentListContext assignmentList() {
			return getRuleContext(AssignmentListContext.class,0);
		}
		public TerminalNode Eq() { return getToken(PHPParser.Eq, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode IsSet() { return getToken(PHPParser.IsSet, 0); }
		public ChainListContext chainList() {
			return getRuleContext(ChainListContext.class,0);
		}
		public TerminalNode Empty() { return getToken(PHPParser.Empty, 0); }
		public ChainContext chain() {
			return getRuleContext(ChainContext.class,0);
		}
		public TerminalNode Eval() { return getToken(PHPParser.Eval, 0); }
		public TerminalNode Exit() { return getToken(PHPParser.Exit, 0); }
		public ParenthesisContext parenthesis() {
			return getRuleContext(ParenthesisContext.class,0);
		}
		public TerminalNode Include() { return getToken(PHPParser.Include, 0); }
		public TerminalNode IncludeOnce() { return getToken(PHPParser.IncludeOnce, 0); }
		public TerminalNode Require() { return getToken(PHPParser.Require, 0); }
		public TerminalNode RequireOnce() { return getToken(PHPParser.RequireOnce, 0); }
		public SpecialWordExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterSpecialWordExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitSpecialWordExpression(this);
		}
	}
	public static class ArrayCreationExpressionContext extends ExpressionContext {
		public TerminalNode Array() { return getToken(PHPParser.Array, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArrayItemListContext arrayItemList() {
			return getRuleContext(ArrayItemListContext.class,0);
		}
		public ArrayCreationExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterArrayCreationExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitArrayCreationExpression(this);
		}
	}
	public static class NewExpressionContext extends ExpressionContext {
		public NewExprContext newExpr() {
			return getRuleContext(NewExprContext.class,0);
		}
		public NewExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterNewExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitNewExpression(this);
		}
	}
	public static class ParenthesisExpressionContext extends ExpressionContext {
		public ParenthesisContext parenthesis() {
			return getRuleContext(ParenthesisContext.class,0);
		}
		public ParenthesisExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterParenthesisExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitParenthesisExpression(this);
		}
	}
	public static class BackQuoteStringExpressionContext extends ExpressionContext {
		public TerminalNode BackQuoteString() { return getToken(PHPParser.BackQuoteString, 0); }
		public BackQuoteStringExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterBackQuoteStringExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitBackQuoteStringExpression(this);
		}
	}
	public static class ConditionalExpressionContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode QuestionMark() { return getToken(PHPParser.QuestionMark, 0); }
		public ConditionalExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterConditionalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitConditionalExpression(this);
		}
	}
	public static class ArithmeticExpressionContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode Divide() { return getToken(PHPParser.Divide, 0); }
		public ArithmeticExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterArithmeticExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitArithmeticExpression(this);
		}
	}
	public static class IndexerExpressionContext extends ExpressionContext {
		public StringConstantContext stringConstant() {
			return getRuleContext(StringConstantContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IndexerExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterIndexerExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitIndexerExpression(this);
		}
	}
	public static class ScalarExpressionContext extends ExpressionContext {
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public TerminalNode Label() { return getToken(PHPParser.Label, 0); }
		public ScalarExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterScalarExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitScalarExpression(this);
		}
	}
	public static class PrefixIncDecExpressionContext extends ExpressionContext {
		public ChainContext chain() {
			return getRuleContext(ChainContext.class,0);
		}
		public PrefixIncDecExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterPrefixIncDecExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitPrefixIncDecExpression(this);
		}
	}
	public static class ComparisonExpressionContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode Less() { return getToken(PHPParser.Less, 0); }
		public TerminalNode Greater() { return getToken(PHPParser.Greater, 0); }
		public TerminalNode IsNotEq() { return getToken(PHPParser.IsNotEq, 0); }
		public ComparisonExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterComparisonExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitComparisonExpression(this);
		}
	}
	public static class LogicalExpressionContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LogicalAnd() { return getToken(PHPParser.LogicalAnd, 0); }
		public TerminalNode LogicalXor() { return getToken(PHPParser.LogicalXor, 0); }
		public TerminalNode LogicalOr() { return getToken(PHPParser.LogicalOr, 0); }
		public LogicalExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterLogicalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitLogicalExpression(this);
		}
	}
	public static class PrintExpressionContext extends ExpressionContext {
		public TerminalNode Print() { return getToken(PHPParser.Print, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PrintExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterPrintExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitPrintExpression(this);
		}
	}
	public static class AssignmentExpressionContext extends ExpressionContext {
		public List<ChainContext> chain() {
			return getRuleContexts(ChainContext.class);
		}
		public ChainContext chain(int i) {
			return getRuleContext(ChainContext.class,i);
		}
		public AssignmentOperatorContext assignmentOperator() {
			return getRuleContext(AssignmentOperatorContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Eq() { return getToken(PHPParser.Eq, 0); }
		public NewExprContext newExpr() {
			return getRuleContext(NewExprContext.class,0);
		}
		public AssignmentExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterAssignmentExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitAssignmentExpression(this);
		}
	}
	public static class PostfixIncDecExpressionContext extends ExpressionContext {
		public ChainContext chain() {
			return getRuleContext(ChainContext.class,0);
		}
		public PostfixIncDecExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterPostfixIncDecExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitPostfixIncDecExpression(this);
		}
	}
	public static class CastExpressionContext extends ExpressionContext {
		public CastOperationContext castOperation() {
			return getRuleContext(CastOperationContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public CastExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterCastExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitCastExpression(this);
		}
	}
	public static class InstanceOfExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode InstanceOf() { return getToken(PHPParser.InstanceOf, 0); }
		public TypeRefContext typeRef() {
			return getRuleContext(TypeRefContext.class,0);
		}
		public InstanceOfExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterInstanceOfExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitInstanceOfExpression(this);
		}
	}
	public static class LambdaFunctionExpressionContext extends ExpressionContext {
		public TerminalNode Function() { return getToken(PHPParser.Function, 0); }
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public BlockStatementContext blockStatement() {
			return getRuleContext(BlockStatementContext.class,0);
		}
		public TerminalNode Static() { return getToken(PHPParser.Static, 0); }
		public LambdaFunctionUseVarsContext lambdaFunctionUseVars() {
			return getRuleContext(LambdaFunctionUseVarsContext.class,0);
		}
		public LambdaFunctionExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterLambdaFunctionExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitLambdaFunctionExpression(this);
		}
	}
	public static class BitwiseExpressionContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public BitwiseExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterBitwiseExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitBitwiseExpression(this);
		}
	}
	public static class CloneExpressionContext extends ExpressionContext {
		public TerminalNode Clone() { return getToken(PHPParser.Clone, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public CloneExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterCloneExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitCloneExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 166;
		enterRecursionRule(_localctx, 166, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1173);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,118,_ctx) ) {
			case 1:
				{
				_localctx = new CloneExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(1065);
				match(Clone);
				setState(1066);
				expression(43);
				}
				break;
			case 2:
				{
				_localctx = new NewExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1067);
				newExpr();
				}
				break;
			case 3:
				{
				_localctx = new IndexerExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1068);
				stringConstant();
				setState(1069);
				match(OpenSquareBracket);
				setState(1070);
				expression(0);
				setState(1071);
				match(CloseSquareBracket);
				}
				break;
			case 4:
				{
				_localctx = new CastExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1073);
				match(OpenRoundBracket);
				setState(1074);
				castOperation();
				setState(1075);
				match(CloseRoundBracket);
				setState(1076);
				expression(40);
				}
				break;
			case 5:
				{
				_localctx = new UnaryOperatorExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1078);
				_la = _input.LA(1);
				if ( !(_la==Tilde || _la==SuppressWarnings) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1079);
				expression(39);
				}
				break;
			case 6:
				{
				_localctx = new UnaryOperatorExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1080);
				_la = _input.LA(1);
				if ( !(((((_la - 185)) & ~0x3f) == 0 && ((1L << (_la - 185)) & ((1L << (Bang - 185)) | (1L << (Plus - 185)) | (1L << (Minus - 185)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1081);
				expression(38);
				}
				break;
			case 7:
				{
				_localctx = new PrefixIncDecExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1082);
				_la = _input.LA(1);
				if ( !(_la==Inc || _la==Dec) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1083);
				chain();
				}
				break;
			case 8:
				{
				_localctx = new PostfixIncDecExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1084);
				chain();
				setState(1085);
				_la = _input.LA(1);
				if ( !(_la==Inc || _la==Dec) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 9:
				{
				_localctx = new AssignmentExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1087);
				chain();
				setState(1088);
				assignmentOperator();
				setState(1089);
				expression(35);
				}
				break;
			case 10:
				{
				_localctx = new AssignmentExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1091);
				chain();
				setState(1092);
				match(Eq);
				setState(1093);
				match(Ampersand);
				setState(1096);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
				case 1:
					{
					setState(1094);
					chain();
					}
					break;
				case 2:
					{
					setState(1095);
					newExpr();
					}
					break;
				}
				}
				break;
			case 11:
				{
				_localctx = new PrintExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1098);
				match(Print);
				setState(1099);
				expression(33);
				}
				break;
			case 12:
				{
				_localctx = new ChainExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1100);
				chain();
				}
				break;
			case 13:
				{
				_localctx = new ScalarExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1101);
				constant();
				}
				break;
			case 14:
				{
				_localctx = new ScalarExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1102);
				string();
				}
				break;
			case 15:
				{
				_localctx = new ScalarExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1103);
				match(Label);
				}
				break;
			case 16:
				{
				_localctx = new BackQuoteStringExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1104);
				match(BackQuoteString);
				}
				break;
			case 17:
				{
				_localctx = new ParenthesisExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1105);
				parenthesis();
				}
				break;
			case 18:
				{
				_localctx = new ArrayCreationExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1117);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Array:
					{
					setState(1106);
					match(Array);
					setState(1107);
					match(OpenRoundBracket);
					setState(1109);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (((((_la - 40)) & ~0x3f) == 0 && ((1L << (_la - 40)) & ((1L << (Abstract - 40)) | (1L << (Array - 40)) | (1L << (As - 40)) | (1L << (BinaryCast - 40)) | (1L << (BoolType - 40)) | (1L << (BooleanConstant - 40)) | (1L << (Break - 40)) | (1L << (Callable - 40)) | (1L << (Case - 40)) | (1L << (Catch - 40)) | (1L << (Class - 40)) | (1L << (Clone - 40)) | (1L << (Const - 40)) | (1L << (Continue - 40)) | (1L << (Declare - 40)) | (1L << (Default - 40)) | (1L << (Do - 40)) | (1L << (DoubleCast - 40)) | (1L << (DoubleType - 40)) | (1L << (Echo - 40)) | (1L << (Else - 40)) | (1L << (ElseIf - 40)) | (1L << (Empty - 40)) | (1L << (EndDeclare - 40)) | (1L << (EndFor - 40)) | (1L << (EndForeach - 40)) | (1L << (EndIf - 40)) | (1L << (EndSwitch - 40)) | (1L << (EndWhile - 40)) | (1L << (Eval - 40)) | (1L << (Exit - 40)) | (1L << (Extends - 40)) | (1L << (Final - 40)) | (1L << (Finally - 40)) | (1L << (FloatCast - 40)) | (1L << (For - 40)) | (1L << (Foreach - 40)) | (1L << (Function - 40)) | (1L << (Global - 40)) | (1L << (Goto - 40)) | (1L << (If - 40)) | (1L << (Implements - 40)) | (1L << (Import - 40)) | (1L << (Include - 40)) | (1L << (IncludeOnce - 40)) | (1L << (InstanceOf - 40)) | (1L << (InsteadOf - 40)) | (1L << (Int8Cast - 40)) | (1L << (Int16Cast - 40)) | (1L << (Int64Type - 40)) | (1L << (IntType - 40)) | (1L << (Interface - 40)) | (1L << (IsSet - 40)) | (1L << (List - 40)) | (1L << (LogicalAnd - 40)) | (1L << (LogicalOr - 40)) | (1L << (LogicalXor - 40)) | (1L << (Namespace - 40)) | (1L << (New - 40)) | (1L << (Null - 40)) | (1L << (ObjectType - 40)) | (1L << (Parent_ - 40)) | (1L << (Partial - 40)) | (1L << (Print - 40)))) != 0) || ((((_la - 104)) & ~0x3f) == 0 && ((1L << (_la - 104)) & ((1L << (Private - 104)) | (1L << (Protected - 104)) | (1L << (Public - 104)) | (1L << (Require - 104)) | (1L << (RequireOnce - 104)) | (1L << (Resource - 104)) | (1L << (Return - 104)) | (1L << (Static - 104)) | (1L << (StringType - 104)) | (1L << (Switch - 104)) | (1L << (Throw - 104)) | (1L << (Trait - 104)) | (1L << (Try - 104)) | (1L << (Typeof - 104)) | (1L << (UintCast - 104)) | (1L << (UnicodeCast - 104)) | (1L << (Unset - 104)) | (1L << (Use - 104)) | (1L << (Var - 104)) | (1L << (While - 104)) | (1L << (Yield - 104)) | (1L << (Get - 104)) | (1L << (Set - 104)) | (1L << (Call - 104)) | (1L << (CallStatic - 104)) | (1L << (Constructor - 104)) | (1L << (Destruct - 104)) | (1L << (Wakeup - 104)) | (1L << (Sleep - 104)) | (1L << (Autoload - 104)) | (1L << (IsSet__ - 104)) | (1L << (Unset__ - 104)) | (1L << (ToString__ - 104)) | (1L << (Invoke - 104)) | (1L << (SetState - 104)) | (1L << (Clone__ - 104)) | (1L << (DebugInfo - 104)) | (1L << (Namespace__ - 104)) | (1L << (Class__ - 104)) | (1L << (Traic__ - 104)) | (1L << (Function__ - 104)) | (1L << (Method__ - 104)) | (1L << (Line__ - 104)) | (1L << (File__ - 104)) | (1L << (Dir__ - 104)) | (1L << (Inc - 104)) | (1L << (Dec - 104)))) != 0) || ((((_la - 179)) & ~0x3f) == 0 && ((1L << (_la - 179)) & ((1L << (NamespaceSeparator - 179)) | (1L << (Ampersand - 179)) | (1L << (Bang - 179)) | (1L << (Plus - 179)) | (1L << (Minus - 179)) | (1L << (Tilde - 179)) | (1L << (SuppressWarnings - 179)) | (1L << (Dollar - 179)) | (1L << (OpenRoundBracket - 179)) | (1L << (OpenSquareBracket - 179)) | (1L << (VarName - 179)) | (1L << (Label - 179)) | (1L << (Octal - 179)) | (1L << (Decimal - 179)) | (1L << (Real - 179)) | (1L << (Hex - 179)) | (1L << (Binary - 179)) | (1L << (BackQuoteString - 179)) | (1L << (SingleQuoteString - 179)) | (1L << (DoubleQuote - 179)) | (1L << (StartNowDoc - 179)) | (1L << (StartHereDoc - 179)))) != 0)) {
						{
						setState(1108);
						arrayItemList();
						}
					}

					setState(1111);
					match(CloseRoundBracket);
					}
					break;
				case OpenSquareBracket:
					{
					setState(1112);
					match(OpenSquareBracket);
					setState(1114);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (((((_la - 40)) & ~0x3f) == 0 && ((1L << (_la - 40)) & ((1L << (Abstract - 40)) | (1L << (Array - 40)) | (1L << (As - 40)) | (1L << (BinaryCast - 40)) | (1L << (BoolType - 40)) | (1L << (BooleanConstant - 40)) | (1L << (Break - 40)) | (1L << (Callable - 40)) | (1L << (Case - 40)) | (1L << (Catch - 40)) | (1L << (Class - 40)) | (1L << (Clone - 40)) | (1L << (Const - 40)) | (1L << (Continue - 40)) | (1L << (Declare - 40)) | (1L << (Default - 40)) | (1L << (Do - 40)) | (1L << (DoubleCast - 40)) | (1L << (DoubleType - 40)) | (1L << (Echo - 40)) | (1L << (Else - 40)) | (1L << (ElseIf - 40)) | (1L << (Empty - 40)) | (1L << (EndDeclare - 40)) | (1L << (EndFor - 40)) | (1L << (EndForeach - 40)) | (1L << (EndIf - 40)) | (1L << (EndSwitch - 40)) | (1L << (EndWhile - 40)) | (1L << (Eval - 40)) | (1L << (Exit - 40)) | (1L << (Extends - 40)) | (1L << (Final - 40)) | (1L << (Finally - 40)) | (1L << (FloatCast - 40)) | (1L << (For - 40)) | (1L << (Foreach - 40)) | (1L << (Function - 40)) | (1L << (Global - 40)) | (1L << (Goto - 40)) | (1L << (If - 40)) | (1L << (Implements - 40)) | (1L << (Import - 40)) | (1L << (Include - 40)) | (1L << (IncludeOnce - 40)) | (1L << (InstanceOf - 40)) | (1L << (InsteadOf - 40)) | (1L << (Int8Cast - 40)) | (1L << (Int16Cast - 40)) | (1L << (Int64Type - 40)) | (1L << (IntType - 40)) | (1L << (Interface - 40)) | (1L << (IsSet - 40)) | (1L << (List - 40)) | (1L << (LogicalAnd - 40)) | (1L << (LogicalOr - 40)) | (1L << (LogicalXor - 40)) | (1L << (Namespace - 40)) | (1L << (New - 40)) | (1L << (Null - 40)) | (1L << (ObjectType - 40)) | (1L << (Parent_ - 40)) | (1L << (Partial - 40)) | (1L << (Print - 40)))) != 0) || ((((_la - 104)) & ~0x3f) == 0 && ((1L << (_la - 104)) & ((1L << (Private - 104)) | (1L << (Protected - 104)) | (1L << (Public - 104)) | (1L << (Require - 104)) | (1L << (RequireOnce - 104)) | (1L << (Resource - 104)) | (1L << (Return - 104)) | (1L << (Static - 104)) | (1L << (StringType - 104)) | (1L << (Switch - 104)) | (1L << (Throw - 104)) | (1L << (Trait - 104)) | (1L << (Try - 104)) | (1L << (Typeof - 104)) | (1L << (UintCast - 104)) | (1L << (UnicodeCast - 104)) | (1L << (Unset - 104)) | (1L << (Use - 104)) | (1L << (Var - 104)) | (1L << (While - 104)) | (1L << (Yield - 104)) | (1L << (Get - 104)) | (1L << (Set - 104)) | (1L << (Call - 104)) | (1L << (CallStatic - 104)) | (1L << (Constructor - 104)) | (1L << (Destruct - 104)) | (1L << (Wakeup - 104)) | (1L << (Sleep - 104)) | (1L << (Autoload - 104)) | (1L << (IsSet__ - 104)) | (1L << (Unset__ - 104)) | (1L << (ToString__ - 104)) | (1L << (Invoke - 104)) | (1L << (SetState - 104)) | (1L << (Clone__ - 104)) | (1L << (DebugInfo - 104)) | (1L << (Namespace__ - 104)) | (1L << (Class__ - 104)) | (1L << (Traic__ - 104)) | (1L << (Function__ - 104)) | (1L << (Method__ - 104)) | (1L << (Line__ - 104)) | (1L << (File__ - 104)) | (1L << (Dir__ - 104)) | (1L << (Inc - 104)) | (1L << (Dec - 104)))) != 0) || ((((_la - 179)) & ~0x3f) == 0 && ((1L << (_la - 179)) & ((1L << (NamespaceSeparator - 179)) | (1L << (Ampersand - 179)) | (1L << (Bang - 179)) | (1L << (Plus - 179)) | (1L << (Minus - 179)) | (1L << (Tilde - 179)) | (1L << (SuppressWarnings - 179)) | (1L << (Dollar - 179)) | (1L << (OpenRoundBracket - 179)) | (1L << (OpenSquareBracket - 179)) | (1L << (VarName - 179)) | (1L << (Label - 179)) | (1L << (Octal - 179)) | (1L << (Decimal - 179)) | (1L << (Real - 179)) | (1L << (Hex - 179)) | (1L << (Binary - 179)) | (1L << (BackQuoteString - 179)) | (1L << (SingleQuoteString - 179)) | (1L << (DoubleQuote - 179)) | (1L << (StartNowDoc - 179)) | (1L << (StartHereDoc - 179)))) != 0)) {
						{
						setState(1113);
						arrayItemList();
						}
					}

					setState(1116);
					match(CloseSquareBracket);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1123);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
				case 1:
					{
					setState(1119);
					match(OpenSquareBracket);
					setState(1120);
					expression(0);
					setState(1121);
					match(CloseSquareBracket);
					}
					break;
				}
				}
				break;
			case 19:
				{
				_localctx = new SpecialWordExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1125);
				match(Yield);
				}
				break;
			case 20:
				{
				_localctx = new SpecialWordExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1126);
				match(List);
				setState(1127);
				match(OpenRoundBracket);
				setState(1128);
				assignmentList();
				setState(1129);
				match(CloseRoundBracket);
				setState(1130);
				match(Eq);
				setState(1131);
				expression(24);
				}
				break;
			case 21:
				{
				_localctx = new SpecialWordExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1133);
				match(IsSet);
				setState(1134);
				match(OpenRoundBracket);
				setState(1135);
				chainList();
				setState(1136);
				match(CloseRoundBracket);
				}
				break;
			case 22:
				{
				_localctx = new SpecialWordExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1138);
				match(Empty);
				setState(1139);
				match(OpenRoundBracket);
				setState(1140);
				chain();
				setState(1141);
				match(CloseRoundBracket);
				}
				break;
			case 23:
				{
				_localctx = new SpecialWordExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1143);
				match(Eval);
				setState(1144);
				match(OpenRoundBracket);
				setState(1145);
				expression(0);
				setState(1146);
				match(CloseRoundBracket);
				}
				break;
			case 24:
				{
				_localctx = new SpecialWordExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1148);
				match(Exit);
				setState(1152);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
				case 1:
					{
					setState(1149);
					match(OpenRoundBracket);
					setState(1150);
					match(CloseRoundBracket);
					}
					break;
				case 2:
					{
					setState(1151);
					parenthesis();
					}
					break;
				}
				}
				break;
			case 25:
				{
				_localctx = new SpecialWordExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1154);
				_la = _input.LA(1);
				if ( !(_la==Include || _la==IncludeOnce) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1155);
				expression(19);
				}
				break;
			case 26:
				{
				_localctx = new SpecialWordExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1156);
				_la = _input.LA(1);
				if ( !(_la==Require || _la==RequireOnce) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1157);
				expression(18);
				}
				break;
			case 27:
				{
				_localctx = new LambdaFunctionExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1159);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Static) {
					{
					setState(1158);
					match(Static);
					}
				}

				setState(1161);
				match(Function);
				setState(1163);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Ampersand) {
					{
					setState(1162);
					match(Ampersand);
					}
				}

				setState(1165);
				match(OpenRoundBracket);
				setState(1166);
				formalParameterList();
				setState(1167);
				match(CloseRoundBracket);
				setState(1169);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Use) {
					{
					setState(1168);
					lambdaFunctionUseVars();
					}
				}

				setState(1171);
				blockStatement();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1229);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,121,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1227);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,120,_ctx) ) {
					case 1:
						{
						_localctx = new ArithmeticExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1175);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(1176);
						match(Pow);
						setState(1177);
						expression(16);
						}
						break;
					case 2:
						{
						_localctx = new ArithmeticExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1178);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(1179);
						((ArithmeticExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 189)) & ~0x3f) == 0 && ((1L << (_la - 189)) & ((1L << (Asterisk - 189)) | (1L << (Percent - 189)) | (1L << (Divide - 189)))) != 0)) ) {
							((ArithmeticExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1180);
						expression(15);
						}
						break;
					case 3:
						{
						_localctx = new ArithmeticExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1181);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(1182);
						((ArithmeticExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 187)) & ~0x3f) == 0 && ((1L << (_la - 187)) & ((1L << (Plus - 187)) | (1L << (Minus - 187)) | (1L << (Dot - 187)))) != 0)) ) {
							((ArithmeticExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1183);
						expression(14);
						}
						break;
					case 4:
						{
						_localctx = new ComparisonExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1184);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(1185);
						((ComparisonExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ShiftLeft || _la==ShiftRight) ) {
							((ComparisonExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1186);
						expression(13);
						}
						break;
					case 5:
						{
						_localctx = new ComparisonExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1187);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(1188);
						((ComparisonExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 158)) & ~0x3f) == 0 && ((1L << (_la - 158)) & ((1L << (IsSmallerOrEqual - 158)) | (1L << (IsGreaterOrEqual - 158)) | (1L << (Less - 158)) | (1L << (Greater - 158)))) != 0)) ) {
							((ComparisonExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1189);
						expression(12);
						}
						break;
					case 6:
						{
						_localctx = new ComparisonExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1190);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(1191);
						((ComparisonExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 154)) & ~0x3f) == 0 && ((1L << (_la - 154)) & ((1L << (IsIdentical - 154)) | (1L << (IsNoidentical - 154)) | (1L << (IsEqual - 154)) | (1L << (IsNotEq - 154)))) != 0)) ) {
							((ComparisonExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1192);
						expression(11);
						}
						break;
					case 7:
						{
						_localctx = new BitwiseExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1193);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(1194);
						((BitwiseExpressionContext)_localctx).op = match(Ampersand);
						setState(1195);
						expression(10);
						}
						break;
					case 8:
						{
						_localctx = new BitwiseExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1196);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(1197);
						((BitwiseExpressionContext)_localctx).op = match(Caret);
						setState(1198);
						expression(9);
						}
						break;
					case 9:
						{
						_localctx = new BitwiseExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1199);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(1200);
						((BitwiseExpressionContext)_localctx).op = match(Pipe);
						setState(1201);
						expression(8);
						}
						break;
					case 10:
						{
						_localctx = new BitwiseExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1202);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1203);
						((BitwiseExpressionContext)_localctx).op = match(BooleanAnd);
						setState(1204);
						expression(7);
						}
						break;
					case 11:
						{
						_localctx = new BitwiseExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1205);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1206);
						((BitwiseExpressionContext)_localctx).op = match(BooleanOr);
						setState(1207);
						expression(6);
						}
						break;
					case 12:
						{
						_localctx = new ConditionalExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1208);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1209);
						((ConditionalExpressionContext)_localctx).op = match(QuestionMark);
						setState(1211);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (((((_la - 40)) & ~0x3f) == 0 && ((1L << (_la - 40)) & ((1L << (Abstract - 40)) | (1L << (Array - 40)) | (1L << (As - 40)) | (1L << (BinaryCast - 40)) | (1L << (BoolType - 40)) | (1L << (BooleanConstant - 40)) | (1L << (Break - 40)) | (1L << (Callable - 40)) | (1L << (Case - 40)) | (1L << (Catch - 40)) | (1L << (Class - 40)) | (1L << (Clone - 40)) | (1L << (Const - 40)) | (1L << (Continue - 40)) | (1L << (Declare - 40)) | (1L << (Default - 40)) | (1L << (Do - 40)) | (1L << (DoubleCast - 40)) | (1L << (DoubleType - 40)) | (1L << (Echo - 40)) | (1L << (Else - 40)) | (1L << (ElseIf - 40)) | (1L << (Empty - 40)) | (1L << (EndDeclare - 40)) | (1L << (EndFor - 40)) | (1L << (EndForeach - 40)) | (1L << (EndIf - 40)) | (1L << (EndSwitch - 40)) | (1L << (EndWhile - 40)) | (1L << (Eval - 40)) | (1L << (Exit - 40)) | (1L << (Extends - 40)) | (1L << (Final - 40)) | (1L << (Finally - 40)) | (1L << (FloatCast - 40)) | (1L << (For - 40)) | (1L << (Foreach - 40)) | (1L << (Function - 40)) | (1L << (Global - 40)) | (1L << (Goto - 40)) | (1L << (If - 40)) | (1L << (Implements - 40)) | (1L << (Import - 40)) | (1L << (Include - 40)) | (1L << (IncludeOnce - 40)) | (1L << (InstanceOf - 40)) | (1L << (InsteadOf - 40)) | (1L << (Int8Cast - 40)) | (1L << (Int16Cast - 40)) | (1L << (Int64Type - 40)) | (1L << (IntType - 40)) | (1L << (Interface - 40)) | (1L << (IsSet - 40)) | (1L << (List - 40)) | (1L << (LogicalAnd - 40)) | (1L << (LogicalOr - 40)) | (1L << (LogicalXor - 40)) | (1L << (Namespace - 40)) | (1L << (New - 40)) | (1L << (Null - 40)) | (1L << (ObjectType - 40)) | (1L << (Parent_ - 40)) | (1L << (Partial - 40)) | (1L << (Print - 40)))) != 0) || ((((_la - 104)) & ~0x3f) == 0 && ((1L << (_la - 104)) & ((1L << (Private - 104)) | (1L << (Protected - 104)) | (1L << (Public - 104)) | (1L << (Require - 104)) | (1L << (RequireOnce - 104)) | (1L << (Resource - 104)) | (1L << (Return - 104)) | (1L << (Static - 104)) | (1L << (StringType - 104)) | (1L << (Switch - 104)) | (1L << (Throw - 104)) | (1L << (Trait - 104)) | (1L << (Try - 104)) | (1L << (Typeof - 104)) | (1L << (UintCast - 104)) | (1L << (UnicodeCast - 104)) | (1L << (Unset - 104)) | (1L << (Use - 104)) | (1L << (Var - 104)) | (1L << (While - 104)) | (1L << (Yield - 104)) | (1L << (Get - 104)) | (1L << (Set - 104)) | (1L << (Call - 104)) | (1L << (CallStatic - 104)) | (1L << (Constructor - 104)) | (1L << (Destruct - 104)) | (1L << (Wakeup - 104)) | (1L << (Sleep - 104)) | (1L << (Autoload - 104)) | (1L << (IsSet__ - 104)) | (1L << (Unset__ - 104)) | (1L << (ToString__ - 104)) | (1L << (Invoke - 104)) | (1L << (SetState - 104)) | (1L << (Clone__ - 104)) | (1L << (DebugInfo - 104)) | (1L << (Namespace__ - 104)) | (1L << (Class__ - 104)) | (1L << (Traic__ - 104)) | (1L << (Function__ - 104)) | (1L << (Method__ - 104)) | (1L << (Line__ - 104)) | (1L << (File__ - 104)) | (1L << (Dir__ - 104)) | (1L << (Inc - 104)) | (1L << (Dec - 104)))) != 0) || ((((_la - 179)) & ~0x3f) == 0 && ((1L << (_la - 179)) & ((1L << (NamespaceSeparator - 179)) | (1L << (Bang - 179)) | (1L << (Plus - 179)) | (1L << (Minus - 179)) | (1L << (Tilde - 179)) | (1L << (SuppressWarnings - 179)) | (1L << (Dollar - 179)) | (1L << (OpenRoundBracket - 179)) | (1L << (OpenSquareBracket - 179)) | (1L << (VarName - 179)) | (1L << (Label - 179)) | (1L << (Octal - 179)) | (1L << (Decimal - 179)) | (1L << (Real - 179)) | (1L << (Hex - 179)) | (1L << (Binary - 179)) | (1L << (BackQuoteString - 179)) | (1L << (SingleQuoteString - 179)) | (1L << (DoubleQuote - 179)) | (1L << (StartNowDoc - 179)) | (1L << (StartHereDoc - 179)))) != 0)) {
							{
							setState(1210);
							expression(0);
							}
						}

						setState(1213);
						match(Colon);
						setState(1214);
						expression(5);
						}
						break;
					case 13:
						{
						_localctx = new LogicalExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1215);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1216);
						((LogicalExpressionContext)_localctx).op = match(LogicalAnd);
						setState(1217);
						expression(4);
						}
						break;
					case 14:
						{
						_localctx = new LogicalExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1218);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1219);
						((LogicalExpressionContext)_localctx).op = match(LogicalXor);
						setState(1220);
						expression(3);
						}
						break;
					case 15:
						{
						_localctx = new LogicalExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1221);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1222);
						((LogicalExpressionContext)_localctx).op = match(LogicalOr);
						setState(1223);
						expression(2);
						}
						break;
					case 16:
						{
						_localctx = new InstanceOfExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1224);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(1225);
						match(InstanceOf);
						setState(1226);
						typeRef();
						}
						break;
					}
					} 
				}
				setState(1231);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,121,_ctx);
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

	public static class NewExprContext extends ParserRuleContext {
		public TerminalNode New() { return getToken(PHPParser.New, 0); }
		public TypeRefContext typeRef() {
			return getRuleContext(TypeRefContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public NewExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterNewExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitNewExpr(this);
		}
	}

	public final NewExprContext newExpr() throws RecognitionException {
		NewExprContext _localctx = new NewExprContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_newExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1232);
			match(New);
			setState(1233);
			typeRef();
			setState(1235);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,122,_ctx) ) {
			case 1:
				{
				setState(1234);
				arguments();
				}
				break;
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

	public static class AssignmentOperatorContext extends ParserRuleContext {
		public TerminalNode Eq() { return getToken(PHPParser.Eq, 0); }
		public AssignmentOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterAssignmentOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitAssignmentOperator(this);
		}
	}

	public final AssignmentOperatorContext assignmentOperator() throws RecognitionException {
		AssignmentOperatorContext _localctx = new AssignmentOperatorContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_assignmentOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1237);
			_la = _input.LA(1);
			if ( !(((((_la - 160)) & ~0x3f) == 0 && ((1L << (_la - 160)) & ((1L << (PlusEqual - 160)) | (1L << (MinusEqual - 160)) | (1L << (MulEqual - 160)) | (1L << (PowEqual - 160)) | (1L << (DivEqual - 160)) | (1L << (Concaequal - 160)) | (1L << (ModEqual - 160)) | (1L << (ShiftLeftEqual - 160)) | (1L << (ShiftRightEqual - 160)) | (1L << (AndEqual - 160)) | (1L << (OrEqual - 160)) | (1L << (XorEqual - 160)) | (1L << (Eq - 160)))) != 0)) ) {
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

	public static class YieldExpressionContext extends ParserRuleContext {
		public TerminalNode Yield() { return getToken(PHPParser.Yield, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public YieldExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_yieldExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterYieldExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitYieldExpression(this);
		}
	}

	public final YieldExpressionContext yieldExpression() throws RecognitionException {
		YieldExpressionContext _localctx = new YieldExpressionContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_yieldExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1239);
			match(Yield);
			setState(1240);
			expression(0);
			setState(1243);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DoubleArrow) {
				{
				setState(1241);
				match(DoubleArrow);
				setState(1242);
				expression(0);
				}
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

	public static class ArrayItemListContext extends ParserRuleContext {
		public List<ArrayItemContext> arrayItem() {
			return getRuleContexts(ArrayItemContext.class);
		}
		public ArrayItemContext arrayItem(int i) {
			return getRuleContext(ArrayItemContext.class,i);
		}
		public ArrayItemListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayItemList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterArrayItemList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitArrayItemList(this);
		}
	}

	public final ArrayItemListContext arrayItemList() throws RecognitionException {
		ArrayItemListContext _localctx = new ArrayItemListContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_arrayItemList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1245);
			arrayItem();
			setState(1250);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,124,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1246);
					match(Comma);
					setState(1247);
					arrayItem();
					}
					} 
				}
				setState(1252);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,124,_ctx);
			}
			setState(1254);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Comma) {
				{
				setState(1253);
				match(Comma);
				}
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

	public static class ArrayItemContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ChainContext chain() {
			return getRuleContext(ChainContext.class,0);
		}
		public ArrayItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterArrayItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitArrayItem(this);
		}
	}

	public final ArrayItemContext arrayItem() throws RecognitionException {
		ArrayItemContext _localctx = new ArrayItemContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_arrayItem);
		int _la;
		try {
			setState(1268);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1256);
				expression(0);
				setState(1259);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DoubleArrow) {
					{
					setState(1257);
					match(DoubleArrow);
					setState(1258);
					expression(0);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1264);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 40)) & ~0x3f) == 0 && ((1L << (_la - 40)) & ((1L << (Abstract - 40)) | (1L << (Array - 40)) | (1L << (As - 40)) | (1L << (BinaryCast - 40)) | (1L << (BoolType - 40)) | (1L << (BooleanConstant - 40)) | (1L << (Break - 40)) | (1L << (Callable - 40)) | (1L << (Case - 40)) | (1L << (Catch - 40)) | (1L << (Class - 40)) | (1L << (Clone - 40)) | (1L << (Const - 40)) | (1L << (Continue - 40)) | (1L << (Declare - 40)) | (1L << (Default - 40)) | (1L << (Do - 40)) | (1L << (DoubleCast - 40)) | (1L << (DoubleType - 40)) | (1L << (Echo - 40)) | (1L << (Else - 40)) | (1L << (ElseIf - 40)) | (1L << (Empty - 40)) | (1L << (EndDeclare - 40)) | (1L << (EndFor - 40)) | (1L << (EndForeach - 40)) | (1L << (EndIf - 40)) | (1L << (EndSwitch - 40)) | (1L << (EndWhile - 40)) | (1L << (Eval - 40)) | (1L << (Exit - 40)) | (1L << (Extends - 40)) | (1L << (Final - 40)) | (1L << (Finally - 40)) | (1L << (FloatCast - 40)) | (1L << (For - 40)) | (1L << (Foreach - 40)) | (1L << (Function - 40)) | (1L << (Global - 40)) | (1L << (Goto - 40)) | (1L << (If - 40)) | (1L << (Implements - 40)) | (1L << (Import - 40)) | (1L << (Include - 40)) | (1L << (IncludeOnce - 40)) | (1L << (InstanceOf - 40)) | (1L << (InsteadOf - 40)) | (1L << (Int8Cast - 40)) | (1L << (Int16Cast - 40)) | (1L << (Int64Type - 40)) | (1L << (IntType - 40)) | (1L << (Interface - 40)) | (1L << (IsSet - 40)) | (1L << (List - 40)) | (1L << (LogicalAnd - 40)) | (1L << (LogicalOr - 40)) | (1L << (LogicalXor - 40)) | (1L << (Namespace - 40)) | (1L << (New - 40)) | (1L << (Null - 40)) | (1L << (ObjectType - 40)) | (1L << (Parent_ - 40)) | (1L << (Partial - 40)) | (1L << (Print - 40)))) != 0) || ((((_la - 104)) & ~0x3f) == 0 && ((1L << (_la - 104)) & ((1L << (Private - 104)) | (1L << (Protected - 104)) | (1L << (Public - 104)) | (1L << (Require - 104)) | (1L << (RequireOnce - 104)) | (1L << (Resource - 104)) | (1L << (Return - 104)) | (1L << (Static - 104)) | (1L << (StringType - 104)) | (1L << (Switch - 104)) | (1L << (Throw - 104)) | (1L << (Trait - 104)) | (1L << (Try - 104)) | (1L << (Typeof - 104)) | (1L << (UintCast - 104)) | (1L << (UnicodeCast - 104)) | (1L << (Unset - 104)) | (1L << (Use - 104)) | (1L << (Var - 104)) | (1L << (While - 104)) | (1L << (Yield - 104)) | (1L << (Get - 104)) | (1L << (Set - 104)) | (1L << (Call - 104)) | (1L << (CallStatic - 104)) | (1L << (Constructor - 104)) | (1L << (Destruct - 104)) | (1L << (Wakeup - 104)) | (1L << (Sleep - 104)) | (1L << (Autoload - 104)) | (1L << (IsSet__ - 104)) | (1L << (Unset__ - 104)) | (1L << (ToString__ - 104)) | (1L << (Invoke - 104)) | (1L << (SetState - 104)) | (1L << (Clone__ - 104)) | (1L << (DebugInfo - 104)) | (1L << (Namespace__ - 104)) | (1L << (Class__ - 104)) | (1L << (Traic__ - 104)) | (1L << (Function__ - 104)) | (1L << (Method__ - 104)) | (1L << (Line__ - 104)) | (1L << (File__ - 104)) | (1L << (Dir__ - 104)) | (1L << (Inc - 104)) | (1L << (Dec - 104)))) != 0) || ((((_la - 179)) & ~0x3f) == 0 && ((1L << (_la - 179)) & ((1L << (NamespaceSeparator - 179)) | (1L << (Bang - 179)) | (1L << (Plus - 179)) | (1L << (Minus - 179)) | (1L << (Tilde - 179)) | (1L << (SuppressWarnings - 179)) | (1L << (Dollar - 179)) | (1L << (OpenRoundBracket - 179)) | (1L << (OpenSquareBracket - 179)) | (1L << (VarName - 179)) | (1L << (Label - 179)) | (1L << (Octal - 179)) | (1L << (Decimal - 179)) | (1L << (Real - 179)) | (1L << (Hex - 179)) | (1L << (Binary - 179)) | (1L << (BackQuoteString - 179)) | (1L << (SingleQuoteString - 179)) | (1L << (DoubleQuote - 179)) | (1L << (StartNowDoc - 179)) | (1L << (StartHereDoc - 179)))) != 0)) {
					{
					setState(1261);
					expression(0);
					setState(1262);
					match(DoubleArrow);
					}
				}

				setState(1266);
				match(Ampersand);
				setState(1267);
				chain();
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

	public static class LambdaFunctionUseVarsContext extends ParserRuleContext {
		public TerminalNode Use() { return getToken(PHPParser.Use, 0); }
		public List<LambdaFunctionUseVarContext> lambdaFunctionUseVar() {
			return getRuleContexts(LambdaFunctionUseVarContext.class);
		}
		public LambdaFunctionUseVarContext lambdaFunctionUseVar(int i) {
			return getRuleContext(LambdaFunctionUseVarContext.class,i);
		}
		public LambdaFunctionUseVarsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaFunctionUseVars; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterLambdaFunctionUseVars(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitLambdaFunctionUseVars(this);
		}
	}

	public final LambdaFunctionUseVarsContext lambdaFunctionUseVars() throws RecognitionException {
		LambdaFunctionUseVarsContext _localctx = new LambdaFunctionUseVarsContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_lambdaFunctionUseVars);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1270);
			match(Use);
			setState(1271);
			match(OpenRoundBracket);
			setState(1272);
			lambdaFunctionUseVar();
			setState(1277);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(1273);
				match(Comma);
				setState(1274);
				lambdaFunctionUseVar();
				}
				}
				setState(1279);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1280);
			match(CloseRoundBracket);
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

	public static class LambdaFunctionUseVarContext extends ParserRuleContext {
		public TerminalNode VarName() { return getToken(PHPParser.VarName, 0); }
		public LambdaFunctionUseVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaFunctionUseVar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterLambdaFunctionUseVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitLambdaFunctionUseVar(this);
		}
	}

	public final LambdaFunctionUseVarContext lambdaFunctionUseVar() throws RecognitionException {
		LambdaFunctionUseVarContext _localctx = new LambdaFunctionUseVarContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_lambdaFunctionUseVar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1283);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Ampersand) {
				{
				setState(1282);
				match(Ampersand);
				}
			}

			setState(1285);
			match(VarName);
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

	public static class QualifiedStaticTypeRefContext extends ParserRuleContext {
		public QualifiedNamespaceNameContext qualifiedNamespaceName() {
			return getRuleContext(QualifiedNamespaceNameContext.class,0);
		}
		public GenericDynamicArgsContext genericDynamicArgs() {
			return getRuleContext(GenericDynamicArgsContext.class,0);
		}
		public TerminalNode Static() { return getToken(PHPParser.Static, 0); }
		public QualifiedStaticTypeRefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedStaticTypeRef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterQualifiedStaticTypeRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitQualifiedStaticTypeRef(this);
		}
	}

	public final QualifiedStaticTypeRefContext qualifiedStaticTypeRef() throws RecognitionException {
		QualifiedStaticTypeRefContext _localctx = new QualifiedStaticTypeRefContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_qualifiedStaticTypeRef);
		int _la;
		try {
			setState(1292);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,132,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1287);
				qualifiedNamespaceName();
				setState(1289);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Lgeneric) {
					{
					setState(1288);
					genericDynamicArgs();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1291);
				match(Static);
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

	public static class TypeRefContext extends ParserRuleContext {
		public QualifiedNamespaceNameContext qualifiedNamespaceName() {
			return getRuleContext(QualifiedNamespaceNameContext.class,0);
		}
		public IndirectTypeRefContext indirectTypeRef() {
			return getRuleContext(IndirectTypeRefContext.class,0);
		}
		public GenericDynamicArgsContext genericDynamicArgs() {
			return getRuleContext(GenericDynamicArgsContext.class,0);
		}
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public TerminalNode Static() { return getToken(PHPParser.Static, 0); }
		public TypeRefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeRef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterTypeRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitTypeRef(this);
		}
	}

	public final TypeRefContext typeRef() throws RecognitionException {
		TypeRefContext _localctx = new TypeRefContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_typeRef);
		try {
			setState(1303);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,135,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1296);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,133,_ctx) ) {
				case 1:
					{
					setState(1294);
					qualifiedNamespaceName();
					}
					break;
				case 2:
					{
					setState(1295);
					indirectTypeRef();
					}
					break;
				}
				setState(1299);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,134,_ctx) ) {
				case 1:
					{
					setState(1298);
					genericDynamicArgs();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1301);
				primitiveType();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1302);
				match(Static);
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

	public static class IndirectTypeRefContext extends ParserRuleContext {
		public ChainBaseContext chainBase() {
			return getRuleContext(ChainBaseContext.class,0);
		}
		public List<KeyedFieldNameContext> keyedFieldName() {
			return getRuleContexts(KeyedFieldNameContext.class);
		}
		public KeyedFieldNameContext keyedFieldName(int i) {
			return getRuleContext(KeyedFieldNameContext.class,i);
		}
		public IndirectTypeRefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indirectTypeRef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterIndirectTypeRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitIndirectTypeRef(this);
		}
	}

	public final IndirectTypeRefContext indirectTypeRef() throws RecognitionException {
		IndirectTypeRefContext _localctx = new IndirectTypeRefContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_indirectTypeRef);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1305);
			chainBase();
			setState(1310);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,136,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1306);
					match(ObjectOperator);
					setState(1307);
					keyedFieldName();
					}
					} 
				}
				setState(1312);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,136,_ctx);
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

	public static class QualifiedNamespaceNameContext extends ParserRuleContext {
		public NamespaceNameListContext namespaceNameList() {
			return getRuleContext(NamespaceNameListContext.class,0);
		}
		public TerminalNode Namespace() { return getToken(PHPParser.Namespace, 0); }
		public QualifiedNamespaceNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedNamespaceName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterQualifiedNamespaceName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitQualifiedNamespaceName(this);
		}
	}

	public final QualifiedNamespaceNameContext qualifiedNamespaceName() throws RecognitionException {
		QualifiedNamespaceNameContext _localctx = new QualifiedNamespaceNameContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_qualifiedNamespaceName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1314);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,137,_ctx) ) {
			case 1:
				{
				setState(1313);
				match(Namespace);
				}
				break;
			}
			setState(1317);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NamespaceSeparator) {
				{
				setState(1316);
				match(NamespaceSeparator);
				}
			}

			setState(1319);
			namespaceNameList();
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

	public static class NamespaceNameListContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public NamespaceNameListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespaceNameList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterNamespaceNameList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitNamespaceNameList(this);
		}
	}

	public final NamespaceNameListContext namespaceNameList() throws RecognitionException {
		NamespaceNameListContext _localctx = new NamespaceNameListContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_namespaceNameList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1321);
			identifier();
			setState(1326);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,139,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1322);
					match(NamespaceSeparator);
					setState(1323);
					identifier();
					}
					} 
				}
				setState(1328);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,139,_ctx);
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

	public static class QualifiedNamespaceNameListContext extends ParserRuleContext {
		public List<QualifiedNamespaceNameContext> qualifiedNamespaceName() {
			return getRuleContexts(QualifiedNamespaceNameContext.class);
		}
		public QualifiedNamespaceNameContext qualifiedNamespaceName(int i) {
			return getRuleContext(QualifiedNamespaceNameContext.class,i);
		}
		public QualifiedNamespaceNameListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedNamespaceNameList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterQualifiedNamespaceNameList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitQualifiedNamespaceNameList(this);
		}
	}

	public final QualifiedNamespaceNameListContext qualifiedNamespaceNameList() throws RecognitionException {
		QualifiedNamespaceNameListContext _localctx = new QualifiedNamespaceNameListContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_qualifiedNamespaceNameList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1329);
			qualifiedNamespaceName();
			setState(1334);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(1330);
				match(Comma);
				setState(1331);
				qualifiedNamespaceName();
				}
				}
				setState(1336);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class ArgumentsContext extends ParserRuleContext {
		public List<ActualArgumentContext> actualArgument() {
			return getRuleContexts(ActualArgumentContext.class);
		}
		public ActualArgumentContext actualArgument(int i) {
			return getRuleContext(ActualArgumentContext.class,i);
		}
		public YieldExpressionContext yieldExpression() {
			return getRuleContext(YieldExpressionContext.class,0);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitArguments(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1337);
			match(OpenRoundBracket);
			setState(1347);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,142,_ctx) ) {
			case 1:
				{
				setState(1338);
				actualArgument();
				setState(1343);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(1339);
					match(Comma);
					setState(1340);
					actualArgument();
					}
					}
					setState(1345);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(1346);
				yieldExpression();
				}
				break;
			}
			setState(1349);
			match(CloseRoundBracket);
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

	public static class ActualArgumentContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ChainContext chain() {
			return getRuleContext(ChainContext.class,0);
		}
		public ActualArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actualArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterActualArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitActualArgument(this);
		}
	}

	public final ActualArgumentContext actualArgument() throws RecognitionException {
		ActualArgumentContext _localctx = new ActualArgumentContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_actualArgument);
		int _la;
		try {
			setState(1357);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Abstract:
			case Array:
			case As:
			case BinaryCast:
			case BoolType:
			case BooleanConstant:
			case Break:
			case Callable:
			case Case:
			case Catch:
			case Class:
			case Clone:
			case Const:
			case Continue:
			case Declare:
			case Default:
			case Do:
			case DoubleCast:
			case DoubleType:
			case Echo:
			case Else:
			case ElseIf:
			case Empty:
			case EndDeclare:
			case EndFor:
			case EndForeach:
			case EndIf:
			case EndSwitch:
			case EndWhile:
			case Eval:
			case Exit:
			case Extends:
			case Final:
			case Finally:
			case FloatCast:
			case For:
			case Foreach:
			case Function:
			case Global:
			case Goto:
			case If:
			case Implements:
			case Import:
			case Include:
			case IncludeOnce:
			case InstanceOf:
			case InsteadOf:
			case Int8Cast:
			case Int16Cast:
			case Int64Type:
			case IntType:
			case Interface:
			case IsSet:
			case List:
			case LogicalAnd:
			case LogicalOr:
			case LogicalXor:
			case Namespace:
			case New:
			case Null:
			case ObjectType:
			case Parent_:
			case Partial:
			case Print:
			case Private:
			case Protected:
			case Public:
			case Require:
			case RequireOnce:
			case Resource:
			case Return:
			case Static:
			case StringType:
			case Switch:
			case Throw:
			case Trait:
			case Try:
			case Typeof:
			case UintCast:
			case UnicodeCast:
			case Unset:
			case Use:
			case Var:
			case While:
			case Yield:
			case Get:
			case Set:
			case Call:
			case CallStatic:
			case Constructor:
			case Destruct:
			case Wakeup:
			case Sleep:
			case Autoload:
			case IsSet__:
			case Unset__:
			case ToString__:
			case Invoke:
			case SetState:
			case Clone__:
			case DebugInfo:
			case Namespace__:
			case Class__:
			case Traic__:
			case Function__:
			case Method__:
			case Line__:
			case File__:
			case Dir__:
			case Inc:
			case Dec:
			case NamespaceSeparator:
			case Ellipsis:
			case Bang:
			case Plus:
			case Minus:
			case Tilde:
			case SuppressWarnings:
			case Dollar:
			case OpenRoundBracket:
			case OpenSquareBracket:
			case VarName:
			case Label:
			case Octal:
			case Decimal:
			case Real:
			case Hex:
			case Binary:
			case BackQuoteString:
			case SingleQuoteString:
			case DoubleQuote:
			case StartNowDoc:
			case StartHereDoc:
				enterOuterAlt(_localctx, 1);
				{
				setState(1352);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Ellipsis) {
					{
					setState(1351);
					match(Ellipsis);
					}
				}

				setState(1354);
				expression(0);
				}
				break;
			case Ampersand:
				enterOuterAlt(_localctx, 2);
				{
				setState(1355);
				match(Ampersand);
				setState(1356);
				chain();
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

	public static class ConstantInititalizerContext extends ParserRuleContext {
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public TerminalNode Array() { return getToken(PHPParser.Array, 0); }
		public ConstantArrayItemListContext constantArrayItemList() {
			return getRuleContext(ConstantArrayItemListContext.class,0);
		}
		public ConstantInititalizerContext constantInititalizer() {
			return getRuleContext(ConstantInititalizerContext.class,0);
		}
		public ConstantInititalizerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantInititalizer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterConstantInititalizer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitConstantInititalizer(this);
		}
	}

	public final ConstantInititalizerContext constantInititalizer() throws RecognitionException {
		ConstantInititalizerContext _localctx = new ConstantInititalizerContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_constantInititalizer);
		int _la;
		try {
			setState(1380);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,149,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1359);
				constant();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1360);
				string();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1361);
				match(Array);
				setState(1362);
				match(OpenRoundBracket);
				setState(1367);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 40)) & ~0x3f) == 0 && ((1L << (_la - 40)) & ((1L << (Abstract - 40)) | (1L << (Array - 40)) | (1L << (As - 40)) | (1L << (BinaryCast - 40)) | (1L << (BoolType - 40)) | (1L << (BooleanConstant - 40)) | (1L << (Break - 40)) | (1L << (Callable - 40)) | (1L << (Case - 40)) | (1L << (Catch - 40)) | (1L << (Class - 40)) | (1L << (Clone - 40)) | (1L << (Const - 40)) | (1L << (Continue - 40)) | (1L << (Declare - 40)) | (1L << (Default - 40)) | (1L << (Do - 40)) | (1L << (DoubleCast - 40)) | (1L << (DoubleType - 40)) | (1L << (Echo - 40)) | (1L << (Else - 40)) | (1L << (ElseIf - 40)) | (1L << (Empty - 40)) | (1L << (EndDeclare - 40)) | (1L << (EndFor - 40)) | (1L << (EndForeach - 40)) | (1L << (EndIf - 40)) | (1L << (EndSwitch - 40)) | (1L << (EndWhile - 40)) | (1L << (Eval - 40)) | (1L << (Exit - 40)) | (1L << (Extends - 40)) | (1L << (Final - 40)) | (1L << (Finally - 40)) | (1L << (FloatCast - 40)) | (1L << (For - 40)) | (1L << (Foreach - 40)) | (1L << (Function - 40)) | (1L << (Global - 40)) | (1L << (Goto - 40)) | (1L << (If - 40)) | (1L << (Implements - 40)) | (1L << (Import - 40)) | (1L << (Include - 40)) | (1L << (IncludeOnce - 40)) | (1L << (InstanceOf - 40)) | (1L << (InsteadOf - 40)) | (1L << (Int8Cast - 40)) | (1L << (Int16Cast - 40)) | (1L << (Int64Type - 40)) | (1L << (IntType - 40)) | (1L << (Interface - 40)) | (1L << (IsSet - 40)) | (1L << (List - 40)) | (1L << (LogicalAnd - 40)) | (1L << (LogicalOr - 40)) | (1L << (LogicalXor - 40)) | (1L << (Namespace - 40)) | (1L << (New - 40)) | (1L << (Null - 40)) | (1L << (ObjectType - 40)) | (1L << (Parent_ - 40)) | (1L << (Partial - 40)) | (1L << (Print - 40)))) != 0) || ((((_la - 104)) & ~0x3f) == 0 && ((1L << (_la - 104)) & ((1L << (Private - 104)) | (1L << (Protected - 104)) | (1L << (Public - 104)) | (1L << (Require - 104)) | (1L << (RequireOnce - 104)) | (1L << (Resource - 104)) | (1L << (Return - 104)) | (1L << (Static - 104)) | (1L << (StringType - 104)) | (1L << (Switch - 104)) | (1L << (Throw - 104)) | (1L << (Trait - 104)) | (1L << (Try - 104)) | (1L << (Typeof - 104)) | (1L << (UintCast - 104)) | (1L << (UnicodeCast - 104)) | (1L << (Unset - 104)) | (1L << (Use - 104)) | (1L << (Var - 104)) | (1L << (While - 104)) | (1L << (Yield - 104)) | (1L << (Get - 104)) | (1L << (Set - 104)) | (1L << (Call - 104)) | (1L << (CallStatic - 104)) | (1L << (Constructor - 104)) | (1L << (Destruct - 104)) | (1L << (Wakeup - 104)) | (1L << (Sleep - 104)) | (1L << (Autoload - 104)) | (1L << (IsSet__ - 104)) | (1L << (Unset__ - 104)) | (1L << (ToString__ - 104)) | (1L << (Invoke - 104)) | (1L << (SetState - 104)) | (1L << (Clone__ - 104)) | (1L << (DebugInfo - 104)) | (1L << (Namespace__ - 104)) | (1L << (Class__ - 104)) | (1L << (Traic__ - 104)) | (1L << (Function__ - 104)) | (1L << (Method__ - 104)) | (1L << (Line__ - 104)) | (1L << (File__ - 104)) | (1L << (Dir__ - 104)))) != 0) || ((((_la - 179)) & ~0x3f) == 0 && ((1L << (_la - 179)) & ((1L << (NamespaceSeparator - 179)) | (1L << (Plus - 179)) | (1L << (Minus - 179)) | (1L << (Dollar - 179)) | (1L << (OpenSquareBracket - 179)) | (1L << (VarName - 179)) | (1L << (Label - 179)) | (1L << (Octal - 179)) | (1L << (Decimal - 179)) | (1L << (Real - 179)) | (1L << (Hex - 179)) | (1L << (Binary - 179)) | (1L << (SingleQuoteString - 179)) | (1L << (DoubleQuote - 179)) | (1L << (StartNowDoc - 179)) | (1L << (StartHereDoc - 179)))) != 0)) {
					{
					setState(1363);
					constantArrayItemList();
					setState(1365);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Comma) {
						{
						setState(1364);
						match(Comma);
						}
					}

					}
				}

				setState(1369);
				match(CloseRoundBracket);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1370);
				match(OpenSquareBracket);
				setState(1375);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 40)) & ~0x3f) == 0 && ((1L << (_la - 40)) & ((1L << (Abstract - 40)) | (1L << (Array - 40)) | (1L << (As - 40)) | (1L << (BinaryCast - 40)) | (1L << (BoolType - 40)) | (1L << (BooleanConstant - 40)) | (1L << (Break - 40)) | (1L << (Callable - 40)) | (1L << (Case - 40)) | (1L << (Catch - 40)) | (1L << (Class - 40)) | (1L << (Clone - 40)) | (1L << (Const - 40)) | (1L << (Continue - 40)) | (1L << (Declare - 40)) | (1L << (Default - 40)) | (1L << (Do - 40)) | (1L << (DoubleCast - 40)) | (1L << (DoubleType - 40)) | (1L << (Echo - 40)) | (1L << (Else - 40)) | (1L << (ElseIf - 40)) | (1L << (Empty - 40)) | (1L << (EndDeclare - 40)) | (1L << (EndFor - 40)) | (1L << (EndForeach - 40)) | (1L << (EndIf - 40)) | (1L << (EndSwitch - 40)) | (1L << (EndWhile - 40)) | (1L << (Eval - 40)) | (1L << (Exit - 40)) | (1L << (Extends - 40)) | (1L << (Final - 40)) | (1L << (Finally - 40)) | (1L << (FloatCast - 40)) | (1L << (For - 40)) | (1L << (Foreach - 40)) | (1L << (Function - 40)) | (1L << (Global - 40)) | (1L << (Goto - 40)) | (1L << (If - 40)) | (1L << (Implements - 40)) | (1L << (Import - 40)) | (1L << (Include - 40)) | (1L << (IncludeOnce - 40)) | (1L << (InstanceOf - 40)) | (1L << (InsteadOf - 40)) | (1L << (Int8Cast - 40)) | (1L << (Int16Cast - 40)) | (1L << (Int64Type - 40)) | (1L << (IntType - 40)) | (1L << (Interface - 40)) | (1L << (IsSet - 40)) | (1L << (List - 40)) | (1L << (LogicalAnd - 40)) | (1L << (LogicalOr - 40)) | (1L << (LogicalXor - 40)) | (1L << (Namespace - 40)) | (1L << (New - 40)) | (1L << (Null - 40)) | (1L << (ObjectType - 40)) | (1L << (Parent_ - 40)) | (1L << (Partial - 40)) | (1L << (Print - 40)))) != 0) || ((((_la - 104)) & ~0x3f) == 0 && ((1L << (_la - 104)) & ((1L << (Private - 104)) | (1L << (Protected - 104)) | (1L << (Public - 104)) | (1L << (Require - 104)) | (1L << (RequireOnce - 104)) | (1L << (Resource - 104)) | (1L << (Return - 104)) | (1L << (Static - 104)) | (1L << (StringType - 104)) | (1L << (Switch - 104)) | (1L << (Throw - 104)) | (1L << (Trait - 104)) | (1L << (Try - 104)) | (1L << (Typeof - 104)) | (1L << (UintCast - 104)) | (1L << (UnicodeCast - 104)) | (1L << (Unset - 104)) | (1L << (Use - 104)) | (1L << (Var - 104)) | (1L << (While - 104)) | (1L << (Yield - 104)) | (1L << (Get - 104)) | (1L << (Set - 104)) | (1L << (Call - 104)) | (1L << (CallStatic - 104)) | (1L << (Constructor - 104)) | (1L << (Destruct - 104)) | (1L << (Wakeup - 104)) | (1L << (Sleep - 104)) | (1L << (Autoload - 104)) | (1L << (IsSet__ - 104)) | (1L << (Unset__ - 104)) | (1L << (ToString__ - 104)) | (1L << (Invoke - 104)) | (1L << (SetState - 104)) | (1L << (Clone__ - 104)) | (1L << (DebugInfo - 104)) | (1L << (Namespace__ - 104)) | (1L << (Class__ - 104)) | (1L << (Traic__ - 104)) | (1L << (Function__ - 104)) | (1L << (Method__ - 104)) | (1L << (Line__ - 104)) | (1L << (File__ - 104)) | (1L << (Dir__ - 104)))) != 0) || ((((_la - 179)) & ~0x3f) == 0 && ((1L << (_la - 179)) & ((1L << (NamespaceSeparator - 179)) | (1L << (Plus - 179)) | (1L << (Minus - 179)) | (1L << (Dollar - 179)) | (1L << (OpenSquareBracket - 179)) | (1L << (VarName - 179)) | (1L << (Label - 179)) | (1L << (Octal - 179)) | (1L << (Decimal - 179)) | (1L << (Real - 179)) | (1L << (Hex - 179)) | (1L << (Binary - 179)) | (1L << (SingleQuoteString - 179)) | (1L << (DoubleQuote - 179)) | (1L << (StartNowDoc - 179)) | (1L << (StartHereDoc - 179)))) != 0)) {
					{
					setState(1371);
					constantArrayItemList();
					setState(1373);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Comma) {
						{
						setState(1372);
						match(Comma);
						}
					}

					}
				}

				setState(1377);
				match(CloseSquareBracket);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1378);
				_la = _input.LA(1);
				if ( !(_la==Plus || _la==Minus) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1379);
				constantInititalizer();
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

	public static class ConstantArrayItemListContext extends ParserRuleContext {
		public List<ConstantArrayItemContext> constantArrayItem() {
			return getRuleContexts(ConstantArrayItemContext.class);
		}
		public ConstantArrayItemContext constantArrayItem(int i) {
			return getRuleContext(ConstantArrayItemContext.class,i);
		}
		public ConstantArrayItemListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantArrayItemList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterConstantArrayItemList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitConstantArrayItemList(this);
		}
	}

	public final ConstantArrayItemListContext constantArrayItemList() throws RecognitionException {
		ConstantArrayItemListContext _localctx = new ConstantArrayItemListContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_constantArrayItemList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1382);
			constantArrayItem();
			setState(1387);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,150,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1383);
					match(Comma);
					setState(1384);
					constantArrayItem();
					}
					} 
				}
				setState(1389);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,150,_ctx);
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

	public static class ConstantArrayItemContext extends ParserRuleContext {
		public List<ConstantInititalizerContext> constantInititalizer() {
			return getRuleContexts(ConstantInititalizerContext.class);
		}
		public ConstantInititalizerContext constantInititalizer(int i) {
			return getRuleContext(ConstantInititalizerContext.class,i);
		}
		public ConstantArrayItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantArrayItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterConstantArrayItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitConstantArrayItem(this);
		}
	}

	public final ConstantArrayItemContext constantArrayItem() throws RecognitionException {
		ConstantArrayItemContext _localctx = new ConstantArrayItemContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_constantArrayItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1390);
			constantInititalizer();
			setState(1393);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DoubleArrow) {
				{
				setState(1391);
				match(DoubleArrow);
				setState(1392);
				constantInititalizer();
				}
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

	public static class ConstantContext extends ParserRuleContext {
		public TerminalNode Null() { return getToken(PHPParser.Null, 0); }
		public LiteralConstantContext literalConstant() {
			return getRuleContext(LiteralConstantContext.class,0);
		}
		public MagicConstantContext magicConstant() {
			return getRuleContext(MagicConstantContext.class,0);
		}
		public ClassConstantContext classConstant() {
			return getRuleContext(ClassConstantContext.class,0);
		}
		public QualifiedNamespaceNameContext qualifiedNamespaceName() {
			return getRuleContext(QualifiedNamespaceNameContext.class,0);
		}
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitConstant(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_constant);
		try {
			setState(1400);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,152,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1395);
				match(Null);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1396);
				literalConstant();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1397);
				magicConstant();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1398);
				classConstant();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1399);
				qualifiedNamespaceName();
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

	public static class LiteralConstantContext extends ParserRuleContext {
		public TerminalNode Real() { return getToken(PHPParser.Real, 0); }
		public TerminalNode BooleanConstant() { return getToken(PHPParser.BooleanConstant, 0); }
		public NumericConstantContext numericConstant() {
			return getRuleContext(NumericConstantContext.class,0);
		}
		public StringConstantContext stringConstant() {
			return getRuleContext(StringConstantContext.class,0);
		}
		public LiteralConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literalConstant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterLiteralConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitLiteralConstant(this);
		}
	}

	public final LiteralConstantContext literalConstant() throws RecognitionException {
		LiteralConstantContext _localctx = new LiteralConstantContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_literalConstant);
		try {
			setState(1406);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Real:
				enterOuterAlt(_localctx, 1);
				{
				setState(1402);
				match(Real);
				}
				break;
			case BooleanConstant:
				enterOuterAlt(_localctx, 2);
				{
				setState(1403);
				match(BooleanConstant);
				}
				break;
			case Octal:
			case Decimal:
			case Hex:
			case Binary:
				enterOuterAlt(_localctx, 3);
				{
				setState(1404);
				numericConstant();
				}
				break;
			case Label:
				enterOuterAlt(_localctx, 4);
				{
				setState(1405);
				stringConstant();
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

	public static class NumericConstantContext extends ParserRuleContext {
		public TerminalNode Octal() { return getToken(PHPParser.Octal, 0); }
		public TerminalNode Decimal() { return getToken(PHPParser.Decimal, 0); }
		public TerminalNode Hex() { return getToken(PHPParser.Hex, 0); }
		public TerminalNode Binary() { return getToken(PHPParser.Binary, 0); }
		public NumericConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numericConstant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterNumericConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitNumericConstant(this);
		}
	}

	public final NumericConstantContext numericConstant() throws RecognitionException {
		NumericConstantContext _localctx = new NumericConstantContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_numericConstant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1408);
			_la = _input.LA(1);
			if ( !(((((_la - 211)) & ~0x3f) == 0 && ((1L << (_la - 211)) & ((1L << (Octal - 211)) | (1L << (Decimal - 211)) | (1L << (Hex - 211)) | (1L << (Binary - 211)))) != 0)) ) {
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

	public static class ClassConstantContext extends ParserRuleContext {
		public TerminalNode Class() { return getToken(PHPParser.Class, 0); }
		public TerminalNode Parent_() { return getToken(PHPParser.Parent_, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode Constructor() { return getToken(PHPParser.Constructor, 0); }
		public TerminalNode Get() { return getToken(PHPParser.Get, 0); }
		public TerminalNode Set() { return getToken(PHPParser.Set, 0); }
		public QualifiedStaticTypeRefContext qualifiedStaticTypeRef() {
			return getRuleContext(QualifiedStaticTypeRefContext.class,0);
		}
		public KeyedVariableContext keyedVariable() {
			return getRuleContext(KeyedVariableContext.class,0);
		}
		public ClassConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classConstant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterClassConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitClassConstant(this);
		}
	}

	public final ClassConstantContext classConstant() throws RecognitionException {
		ClassConstantContext _localctx = new ClassConstantContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_classConstant);
		int _la;
		try {
			setState(1425);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,156,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1410);
				_la = _input.LA(1);
				if ( !(_la==Class || _la==Parent_) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1411);
				match(DoubleColon);
				setState(1416);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,154,_ctx) ) {
				case 1:
					{
					setState(1412);
					identifier();
					}
					break;
				case 2:
					{
					setState(1413);
					match(Constructor);
					}
					break;
				case 3:
					{
					setState(1414);
					match(Get);
					}
					break;
				case 4:
					{
					setState(1415);
					match(Set);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1420);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Abstract:
				case Array:
				case As:
				case BinaryCast:
				case BoolType:
				case BooleanConstant:
				case Break:
				case Callable:
				case Case:
				case Catch:
				case Class:
				case Clone:
				case Const:
				case Continue:
				case Declare:
				case Default:
				case Do:
				case DoubleCast:
				case DoubleType:
				case Echo:
				case Else:
				case ElseIf:
				case Empty:
				case EndDeclare:
				case EndFor:
				case EndForeach:
				case EndIf:
				case EndSwitch:
				case EndWhile:
				case Eval:
				case Exit:
				case Extends:
				case Final:
				case Finally:
				case FloatCast:
				case For:
				case Foreach:
				case Function:
				case Global:
				case Goto:
				case If:
				case Implements:
				case Import:
				case Include:
				case IncludeOnce:
				case InstanceOf:
				case InsteadOf:
				case Int8Cast:
				case Int16Cast:
				case Int64Type:
				case IntType:
				case Interface:
				case IsSet:
				case List:
				case LogicalAnd:
				case LogicalOr:
				case LogicalXor:
				case Namespace:
				case New:
				case Null:
				case ObjectType:
				case Parent_:
				case Partial:
				case Print:
				case Private:
				case Protected:
				case Public:
				case Require:
				case RequireOnce:
				case Resource:
				case Return:
				case Static:
				case StringType:
				case Switch:
				case Throw:
				case Trait:
				case Try:
				case Typeof:
				case UintCast:
				case UnicodeCast:
				case Unset:
				case Use:
				case Var:
				case While:
				case Yield:
				case Get:
				case Set:
				case Call:
				case CallStatic:
				case Constructor:
				case Destruct:
				case Wakeup:
				case Sleep:
				case Autoload:
				case IsSet__:
				case Unset__:
				case ToString__:
				case Invoke:
				case SetState:
				case Clone__:
				case DebugInfo:
				case Namespace__:
				case Class__:
				case Traic__:
				case Function__:
				case Method__:
				case Line__:
				case File__:
				case Dir__:
				case NamespaceSeparator:
				case Label:
					{
					setState(1418);
					qualifiedStaticTypeRef();
					}
					break;
				case Dollar:
				case VarName:
					{
					setState(1419);
					keyedVariable();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1422);
				match(DoubleColon);
				setState(1423);
				identifier();
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

	public static class StringConstantContext extends ParserRuleContext {
		public TerminalNode Label() { return getToken(PHPParser.Label, 0); }
		public StringConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringConstant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterStringConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitStringConstant(this);
		}
	}

	public final StringConstantContext stringConstant() throws RecognitionException {
		StringConstantContext _localctx = new StringConstantContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_stringConstant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1427);
			match(Label);
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

	public static class StringContext extends ParserRuleContext {
		public TerminalNode StartHereDoc() { return getToken(PHPParser.StartHereDoc, 0); }
		public List<TerminalNode> HereDocText() { return getTokens(PHPParser.HereDocText); }
		public TerminalNode HereDocText(int i) {
			return getToken(PHPParser.HereDocText, i);
		}
		public TerminalNode StartNowDoc() { return getToken(PHPParser.StartNowDoc, 0); }
		public TerminalNode SingleQuoteString() { return getToken(PHPParser.SingleQuoteString, 0); }
		public List<TerminalNode> DoubleQuote() { return getTokens(PHPParser.DoubleQuote); }
		public TerminalNode DoubleQuote(int i) {
			return getToken(PHPParser.DoubleQuote, i);
		}
		public List<InterpolatedStringPartContext> interpolatedStringPart() {
			return getRuleContexts(InterpolatedStringPartContext.class);
		}
		public InterpolatedStringPartContext interpolatedStringPart(int i) {
			return getRuleContext(InterpolatedStringPartContext.class,i);
		}
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitString(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_string);
		int _la;
		try {
			int _alt;
			setState(1450);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case StartHereDoc:
				enterOuterAlt(_localctx, 1);
				{
				setState(1429);
				match(StartHereDoc);
				setState(1431); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1430);
						match(HereDocText);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1433); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,157,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case StartNowDoc:
				enterOuterAlt(_localctx, 2);
				{
				setState(1435);
				match(StartNowDoc);
				setState(1437); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1436);
						match(HereDocText);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1439); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,158,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case SingleQuoteString:
				enterOuterAlt(_localctx, 3);
				{
				setState(1441);
				match(SingleQuoteString);
				}
				break;
			case DoubleQuote:
				enterOuterAlt(_localctx, 4);
				{
				setState(1442);
				match(DoubleQuote);
				setState(1446);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 40)) & ~0x3f) == 0 && ((1L << (_la - 40)) & ((1L << (Abstract - 40)) | (1L << (Array - 40)) | (1L << (As - 40)) | (1L << (BinaryCast - 40)) | (1L << (BoolType - 40)) | (1L << (BooleanConstant - 40)) | (1L << (Break - 40)) | (1L << (Callable - 40)) | (1L << (Case - 40)) | (1L << (Catch - 40)) | (1L << (Class - 40)) | (1L << (Clone - 40)) | (1L << (Const - 40)) | (1L << (Continue - 40)) | (1L << (Declare - 40)) | (1L << (Default - 40)) | (1L << (Do - 40)) | (1L << (DoubleCast - 40)) | (1L << (DoubleType - 40)) | (1L << (Echo - 40)) | (1L << (Else - 40)) | (1L << (ElseIf - 40)) | (1L << (Empty - 40)) | (1L << (EndDeclare - 40)) | (1L << (EndFor - 40)) | (1L << (EndForeach - 40)) | (1L << (EndIf - 40)) | (1L << (EndSwitch - 40)) | (1L << (EndWhile - 40)) | (1L << (Eval - 40)) | (1L << (Exit - 40)) | (1L << (Extends - 40)) | (1L << (Final - 40)) | (1L << (Finally - 40)) | (1L << (FloatCast - 40)) | (1L << (For - 40)) | (1L << (Foreach - 40)) | (1L << (Function - 40)) | (1L << (Global - 40)) | (1L << (Goto - 40)) | (1L << (If - 40)) | (1L << (Implements - 40)) | (1L << (Import - 40)) | (1L << (Include - 40)) | (1L << (IncludeOnce - 40)) | (1L << (InstanceOf - 40)) | (1L << (InsteadOf - 40)) | (1L << (Int8Cast - 40)) | (1L << (Int16Cast - 40)) | (1L << (Int64Type - 40)) | (1L << (IntType - 40)) | (1L << (Interface - 40)) | (1L << (IsSet - 40)) | (1L << (List - 40)) | (1L << (LogicalAnd - 40)) | (1L << (LogicalOr - 40)) | (1L << (LogicalXor - 40)) | (1L << (Namespace - 40)) | (1L << (New - 40)) | (1L << (Null - 40)) | (1L << (ObjectType - 40)) | (1L << (Parent_ - 40)) | (1L << (Partial - 40)) | (1L << (Print - 40)))) != 0) || ((((_la - 104)) & ~0x3f) == 0 && ((1L << (_la - 104)) & ((1L << (Private - 104)) | (1L << (Protected - 104)) | (1L << (Public - 104)) | (1L << (Require - 104)) | (1L << (RequireOnce - 104)) | (1L << (Resource - 104)) | (1L << (Return - 104)) | (1L << (Static - 104)) | (1L << (StringType - 104)) | (1L << (Switch - 104)) | (1L << (Throw - 104)) | (1L << (Trait - 104)) | (1L << (Try - 104)) | (1L << (Typeof - 104)) | (1L << (UintCast - 104)) | (1L << (UnicodeCast - 104)) | (1L << (Unset - 104)) | (1L << (Use - 104)) | (1L << (Var - 104)) | (1L << (While - 104)) | (1L << (Yield - 104)) | (1L << (Get - 104)) | (1L << (Set - 104)) | (1L << (Call - 104)) | (1L << (CallStatic - 104)) | (1L << (Constructor - 104)) | (1L << (Destruct - 104)) | (1L << (Wakeup - 104)) | (1L << (Sleep - 104)) | (1L << (Autoload - 104)) | (1L << (IsSet__ - 104)) | (1L << (Unset__ - 104)) | (1L << (ToString__ - 104)) | (1L << (Invoke - 104)) | (1L << (SetState - 104)) | (1L << (Clone__ - 104)) | (1L << (DebugInfo - 104)) | (1L << (Namespace__ - 104)) | (1L << (Class__ - 104)) | (1L << (Traic__ - 104)) | (1L << (Function__ - 104)) | (1L << (Method__ - 104)) | (1L << (Line__ - 104)) | (1L << (File__ - 104)) | (1L << (Dir__ - 104)))) != 0) || ((((_la - 179)) & ~0x3f) == 0 && ((1L << (_la - 179)) & ((1L << (NamespaceSeparator - 179)) | (1L << (Dollar - 179)) | (1L << (OpenRoundBracket - 179)) | (1L << (VarName - 179)) | (1L << (Label - 179)) | (1L << (StringPart - 179)))) != 0)) {
					{
					{
					setState(1443);
					interpolatedStringPart();
					}
					}
					setState(1448);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1449);
				match(DoubleQuote);
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

	public static class InterpolatedStringPartContext extends ParserRuleContext {
		public TerminalNode StringPart() { return getToken(PHPParser.StringPart, 0); }
		public ChainContext chain() {
			return getRuleContext(ChainContext.class,0);
		}
		public InterpolatedStringPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interpolatedStringPart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterInterpolatedStringPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitInterpolatedStringPart(this);
		}
	}

	public final InterpolatedStringPartContext interpolatedStringPart() throws RecognitionException {
		InterpolatedStringPartContext _localctx = new InterpolatedStringPartContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_interpolatedStringPart);
		try {
			setState(1454);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case StringPart:
				enterOuterAlt(_localctx, 1);
				{
				setState(1452);
				match(StringPart);
				}
				break;
			case Abstract:
			case Array:
			case As:
			case BinaryCast:
			case BoolType:
			case BooleanConstant:
			case Break:
			case Callable:
			case Case:
			case Catch:
			case Class:
			case Clone:
			case Const:
			case Continue:
			case Declare:
			case Default:
			case Do:
			case DoubleCast:
			case DoubleType:
			case Echo:
			case Else:
			case ElseIf:
			case Empty:
			case EndDeclare:
			case EndFor:
			case EndForeach:
			case EndIf:
			case EndSwitch:
			case EndWhile:
			case Eval:
			case Exit:
			case Extends:
			case Final:
			case Finally:
			case FloatCast:
			case For:
			case Foreach:
			case Function:
			case Global:
			case Goto:
			case If:
			case Implements:
			case Import:
			case Include:
			case IncludeOnce:
			case InstanceOf:
			case InsteadOf:
			case Int8Cast:
			case Int16Cast:
			case Int64Type:
			case IntType:
			case Interface:
			case IsSet:
			case List:
			case LogicalAnd:
			case LogicalOr:
			case LogicalXor:
			case Namespace:
			case New:
			case Null:
			case ObjectType:
			case Parent_:
			case Partial:
			case Print:
			case Private:
			case Protected:
			case Public:
			case Require:
			case RequireOnce:
			case Resource:
			case Return:
			case Static:
			case StringType:
			case Switch:
			case Throw:
			case Trait:
			case Try:
			case Typeof:
			case UintCast:
			case UnicodeCast:
			case Unset:
			case Use:
			case Var:
			case While:
			case Yield:
			case Get:
			case Set:
			case Call:
			case CallStatic:
			case Constructor:
			case Destruct:
			case Wakeup:
			case Sleep:
			case Autoload:
			case IsSet__:
			case Unset__:
			case ToString__:
			case Invoke:
			case SetState:
			case Clone__:
			case DebugInfo:
			case Namespace__:
			case Class__:
			case Traic__:
			case Function__:
			case Method__:
			case Line__:
			case File__:
			case Dir__:
			case NamespaceSeparator:
			case Dollar:
			case OpenRoundBracket:
			case VarName:
			case Label:
				enterOuterAlt(_localctx, 2);
				{
				setState(1453);
				chain();
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

	public static class ChainListContext extends ParserRuleContext {
		public List<ChainContext> chain() {
			return getRuleContexts(ChainContext.class);
		}
		public ChainContext chain(int i) {
			return getRuleContext(ChainContext.class,i);
		}
		public ChainListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chainList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterChainList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitChainList(this);
		}
	}

	public final ChainListContext chainList() throws RecognitionException {
		ChainListContext _localctx = new ChainListContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_chainList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1456);
			chain();
			setState(1461);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(1457);
				match(Comma);
				setState(1458);
				chain();
				}
				}
				setState(1463);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class ChainContext extends ParserRuleContext {
		public ChainBaseContext chainBase() {
			return getRuleContext(ChainBaseContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public NewExprContext newExpr() {
			return getRuleContext(NewExprContext.class,0);
		}
		public List<MemberAccessContext> memberAccess() {
			return getRuleContexts(MemberAccessContext.class);
		}
		public MemberAccessContext memberAccess(int i) {
			return getRuleContext(MemberAccessContext.class,i);
		}
		public ChainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chain; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterChain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitChain(this);
		}
	}

	public final ChainContext chain() throws RecognitionException {
		ChainContext _localctx = new ChainContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_chain);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1470);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,163,_ctx) ) {
			case 1:
				{
				setState(1464);
				chainBase();
				}
				break;
			case 2:
				{
				setState(1465);
				functionCall();
				}
				break;
			case 3:
				{
				setState(1466);
				match(OpenRoundBracket);
				setState(1467);
				newExpr();
				setState(1468);
				match(CloseRoundBracket);
				}
				break;
			}
			setState(1475);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,164,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1472);
					memberAccess();
					}
					} 
				}
				setState(1477);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,164,_ctx);
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

	public static class MemberAccessContext extends ParserRuleContext {
		public KeyedFieldNameContext keyedFieldName() {
			return getRuleContext(KeyedFieldNameContext.class,0);
		}
		public ActualArgumentsContext actualArguments() {
			return getRuleContext(ActualArgumentsContext.class,0);
		}
		public MemberAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberAccess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterMemberAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitMemberAccess(this);
		}
	}

	public final MemberAccessContext memberAccess() throws RecognitionException {
		MemberAccessContext _localctx = new MemberAccessContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_memberAccess);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1478);
			match(ObjectOperator);
			setState(1479);
			keyedFieldName();
			setState(1481);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,165,_ctx) ) {
			case 1:
				{
				setState(1480);
				actualArguments();
				}
				break;
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

	public static class FunctionCallContext extends ParserRuleContext {
		public FunctionCallNameContext functionCallName() {
			return getRuleContext(FunctionCallNameContext.class,0);
		}
		public ActualArgumentsContext actualArguments() {
			return getRuleContext(ActualArgumentsContext.class,0);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitFunctionCall(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_functionCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1483);
			functionCallName();
			setState(1484);
			actualArguments();
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

	public static class FunctionCallNameContext extends ParserRuleContext {
		public QualifiedNamespaceNameContext qualifiedNamespaceName() {
			return getRuleContext(QualifiedNamespaceNameContext.class,0);
		}
		public ClassConstantContext classConstant() {
			return getRuleContext(ClassConstantContext.class,0);
		}
		public ChainBaseContext chainBase() {
			return getRuleContext(ChainBaseContext.class,0);
		}
		public FunctionCallNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCallName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterFunctionCallName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitFunctionCallName(this);
		}
	}

	public final FunctionCallNameContext functionCallName() throws RecognitionException {
		FunctionCallNameContext _localctx = new FunctionCallNameContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_functionCallName);
		try {
			setState(1489);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,166,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1486);
				qualifiedNamespaceName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1487);
				classConstant();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1488);
				chainBase();
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

	public static class ActualArgumentsContext extends ParserRuleContext {
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public GenericDynamicArgsContext genericDynamicArgs() {
			return getRuleContext(GenericDynamicArgsContext.class,0);
		}
		public List<SquareCurlyExpressionContext> squareCurlyExpression() {
			return getRuleContexts(SquareCurlyExpressionContext.class);
		}
		public SquareCurlyExpressionContext squareCurlyExpression(int i) {
			return getRuleContext(SquareCurlyExpressionContext.class,i);
		}
		public ActualArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actualArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterActualArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitActualArguments(this);
		}
	}

	public final ActualArgumentsContext actualArguments() throws RecognitionException {
		ActualArgumentsContext _localctx = new ActualArgumentsContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_actualArguments);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1492);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Lgeneric) {
				{
				setState(1491);
				genericDynamicArgs();
				}
			}

			setState(1494);
			arguments();
			setState(1498);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,168,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1495);
					squareCurlyExpression();
					}
					} 
				}
				setState(1500);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,168,_ctx);
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

	public static class ChainBaseContext extends ParserRuleContext {
		public List<KeyedVariableContext> keyedVariable() {
			return getRuleContexts(KeyedVariableContext.class);
		}
		public KeyedVariableContext keyedVariable(int i) {
			return getRuleContext(KeyedVariableContext.class,i);
		}
		public QualifiedStaticTypeRefContext qualifiedStaticTypeRef() {
			return getRuleContext(QualifiedStaticTypeRefContext.class,0);
		}
		public ChainBaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chainBase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterChainBase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitChainBase(this);
		}
	}

	public final ChainBaseContext chainBase() throws RecognitionException {
		ChainBaseContext _localctx = new ChainBaseContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_chainBase);
		try {
			setState(1510);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Dollar:
			case VarName:
				enterOuterAlt(_localctx, 1);
				{
				setState(1501);
				keyedVariable();
				setState(1504);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,169,_ctx) ) {
				case 1:
					{
					setState(1502);
					match(DoubleColon);
					setState(1503);
					keyedVariable();
					}
					break;
				}
				}
				break;
			case Abstract:
			case Array:
			case As:
			case BinaryCast:
			case BoolType:
			case BooleanConstant:
			case Break:
			case Callable:
			case Case:
			case Catch:
			case Class:
			case Clone:
			case Const:
			case Continue:
			case Declare:
			case Default:
			case Do:
			case DoubleCast:
			case DoubleType:
			case Echo:
			case Else:
			case ElseIf:
			case Empty:
			case EndDeclare:
			case EndFor:
			case EndForeach:
			case EndIf:
			case EndSwitch:
			case EndWhile:
			case Eval:
			case Exit:
			case Extends:
			case Final:
			case Finally:
			case FloatCast:
			case For:
			case Foreach:
			case Function:
			case Global:
			case Goto:
			case If:
			case Implements:
			case Import:
			case Include:
			case IncludeOnce:
			case InstanceOf:
			case InsteadOf:
			case Int8Cast:
			case Int16Cast:
			case Int64Type:
			case IntType:
			case Interface:
			case IsSet:
			case List:
			case LogicalAnd:
			case LogicalOr:
			case LogicalXor:
			case Namespace:
			case New:
			case Null:
			case ObjectType:
			case Parent_:
			case Partial:
			case Print:
			case Private:
			case Protected:
			case Public:
			case Require:
			case RequireOnce:
			case Resource:
			case Return:
			case Static:
			case StringType:
			case Switch:
			case Throw:
			case Trait:
			case Try:
			case Typeof:
			case UintCast:
			case UnicodeCast:
			case Unset:
			case Use:
			case Var:
			case While:
			case Yield:
			case Get:
			case Set:
			case Call:
			case CallStatic:
			case Constructor:
			case Destruct:
			case Wakeup:
			case Sleep:
			case Autoload:
			case IsSet__:
			case Unset__:
			case ToString__:
			case Invoke:
			case SetState:
			case Clone__:
			case DebugInfo:
			case Namespace__:
			case Class__:
			case Traic__:
			case Function__:
			case Method__:
			case Line__:
			case File__:
			case Dir__:
			case NamespaceSeparator:
			case Label:
				enterOuterAlt(_localctx, 2);
				{
				setState(1506);
				qualifiedStaticTypeRef();
				setState(1507);
				match(DoubleColon);
				setState(1508);
				keyedVariable();
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

	public static class KeyedFieldNameContext extends ParserRuleContext {
		public KeyedSimpleFieldNameContext keyedSimpleFieldName() {
			return getRuleContext(KeyedSimpleFieldNameContext.class,0);
		}
		public KeyedVariableContext keyedVariable() {
			return getRuleContext(KeyedVariableContext.class,0);
		}
		public KeyedFieldNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyedFieldName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterKeyedFieldName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitKeyedFieldName(this);
		}
	}

	public final KeyedFieldNameContext keyedFieldName() throws RecognitionException {
		KeyedFieldNameContext _localctx = new KeyedFieldNameContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_keyedFieldName);
		try {
			setState(1514);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Abstract:
			case Array:
			case As:
			case BinaryCast:
			case BoolType:
			case BooleanConstant:
			case Break:
			case Callable:
			case Case:
			case Catch:
			case Class:
			case Clone:
			case Const:
			case Continue:
			case Declare:
			case Default:
			case Do:
			case DoubleCast:
			case DoubleType:
			case Echo:
			case Else:
			case ElseIf:
			case Empty:
			case EndDeclare:
			case EndFor:
			case EndForeach:
			case EndIf:
			case EndSwitch:
			case EndWhile:
			case Eval:
			case Exit:
			case Extends:
			case Final:
			case Finally:
			case FloatCast:
			case For:
			case Foreach:
			case Function:
			case Global:
			case Goto:
			case If:
			case Implements:
			case Import:
			case Include:
			case IncludeOnce:
			case InstanceOf:
			case InsteadOf:
			case Int8Cast:
			case Int16Cast:
			case Int64Type:
			case IntType:
			case Interface:
			case IsSet:
			case List:
			case LogicalAnd:
			case LogicalOr:
			case LogicalXor:
			case Namespace:
			case New:
			case Null:
			case ObjectType:
			case Parent_:
			case Partial:
			case Print:
			case Private:
			case Protected:
			case Public:
			case Require:
			case RequireOnce:
			case Resource:
			case Return:
			case Static:
			case StringType:
			case Switch:
			case Throw:
			case Trait:
			case Try:
			case Typeof:
			case UintCast:
			case UnicodeCast:
			case Unset:
			case Use:
			case Var:
			case While:
			case Yield:
			case Get:
			case Set:
			case Call:
			case CallStatic:
			case Constructor:
			case Destruct:
			case Wakeup:
			case Sleep:
			case Autoload:
			case IsSet__:
			case Unset__:
			case ToString__:
			case Invoke:
			case SetState:
			case Clone__:
			case DebugInfo:
			case Namespace__:
			case Class__:
			case Traic__:
			case Function__:
			case Method__:
			case Line__:
			case File__:
			case Dir__:
			case OpenCurlyBracket:
			case Label:
				enterOuterAlt(_localctx, 1);
				{
				setState(1512);
				keyedSimpleFieldName();
				}
				break;
			case Dollar:
			case VarName:
				enterOuterAlt(_localctx, 2);
				{
				setState(1513);
				keyedVariable();
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

	public static class KeyedSimpleFieldNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode OpenCurlyBracket() { return getToken(PHPParser.OpenCurlyBracket, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<SquareCurlyExpressionContext> squareCurlyExpression() {
			return getRuleContexts(SquareCurlyExpressionContext.class);
		}
		public SquareCurlyExpressionContext squareCurlyExpression(int i) {
			return getRuleContext(SquareCurlyExpressionContext.class,i);
		}
		public KeyedSimpleFieldNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyedSimpleFieldName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterKeyedSimpleFieldName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitKeyedSimpleFieldName(this);
		}
	}

	public final KeyedSimpleFieldNameContext keyedSimpleFieldName() throws RecognitionException {
		KeyedSimpleFieldNameContext _localctx = new KeyedSimpleFieldNameContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_keyedSimpleFieldName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1521);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Abstract:
			case Array:
			case As:
			case BinaryCast:
			case BoolType:
			case BooleanConstant:
			case Break:
			case Callable:
			case Case:
			case Catch:
			case Class:
			case Clone:
			case Const:
			case Continue:
			case Declare:
			case Default:
			case Do:
			case DoubleCast:
			case DoubleType:
			case Echo:
			case Else:
			case ElseIf:
			case Empty:
			case EndDeclare:
			case EndFor:
			case EndForeach:
			case EndIf:
			case EndSwitch:
			case EndWhile:
			case Eval:
			case Exit:
			case Extends:
			case Final:
			case Finally:
			case FloatCast:
			case For:
			case Foreach:
			case Function:
			case Global:
			case Goto:
			case If:
			case Implements:
			case Import:
			case Include:
			case IncludeOnce:
			case InstanceOf:
			case InsteadOf:
			case Int8Cast:
			case Int16Cast:
			case Int64Type:
			case IntType:
			case Interface:
			case IsSet:
			case List:
			case LogicalAnd:
			case LogicalOr:
			case LogicalXor:
			case Namespace:
			case New:
			case Null:
			case ObjectType:
			case Parent_:
			case Partial:
			case Print:
			case Private:
			case Protected:
			case Public:
			case Require:
			case RequireOnce:
			case Resource:
			case Return:
			case Static:
			case StringType:
			case Switch:
			case Throw:
			case Trait:
			case Try:
			case Typeof:
			case UintCast:
			case UnicodeCast:
			case Unset:
			case Use:
			case Var:
			case While:
			case Yield:
			case Get:
			case Set:
			case Call:
			case CallStatic:
			case Constructor:
			case Destruct:
			case Wakeup:
			case Sleep:
			case Autoload:
			case IsSet__:
			case Unset__:
			case ToString__:
			case Invoke:
			case SetState:
			case Clone__:
			case DebugInfo:
			case Namespace__:
			case Class__:
			case Traic__:
			case Function__:
			case Method__:
			case Line__:
			case File__:
			case Dir__:
			case Label:
				{
				setState(1516);
				identifier();
				}
				break;
			case OpenCurlyBracket:
				{
				setState(1517);
				match(OpenCurlyBracket);
				setState(1518);
				expression(0);
				setState(1519);
				match(CloseCurlyBracket);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1526);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,173,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1523);
					squareCurlyExpression();
					}
					} 
				}
				setState(1528);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,173,_ctx);
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

	public static class KeyedVariableContext extends ParserRuleContext {
		public TerminalNode VarName() { return getToken(PHPParser.VarName, 0); }
		public List<TerminalNode> Dollar() { return getTokens(PHPParser.Dollar); }
		public TerminalNode Dollar(int i) {
			return getToken(PHPParser.Dollar, i);
		}
		public TerminalNode OpenCurlyBracket() { return getToken(PHPParser.OpenCurlyBracket, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<SquareCurlyExpressionContext> squareCurlyExpression() {
			return getRuleContexts(SquareCurlyExpressionContext.class);
		}
		public SquareCurlyExpressionContext squareCurlyExpression(int i) {
			return getRuleContext(SquareCurlyExpressionContext.class,i);
		}
		public KeyedVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyedVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterKeyedVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitKeyedVariable(this);
		}
	}

	public final KeyedVariableContext keyedVariable() throws RecognitionException {
		KeyedVariableContext _localctx = new KeyedVariableContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_keyedVariable);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1532);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,174,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1529);
					match(Dollar);
					}
					} 
				}
				setState(1534);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,174,_ctx);
			}
			setState(1541);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VarName:
				{
				setState(1535);
				match(VarName);
				}
				break;
			case Dollar:
				{
				setState(1536);
				match(Dollar);
				setState(1537);
				match(OpenCurlyBracket);
				setState(1538);
				expression(0);
				setState(1539);
				match(CloseCurlyBracket);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1546);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,176,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1543);
					squareCurlyExpression();
					}
					} 
				}
				setState(1548);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,176,_ctx);
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

	public static class SquareCurlyExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode OpenCurlyBracket() { return getToken(PHPParser.OpenCurlyBracket, 0); }
		public SquareCurlyExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_squareCurlyExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterSquareCurlyExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitSquareCurlyExpression(this);
		}
	}

	public final SquareCurlyExpressionContext squareCurlyExpression() throws RecognitionException {
		SquareCurlyExpressionContext _localctx = new SquareCurlyExpressionContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_squareCurlyExpression);
		int _la;
		try {
			setState(1558);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OpenSquareBracket:
				enterOuterAlt(_localctx, 1);
				{
				setState(1549);
				match(OpenSquareBracket);
				setState(1551);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 40)) & ~0x3f) == 0 && ((1L << (_la - 40)) & ((1L << (Abstract - 40)) | (1L << (Array - 40)) | (1L << (As - 40)) | (1L << (BinaryCast - 40)) | (1L << (BoolType - 40)) | (1L << (BooleanConstant - 40)) | (1L << (Break - 40)) | (1L << (Callable - 40)) | (1L << (Case - 40)) | (1L << (Catch - 40)) | (1L << (Class - 40)) | (1L << (Clone - 40)) | (1L << (Const - 40)) | (1L << (Continue - 40)) | (1L << (Declare - 40)) | (1L << (Default - 40)) | (1L << (Do - 40)) | (1L << (DoubleCast - 40)) | (1L << (DoubleType - 40)) | (1L << (Echo - 40)) | (1L << (Else - 40)) | (1L << (ElseIf - 40)) | (1L << (Empty - 40)) | (1L << (EndDeclare - 40)) | (1L << (EndFor - 40)) | (1L << (EndForeach - 40)) | (1L << (EndIf - 40)) | (1L << (EndSwitch - 40)) | (1L << (EndWhile - 40)) | (1L << (Eval - 40)) | (1L << (Exit - 40)) | (1L << (Extends - 40)) | (1L << (Final - 40)) | (1L << (Finally - 40)) | (1L << (FloatCast - 40)) | (1L << (For - 40)) | (1L << (Foreach - 40)) | (1L << (Function - 40)) | (1L << (Global - 40)) | (1L << (Goto - 40)) | (1L << (If - 40)) | (1L << (Implements - 40)) | (1L << (Import - 40)) | (1L << (Include - 40)) | (1L << (IncludeOnce - 40)) | (1L << (InstanceOf - 40)) | (1L << (InsteadOf - 40)) | (1L << (Int8Cast - 40)) | (1L << (Int16Cast - 40)) | (1L << (Int64Type - 40)) | (1L << (IntType - 40)) | (1L << (Interface - 40)) | (1L << (IsSet - 40)) | (1L << (List - 40)) | (1L << (LogicalAnd - 40)) | (1L << (LogicalOr - 40)) | (1L << (LogicalXor - 40)) | (1L << (Namespace - 40)) | (1L << (New - 40)) | (1L << (Null - 40)) | (1L << (ObjectType - 40)) | (1L << (Parent_ - 40)) | (1L << (Partial - 40)) | (1L << (Print - 40)))) != 0) || ((((_la - 104)) & ~0x3f) == 0 && ((1L << (_la - 104)) & ((1L << (Private - 104)) | (1L << (Protected - 104)) | (1L << (Public - 104)) | (1L << (Require - 104)) | (1L << (RequireOnce - 104)) | (1L << (Resource - 104)) | (1L << (Return - 104)) | (1L << (Static - 104)) | (1L << (StringType - 104)) | (1L << (Switch - 104)) | (1L << (Throw - 104)) | (1L << (Trait - 104)) | (1L << (Try - 104)) | (1L << (Typeof - 104)) | (1L << (UintCast - 104)) | (1L << (UnicodeCast - 104)) | (1L << (Unset - 104)) | (1L << (Use - 104)) | (1L << (Var - 104)) | (1L << (While - 104)) | (1L << (Yield - 104)) | (1L << (Get - 104)) | (1L << (Set - 104)) | (1L << (Call - 104)) | (1L << (CallStatic - 104)) | (1L << (Constructor - 104)) | (1L << (Destruct - 104)) | (1L << (Wakeup - 104)) | (1L << (Sleep - 104)) | (1L << (Autoload - 104)) | (1L << (IsSet__ - 104)) | (1L << (Unset__ - 104)) | (1L << (ToString__ - 104)) | (1L << (Invoke - 104)) | (1L << (SetState - 104)) | (1L << (Clone__ - 104)) | (1L << (DebugInfo - 104)) | (1L << (Namespace__ - 104)) | (1L << (Class__ - 104)) | (1L << (Traic__ - 104)) | (1L << (Function__ - 104)) | (1L << (Method__ - 104)) | (1L << (Line__ - 104)) | (1L << (File__ - 104)) | (1L << (Dir__ - 104)) | (1L << (Inc - 104)) | (1L << (Dec - 104)))) != 0) || ((((_la - 179)) & ~0x3f) == 0 && ((1L << (_la - 179)) & ((1L << (NamespaceSeparator - 179)) | (1L << (Bang - 179)) | (1L << (Plus - 179)) | (1L << (Minus - 179)) | (1L << (Tilde - 179)) | (1L << (SuppressWarnings - 179)) | (1L << (Dollar - 179)) | (1L << (OpenRoundBracket - 179)) | (1L << (OpenSquareBracket - 179)) | (1L << (VarName - 179)) | (1L << (Label - 179)) | (1L << (Octal - 179)) | (1L << (Decimal - 179)) | (1L << (Real - 179)) | (1L << (Hex - 179)) | (1L << (Binary - 179)) | (1L << (BackQuoteString - 179)) | (1L << (SingleQuoteString - 179)) | (1L << (DoubleQuote - 179)) | (1L << (StartNowDoc - 179)) | (1L << (StartHereDoc - 179)))) != 0)) {
					{
					setState(1550);
					expression(0);
					}
				}

				setState(1553);
				match(CloseSquareBracket);
				}
				break;
			case OpenCurlyBracket:
				enterOuterAlt(_localctx, 2);
				{
				setState(1554);
				match(OpenCurlyBracket);
				setState(1555);
				expression(0);
				setState(1556);
				match(CloseCurlyBracket);
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

	public static class AssignmentListContext extends ParserRuleContext {
		public List<AssignmentListElementContext> assignmentListElement() {
			return getRuleContexts(AssignmentListElementContext.class);
		}
		public AssignmentListElementContext assignmentListElement(int i) {
			return getRuleContext(AssignmentListElementContext.class,i);
		}
		public AssignmentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterAssignmentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitAssignmentList(this);
		}
	}

	public final AssignmentListContext assignmentList() throws RecognitionException {
		AssignmentListContext _localctx = new AssignmentListContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_assignmentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1561);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 40)) & ~0x3f) == 0 && ((1L << (_la - 40)) & ((1L << (Abstract - 40)) | (1L << (Array - 40)) | (1L << (As - 40)) | (1L << (BinaryCast - 40)) | (1L << (BoolType - 40)) | (1L << (BooleanConstant - 40)) | (1L << (Break - 40)) | (1L << (Callable - 40)) | (1L << (Case - 40)) | (1L << (Catch - 40)) | (1L << (Class - 40)) | (1L << (Clone - 40)) | (1L << (Const - 40)) | (1L << (Continue - 40)) | (1L << (Declare - 40)) | (1L << (Default - 40)) | (1L << (Do - 40)) | (1L << (DoubleCast - 40)) | (1L << (DoubleType - 40)) | (1L << (Echo - 40)) | (1L << (Else - 40)) | (1L << (ElseIf - 40)) | (1L << (Empty - 40)) | (1L << (EndDeclare - 40)) | (1L << (EndFor - 40)) | (1L << (EndForeach - 40)) | (1L << (EndIf - 40)) | (1L << (EndSwitch - 40)) | (1L << (EndWhile - 40)) | (1L << (Eval - 40)) | (1L << (Exit - 40)) | (1L << (Extends - 40)) | (1L << (Final - 40)) | (1L << (Finally - 40)) | (1L << (FloatCast - 40)) | (1L << (For - 40)) | (1L << (Foreach - 40)) | (1L << (Function - 40)) | (1L << (Global - 40)) | (1L << (Goto - 40)) | (1L << (If - 40)) | (1L << (Implements - 40)) | (1L << (Import - 40)) | (1L << (Include - 40)) | (1L << (IncludeOnce - 40)) | (1L << (InstanceOf - 40)) | (1L << (InsteadOf - 40)) | (1L << (Int8Cast - 40)) | (1L << (Int16Cast - 40)) | (1L << (Int64Type - 40)) | (1L << (IntType - 40)) | (1L << (Interface - 40)) | (1L << (IsSet - 40)) | (1L << (List - 40)) | (1L << (LogicalAnd - 40)) | (1L << (LogicalOr - 40)) | (1L << (LogicalXor - 40)) | (1L << (Namespace - 40)) | (1L << (New - 40)) | (1L << (Null - 40)) | (1L << (ObjectType - 40)) | (1L << (Parent_ - 40)) | (1L << (Partial - 40)) | (1L << (Print - 40)))) != 0) || ((((_la - 104)) & ~0x3f) == 0 && ((1L << (_la - 104)) & ((1L << (Private - 104)) | (1L << (Protected - 104)) | (1L << (Public - 104)) | (1L << (Require - 104)) | (1L << (RequireOnce - 104)) | (1L << (Resource - 104)) | (1L << (Return - 104)) | (1L << (Static - 104)) | (1L << (StringType - 104)) | (1L << (Switch - 104)) | (1L << (Throw - 104)) | (1L << (Trait - 104)) | (1L << (Try - 104)) | (1L << (Typeof - 104)) | (1L << (UintCast - 104)) | (1L << (UnicodeCast - 104)) | (1L << (Unset - 104)) | (1L << (Use - 104)) | (1L << (Var - 104)) | (1L << (While - 104)) | (1L << (Yield - 104)) | (1L << (Get - 104)) | (1L << (Set - 104)) | (1L << (Call - 104)) | (1L << (CallStatic - 104)) | (1L << (Constructor - 104)) | (1L << (Destruct - 104)) | (1L << (Wakeup - 104)) | (1L << (Sleep - 104)) | (1L << (Autoload - 104)) | (1L << (IsSet__ - 104)) | (1L << (Unset__ - 104)) | (1L << (ToString__ - 104)) | (1L << (Invoke - 104)) | (1L << (SetState - 104)) | (1L << (Clone__ - 104)) | (1L << (DebugInfo - 104)) | (1L << (Namespace__ - 104)) | (1L << (Class__ - 104)) | (1L << (Traic__ - 104)) | (1L << (Function__ - 104)) | (1L << (Method__ - 104)) | (1L << (Line__ - 104)) | (1L << (File__ - 104)) | (1L << (Dir__ - 104)))) != 0) || ((((_la - 179)) & ~0x3f) == 0 && ((1L << (_la - 179)) & ((1L << (NamespaceSeparator - 179)) | (1L << (Dollar - 179)) | (1L << (OpenRoundBracket - 179)) | (1L << (VarName - 179)) | (1L << (Label - 179)))) != 0)) {
				{
				setState(1560);
				assignmentListElement();
				}
			}

			setState(1569);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(1563);
				match(Comma);
				setState(1565);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 40)) & ~0x3f) == 0 && ((1L << (_la - 40)) & ((1L << (Abstract - 40)) | (1L << (Array - 40)) | (1L << (As - 40)) | (1L << (BinaryCast - 40)) | (1L << (BoolType - 40)) | (1L << (BooleanConstant - 40)) | (1L << (Break - 40)) | (1L << (Callable - 40)) | (1L << (Case - 40)) | (1L << (Catch - 40)) | (1L << (Class - 40)) | (1L << (Clone - 40)) | (1L << (Const - 40)) | (1L << (Continue - 40)) | (1L << (Declare - 40)) | (1L << (Default - 40)) | (1L << (Do - 40)) | (1L << (DoubleCast - 40)) | (1L << (DoubleType - 40)) | (1L << (Echo - 40)) | (1L << (Else - 40)) | (1L << (ElseIf - 40)) | (1L << (Empty - 40)) | (1L << (EndDeclare - 40)) | (1L << (EndFor - 40)) | (1L << (EndForeach - 40)) | (1L << (EndIf - 40)) | (1L << (EndSwitch - 40)) | (1L << (EndWhile - 40)) | (1L << (Eval - 40)) | (1L << (Exit - 40)) | (1L << (Extends - 40)) | (1L << (Final - 40)) | (1L << (Finally - 40)) | (1L << (FloatCast - 40)) | (1L << (For - 40)) | (1L << (Foreach - 40)) | (1L << (Function - 40)) | (1L << (Global - 40)) | (1L << (Goto - 40)) | (1L << (If - 40)) | (1L << (Implements - 40)) | (1L << (Import - 40)) | (1L << (Include - 40)) | (1L << (IncludeOnce - 40)) | (1L << (InstanceOf - 40)) | (1L << (InsteadOf - 40)) | (1L << (Int8Cast - 40)) | (1L << (Int16Cast - 40)) | (1L << (Int64Type - 40)) | (1L << (IntType - 40)) | (1L << (Interface - 40)) | (1L << (IsSet - 40)) | (1L << (List - 40)) | (1L << (LogicalAnd - 40)) | (1L << (LogicalOr - 40)) | (1L << (LogicalXor - 40)) | (1L << (Namespace - 40)) | (1L << (New - 40)) | (1L << (Null - 40)) | (1L << (ObjectType - 40)) | (1L << (Parent_ - 40)) | (1L << (Partial - 40)) | (1L << (Print - 40)))) != 0) || ((((_la - 104)) & ~0x3f) == 0 && ((1L << (_la - 104)) & ((1L << (Private - 104)) | (1L << (Protected - 104)) | (1L << (Public - 104)) | (1L << (Require - 104)) | (1L << (RequireOnce - 104)) | (1L << (Resource - 104)) | (1L << (Return - 104)) | (1L << (Static - 104)) | (1L << (StringType - 104)) | (1L << (Switch - 104)) | (1L << (Throw - 104)) | (1L << (Trait - 104)) | (1L << (Try - 104)) | (1L << (Typeof - 104)) | (1L << (UintCast - 104)) | (1L << (UnicodeCast - 104)) | (1L << (Unset - 104)) | (1L << (Use - 104)) | (1L << (Var - 104)) | (1L << (While - 104)) | (1L << (Yield - 104)) | (1L << (Get - 104)) | (1L << (Set - 104)) | (1L << (Call - 104)) | (1L << (CallStatic - 104)) | (1L << (Constructor - 104)) | (1L << (Destruct - 104)) | (1L << (Wakeup - 104)) | (1L << (Sleep - 104)) | (1L << (Autoload - 104)) | (1L << (IsSet__ - 104)) | (1L << (Unset__ - 104)) | (1L << (ToString__ - 104)) | (1L << (Invoke - 104)) | (1L << (SetState - 104)) | (1L << (Clone__ - 104)) | (1L << (DebugInfo - 104)) | (1L << (Namespace__ - 104)) | (1L << (Class__ - 104)) | (1L << (Traic__ - 104)) | (1L << (Function__ - 104)) | (1L << (Method__ - 104)) | (1L << (Line__ - 104)) | (1L << (File__ - 104)) | (1L << (Dir__ - 104)))) != 0) || ((((_la - 179)) & ~0x3f) == 0 && ((1L << (_la - 179)) & ((1L << (NamespaceSeparator - 179)) | (1L << (Dollar - 179)) | (1L << (OpenRoundBracket - 179)) | (1L << (VarName - 179)) | (1L << (Label - 179)))) != 0)) {
					{
					setState(1564);
					assignmentListElement();
					}
				}

				}
				}
				setState(1571);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class AssignmentListElementContext extends ParserRuleContext {
		public ChainContext chain() {
			return getRuleContext(ChainContext.class,0);
		}
		public TerminalNode List() { return getToken(PHPParser.List, 0); }
		public AssignmentListContext assignmentList() {
			return getRuleContext(AssignmentListContext.class,0);
		}
		public AssignmentListElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentListElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterAssignmentListElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitAssignmentListElement(this);
		}
	}

	public final AssignmentListElementContext assignmentListElement() throws RecognitionException {
		AssignmentListElementContext _localctx = new AssignmentListElementContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_assignmentListElement);
		try {
			setState(1578);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,182,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1572);
				chain();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1573);
				match(List);
				setState(1574);
				match(OpenRoundBracket);
				setState(1575);
				assignmentList();
				setState(1576);
				match(CloseRoundBracket);
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

	public static class ModifierContext extends ParserRuleContext {
		public TerminalNode Abstract() { return getToken(PHPParser.Abstract, 0); }
		public TerminalNode Final() { return getToken(PHPParser.Final, 0); }
		public ModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitModifier(this);
		}
	}

	public final ModifierContext modifier() throws RecognitionException {
		ModifierContext _localctx = new ModifierContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_modifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1580);
			_la = _input.LA(1);
			if ( !(_la==Abstract || _la==Final) ) {
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

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode Label() { return getToken(PHPParser.Label, 0); }
		public TerminalNode Abstract() { return getToken(PHPParser.Abstract, 0); }
		public TerminalNode Array() { return getToken(PHPParser.Array, 0); }
		public TerminalNode As() { return getToken(PHPParser.As, 0); }
		public TerminalNode BinaryCast() { return getToken(PHPParser.BinaryCast, 0); }
		public TerminalNode BoolType() { return getToken(PHPParser.BoolType, 0); }
		public TerminalNode BooleanConstant() { return getToken(PHPParser.BooleanConstant, 0); }
		public TerminalNode Break() { return getToken(PHPParser.Break, 0); }
		public TerminalNode Callable() { return getToken(PHPParser.Callable, 0); }
		public TerminalNode Case() { return getToken(PHPParser.Case, 0); }
		public TerminalNode Catch() { return getToken(PHPParser.Catch, 0); }
		public TerminalNode Class() { return getToken(PHPParser.Class, 0); }
		public TerminalNode Clone() { return getToken(PHPParser.Clone, 0); }
		public TerminalNode Const() { return getToken(PHPParser.Const, 0); }
		public TerminalNode Continue() { return getToken(PHPParser.Continue, 0); }
		public TerminalNode Declare() { return getToken(PHPParser.Declare, 0); }
		public TerminalNode Default() { return getToken(PHPParser.Default, 0); }
		public TerminalNode Do() { return getToken(PHPParser.Do, 0); }
		public TerminalNode DoubleCast() { return getToken(PHPParser.DoubleCast, 0); }
		public TerminalNode DoubleType() { return getToken(PHPParser.DoubleType, 0); }
		public TerminalNode Echo() { return getToken(PHPParser.Echo, 0); }
		public TerminalNode Else() { return getToken(PHPParser.Else, 0); }
		public TerminalNode ElseIf() { return getToken(PHPParser.ElseIf, 0); }
		public TerminalNode Empty() { return getToken(PHPParser.Empty, 0); }
		public TerminalNode EndDeclare() { return getToken(PHPParser.EndDeclare, 0); }
		public TerminalNode EndFor() { return getToken(PHPParser.EndFor, 0); }
		public TerminalNode EndForeach() { return getToken(PHPParser.EndForeach, 0); }
		public TerminalNode EndIf() { return getToken(PHPParser.EndIf, 0); }
		public TerminalNode EndSwitch() { return getToken(PHPParser.EndSwitch, 0); }
		public TerminalNode EndWhile() { return getToken(PHPParser.EndWhile, 0); }
		public TerminalNode Eval() { return getToken(PHPParser.Eval, 0); }
		public TerminalNode Exit() { return getToken(PHPParser.Exit, 0); }
		public TerminalNode Extends() { return getToken(PHPParser.Extends, 0); }
		public TerminalNode Final() { return getToken(PHPParser.Final, 0); }
		public TerminalNode Finally() { return getToken(PHPParser.Finally, 0); }
		public TerminalNode FloatCast() { return getToken(PHPParser.FloatCast, 0); }
		public TerminalNode For() { return getToken(PHPParser.For, 0); }
		public TerminalNode Foreach() { return getToken(PHPParser.Foreach, 0); }
		public TerminalNode Function() { return getToken(PHPParser.Function, 0); }
		public TerminalNode Global() { return getToken(PHPParser.Global, 0); }
		public TerminalNode Goto() { return getToken(PHPParser.Goto, 0); }
		public TerminalNode If() { return getToken(PHPParser.If, 0); }
		public TerminalNode Implements() { return getToken(PHPParser.Implements, 0); }
		public TerminalNode Import() { return getToken(PHPParser.Import, 0); }
		public TerminalNode Include() { return getToken(PHPParser.Include, 0); }
		public TerminalNode IncludeOnce() { return getToken(PHPParser.IncludeOnce, 0); }
		public TerminalNode InstanceOf() { return getToken(PHPParser.InstanceOf, 0); }
		public TerminalNode InsteadOf() { return getToken(PHPParser.InsteadOf, 0); }
		public TerminalNode Int16Cast() { return getToken(PHPParser.Int16Cast, 0); }
		public TerminalNode Int64Type() { return getToken(PHPParser.Int64Type, 0); }
		public TerminalNode Int8Cast() { return getToken(PHPParser.Int8Cast, 0); }
		public TerminalNode Interface() { return getToken(PHPParser.Interface, 0); }
		public TerminalNode IntType() { return getToken(PHPParser.IntType, 0); }
		public TerminalNode IsSet() { return getToken(PHPParser.IsSet, 0); }
		public TerminalNode List() { return getToken(PHPParser.List, 0); }
		public TerminalNode LogicalAnd() { return getToken(PHPParser.LogicalAnd, 0); }
		public TerminalNode LogicalOr() { return getToken(PHPParser.LogicalOr, 0); }
		public TerminalNode LogicalXor() { return getToken(PHPParser.LogicalXor, 0); }
		public TerminalNode Namespace() { return getToken(PHPParser.Namespace, 0); }
		public TerminalNode New() { return getToken(PHPParser.New, 0); }
		public TerminalNode Null() { return getToken(PHPParser.Null, 0); }
		public TerminalNode ObjectType() { return getToken(PHPParser.ObjectType, 0); }
		public TerminalNode Parent_() { return getToken(PHPParser.Parent_, 0); }
		public TerminalNode Partial() { return getToken(PHPParser.Partial, 0); }
		public TerminalNode Print() { return getToken(PHPParser.Print, 0); }
		public TerminalNode Private() { return getToken(PHPParser.Private, 0); }
		public TerminalNode Protected() { return getToken(PHPParser.Protected, 0); }
		public TerminalNode Public() { return getToken(PHPParser.Public, 0); }
		public TerminalNode Require() { return getToken(PHPParser.Require, 0); }
		public TerminalNode RequireOnce() { return getToken(PHPParser.RequireOnce, 0); }
		public TerminalNode Resource() { return getToken(PHPParser.Resource, 0); }
		public TerminalNode Return() { return getToken(PHPParser.Return, 0); }
		public TerminalNode Static() { return getToken(PHPParser.Static, 0); }
		public TerminalNode StringType() { return getToken(PHPParser.StringType, 0); }
		public TerminalNode Switch() { return getToken(PHPParser.Switch, 0); }
		public TerminalNode Throw() { return getToken(PHPParser.Throw, 0); }
		public TerminalNode Trait() { return getToken(PHPParser.Trait, 0); }
		public TerminalNode Try() { return getToken(PHPParser.Try, 0); }
		public TerminalNode Typeof() { return getToken(PHPParser.Typeof, 0); }
		public TerminalNode UintCast() { return getToken(PHPParser.UintCast, 0); }
		public TerminalNode UnicodeCast() { return getToken(PHPParser.UnicodeCast, 0); }
		public TerminalNode Unset() { return getToken(PHPParser.Unset, 0); }
		public TerminalNode Use() { return getToken(PHPParser.Use, 0); }
		public TerminalNode Var() { return getToken(PHPParser.Var, 0); }
		public TerminalNode While() { return getToken(PHPParser.While, 0); }
		public TerminalNode Yield() { return getToken(PHPParser.Yield, 0); }
		public TerminalNode Get() { return getToken(PHPParser.Get, 0); }
		public TerminalNode Set() { return getToken(PHPParser.Set, 0); }
		public TerminalNode Call() { return getToken(PHPParser.Call, 0); }
		public TerminalNode CallStatic() { return getToken(PHPParser.CallStatic, 0); }
		public TerminalNode Constructor() { return getToken(PHPParser.Constructor, 0); }
		public TerminalNode Destruct() { return getToken(PHPParser.Destruct, 0); }
		public TerminalNode Wakeup() { return getToken(PHPParser.Wakeup, 0); }
		public TerminalNode Sleep() { return getToken(PHPParser.Sleep, 0); }
		public TerminalNode Autoload() { return getToken(PHPParser.Autoload, 0); }
		public TerminalNode IsSet__() { return getToken(PHPParser.IsSet__, 0); }
		public TerminalNode Unset__() { return getToken(PHPParser.Unset__, 0); }
		public TerminalNode ToString__() { return getToken(PHPParser.ToString__, 0); }
		public TerminalNode Invoke() { return getToken(PHPParser.Invoke, 0); }
		public TerminalNode SetState() { return getToken(PHPParser.SetState, 0); }
		public TerminalNode Clone__() { return getToken(PHPParser.Clone__, 0); }
		public TerminalNode DebugInfo() { return getToken(PHPParser.DebugInfo, 0); }
		public TerminalNode Namespace__() { return getToken(PHPParser.Namespace__, 0); }
		public TerminalNode Class__() { return getToken(PHPParser.Class__, 0); }
		public TerminalNode Traic__() { return getToken(PHPParser.Traic__, 0); }
		public TerminalNode Function__() { return getToken(PHPParser.Function__, 0); }
		public TerminalNode Method__() { return getToken(PHPParser.Method__, 0); }
		public TerminalNode Line__() { return getToken(PHPParser.Line__, 0); }
		public TerminalNode File__() { return getToken(PHPParser.File__, 0); }
		public TerminalNode Dir__() { return getToken(PHPParser.Dir__, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitIdentifier(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1582);
			_la = _input.LA(1);
			if ( !(((((_la - 40)) & ~0x3f) == 0 && ((1L << (_la - 40)) & ((1L << (Abstract - 40)) | (1L << (Array - 40)) | (1L << (As - 40)) | (1L << (BinaryCast - 40)) | (1L << (BoolType - 40)) | (1L << (BooleanConstant - 40)) | (1L << (Break - 40)) | (1L << (Callable - 40)) | (1L << (Case - 40)) | (1L << (Catch - 40)) | (1L << (Class - 40)) | (1L << (Clone - 40)) | (1L << (Const - 40)) | (1L << (Continue - 40)) | (1L << (Declare - 40)) | (1L << (Default - 40)) | (1L << (Do - 40)) | (1L << (DoubleCast - 40)) | (1L << (DoubleType - 40)) | (1L << (Echo - 40)) | (1L << (Else - 40)) | (1L << (ElseIf - 40)) | (1L << (Empty - 40)) | (1L << (EndDeclare - 40)) | (1L << (EndFor - 40)) | (1L << (EndForeach - 40)) | (1L << (EndIf - 40)) | (1L << (EndSwitch - 40)) | (1L << (EndWhile - 40)) | (1L << (Eval - 40)) | (1L << (Exit - 40)) | (1L << (Extends - 40)) | (1L << (Final - 40)) | (1L << (Finally - 40)) | (1L << (FloatCast - 40)) | (1L << (For - 40)) | (1L << (Foreach - 40)) | (1L << (Function - 40)) | (1L << (Global - 40)) | (1L << (Goto - 40)) | (1L << (If - 40)) | (1L << (Implements - 40)) | (1L << (Import - 40)) | (1L << (Include - 40)) | (1L << (IncludeOnce - 40)) | (1L << (InstanceOf - 40)) | (1L << (InsteadOf - 40)) | (1L << (Int8Cast - 40)) | (1L << (Int16Cast - 40)) | (1L << (Int64Type - 40)) | (1L << (IntType - 40)) | (1L << (Interface - 40)) | (1L << (IsSet - 40)) | (1L << (List - 40)) | (1L << (LogicalAnd - 40)) | (1L << (LogicalOr - 40)) | (1L << (LogicalXor - 40)) | (1L << (Namespace - 40)) | (1L << (New - 40)) | (1L << (Null - 40)) | (1L << (ObjectType - 40)) | (1L << (Parent_ - 40)) | (1L << (Partial - 40)) | (1L << (Print - 40)))) != 0) || ((((_la - 104)) & ~0x3f) == 0 && ((1L << (_la - 104)) & ((1L << (Private - 104)) | (1L << (Protected - 104)) | (1L << (Public - 104)) | (1L << (Require - 104)) | (1L << (RequireOnce - 104)) | (1L << (Resource - 104)) | (1L << (Return - 104)) | (1L << (Static - 104)) | (1L << (StringType - 104)) | (1L << (Switch - 104)) | (1L << (Throw - 104)) | (1L << (Trait - 104)) | (1L << (Try - 104)) | (1L << (Typeof - 104)) | (1L << (UintCast - 104)) | (1L << (UnicodeCast - 104)) | (1L << (Unset - 104)) | (1L << (Use - 104)) | (1L << (Var - 104)) | (1L << (While - 104)) | (1L << (Yield - 104)) | (1L << (Get - 104)) | (1L << (Set - 104)) | (1L << (Call - 104)) | (1L << (CallStatic - 104)) | (1L << (Constructor - 104)) | (1L << (Destruct - 104)) | (1L << (Wakeup - 104)) | (1L << (Sleep - 104)) | (1L << (Autoload - 104)) | (1L << (IsSet__ - 104)) | (1L << (Unset__ - 104)) | (1L << (ToString__ - 104)) | (1L << (Invoke - 104)) | (1L << (SetState - 104)) | (1L << (Clone__ - 104)) | (1L << (DebugInfo - 104)) | (1L << (Namespace__ - 104)) | (1L << (Class__ - 104)) | (1L << (Traic__ - 104)) | (1L << (Function__ - 104)) | (1L << (Method__ - 104)) | (1L << (Line__ - 104)) | (1L << (File__ - 104)) | (1L << (Dir__ - 104)))) != 0) || _la==Label) ) {
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

	public static class MemberModifierContext extends ParserRuleContext {
		public TerminalNode Public() { return getToken(PHPParser.Public, 0); }
		public TerminalNode Protected() { return getToken(PHPParser.Protected, 0); }
		public TerminalNode Private() { return getToken(PHPParser.Private, 0); }
		public TerminalNode Static() { return getToken(PHPParser.Static, 0); }
		public TerminalNode Abstract() { return getToken(PHPParser.Abstract, 0); }
		public TerminalNode Final() { return getToken(PHPParser.Final, 0); }
		public MemberModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterMemberModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitMemberModifier(this);
		}
	}

	public final MemberModifierContext memberModifier() throws RecognitionException {
		MemberModifierContext _localctx = new MemberModifierContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_memberModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1584);
			_la = _input.LA(1);
			if ( !(_la==Abstract || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (Final - 72)) | (1L << (Private - 72)) | (1L << (Protected - 72)) | (1L << (Public - 72)) | (1L << (Static - 72)))) != 0)) ) {
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

	public static class MagicConstantContext extends ParserRuleContext {
		public TerminalNode Namespace__() { return getToken(PHPParser.Namespace__, 0); }
		public TerminalNode Class__() { return getToken(PHPParser.Class__, 0); }
		public TerminalNode Traic__() { return getToken(PHPParser.Traic__, 0); }
		public TerminalNode Function__() { return getToken(PHPParser.Function__, 0); }
		public TerminalNode Method__() { return getToken(PHPParser.Method__, 0); }
		public TerminalNode Line__() { return getToken(PHPParser.Line__, 0); }
		public TerminalNode File__() { return getToken(PHPParser.File__, 0); }
		public TerminalNode Dir__() { return getToken(PHPParser.Dir__, 0); }
		public MagicConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_magicConstant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterMagicConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitMagicConstant(this);
		}
	}

	public final MagicConstantContext magicConstant() throws RecognitionException {
		MagicConstantContext _localctx = new MagicConstantContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_magicConstant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1586);
			_la = _input.LA(1);
			if ( !(((((_la - 141)) & ~0x3f) == 0 && ((1L << (_la - 141)) & ((1L << (Namespace__ - 141)) | (1L << (Class__ - 141)) | (1L << (Traic__ - 141)) | (1L << (Function__ - 141)) | (1L << (Method__ - 141)) | (1L << (Line__ - 141)) | (1L << (File__ - 141)) | (1L << (Dir__ - 141)))) != 0)) ) {
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

	public static class MagicMethodContext extends ParserRuleContext {
		public TerminalNode Get() { return getToken(PHPParser.Get, 0); }
		public TerminalNode Set() { return getToken(PHPParser.Set, 0); }
		public TerminalNode Call() { return getToken(PHPParser.Call, 0); }
		public TerminalNode CallStatic() { return getToken(PHPParser.CallStatic, 0); }
		public TerminalNode Constructor() { return getToken(PHPParser.Constructor, 0); }
		public TerminalNode Destruct() { return getToken(PHPParser.Destruct, 0); }
		public TerminalNode Wakeup() { return getToken(PHPParser.Wakeup, 0); }
		public TerminalNode Sleep() { return getToken(PHPParser.Sleep, 0); }
		public TerminalNode Autoload() { return getToken(PHPParser.Autoload, 0); }
		public TerminalNode IsSet__() { return getToken(PHPParser.IsSet__, 0); }
		public TerminalNode Unset__() { return getToken(PHPParser.Unset__, 0); }
		public TerminalNode ToString__() { return getToken(PHPParser.ToString__, 0); }
		public TerminalNode Invoke() { return getToken(PHPParser.Invoke, 0); }
		public TerminalNode SetState() { return getToken(PHPParser.SetState, 0); }
		public TerminalNode Clone__() { return getToken(PHPParser.Clone__, 0); }
		public TerminalNode DebugInfo() { return getToken(PHPParser.DebugInfo, 0); }
		public MagicMethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_magicMethod; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterMagicMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitMagicMethod(this);
		}
	}

	public final MagicMethodContext magicMethod() throws RecognitionException {
		MagicMethodContext _localctx = new MagicMethodContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_magicMethod);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1588);
			_la = _input.LA(1);
			if ( !(((((_la - 125)) & ~0x3f) == 0 && ((1L << (_la - 125)) & ((1L << (Get - 125)) | (1L << (Set - 125)) | (1L << (Call - 125)) | (1L << (CallStatic - 125)) | (1L << (Constructor - 125)) | (1L << (Destruct - 125)) | (1L << (Wakeup - 125)) | (1L << (Sleep - 125)) | (1L << (Autoload - 125)) | (1L << (IsSet__ - 125)) | (1L << (Unset__ - 125)) | (1L << (ToString__ - 125)) | (1L << (Invoke - 125)) | (1L << (SetState - 125)) | (1L << (Clone__ - 125)) | (1L << (DebugInfo - 125)))) != 0)) ) {
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

	public static class PrimitiveTypeContext extends ParserRuleContext {
		public TerminalNode BoolType() { return getToken(PHPParser.BoolType, 0); }
		public TerminalNode IntType() { return getToken(PHPParser.IntType, 0); }
		public TerminalNode Int64Type() { return getToken(PHPParser.Int64Type, 0); }
		public TerminalNode DoubleType() { return getToken(PHPParser.DoubleType, 0); }
		public TerminalNode StringType() { return getToken(PHPParser.StringType, 0); }
		public TerminalNode Resource() { return getToken(PHPParser.Resource, 0); }
		public TerminalNode ObjectType() { return getToken(PHPParser.ObjectType, 0); }
		public TerminalNode Array() { return getToken(PHPParser.Array, 0); }
		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterPrimitiveType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitPrimitiveType(this);
		}
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1590);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Array) | (1L << BoolType) | (1L << DoubleType))) != 0) || ((((_la - 89)) & ~0x3f) == 0 && ((1L << (_la - 89)) & ((1L << (Int64Type - 89)) | (1L << (IntType - 89)) | (1L << (ObjectType - 89)) | (1L << (Resource - 89)) | (1L << (StringType - 89)))) != 0)) ) {
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

	public static class CastOperationContext extends ParserRuleContext {
		public TerminalNode BoolType() { return getToken(PHPParser.BoolType, 0); }
		public TerminalNode Int8Cast() { return getToken(PHPParser.Int8Cast, 0); }
		public TerminalNode Int16Cast() { return getToken(PHPParser.Int16Cast, 0); }
		public TerminalNode IntType() { return getToken(PHPParser.IntType, 0); }
		public TerminalNode Int64Type() { return getToken(PHPParser.Int64Type, 0); }
		public TerminalNode UintCast() { return getToken(PHPParser.UintCast, 0); }
		public TerminalNode DoubleCast() { return getToken(PHPParser.DoubleCast, 0); }
		public TerminalNode DoubleType() { return getToken(PHPParser.DoubleType, 0); }
		public TerminalNode FloatCast() { return getToken(PHPParser.FloatCast, 0); }
		public TerminalNode StringType() { return getToken(PHPParser.StringType, 0); }
		public TerminalNode BinaryCast() { return getToken(PHPParser.BinaryCast, 0); }
		public TerminalNode UnicodeCast() { return getToken(PHPParser.UnicodeCast, 0); }
		public TerminalNode Array() { return getToken(PHPParser.Array, 0); }
		public TerminalNode ObjectType() { return getToken(PHPParser.ObjectType, 0); }
		public TerminalNode Resource() { return getToken(PHPParser.Resource, 0); }
		public TerminalNode Unset() { return getToken(PHPParser.Unset, 0); }
		public CastOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_castOperation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterCastOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitCastOperation(this);
		}
	}

	public final CastOperationContext castOperation() throws RecognitionException {
		CastOperationContext _localctx = new CastOperationContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_castOperation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1592);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Array) | (1L << BinaryCast) | (1L << BoolType) | (1L << DoubleCast) | (1L << DoubleType))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (FloatCast - 74)) | (1L << (Int8Cast - 74)) | (1L << (Int16Cast - 74)) | (1L << (Int64Type - 74)) | (1L << (IntType - 74)) | (1L << (ObjectType - 74)) | (1L << (Resource - 74)) | (1L << (StringType - 74)) | (1L << (UintCast - 74)) | (1L << (UnicodeCast - 74)) | (1L << (Unset - 74)))) != 0)) ) {
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
		case 83:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 16);
		case 1:
			return precpred(_ctx, 14);
		case 2:
			return precpred(_ctx, 13);
		case 3:
			return precpred(_ctx, 12);
		case 4:
			return precpred(_ctx, 11);
		case 5:
			return precpred(_ctx, 10);
		case 6:
			return precpred(_ctx, 9);
		case 7:
			return precpred(_ctx, 8);
		case 8:
			return precpred(_ctx, 7);
		case 9:
			return precpred(_ctx, 6);
		case 10:
			return precpred(_ctx, 5);
		case 11:
			return precpred(_ctx, 4);
		case 12:
			return precpred(_ctx, 3);
		case 13:
			return precpred(_ctx, 2);
		case 14:
			return precpred(_ctx, 1);
		case 15:
			return precpred(_ctx, 15);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u00e5\u063d\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t\u0080"+
		"\4\u0081\t\u0081\4\u0082\t\u0082\3\2\5\2\u0106\n\2\3\2\7\2\u0109\n\2\f"+
		"\2\16\2\u010c\13\2\3\2\3\2\3\3\3\3\3\3\5\3\u0113\n\3\3\4\6\4\u0116\n\4"+
		"\r\4\16\4\u0117\3\5\3\5\3\6\6\6\u011d\n\6\r\6\16\6\u011e\3\7\7\7\u0122"+
		"\n\7\f\7\16\7\u0125\13\7\3\7\6\7\u0128\n\7\r\7\16\7\u0129\3\b\3\b\3\b"+
		"\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0138\n\t\3\n\3\n\5\n\u013c\n"+
		"\n\3\n\3\n\3\n\3\13\5\13\u0142\n\13\3\13\3\13\3\13\5\13\u0147\n\13\3\13"+
		"\7\13\u014a\n\13\f\13\16\13\u014d\13\13\3\f\3\f\3\f\5\f\u0152\n\f\3\r"+
		"\3\r\5\r\u0156\n\r\3\r\3\r\7\r\u015a\n\r\f\r\16\r\u015d\13\r\3\r\3\r\3"+
		"\r\3\r\5\r\u0163\n\r\3\16\3\16\3\16\3\16\3\16\5\16\u016a\n\16\3\17\3\17"+
		"\3\17\5\17\u016f\n\17\3\17\3\17\5\17\u0173\n\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\20\3\20\5\20\u017c\n\20\3\20\5\20\u017f\n\20\3\20\5\20\u0182\n\20"+
		"\3\20\3\20\3\20\5\20\u0187\n\20\3\20\3\20\5\20\u018b\n\20\3\20\3\20\5"+
		"\20\u018f\n\20\3\20\3\20\3\20\5\20\u0194\n\20\3\20\3\20\5\20\u0198\n\20"+
		"\5\20\u019a\n\20\3\20\3\20\7\20\u019e\n\20\f\20\16\20\u01a1\13\20\3\20"+
		"\3\20\3\21\3\21\3\22\3\22\3\22\7\22\u01aa\n\22\f\22\16\22\u01ad\13\22"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\5\23\u01bd\n\23\3\24\3\24\3\24\7\24\u01c2\n\24\f\24\16\24\u01c5\13\24"+
		"\3\25\3\25\3\25\7\25\u01ca\n\25\f\25\16\25\u01cd\13\25\3\26\3\26\3\26"+
		"\3\27\3\27\3\27\3\27\3\27\5\27\u01d7\n\27\3\30\3\30\3\30\3\30\7\30\u01dd"+
		"\n\30\f\30\16\30\u01e0\13\30\3\30\3\30\3\31\7\31\u01e5\n\31\f\31\16\31"+
		"\u01e8\13\31\3\32\3\32\3\32\3\32\5\32\u01ee\n\32\3\32\3\32\3\32\7\32\u01f3"+
		"\n\32\f\32\16\32\u01f6\13\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3"+
		"\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u020c"+
		"\n\33\3\34\3\34\3\34\7\34\u0211\n\34\f\34\16\34\u0214\13\34\3\35\3\35"+
		"\3\35\7\35\u0219\n\35\f\35\16\35\u021c\13\35\3\36\3\36\3\36\3\36\3\37"+
		"\7\37\u0223\n\37\f\37\16\37\u0226\13\37\3 \3 \3 \5 \u022b\n \3!\3!\5!"+
		"\u022f\n!\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3"+
		"#\3#\3#\3#\3#\3#\3#\3#\3#\5#\u024d\n#\3$\3$\3$\3$\3%\3%\3%\3%\7%\u0257"+
		"\n%\f%\16%\u025a\13%\3%\5%\u025d\n%\3%\3%\3%\3%\3%\7%\u0264\n%\f%\16%"+
		"\u0267\13%\3%\5%\u026a\n%\3%\3%\3%\5%\u026f\n%\3&\3&\3&\3&\3\'\3\'\3\'"+
		"\3\'\3\'\3(\3(\3(\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3*\3*\5*\u0289\n*\3+\3"+
		"+\3+\3+\3+\3+\3,\3,\3,\5,\u0294\n,\3,\3,\5,\u0298\n,\3,\3,\5,\u029c\n"+
		",\3,\3,\3,\3,\3,\3,\3,\5,\u02a5\n,\3-\3-\3.\3.\3/\3/\3/\3/\5/\u02af\n"+
		"/\3/\7/\u02b2\n/\f/\16/\u02b5\13/\3/\3/\3/\5/\u02ba\n/\3/\7/\u02bd\n/"+
		"\f/\16/\u02c0\13/\3/\3/\5/\u02c4\n/\3\60\3\60\3\60\5\60\u02c9\n\60\3\60"+
		"\6\60\u02cc\n\60\r\60\16\60\u02cd\3\60\3\60\3\61\3\61\5\61\u02d4\n\61"+
		"\3\61\3\61\3\62\3\62\5\62\u02da\n\62\3\62\3\62\3\63\3\63\5\63\u02e0\n"+
		"\63\3\63\3\63\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3\65\3\66\3\66\3"+
		"\66\3\66\3\66\5\66\u02f2\n\66\3\66\3\66\3\66\5\66\u02f7\n\66\3\66\5\66"+
		"\u02fa\n\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\5\66\u0304\n\66\3"+
		"\66\5\66\u0307\n\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66"+
		"\3\66\5\66\u0314\n\66\3\66\3\66\3\66\3\66\3\66\3\66\5\66\u031c\n\66\3"+
		"\67\3\67\3\67\6\67\u0321\n\67\r\67\16\67\u0322\3\67\5\67\u0326\n\67\3"+
		"\67\7\67\u0329\n\67\f\67\16\67\u032c\13\67\3\67\5\67\u032f\n\67\38\38"+
		"\38\38\38\38\38\39\39\39\3:\3:\3:\3:\3;\3;\3;\3;\3<\3<\3<\3<\3<\3<\3<"+
		"\3<\3<\3<\5<\u034d\n<\3=\3=\6=\u0351\n=\r=\16=\u0352\3>\3>\3>\7>\u0358"+
		"\n>\f>\16>\u035b\13>\3?\5?\u035e\n?\3?\3?\7?\u0362\n?\f?\16?\u0365\13"+
		"?\3@\3@\5@\u0369\n@\3@\5@\u036c\n@\3@\5@\u036f\n@\3@\3@\3A\3A\3A\5A\u0376"+
		"\nA\3B\3B\3B\3B\7B\u037c\nB\fB\16B\u037f\13B\3B\3B\3C\3C\3C\3C\3C\3C\3"+
		"C\3C\5C\u038b\nC\3D\3D\3D\3D\3E\3E\3E\3E\7E\u0395\nE\fE\16E\u0398\13E"+
		"\3E\3E\3F\3F\3F\3F\3F\7F\u03a1\nF\fF\16F\u03a4\13F\3F\3F\3F\3F\3F\3F\3"+
		"F\7F\u03ad\nF\fF\16F\u03b0\13F\3F\3F\3F\3F\5F\u03b6\nF\3F\3F\5F\u03ba"+
		"\nF\3F\3F\5F\u03be\nF\3F\3F\3F\3F\5F\u03c4\nF\3F\3F\3F\3F\3F\3F\5F\u03cc"+
		"\nF\3G\3G\3G\7G\u03d1\nG\fG\16G\u03d4\13G\3G\5G\u03d7\nG\3H\3H\5H\u03db"+
		"\nH\3I\3I\3I\3I\3I\3I\3I\3J\3J\3J\3J\5J\u03e8\nJ\3J\5J\u03eb\nJ\3J\3J"+
		"\3K\3K\3K\5K\u03f2\nK\3K\3K\3L\3L\3L\3L\3M\3M\5M\u03fc\nM\3N\3N\5N\u0400"+
		"\nN\3O\6O\u0403\nO\rO\16O\u0404\3P\3P\3P\5P\u040a\nP\3Q\3Q\3Q\3Q\3R\3"+
		"R\3R\3R\3R\7R\u0415\nR\fR\16R\u0418\13R\3R\3R\3S\3S\3S\7S\u041f\nS\fS"+
		"\16S\u0422\13S\3T\3T\3T\5T\u0427\nT\3T\3T\3U\3U\3U\3U\3U\3U\3U\3U\3U\3"+
		"U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\5"+
		"U\u044b\nU\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\5U\u0458\nU\3U\3U\3U\5U\u045d"+
		"\nU\3U\5U\u0460\nU\3U\3U\3U\3U\5U\u0466\nU\3U\3U\3U\3U\3U\3U\3U\3U\3U"+
		"\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\5U\u0483\nU\3U"+
		"\3U\3U\3U\3U\5U\u048a\nU\3U\3U\5U\u048e\nU\3U\3U\3U\3U\5U\u0494\nU\3U"+
		"\3U\5U\u0498\nU\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U"+
		"\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\5U\u04be\nU\3U"+
		"\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\7U\u04ce\nU\fU\16U\u04d1\13U\3"+
		"V\3V\3V\5V\u04d6\nV\3W\3W\3X\3X\3X\3X\5X\u04de\nX\3Y\3Y\3Y\7Y\u04e3\n"+
		"Y\fY\16Y\u04e6\13Y\3Y\5Y\u04e9\nY\3Z\3Z\3Z\5Z\u04ee\nZ\3Z\3Z\3Z\5Z\u04f3"+
		"\nZ\3Z\3Z\5Z\u04f7\nZ\3[\3[\3[\3[\3[\7[\u04fe\n[\f[\16[\u0501\13[\3[\3"+
		"[\3\\\5\\\u0506\n\\\3\\\3\\\3]\3]\5]\u050c\n]\3]\5]\u050f\n]\3^\3^\5^"+
		"\u0513\n^\3^\5^\u0516\n^\3^\3^\5^\u051a\n^\3_\3_\3_\7_\u051f\n_\f_\16"+
		"_\u0522\13_\3`\5`\u0525\n`\3`\5`\u0528\n`\3`\3`\3a\3a\3a\7a\u052f\na\f"+
		"a\16a\u0532\13a\3b\3b\3b\7b\u0537\nb\fb\16b\u053a\13b\3c\3c\3c\3c\7c\u0540"+
		"\nc\fc\16c\u0543\13c\3c\5c\u0546\nc\3c\3c\3d\5d\u054b\nd\3d\3d\3d\5d\u0550"+
		"\nd\3e\3e\3e\3e\3e\3e\5e\u0558\ne\5e\u055a\ne\3e\3e\3e\3e\5e\u0560\ne"+
		"\5e\u0562\ne\3e\3e\3e\5e\u0567\ne\3f\3f\3f\7f\u056c\nf\ff\16f\u056f\13"+
		"f\3g\3g\3g\5g\u0574\ng\3h\3h\3h\3h\3h\5h\u057b\nh\3i\3i\3i\3i\5i\u0581"+
		"\ni\3j\3j\3k\3k\3k\3k\3k\3k\5k\u058b\nk\3k\3k\5k\u058f\nk\3k\3k\3k\5k"+
		"\u0594\nk\3l\3l\3m\3m\6m\u059a\nm\rm\16m\u059b\3m\3m\6m\u05a0\nm\rm\16"+
		"m\u05a1\3m\3m\3m\7m\u05a7\nm\fm\16m\u05aa\13m\3m\5m\u05ad\nm\3n\3n\5n"+
		"\u05b1\nn\3o\3o\3o\7o\u05b6\no\fo\16o\u05b9\13o\3p\3p\3p\3p\3p\3p\5p\u05c1"+
		"\np\3p\7p\u05c4\np\fp\16p\u05c7\13p\3q\3q\3q\5q\u05cc\nq\3r\3r\3r\3s\3"+
		"s\3s\5s\u05d4\ns\3t\5t\u05d7\nt\3t\3t\7t\u05db\nt\ft\16t\u05de\13t\3u"+
		"\3u\3u\5u\u05e3\nu\3u\3u\3u\3u\5u\u05e9\nu\3v\3v\5v\u05ed\nv\3w\3w\3w"+
		"\3w\3w\5w\u05f4\nw\3w\7w\u05f7\nw\fw\16w\u05fa\13w\3x\7x\u05fd\nx\fx\16"+
		"x\u0600\13x\3x\3x\3x\3x\3x\3x\5x\u0608\nx\3x\7x\u060b\nx\fx\16x\u060e"+
		"\13x\3y\3y\5y\u0612\ny\3y\3y\3y\3y\3y\5y\u0619\ny\3z\5z\u061c\nz\3z\3"+
		"z\5z\u0620\nz\7z\u0622\nz\fz\16z\u0625\13z\3{\3{\3{\3{\3{\3{\5{\u062d"+
		"\n{\3|\3|\3}\3}\3~\3~\3\177\3\177\3\u0080\3\u0080\3\u0081\3\u0081\3\u0082"+
		"\3\u0082\3\u0082\2\3\u00a8\u0083\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082"+
		"\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a"+
		"\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2"+
		"\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca"+
		"\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2"+
		"\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa"+
		"\u00fc\u00fe\u0100\u0102\2\33\13\2\4\4\6\7\t\n\16\25\27\27\32\33\36\37"+
		"\"\"$$\4\2\66\66OO\4\2\64\64uu\3\2\u00ce\u00cf\3\2\u00c2\u00c3\4\2\u00bb"+
		"\u00bb\u00bd\u00be\3\2\u009a\u009b\3\2UV\3\2mn\3\2\u00bf\u00c1\4\2\u00bd"+
		"\u00be\u00c5\u00c5\3\2\u00b1\u00b2\4\2\u00a0\u00a1\u00b7\u00b8\3\2\u009c"+
		"\u009f\5\2\u00a2\u00a4\u00a6\u00ae\u00d0\u00d0\3\2\u00bd\u00be\4\2\u00d5"+
		"\u00d6\u00d8\u00d9\4\2\64\64gg\4\2**JJ\4\2*\u0096\u00d4\u00d4\6\2**JJ"+
		"jlqq\3\2\u008f\u0096\3\2\177\u008e\t\2++..<<[\\ffoorr\13\2++-.;<LLY\\"+
		"ffoorrxz\2\u06d0\2\u0105\3\2\2\2\4\u0112\3\2\2\2\6\u0115\3\2\2\2\b\u0119"+
		"\3\2\2\2\n\u011c\3\2\2\2\f\u0123\3\2\2\2\16\u012b\3\2\2\2\20\u0137\3\2"+
		"\2\2\22\u0139\3\2\2\2\24\u0141\3\2\2\2\26\u014e\3\2\2\2\30\u0153\3\2\2"+
		"\2\32\u0169\3\2\2\2\34\u016b\3\2\2\2\36\u0179\3\2\2\2 \u01a4\3\2\2\2\""+
		"\u01a6\3\2\2\2$\u01bc\3\2\2\2&\u01be\3\2\2\2(\u01c6\3\2\2\2*\u01ce\3\2"+
		"\2\2,\u01d1\3\2\2\2.\u01d8\3\2\2\2\60\u01e6\3\2\2\2\62\u01e9\3\2\2\2\64"+
		"\u020b\3\2\2\2\66\u020d\3\2\2\28\u0215\3\2\2\2:\u021d\3\2\2\2<\u0224\3"+
		"\2\2\2>\u022a\3\2\2\2@\u022e\3\2\2\2B\u0230\3\2\2\2D\u024c\3\2\2\2F\u024e"+
		"\3\2\2\2H\u026e\3\2\2\2J\u0270\3\2\2\2L\u0274\3\2\2\2N\u0279\3\2\2\2P"+
		"\u027c\3\2\2\2R\u0280\3\2\2\2T\u028a\3\2\2\2V\u0290\3\2\2\2X\u02a6\3\2"+
		"\2\2Z\u02a8\3\2\2\2\\\u02aa\3\2\2\2^\u02cb\3\2\2\2`\u02d1\3\2\2\2b\u02d7"+
		"\3\2\2\2d\u02dd\3\2\2\2f\u02e3\3\2\2\2h\u02e6\3\2\2\2j\u02ec\3\2\2\2l"+
		"\u031d\3\2\2\2n\u0330\3\2\2\2p\u0337\3\2\2\2r\u033a\3\2\2\2t\u033e\3\2"+
		"\2\2v\u0342\3\2\2\2x\u0350\3\2\2\2z\u0354\3\2\2\2|\u035d\3\2\2\2~\u0366"+
		"\3\2\2\2\u0080\u0375\3\2\2\2\u0082\u0377\3\2\2\2\u0084\u038a\3\2\2\2\u0086"+
		"\u038c\3\2\2\2\u0088\u0390\3\2\2\2\u008a\u03cb\3\2\2\2\u008c\u03d6\3\2"+
		"\2\2\u008e\u03da\3\2\2\2\u0090\u03dc\3\2\2\2\u0092\u03e3\3\2\2\2\u0094"+
		"\u03f1\3\2\2\2\u0096\u03f5\3\2\2\2\u0098\u03fb\3\2\2\2\u009a\u03ff\3\2"+
		"\2\2\u009c\u0402\3\2\2\2\u009e\u0406\3\2\2\2\u00a0\u040b\3\2\2\2\u00a2"+
		"\u040f\3\2\2\2\u00a4\u041b\3\2\2\2\u00a6\u0423\3\2\2\2\u00a8\u0497\3\2"+
		"\2\2\u00aa\u04d2\3\2\2\2\u00ac\u04d7\3\2\2\2\u00ae\u04d9\3\2\2\2\u00b0"+
		"\u04df\3\2\2\2\u00b2\u04f6\3\2\2\2\u00b4\u04f8\3\2\2\2\u00b6\u0505\3\2"+
		"\2\2\u00b8\u050e\3\2\2\2\u00ba\u0519\3\2\2\2\u00bc\u051b\3\2\2\2\u00be"+
		"\u0524\3\2\2\2\u00c0\u052b\3\2\2\2\u00c2\u0533\3\2\2\2\u00c4\u053b\3\2"+
		"\2\2\u00c6\u054f\3\2\2\2\u00c8\u0566\3\2\2\2\u00ca\u0568\3\2\2\2\u00cc"+
		"\u0570\3\2\2\2\u00ce\u057a\3\2\2\2\u00d0\u0580\3\2\2\2\u00d2\u0582\3\2"+
		"\2\2\u00d4\u0593\3\2\2\2\u00d6\u0595\3\2\2\2\u00d8\u05ac\3\2\2\2\u00da"+
		"\u05b0\3\2\2\2\u00dc\u05b2\3\2\2\2\u00de\u05c0\3\2\2\2\u00e0\u05c8\3\2"+
		"\2\2\u00e2\u05cd\3\2\2\2\u00e4\u05d3\3\2\2\2\u00e6\u05d6\3\2\2\2\u00e8"+
		"\u05e8\3\2\2\2\u00ea\u05ec\3\2\2\2\u00ec\u05f3\3\2\2\2\u00ee\u05fe\3\2"+
		"\2\2\u00f0\u0618\3\2\2\2\u00f2\u061b\3\2\2\2\u00f4\u062c\3\2\2\2\u00f6"+
		"\u062e\3\2\2\2\u00f8\u0630\3\2\2\2\u00fa\u0632\3\2\2\2\u00fc\u0634\3\2"+
		"\2\2\u00fe\u0636\3\2\2\2\u0100\u0638\3\2\2\2\u0102\u063a\3\2\2\2\u0104"+
		"\u0106\7\13\2\2\u0105\u0104\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u010a\3"+
		"\2\2\2\u0107\u0109\5\4\3\2\u0108\u0107\3\2\2\2\u0109\u010c\3\2\2\2\u010a"+
		"\u0108\3\2\2\2\u010a\u010b\3\2\2\2\u010b\u010d\3\2\2\2\u010c\u010a\3\2"+
		"\2\2\u010d\u010e\7\2\2\3\u010e\3\3\2\2\2\u010f\u0113\5\6\4\2\u0110\u0113"+
		"\5\f\7\2\u0111\u0113\5\n\6\2\u0112\u010f\3\2\2\2\u0112\u0110\3\2\2\2\u0112"+
		"\u0111\3\2\2\2\u0113\5\3\2\2\2\u0114\u0116\5\b\5\2\u0115\u0114\3\2\2\2"+
		"\u0116\u0117\3\2\2\2\u0117\u0115\3\2\2\2\u0117\u0118\3\2\2\2\u0118\7\3"+
		"\2\2\2\u0119\u011a\t\2\2\2\u011a\t\3\2\2\2\u011b\u011d\7!\2\2\u011c\u011b"+
		"\3\2\2\2\u011d\u011e\3\2\2\2\u011e\u011c\3\2\2\2\u011e\u011f\3\2\2\2\u011f"+
		"\13\3\2\2\2\u0120\u0122\5\16\b\2\u0121\u0120\3\2\2\2\u0122\u0125\3\2\2"+
		"\2\u0123\u0121\3\2\2\2\u0123\u0124\3\2\2\2\u0124\u0127\3\2\2\2\u0125\u0123"+
		"\3\2\2\2\u0126\u0128\5\20\t\2\u0127\u0126\3\2\2\2\u0128\u0129\3\2\2\2"+
		"\u0129\u0127\3\2\2\2\u0129\u012a\3\2\2\2\u012a\r\3\2\2\2\u012b\u012c\7"+
		"T\2\2\u012c\u012d\7c\2\2\u012d\u012e\5\u00c0a\2\u012e\u012f\7\u00cf\2"+
		"\2\u012f\17\3\2\2\2\u0130\u0138\5B\"\2\u0131\u0138\5D#\2\u0132\u0138\5"+
		"\22\n\2\u0133\u0138\5\30\r\2\u0134\u0138\5\34\17\2\u0135\u0138\5\36\20"+
		"\2\u0136\u0138\5\u00a2R\2\u0137\u0130\3\2\2\2\u0137\u0131\3\2\2\2\u0137"+
		"\u0132\3\2\2\2\u0137\u0133\3\2\2\2\u0137\u0134\3\2\2\2\u0137\u0135\3\2"+
		"\2\2\u0137\u0136\3\2\2\2\u0138\21\3\2\2\2\u0139\u013b\7{\2\2\u013a\u013c"+
		"\t\3\2\2\u013b\u013a\3\2\2\2\u013b\u013c\3\2\2\2\u013c\u013d\3\2\2\2\u013d"+
		"\u013e\5\24\13\2\u013e\u013f\7\u00cf\2\2\u013f\23\3\2\2\2\u0140\u0142"+
		"\7\u00b5\2\2\u0141\u0140\3\2\2\2\u0141\u0142\3\2\2\2\u0142\u0143\3\2\2"+
		"\2\u0143\u014b\5\26\f\2\u0144\u0146\7\u00cd\2\2\u0145\u0147\7\u00b5\2"+
		"\2\u0146\u0145\3\2\2\2\u0146\u0147\3\2\2\2\u0147\u0148\3\2\2\2\u0148\u014a"+
		"\5\26\f\2\u0149\u0144\3\2\2\2\u014a\u014d\3\2\2\2\u014b\u0149\3\2\2\2"+
		"\u014b\u014c\3\2\2\2\u014c\25\3\2\2\2\u014d\u014b\3\2\2\2\u014e\u0151"+
		"\5\u00c0a\2\u014f\u0150\7,\2\2\u0150\u0152\5\u00f8}\2\u0151\u014f\3\2"+
		"\2\2\u0151\u0152\3\2\2\2\u0152\27\3\2\2\2\u0153\u0162\7c\2\2\u0154\u0156"+
		"\5\u00c0a\2\u0155\u0154\3\2\2\2\u0155\u0156\3\2\2\2\u0156\u0157\3\2\2"+
		"\2\u0157\u015b\7\u00cb\2\2\u0158\u015a\5\32\16\2\u0159\u0158\3\2\2\2\u015a"+
		"\u015d\3\2\2\2\u015b\u0159\3\2\2\2\u015b\u015c\3\2\2\2\u015c\u015e\3\2"+
		"\2\2\u015d\u015b\3\2\2\2\u015e\u0163\7\u00cc\2\2\u015f\u0160\5\u00c0a"+
		"\2\u0160\u0161\7\u00cf\2\2\u0161\u0163\3\2\2\2\u0162\u0155\3\2\2\2\u0162"+
		"\u015f\3\2\2\2\u0163\31\3\2\2\2\u0164\u016a\5D#\2\u0165\u016a\5\22\n\2"+
		"\u0166\u016a\5\34\17\2\u0167\u016a\5\36\20\2\u0168\u016a\5\u00a2R\2\u0169"+
		"\u0164\3\2\2\2\u0169\u0165\3\2\2\2\u0169\u0166\3\2\2\2\u0169\u0167\3\2"+
		"\2\2\u0169\u0168\3\2\2\2\u016a\33\3\2\2\2\u016b\u016c\5\60\31\2\u016c"+
		"\u016e\7O\2\2\u016d\u016f\7\u00b9\2\2\u016e\u016d\3\2\2\2\u016e\u016f"+
		"\3\2\2\2\u016f\u0170\3\2\2\2\u0170\u0172\5\u00f8}\2\u0171\u0173\5$\23"+
		"\2\u0172\u0171\3\2\2\2\u0172\u0173\3\2\2\2\u0173\u0174\3\2\2\2\u0174\u0175"+
		"\7\u00c7\2\2\u0175\u0176\5|?\2\u0176\u0177\7\u00c8\2\2\u0177\u0178\5F"+
		"$\2\u0178\35\3\2\2\2\u0179\u017b\5\60\31\2\u017a\u017c\7j\2\2\u017b\u017a"+
		"\3\2\2\2\u017b\u017c\3\2\2\2\u017c\u017e\3\2\2\2\u017d\u017f\5\u00f6|"+
		"\2\u017e\u017d\3\2\2\2\u017e\u017f\3\2\2\2\u017f\u0181\3\2\2\2\u0180\u0182"+
		"\7h\2\2\u0181\u0180\3\2\2\2\u0181\u0182\3\2\2\2\u0182\u0199\3\2\2\2\u0183"+
		"\u0184\5 \21\2\u0184\u0186\5\u00f8}\2\u0185\u0187\5$\23\2\u0186\u0185"+
		"\3\2\2\2\u0186\u0187\3\2\2\2\u0187\u018a\3\2\2\2\u0188\u0189\7I\2\2\u0189"+
		"\u018b\5\u00b8]\2\u018a\u0188\3\2\2\2\u018a\u018b\3\2\2\2\u018b\u018e"+
		"\3\2\2\2\u018c\u018d\7S\2\2\u018d\u018f\5\"\22\2\u018e\u018c\3\2\2\2\u018e"+
		"\u018f\3\2\2\2\u018f\u019a\3\2\2\2\u0190\u0191\7]\2\2\u0191\u0193\5\u00f8"+
		"}\2\u0192\u0194\5$\23\2\u0193\u0192\3\2\2\2\u0193\u0194\3\2\2\2\u0194"+
		"\u0197\3\2\2\2\u0195\u0196\7I\2\2\u0196\u0198\5\"\22\2\u0197\u0195\3\2"+
		"\2\2\u0197\u0198\3\2\2\2\u0198\u019a\3\2\2\2\u0199\u0183\3\2\2\2\u0199"+
		"\u0190\3\2\2\2\u019a\u019b\3\2\2\2\u019b\u019f\7\u00cb\2\2\u019c\u019e"+
		"\5\u008aF\2\u019d\u019c\3\2\2\2\u019e\u01a1\3\2\2\2\u019f\u019d\3\2\2"+
		"\2\u019f\u01a0\3\2\2\2\u01a0\u01a2\3\2\2\2\u01a1\u019f\3\2\2\2\u01a2\u01a3"+
		"\7\u00cc\2\2\u01a3\37\3\2\2\2\u01a4\u01a5\t\4\2\2\u01a5!\3\2\2\2\u01a6"+
		"\u01ab\5\u00b8]\2\u01a7\u01a8\7\u00cd\2\2\u01a8\u01aa\5\u00b8]\2\u01a9"+
		"\u01a7\3\2\2\2\u01aa\u01ad\3\2\2\2\u01ab\u01a9\3\2\2\2\u01ab\u01ac\3\2"+
		"\2\2\u01ac#\3\2\2\2\u01ad\u01ab\3\2\2\2\u01ae\u01af\7\u0097\2\2\u01af"+
		"\u01b0\5&\24\2\u01b0\u01b1\7\u0098\2\2\u01b1\u01bd\3\2\2\2\u01b2\u01b3"+
		"\7\u0097\2\2\u01b3\u01b4\5(\25\2\u01b4\u01b5\7\u0098\2\2\u01b5\u01bd\3"+
		"\2\2\2\u01b6\u01b7\7\u0097\2\2\u01b7\u01b8\5&\24\2\u01b8\u01b9\7\u00cd"+
		"\2\2\u01b9\u01ba\5(\25\2\u01ba\u01bb\7\u0098\2\2\u01bb\u01bd\3\2\2\2\u01bc"+
		"\u01ae\3\2\2\2\u01bc\u01b2\3\2\2\2\u01bc\u01b6\3\2\2\2\u01bd%\3\2\2\2"+
		"\u01be\u01c3\5*\26\2\u01bf\u01c0\7\u00cd\2\2\u01c0\u01c2\5*\26\2\u01c1"+
		"\u01bf\3\2\2\2\u01c2\u01c5\3\2\2\2\u01c3\u01c1\3\2\2\2\u01c3\u01c4\3\2"+
		"\2\2\u01c4\'\3\2\2\2\u01c5\u01c3\3\2\2\2\u01c6\u01cb\5,\27\2\u01c7\u01c8"+
		"\7\u00cd\2\2\u01c8\u01ca\5,\27\2\u01c9\u01c7\3\2\2\2\u01ca\u01cd\3\2\2"+
		"\2\u01cb\u01c9\3\2\2\2\u01cb\u01cc\3\2\2\2\u01cc)\3\2\2\2\u01cd\u01cb"+
		"\3\2\2\2\u01ce\u01cf\5\60\31\2\u01cf\u01d0\5\u00f8}\2\u01d0+\3\2\2\2\u01d1"+
		"\u01d2\5\60\31\2\u01d2\u01d3\5\u00f8}\2\u01d3\u01d6\7\u00d0\2\2\u01d4"+
		"\u01d7\5\u00b8]\2\u01d5\u01d7\5\u0100\u0081\2\u01d6\u01d4\3\2\2\2\u01d6"+
		"\u01d5\3\2\2\2\u01d7-\3\2\2\2\u01d8\u01d9\7\u0097\2\2\u01d9\u01de\5\u00ba"+
		"^\2\u01da\u01db\7\u00cd\2\2\u01db\u01dd\5\u00ba^\2\u01dc\u01da\3\2\2\2"+
		"\u01dd\u01e0\3\2\2\2\u01de\u01dc\3\2\2\2\u01de\u01df\3\2\2\2\u01df\u01e1"+
		"\3\2\2\2\u01e0\u01de\3\2\2\2\u01e1\u01e2\7\u0098\2\2\u01e2/\3\2\2\2\u01e3"+
		"\u01e5\5\62\32\2\u01e4\u01e3\3\2\2\2\u01e5\u01e8\3\2\2\2\u01e6\u01e4\3"+
		"\2\2\2\u01e6\u01e7\3\2\2\2\u01e7\61\3\2\2\2\u01e8\u01e6\3\2\2\2\u01e9"+
		"\u01ed\7\u00c9\2\2\u01ea\u01eb\5\u00f8}\2\u01eb\u01ec\7\u00ce\2\2\u01ec"+
		"\u01ee\3\2\2\2\u01ed\u01ea\3\2\2\2\u01ed\u01ee\3\2\2\2\u01ee\u01ef\3\2"+
		"\2\2\u01ef\u01f4\5\64\33\2\u01f0\u01f1\7\u00cd\2\2\u01f1\u01f3\5\64\33"+
		"\2\u01f2\u01f0\3\2\2\2\u01f3\u01f6\3\2\2\2\u01f4\u01f2\3\2\2\2\u01f4\u01f5"+
		"\3\2\2\2\u01f5\u01f7\3\2\2\2\u01f6\u01f4\3\2\2\2\u01f7\u01f8\7\u00ca\2"+
		"\2\u01f8\63\3\2\2\2\u01f9\u020c\5\u00be`\2\u01fa\u01fb\5\u00be`\2\u01fb"+
		"\u01fc\7\u00c7\2\2\u01fc\u01fd\5\66\34\2\u01fd\u01fe\7\u00c8\2\2\u01fe"+
		"\u020c\3\2\2\2\u01ff\u0200\5\u00be`\2\u0200\u0201\7\u00c7\2\2\u0201\u0202"+
		"\58\35\2\u0202\u0203\7\u00c8\2\2\u0203\u020c\3\2\2\2\u0204\u0205\5\u00be"+
		"`\2\u0205\u0206\7\u00c7\2\2\u0206\u0207\5\66\34\2\u0207\u0208\7\u00cd"+
		"\2\2\u0208\u0209\58\35\2\u0209\u020a\7\u00c8\2\2\u020a\u020c\3\2\2\2\u020b"+
		"\u01f9\3\2\2\2\u020b\u01fa\3\2\2\2\u020b\u01ff\3\2\2\2\u020b\u0204\3\2"+
		"\2\2\u020c\65\3\2\2\2\u020d\u0212\5\u00a8U\2\u020e\u020f\7\u00cd\2\2\u020f"+
		"\u0211\5\u00a8U\2\u0210\u020e\3\2\2\2\u0211\u0214\3\2\2\2\u0212\u0210"+
		"\3\2\2\2\u0212\u0213\3\2\2\2\u0213\67\3\2\2\2\u0214\u0212\3\2\2\2\u0215"+
		"\u021a\5:\36\2\u0216\u0217\7\u00cd\2\2\u0217\u0219\5:\36\2\u0218\u0216"+
		"\3\2\2\2\u0219\u021c\3\2\2\2\u021a\u0218\3\2\2\2\u021a\u021b\3\2\2\2\u021b"+
		"9\3\2\2\2\u021c\u021a\3\2\2\2\u021d\u021e\7\u00d3\2\2\u021e\u021f\7\u0099"+
		"\2\2\u021f\u0220\5\u00a8U\2\u0220;\3\2\2\2\u0221\u0223\5> \2\u0222\u0221"+
		"\3\2\2\2\u0223\u0226\3\2\2\2\u0224\u0222\3\2\2\2\u0224\u0225\3\2\2\2\u0225"+
		"=\3\2\2\2\u0226\u0224\3\2\2\2\u0227\u022b\5@!\2\u0228\u022b\5\34\17\2"+
		"\u0229\u022b\5\36\20\2\u022a\u0227\3\2\2\2\u022a\u0228\3\2\2\2\u022a\u0229"+
		"\3\2\2\2\u022b?\3\2\2\2\u022c\u022f\5D#\2\u022d\u022f\5B\"\2\u022e\u022c"+
		"\3\2\2\2\u022e\u022d\3\2\2\2\u022fA\3\2\2\2\u0230\u0231\7\u00cf\2\2\u0231"+
		"C\3\2\2\2\u0232\u0233\5\u00f8}\2\u0233\u0234\7\u00ce\2\2\u0234\u024d\3"+
		"\2\2\2\u0235\u024d\5F$\2\u0236\u024d\5H%\2\u0237\u024d\5R*\2\u0238\u024d"+
		"\5T+\2\u0239\u024d\5V,\2\u023a\u024d\5\\/\2\u023b\u024d\5`\61\2\u023c"+
		"\u024d\5b\62\2\u023d\u024d\5d\63\2\u023e\u023f\5\u00aeX\2\u023f\u0240"+
		"\7\u00cf\2\2\u0240\u024d\3\2\2\2\u0241\u024d\5\u0082B\2\u0242\u024d\5"+
		"\u0088E\2\u0243\u024d\5\u0086D\2\u0244\u024d\5f\64\2\u0245\u024d\5h\65"+
		"\2\u0246\u024d\5j\66\2\u0247\u024d\5l\67\2\u0248\u024d\5r:\2\u0249\u024d"+
		"\5t;\2\u024a\u024d\5v<\2\u024b\u024d\5x=\2\u024c\u0232\3\2\2\2\u024c\u0235"+
		"\3\2\2\2\u024c\u0236\3\2\2\2\u024c\u0237\3\2\2\2\u024c\u0238\3\2\2\2\u024c"+
		"\u0239\3\2\2\2\u024c\u023a\3\2\2\2\u024c\u023b\3\2\2\2\u024c\u023c\3\2"+
		"\2\2\u024c\u023d\3\2\2\2\u024c\u023e\3\2\2\2\u024c\u0241\3\2\2\2\u024c"+
		"\u0242\3\2\2\2\u024c\u0243\3\2\2\2\u024c\u0244\3\2\2\2\u024c\u0245\3\2"+
		"\2\2\u024c\u0246\3\2\2\2\u024c\u0247\3\2\2\2\u024c\u0248\3\2\2\2\u024c"+
		"\u0249\3\2\2\2\u024c\u024a\3\2\2\2\u024c\u024b\3\2\2\2\u024dE\3\2\2\2"+
		"\u024e\u024f\7\u00cb\2\2\u024f\u0250\5<\37\2\u0250\u0251\7\u00cc\2\2\u0251"+
		"G\3\2\2\2\u0252\u0253\7R\2\2\u0253\u0254\5\u00a6T\2\u0254\u0258\5@!\2"+
		"\u0255\u0257\5J&\2\u0256\u0255\3\2\2\2\u0257\u025a\3\2\2\2\u0258\u0256"+
		"\3\2\2\2\u0258\u0259\3\2\2\2\u0259\u025c\3\2\2\2\u025a\u0258\3\2\2\2\u025b"+
		"\u025d\5N(\2\u025c\u025b\3\2\2\2\u025c\u025d\3\2\2\2\u025d\u026f\3\2\2"+
		"\2\u025e\u025f\7R\2\2\u025f\u0260\5\u00a6T\2\u0260\u0261\7\u00ce\2\2\u0261"+
		"\u0265\5<\37\2\u0262\u0264\5L\'\2\u0263\u0262\3\2\2\2\u0264\u0267\3\2"+
		"\2\2\u0265\u0263\3\2\2\2\u0265\u0266\3\2\2\2\u0266\u0269\3\2\2\2\u0267"+
		"\u0265\3\2\2\2\u0268\u026a\5P)\2\u0269\u0268\3\2\2\2\u0269\u026a\3\2\2"+
		"\2\u026a\u026b\3\2\2\2\u026b\u026c\7D\2\2\u026c\u026d\7\u00cf\2\2\u026d"+
		"\u026f\3\2\2\2\u026e\u0252\3\2\2\2\u026e\u025e\3\2\2\2\u026fI\3\2\2\2"+
		"\u0270\u0271\7?\2\2\u0271\u0272\5\u00a6T\2\u0272\u0273\5@!\2\u0273K\3"+
		"\2\2\2\u0274\u0275\7?\2\2\u0275\u0276\5\u00a6T\2\u0276\u0277\7\u00ce\2"+
		"\2\u0277\u0278\5<\37\2\u0278M\3\2\2\2\u0279\u027a\7>\2\2\u027a\u027b\5"+
		"@!\2\u027bO\3\2\2\2\u027c\u027d\7>\2\2\u027d\u027e\7\u00ce\2\2\u027e\u027f"+
		"\5<\37\2\u027fQ\3\2\2\2\u0280\u0281\7}\2\2\u0281\u0288\5\u00a6T\2\u0282"+
		"\u0289\5@!\2\u0283\u0284\7\u00ce\2\2\u0284\u0285\5<\37\2\u0285\u0286\7"+
		"F\2\2\u0286\u0287\7\u00cf\2\2\u0287\u0289\3\2\2\2\u0288\u0282\3\2\2\2"+
		"\u0288\u0283\3\2\2\2\u0289S\3\2\2\2\u028a\u028b\7:\2\2\u028b\u028c\5@"+
		"!\2\u028c\u028d\7}\2\2\u028d\u028e\5\u00a6T\2\u028e\u028f\7\u00cf\2\2"+
		"\u028fU\3\2\2\2\u0290\u0291\7M\2\2\u0291\u0293\7\u00c7\2\2\u0292\u0294"+
		"\5X-\2\u0293\u0292\3\2\2\2\u0293\u0294\3\2\2\2\u0294\u0295\3\2\2\2\u0295"+
		"\u0297\7\u00cf\2\2\u0296\u0298\5\u00a4S\2\u0297\u0296\3\2\2\2\u0297\u0298"+
		"\3\2\2\2\u0298\u0299\3\2\2\2\u0299\u029b\7\u00cf\2\2\u029a\u029c\5Z.\2"+
		"\u029b\u029a\3\2\2\2\u029b\u029c\3\2\2\2\u029c\u029d\3\2\2\2\u029d\u02a4"+
		"\7\u00c8\2\2\u029e\u02a5\5@!\2\u029f\u02a0\7\u00ce\2\2\u02a0\u02a1\5<"+
		"\37\2\u02a1\u02a2\7B\2\2\u02a2\u02a3\7\u00cf\2\2\u02a3\u02a5\3\2\2\2\u02a4"+
		"\u029e\3\2\2\2\u02a4\u029f\3\2\2\2\u02a5W\3\2\2\2\u02a6\u02a7\5\u00a4"+
		"S\2\u02a7Y\3\2\2\2\u02a8\u02a9\5\u00a4S\2\u02a9[\3\2\2\2\u02aa\u02ab\7"+
		"s\2\2\u02ab\u02c3\5\u00a6T\2\u02ac\u02ae\7\u00cb\2\2\u02ad\u02af\7\u00cf"+
		"\2\2\u02ae\u02ad\3\2\2\2\u02ae\u02af\3\2\2\2\u02af\u02b3\3\2\2\2\u02b0"+
		"\u02b2\5^\60\2\u02b1\u02b0\3\2\2\2\u02b2\u02b5\3\2\2\2\u02b3\u02b1\3\2"+
		"\2\2\u02b3\u02b4\3\2\2\2\u02b4\u02b6\3\2\2\2\u02b5\u02b3\3\2\2\2\u02b6"+
		"\u02c4\7\u00cc\2\2\u02b7\u02b9\7\u00ce\2\2\u02b8\u02ba\7\u00cf\2\2\u02b9"+
		"\u02b8\3\2\2\2\u02b9\u02ba\3\2\2\2\u02ba\u02be\3\2\2\2\u02bb\u02bd\5^"+
		"\60\2\u02bc\u02bb\3\2\2\2\u02bd\u02c0\3\2\2\2\u02be\u02bc\3\2\2\2\u02be"+
		"\u02bf\3\2\2\2\u02bf\u02c1\3\2\2\2\u02c0\u02be\3\2\2\2\u02c1\u02c2\7E"+
		"\2\2\u02c2\u02c4\7\u00cf\2\2\u02c3\u02ac\3\2\2\2\u02c3\u02b7\3\2\2\2\u02c4"+
		"]\3\2\2\2\u02c5\u02c6\7\62\2\2\u02c6\u02c9\5\u00a8U\2\u02c7\u02c9\79\2"+
		"\2\u02c8\u02c5\3\2\2\2\u02c8\u02c7\3\2\2\2\u02c9\u02ca\3\2\2\2\u02ca\u02cc"+
		"\t\5\2\2\u02cb\u02c8\3\2\2\2\u02cc\u02cd\3\2\2\2\u02cd\u02cb\3\2\2\2\u02cd"+
		"\u02ce\3\2\2\2\u02ce\u02cf\3\2\2\2\u02cf\u02d0\5<\37\2\u02d0_\3\2\2\2"+
		"\u02d1\u02d3\7\60\2\2\u02d2\u02d4\5\u00a8U\2\u02d3\u02d2\3\2\2\2\u02d3"+
		"\u02d4\3\2\2\2\u02d4\u02d5\3\2\2\2\u02d5\u02d6\7\u00cf\2\2\u02d6a\3\2"+
		"\2\2\u02d7\u02d9\7\67\2\2\u02d8\u02da\5\u00a8U\2\u02d9\u02d8\3\2\2\2\u02d9"+
		"\u02da\3\2\2\2\u02da\u02db\3\2\2\2\u02db\u02dc\7\u00cf\2\2\u02dcc\3\2"+
		"\2\2\u02dd\u02df\7p\2\2\u02de\u02e0\5\u00a8U\2\u02df\u02de\3\2\2\2\u02df"+
		"\u02e0\3\2\2\2\u02e0\u02e1\3\2\2\2\u02e1\u02e2\7\u00cf\2\2\u02e2e\3\2"+
		"\2\2\u02e3\u02e4\5\u00a8U\2\u02e4\u02e5\7\u00cf\2\2\u02e5g\3\2\2\2\u02e6"+
		"\u02e7\7z\2\2\u02e7\u02e8\7\u00c7\2\2\u02e8\u02e9\5\u00dco\2\u02e9\u02ea"+
		"\7\u00c8\2\2\u02ea\u02eb\7\u00cf\2\2\u02ebi\3\2\2\2\u02ec\u0313\7N\2\2"+
		"\u02ed\u02ee\7\u00c7\2\2\u02ee\u02ef\5\u00dep\2\u02ef\u02f1\7,\2\2\u02f0"+
		"\u02f2\7\u00b9\2\2\u02f1\u02f0\3\2\2\2\u02f1\u02f2\3\2\2\2\u02f2\u02f3"+
		"\3\2\2\2\u02f3\u02f9\5\u00dep\2\u02f4\u02f6\7\u0099\2\2\u02f5\u02f7\7"+
		"\u00b9\2\2\u02f6\u02f5\3\2\2\2\u02f6\u02f7\3\2\2\2\u02f7\u02f8\3\2\2\2"+
		"\u02f8\u02fa\5\u00dep\2\u02f9\u02f4\3\2\2\2\u02f9\u02fa\3\2\2\2\u02fa"+
		"\u02fb\3\2\2\2\u02fb\u02fc\7\u00c8\2\2\u02fc\u0314\3\2\2\2\u02fd\u02fe"+
		"\7\u00c7\2\2\u02fe\u02ff\5\u00a8U\2\u02ff\u0300\7,\2\2\u0300\u0306\5\u00de"+
		"p\2\u0301\u0303\7\u0099\2\2\u0302\u0304\7\u00b9\2\2\u0303\u0302\3\2\2"+
		"\2\u0303\u0304\3\2\2\2\u0304\u0305\3\2\2\2\u0305\u0307\5\u00dep\2\u0306"+
		"\u0301\3\2\2\2\u0306\u0307\3\2\2\2\u0307\u0308\3\2\2\2\u0308\u0309\7\u00c8"+
		"\2\2\u0309\u0314\3\2\2\2\u030a\u030b\7\u00c7\2\2\u030b\u030c\5\u00dep"+
		"\2\u030c\u030d\7,\2\2\u030d\u030e\7_\2\2\u030e\u030f\7\u00c7\2\2\u030f"+
		"\u0310\5\u00f2z\2\u0310\u0311\7\u00c8\2\2\u0311\u0312\7\u00c8\2\2\u0312"+
		"\u0314\3\2\2\2\u0313\u02ed\3\2\2\2\u0313\u02fd\3\2\2\2\u0313\u030a\3\2"+
		"\2\2\u0314\u031b\3\2\2\2\u0315\u031c\5@!\2\u0316\u0317\7\u00ce\2\2\u0317"+
		"\u0318\5<\37\2\u0318\u0319\7C\2\2\u0319\u031a\7\u00cf\2\2\u031a\u031c"+
		"\3\2\2\2\u031b\u0315\3\2\2\2\u031b\u0316\3\2\2\2\u031ck\3\2\2\2\u031d"+
		"\u031e\7v\2\2\u031e\u032e\5F$\2\u031f\u0321\5n8\2\u0320\u031f\3\2\2\2"+
		"\u0321\u0322\3\2\2\2\u0322\u0320\3\2\2\2\u0322\u0323\3\2\2\2\u0323\u0325"+
		"\3\2\2\2\u0324\u0326\5p9\2\u0325\u0324\3\2\2\2\u0325\u0326\3\2\2\2\u0326"+
		"\u032f\3\2\2\2\u0327\u0329\5n8\2\u0328\u0327\3\2\2\2\u0329\u032c\3\2\2"+
		"\2\u032a\u0328\3\2\2\2\u032a\u032b\3\2\2\2\u032b\u032d\3\2\2\2\u032c\u032a"+
		"\3\2\2\2\u032d\u032f\5p9\2\u032e\u0320\3\2\2\2\u032e\u032a\3\2\2\2\u032f"+
		"m\3\2\2\2\u0330\u0331\7\63\2\2\u0331\u0332\7\u00c7\2\2\u0332\u0333\5\u00b8"+
		"]\2\u0333\u0334\7\u00d3\2\2\u0334\u0335\7\u00c8\2\2\u0335\u0336\5F$\2"+
		"\u0336o\3\2\2\2\u0337\u0338\7K\2\2\u0338\u0339\5F$\2\u0339q\3\2\2\2\u033a"+
		"\u033b\7t\2\2\u033b\u033c\5\u00a8U\2\u033c\u033d\7\u00cf\2\2\u033ds\3"+
		"\2\2\2\u033e\u033f\7Q\2\2\u033f\u0340\5\u00f8}\2\u0340\u0341\7\u00cf\2"+
		"\2\u0341u\3\2\2\2\u0342\u0343\78\2\2\u0343\u0344\7\u00c7\2\2\u0344\u0345"+
		"\5z>\2\u0345\u034c\7\u00c8\2\2\u0346\u034d\5@!\2\u0347\u0348\7\u00ce\2"+
		"\2\u0348\u0349\5<\37\2\u0349\u034a\7A\2\2\u034a\u034b\7\u00cf\2\2\u034b"+
		"\u034d\3\2\2\2\u034c\u0346\3\2\2\2\u034c\u0347\3\2\2\2\u034dw\3\2\2\2"+
		"\u034e\u0351\5\6\4\2\u034f\u0351\5\n\6\2\u0350\u034e\3\2\2\2\u0350\u034f"+
		"\3\2\2\2\u0351\u0352\3\2\2\2\u0352\u0350\3\2\2\2\u0352\u0353\3\2\2\2\u0353"+
		"y\3\2\2\2\u0354\u0359\5\u00a0Q\2\u0355\u0356\7\u00cd\2\2\u0356\u0358\5"+
		"\u00a0Q\2\u0357\u0355\3\2\2\2\u0358\u035b\3\2\2\2\u0359\u0357\3\2\2\2"+
		"\u0359\u035a\3\2\2\2\u035a{\3\2\2\2\u035b\u0359\3\2\2\2\u035c\u035e\5"+
		"~@\2\u035d\u035c\3\2\2\2\u035d\u035e\3\2\2\2\u035e\u0363\3\2\2\2\u035f"+
		"\u0360\7\u00cd\2\2\u0360\u0362\5~@\2\u0361\u035f\3\2\2\2\u0362\u0365\3"+
		"\2\2\2\u0363\u0361\3\2\2\2\u0363\u0364\3\2\2\2\u0364}\3\2\2\2\u0365\u0363"+
		"\3\2\2\2\u0366\u0368\5\60\31\2\u0367\u0369\5\u0080A\2\u0368\u0367\3\2"+
		"\2\2\u0368\u0369\3\2\2\2\u0369\u036b\3\2\2\2\u036a\u036c\7\u00b9\2\2\u036b"+
		"\u036a\3\2\2\2\u036b\u036c\3\2\2\2\u036c\u036e\3\2\2\2\u036d\u036f\7\u00b6"+
		"\2\2\u036e\u036d\3\2\2\2\u036e\u036f\3\2\2\2\u036f\u0370\3\2\2\2\u0370"+
		"\u0371\5\u009eP\2\u0371\177\3\2\2\2\u0372\u0376\5\u00b8]\2\u0373\u0376"+
		"\7\61\2\2\u0374\u0376\5\u0100\u0081\2\u0375\u0372\3\2\2\2\u0375\u0373"+
		"\3\2\2\2\u0375\u0374\3\2\2\2\u0376\u0081\3\2\2\2\u0377\u0378\7P\2\2\u0378"+
		"\u037d\5\u0084C\2\u0379\u037a\7\u00cd\2\2\u037a\u037c\5\u0084C\2\u037b"+
		"\u0379\3\2\2\2\u037c\u037f\3\2\2\2\u037d\u037b\3\2\2\2\u037d\u037e\3\2"+
		"\2\2\u037e\u0380\3\2\2\2\u037f\u037d\3\2\2\2\u0380\u0381\7\u00cf\2\2\u0381"+
		"\u0083\3\2\2\2\u0382\u038b\7\u00d3\2\2\u0383\u0384\7\u00c4\2\2\u0384\u038b"+
		"\5\u00dep\2\u0385\u0386\7\u00c4\2\2\u0386\u0387\7\u00cb\2\2\u0387\u0388"+
		"\5\u00a8U\2\u0388\u0389\7\u00cc\2\2\u0389\u038b\3\2\2\2\u038a\u0382\3"+
		"\2\2\2\u038a\u0383\3\2\2\2\u038a\u0385\3\2\2\2\u038b\u0085\3\2\2\2\u038c"+
		"\u038d\7=\2\2\u038d\u038e\5\u00a4S\2\u038e\u038f\7\u00cf\2\2\u038f\u0087"+
		"\3\2\2\2\u0390\u0391\7q\2\2\u0391\u0396\5\u009eP\2\u0392\u0393\7\u00cd"+
		"\2\2\u0393\u0395\5\u009eP\2\u0394\u0392\3\2\2\2\u0395\u0398\3\2\2\2\u0396"+
		"\u0394\3\2\2\2\u0396\u0397\3\2\2\2\u0397\u0399\3\2\2\2\u0398\u0396\3\2"+
		"\2\2\u0399\u039a\7\u00cf\2\2\u039a\u0089\3\2\2\2\u039b\u039c\5\60\31\2"+
		"\u039c\u039d\5\u009aN\2\u039d\u03a2\5\u009eP\2\u039e\u039f\7\u00cd\2\2"+
		"\u039f\u03a1\5\u009eP\2\u03a0\u039e\3\2\2\2\u03a1\u03a4\3\2\2\2\u03a2"+
		"\u03a0\3\2\2\2\u03a2\u03a3\3\2\2\2\u03a3\u03a5\3\2\2\2\u03a4\u03a2\3\2"+
		"\2\2\u03a5\u03a6\7\u00cf\2\2\u03a6\u03cc\3\2\2\2\u03a7\u03a8\5\60\31\2"+
		"\u03a8\u03a9\7\66\2\2\u03a9\u03ae\5\u00a0Q\2\u03aa\u03ab\7\u00cd\2\2\u03ab"+
		"\u03ad\5\u00a0Q\2\u03ac\u03aa\3\2\2\2\u03ad\u03b0\3\2\2\2\u03ae\u03ac"+
		"\3\2\2\2\u03ae\u03af\3\2\2\2\u03af\u03b1\3\2\2\2\u03b0\u03ae\3\2\2\2\u03b1"+
		"\u03b2\7\u00cf\2\2\u03b2\u03cc\3\2\2\2\u03b3\u03b5\5\60\31\2\u03b4\u03b6"+
		"\5\u009cO\2\u03b5\u03b4\3\2\2\2\u03b5\u03b6\3\2\2\2\u03b6\u03b7\3\2\2"+
		"\2\u03b7\u03b9\7O\2\2\u03b8\u03ba\7\u00b9\2\2\u03b9\u03b8\3\2\2\2\u03b9"+
		"\u03ba\3\2\2\2\u03ba\u03bb\3\2\2\2\u03bb\u03bd\5\u00f8}\2\u03bc\u03be"+
		"\5$\23\2\u03bd\u03bc\3\2\2\2\u03bd\u03be\3\2\2\2\u03be\u03bf\3\2\2\2\u03bf"+
		"\u03c0\7\u00c7\2\2\u03c0\u03c1\5|?\2\u03c1\u03c3\7\u00c8\2\2\u03c2\u03c4"+
		"\5\u0096L\2\u03c3\u03c2\3\2\2\2\u03c3\u03c4\3\2\2\2\u03c4\u03c5\3\2\2"+
		"\2\u03c5\u03c6\5\u0098M\2\u03c6\u03cc\3\2\2\2\u03c7\u03c8\7{\2\2\u03c8"+
		"\u03c9\5\u00c2b\2\u03c9\u03ca\5\u008cG\2\u03ca\u03cc\3\2\2\2\u03cb\u039b"+
		"\3\2\2\2\u03cb\u03a7\3\2\2\2\u03cb\u03b3\3\2\2\2\u03cb\u03c7\3\2\2\2\u03cc"+
		"\u008b\3\2\2\2\u03cd\u03d7\7\u00cf\2\2\u03ce\u03d2\7\u00cb\2\2\u03cf\u03d1"+
		"\5\u008eH\2\u03d0\u03cf\3\2\2\2\u03d1\u03d4\3\2\2\2\u03d2\u03d0\3\2\2"+
		"\2\u03d2\u03d3\3\2\2\2\u03d3\u03d5\3\2\2\2\u03d4\u03d2\3\2\2\2\u03d5\u03d7"+
		"\7\u00cc\2\2\u03d6\u03cd\3\2\2\2\u03d6\u03ce\3\2\2\2\u03d7\u008d\3\2\2"+
		"\2\u03d8\u03db\5\u0090I\2\u03d9\u03db\5\u0092J\2\u03da\u03d8\3\2\2\2\u03da"+
		"\u03d9\3\2\2\2\u03db\u008f\3\2\2\2\u03dc\u03dd\5\u00be`\2\u03dd\u03de"+
		"\7\u00b3\2\2\u03de\u03df\5\u00f8}\2\u03df\u03e0\7X\2\2\u03e0\u03e1\5\u00c2"+
		"b\2\u03e1\u03e2\7\u00cf\2\2\u03e2\u0091\3\2\2\2\u03e3\u03e4\5\u0094K\2"+
		"\u03e4\u03ea\7,\2\2\u03e5\u03eb\5\u00fa~\2\u03e6\u03e8\5\u00fa~\2\u03e7"+
		"\u03e6\3\2\2\2\u03e7\u03e8\3\2\2\2\u03e8\u03e9\3\2\2\2\u03e9\u03eb\5\u00f8"+
		"}\2\u03ea\u03e5\3\2\2\2\u03ea\u03e7\3\2\2\2\u03eb\u03ec\3\2\2\2\u03ec"+
		"\u03ed\7\u00cf\2\2\u03ed\u0093\3\2\2\2\u03ee\u03ef\5\u00be`\2\u03ef\u03f0"+
		"\7\u00b3\2\2\u03f0\u03f2\3\2\2\2\u03f1\u03ee\3\2\2\2\u03f1\u03f2\3\2\2"+
		"\2\u03f2\u03f3\3\2\2\2\u03f3\u03f4\5\u00f8}\2\u03f4\u0095\3\2\2\2\u03f5"+
		"\u03f6\7\u00ce\2\2\u03f6\u03f7\5\u00f8}\2\u03f7\u03f8\5\u00c4c\2\u03f8"+
		"\u0097\3\2\2\2\u03f9\u03fc\7\u00cf\2\2\u03fa\u03fc\5F$\2\u03fb\u03f9\3"+
		"\2\2\2\u03fb\u03fa\3\2\2\2\u03fc\u0099\3\2\2\2\u03fd\u0400\5\u009cO\2"+
		"\u03fe\u0400\7|\2\2\u03ff\u03fd\3\2\2\2\u03ff\u03fe\3\2\2\2\u0400\u009b"+
		"\3\2\2\2\u0401\u0403\5\u00fa~\2\u0402\u0401\3\2\2\2\u0403\u0404\3\2\2"+
		"\2\u0404\u0402\3\2\2\2\u0404\u0405\3\2\2\2\u0405\u009d\3\2\2\2\u0406\u0409"+
		"\7\u00d3\2\2\u0407\u0408\7\u00d0\2\2\u0408\u040a\5\u00c8e\2\u0409\u0407"+
		"\3\2\2\2\u0409\u040a\3\2\2\2\u040a\u009f\3\2\2\2\u040b\u040c\5\u00f8}"+
		"\2\u040c\u040d\7\u00d0\2\2\u040d\u040e\5\u00c8e\2\u040e\u00a1\3\2\2\2"+
		"\u040f\u0410\5\60\31\2\u0410\u0411\7\66\2\2\u0411\u0416\5\u00a0Q\2\u0412"+
		"\u0413\7\u00cd\2\2\u0413\u0415\5\u00a0Q\2\u0414\u0412\3\2\2\2\u0415\u0418"+
		"\3\2\2\2\u0416\u0414\3\2\2\2\u0416\u0417\3\2\2\2\u0417\u0419\3\2\2\2\u0418"+
		"\u0416\3\2\2\2\u0419\u041a\7\u00cf\2\2\u041a\u00a3\3\2\2\2\u041b\u0420"+
		"\5\u00a8U\2\u041c\u041d\7\u00cd\2\2\u041d\u041f\5\u00a8U\2\u041e\u041c"+
		"\3\2\2\2\u041f\u0422\3\2\2\2\u0420\u041e\3\2\2\2\u0420\u0421\3\2\2\2\u0421"+
		"\u00a5\3\2\2\2\u0422\u0420\3\2\2\2\u0423\u0426\7\u00c7\2\2\u0424\u0427"+
		"\5\u00a8U\2\u0425\u0427\5\u00aeX\2\u0426\u0424\3\2\2\2\u0426\u0425\3\2"+
		"\2\2\u0427\u0428\3\2\2\2\u0428\u0429\7\u00c8\2\2\u0429\u00a7\3\2\2\2\u042a"+
		"\u042b\bU\1\2\u042b\u042c\7\65\2\2\u042c\u0498\5\u00a8U-\u042d\u0498\5"+
		"\u00aaV\2\u042e\u042f\5\u00d6l\2\u042f\u0430\7\u00c9\2\2\u0430\u0431\5"+
		"\u00a8U\2\u0431\u0432\7\u00ca\2\2\u0432\u0498\3\2\2\2\u0433\u0434\7\u00c7"+
		"\2\2\u0434\u0435\5\u0102\u0082\2\u0435\u0436\7\u00c8\2\2\u0436\u0437\5"+
		"\u00a8U*\u0437\u0498\3\2\2\2\u0438\u0439\t\6\2\2\u0439\u0498\5\u00a8U"+
		")\u043a\u043b\t\7\2\2\u043b\u0498\5\u00a8U(\u043c\u043d\t\b\2\2\u043d"+
		"\u0498\5\u00dep\2\u043e\u043f\5\u00dep\2\u043f\u0440\t\b\2\2\u0440\u0498"+
		"\3\2\2\2\u0441\u0442\5\u00dep\2\u0442\u0443\5\u00acW\2\u0443\u0444\5\u00a8"+
		"U%\u0444\u0498\3\2\2\2\u0445\u0446\5\u00dep\2\u0446\u0447\7\u00d0\2\2"+
		"\u0447\u044a\7\u00b9\2\2\u0448\u044b\5\u00dep\2\u0449\u044b\5\u00aaV\2"+
		"\u044a\u0448\3\2\2\2\u044a\u0449\3\2\2\2\u044b\u0498\3\2\2\2\u044c\u044d"+
		"\7i\2\2\u044d\u0498\5\u00a8U#\u044e\u0498\5\u00dep\2\u044f\u0498\5\u00ce"+
		"h\2\u0450\u0498\5\u00d8m\2\u0451\u0498\7\u00d4\2\2\u0452\u0498\7\u00da"+
		"\2\2\u0453\u0498\5\u00a6T\2\u0454\u0455\7+\2\2\u0455\u0457\7\u00c7\2\2"+
		"\u0456\u0458\5\u00b0Y\2\u0457\u0456\3\2\2\2\u0457\u0458\3\2\2\2\u0458"+
		"\u0459\3\2\2\2\u0459\u0460\7\u00c8\2\2\u045a\u045c\7\u00c9\2\2\u045b\u045d"+
		"\5\u00b0Y\2\u045c\u045b\3\2\2\2\u045c\u045d\3\2\2\2\u045d\u045e\3\2\2"+
		"\2\u045e\u0460\7\u00ca\2\2\u045f\u0454\3\2\2\2\u045f\u045a\3\2\2\2\u0460"+
		"\u0465\3\2\2\2\u0461\u0462\7\u00c9\2\2\u0462\u0463\5\u00a8U\2\u0463\u0464"+
		"\7\u00ca\2\2\u0464\u0466\3\2\2\2\u0465\u0461\3\2\2\2\u0465\u0466\3\2\2"+
		"\2\u0466\u0498\3\2\2\2\u0467\u0498\7~\2\2\u0468\u0469\7_\2\2\u0469\u046a"+
		"\7\u00c7\2\2\u046a\u046b\5\u00f2z\2\u046b\u046c\7\u00c8\2\2\u046c\u046d"+
		"\7\u00d0\2\2\u046d\u046e\5\u00a8U\32\u046e\u0498\3\2\2\2\u046f\u0470\7"+
		"^\2\2\u0470\u0471\7\u00c7\2\2\u0471\u0472\5\u00dco\2\u0472\u0473\7\u00c8"+
		"\2\2\u0473\u0498\3\2\2\2\u0474\u0475\7@\2\2\u0475\u0476\7\u00c7\2\2\u0476"+
		"\u0477\5\u00dep\2\u0477\u0478\7\u00c8\2\2\u0478\u0498\3\2\2\2\u0479\u047a"+
		"\7G\2\2\u047a\u047b\7\u00c7\2\2\u047b\u047c\5\u00a8U\2\u047c\u047d\7\u00c8"+
		"\2\2\u047d\u0498\3\2\2\2\u047e\u0482\7H\2\2\u047f\u0480\7\u00c7\2\2\u0480"+
		"\u0483\7\u00c8\2\2\u0481\u0483\5\u00a6T\2\u0482\u047f\3\2\2\2\u0482\u0481"+
		"\3\2\2\2\u0482\u0483\3\2\2\2\u0483\u0498\3\2\2\2\u0484\u0485\t\t\2\2\u0485"+
		"\u0498\5\u00a8U\25\u0486\u0487\t\n\2\2\u0487\u0498\5\u00a8U\24\u0488\u048a"+
		"\7q\2\2\u0489\u0488\3\2\2\2\u0489\u048a\3\2\2\2\u048a\u048b\3\2\2\2\u048b"+
		"\u048d\7O\2\2\u048c\u048e\7\u00b9\2\2\u048d\u048c\3\2\2\2\u048d\u048e"+
		"\3\2\2\2\u048e\u048f\3\2\2\2\u048f\u0490\7\u00c7\2\2\u0490\u0491\5|?\2"+
		"\u0491\u0493\7\u00c8\2\2\u0492\u0494\5\u00b4[\2\u0493\u0492\3\2\2\2\u0493"+
		"\u0494\3\2\2\2\u0494\u0495\3\2\2\2\u0495\u0496\5F$\2\u0496\u0498\3\2\2"+
		"\2\u0497\u042a\3\2\2\2\u0497\u042d\3\2\2\2\u0497\u042e\3\2\2\2\u0497\u0433"+
		"\3\2\2\2\u0497\u0438\3\2\2\2\u0497\u043a\3\2\2\2\u0497\u043c\3\2\2\2\u0497"+
		"\u043e\3\2\2\2\u0497\u0441\3\2\2\2\u0497\u0445\3\2\2\2\u0497\u044c\3\2"+
		"\2\2\u0497\u044e\3\2\2\2\u0497\u044f\3\2\2\2\u0497\u0450\3\2\2\2\u0497"+
		"\u0451\3\2\2\2\u0497\u0452\3\2\2\2\u0497\u0453\3\2\2\2\u0497\u045f\3\2"+
		"\2\2\u0497\u0467\3\2\2\2\u0497\u0468\3\2\2\2\u0497\u046f\3\2\2\2\u0497"+
		"\u0474\3\2\2\2\u0497\u0479\3\2\2\2\u0497\u047e\3\2\2\2\u0497\u0484\3\2"+
		"\2\2\u0497\u0486\3\2\2\2\u0497\u0489\3\2\2\2\u0498\u04cf\3\2\2\2\u0499"+
		"\u049a\f\22\2\2\u049a\u049b\7\u00a5\2\2\u049b\u04ce\5\u00a8U\22\u049c"+
		"\u049d\f\20\2\2\u049d\u049e\t\13\2\2\u049e\u04ce\5\u00a8U\21\u049f\u04a0"+
		"\f\17\2\2\u04a0\u04a1\t\f\2\2\u04a1\u04ce\5\u00a8U\20\u04a2\u04a3\f\16"+
		"\2\2\u04a3\u04a4\t\r\2\2\u04a4\u04ce\5\u00a8U\17\u04a5\u04a6\f\r\2\2\u04a6"+
		"\u04a7\t\16\2\2\u04a7\u04ce\5\u00a8U\16\u04a8\u04a9\f\f\2\2\u04a9\u04aa"+
		"\t\17\2\2\u04aa\u04ce\5\u00a8U\r\u04ab\u04ac\f\13\2\2\u04ac\u04ad\7\u00b9"+
		"\2\2\u04ad\u04ce\5\u00a8U\f\u04ae\u04af\f\n\2\2\u04af\u04b0\7\u00bc\2"+
		"\2\u04b0\u04ce\5\u00a8U\13\u04b1\u04b2\f\t\2\2\u04b2\u04b3\7\u00ba\2\2"+
		"\u04b3\u04ce\5\u00a8U\n\u04b4\u04b5\f\b\2\2\u04b5\u04b6\7\u00b0\2\2\u04b6"+
		"\u04ce\5\u00a8U\t\u04b7\u04b8\f\7\2\2\u04b8\u04b9\7\u00af\2\2\u04b9\u04ce"+
		"\5\u00a8U\b\u04ba\u04bb\f\6\2\2\u04bb\u04bd\7\u00c6\2\2\u04bc\u04be\5"+
		"\u00a8U\2\u04bd\u04bc\3\2\2\2\u04bd\u04be\3\2\2\2\u04be\u04bf\3\2\2\2"+
		"\u04bf\u04c0\7\u00ce\2\2\u04c0\u04ce\5\u00a8U\7\u04c1\u04c2\f\5\2\2\u04c2"+
		"\u04c3\7`\2\2\u04c3\u04ce\5\u00a8U\6\u04c4\u04c5\f\4\2\2\u04c5\u04c6\7"+
		"b\2\2\u04c6\u04ce\5\u00a8U\5\u04c7\u04c8\f\3\2\2\u04c8\u04c9\7a\2\2\u04c9"+
		"\u04ce\5\u00a8U\4\u04ca\u04cb\f\21\2\2\u04cb\u04cc\7W\2\2\u04cc\u04ce"+
		"\5\u00ba^\2\u04cd\u0499\3\2\2\2\u04cd\u049c\3\2\2\2\u04cd\u049f\3\2\2"+
		"\2\u04cd\u04a2\3\2\2\2\u04cd\u04a5\3\2\2\2\u04cd\u04a8\3\2\2\2\u04cd\u04ab"+
		"\3\2\2\2\u04cd\u04ae\3\2\2\2\u04cd\u04b1\3\2\2\2\u04cd\u04b4\3\2\2\2\u04cd"+
		"\u04b7\3\2\2\2\u04cd\u04ba\3\2\2\2\u04cd\u04c1\3\2\2\2\u04cd\u04c4\3\2"+
		"\2\2\u04cd\u04c7\3\2\2\2\u04cd\u04ca\3\2\2\2\u04ce\u04d1\3\2\2\2\u04cf"+
		"\u04cd\3\2\2\2\u04cf\u04d0\3\2\2\2\u04d0\u00a9\3\2\2\2\u04d1\u04cf\3\2"+
		"\2\2\u04d2\u04d3\7d\2\2\u04d3\u04d5\5\u00ba^\2\u04d4\u04d6\5\u00c4c\2"+
		"\u04d5\u04d4\3\2\2\2\u04d5\u04d6\3\2\2\2\u04d6\u00ab\3\2\2\2\u04d7\u04d8"+
		"\t\20\2\2\u04d8\u00ad\3\2\2\2\u04d9\u04da\7~\2\2\u04da\u04dd\5\u00a8U"+
		"\2\u04db\u04dc\7\u0099\2\2\u04dc\u04de\5\u00a8U\2\u04dd\u04db\3\2\2\2"+
		"\u04dd\u04de\3\2\2\2\u04de\u00af\3\2\2\2\u04df\u04e4\5\u00b2Z\2\u04e0"+
		"\u04e1\7\u00cd\2\2\u04e1\u04e3\5\u00b2Z\2\u04e2\u04e0\3\2\2\2\u04e3\u04e6"+
		"\3\2\2\2\u04e4\u04e2\3\2\2\2\u04e4\u04e5\3\2\2\2\u04e5\u04e8\3\2\2\2\u04e6"+
		"\u04e4\3\2\2\2\u04e7\u04e9\7\u00cd\2\2\u04e8\u04e7\3\2\2\2\u04e8\u04e9"+
		"\3\2\2\2\u04e9\u00b1\3\2\2\2\u04ea\u04ed\5\u00a8U\2\u04eb\u04ec\7\u0099"+
		"\2\2\u04ec\u04ee\5\u00a8U\2\u04ed\u04eb\3\2\2\2\u04ed\u04ee\3\2\2\2\u04ee"+
		"\u04f7\3\2\2\2\u04ef\u04f0\5\u00a8U\2\u04f0\u04f1\7\u0099\2\2\u04f1\u04f3"+
		"\3\2\2\2\u04f2\u04ef\3\2\2\2\u04f2\u04f3\3\2\2\2\u04f3\u04f4\3\2\2\2\u04f4"+
		"\u04f5\7\u00b9\2\2\u04f5\u04f7\5\u00dep\2\u04f6\u04ea\3\2\2\2\u04f6\u04f2"+
		"\3\2\2\2\u04f7\u00b3\3\2\2\2\u04f8\u04f9\7{\2\2\u04f9\u04fa\7\u00c7\2"+
		"\2\u04fa\u04ff\5\u00b6\\\2\u04fb\u04fc\7\u00cd\2\2\u04fc\u04fe\5\u00b6"+
		"\\\2\u04fd\u04fb\3\2\2\2\u04fe\u0501\3\2\2\2\u04ff\u04fd\3\2\2\2\u04ff"+
		"\u0500\3\2\2\2\u0500\u0502\3\2\2\2\u0501\u04ff\3\2\2\2\u0502\u0503\7\u00c8"+
		"\2\2\u0503\u00b5\3\2\2\2\u0504\u0506\7\u00b9\2\2\u0505\u0504\3\2\2\2\u0505"+
		"\u0506\3\2\2\2\u0506\u0507\3\2\2\2\u0507\u0508\7\u00d3\2\2\u0508\u00b7"+
		"\3\2\2\2\u0509\u050b\5\u00be`\2\u050a\u050c\5.\30\2\u050b\u050a\3\2\2"+
		"\2\u050b\u050c\3\2\2\2\u050c\u050f\3\2\2\2\u050d\u050f\7q\2\2\u050e\u0509"+
		"\3\2\2\2\u050e\u050d\3\2\2\2\u050f\u00b9\3\2\2\2\u0510\u0513\5\u00be`"+
		"\2\u0511\u0513\5\u00bc_\2\u0512\u0510\3\2\2\2\u0512\u0511\3\2\2\2\u0513"+
		"\u0515\3\2\2\2\u0514\u0516\5.\30\2\u0515\u0514\3\2\2\2\u0515\u0516\3\2"+
		"\2\2\u0516\u051a\3\2\2\2\u0517\u051a\5\u0100\u0081\2\u0518\u051a\7q\2"+
		"\2\u0519\u0512\3\2\2\2\u0519\u0517\3\2\2\2\u0519\u0518\3\2\2\2\u051a\u00bb"+
		"\3\2\2\2\u051b\u0520\5\u00e8u\2\u051c\u051d\7\u00b4\2\2\u051d\u051f\5"+
		"\u00eav\2\u051e\u051c\3\2\2\2\u051f\u0522\3\2\2\2\u0520\u051e\3\2\2\2"+
		"\u0520\u0521\3\2\2\2\u0521\u00bd\3\2\2\2\u0522\u0520\3\2\2\2\u0523\u0525"+
		"\7c\2\2\u0524\u0523\3\2\2\2\u0524\u0525\3\2\2\2\u0525\u0527\3\2\2\2\u0526"+
		"\u0528\7\u00b5\2\2\u0527\u0526\3\2\2\2\u0527\u0528\3\2\2\2\u0528\u0529"+
		"\3\2\2\2\u0529\u052a\5\u00c0a\2\u052a\u00bf\3\2\2\2\u052b\u0530\5\u00f8"+
		"}\2\u052c\u052d\7\u00b5\2\2\u052d\u052f\5\u00f8}\2\u052e\u052c\3\2\2\2"+
		"\u052f\u0532\3\2\2\2\u0530\u052e\3\2\2\2\u0530\u0531\3\2\2\2\u0531\u00c1"+
		"\3\2\2\2\u0532\u0530\3\2\2\2\u0533\u0538\5\u00be`\2\u0534\u0535\7\u00cd"+
		"\2\2\u0535\u0537\5\u00be`\2\u0536\u0534\3\2\2\2\u0537\u053a\3\2\2\2\u0538"+
		"\u0536\3\2\2\2\u0538\u0539\3\2\2\2\u0539\u00c3\3\2\2\2\u053a\u0538\3\2"+
		"\2\2\u053b\u0545\7\u00c7\2\2\u053c\u0541\5\u00c6d\2\u053d\u053e\7\u00cd"+
		"\2\2\u053e\u0540\5\u00c6d\2\u053f\u053d\3\2\2\2\u0540\u0543\3\2\2\2\u0541"+
		"\u053f\3\2\2\2\u0541\u0542\3\2\2\2\u0542\u0546\3\2\2\2\u0543\u0541\3\2"+
		"\2\2\u0544\u0546\5\u00aeX\2\u0545\u053c\3\2\2\2\u0545\u0544\3\2\2\2\u0545"+
		"\u0546\3\2\2\2\u0546\u0547\3\2\2\2\u0547\u0548\7\u00c8\2\2\u0548\u00c5"+
		"\3\2\2\2\u0549\u054b\7\u00b6\2\2\u054a\u0549\3\2\2\2\u054a\u054b\3\2\2"+
		"\2\u054b\u054c\3\2\2\2\u054c\u0550\5\u00a8U\2\u054d\u054e\7\u00b9\2\2"+
		"\u054e\u0550\5\u00dep\2\u054f\u054a\3\2\2\2\u054f\u054d\3\2\2\2\u0550"+
		"\u00c7\3\2\2\2\u0551\u0567\5\u00ceh\2\u0552\u0567\5\u00d8m\2\u0553\u0554"+
		"\7+\2\2\u0554\u0559\7\u00c7\2\2\u0555\u0557\5\u00caf\2\u0556\u0558\7\u00cd"+
		"\2\2\u0557\u0556\3\2\2\2\u0557\u0558\3\2\2\2\u0558\u055a\3\2\2\2\u0559"+
		"\u0555\3\2\2\2\u0559\u055a\3\2\2\2\u055a\u055b\3\2\2\2\u055b\u0567\7\u00c8"+
		"\2\2\u055c\u0561\7\u00c9\2\2\u055d\u055f\5\u00caf\2\u055e\u0560\7\u00cd"+
		"\2\2\u055f\u055e\3\2\2\2\u055f\u0560\3\2\2\2\u0560\u0562\3\2\2\2\u0561"+
		"\u055d\3\2\2\2\u0561\u0562\3\2\2\2\u0562\u0563\3\2\2\2\u0563\u0567\7\u00ca"+
		"\2\2\u0564\u0565\t\21\2\2\u0565\u0567\5\u00c8e\2\u0566\u0551\3\2\2\2\u0566"+
		"\u0552\3\2\2\2\u0566\u0553\3\2\2\2\u0566\u055c\3\2\2\2\u0566\u0564\3\2"+
		"\2\2\u0567\u00c9\3\2\2\2\u0568\u056d\5\u00ccg\2\u0569\u056a\7\u00cd\2"+
		"\2\u056a\u056c\5\u00ccg\2\u056b\u0569\3\2\2\2\u056c\u056f\3\2\2\2\u056d"+
		"\u056b\3\2\2\2\u056d\u056e\3\2\2\2\u056e\u00cb\3\2\2\2\u056f\u056d\3\2"+
		"\2\2\u0570\u0573\5\u00c8e\2\u0571\u0572\7\u0099\2\2\u0572\u0574\5\u00c8"+
		"e\2\u0573\u0571\3\2\2\2\u0573\u0574\3\2\2\2\u0574\u00cd\3\2\2\2\u0575"+
		"\u057b\7e\2\2\u0576\u057b\5\u00d0i\2\u0577\u057b\5\u00fc\177\2\u0578\u057b"+
		"\5\u00d4k\2\u0579\u057b\5\u00be`\2\u057a\u0575\3\2\2\2\u057a\u0576\3\2"+
		"\2\2\u057a\u0577\3\2\2\2\u057a\u0578\3\2\2\2\u057a\u0579\3\2\2\2\u057b"+
		"\u00cf\3\2\2\2\u057c\u0581\7\u00d7\2\2\u057d\u0581\7/\2\2\u057e\u0581"+
		"\5\u00d2j\2\u057f\u0581\5\u00d6l\2\u0580\u057c\3\2\2\2\u0580\u057d\3\2"+
		"\2\2\u0580\u057e\3\2\2\2\u0580\u057f\3\2\2\2\u0581\u00d1\3\2\2\2\u0582"+
		"\u0583\t\22\2\2\u0583\u00d3\3\2\2\2\u0584\u0585\t\23\2\2\u0585\u058a\7"+
		"\u00b3\2\2\u0586\u058b\5\u00f8}\2\u0587\u058b\7\u0083\2\2\u0588\u058b"+
		"\7\177\2\2\u0589\u058b\7\u0080\2\2\u058a\u0586\3\2\2\2\u058a\u0587\3\2"+
		"\2\2\u058a\u0588\3\2\2\2\u058a\u0589\3\2\2\2\u058b\u0594\3\2\2\2\u058c"+
		"\u058f\5\u00b8]\2\u058d\u058f\5\u00eex\2\u058e\u058c\3\2\2\2\u058e\u058d"+
		"\3\2\2\2\u058f\u0590\3\2\2\2\u0590\u0591\7\u00b3\2\2\u0591\u0592\5\u00f8"+
		"}\2\u0592\u0594\3\2\2\2\u0593\u0584\3\2\2\2\u0593\u058e\3\2\2\2\u0594"+
		"\u00d5\3\2\2\2\u0595\u0596\7\u00d4\2\2\u0596\u00d7\3\2\2\2\u0597\u0599"+
		"\7\u00de\2\2\u0598\u059a\7\u00e5\2\2\u0599\u0598\3\2\2\2\u059a\u059b\3"+
		"\2\2\2\u059b\u0599\3\2\2\2\u059b\u059c\3\2\2\2\u059c\u05ad\3\2\2\2\u059d"+
		"\u059f\7\u00dd\2\2\u059e\u05a0\7\u00e5\2\2\u059f\u059e\3\2\2\2\u05a0\u05a1"+
		"\3\2\2\2\u05a1\u059f\3\2\2\2\u05a1\u05a2\3\2\2\2\u05a2\u05ad\3\2\2\2\u05a3"+
		"\u05ad\7\u00db\2\2\u05a4\u05a8\7\u00dc\2\2\u05a5\u05a7\5\u00dan\2\u05a6"+
		"\u05a5\3\2\2\2\u05a7\u05aa\3\2\2\2\u05a8\u05a6\3\2\2\2\u05a8\u05a9\3\2"+
		"\2\2\u05a9\u05ab\3\2\2\2\u05aa\u05a8\3\2\2\2\u05ab\u05ad\7\u00dc\2\2\u05ac"+
		"\u0597\3\2\2\2\u05ac\u059d\3\2\2\2\u05ac\u05a3\3\2\2\2\u05ac\u05a4\3\2"+
		"\2\2\u05ad\u00d9\3\2\2\2\u05ae\u05b1\7\u00e1\2\2\u05af\u05b1\5\u00dep"+
		"\2\u05b0\u05ae\3\2\2\2\u05b0\u05af\3\2\2\2\u05b1\u00db\3\2\2\2\u05b2\u05b7"+
		"\5\u00dep\2\u05b3\u05b4\7\u00cd\2\2\u05b4\u05b6\5\u00dep\2\u05b5\u05b3"+
		"\3\2\2\2\u05b6\u05b9\3\2\2\2\u05b7\u05b5\3\2\2\2\u05b7\u05b8\3\2\2\2\u05b8"+
		"\u00dd\3\2\2\2\u05b9\u05b7\3\2\2\2\u05ba\u05c1\5\u00e8u\2\u05bb\u05c1"+
		"\5\u00e2r\2\u05bc\u05bd\7\u00c7\2\2\u05bd\u05be\5\u00aaV\2\u05be\u05bf"+
		"\7\u00c8\2\2\u05bf\u05c1\3\2\2\2\u05c0\u05ba\3\2\2\2\u05c0\u05bb\3\2\2"+
		"\2\u05c0\u05bc\3\2\2\2\u05c1\u05c5\3\2\2\2\u05c2\u05c4\5\u00e0q\2\u05c3"+
		"\u05c2\3\2\2\2\u05c4\u05c7\3\2\2\2\u05c5\u05c3\3\2\2\2\u05c5\u05c6\3\2"+
		"\2\2\u05c6\u00df\3\2\2\2\u05c7\u05c5\3\2\2\2\u05c8\u05c9\7\u00b4\2\2\u05c9"+
		"\u05cb\5\u00eav\2\u05ca\u05cc\5\u00e6t\2\u05cb\u05ca\3\2\2\2\u05cb\u05cc"+
		"\3\2\2\2\u05cc\u00e1\3\2\2\2\u05cd\u05ce\5\u00e4s\2\u05ce\u05cf\5\u00e6"+
		"t\2\u05cf\u00e3\3\2\2\2\u05d0\u05d4\5\u00be`\2\u05d1\u05d4\5\u00d4k\2"+
		"\u05d2\u05d4\5\u00e8u\2\u05d3\u05d0\3\2\2\2\u05d3\u05d1\3\2\2\2\u05d3"+
		"\u05d2\3\2\2\2\u05d4\u00e5\3\2\2\2\u05d5\u05d7\5.\30\2\u05d6\u05d5\3\2"+
		"\2\2\u05d6\u05d7\3\2\2\2\u05d7\u05d8\3\2\2\2\u05d8\u05dc\5\u00c4c\2\u05d9"+
		"\u05db\5\u00f0y\2\u05da\u05d9\3\2\2\2\u05db\u05de\3\2\2\2\u05dc\u05da"+
		"\3\2\2\2\u05dc\u05dd\3\2\2\2\u05dd\u00e7\3\2\2\2\u05de\u05dc\3\2\2\2\u05df"+
		"\u05e2\5\u00eex\2\u05e0\u05e1\7\u00b3\2\2\u05e1\u05e3\5\u00eex\2\u05e2"+
		"\u05e0\3\2\2\2\u05e2\u05e3\3\2\2\2\u05e3\u05e9\3\2\2\2\u05e4\u05e5\5\u00b8"+
		"]\2\u05e5\u05e6\7\u00b3\2\2\u05e6\u05e7\5\u00eex\2\u05e7\u05e9\3\2\2\2"+
		"\u05e8\u05df\3\2\2\2\u05e8\u05e4\3\2\2\2\u05e9\u00e9\3\2\2\2\u05ea\u05ed"+
		"\5\u00ecw\2\u05eb\u05ed\5\u00eex\2\u05ec\u05ea\3\2\2\2\u05ec\u05eb\3\2"+
		"\2\2\u05ed\u00eb\3\2\2\2\u05ee\u05f4\5\u00f8}\2\u05ef\u05f0\7\u00cb\2"+
		"\2\u05f0\u05f1\5\u00a8U\2\u05f1\u05f2\7\u00cc\2\2\u05f2\u05f4\3\2\2\2"+
		"\u05f3\u05ee\3\2\2\2\u05f3\u05ef\3\2\2\2\u05f4\u05f8\3\2\2\2\u05f5\u05f7"+
		"\5\u00f0y\2\u05f6\u05f5\3\2\2\2\u05f7\u05fa\3\2\2\2\u05f8\u05f6\3\2\2"+
		"\2\u05f8\u05f9\3\2\2\2\u05f9\u00ed\3\2\2\2\u05fa\u05f8\3\2\2\2\u05fb\u05fd"+
		"\7\u00c4\2\2\u05fc\u05fb\3\2\2\2\u05fd\u0600\3\2\2\2\u05fe\u05fc\3\2\2"+
		"\2\u05fe\u05ff\3\2\2\2\u05ff\u0607\3\2\2\2\u0600\u05fe\3\2\2\2\u0601\u0608"+
		"\7\u00d3\2\2\u0602\u0603\7\u00c4\2\2\u0603\u0604\7\u00cb\2\2\u0604\u0605"+
		"\5\u00a8U\2\u0605\u0606\7\u00cc\2\2\u0606\u0608\3\2\2\2\u0607\u0601\3"+
		"\2\2\2\u0607\u0602\3\2\2\2\u0608\u060c\3\2\2\2\u0609\u060b\5\u00f0y\2"+
		"\u060a\u0609\3\2\2\2\u060b\u060e\3\2\2\2\u060c\u060a\3\2\2\2\u060c\u060d"+
		"\3\2\2\2\u060d\u00ef\3\2\2\2\u060e\u060c\3\2\2\2\u060f\u0611\7\u00c9\2"+
		"\2\u0610\u0612\5\u00a8U\2\u0611\u0610\3\2\2\2\u0611\u0612\3\2\2\2\u0612"+
		"\u0613\3\2\2\2\u0613\u0619\7\u00ca\2\2\u0614\u0615\7\u00cb\2\2\u0615\u0616"+
		"\5\u00a8U\2\u0616\u0617\7\u00cc\2\2\u0617\u0619\3\2\2\2\u0618\u060f\3"+
		"\2\2\2\u0618\u0614\3\2\2\2\u0619\u00f1\3\2\2\2\u061a\u061c\5\u00f4{\2"+
		"\u061b\u061a\3\2\2\2\u061b\u061c\3\2\2\2\u061c\u0623\3\2\2\2\u061d\u061f"+
		"\7\u00cd\2\2\u061e\u0620\5\u00f4{\2\u061f\u061e\3\2\2\2\u061f\u0620\3"+
		"\2\2\2\u0620\u0622\3\2\2\2\u0621\u061d\3\2\2\2\u0622\u0625\3\2\2\2\u0623"+
		"\u0621\3\2\2\2\u0623\u0624\3\2\2\2\u0624\u00f3\3\2\2\2\u0625\u0623\3\2"+
		"\2\2\u0626\u062d\5\u00dep\2\u0627\u0628\7_\2\2\u0628\u0629\7\u00c7\2\2"+
		"\u0629\u062a\5\u00f2z\2\u062a\u062b\7\u00c8\2\2\u062b\u062d\3\2\2\2\u062c"+
		"\u0626\3\2\2\2\u062c\u0627\3\2\2\2\u062d\u00f5\3\2\2\2\u062e\u062f\t\24"+
		"\2\2\u062f\u00f7\3\2\2\2\u0630\u0631\t\25\2\2\u0631\u00f9\3\2\2\2\u0632"+
		"\u0633\t\26\2\2\u0633\u00fb\3\2\2\2\u0634\u0635\t\27\2\2\u0635\u00fd\3"+
		"\2\2\2\u0636\u0637\t\30\2\2\u0637\u00ff\3\2\2\2\u0638\u0639\t\31\2\2\u0639"+
		"\u0101\3\2\2\2\u063a\u063b\t\32\2\2\u063b\u0103\3\2\2\2\u00b9\u0105\u010a"+
		"\u0112\u0117\u011e\u0123\u0129\u0137\u013b\u0141\u0146\u014b\u0151\u0155"+
		"\u015b\u0162\u0169\u016e\u0172\u017b\u017e\u0181\u0186\u018a\u018e\u0193"+
		"\u0197\u0199\u019f\u01ab\u01bc\u01c3\u01cb\u01d6\u01de\u01e6\u01ed\u01f4"+
		"\u020b\u0212\u021a\u0224\u022a\u022e\u024c\u0258\u025c\u0265\u0269\u026e"+
		"\u0288\u0293\u0297\u029b\u02a4\u02ae\u02b3\u02b9\u02be\u02c3\u02c8\u02cd"+
		"\u02d3\u02d9\u02df\u02f1\u02f6\u02f9\u0303\u0306\u0313\u031b\u0322\u0325"+
		"\u032a\u032e\u034c\u0350\u0352\u0359\u035d\u0363\u0368\u036b\u036e\u0375"+
		"\u037d\u038a\u0396\u03a2\u03ae\u03b5\u03b9\u03bd\u03c3\u03cb\u03d2\u03d6"+
		"\u03da\u03e7\u03ea\u03f1\u03fb\u03ff\u0404\u0409\u0416\u0420\u0426\u044a"+
		"\u0457\u045c\u045f\u0465\u0482\u0489\u048d\u0493\u0497\u04bd\u04cd\u04cf"+
		"\u04d5\u04dd\u04e4\u04e8\u04ed\u04f2\u04f6\u04ff\u0505\u050b\u050e\u0512"+
		"\u0515\u0519\u0520\u0524\u0527\u0530\u0538\u0541\u0545\u054a\u054f\u0557"+
		"\u0559\u055f\u0561\u0566\u056d\u0573\u057a\u0580\u058a\u058e\u0593\u059b"+
		"\u05a1\u05a8\u05ac\u05b0\u05b7\u05c0\u05c5\u05cb\u05d3\u05d6\u05dc\u05e2"+
		"\u05e8\u05ec\u05f3\u05f8\u05fe\u0607\u060c\u0611\u0618\u061b\u061f\u0623"+
		"\u062c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}