package de.jensknipper.rps.strategy

import de.jensknipper.rps.Weapon
import org.junit.jupiter.api.Test

internal class StaticStrategyTest {

    @Test
    fun `static strategy should return injected weapon`() {
        Weapon.all.forEach {
            // given
            val strategy = StaticStrategy(it)

            // when
            val weapon = strategy.getWeapon()

            // then
            assert(weapon == it)
        }
    }
}