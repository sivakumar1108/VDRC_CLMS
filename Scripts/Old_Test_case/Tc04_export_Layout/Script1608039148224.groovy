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

WebUI.navigateToUrl(GlobalVariable.url)

WebUI.setText(findTestObject('Old_Test_case/complete_campaign_visualization/Page_Emagine Administration Application 11.5.0/input_User Name_uid'), 
    GlobalVariable.username)

WebUI.setText(findTestObject('Old_Test_case/complete_campaign_visualization/Page_Emagine Administration Application 11.5.0/input_Password_pwd'), 
    GlobalVariable.password)

WebUI.click(findTestObject('Old_Test_case/complete_campaign_visualization/Page_Emagine Administration Application 11.5.0/button_Login'))

WebUI.maximizeWindow()

WebUI.delay(5)

WebUI.click(findTestObject('Old_Test_case/export_layout/Page_Emagine Administration Application 11.5.0/a_Configuration Manager'))

WebUI.click(findTestObject('Old_Test_case/export_layout/Page_Emagine Administration Application 11.5.0/a_Customer Contact'))

WebUI.click(findTestObject('Old_Test_case/export_layout/Page_Emagine Administration Application 11.5.0/a_Campaigns'))

WebUI.selectOptionByValue(findTestObject('Old_Test_case/export_layout/Page_Emagine Administration Application 11.5.0/select_Campaign CodeCampaign IDCampaign Nam_e00e6e'), 
    'label', true)

WebUI.setText(findTestObject('Old_Test_case/export_layout/Page_Emagine Administration Application 11.5.0/input_Search - Campaigns_Search_Campaigns_s_5a257b'), 
    GlobalVariable.campaign_name)

WebUI.click(findTestObject('Old_Test_case/export_layout/Page_Emagine Administration Application 11.5.0/button_Search'))

WebUI.click(findTestObject('Old_Test_case/export_layout/Page_Emagine Administration Application 11.5.0/div_Automation testing'))

WebUI.click(findTestObject('Old_Test_case/export_layout/Page_Emagine Administration Application 11.5.0/button_Modify'))

WebUI.delay(6)

WebUI.click(findTestObject('Old_Test_case/export_layout/Page_Emagine Administration Application 11.5.0/button_Export Layout'))

WebUI.selectOptionByValue(findTestObject('Old_Test_case/export_layout/Page_Emagine Administration Application 11.5.0/select_DotGraffleGraphMLPDFPNGSVGVRML'), 
    '0', true)

WebUI.click(findTestObject('Old_Test_case/export_layout/Page_Emagine Administration Application 11.5.0/button_OK'))

WebUI.delay(5)

WebUI.selectOptionByValue(findTestObject('Old_Test_case/export_layout/Page_Emagine Administration Application 11.5.0/select_DotGraffleGraphMLPDFPNGSVGVRML'), 
    '1', true)

WebUI.click(findTestObject('Old_Test_case/export_layout/Page_Emagine Administration Application 11.5.0/button_OK'))

WebUI.delay(5)

WebUI.selectOptionByValue(findTestObject('Old_Test_case/export_layout/Page_Emagine Administration Application 11.5.0/select_DotGraffleGraphMLPDFPNGSVGVRML'), 
    '2', true)

WebUI.click(findTestObject('Old_Test_case/export_layout/Page_Emagine Administration Application 11.5.0/button_OK'))

WebUI.delay(5)

WebUI.selectOptionByValue(findTestObject('Old_Test_case/export_layout/Page_Emagine Administration Application 11.5.0/select_DotGraffleGraphMLPDFPNGSVGVRML'), 
    '3', true)

WebUI.click(findTestObject('Old_Test_case/export_layout/Page_Emagine Administration Application 11.5.0/button_OK'))

WebUI.delay(5)

WebUI.selectOptionByValue(findTestObject('Old_Test_case/export_layout/Page_Emagine Administration Application 11.5.0/select_DotGraffleGraphMLPDFPNGSVGVRML'), 
    '4', true)

WebUI.click(findTestObject('Old_Test_case/export_layout/Page_Emagine Administration Application 11.5.0/button_OK'))

WebUI.selectOptionByValue(findTestObject('Old_Test_case/export_layout/Page_Emagine Administration Application 11.5.0/select_DotGraffleGraphMLPDFPNGSVGVRML'), 
    '5', true)

WebUI.delay(5)

WebUI.click(findTestObject('Old_Test_case/export_layout/Page_Emagine Administration Application 11.5.0/button_OK'))

WebUI.delay(5)

WebUI.selectOptionByValue(findTestObject('Old_Test_case/export_layout/Page_Emagine Administration Application 11.5.0/select_DotGraffleGraphMLPDFPNGSVGVRML'), 
    '6', true)

WebUI.delay(5)

WebUI.click(findTestObject('Old_Test_case/export_layout/Page_Emagine Administration Application 11.5.0/button_OK'))

WebUI.click(findTestObject('Old_Test_case/export_layout/Page_Emagine Administration Application 11.5.0/button_Cancel'))

WebUI.click(findTestObject('Old_Test_case/export_layout/Page_Emagine Administration Application 11.5.0/button_Close'))

WebUI.closeBrowser()

