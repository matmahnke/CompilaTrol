package Interface;

public interface ParserConstants
{
    int START_SYMBOL = 40;

    int FIRST_NON_TERMINAL    = 40;
    int FIRST_SEMANTIC_ACTION = 67;

    int[][] PARSER_TABLE =
    {
        { -1,  0, -1, -1, -1, -1, -1, -1,  0, -1, -1,  0, -1, -1, -1, -1, -1, -1, -1,  0, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1,  1, -1, -1, -1, -1, -1, -1,  1, -1, -1,  1, -1, -1, -1, -1, -1, -1, -1,  1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        {  3,  2, -1, -1, -1, -1, -1, -1,  2,  3,  3,  2,  3, -1, -1, -1, -1, -1, -1,  2, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1,  4, -1, -1, -1, -1, -1, -1,  6, -1, -1,  7, -1, -1, -1, -1, -1, -1, -1,  5, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,  8,  9, 10 },
        { -1, 11, 11, 11, 11, -1, -1, 11, -1, -1, -1, -1, -1, 11, 11, 12, 12, 12, 12, -1, 11, -1, -1, -1, -1, -1, -1, -1, 11, 11, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 13, 14, 14, 14, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, 15, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 16, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 17, 18, 19, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 20, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, 21, 21, 21, 21, -1, -1, 21, -1, -1, -1, -1, -1, 21, 21, -1, -1, -1, -1, -1, 21, -1, -1, -1, -1, -1, -1, -1, 21, 21, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 23, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 22, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, 24, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, 25, 26, -1, 26, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 27, -1, 28, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 29, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, 30, 30, 30, 30, -1, -1, 30, -1, -1, -1, -1, -1, 30, 30, -1, -1, -1, -1, -1, 30, -1, -1, -1, -1, -1, -1, -1, 30, 30, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { 33, 33, -1, -1, -1, 31, 32, -1, 33, 33, 33, 33, 33, -1, -1, -1, -1, -1, -1, 33, -1, 33, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 33, 33, -1, -1, -1 },
        { -1, 34, 34, 34, 34, -1, -1, 37, -1, -1, -1, -1, -1, 36, 35, -1, -1, -1, -1, -1, 34, -1, -1, -1, -1, -1, -1, -1, 34, 34, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, 38, 38, 38, 38, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 38, -1, -1, -1, -1, -1, -1, -1, 38, 38, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { 40, 40, -1, -1, -1, 40, 40, -1, 40, 40, 40, 40, 40, -1, -1, -1, -1, -1, -1, 40, -1, 40, 39, 39, 39, 39, 39, 39, -1, -1, -1, -1, -1, -1, 40, 40, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 41, 42, 43, 44, 45, 46, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, 47, 47, 47, 47, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 47, -1, -1, -1, -1, -1, -1, -1, 47, 47, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { 50, 50, -1, -1, -1, 50, 50, -1, 50, 50, 50, 50, 50, -1, -1, -1, -1, -1, -1, 50, -1, 50, 50, 50, 50, 50, 50, 50, 48, 49, -1, -1, -1, -1, 50, 50, -1, -1, -1 },
        { -1, 51, 51, 51, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 51, -1, -1, -1, -1, -1, -1, -1, 51, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { 56, 56, -1, -1, -1, 56, 56, -1, 56, 56, 56, 56, 56, -1, -1, -1, -1, -1, -1, 56, -1, 56, 56, 56, 56, 56, 56, 56, 56, 56, 52, 53, 54, 55, 56, 56, -1, -1, -1 },
        { -1, 57, 58, 59, 60, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 61, -1, -1, -1, -1, -1, -1, -1, 62, 63, -1, -1, -1, -1, -1, -1, -1, -1, -1 }
    };

    int[][] PRODUCTIONS = 
    {
        {  82,  41,  83 },
        {  43,  42 },
        {  41 },
        {   0 },
        {   2,  89,  44 },
        {  49 },
        {  52 },
        {  55 },
        {  37,  45 },
        {  38,  90,  56, 103 },
        {  39,  90,  56, 103 },
        {  56,  91 },
        {  46 },
        {  92,  16,  21,  47,  22,  93 },
        {  48,  92,  21,  16,  21,  47,  22,  22,  93 },
        {   5,  88,  81 },
        {   0 },
        {  17 },
        {  18 },
        {  19 },
        {  20,  21,  50,  22 },
        {  56,  81,  51 },
        {  35,  50 },
        {   0 },
        {   9,  56,  94,  36,  41,  53,  54,  13,  95 },
        {  96,  10,  56,  97,  36,  41,  53 },
        {   0 },
        {  98,  11,  36,  41 },
        {   0 },
        {  99,  12,  56, 100,  36,  41,  13, 101 },
        {  58,  57 },
        {   6,  58,  84,  57 },
        {   7,  58,  85,  57 },
        {   0 },
        {  59 },
        {  15,  78 },
        {  14,  79 },
        {   8,  58,  80 },
        {  62,  60 },
        {  61,  76,  62,  77 },
        {   0 },
        {  23 },
        {  24 },
        {  25 },
        {  26 },
        {  27 },
        {  28 },
        {  64,  63 },
        {  29,  64,  68,  63 },
        {  30,  64,  69,  63 },
        {   0 },
        {  66,  65 },
        {  31,  66,  70,  65 },
        {  32,  66,  71,  65 },
        {  33,  66,  86,  65 },
        {  34,  66,  87,  65 },
        {   0 },
        {   2, 102 },
        {   3,  72 },
        {   4,  73 },
        {   5,  88 },
        {  21,  56,  22 },
        {  29,  66,  74 },
        {  30,  66,  75 }
    };

    String[] PARSER_ERROR
            = {
                "",
                "esperado EOF", //"Era esperado fim de programa",
                "esperado identificador", //Era esperado id", 
                "esperada constante", //"Era esperado cint",   //constante
                "esperada constante", //"Era esperado cfloat", //constante
                "esperada constante", //"Era esperado cstr",  //constante
                "esperado and", //"Era esperado and",
                "esperado or", //"Era esperado or",
                "esperado not", //"Era esperado not",
                "esperado if", //"Era esperado if",
                "esperado elif", //"Era esperado elif",
                "esperado else", //"Era esperado else",
                "esperado while", //"Era esperado while",
                "esperado end", //"Era esperado end",
                "esperada constante", //"Era esperado false",   //constante
                "esperada constante", //"Era esperado true",   //constante
                "esperado input", //"Era esperado input",
                "esperado tipo", //"Era esperado int",    //tipo
                "esperado tipo", //"Era esperado float",    //tipo
                "esperado tipo", //"Era esperado str",    //tipo
                "esperado print", //"Era esperado print",
                "esperado (", //"Era esperado \"(\"",
                "esperado )", //"Era esperado \")\"",
                "esperado ==", //"Era esperado \"==\"",
                "esperado !=", //"Era esperado \"!=\"",
                "esperado <", //"Era esperado \"<\"",
                "esperado <=", //"Era esperado \"<=\"",
                "esperado >", //"Era esperado \">\"",
                "esperado >=", //"Era esperado \">=\"",
                "esperado +", //"Era esperado \"+\"",
                "esperado -", //"Era esperado \"-\"",
                "esperado *", //"Era esperado \"*\"",
                "esperado /", //"Era esperado \"/\"",
                "esperado //", //"Era esperado \"//\"",
                "esperado &", //"Era esperado \"%\"",
                "esperado ,", //"Era esperado \",\"",
                "esperado :", //"Era esperado \":\"",
                "esperado =", //"Era esperado \"=\"",
                "esperado +=", //"Era esperado \"+=\"",
                "esperado -=", //"Era esperado \"-=\"",
                "esperado id, if, while, print",//"<programa> inv�lido",
                "esperado id, if, while, print",//"<lista_comandos> inv�lido",
                "esperado EOF, id, if, elif, else, while, end, print",//"<lista_comandos1> inv�lido",
                "esperado id, if, while, print",//"<comando> inv�lido",
                "esperado =, +=, -=",//"<comando1> inv�lido",
                "esperado identificador, tipo, constante, not, input, (, +, -", //"<comando2> inv�lido",
                "esperado input, tipo",//"<entrada_dados1> inv�lido",
                "esperado constante str, )",//"<entrada> inv�lido",
                "esperado tipo", //"<tipo> inv�lido",
                "esperado print",//"<saida_dados> inv�lido",
                "esperada uma expressão", //"<lista_expressoes> inv�lido",
                "esperado ), ','", //"<lista_expressoes1> inv�lido",
                "esperado if",//"<selecao> inv�lido",
                "esperado elif, else, end",//"<senao_se> inv�lido",
                "esperado else, end",//"<senao> inv�lido",
                "esperado while",//"<repeticao> inv�lido",
                "esperado uma expressão",//"<expressao> inv�lido",
                "esperado uma expressão",//"<expressao_> inv�lido", // espressao
                "esperado uma expressão",//"<elemento> inv�lido", // espressao
                "esperado uma expressão",//"<relacional> inv�lido", // espressao
                "esperado uma expressão",//"<relacional1> inv�lido", // espressao
                "esperado uma expressão",//"<operador_relacional> inv�lido", // espressao
                "esperado uma expressão",//"<aritmetica> inv�lido", // espressao
                "esperado uma expressão",//"<aritmetica_> inv�lido",  // espressao
                "esperado uma expressão",//"<termo> inv�lido",  // espressao
                "esperado uma expressão",//"<termo_> inv�lido",  // espressao
                "esperado uma expressão",//"<fator> inv�lido"  // espressao
            };
}
