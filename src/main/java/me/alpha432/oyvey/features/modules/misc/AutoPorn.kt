package me.alpha432.oyvey.features.modules.misc

import me.alpha432.oyvey.features.modules.Module
import java.awt.Desktop
import java.net.URI

class AutoPorn : Module("AutoPorn","Auto open sex website",Category.MISC,true,false,false) {

    override fun onEnable() {
        Desktop.getDesktop().browse(URI.create("https://www.my1131.com/"))
        this.disable()
    }

}