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

WebUI.callTestCase(findTestCase('Old_Test_case/Tc_01'), [:], FailureHandling.OPTIONAL)

WebUI.delay(5)

WebUI.click(findTestObject('Old_Test_case/campaign search and create/Page_Emagine Administration Application 11.5.0/a_Configuration Manager'))

WebUI.click(findTestObject('Old_Test_case/campaign search and create/Page_Emagine Administration Application 11.5.0/a_Customer Contact'))

WebUI.click(findTestObject('Old_Test_case/campaign search and create/Page_Emagine Administration Application 11.5.0/a_Campaigns'))

WebUI.selectOptionByValue(findTestObject('Old_Test_case/campaign_visualization/campaign_start_restart/Page_Emagine Administration Application 11.5.0/select_Campaign CodeCampaign IDCampaign Nam_e00e6e'), 
    'label', true)

WebUI.setText(findTestObject('Old_Test_case/campaign_visualization/campaign_start_restart/Page_Emagine Administration Application 11.5.0/input_Search - Campaigns_Search_Campaigns_s_5a257b'), 
    'automation')

WebUI.click(findTestObject('Old_Test_case/campaign_visualization/campaign_start_restart/Page_Emagine Administration Application 11.5.0/button_Search'))

WebUI.click(findTestObject('Old_Test_case/campaign_visualization/campaign_start_restart/Page_Emagine Administration Application 11.5.0/div_Automation testing'))

WebUI.click(findTestObject('Old_Test_case/campaign_visualization/campaign_start_restart/Page_Emagine Administration Application 11.5.0/button_Modify'))

WebUI.click(findTestObject('Old_Test_case/campaign_visualization/campaign_start_restart/Page_Emagine Administration Application 11.5.0/button_Visualise'))

WebUI.switchToWindowIndex('1')

WebUI.closeWindowIndex('1')

WebUI.delay(5)

WebUI.selectOptionByLabel(findTestObject('Old_Test_case/campaign_visualization/campaign_start_restart/Page_Emagine Administration Application 11.5.0/select_Right to leftLeft to rightBottom to _df899f'), 
    'Bottom to top', true)

WebUI.click(findTestObject('Old_Test_case/campaign_visualization/campaign_start_restart/Page_Emagine Administration Application 11.5.0/button_Visualise'))

WebUI.delay(5)

WebUI.selectOptionByLabel(findTestObject('Old_Test_case/campaign_visualization/campaign_start_restart/Page_Emagine Administration Application 11.5.0/select_Right to leftLeft to rightBottom to _df899f'), 
    'Left to right', true)

WebUI.click(findTestObject('Old_Test_case/campaign_visualization/campaign_start_restart/Page_Emagine Administration Application 11.5.0/button_Visualise'))

WebUI.delay(5)

WebUI.selectOptionByLabel(findTestObject('Old_Test_case/campaign_visualization/campaign_start_restart/Page_Emagine Administration Application 11.5.0/select_Right to leftLeft to rightBottom to _df899f'), 
    'Right to left', true)

WebUI.click(findTestObject('Old_Test_case/campaign_visualization/campaign_start_restart/Page_Emagine Administration Application 11.5.0/button_Visualise'))

WebUI.delay(5)

WebUI.click(findTestObject('Old_Test_case/campaign_visualization/campaign_start_restart/Page_Emagine Administration Application 11.5.0/li_PNG'))

WebUI.click(findTestObject('Old_Test_case/campaign_visualization/campaign_start_restart/Page_Emagine Administration Application 11.5.0/input_PNG_bf0ab215290628b9c46e06359ff940b3__accaf3'))

WebUI.click(findTestObject('Old_Test_case/campaign_visualization/campaign_start_restart/Page_Emagine Administration Application 11.5.0/button_Visualise'))

WebUI.selectOptionByValue(findTestObject('Old_Test_case/campaign_visualization/campaign_start_restart/Page_Emagine Administration Application 11.5.0/select_Right to leftLeft to rightBottom to _df899f'), 
    'LR', true)

WebUI.click(findTestObject('Old_Test_case/campaign_visualization/campaign_start_restart/Page_Emagine Administration Application 11.5.0/button_Visualise'))

WebUI.selectOptionByValue(findTestObject('Old_Test_case/campaign_visualization/campaign_start_restart/Page_Emagine Administration Application 11.5.0/select_Right to leftLeft to rightBottom to _df899f'), 
    'BT', true)

WebUI.click(findTestObject('Old_Test_case/campaign_visualization/campaign_start_restart/Page_Emagine Administration Application 11.5.0/button_Visualise'))

WebUI.selectOptionByValue(findTestObject('Old_Test_case/campaign_visualization/campaign_start_restart/Page_Emagine Administration Application 11.5.0/select_Right to leftLeft to rightBottom to _df899f'), 
    'TB', true)

WebUI.click(findTestObject('Old_Test_case/campaign_visualization/campaign_start_restart/Page_Emagine Administration Application 11.5.0/button_Visualise'))

WebUI.click(findTestObject('Old_Test_case/campaign_visualization/campaign_start_restart/Page_Emagine Administration Application 11.5.0/button_Export Layout'))

WebUI.selectOptionByValue(findTestObject('Old_Test_case/campaign_visualization/campaign_start_restart/Page_Emagine Administration Application 11.5.0/select_DotGraffleGraphMLPDFPNGSVGVRML'), 
    '0', true)

WebUI.click(findTestObject('Old_Test_case/campaign_visualization/campaign_start_restart/Page_Emagine Administration Application 11.5.0/button_OK'))

