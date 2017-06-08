package module

import com.google.inject.AbstractModule
import com.elevator.OnStart
import com.elevator.ElevatorOnStart
import com.elevator.OnStop
import com.elevator.ElevatorOnStop

class ElevatorModule extends AbstractModule {
  
  override def configure() {
    
    //Bind Eagerly Start and Stop class 
    bind(classOf[OnStart]).to(classOf[ElevatorOnStart]).asEagerSingleton()
    bind(classOf[OnStop]).to(classOf[ElevatorOnStop]).asEagerSingleton()
  }
  
}