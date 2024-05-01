#!/bin/bash

INPUT_DIR=$1
OUTPUT_DIR=$2

find "$INPUT_DIR" -type f -exec cp {} "$OUTPUT_DIR" \; 
