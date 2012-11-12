@echo off
if "%1"=="" (
    echo Missing arguments
    GOTO DONE
    )

bash -c "reformatAll.sh \"%1\"

:DONE
 