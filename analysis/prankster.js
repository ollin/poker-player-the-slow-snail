#!/usr/bin/env node

const axios = require('axios')
const data = require('./package.json')

const lodash = require('lodash')
const baseUrl = 'XXX'

axios.post(gameUrl, data)
  .then(({ data }) => data)
  // .then(html => html.split('<a href="').pop().split('">').shift())
  // .then(url => baseUrl+url)
  .then(console.log)
  .catch(console.error)