WebUI.selectOptionByValue(findTestObject('Old_Test_case/campaign_visualization/campaign_start_restart/Page_Emagine Administration Application 11.5.0/select_DotGraffleGraphMLPDFPNGSVGVRML'), 
    '1', true)

WebUI.click(findTestObject('Old_Test_case/campaign_visualization/campaign_start_restart/Page_Emagine Administration Application 11.5.0/button_OK'))

WebUI.selectOptionByValue(findTestObject('Old_Test_case/campaign_visualization/campaign_start_restart/Page_Emagine Administration Application 11.5.0/select_DotGraffleGraphMLPDFPNGSVGVRML'), 
    '2', true)

WebUI.click(findTestObject('Old_Test_case/campaign_visualization/campaign_start_restart/Page_Emagine Administration Application 11.5.0/button_OK'))

WebUI.selectOptionByValue(findTestObject('Old_Test_case/campaign_visualization/campaign_start_restart/Page_Emagine Administration Application 11.5.0/select_DotGraffleGraphMLPDFPNGSVGVRML'), 
    '3', true)

WebUI.click(findTestObject('Old_Test_case/campaign_visualization/campaign_start_restart/Page_Emagine Administration Application 11.5.0/button_OK'))

WebUI.selectOptionByValue(findTestObject('Old_Test_case/campaign_visualization/campaign_start_restart/Page_Emagine Administration Application 11.5.0/select_DotGraffleGraphMLPDFPNGSVGVRML'), 
    '4', true)

WebUI.click(findTestObject('Old_Test_case/campaign_visualization/campaign_start_restart/Page_Emagine Administration Application 11.5.0/button_OK'))

WebUI.selectOptionByValue(findTestObject('Old_Test_case/campaign_visualization/campaign_start_restart/Page_Emagine Administration Application 11.5.0/select_DotGraffleGraphMLPDFPNGSVGVRML'), 
    '5', true)

WebUI.click(findTestObject('Old_Test_case/campaign_visualization/campaign_start_restart/Page_Emagine Administration Application 11.5.0/button_OK'))

WebUI.selectOptionByValue(findTestObject('Old_Test_case/campaign_visualization/campaign_start_restart/Page_Emagine Administration Application 11.5.0/select_DotGraffleGraphMLPDFPNGSVGVRML'), 
    '6', true)

WebUI.click(findTestObject('Old_Test_case/campaign_visualization/campaign_start_restart/Page_Emagine Administration Application 11.5.0/button_OK'))

WebUI.click(findTestObject('Old_Test_case/campaign_visualization/campaign_start_restart/Page_Emagine Administration Application 11.5.0/button_Cancel'))

WebUI.click(findTestObject('campaign search and create/Page_Emagine Administration Application 11.5.0/start_campaign_button'))

WebUI.waitForAlert(5)

WebUI.acceptAlert(FailureHandling.OPTIONAL)

WebUI.delay(5)

WebUI.acceptAlert()

WebUI.click(findTestObject('Old_Test_case/campaign_visualization/campaign_start_restart/Page_Emagine Administration Application 11.5.0/button_Pause Campaign'))

WebUI.click(findTestObject('Old_Test_case/campaign_visualization/campaign_start_restart/Page_Emagine Administration Application 11.5.0/div_Campaign DetailsCampaign Status Status _50818b'))

WebUI.click(findTestObject('Old_Test_case/campaign_visualization/campaign_start_restart/Page_Emagine Administration Application 11.5.0/button_Pause Campaign'))

WebUI.click(findTestObject('Old_Test_case/campaign_visualization/campaign_start_restart/Page_Emagine Administration Application 11.5.0/button_Restart Campaign'))

WebUI.click(findTestObject('Old_Test_case/campaign_visualization/campaign_start_restart/Page_Emagine Administration Application 11.5.0/div_Campaign Management Platform'))

WebUI.click(findTestObject('Old_Test_case/campaign_visualization/campaign_start_restart/Page_Emagine Administration Application 11.5.0/button_Restart Campaign'))

WebUI.click(findTestObject('Old_Test_case/campaign_visualization/campaign_start_restart/Page_Emagine Administration Application 11.5.0/header_Campaign Management Platform'))

WebUI.click(findTestObject('Old_Test_case/campaign_visualization/campaign_start_restart/Page_Emagine Administration Application 11.5.0/button_Restart Campaign'))

WebUI.click(findTestObject('Old_Test_case/campaign_visualization/campaign_start_restart/Page_Emagine Administration Application 11.5.0/div_Campaign Management Platform'))

WebUI.click(findTestObject('Old_Test_case/campaign_visualization/campaign_start_restart/Page_Emagine Administration Application 11.5.0/button_Restart Campaign'))

WebUI.click(findTestObject('Old_Test_case/campaign_visualization/campaign_start_restart/Page_Emagine Administration Application 11.5.0/div_Campaign Management Platform'))

WebUI.click(findTestObject('Old_Test_case/campaign_visualization/campaign_start_restart/Page_Emagine Administration Application 11.5.0/button_Restart Campaign'))

WebUI.click(findTestObject('Old_Test_case/campaign_visualization/campaign_start_restart/Page_Emagine Administration Application 11.5.0/header_Campaign Management Platform'))

WebUI.click(findTestObject('Old_Test_case/campaign_visualization/campaign_start_restart/Page_Emagine Administration Application 11.5.0/button_Restart Campaign'))

WebUI.click(findTestObject('Old_Test_case/campaign_visualization/campaign_start_restart/Page_Emagine Administration Application 11.5.0/div_Campaign DetailsCampaign Status Status _50818b'))

WebUI.click(findTestObject('Old_Test_case/campaign_visualization/campaign_start_restart/Page_Emagine Administration Application 11.5.0/button_Close'))

WebUI.closeBrowser()

