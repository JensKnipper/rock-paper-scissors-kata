package de.jensknipper.rps

import org.junit.jupiter.api.Test

internal class WeaponTest {

    @Test
    fun `same weapons should be equal`() {
        Weapon.all.forEach {
            assert(it == it)
        }
    }

    @Test
    fun `PAPER should beat ROCK`() {
        // when
        val result = Weapon.PAPER > Weapon.ROCK

        // then
        assert(result)
    }

    @Test
    fun `ROCK should lose to PAPER`() {
        // when
        val result = Weapon.ROCK < Weapon.PAPER

        // then
        assert(result)
    }

    @Test
    fun `ROCK should beat SCISSORS`() {
        // when
        val result = Weapon.ROCK > Weapon.SCISSORS

        // then
        assert(result)
    }

    @Test
    fun `SCISSORS should lose to ROCK`() {
        // when
        val result = Weapon.SCISSORS < Weapon.ROCK

        // then
        assert(result)
    }

    @Test
    fun `SCISSORS should beat PAPER`() {
        // when
        val result = Weapon.SCISSORS > Weapon.PAPER

        // then
        assert(result)
    }

    @Test
    fun `PAPER should lose to SCISSORS`() {
        // when
        val result = Weapon.PAPER < Weapon.SCISSORS

        // then
        assert(result)
    }
}