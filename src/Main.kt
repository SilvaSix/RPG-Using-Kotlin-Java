import mobs.*

import game.Combat
import game.Rest
import game.locations.Locations
import game.Player

fun main(){
    val newCombat = Combat()
    var newPlayer = Player()
    var newPlayer2 = Player()
    var newZombie = Zombie()
    var newZombie2 = Zombie()
    var newZombie3 = Zombie()
    var newSpider = Spider()
    var locationChooser = Locations()
    var newRest = Rest()
    newRest.playerRest(newPlayer)

}