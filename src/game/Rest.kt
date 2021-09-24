package game

class Rest {
    //add a tick method for over heal to tick down health to max
    fun playerRest(newPlayer: Player){
        if(newPlayer.hitPoints!! < newPlayer.maxHitPoints!!){
            newPlayer.hitPoints = newPlayer.hitPoints!! + 20
            println("You healed, your hitpoints is now " + newPlayer.hitPoints)
        }else {
            println("You can't do that right now")
        }
        //var overHealed = newPlayer.hitPoints
        while(newPlayer.hitPoints!! > newPlayer.maxHitPoints!!){
            newPlayer.hitPoints = newPlayer.hitPoints!! -1
            println("Player was over healed, -1hp")
    }

}
}