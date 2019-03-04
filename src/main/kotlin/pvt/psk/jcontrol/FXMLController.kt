package pvt.psk.jcontrol

import javafx.fxml.*
import javafx.scene.control.*
import pvt.psk.jmodel.*
import java.net.*
import java.util.*

class FXMLController : Initializable {

    @FXML
    lateinit var label: Label

    override fun initialize(url: URL, rb: ResourceBundle?) {

        getModel().subscribe(::upd)

        val javaVersion = System.getProperty("java.version")
        val javafxVersion = System.getProperty("javafx.version")
        label.text = "Hello, JavaFX $javafxVersion\nRunning on Java $javaVersion."
    }

    fun upd(){

    }
}
