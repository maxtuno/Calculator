/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
grammar Calculator;

prog
    : stat+
    ;

stat
    : expr NEWLINE  # PrintExpression
    | ID EQ expr NEWLINE # AssignExpression
    | NEWLINE # BlankExpression
    ;

expr
    : expr MUL expr # MulExpression
    | expr DIV expr # DivExpression
    | expr ADD expr # AddExpression
    | expr SUB expr # SubExpression
    | INT           # IntExpression
    | ID            # IDExpression
    | LEFT expr RIGTH  # ParentizedExpression
    ;

MUL
    : '*'
    ;

DIV
    : '/'
    ;

ADD
    : '+'
    ;

SUB
    : '-'
    ;

EQ
    : '='
    ;

ID
    : [a-zA-Z]+
    ;

INT
    : [0-9]+
    ;

LEFT
    : '('
    ;

RIGTH
    : ')'
    ;

NEWLINE
    : '\r'? '\n'
    ;

WS
    : [ \t]+ -> skip
    ;