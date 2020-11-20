package de.jensknipper.rps.strategy

import de.jensknipper.rps.Weapon

interface Strategy {
    fun getWeapon(): Weapon
}