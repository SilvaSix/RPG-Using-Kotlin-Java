import Mobs.*

import game.Combat
import game.Player

fun main(){
    val newCombat = Combat()
    var newPlayer = Player()
    var newZombie = Zombie()

    // this will run an automatic combat between the enemy and play instance we have created above
    newCombat.startFight(newPlayer.accuracy!!, newZombie.defense!!, newPlayer.defense!!, newZombie.accuracy!!, newPlayer, newZombie)


}