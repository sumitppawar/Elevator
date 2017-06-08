import javax.inject.Inject
import akka.stream.Materializer
import scala.concurrent.ExecutionContext
import play.api.mvc.Filter
import scala.concurrent.Future
import play.api.mvc.RequestHeader
import play.api.mvc.Result


/**
 * @author sumit
 * Example of filter , which request and next filter as function
 */
class LoggingFilter @Inject() (implicit val mat: Materializer, ec: ExecutionContext) extends Filter {
  def apply(nextFilter:  RequestHeader => Future[Result]) (requestHeader: RequestHeader): Future[Result] = {
    nextFilter(requestHeader)
  }
}