package de.jensknipper.rps.run

import de.jensknipper.rps.logic.Match
import de.jensknipper.rps.logic.Player
import de.jensknipper.rps.logic.Weapon
import de.jensknipper.rps.logic.strategy.RandomStrategy
import de.jensknipper.rps.logic.strategy.StaticStrategy

fun main() {
    val player1 = Player(RandomStrategy())
    val player2 = Player(StaticStrategy(Weapon.ROCK))

    val match = Match(player1, player2)

    for (i in 0..99) {
        match.execute()
    }

    println(player1)
    println(player2)
}