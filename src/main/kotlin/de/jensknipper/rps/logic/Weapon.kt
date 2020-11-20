package de.jensknipper.rps.logic

import java.lang.IllegalArgumentException

// this class mocks enum behaviour as enums do not allow to override compareTo method
class Weapon internal constructor(val name: String) {
    companion object {
        val ROCK = Weapon("ROCK")
        val PAPER = Weapon("PAPER")
        val SCISSORS = Weapon("SCISSORS")

        val all = listOf(ROCK, PAPER, SCISSORS)
    }

    operator fun compareTo(other: Weapon): Int {
        if (this == other) {
            return 0
        }
        when (this) {
            PAPER -> when (other) {
                ROCK -> return 1
                SCISSORS -> return -1
            }
            ROCK -> when (other) {
                SCISSORS -> return 1
                PAPER -> return -1
            }
            SCISSORS -> when (other) {
                PAPER -> return 1
                ROCK -> return -1
            }
        }
        throw IllegalArgumentException("Unknown matching of weapon $this and $other")
    }
}