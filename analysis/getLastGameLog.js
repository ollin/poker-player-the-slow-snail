#!/usr/bin/env node

const axios = require('axios')
const lodash = require('lodash')

const baseUrl = 'http://lumber.leanpoker.org/logs/tournament/'
const gameUrl = 'http://lumber.leanpoker.org/logs/tournament/599b4b5f8042500004000002/team/poker-player-the-slow-snail/log'
axios.get(gameUrl)
  .then(({ data }) => data)
  .then(html => html.split('<a href="').pop().split('">').shift())
  .then(url => baseUrl+console.log)