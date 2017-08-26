#!/usr/bin/env node

const axios = require('axios')
const data = require('./payload.json')

const lodash = require('lodash')
// Poker1up obscure-beyond-74265.herokuapp.com
// funkyjokey
const gameUrl = 'http://shielded-bastion-29985.herokuapp.com'

axios.post(gameUrl, data)
  .then(({ data }) => '.' + data)
  .then(console.log)
  .catch(console.error)
