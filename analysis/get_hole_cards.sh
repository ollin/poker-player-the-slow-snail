#!/bin/bash

# pull data from logserver, add URL as argument

log=$1

curl $log | zcat > logdump.json
