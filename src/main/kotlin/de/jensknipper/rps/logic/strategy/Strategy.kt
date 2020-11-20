package de.jensknipper.rps.logic.strategy

import de.jensknipper.rps.logic.Weapon

interface Strategy {
    fun getWeapon(): Weapon
}