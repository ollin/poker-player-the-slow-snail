#!/usr/bin/env node

const axios = require('axios')
const data = require('./payload.json')
const _ = require('lodash')
// Poker1up obscure-beyond-74265.herokuapp.com
// funkyjokey
const gameUrl = `http://shielded-bastion-29985.herokuapp.com/action=showdown`

Promise.all(
  _.range(1000)
    .map(
      () => axios.post(gameUrl, {
        game_state: data
      }).then(({ data }) => 'ok:' + data)
        .catch(({ data }) => 'err:' + data.split('error-pages').pop()))
).then(console.log)
