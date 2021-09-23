package mobs

class Spider() : Enemy() {
    //private var _name = npcNames.randomNpcName()
    private var _hitPoints = 50
    private var _accuracy = 110
    private var _defense = 85
    private var _damageOut = 15
    private var _alive = true
    private var _energy = 100

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

    override var energy: Int?
        get() {
            return _energy
        }
        set(value) {
            if (value != null) {
                _energy = value
            }
        }
}