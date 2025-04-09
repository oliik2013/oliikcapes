package me.cael.capes.menu

import me.cael.capes.Capes
import net.minecraft.client.gui.screen.ConfirmLinkScreen
import net.minecraft.client.gui.screen.Screen
import net.minecraft.client.gui.widget.ButtonWidget
import net.minecraft.client.option.GameOptions
import net.minecraft.screen.ScreenTexts
import net.minecraft.text.Text
import net.minecraft.util.Util
import java.math.BigInteger
import java.util.*

class OtherMenu(parent: Screen, gameOptions: GameOptions) : MainMenu(parent, gameOptions) {

    override fun init() {
        super.init()

        val buttonW = 200


        addDrawableChild(ButtonWidget.builder(ScreenTexts.DONE) {
            client!!.setScreen(parent)
        }.position((width/2) - (buttonW / 2), height / 7 + 2 * 24).size(buttonW, 20).build())

    }

}