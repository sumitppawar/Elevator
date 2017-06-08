package controllers

import javax.inject._
import play.api._
import play.api.mvc._
import com.elevator.OnStart

/**
 * This controller creates an `Action` to handle HTTP requests to the
 * application's home page.
 */
@Singleton
class HomeController @Inject() extends Controller {
  
  //Play Logger API, How define own logger (Using SL4J backed by logback )
   val logger = Logger("HomeController")
  /**
   * Create an Action to render an HTML page.
   *
   * The configuration in the `routes` file means that this method
   * will be called when the application receives a `GET` request with
   * a path of `/`.
   */
  def index = Action { implicit request =>
    logger.warn("Testing play logger api")
    
    Ok(views.html.index())
  }
}
