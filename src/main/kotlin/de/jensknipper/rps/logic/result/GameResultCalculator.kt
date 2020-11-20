package de.jensknipper.rps.logic.result

import de.jensknipper.rps.logic.Weapon

class GameResultCalculator(private val weapon1: Weapon, private val weapon2: Weapon) {

    fun calculateFirst(): GameResult {
        return calculate(weapon1, weapon2)
    }

    fun calculateSecond(): GameResult {
        return calculate(weapon2, weapon1)
    }

    private fun calculate(weapon: Weapon, otherWeapon: Weapon): GameResult {
        when {
            weapon > otherWeapon -> return GameResult.WIN
            weapon < otherWeapon -> return GameResult.LOSE
            else -> return GameResult.TIE
        }
    }
}
