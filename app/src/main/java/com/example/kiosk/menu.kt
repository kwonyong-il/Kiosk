package com.example.kiosk_final

import com.example.kiosk.main

abstract class Menu {
    abstract val name: String
    abstract val price: Double
    abstract val introduce: String
}
open class Burger : Menu() {
    override val name: String = ""
    override val price: Double = 0.0
    override val introduce: String = ""
}
class ShackBurger : Burger() {
    override val name = "ShackBurger"
    override val price = 6.9
    override val introduce = "토마토, 양상추, 쉑소스가 토핑된 치즈버거"
}
class SmokeShack : Burger() {
    override val name = "SmokeShack"
    override val price = 8.9
    override val introduce = "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"
}
class ShroomBurger : Burger() {
    override val name = "ShroomBurger"
    override val price = 9.4
    override val introduce = "몬스터 치즈와 체다 치즈로 속을 채운 베지테리안 버거"
}
class CheeseBurger : Burger() {
    override val name = "CheeseBurger"
    override val price = 6.9
    override val introduce = "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"
}
open class FrozenCustard : Menu() {
    override val name: String = ""
    override val price: Double = 0.0
    override val introduce: String = ""
}
class Shake() : FrozenCustard() {
    override val name = "Shakes"
    override val price = 5.9
    override val introduce = "매일 직접 만드는 부드럽고 진한 맛의 쫀득한 아이스크림"
}
class CupsCones() : FrozenCustard() {
    override val name = "Cups&Cones"
    override val price = 4.9
    override val introduce = "초콜릿 아이스크림"
}
class Concrete() : FrozenCustard() {
    override val name = "Shack Attack"
    override val price = 5.9
    override val introduce = "쉐이크쉑의 쫀득한 커스터드와 다양한 믹스-인의 조합"
}
open class Drink : Menu() {
    override val name: String = ""
    override val price: Double = 0.0
    override val introduce: String = ""
}
class Lemonade() : Drink() {
    override val name = "Shack-made Lemonade"
    override val price = 3.9
    override val introduce = "매장에서 직접 만드는 상큼한 레몬에이드"
}
class IceTea() : Drink() {
    override val name = "Fresh Brewed Iced Tea"
    override val price = 3.4
    override val introduce = "유기농 홍차를 직접 우려낸 아이스티"
}
class FiftyFifty() : Drink() {
    override val name = "Fifty / Fifty"
    override val price = 3.5
    override val introduce = "레모네이드와 아이스 티의 만남"
}
class FountainSoda() : Drink() {
    override val name = "Fountain Soda"
    override val price = 3.7
    override val introduce = "코카콜라"
}
open class Beer : Menu() {
    override val name: String = ""
    override val price: Double = 0.0
    override val introduce: String = ""
}
class ShackMeisterAle() : Beer() {
    override val name = "ShackMeister Ale"
    override val price = 9.8
    override val introduce = "쉐이크쉑 버거를 위해 뉴욕 브루클린 브루어리에서 특별히 양조한 에일 맥주"
}
class MagpieBrewing() : Beer() {
    override val name = "Magpie Brewing Co."
    override val price = 6.8
    override val introduce = ""
}
class HandMalt() : Beer() {
    override val name = "The Hand and Malt"
    override val price = 6.8
    override val introduce = ""
}

fun burgerList(burger: Burger) {
    val burgerList = listOf( ShackBurger(), SmokeShack(), ShroomBurger(), CheeseBurger())
    println("--------------------[Burgers}--------------------")
    for ((index, burger) in burgerList.withIndex()){
        println("[${index + 1}] ${burger.name} | W${burger.price} ㅣ ${burger.introduce}")
    }
    println("")
    println("0. 메인메뉴로 돌아가기")
    println("")
    println("번호를 입력해 주세요")
    while (true) {
        try {
            when (val selectNumber = readLine()?.toIntOrNull()) {
                in 1..burgerList.size -> {
                    val selectedBurger = burgerList[selectNumber!! - 1]
                    println("고르신 것은 ${selectedBurger.name} 입니다.")
                }
                0 -> return main()
                else -> {
                    println("올바른 메뉴 번호를 선택하세요.")
                }
            }
        } catch (e: Exception) {
            println("올바른 메뉴 번호를 선택 하세요.")
        }
    }
}
fun frozenCustardList(frozenCustard: FrozenCustard) {
    val frozenCustardList = listOf( Shake(), CupsCones(), Concrete())
    println("--------------------[FrozenCustard}--------------------")
    for ((index, frozenCustard) in frozenCustardList.withIndex()){
        println("[${index + 1}] ${frozenCustard.name} | W${frozenCustard.price} ㅣ ${frozenCustard.introduce}")
    }
    println("")
    println("0. 메인메뉴로 돌아가기")
    println("")
    println("번호를 입력해 주세요")
    while (true) {
        try {
            when (val selectNumber = readLine()?.toIntOrNull()) {
                in 1..frozenCustardList.size -> {
                    val selectedfrozenCustardList = frozenCustardList[selectNumber!! - 1]
                    println("고르신 것은 ${selectedfrozenCustardList.name} 입니다.")
                }
                0 -> return main()
                else -> {
                    println("올바른 메뉴 번호를 선택하세요.")
                }
            }
        } catch (e: Exception) {
            println("올바른 메뉴 번호를 선택 하세요.")
        }
    }
}
fun drinkList(drink: Drink) {
    val drinkList = listOf( Lemonade(), IceTea(), FiftyFifty(), FountainSoda())
    println("--------------------[Drinks}--------------------")
    for ((index, drink) in drinkList.withIndex()){
        println("[${index + 1}] ${drink.name} | W${drink.price} ㅣ ${drink.introduce}")
    }
    println("")
    println("0. 메인메뉴로 돌아가기")
    println("")
    println("번호를 입력해 주세요")
    while (true) {
        try {
            when (val selectNumber = readLine()?.toIntOrNull()) {
                in 1..drinkList.size -> {
                    val selectedDrink = drinkList[selectNumber!! - 1]
                    println("고르신 것은 ${selectedDrink.name} 입니다.")
                }
                0 -> return main()
                else -> {
                    println("올바른 메뉴 번호를 선택하세요.")
                }
            }
        } catch (e: Exception) {
            println("올바른 메뉴 번호를 선택 하세요.")
        }
    }
}
fun beerList(beer: Beer) {
    val  beerList = listOf( ShackMeisterAle(), MagpieBrewing(), HandMalt())
    println("--------------------[Beer}--------------------")
    for ((index, beer) in  beerList.withIndex()){
        println("[${index + 1}] ${beer.name} | W${beer.price} ㅣ ${beer.introduce}")
    }
    println("")
    println("0. 메인메뉴로 돌아가기")
    println("")
    println("번호를 입력해 주세요")
    while (true) {
        try {
            when (val selectNumber = readLine()?.toIntOrNull()) {
                in 1..beerList.size -> {
                    val selectedBeer = beerList[selectNumber!! - 1]
                    println("고르신 것은 ${selectedBeer.name} 입니다.")
                }
                0 -> return main()
                else -> {
                    println("올바른 메뉴 번호를 선택하세요.")
                }
            }
        } catch (e: Exception) {
            println("올바른 메뉴 번호를 선택 하세요.")
        }
    }
}