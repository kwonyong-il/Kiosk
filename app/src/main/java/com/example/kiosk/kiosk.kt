package com.example.kiosk

fun main() {
    println("7 TEAM 버거 에 오신걸 환영합니다.")
    println("아래 메뉴판을 보시고 메뉴를 골라 입력해주세요.")
    println("")
    println("--------------------[7 TEAM 버거}--------------------")
    println("1.Burger ㅣ 앵거스 비프 통살을 다져만든 버거")
    println("2.Frozen Custrad ㅣ 매장에서 신선하게 만드는 아이스크림")
    println("3.Drinks ㅣ매장에서 직접 만드는 음료")
    println("4.Bear ㅣ 뉴욕 브루클린 브루어리에서 양조한 맥주")
    println("")
    println("0. 종료")
    println("")
    println("번호를 입력해 주세요")


    while (true) {
        var selectNumber = readLine()?.toIntOrNull()

        when (selectNumber) {
            1 -> {
                val burger = Burger()
                burger.selectBurgerNumber()
            }

            2 -> {
                val frozenCustard = FrozenCustard()
                frozenCustard.selectFrozenCustardNumber()
            }

            3 -> {
                val drinks = Drinks()
                drinks.selectDrinksNumber()
            }

            4 -> {
                val beer = Beer()
                beer.selectBeerNumber()
            }

            0 -> break
            else ->
                println("잘못 입력하셨습니다. 메뉴에 있는 번호를 입력해주세요.")
        }
    }

}
class Burger() {
    fun selectBurgerNumber() {
        println("--------------------[Burgers}--------------------")
        println("1. ShackBurger   | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거")
        println("2. SmokeShack    | W 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거")
        println("3. Shroom Burger | W 9.4 | 몬스터 치즈와 체다 치즈로 속을 채운 베지테리안 버거")
        println("4. Cheeseburger  | W 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거")
        println("")
        println("0. 뒤로 가기 ㅣ 메인 화면으로 가기")
        var selectBurgerNumber = readLine()?.toIntOrNull()

        if (selectBurgerNumber == 0)
            return main()
    }
}
class FrozenCustard() {
    fun selectFrozenCustardNumber() {
        println("--------------------[Frozen Custard}--------------------")
        println("1. Shake   | W 5.9 | 바닐라,초콜렛,솔티드카라멜,블랙&화이트 ")
        println("2. Cups&Cones   | W 4.9  | 바닐라,초콜렛 ")
        println("3. Concrete | W 5.9 | 쉐이크쉑의 쫀득한 커스터드와 다양한 믹스-인 조합")
        println("")
        println("0. 뒤로 가기 ㅣ 메인 화면으로 가기")
        var selectFrozenCustardNumber = readLine()?.toIntOrNull()

        if (selectFrozenCustardNumber == 0)
            return main()
    }
}
class Drinks() {
    fun selectDrinksNumber() {
        println("--------------------[Drinks}--------------------")
        println("1. Lemonade   | W 3.9 | 매장에서 직접 만드는 상큼한 레몬에이드")
        println("2. IceTea    | W 3.4 | 직접 유기농 홍차를 우려낸 아이스티")
        println("3. Fifty/Fifty | W 3.5 | 레몬에이드와 아이스티의 만남")
        println("4. Fountain Soda  | W 3.7 | 코카콜라,스프라이트,환타")
        println("")
        println("0. 뒤로 가기 ㅣ 메인 화면으로 가기")
        var selectDrinksNumber = readLine()?.toIntOrNull()

        if (selectDrinksNumber == 0)
            return main()
    }
}
class Beer() {
    fun selectBeerNumber() {
        println("--------------------[Beer}--------------------")
        println("1. ShackMeister Ale   | W 9.8 | 쉐이크쉑의 버거를 위해 특별히 양조한 에일 맥주")
        println("2. Magpie Brewing Co.   | W 6.8 ")
        println("3. The Hand and Malt | W 6.8  ")
        println("")
        println("0. 뒤로 가기 ㅣ 메인 화면으로 가기")
        var selectBeerNumber = readLine()?.toIntOrNull()

        if (selectBeerNumber == 0)
            return main()
    }
}
