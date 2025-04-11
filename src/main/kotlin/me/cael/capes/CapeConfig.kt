package me.cael.capes

import draylar.omegaconfig.api.Config

class CapeConfig : Config {
    var clientCapeType = CapeType.OLIIK
    var enableOliik = true
    var enableElytraTexture = true

    override fun getName(): String = "capes"
    override fun getExtension(): String = "json5"
}
