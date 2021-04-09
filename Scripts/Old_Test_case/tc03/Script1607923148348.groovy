import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.thoughtworks.selenium.Selenium as Selenium
import org.openqa.selenium.firefox.FirefoxDriver as FirefoxDriver
import org.openqa.selenium.WebDriver as WebDriver
import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium as WebDriverBackedSelenium
import static org.junit.Assert.*
import java.util.regex.Pattern as Pattern
import static org.apache.commons.lang3.StringUtils.join

WebUI.openBrowser('https://www.google.com/')

def driver = DriverFactory.getWebDriver()

String baseUrl = 'https://www.google.com/'

selenium = new WebDriverBackedSelenium(driver, baseUrl)

selenium.open('http://10.0.1.81/emagine/admin/index')

WebUI.maximizeWindow()

selenium.click('//form[@id=\'login1\']/div')

selenium.click('id=uid')

selenium.type('id=uid', 'admin')

selenium.type('id=pwd', 'Vod@com12345')

selenium.click('id=submit')

WebUI.delay(5)

selenium.click('link=Configuration Manager')

selenium.click('link=Customer Contact')

selenium.click('link=Campaigns')

selenium.click('xpath=(//button[@type=\'button\'])[5]')

selenium.click('id=111ae913985f1aca1ad08f99298dc30a_name')

selenium.type('id=111ae913985f1aca1ad08f99298dc30a_name', 'Automation test 01')

selenium.click('id=111ae913985f1aca1ad08f99298dc30a_execution_type')

selenium.select('id=111ae913985f1aca1ad08f99298dc30a_execution_type', 'label=Multi-Entry')

selenium.click('id=111ae913985f1aca1ad08f99298dc30a_execution_type')

selenium.click('id=111ae913985f1aca1ad08f99298dc30a_group')

selenium.select('id=111ae913985f1aca1ad08f99298dc30a_group', 'label=Default Campaign Group')

selenium.click('id=111ae913985f1aca1ad08f99298dc30a_group')

selenium.click('id=111ae913985f1aca1ad08f99298dc30a_typepurpose')

selenium.select('id=111ae913985f1aca1ad08f99298dc30a_typepurpose', 'label=Cross sell - Product')

selenium.click('id=111ae913985f1aca1ad08f99298dc30a_typepurpose')

selenium.click('id=111ae913985f1aca1ad08f99298dc30a_typeowner')

selenium.select('id=111ae913985f1aca1ad08f99298dc30a_typeowner', 'label=Poly Phase 1 - Day 1')

selenium.click('id=111ae913985f1aca1ad08f99298dc30a_typeowner')

selenium.click('xpath=(//button[@type=\'button\'])[29]')

selenium.click('xpath=(//button[@type=\'button\'])[13]')

selenium.click('xpath=(//button[@type=\'button\'])[23]')

selenium.click('id=a6294c9ad1b61397e08b0ea6852c07e2_label')

selenium.type('id=a6294c9ad1b61397e08b0ea6852c07e2_label', 'enter the campaign and send sms')

selenium.click('//div[@id=\'display_a6294c9ad1b61397e08b0ea6852c07e2_action_\']/div/table/thead/tr/td/div')

selenium.click('xpath=(//button[@type=\'button\'])[41]')

selenium.click('xpath=(//button[@type=\'button\'])[47]')

selenium.click('id=b16a868a154c13f63fedfbcba46cb7fd_label_1')

selenium.click('id=b16a868a154c13f63fedfbcba46cb7fd_actionprimarykey')

selenium.select('id=b16a868a154c13f63fedfbcba46cb7fd_actionprimarykey', 'label=Test september280920 - Test september280920')

selenium.click('id=b16a868a154c13f63fedfbcba46cb7fd_actionprimarykey')

selenium.click('xpath=(//button[@type=\'button\'])[54]')

selenium.click('xpath=(//button[@type=\'button\'])[44]')

selenium.click('xpath=(//button[@type=\'button\'])[23]')

selenium.click('id=a6294c9ad1b61397e08b0ea6852c07e2_label')

selenium.type('id=a6294c9ad1b61397e08b0ea6852c07e2_label', 'Successful exit')

selenium.click('id=a6294c9ad1b61397e08b0ea6852c07e2_terminationtype')

selenium.select('id=a6294c9ad1b61397e08b0ea6852c07e2_terminationtype', 'label=Successful')

selenium.click('id=a6294c9ad1b61397e08b0ea6852c07e2_terminationtype')

selenium.click('id=a6294c9ad1b61397e08b0ea6852c07e2_terminatestep')

selenium.click('xpath=(//button[@type=\'button\'])[44]')

selenium.click('id=ygtvlabelel3')

selenium.click('xpath=(//button[@type=\'button\'])[25]')

selenium.click('id=3182d4dbfb1a15201be32a287c1b3ae4_name')

selenium.type('id=3182d4dbfb1a15201be32a287c1b3ae4_name', 'Wait for 1 min')

selenium.click('id=3182d4dbfb1a15201be32a287c1b3ae4_type')

selenium.select('id=3182d4dbfb1a15201be32a287c1b3ae4_type', 'label=Timing')

selenium.click('id=3182d4dbfb1a15201be32a287c1b3ae4_type')

selenium.click('xpath=(//button[@type=\'button\'])[39]')

selenium.click('//td[@id=\'ygtvt7\']/div')

selenium.click('id=ygtvlabelel22')

selenium.doubleClick('id=ygtvlabelel22')

selenium.click('id=X')

selenium.click('id=9b8bd349134c328003f94dfa084575c5_cfg_value')

selenium.type('id=9b8bd349134c328003f94dfa084575c5_cfg_value', '1')

selenium.click('xpath=(//button[@type=\'button\'])[54]')

selenium.click('xpath=(//button[@type=\'button\'])[56]')

selenium.click('xpath=(//button[@type=\'button\'])[47]')

selenium.click('xpath=(//button[@type=\'button\'])[29]')

selenium.click('xpath=(//button[@type=\'button\'])[37]')

selenium.chooseOkOnNextConfirmation()

selenium.click('xpath=(//button[@type=\'button\'])[20]')

WebUI.delay(20)

//assertTrue(selenium.getConfirmation().matches("^Are you sure you wish to start the campaign[\\s\\S]$"));
assertEquals('Campaign has been started successfully.', selenium.getAlert())

selenium.click('xpath=(//button[@type=\'button\'])[22]')

selenium.click('xpath=(//button[@type=\'button\'])[11]')

selenium.click('xpath=(//button[@type=\'button\'])[3]')

selenium.click('link=Logout')

selenium.click('id=logoutbtn')

