package game.locations

import game.Combat
import mobs.Enemy

open class Locations {

    var newCombat = Combat()
    var newEnemy = Enemy()

    var listOfLocations = listOf<String>(
        "Infested Badlands", //infested badlands are for zombies, maybe percentage of types of enemies
        "Hideout", //great for bandits
        "grassland or deserts",  //great for spiders
        "Underground caves",  //orcs live here
        "Mountains",  //trolls live here
        "Catacombs",    //where vampires live
        "Transdanubia"    //where the werewolves live
    )

    private var _playerChoice = "Rest"
        var playerChoice: String?
             get() {
            return _playerChoice
             }
             set(value) {
                  if (value != null) {
                     _playerChoice = value
                  }
             }

    fun randomLocation(): String {
        val lengthOfList = listOfLocations.size - 1
        var randomLocationPosition: Int = (0..lengthOfList).random()
        return listOfLocations.elementAt(randomLocationPosition)
    }

    var listOfChoices = listOf<String>("Rest", "Fight", "Travel", "Continue", "Hunt", "Random")

}