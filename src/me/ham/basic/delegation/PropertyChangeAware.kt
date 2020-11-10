package me.ham.basic.delegation

import java.beans.PropertyChangeListener
import java.beans.PropertyChangeSupport

/*
위임 프로퍼티 구현 eventListener와 eventPublisher(fire)가 있다.
해당 클래스를 상속하여 addPropertyChangeListener 메서드를 통해 등록하고,
사용하는 쪽에서 firePropertyChange를 call하면서 첫번째 인자로 field명을 전달하면 해당 field가 변경될 때
추가한 listener가 실행된다.
 */
open class PropertyChangeAware {
    protected val changeSupport = PropertyChangeSupport(this)

    fun addPropertyChangeListener(listener: PropertyChangeListener){
        changeSupport.addPropertyChangeListener(listener)
    }

    fun removeProertyChangeListenr(listener: PropertyChangeListener){
        changeSupport.removePropertyChangeListener(listener)
    }
}