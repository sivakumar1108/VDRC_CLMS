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

WebUI.setText(findTestObject('Old_Test_case/complete_campaign_visualization/Page_Emagine Administration Application 11.5.0/input_User Name_uid'), 
    GlobalVariable.username)

WebUI.setText(findTestObject('Old_Test_case/complete_campaign_visualization/Page_Emagine Administration Application 11.5.0/input_Password_pwd'), 
    GlobalVariable.password)

WebUI.click(findTestObject('Old_Test_case/complete_campaign_visualization/Page_Emagine Administration Application 11.5.0/button_Login'))

WebUI.maximizeWindow()

WebUI.click(findTestObject('TC06-Communication/Page_Emagine Administration Application 11.5.0/01_Click_Configuration Manager'))

WebUI.click(findTestObject('TC06-Communication/Page_Emagine Administration Application 11.5.0/02_Click_Customer Contact'))

WebUI.click(findTestObject('TC06-Communication/Page_Emagine Administration Application 11.5.0/03_Click_Communications'))

WebUI.selectOptionByLabel(findTestObject('TC06-Communication/Page_Emagine Administration Application 11.5.0/04_Drop_down_select_Communication IDCommunication Name'), 
    'Communication Name', false)

WebUI.setText(findTestObject('TC06-Communication/Page_Emagine Administration Application 11.5.0/05_Input_Search - Communications_Search'), 
    GlobalVariable.communication_modiify_delete)

WebUI.selectOptionByIndex(findTestObject('TC06-Communication/Page_Emagine Administration Application 11.5.0/06_Drop_down_select_DisabledEnabled'), 
    0)

WebUI.click(findTestObject('TC06-Communication/Page_Emagine Administration Application 11.5.0/09_Click_SEARCH_button'))

WebUI.click(findTestObject('TC06-Communication/Page_Emagine Administration Application 11.5.0/12_1_First_Search_Results'))

WebUI.takeFullPageScreenshot('Screenshots/Screenshots_CLMS/TC06.02.04-01_communication_before_delete.png')

WebUI.click(findTestObject('TC06-Communication/Page_Emagine Administration Application 11.5.0/14_Click_DELETE'))

WebUI.acceptAlert()

WebUI.takeFullPageScreenshot('Screenshots/Screenshots_CLMS/TC06.02.04-02_communication_after_delete.png')

WebUI.verifyElementPresent(findTestObject('TC06-Communication/Page_Emagine Administration Application 11.5.0/11_Search_results_Not_Found'), 
    10, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('TC06-Communication/Page_Emagine Administration Application 11.5.0/15_Communication_Close'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.comment('Communication Delete functionality is working fine as Expected')

WebUI.closeBrowser()

