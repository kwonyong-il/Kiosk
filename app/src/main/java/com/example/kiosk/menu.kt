package com.example.kiosk_final

import Order
import com.example.kiosk.main

open class Menu(val name: String, val price: Double, val display: String) {
    override fun toString(): String {
        return "$name | W$price | $display"
    }
}

class Burger(name: String, price: Double, display: String) : Menu(name, price, display)
class FrozenCustard(name: String, price: Double, display: String) : Menu(name, price, display)
class Drink(name: String, price: Double, display: String) : Menu(name, price, display)
class Beer(name: String, price: Double, display: String) : Menu(name, price, display)


fun burger() {

    val burgerList = ArrayList<Burger>()

    val shackBurger = Burger("shakeshack", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거")
    val smokeShack = Burger("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거")
    val shroomBurger = Burger("Shroom Burger", 9.4, "몬스터 치즈와 체다 치즈로 속을 채운 베지테리안 버거")
    val cheeseburger = Burger("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거")
    burgerList.add(shackBurger)
    burgerList.add(smokeShack)
    burgerList.add(shroomBurger)
    burgerList.add(cheeseburger)

    println("--------------------[Burgers}--------------------")
    for ((index, burger) in burgerList.withIndex()) {
        println("[${index + 1}] ${burger.name} | W${burger.price} ㅣ ${burger.display}")
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


fun frozenCustard() {

    val frozenCustardList = ArrayList<FrozenCustard>()

    val shake = FrozenCustard("shakeshack", 5.9, "바닐라,초콜렛,솔티드카라멜,블랙&화이트")
    val cupsCones = FrozenCustard("Cups&Cones", 4.9, "바닐라,초콜렛")
    val concrete = FrozenCustard("Shroom Burger", 5.9, "쉐이크쉑의 쫀득한 커스터드와 다양한 믹스-인 조합")
    frozenCustardList.add(shake)
    frozenCustardList.add(cupsCones)
    frozenCustardList.add(concrete)

    println("--------------------[Frozen Custards}--------------------")
    for ((index, frozenCustard) in frozenCustardList.withIndex()) {
        println("[${index + 1}] ${frozenCustard.name} | W${frozenCustard.price} ㅣ ${frozenCustard.display}")
    }
        println("")
        println("0. 메인메뉴로 돌아가기")
        println("")
        println("번호를 입력해 주세요")
        while (true) {
            try {
                when (val selectNumber = readLine()?.toIntOrNull()) {
                    in 1..frozenCustardList.size -> {
                        val selectedFrozenCustard = frozenCustardList[selectNumber!! - 1]
                        println("고르신 것은 ${selectedFrozenCustard.name} 입니다.")
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

fun drink() {

    val drinkList = ArrayList<Drink>()

    val lemonade = Drink("Lemonade", 3.9, "매장에서 직접 만드는 상큼한 레몬에이드")
    val iceTea = Drink("IceTea", 3.4, "직접 유기농 홍차를 우려낸 아이스티")
    val fiftyFifty = Drink("Fifty/Fifty", 3.5, "레몬에이드와 아이스티의 만남")
    val fountainSoda = Drink("Fountain Soda", 3.7, "코카콜라,스프라이트,환타")
    drinkList.add(lemonade)
    drinkList.add(iceTea)
    drinkList.add(fiftyFifty)
    drinkList.add(fountainSoda)

    println("--------------------[Drinks}--------------------")
    for ((index, drink) in drinkList.withIndex()) {
        println("[${index + 1}] ${drink.name} | W${drink.price} ㅣ ${drink.display}")
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

fun beer() {

    val beerList = ArrayList<Beer>()

    val shackMeister = Beer("ShackMeister Ale", 9.8, "쉐이크쉑의 버거를 위해 특별히 양조한 에일 맥주")
    val cupsMagpiebrewing = Beer("Cups&Magpie Brewing Co.", 6.8, "")
    val handMalt = Beer("The Hand and Malt", 6.8, "")
    beerList.add(shackMeister)
    beerList.add(cupsMagpiebrewing)
    beerList.add(handMalt)

    println("--------------------[Beers}--------------------")
    for ((index, beer) in beerList.withIndex()) {
        println("[${index + 1}] ${beer.name} | W${beer.price} ㅣ ${beer.display}")
    }
        println("")
        println("0. 메인메뉴로 돌아가기")
        println("")
        println("번호를 입력해 주세요")
        while (true) {
            try {
                when (val selectNumber = readLine()?.toIntOrNull()) {
                    in 1..beerList.size -> {
                        val selecteBeer = beerList[selectNumber!! - 1]
                        println("고르신 것은 ${selecteBeer.name} 입니다.")
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

fun processPayment(order: Order) {
    println("---- 결제 화면 ----")
    order.printOrderReceipt()

    while (true) {
        println("결제하시려면 금액을 입력해주세요.")
        val payment = readLine()?.toDoubleOrNull()

        if (payment != null && payment >= order.getTotalAmount()) {
            val change = payment - order.getTotalAmount()
            println("결제가 완료되었습니다. 거스름돈은 W$change 입니다.")
            order.clearOrder()
            break
        } else {
            println("입력한 금액이 부족합니다. 다시 시도해주세요.")
        }
    }
}

