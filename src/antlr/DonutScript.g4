/* 
*  (c) FlashContent 2023
*  DonutScript Grammar
*  Made with Java and ANTLR v4
*/

grammar DonutScript;

@header {
    import donut.*;
}

ID : [a-zA-Z_] [a-zA-Z0-9_]* ;
INT : [0-9]+ ;
FLOAT : [0-9]+ '.' [0-9]* ;
STRING : '"' .*? '"' ;

PLUS : '+' ;
MINUS : '-' ;
MULT : '*' ;
DIV : '/' ;

EQUAL : '==' ;
NOTEQUAL : '!=' ;
ASSIGN : '=' ;

LBRACE : '{' ;
RBRACE : '}' ;
LPAREN : '(' ;
RPAREN : ')' ;
LSQUARE : '[' ;
RSQUARE : ']' ;

COMMA : ',' ;
DOT : '.' ;
COLON : ':' ;
SEMICOLON : ';' ;

// Define Parser rules
program : classDeclaration EOF ;

classDeclaration : 'class' ID ':' functionDeclaration+ 'end' ;

functionDeclaration : 'fun' ID LPAREN (ID COLON type (COMMA ID COLON type)*)? RPAREN (':' type)? blockStatement ;

blockStatement : LBRACE statement* RBRACE ;

statement : variableDeclaration SEMICOLON
          | printStatement SEMICOLON
          | printlnStatement SEMICOLON
          | ifStatement
          | functionCall SEMICOLON
          | commentStatement ;

variableDeclaration : ID (ASSIGN expression)? ;

printStatement : 'print' expression ;

printlnStatement : 'println' expression ;

ifStatement : 'if' expression blockStatement (elseIfStatement | elseStatement)? 'end' ;

elseIfStatement : 'else' 'if' expression blockStatement ;

elseStatement : 'else' blockStatement ;

switchStatement : 'switch' 'with' blockStatement (caseStatement | defaultStatement)+ 'end' ;

caseStatement : 'case' expression COLON blockStatement ;

defaultStatement : 'default' COLON blockStatement ;

functionCall : ID LPAREN (expression (COMMA expression)*)? RPAREN ;

commentStatement : '-*' .*? '-*' ;

expression : expression OR expression2 | expression2 ;

expression2 : expression2 AND expression3 | expression3 ;

expression3 : expression4 EQUAL expression4 | expression4 NOTEQUAL expression4 | expression4 ;

expression4 : expression5 PLUS expression5 | expression5 MINUS expression5 | expression5 ;

expression5 : expression6 MULT expression6 | expression6 DIV expression6 | expression6 ;

expression6 : LPAREN expression RPAREN | ID | literal ;

literal : INT | FLOAT | STRING | list ;

list : LSQUARE (expression (COMMA expression)*)? RSQUARE ;

type : 'int' | 'float' | 'string' ;

WS : [ \t\r\n]+ -> skip ;
