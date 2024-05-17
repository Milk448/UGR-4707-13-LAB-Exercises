data class Item(val name: String, val price: Double)

class ShoppingCart {
  private val items: MutableList<Item> = mutableListOf()

  fun addItem(item: Item) {
    items.add(item)
  }

  fun removeItem(itemName: String) {
    val itemToRemove = items.find { it.name == itemName }
    if (itemToRemove != null) {
      items.remove(itemToRemove)
    }
  }

  // Calculate the total price of all items in the cart
  fun calculateTotalPrice(): Double {
    return items.sumOf { it.price }
  }

  // Get the list of items in the cart (optional)
  fun getItems(): List<Item> {
    return items.toList() 
  }
}

fun main() {
  val cart = ShoppingCart()
  cart.addItem(Item("Shirt", 19.99))
  cart.addItem(Item("Book", 12.50))

  cart.removeItem("Shirt") // Remove the shirt

  val totalPrice = cart.calculateTotalPrice()
  val items = cart.getItems() // Get a copy of the items list

  println("Cart items:")
  items.forEach { println("- ${it.name} (${it.price})") }
  println("Total price: $$totalPrice")
}
