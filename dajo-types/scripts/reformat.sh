#!/bin/bash
if [ -z "$1" ]
    then
        echo
        echo "Missing mandatory argument: file.cpp, other.java"
        echo "    * Suggested use: find . -type f -name \"*.cpp\" -exec reformat.sh {} \;"
        echo
        exit 1
fi
sed -i 's,\r,,g' $1     #remove windows line breaks
sed -i 's,\t,    ,g' $1 #remove tabs
sed -i 's/[ ]*$//g' $1  #remove trailing spaces
sed -i /./,/^$/!d $1    #remove duplicated empty lines
