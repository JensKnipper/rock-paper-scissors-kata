package de.jensknipper.rps.logic.result

import de.jensknipper.rps.logic.result.GameResult
import de.jensknipper.rps.logic.result.GameResultCalculator
import de.jensknipper.rps.logic.Weapon
import org.junit.jupiter.api.Test

internal class GameResultCalculatorTest {

    @Test
    fun `equal weapons should result in tie for both`() {
        // given
        val weapon1 = Weapon.PAPER
        val weapon2 = Weapon.PAPER
        val calculator = GameResultCalculator(weapon1, weapon2)

        //when
        val firstResult = calculator.calculateFirst()
        val secondResult = calculator.calculateSecond()

        //then
        assert(firstResult == GameResult.TIE)
        assert(secondResult == GameResult.TIE)
    }

    @Test
    fun `when weapon1 is greater first should win second should loose`() {
        // given
        val weapon1 = Weapon.SCISSORS
        val weapon2 = Weapon.PAPER
        val calculator = GameResultCalculator(weapon1, weapon2)

        //when
        val firstResult = calculator.calculateFirst()
        val secondResult = calculator.calculateSecond()

        //then
        assert(firstResult == GameResult.WIN)
        assert(secondResult == GameResult.LOSE)
    }

    @Test
    fun `when weapon2 is greater second should win first should loose`() {
        // given
        val weapon1 = Weapon.PAPER
        val weapon2 = Weapon.SCISSORS
        val calculator = GameResultCalculator(weapon1, weapon2)

        //when
        val firstResult = calculator.calculateFirst()
        val secondResult = calculator.calculateSecond()

        //then
        assert(firstResult == GameResult.LOSE)
        assert(secondResult == GameResult.WIN)
    }
}