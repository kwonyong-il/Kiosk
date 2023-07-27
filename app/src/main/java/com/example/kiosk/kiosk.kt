package com.example.kiosk


import Order
import com.example.kiosk_final.beer
import com.example.kiosk_final.burger
import com.example.kiosk_final.drink
import com.example.kiosk_final.frozenCustard
import com.example.kiosk_final.processPayment


fun main() {
    val menuName: ArrayList<String> =
        arrayListOf("1.Burger", "2.Frozen Custard", "3.Drinks", "4.Beer","5.결제")
    val menuDisplay: ArrayList<String> = arrayListOf(
        "앵거스 비프 통살을 다져만든 버거",
        "매장에서 신선하게 만드는 아이스크림",
        "매장에서 직접 만드는 음료",
        "뉴욕 브루클린 브루어리에서 양조한 맥주",
        "주문 내역 확인 및 결제"
    )
    val order = Order()

    println("Shake Shack 버거 에 오신걸 환영합니다.")
    println("아래 메뉴판을 보시고 메뉴를 골라 입력해주세요.")
    println("")
    println("--------------------[Shake Shack 버거}--------------------")
    for (i in 0 until menuName.size) {
        println("${menuName[i]} | ${menuDisplay[i]}")
    }
    println("")
    println(" 0. 종료")
    println("")
    println("번호를 입력해 주세요")

    while (true) {
        var selectNumber = readLine()?.toIntOrNull()
        when (selectNumber) {
            1 -> burger()
            2 -> frozenCustard()
            3 -> drink()
            4 -> beer()
            5 -> processPayment(order)
            0 -> break
            else ->
                println("잘못 입력하셨습니다. 메뉴에 있는 번호를 입력해주세요.")
        }
    }
}
