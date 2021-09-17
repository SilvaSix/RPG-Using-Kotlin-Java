package game

import mobs.Enemy
import java.util.concurrent.TimeUnit

// I am not using this class.  It is currently used as a reference for the combat class.


class Attack {
    //for future methods like if dodge do this if hit have a chance to do this
    private var playerAttackedSuccessfully = true
    private var playerDefendedSuccessfully = true
    private var enemyAttackedSuccessfully = true
    private var enemyDefendedSuccessfully = true

    //added while loop if enemy is alive to keep fight going until enemy is dead

    //attack method and damage method
    //add an option to run away if requested

    fun playerAttack(playerAccuracy: Int, enemyDefense: Int, newPlayer: Player, newEnemy: Enemy) {
        var playerAccuracy = playerAccuracy
        var enemyDefense = enemyDefense
        while (newEnemy.hitPoints!! > 0) {
            var random20: Int = (0..20).random()
            var secondRandom20: Int = (0..20).random()
            playerAccuracy = newPlayer.accuracy!! + random20
            enemyDefense = newEnemy.defense!! + secondRandom20
            if (playerAccuracy >= enemyDefense) {
                playerAttackedSuccessfully = true
                enemyDefendedSuccessfully = false
                println(newEnemy.name + " hit-points before hit " +  newEnemy.hitPoints )
                newEnemy.hitPoints = newEnemy.hitPoints!! - newPlayer.damageOut!!
                println("You hit the target!")
                println("You hit the enemy for: " + newPlayer.damageOut)
            } else {
                playerAttackedSuccessfully = false
                enemyDefendedSuccessfully = true
                println("You missed the target!")
            }
            println("player accuracy: $playerAccuracy")
            println("enemy defense: $enemyDefense")
            println(newEnemy.name + "'s, current hit-points is " + newEnemy.hitPoints)
            //TimeUnit.SECONDS.sleep(1)
        }
    }

    fun enemyAttack(playerDefense: Int, enemyAttack: Int, newPlayer: Player, newEnemy: Enemy){
        var playerDefense = playerDefense
        var enemyAttack = enemyAttack
        while(newPlayer.hitPoints!! > 0) {
            var random20: Int = (0..20).random()
            var secondRandom20: Int = (0..20).random()
            playerDefense = newPlayer.defense!! + random20
            enemyAttack = newEnemy.accuracy!! + secondRandom20
            if(enemyAttack >= playerDefense) {
                playerDefendedSuccessfully = false
                enemyAttackedSuccessfully = true
                println(newPlayer.name + " hit-points before the hit " + newPlayer.hitPoints)
                newPlayer.hitPoints = newPlayer.hitPoints!! - newEnemy.damageOut!!
                println("You have been hit, aghhh!!!")
                println("You have been hit for: " + newEnemy.damageOut)
            }else {
                playerDefendedSuccessfully = true
                enemyAttackedSuccessfully = false
                println("You dodged an attack, phew!!!")
            }
            println("player defense: $playerDefense")
            println("enemy accuracy: $enemyAttack")
            println(newEnemy.name + "'s, current hit-points is " + newEnemy.hitPoints)
            TimeUnit.SECONDS.sleep(1)

            }
        }
    }

