package pvt.psk.jcontrol

import javafx.scene.control.*
import kotlinx.coroutines.*
import pvt.psk.jmodel.*

class ModeButton : Button() {

    var mode: Int = 0

    init {
        val mod = getModel()

        setOnAction {
            text = "test $mode"

            mod.startMode("sc_Test")
        }

        mod.subscribe {
            GlobalScope.launch(Dispatchers.Main) {
                if (mode == mod.MODE_PI)
                    styleClass.add("highlight")
                else
                    styleClass.removeAll("highlight")
            }
        }
    }

    init {
        minWidth = 128.toDouble()
        minHeight = 64.toDouble()
    }
}