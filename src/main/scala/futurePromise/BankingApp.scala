package futurePromise

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.duration.DurationInt
import scala.concurrent.{Await, Future}

object BankingApp {
  val name = "Rock the JVM banking"

  def fetchUser(name: String): Future[User] = Future {
    // simulate fetching from the DB
    Thread.sleep(500)
    User(name)
  }

  def createTransaction(user: User, merchantName: String, amount: Double): Future[Transaction] = Future {
    // simulate some processes
    Thread.sleep(1000)
    Transaction(user.name, merchantName, amount, "SUCCESS")
  }

  def purchase(username: String, item: String, merchantName: String, cost: Double): String = {
    // fetch the user from the DB
    // create a transaction
    // WAIT for the transaction to finish
    val transactionStatusFuture = for {
      user <- fetchUser(username)
      transaction <- createTransaction(user, merchantName, cost)
    } yield transaction.status

    Await.result(transactionStatusFuture, 2.seconds) // implicit conversions -> pimp my library
  }
}
