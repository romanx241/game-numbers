package ru.netology.composition.domain.repository

import ru.netology.composition.domain.entity.GameSettings
import ru.netology.composition.domain.entity.Level
import ru.netology.composition.domain.entity.Question

interface GameRepository {

    fun generateQuestion(
        maxSumValue: Int,
        countOfOptions: Int
    ): Question

    fun getGameSettings(level: Level): GameSettings
}