package de.jensknipper.rps.logic.strategy

import de.jensknipper.rps.logic.Weapon

class StaticStrategy(private val staticWeapon: Weapon) : Strategy {
    override fun getWeapon(): Weapon {
        return staticWeapon
    }

    override fun toString(): String {
        return "Static: ${staticWeapon.name}"
    }
}