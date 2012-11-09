if "%1"=="" GOTO DONE
bash -c "find . -type f -name \"%1\" -exec reformat.sh {} \;"
:DONE