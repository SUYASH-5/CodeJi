lexer grammar CodejiLexer;

// Keywords
PADHLE : 'padhle';
LIKHNA: 'likhna';          // println-style
NAYILINE: 'nayiLine';      // manual newline inside bolna
PATAHAI: 'pataHai';               // variable declaration
RAKHDO: 'rakhDo';                 // assignment
BOLNA: 'bolna';                   // print
THIKHAI: 'thikHai';               // end of statement
SAHIME: 'sahiMe';                 // true
KUCHNAHI: 'kuchNahi';             // false

// Control flow keywords 
AGAR: 'agar';                    // if
NAHI_AGAR: 'nahi_agar';          // else if
NAHI_TO: 'nahi_to';              // else
KHATM: 'khatm';                  // end if block
JABTAK: 'jabtak';

// Arithmetic Operators 
JODWA: 'jodwa';                   // +
GHATAWA: 'ghatawa';               // -
GUNAK: 'gunak';                   // *
BATAAK: 'bataak';                 // /
REMAINDERWA: 'remainderwa';       // %
POWERWA: 'powerwa';               // **

// Comparators
BADA: 'bada';                    // >
CHHOTA: 'chhota';                // <
BARABAR: 'barabar';              // ==
BADA_YA_BARAABAR: 'bada_ya_barabar';    // >=
CHHOTA_YA_BARAABAR: 'chhota_ya_barabar';// <=
NAHI_BARABAR: 'nahi_barabar';    // !=

// Symbols
LPAREN: '(';
RPAREN: ')';
COMMA: ',';

// String literals
STRING: '"' (ESC | ~["\\])* '"';
fragment ESC: '\\' (["\\/bfnrt] | UNICODE);
fragment UNICODE: 'u' HEX HEX HEX HEX;
fragment HEX: [0-9a-fA-F];

// Numeric literals
NUMBER: INT ('.' [0-9]+)? EXP?;
fragment INT: '0' | [1-9] [0-9]*;
fragment EXP: [Ee] [+\-]? [0-9]+;

// Identifiers
ID: [a-zA-Z_] [a-zA-Z0-9_]*;

// Whitespace and comments
WS: [ \t\r\n]+ -> skip;
LINE_COMMENT: '//' ~[\r\n]* -> skip;
BLOCK_COMMENT: '/*' .*? '*/' -> skip;
