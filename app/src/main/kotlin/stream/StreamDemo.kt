package junseok.snr.kotlin.app.stream

import junseok.snr.kotlin.app.junseok.snr.kotlin.app.stream.Dish

fun main() {
    val lowCaloricDishes: MutableList<Dish> = mutableListOf()
    val menu: List<Dish> = listOf(
        Dish(100),
        Dish(200),
        Dish(300),
        Dish(400),
        Dish(500),
        Dish(600),
    )

    for (dish: Dish in menu) {
        if (dish.calories < 400) {
            lowCaloricDishes.add(dish)
        }
    }

    lowCaloricDishes.sortedWith { dish1, dish2 ->
        dish1.calories.compareTo(dish2.calories)
    }

    println(lowCaloricDishes)

}