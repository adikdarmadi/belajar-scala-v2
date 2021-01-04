package futurePromise

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future
import scala.util.Random


object SocialNetwork {
  // "database"
  val names = Map(
    "fb.id.1-zuck" -> "Mark",
    "fb.id.2-bill" -> "Bill",
    "fb.id.0-dummy" -> "Dummy"
  )
  val friends = Map(
    "fb.id.1-zuck" -> "fb.id.2-bill"
  )

  val random = new Random()

  // API
  def fetchProfile(id: String): Future[Profile] = Future {
    // fetching from the DB
    Thread.sleep(random.nextInt(300))
    Profile(id, names(id))
  }

  def fetchBestFriend(profile: Profile): Future[Profile] = Future {
    Thread.sleep(random.nextInt(400))
    val bfId = friends(profile.id)
    Profile(bfId, names(bfId))
  }
}
