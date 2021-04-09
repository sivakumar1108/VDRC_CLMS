import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
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

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.url)

WebUI.setText(findTestObject('TC02-Trigger/Page_Emagine Administration Application 11.5.0/01_input_User Name_uid'), GlobalVariable.username)

WebUI.setText(findTestObject('TC02-Trigger/Page_Emagine Administration Application 11.5.0/02_input_Password_pwd'), GlobalVariable.password)

WebUI.click(findTestObject('TC02-Trigger/Page_Emagine Administration Application 11.5.0/03_Click_Login'))

WebUI.maximizeWindow()

WebUI.click(findTestObject('TC02-Trigger/Page_Emagine Administration Application 11.5.0/04_Click_Configuration Manager'))

WebUI.click(findTestObject('TC02-Trigger/Page_Emagine Administration Application 11.5.0/05_Click_Customer Contact'))

WebUI.click(findTestObject('TC02-Trigger/Page_Emagine Administration Application 11.5.0/06_Click_Triggers'))

WebUI.delay(3)

WebUI.click(findTestObject('TC02-Trigger/Page_Emagine Administration Application 11.5.0/30_Click_Trigger_PRIORITY_button'))

WebUI.click(findTestObject('TC02-Trigger/Page_Emagine Administration Application 11.5.0/31_Click_First_Result_of_priority_triggers'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.takeFullPageScreenshot('Screenshots/Screenshots_CLMS/TC02.02.04_01_Trigger_Priority_Before_doing_the_action.png')

WebUI.doubleClick(findTestObject('TC02-Trigger/Page_Emagine Administration Application 11.5.0/31.01_Double_click_Priority_arrow_button'))

WebUI.click(findTestObject('TC02-Trigger/Page_Emagine Administration Application 11.5.0/31.02_Click_trigger_priority_Final_OK_button'))

WebUI.click(findTestObject('TC02-Trigger/Page_Emagine Administration Application 11.5.0/30_Click_Trigger_PRIORITY_button'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('TC02-Trigger/Page_Emagine Administration Application 11.5.0/31_Click_First_Result_of_priority_triggers'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.takeFullPageScreenshot('Screenshots/Screenshots_CLMS/TC02.02.04_02_Trigger_Priority_After_doing_the_action.png')

WebUI.click(findTestObject('TC02-Trigger/Page_Emagine Administration Application 11.5.0/31.03_Click_Priority_cancel_tocomeout'))

WebUI.click(findTestObject('TC02-Trigger/Page_Emagine Administration Application 11.5.0/31.04_Click_Trigger_page_close_button'))

WebUI.comment('Trigger Priority button is working fine. Please check the screenshoot of these images in respective path')

WebUI.closeBrowser()

