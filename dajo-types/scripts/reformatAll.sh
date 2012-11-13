#!/bin/bash
#o you can use $(nproc) if available
NUMBER_OF_CORES=$(cat /proc/cpuinfo| grep processor | wc -l)
echo number of cores: $NUMBER_OF_CORES
echo files: $1
/bin/find . -type f -name $1 | xargs -P $NUMBER_OF_CORES -n 1 reformat.sh