parser grammar CodejiParser;

options { tokenVocab=CodejiLexer; }

program
    : statement* EOF
    ;

statement
    : varDeclarationStatement
    | assignmentStatement
    | printStatement
    | printLineStatement
    | padhleStatement
    | ifStatement
    | whileStatement 
    ;

varDeclarationStatement
    : PATAHAI ID RAKHDO printValue THIKHAI
    ;

assignmentStatement
    : ID RAKHDO printValue THIKHAI
    ;

printStatement
    : BOLNA printArguments THIKHAI
    ;

printLineStatement
    : LIKHNA printArguments THIKHAI
    ;

padhleStatement
    : PADHLE ID THIKHAI
    ;

ifStatement
    : AGAR LPAREN condition RPAREN
      statementBlock
      (NAHI_AGAR LPAREN condition RPAREN statementBlock)*
      (NAHI_TO statementBlock)?
      KHATM
    ;

whileStatement
    : JABTAK LPAREN condition RPAREN
      statementBlock
      KHATM
    ;

statementBlock
    : statement+
    ;

condition
    : expression comparator expression
    ;

comparator
    : BADA
    | CHHOTA
    | BARABAR
    | BADA_YA_BARAABAR
    | CHHOTA_YA_BARAABAR
    | NAHI_BARABAR
    ;

printArguments
    : printPart (COMMA printPart)*
    ;

printPart
    : printValue
    | NAYILINE
    ;

printValue
    : expression
    | STRING
    | SAHIME
    | KUCHNAHI
    ;

expression
    : term ( (JODWA | GHATAWA) term )*
    ;

term
    : factor ( (GUNAK | BATAAK | REMAINDERWA) factor )*
    ;

factor
    : primary (POWERWA factor)?
    ;

primary
    : NUMBER
    | ID
    | LPAREN expression RPAREN
    ;
