const response = require('./logdump.json')
const threshold = require('./threshold')

console.log(threshold)
/*
response.map(({ game_state: { players } }) => {
	return players
})
.map((players) => {
	return players.map(({ name, id, hole_cards }) => {
		return {
			name,
			id,
			hole_cards
		}
	})
})
*/
/*
.map(({ name, id }) => {
	console.log(`${name} has ${id}`)
})
*/
