package game

import Mobs.Enemy
import java.util.concurrent.TimeUnit

class Combat {
    val ANSI_RED = "\u001B[31m"
    val ANSI_RESET = "\u001B[0m"
    val ANSI_YELLOW = "\u001B[33m"
    val ANSI_PURPLE = "\u001B[35m"
    val ANSI_GREEN = "\u001B[32m"



    private var playerAttackedSuccessfully = true
    private var playerDefendedSuccessfully = true
    private var enemyAttackedSuccessfully = true
    private var enemyDefendedSuccessfully = true

    fun startFight(playerAccuracy: Int, enemyDefense: Int, playerDefense: Int, enemyAttack: Int, newPlayer: Player, newEnemy: Enemy){
        var playerAccuracy = playerAccuracy
        var enemyDefense = enemyDefense
        var playerDefense = playerDefense
        var enemyAttack = enemyAttack
        if(newPlayer.hitPoints!! > 0){
        while (newEnemy.hitPoints!! > 0 && newPlayer.hitPoints!! > 0) {
            var random20: Int = (0..20).random()
            var secondRandom20: Int = (0..20).random()
            var thirdRandom20: Int = (0..20).random()
            var forthRandom20: Int = (0..20).random()
            playerAccuracy = newPlayer.accuracy!! + random20
            enemyDefense = newEnemy.defense!! + secondRandom20
            if (playerAccuracy >= enemyDefense) {
                playerAttackedSuccessfully = true
                enemyDefendedSuccessfully = false
                println(newEnemy.name + " hit-points before hit " +  newEnemy.hitPoints )
                newEnemy.hitPoints = newEnemy.hitPoints!! - newPlayer.damageOut!!
                println(ANSI_YELLOW + "You hit the enemy for: " + newPlayer.damageOut + ANSI_RED + "  " + newEnemy.name + "'s, current hit-points is " + newEnemy.hitPoints + ANSI_RESET)
            } else {
                playerAttackedSuccessfully = false
                enemyDefendedSuccessfully = true
                println("You missed the target!")
            }
            println(ANSI_GREEN + "Thinking**********************************************************************************************" + ANSI_RESET)
            TimeUnit.SECONDS.sleep(1)

            if(newPlayer.hitPoints!! > 0 && newEnemy.hitPoints!! > 0) {
                var thirdRandom20: Int = (0..20).random()
                var forthRandom20: Int = (0..20).random()
                playerDefense = newPlayer.defense!! +thirdRandom20
                enemyAttack = newEnemy.accuracy!! + forthRandom20
                if(enemyAttack >= playerDefense) {
                    playerDefendedSuccessfully = false
                    enemyAttackedSuccessfully = true
                    println(newPlayer.name + " hit-points before the hit " + newPlayer.hitPoints)
                    newPlayer.hitPoints = newPlayer.hitPoints!! - newEnemy.damageOut!!
                    println("You have been hit, aghhh!!!")
                    println(ANSI_YELLOW  + "You have been hit for: " + newEnemy.damageOut + ANSI_PURPLE +"  Your health is now " +newPlayer.hitPoints + "!"  + ANSI_RESET)
                }else {
                    playerDefendedSuccessfully = true
                    enemyAttackedSuccessfully = false
                    println("You dodged an attack, phew!!!")
                }
                //println("player defense: $playerDefense")
                //println("enemy accuracy: $enemyAttack")
                //println("player defense: $playerAccuracy")
                //println("enemy accuracy: $enemyDefense")
                println(ANSI_RED + "Enemy Health: " + newEnemy.hitPoints)
                println(ANSI_PURPLE + "Player Health: " + newPlayer.hitPoints + ANSI_RESET)
                println(ANSI_GREEN + "Thinking**********************************************************************************************" + ANSI_RESET)
                TimeUnit.SECONDS.sleep(1)
            }
        }
    }
        if(newPlayer.hitPoints!! > 0) { println("You won, wow congratulations!")} else { println("You Lose!  HaHa")}
    }
}


