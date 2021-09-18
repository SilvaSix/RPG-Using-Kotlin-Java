package game

class Locations {
    var listOfLocations = listOf<String>("Test1" ,
        "test2" ,
        "test3" ,
        "test4" ,
        "test5" ,
        "test6"
    )

    fun randomLocation(): String {
        val lengthOfList = listOfLocations.size - 1
        var randomLocationPosition: Int = (0..lengthOfList).random()
        return listOfLocations.elementAt(randomLocationPosition)
    }
}