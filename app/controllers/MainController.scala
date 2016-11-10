package controllers

import javax.inject._
import play.api._
import play.api.mvc._

class MainController @Inject() extends Controller {
  def index = TODO
  def broken = Action { implicit request =>
    // One of these lines will not compile
    routes.MainController.index.url
    routes.MainController.broken.url

    Ok("Hai")
  }
}
