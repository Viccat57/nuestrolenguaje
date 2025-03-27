grammar manbel;

programa
    : (instruccion)*
    ;

declaracion : TIPO ID (EQ expr)?;  // Hace el =expr opcional

instruccion
    : declaracion SEMI
    | asig SEMI
    | incremento SEMI
    | expr SEMI
    | def
    | floop
    ;

asig: ID '=' expr;

floop: FOR LPAREN asig? ';' condicion? ';' incremento? RPAREN LCURLY (instruccion)* RCURLY;

def : 'if' LPAREN condicion RPAREN 
    LCURLY (instruccion)* RCURLY 
    (else_if)*
    (else_block)?
    ;

else_if : 'else' 'if' LPAREN condicion RPAREN 
        LCURLY (instruccion)* RCURLY 
        ;

else_block : 'else' 
            LCURLY (instruccion)* RCURLY 
            ;

condicion :
    expr MAYOR expr  
    | expr MENOR expr
    | expr MAYOR_EQ expr
    | expr MENOR_EQ expr
    | expr IGUAL expr
    ;

expr: termino (op=(SUM|REST) termino)*;

incremento: ID SUM SUM | SUM SUM ID;

termino: factor (('*' | '/') factor)*;

factor: NUM 
      | ID 
      | STRING 
      | BOOL 
      | '(' expr ')'  // Paréntesis
      ;

SUM : '+';
REST : '-';
MUL : '*';
DIV : '/';
EQ : '=' ;
COMMA : ',' ;
SEMI : ';' ;
LPAREN : '(' ;
RPAREN : ')' ;
LCURLY : '{' ;
RCURLY : '}' ;
MAYOR : '>';
MENOR : '<';
MAYOR_EQ : '>=';
MENOR_EQ : '<=';
IGUAL : '==';
IF : 'if';
ELSE : 'else';
FOR : 'for';

TIPO : 'int' | 'double' | 'String' | 'boolean' ;
STRING : '"' (~["])* '"' ;
BOOL   : 'true' | 'false' ;
NUM : [0-9]+('.'[0-9]+)? ;
ID: [a-zA-Z_][a-zA-Z_0-9]* ;
WS: [ \t\r\n]+ -> skip;