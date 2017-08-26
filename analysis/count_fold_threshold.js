// nodemon -w ./ -x 'cat count_fold_threshold.js | node -p'
const response = require('./logdump.json')
const threshold = require('./threshold')

// Poker1Up
// funkyjokey (id:0)
response
  .map(({ type, game_state: { players } }) =>
    ({
      type,
      players: players.filter(e => e.id === 0)
    }))
