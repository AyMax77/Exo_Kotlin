class LewisCarrollBook(var name:String="",val author:String ="Lewis Carrol",var price:Int=0){

}


fun main() {
    val lewisCarrollBook = LewisCarrollBook()
    var bookName = lewisCarrollBook.name
    lewisCarrollBook.name = "Alice's Adventures in Wonderland"
    bookName = lewisCarrollBook.name
    var authorName = lewisCarrollBook.author
    var bookPrice = lewisCarrollBook.price
    lewisCarrollBook.price = 1500
    bookPrice = lewisCarrollBook.price
    println("The name of the book is $bookName")
    println("the author of the book is $authorName")
    println("the new price is $bookPrice")
}