#!/usr/bin/env bash

while true; do curl -s $(./getLastGameLog.js ) | tail 2>/dev/null; sleep 2 ; done
