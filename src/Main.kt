import mobs.*

import game.Combat
import game.Player
import names.NPCNames

fun main(){
    val newCombat = Combat()
    var newPlayer = Player()
    var newZombie = Zombie()
    var newZombie2 = Zombie()
    var newZombie3 = Zombie()
    var npcNames = NPCNames()
    var newSpider = Spider()


    // this will run an automatic combat between the enemy and play instance we have created above
    //newCombat.startFight(newPlayer.accuracy!!, newZombie.defense!!, newPlayer.defense!!, newZombie.accuracy!!, newPlayer, newZombie)


    println(newZombie.name)
    println(newZombie2.name)
    println(newZombie3.name)
    println(newSpider.name)



}