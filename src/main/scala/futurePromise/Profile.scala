package futurePromise
case class Profile(id: String, name: String) {
  def poke(anotherProfile: Profile) = {

    println(s"${this.name} poking ${anotherProfile.name}")
  }
}
