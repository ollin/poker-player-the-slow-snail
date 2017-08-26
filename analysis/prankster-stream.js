#!/usr/bin/env node

const _ = require('lodash')
const data = require('./payload.json')
const axios = require('axios')
const ost = require('object-stream-tools')

// Poker1up obscure-beyond-74265.herokuapp.com
const gameUrl = `http://shielded-bastion-29985.herokuapp.com/action=showdown`

ost.arrayToStream(_.range(10))
  .pipe(ost.map(() => axios.post(gameUrl, {
        game_state: data
      }).catch(() => console.error('x'))))
  .on('data', (data) => console.log('.'))
  .on('error', console.error)
