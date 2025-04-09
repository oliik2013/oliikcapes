package me.cael.capes.menu

import me.cael.capes.CapeType
import me.cael.capes.Capes
import net.minecraft.client.gui.screen.Screen
import net.minecraft.client.gui.widget.ButtonWidget
import net.minecraft.client.option.GameOptions
import net.minecraft.screen.ScreenTexts
import net.minecraft.text.Text

class ToggleMenu(parent: Screen, gameOptions: GameOptions) : MainMenu(parent, gameOptions) {

    override fun init() {
        super.init()

        val config = Capes.CONFIG

        addDrawableChild(ButtonWidget.builder(CapeType.OLIIK.getToggleText(config.enableOliik)) {
            config.enableOliik = !config.enableOliik
            config.save()
            it.message = CapeType.OLIIK.getToggleText(config.enableOliik)
        }.position(width / 2 - 155, height / 7 + 24).size(150, 20).build())


//        addDrawableChild(ButtonWidget.builder(CapeType.CLOAKSPLUS.getToggleText(config.enableCloaksPlus)) {
//            config.enableCloaksPlus = !config.enableCloaksPlus
//            config.save()
//            it.message = CapeType.CLOAKSPLUS.getToggleText(config.enableCloaksPlus)
//        }.position(width / 2 - 155 + 160, height / 7 + 3 * 24).size(150, 20).build())

        addDrawableChild(ButtonWidget.builder(elytraMessage(config.enableElytraTexture)) {
            config.enableElytraTexture = !config.enableElytraTexture
            config.save()
            it.message = elytraMessage(config.enableElytraTexture)
        }.position((width/2) - (200 / 2), height / 7 + 4 * 24).size(200, 20).build())

        addDrawableChild(ButtonWidget.builder(ScreenTexts.DONE) {
            client!!.setScreen(parent)
        }.position((width/2) - (200 / 2), height / 7 + 5 * 24).size(200, 20).build())

    }

    private fun elytraMessage(enabled: Boolean) = ScreenTexts.composeToggleText(Text.translatable("options.capes.elytra"), enabled)

}