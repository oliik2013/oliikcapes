package me.cael.capes

import com.mojang.authlib.GameProfile
import net.minecraft.screen.ScreenTexts
import net.minecraft.text.Text

enum class CapeType(val stylized: String) {
    MINECRAFT("Minecraft"), OLIIK("Oliik");

    fun cycle() = when(this) {
        MINECRAFT -> OLIIK
        OLIIK -> MINECRAFT
    }

    fun getURL(profile: GameProfile): String? {
        val config = Capes.CONFIG
        return when (this) {
            OLIIK -> if(config.enableOliik) "https://oliik2010.thedev.me/capes/${profile.name}.gif" else null
            MINECRAFT -> null
        }
    }

    fun getToggleText(enabled: Boolean): Text = ScreenTexts.composeToggleText(Text.of(stylized), enabled)

    fun getText(): Text = Text.translatable("options.capes.capetype", stylized)

}
