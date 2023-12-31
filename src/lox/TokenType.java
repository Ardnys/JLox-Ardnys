package lox;

public enum TokenType {
    // single character tokens
    LPAREN, RPAREN, LSQUIRLY, RSQUIRLY, COMMA,
    DOT, MINUS, PLUS, SEMICOLON, SLASH, STAR,

    // one or two character tokens
    BANG, NOT_EQUAL,
    EQUAL, EQUAL_EQUAL,
    GREATER, GREATER_EQUAL,
    LESS, LESS_EQUAL,

    // literals

    IDENTIFIER, STRING, NUMBER,

    // keywords

    AND, CLASS, ELSE, FALSE, FUN, FOR, IF, NIL, OR,
    PRINT, RETURN, SUPER, THIS, TRUE, VAR, WHILE,

    EOF

}
