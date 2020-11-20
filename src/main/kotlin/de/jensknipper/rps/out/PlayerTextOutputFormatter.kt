package de.jensknipper.rps.out

import de.jensknipper.rps.Player

class PlayerTextOutputFormatter(private val player: Player) {
    fun format(): String {
        return """
            Strategy:   ${player.strategy}
            wins:       ${player.wins}
            ties:       ${player.ties}
            losses:     ${player.losses}
            
        """.trimIndent()
    }
}