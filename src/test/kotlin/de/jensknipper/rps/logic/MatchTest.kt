package de.jensknipper.rps.logic

import de.jensknipper.rps.logic.Match
import de.jensknipper.rps.logic.Player
import de.jensknipper.rps.logic.Weapon
import de.jensknipper.rps.logic.strategy.StaticStrategy
import org.junit.jupiter.api.Test

internal class MatchTest {

    @Test
    fun `a match can be played`() {
        // given
        val player1 = Player(StaticStrategy(Weapon.PAPER))
        val player2 = Player(StaticStrategy(Weapon.PAPER))
        val match = Match(player1, player2)

        // when
        match.execute()

        // then
        assert(player1.wins == 0)
        assert(player1.losses == 0)
        assert(player1.ties == 1)

        assert(player2.wins == 0)
        assert(player2.losses == 0)
        assert(player2.ties == 1)
    }
}