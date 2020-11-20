package de.jensknipper.rps.strategy

import de.jensknipper.rps.Weapon
import kotlin.random.Random

class RandomStrategy(private val from: Int = 0, private val until: Int = Weapon.all.size) : Strategy {
    override fun getWeapon(): Weapon {
        val position = Random.nextInt(from, until)
        return Weapon.all[position]
    }
}