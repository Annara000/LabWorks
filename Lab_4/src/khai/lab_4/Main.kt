package khai.lab_4

data class Planet(val name: String, val mass: Double);

fun main(args: Array<String>) {
    val num_list = listOf(32868.0, 481068.0, 597600.0, 63345.0,
            187664328.0, 56180376.0, 8605440.0, 10159200.0, 1195.0)
    val string_list = listOf("Mercury", "Venus", "Earth", "Mars",
            "Jupiter", "Saturn", "Uranus", "Neptune", "Pluto")
    // Вариант № 36
    val Planets = mutableListOf<Planet>()
    val add = {i: Int->Planets.add(Planet(string_list[i],num_list[i]))}
    var i=0
    while (i < num_list.size){
        add(i)
        i++
    }
    println(Planets)
    println("Фильтрация: Отфильтровать по первой букве")
    val M_Filter = Planets.filter{'M' in it.name}
    println(M_Filter)
    println("Преобразование: Преобразовать в карту map")
    val PlanetsToMap = Planets.map { it.name to it.mass }.toMap()
    println(PlanetsToMap)
    println("Объединение: Объединить в строку c преобразованием каждого элемента в одно из его свойств")
    val PlanetNamesToStr = Planets.joinToString(separator = " ", transform = { p: Planet -> p.name })
    println(PlanetNamesToStr)


}
