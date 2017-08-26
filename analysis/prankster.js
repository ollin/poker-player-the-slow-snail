#!/usr/bin/env node

const axios = require('axios')
const data = require('./payload.json')
const _ = require('lodash')
// Poker1up obscure-beyond-74265.herokuapp.com
// funkyjokey
const game_state = data

// TODO fix '/action=showdown&game_state=[object%20Object]',
const gameUrl = `http://shielded-bastion-29985.herokuapp.com/action=showdown&game_state=${game_state}`

Promise.all(
  _.range(20)
    .map(() => axios.post(gameUrl))
).then((resps) => resps.map(({data})=> data))
  .then(console.log)
  .catch(console.error)
