/* 
*  (c) FlashContent 2023
*  DonutScript Grammar
*  Made with Java and ANTLR v4
*/

grammar DonutScript;

program
    : var EOF
    | def EOF
    | fun EOF
    ;

fun: FUN def LPAREN def RPAREN;

var: VAR def EQ def;

def: ID;

PLUS: '+';
MINUS: '-';
MULT: '*';
DIV: '/';
LPAREN: '(';
RPAREN: ')';
LBRACK: '{';
RBRACK: '}';
EQ: '=';
COLON: ':';
SEMI: ';';

VAR: 'var';
FUN: 'fun';
PRINT: 'print';

INT : [0-9]+ ;
ID: [a-zA-Z_][a-zA-Z_0-9]* ;
WS: [ \t\n\r\f]+ -> skip ;