#!/usr/bin/env bash

node node_modules/nodemon/bin/nodemon.js -w ./ -x 'cat  count_fold_threshold.js | node -p'
