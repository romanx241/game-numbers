package ru.netology.composition.domain.usecases

import ru.netology.composition.domain.entity.GameSettings
import ru.netology.composition.domain.entity.Level
import ru.netology.composition.domain.repository.GameRepository

class GetGameSettingsUseCase(

    private val repository: GameRepository
) {

    operator fun invoke(): GameSettings {
        return repository.getGameSettings(Level.TEST)
    }
}