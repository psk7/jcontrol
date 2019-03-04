package pvt.psk.jcontrol

import javafx.application.*
import javafx.fxml.*
import javafx.scene.*
import javafx.stage.*
import pvt.psk.jmodel.*

class MainApp : Application() {

    @Throws(Exception::class)
    override fun start(stage: Stage) {

        val resource = javaClass.getResource("scene.fxml")
        val root = FXMLLoader.load<Parent>(resource)

        val scene = Scene(root)
        scene.stylesheets.add(javaClass.getResource("styles.css").toExternalForm())

        stage.title = "Панель управления игровым симулятором"
        stage.scene = scene
        stage.show()
    }

    companion object {

        @JvmStatic
        fun main(args: Array<String>) {
            val m = getModel()

            launch(MainApp::class.java, *args)

            m.close()
        }
    }
}
