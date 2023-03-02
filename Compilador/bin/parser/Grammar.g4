grammar Grammar
	;
import Lexicon
	;

start: definitions* mainFunction
       ;

definitions: defVar | defStruct | defFunc
    ;

defFunc: IDENT '('(IDENT ':' type(',' IDENT ':' type)*)?')' (':' type)?  '{' statements* '}'
;

mainFunction: 'main' '('')''{' statements* '}'
;

defVar: 'var' variable ';'
 ;

defStruct: 'struct' IDENT '{' (variable ';')* '}' ';';

variable: IDENT ':' ('[' INT_CONSTANT ']')* type ;//cambiar

var: IDENT ('[' (INT_CONSTANT | IDENT) ']')* ('.' var)* //cambiar
;

statements: 
        defVar
        | 'return' expression* ';'
        | 'if' '(' expression* ')' '{' statements* '}' ('else' '{' statements* '}' )?
        | 'while' '(' expression* ')' '{' statements* '}'
        | 'printsp' var ';' //cambiar
        | 'println' expression ';'
        | 'read' var ';'
        | expression '=' expression ';'
        | IDENT '(' (expression (',' expression)*)? ')' ';'
        ;
expression: IDENT '(' (expression (',' expression)*)? ')'
        | INT_CONSTANT
        | CHAR_CONSTANT
        | REAL_CONSTANT
        | IDENT
        | '(' expression ')'
        | '[' expression ']'
        | expression '[' expression ']'
        | expression '.' expression
        | expression'as' type
        | '-' expression
        | '!' expression
        | '<' type '>' '(' expression ')'
        | expression '=' expression 
        | expression ('*'| '/' | '%') expression
        | expression ('+'| '-') expression
        | expression ('>'| '>=' | '<'| '<=' | '!='| '==') expression
        | expression ('&&'| '||') expression
        ;



type: 'int'
    |'char'
    |'float'
    | IDENT //Cambiar
;


