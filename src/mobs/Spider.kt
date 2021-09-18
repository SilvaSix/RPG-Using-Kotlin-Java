package mobs

class Spider() : Enemy() {
    //private var _name = npcNames.randomNpcName()
    private var _hitPoints = 50
    private var _accuracy = 110
    private var _defense = 85
    private var _damageOut = 15
    private var _alive = true

    /*override var name: String?
        get() {
            return _name
        }
        set(value) {
            if (value != null) {
                _name = value
            }
        }

     */

    override var hitPoints: Int?
        get() {
            return _hitPoints
        }
        set(value) {
            if (value != null) {
                _hitPoints = value
            }
        }

    override var accuracy: Int?
        get() {
            return _accuracy
        }
        set(value) {
            if (value != null) {
                _accuracy = value
            }
        }

    override var defense: Int?
        get() {
            return _defense
        }
        set(value) {
            if (value != null) {
                _defense = value
            }
        }

    override var damageOut: Int?
        get() {
            return _damageOut
        }
        set(value) {
            if (value != null) {
                _damageOut = value
            }
        }

    override var alive: Boolean?
        get() {
            return _alive
        }
        set(value) {
            if (value != null) {
                _alive = value
            }

        }
}