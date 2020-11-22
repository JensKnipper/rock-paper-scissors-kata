package de.jensknipper.rps.logic

import de.jensknipper.rps.logic.result.GameResult
import de.jensknipper.rps.logic.strategy.Strategy

data class Player(val strategy: Strategy) {
    var wins = 0
        private set
    var ties = 0
        private set
    var losses = 0
        private set

    fun addResult(gameResult: GameResult) {
        if (gameResult == GameResult.WIN) {
            wins++
        } else if (gameResult == GameResult.TIE) {
            ties++
        } else if (gameResult == GameResult.LOSE) {
            losses++
        } else {
            throw IllegalArgumentException("Unknown game result $gameResult")
        }
    }

    fun getWeapon(): Weapon {
        return strategy.getWeapon()
    }

    override fun toString(): String {
        return """
            Strategy:   ${strategy}
            wins:       ${wins}
            ties:       ${ties}
            losses:     ${losses}
        """.trimIndent()
    }
}