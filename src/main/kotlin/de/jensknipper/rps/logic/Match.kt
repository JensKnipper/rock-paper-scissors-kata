package de.jensknipper.rps.logic

import de.jensknipper.rps.logic.result.GameResultCalculator

class Match(private val player1: Player, private val player2: Player) {
    fun execute() {
        val weapon1 = player1.getWeapon()
        val weapon2 = player2.getWeapon()

        val calculator = GameResultCalculator(weapon1, weapon2)

        player1.addResult(calculator.calculateFirst())
        player2.addResult(calculator.calculateSecond())
    }
}