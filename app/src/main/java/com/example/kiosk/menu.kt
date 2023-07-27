package com.example.kiosk_final

import com.example.kiosk.main

data class MenuItems(
    val burger: MutableList<ITEM>,
    val forzenCustard: MutableList<ITEM>,
    val drink: MutableList<ITEM>,
    val beer: MutableList<ITEM>,
)

class Menu() {
    fun menu(): MenuItems {

        val burger: MutableList<ITEM> = ArrayList()
        val shackBurger = ITEM("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거")
        val smokeShack = ITEM("SmokeShack ", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거")
        val shroomBurger = ITEM("Shroom Burger", 9.4, "몬스터 치즈와 체다 치즈로 속을 채운 베지테리안 버거")
        val cheeseburger = ITEM("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거")
        val hamburger = ITEM("Hamburger ", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거")
        burger.add(shackBurger)
        burger.add(smokeShack)
        burger.add(shroomBurger)
        burger.add(cheeseburger)
        burger.add(hamburger)


        val forzenCustard: MutableList<ITEM> = ArrayList()
        val shakes = ITEM("Shakes", 5.9, "바닐라, 초콜렛, 솔티드 카라멜, 블랙&화이트,스트로베리,피넛버터,커피")
        val shakeoftheWeek = ITEM("Shake of the Week", 6.5, "특별한 커스터드 플레이버")
        val redBeanShake = ITEM("Red Bean Shake", 6.5, "신선한 커스터드와 함께 우유과 레드빈이 블렌딩 된 시즈널 쉐이크")
        val floats = ITEM("Floats", 5.9, "루트비어, 퍼플 카우, 클")
        forzenCustard.add(shakes)
        forzenCustard.add(shakeoftheWeek)
        forzenCustard.add(redBeanShake)
        forzenCustard.add(floats)


        val drink: MutableList<ITEM> = ArrayList()
        val shakemadeLemonade = ITEM("Shake-made Lemonade", 3.9, "매장에서 직접 만드는 상큼한 레몬에이드(오리지널/시즈널)")
        val freshBrewedIcedTea = ITEM("Fresh Brewed Iced Tea", 4.5, "직접 유기농 홍차를 우려낸 아이스티")
        val fiftyFifty = ITEM("Fifty/Fifty", 3.5, "레몬에이드와 아이스티의 만남")
        val fountainSoda = ITEM("FountainSoda", 2.7, "코카콜라, 코카콜라 제로, 스프라이트, 환타 오렌지, 환타 그레이프")
        val abitaRootBeer = ITEM("AbitaRootBeer", 4.4, "청량감 있는 독특한 미국식 무알콜 탄산음료")
        val botteledWater = ITEM("Botteled Water", 1.0, "지리산 암반대수층으로 만든 프리미엄 생수")
        drink.add(shakemadeLemonade)
        drink.add(freshBrewedIcedTea)
        drink.add(fiftyFifty)
        drink.add(fountainSoda)
        drink.add(abitaRootBeer)
        drink.add(botteledWater)


        val beer: MutableList<ITEM> = ArrayList()
        var shakeMeisterAle =
            ITEM("ShakeMeister Ale", 9.8, "쉐이크쉑버거를 위해 뉴욕 부루클린 부루어리에서 특별히 양조한 에일 맥주")
        var magpieBrewingCo = ITEM("Magpie Brewing Co.", 6.8, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거")
        beer.add(shakeMeisterAle)
        beer.add(magpieBrewingCo)
        return MenuItems(burger, forzenCustard, drink, beer)
    }


}
class ITEM(var name :  String, var price : Double, var description : String ) {




}
