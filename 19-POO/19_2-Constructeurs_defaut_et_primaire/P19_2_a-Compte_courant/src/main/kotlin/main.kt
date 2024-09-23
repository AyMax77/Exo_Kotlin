class BankAccount(deposite:Int,withdrawn:Int){
    var deposite = 0
    var withdrawn = 0
    var balance = deposite - withdrawn
}


fun main() {
    val account = BankAccount(100, 20)
    println(account.deposite)
    println(account.withdrawn)
    println(account.balance)
}