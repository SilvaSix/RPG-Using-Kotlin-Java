import Mobs.*
import game.Attack
import game.Combat
import game.Player

fun main(){
    val newCombat = Combat()
    var newPlayer = Player()
    var newZombie = Zombie()


    newCombat.startFight(newPlayer.accuracy!!, newZombie.defense!!, newPlayer.defense!!, newZombie.accuracy!!, newPlayer, newZombie)


}