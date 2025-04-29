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
    | mostrar SEMI
    ;

asig: ID '=' expr;

mostrar : MOSTRAR LPAREN expr RPAREN;

floop: 'foopi' LPAREN 
    (declaracion | asig)? ';' 
    condicion? ';' 
    (asig | incremento)?  // Acepta asignaciones o incrementos
    RPAREN 
    LCURLY (instruccion)* RCURLY;

def : 'checa' LPAREN condicion RPAREN
    LCURLY (instruccion)* RCURLY 
    (else_if)*
    (else_block)?
    ;

else_if : 'sino' 'checa' LPAREN condicion RPAREN 
        LCURLY (instruccion)* RCURLY 
        ;

else_block : 'sino' 
            LCURLY (instruccion)* RCURLY 
            ;

condicion :
    expr MAYOR expr  
    | expr MENOR expr
    | expr MAYOR_EQ expr
    | expr MENOR_EQ expr
    | expr IGUAL expr
    ;

expr: 
    termino (op=(SUM|REST) termino)*             # ExpresionAritmetica
    | expr op=(MAYOR|MENOR|MAYOR_EQ|MENOR_EQ|IGUAL) expr  # ExpresionComparacion
    | incremento                                  # ExpresionIncremento 
    ;


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
IF : 'checa';
ELSE : 'sino';
FOR : 'foopi';
MOSTRAR : 'mostrar';
COMMENT : '//' .*? '\n' -> skip;

TIPO : 'enterito' | 'pedacito' | 'texto' | 'bolas' ;
STRING : '"' (~["])* '"' ;
BOOL   : 'neta' | 'falacia' ;
NUM : [0-9]+('.'[0-9]+)? ;
ID: [a-zA-Z_][a-zA-Z_0-9]* ;
WS: [ \t\r\n]+ -> skip;