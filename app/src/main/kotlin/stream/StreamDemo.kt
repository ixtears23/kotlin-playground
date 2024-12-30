package junseok.snr.kotlin.app.stream

import junseok.snr.kotlin.app.junseok.snr.kotlin.app.stream.Dish
import java.util.stream.Stream

var menu: List<Dish> = listOf(
    Dish("pork", false, 800, Dish.Type.MEAT),
    Dish("beef", false, 700, Dish.Type.MEAT),
    Dish("chicken", false, 400, Dish.Type.MEAT),
    Dish("french", true, 530, Dish.Type.OTHER),
    Dish("rice", true, 350, Dish.Type.OTHER),
    Dish("season", true, 120, Dish.Type.OTHER),
    Dish("pizza", true, 550, Dish.Type.OTHER),
    Dish("prawns", false, 300, Dish.Type.FISH),
    Dish("salmon", false, 450, Dish.Type.FISH),
)

fun main() {
    println(filterForList(menu))
    println(filterForList2(menu))
    println(filterLowCalories(menu.stream()))
    println(filterLowCalories(menu.parallelStream()))
}


fun filterForList(menu: List<Dish>): List<String> =
    menu.filter { it.calories < 400 }
        .sortedBy { it.calories }
        .map { it.name }

fun filterForList2(menu: List<Dish>): List<String> {
    var lowCaloricDishes: MutableList<Dish> = mutableListOf()

    for (dish: Dish in menu) {
        if (dish.calories < 400) {
            lowCaloricDishes.add(dish)
        }
    }

    lowCaloricDishes = lowCaloricDishes.sortedBy { it.calories }.toMutableList()

    val sortedLowCalorieDishes: MutableList<String> = mutableListOf()

    for (lowCalorieDish: Dish in lowCaloricDishes) {
        sortedLowCalorieDishes.add(lowCalorieDish.name)
    }

    return sortedLowCalorieDishes
}

private fun filterLowCalories(menu: Stream<Dish>): List<String> = menu
    .filter {
        it.calories < 400
    }
    .sorted { dish1, dish2 ->
        dish1.calories.compareTo(dish2.calories)
    }
    .map {
        it.name
    }
    .toList()