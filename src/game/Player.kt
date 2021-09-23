package game

class Player() {
    private var _name = "Knight Silva"
    private var _hitPoints = 100
    private var _accuracy = 100
    private var _defense = 100
    private var _damageOut = 10
    private var _alive = true
    private var _energy = 100


    open fun angryTaunt(){
        println("I am $name, I will defeat you... you bad boy!!!")
    }

    open var name: String?
        get() {
            return _name
        }
        set(value) {
            if (value != null) {
                _name = value
            }
        }

    open var hitPoints: Int?
        get() {
            return _hitPoints
        }
        set(value) {
            if (value != null) {
                _hitPoints = value
            }
        }

    open var accuracy: Int?
        get() {
            return _accuracy
        }
        set(value) {
            if (value != null) {
                _accuracy = value
            }
        }

    open var defense: Int?
        get() {
            return _defense
        }
        set(value) {
            if (value != null) {
                _defense = value
            }
        }

    open var damageOut: Int?
        get() {
            return _damageOut
        }
        set(value) {
            if (value != null) {
                _damageOut = value
            }
        }

    open var alive: Boolean?
        get() {
            return _alive
        }
        set(value) {
            if (value != null) {
                _alive = value
            }

        }

    open var energy: Int?
        get() {
            return _energy
        }
        set(value) {
            if (value != null) {
                _energy = value
            }
        }

}