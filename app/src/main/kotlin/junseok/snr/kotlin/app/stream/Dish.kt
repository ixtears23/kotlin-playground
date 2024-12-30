package junseok.snr.kotlin.app.junseok.snr.kotlin.app.stream

data class Dish(
    val name: String,
    val vegetarian: Boolean,
    val calories: Int,
    val type: Type,
) {
    enum class Type {
        MEAT,
        OTHER,
        FISH
    }
}
