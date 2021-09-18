package game

class Locations {
    var listOfLocations = listOf<String>(
        //infested badlands are for zombies, maybe percentage of types of enemies
        "Infested Badlands",
        //great for bandits
        "Hideout",
        //great for spiders
        "grassland or deserts",
        //orcs live here
        "Underground caves",
        //trolls live here
        "Mountains",
        //where vampires live
        "Catacombs",
        //where the werewolves live
        "Transdanubia"
    )

    fun randomLocation(): String {
        val lengthOfList = listOfLocations.size - 1
        var randomLocationPosition: Int = (0..lengthOfList).random()
        return listOfLocations.elementAt(randomLocationPosition)
    }
}