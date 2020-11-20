package de.jensknipper.rps.logic

import de.jensknipper.rps.logic.result.GameResult
import de.jensknipper.rps.logic.Player
import de.jensknipper.rps.logic.strategy.StaticStrategy
import de.jensknipper.rps.logic.Weapon
import org.junit.jupiter.api.Test

internal class PlayerTest {

    @Test
    fun `adding a win to player should increase counter`() {
        // given
        val player = Player(StaticStrategy(Weapon.PAPER))

        // when
        player.addResult(GameResult.WIN)

        // then
        assert(player.wins == 1)
        assert(player.losses == 0)
        assert(player.ties == 0)
    }

    @Test
    fun `adding a loss to player should increase counter`() {
        // given
        val player = Player(StaticStrategy(Weapon.PAPER))

        // when
        player.addResult(GameResult.LOSE)

        // then
        assert(player.wins == 0)
        assert(player.losses == 1)
        assert(player.ties == 0)
    }

    @Test
    fun `adding a tie to player should increase counter`() {
        // given
        val player = Player(StaticStrategy(Weapon.PAPER))

        // when
        player.addResult(GameResult.TIE)

        // then
        assert(player.wins == 0)
        assert(player.losses == 0)
        assert(player.ties == 1)
    }
}