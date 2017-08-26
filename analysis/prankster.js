#!/usr/bin/env node

const axios = require('axios')
const data = require('./payload.json')

const lodash = require('lodash')
// Poker1up obscure-beyond-74265.herokuapp.com
// funkyjokey
const game_state = data

console.log(game_state.pot)
const gameUrl = `http://shielded-bastion-29985.herokuapp.com/action=showdown&game_state=${game_state}`

axios.post(gameUrl)
  .then(console.log)
  .catch(console.error)
