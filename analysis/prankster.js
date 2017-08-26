#!/usr/bin/env node

const axios = require('axios')
const data = require('./payload.json')
const _ = require('lodash')
// Poker1up obscure-beyond-74265.herokuapp.com
// funkyjokey
const gameUrl = `http://shielded-bastion-29985.herokuapp.com/action=showdown`

const axiosSucks = ({ data }) => 'ok:' + data

Promise.all(
  _.range(1000)
    .map(
      () => axios.post(gameUrl, {
        game_state: data
      }).then(axiosSucks)
        .catch(axiosSucks))
).then(console.log)
