package com.umbrella.composition.domain.usecases

import com.umbrella.composition.domain.entity.Level
import com.umbrella.composition.domain.repository.GameRepository

class GetGameSettingsUseCase(private val repository: GameRepository) {

    operator fun invoke(level: Level) {
        repository.getGameSettings(level)
    }
}