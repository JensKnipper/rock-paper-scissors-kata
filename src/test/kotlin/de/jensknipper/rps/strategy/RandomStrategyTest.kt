package de.jensknipper.rps.strategy

import de.jensknipper.rps.Weapon
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class RandomStrategyTest {

    @Test
    fun `first random weapon should be first weapon in weapon list`() {
        // given
        val strategy = RandomStrategy(0, 1)

        // when
        val weapon = strategy.getWeapon()

        //then
        assert(weapon == Weapon.all[0])
    }

    @Test
    fun `second random weapon should be first weapon in weapon list`() {
        // given
        val strategy = RandomStrategy(1, 2)

        // when
        val weapon = strategy.getWeapon()

        //then
        assert(weapon == Weapon.all[1])
    }

    @Test
    fun `third random weapon should be first weapon in weapon list`() {
        // given
        val strategy = RandomStrategy(2, 3)

        // when
        val weapon = strategy.getWeapon()

        //then
        assert(weapon == Weapon.all[2])
    }

    @Test
    fun `third random weapon should be first weapon in weapon lis1t`() {
        // given
        val strategy = RandomStrategy(3, 4)

        // when + then
        assertThrows(ArrayIndexOutOfBoundsException::class.java) {
            val weapon = strategy.getWeapon()
        }
    }
}