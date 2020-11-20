package de.jensknipper.rps

import de.jensknipper.rps.strategy.Strategy

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
}