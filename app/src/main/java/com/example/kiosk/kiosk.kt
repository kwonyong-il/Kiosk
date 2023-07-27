package com.example.kiosk

import com.example.kiosk_final.Menu

fun main() {
    println("\"SHAKESHACK BURGER 에 오신걸 환영합니다.\"")
    println("아래 메뉴판을 보시고 메뉴를 골라 입력해주세요.")
    val mainmenu: List<String> = listOf(
        "1. Burgers         | 앵거스 비프 통살을 다져만든 버거",
        "2. Frozen Custard  | 매장에서 신선하게 만드는 아이스크림",
        "3. Drinks          | 매장에서 직접 만드는 음료",
        "4. Beer            | 뉴욕 브루클린 브루어리에서 양조한 맥주"
    )

    val menu = Menu()


    while (true) {
        for (item in mainmenu) {
            println(item)
        }
        println("메뉴를 선택하세요")
        val input = readLine() ?: "" // 사용자 입력 받기

        if (input == "0") {
            break // 'exit'를 입력하면 루프 종료
        } else {
            println("선택하신 메뉴: $input")
        }
        when (input) {
            "0" -> break // 'exit'를 입력하면 루프 종료
            "1" -> {
                while (true) {
                    var bugermenu = menu.menu()
                    println("[ Burgers MENU ]")
                    for ((index, item) in bugermenu.burger.withIndex()) {
                        val priceFormatted = String.format("%.1f", item.price)
                        println("${index + 1} .${item.name}  | W $priceFormatted |${item.description}")
                        var input = readLine() ?: ""
                        if (input == "0") {
                            break // 'exit'를 입력하면 루프 종료
                        } else {
                            println("선택하신 메뉴: $input")
                        }

                        when (input) {
                            "1" ->{}

                        }
                    }
                }
            }

            "2" -> println("선택하신 메뉴: ${mainmenu[1]}")
            "3" -> println("선택하신 메뉴: ${mainmenu[2]}")
            "4" -> println("선택하신 메뉴: ${mainmenu[3]}")
            else -> println("유효하지 않은 선택입니다. 다시 선택하세요.")
        }
    }
}
