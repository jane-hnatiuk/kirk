package com.automation.remarks.kirk

import org.aeonbits.owner.Config
import org.aeonbits.owner.Config.*

/**
 * Created by sergey on 25.06.17.
 */
@Sources("classpath:kirk.properties")
interface Configuration : Config {

    @Key("kirk.browser")
    @DefaultValue("chrome")
    fun browserName(): String

    @Key("kirk.timeout")
    @DefaultValue("4000")
    fun timeout(): Int

    @Key("kirk.poolingInterval")
    @DefaultValue("0.1")
    fun poolingInterval(): Double

    @Key("kirk.startMaximized")
    @DefaultValue("true")
    fun startMaximized(): Boolean

    @Key("kirk.holdOpen")
    @DefaultValue("false")
    fun holdOpen(): Boolean

    @DefaultValue("")
    @Key("kirk.screenSize")
    fun screenSize(): List<Int>

    @Key("kirk.baseUrl")
    fun baseUrl(): String?

    /**
     * For use <headless> chrome options, set property "kirk.startMaximized=false"
     * */
    @Separator(",")
    @DefaultValue("")
    @Key("kirk.chrome.args")
    fun chromeArgs(): List<String>
}