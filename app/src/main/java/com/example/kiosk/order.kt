import com.example.kiosk_final.Menu

class Order {
    private val selectedItems = mutableListOf<Menu>()

    fun addItem(menu: Menu) {
        selectedItems.add(menu)
    }

    fun getTotalAmount(): Double {
        return selectedItems.sumOf { it.price }
    }

    fun clearOrder() {
        selectedItems.clear()
    }

    fun printOrderReceipt() {
        println("---- 주문 내역 ----")
        for ((index, item) in selectedItems.withIndex()) {
            println("[${index + 1}] $item")
        }
        println("------------------")
        println("총 결제 금액: W${getTotalAmount()}")
        println("------------------")
    }
}