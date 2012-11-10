if "%1"=="" GOTO DONE
bash -c "/bin/find . -type f -name \"%1\" -exec reformat.sh {} \;"
:DONE