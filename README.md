# Stack-Delimiter-Checker
This program checks if parenthesis, braces, and brackets match correctly using a stack data structure 

# DESCRIPTION
This java program uses a Stack to check whether all opening delimiters ' (,{,[ ' have matching closing delimiters ' ),},] ' in the correct order.

# FEATURES 
- Detects missing closing symbols
- Detects extra closing symbols
- Detect mismatch symbols
- shows step by step execution trace

# HOW TO RUN

1. Compile: DelimiterChecker.java
2. Run: DelimiterChecker
3. Enter any expression when prompted

# TEST RESULTS
'()' = VALID
'()[]{}' = VALID
'{([])}' = VALID
'({[]})' = VALID
'{[(])}' = INVALID
'({)]' = INVALID
'{[()]' = INVALID
'{[()]}]' = INVALID
(empty input) = VALID
((a + b)*[c - d]) = VALID

# AUTHOR
WING HAMS J. ABISO
