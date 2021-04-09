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
    'test')

WebUI.selectOptionByIndex(findTestObject('TC06-Communication/Page_Emagine Administration Application 11.5.0/06_Drop_down_select_DisabledEnabled'), 
    0)

WebUI.click(findTestObject('TC06-Communication/Page_Emagine Administration Application 11.5.0/09_Click_SEARCH_button'))

WebUI.selectOptionByLabel(findTestObject('TC06-Communication/Page_Emagine Administration Application 11.5.0/04_Drop_down_select_Communication IDCommunication Name'), 
    'Communication ID', false)

WebUI.setText(findTestObject('TC06-Communication/Page_Emagine Administration Application 11.5.0/05_Input_Search - Communications_Search'), 
    '%test%')

WebUI.click(findTestObject('TC06-Communication/Page_Emagine Administration Application 11.5.0/09_Click_SEARCH_button'))

WebUI.delay(10)

WebUI.clearText(findTestObject('TC06-Communication/Page_Emagine Administration Application 11.5.0/05_Input_Search - Communications_Search'), 
    FailureHandling.OPTIONAL)

WebUI.selectOptionByIndex(findTestObject('TC06-Communication/Page_Emagine Administration Application 11.5.0/06_Drop_down_select_DisabledEnabled'), 
    0)

WebUI.click(findTestObject('TC06-Communication/Page_Emagine Administration Application 11.5.0/09_Click_SEARCH_button'))

WebUI.selectOptionByIndex(findTestObject('TC06-Communication/Page_Emagine Administration Application 11.5.0/06_Drop_down_select_DisabledEnabled'), 
    1)

WebUI.click(findTestObject('TC06-Communication/Page_Emagine Administration Application 11.5.0/09_Click_SEARCH_button'))

WebUI.selectOptionByIndex(findTestObject('TC06-Communication/Page_Emagine Administration Application 11.5.0/06_Drop_down_select_DisabledEnabled'), 
    2)

WebUI.click(findTestObject('TC06-Communication/Page_Emagine Administration Application 11.5.0/09_Click_SEARCH_button'))

WebUI.selectOptionByIndex(findTestObject('TC06-Communication/Page_Emagine Administration Application 11.5.0/06_Drop_down_select_DisabledEnabled'), 
    0)

WebUI.delay(5)

WebUI.selectOptionByIndex(findTestObject('TC06-Communication/Page_Emagine Administration Application 11.5.0/07_Drop_down_Owner'), 
    0)

WebUI.click(findTestObject('TC06-Communication/Page_Emagine Administration Application 11.5.0/09_Click_SEARCH_button'))

WebUI.selectOptionByIndex(findTestObject('TC06-Communication/Page_Emagine Administration Application 11.5.0/07_Drop_down_Owner'), 
    1)

WebUI.click(findTestObject('TC06-Communication/Page_Emagine Administration Application 11.5.0/09_Click_SEARCH_button'))

WebUI.selectOptionByIndex(findTestObject('TC06-Communication/Page_Emagine Administration Application 11.5.0/07_Drop_down_Owner'), 
    2)

WebUI.click(findTestObject('TC06-Communication/Page_Emagine Administration Application 11.5.0/09_Click_SEARCH_button'))

WebUI.selectOptionByIndex(findTestObject('TC06-Communication/Page_Emagine Administration Application 11.5.0/07_Drop_down_Owner'), 
    0)

WebUI.delay(5)

WebUI.selectOptionByLabel(findTestObject('TC06-Communication/Page_Emagine Administration Application 11.5.0/08_Drop_down_Template_type'), 
    'SMS (via SMSC)', false)

WebUI.click(findTestObject('TC06-Communication/Page_Emagine Administration Application 11.5.0/09_Click_SEARCH_button'))

WebUI.selectOptionByIndex(findTestObject('TC06-Communication/Page_Emagine Administration Application 11.5.0/08_Drop_down_Template_type'), 
    2)

WebUI.click(findTestObject('TC06-Communication/Page_Emagine Administration Application 11.5.0/09_Click_SEARCH_button'))

WebUI.selectOptionByIndex(findTestObject('TC06-Communication/Page_Emagine Administration Application 11.5.0/08_Drop_down_Template_type'), 
    3)

WebUI.click(findTestObject('TC06-Communication/Page_Emagine Administration Application 11.5.0/09_Click_SEARCH_button'))

WebUI.selectOptionByIndex(findTestObject('TC06-Communication/Page_Emagine Administration Application 11.5.0/08_Drop_down_Template_type'), 
    4)

WebUI.click(findTestObject('TC06-Communication/Page_Emagine Administration Application 11.5.0/09_Click_SEARCH_button'))

WebUI.selectOptionByIndex(findTestObject('TC06-Communication/Page_Emagine Administration Application 11.5.0/08_Drop_down_Template_type'), 
    5)

WebUI.click(findTestObject('TC06-Communication/Page_Emagine Administration Application 11.5.0/09_Click_SEARCH_button'))

WebUI.selectOptionByIndex(findTestObject('TC06-Communication/Page_Emagine Administration Application 11.5.0/08_Drop_down_Template_type'), 
    6)

WebUI.click(findTestObject('TC06-Communication/Page_Emagine Administration Application 11.5.0/09_Click_SEARCH_button'))

WebUI.selectOptionByIndex(findTestObject('TC06-Communication/Page_Emagine Administration Application 11.5.0/08_Drop_down_Template_type'), 
    0)

WebUI.click(findTestObject('TC06-Communication/Page_Emagine Administration Application 11.5.0/09_Click_SEARCH_button'))

WebUI.comment('Communication search functionality is working fine.')

WebUI.closeBrowser()

