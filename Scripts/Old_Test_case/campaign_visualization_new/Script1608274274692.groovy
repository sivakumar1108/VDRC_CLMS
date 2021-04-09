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
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://10.200.178.22/emagine/admin/login')

WebUI.setText(findTestObject('Old_Test_case/campaign_visualization/Page_Emagine Administration Application 11.5.0/input_User Name_uid'), 
    'admin')

WebUI.setEncryptedText(findTestObject('Old_Test_case/campaign_visualization/Page_Emagine Administration Application 11.5.0/input_Password_pwd'), 
    'toBtfC2F6o0o4P1o1mgeJg==')

WebUI.click(findTestObject('Old_Test_case/campaign_visualization/Page_Emagine Administration Application 11.5.0/button_Login'))

WebUI.maximizeWindow()

WebUI.delay(5)

WebUI.click(findTestObject('Old_Test_case/campaign_visualization/Page_Emagine Administration Application 11.5.0/a_Configuration Manager'))

WebUI.click(findTestObject('Old_Test_case/campaign_visualization/Page_Emagine Administration Application 11.5.0/a_Customer Contact'))

WebUI.click(findTestObject('Old_Test_case/campaign_visualization/Page_Emagine Administration Application 11.5.0/a_Campaigns'))

WebUI.delay(5)

WebUI.setText(findTestObject('Old_Test_case/campaign_visualization/Page_Emagine Administration Application 11.5.0/input_Search - Campaigns_Search_Campaigns_s_5a257b'), 
    'automation')

WebUI.selectOptionByValue(findTestObject('Old_Test_case/campaign_visualization/Page_Emagine Administration Application 11.5.0/select_Campaign CodeCampaign IDCampaign Nam_e00e6e'), 
    'label', true)

WebUI.delay(5)

WebUI.click(findTestObject('Old_Test_case/campaign_visualization/Page_Emagine Administration Application 11.5.0/button_Search'))

WebUI.click(findTestObject('Old_Test_case/campaign_visualization/Page_Emagine Administration Application 11.5.0/div_Cross sell - Product'))

WebUI.click(findTestObject('Old_Test_case/campaign_visualization/Page_Emagine Administration Application 11.5.0/button_Modify'))

WebUI.click(findTestObject('Old_Test_case/campaign_visualization/Page_Emagine Administration Application 11.5.0/button_Visualise'))

WebUI.selectOptionByIndex(findTestObject('Old_Test_case/campaign_visualization/Page_Emagine Administration Application 11.5.0/visualization_drop_down'), 
    0, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Old_Test_case/campaign_visualization/Page_Emagine Administration Application 11.5.0/button_Visualise'))

WebUI.closeWindowIndex('1')

WebUI.delay(10)

WebUI.selectOptionByIndex(findTestObject('Old_Test_case/campaign_visualization/Page_Emagine Administration Application 11.5.0/visualization_drop_down'), 
    1, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Old_Test_case/campaign_visualization/Page_Emagine Administration Application 11.5.0/button_Visualise'))

WebUI.closeWindowIndex('1')

WebUI.delay(10)

WebUI.selectOptionByIndex(findTestObject('Old_Test_case/campaign_visualization/Page_Emagine Administration Application 11.5.0/visualization_drop_down'), 
    2, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Old_Test_case/campaign_visualization/Page_Emagine Administration Application 11.5.0/button_Visualise'))

WebUI.closeWindowIndex('1')

WebUI.delay(10)

