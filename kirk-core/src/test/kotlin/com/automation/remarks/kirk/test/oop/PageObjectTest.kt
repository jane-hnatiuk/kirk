package com.automation.remarks.kirk.test.oop

import com.automation.remarks.kirk.Browser
import com.automation.remarks.kirk.conditions.have
import com.automation.remarks.kirk.test.BaseTest
import com.automation.remarks.kirk.test.pages.StartPage
import org.testng.annotations.BeforeClass
import org.testng.annotations.Test

/**
 * Created by sergey on 09.07.17.
 */
class PageObjectTest : BaseTest() {

    lateinit var chrome: Browser

    @BeforeClass
    fun setUp() {
        chrome = Browser().with { baseUrl = url }
        chrome.open(url)
    }

    @Test
    fun testCanOpenStartPage() {
        val startPage = chrome.to(::StartPage)
        startPage.header.should(have.text("Kirk"))
    }

    @Test
    fun testCanOpenStartPageAndUseClosure() {
        chrome.at(::StartPage).list should have.size(3)
    }
}