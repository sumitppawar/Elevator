package com.elevator

import com.google.inject.Inject
import play.api.inject.ApplicationLifecycle

trait OnStart {
  def onStart()
}

/**
 * @author sumit
 * How to do something on Play start ?
 */
class ElevatorOnStart @Inject() (appLifeCycle: ApplicationLifecycle) extends OnStart {
  override def onStart() {
    println("Play is started")
  }
  onStart()
}