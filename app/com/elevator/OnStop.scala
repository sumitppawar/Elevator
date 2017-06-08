package com.elevator

import javax.inject.Inject
import play.api.inject.ApplicationLifecycle
import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global

trait OnStop {
  def onStop():Unit
}

/**
 * @author sumit
 * Add things to do on play stop
 */
class ElevatorOnStop @Inject() (appLifeCycle: ApplicationLifecycle) extends OnStop {
  override def onStop() {
    appLifeCycle.addStopHook {() =>
      println("OnStop")
      Future.successful(())
    }
  }
  onStop()
 
}