package domain

import model.Car
import model.CarPath
import model.PathState
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CarRacingGameTest {

    @Test
    fun startDrivingTest() {
        val cars = listOf(Car("핑구"), Car("우기"))

        val carsPath = CarRacingGame { 5 }.startDriving(cars, 3)
        val result = listOf(
            CarPath("핑구", listOf(PathState.MOVE, PathState.MOVE, PathState.MOVE)),
            CarPath("우기", listOf(PathState.MOVE, PathState.MOVE, PathState.MOVE))
        )

        assertThat(carsPath).isEqualTo(result)
    }
}