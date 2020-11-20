package de.jensknipper.rps.strategy

import de.jensknipper.rps.Weapon

class StaticStrategy(private val staticWeapon: Weapon) : Strategy {
    override fun getWeapon(): Weapon {
        return staticWeapon
    }
}