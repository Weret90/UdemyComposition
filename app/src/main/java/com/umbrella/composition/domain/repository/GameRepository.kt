package com.umbrella.composition.domain.repository

import com.umbrella.composition.domain.entity.GameSettings
import com.umbrella.composition.domain.entity.Level
import com.umbrella.composition.domain.entity.Question

interface GameRepository {

    fun generateQuestion(
        maxSumValue: Int,
        countOfOptions: Int
    ): Question

    fun getGameSettings(level: Level): GameSettings
}