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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:8081/')

WebUI.setText(findTestObject('Object Repository/Navegando/Page_Login/input_Login_css-textinput-11aywtz r-placeho_f2d72d_18'), 
    'rm98604@fiap.com.br')

WebUI.setEncryptedText(findTestObject('Object Repository/Navegando/Page_Login/input_Login_css-textinput-11aywtz r-placeho_f2d72d_35'), 
    'VyCYYIKrGZmrTWKjNVUP7A==')

WebUI.click(findTestObject('Object Repository/Navegando/Page_Login/div_Login_css-text-146c3p1 r-color-jwli3a r_992836'))

WebUI.click(findTestObject('Object Repository/Navegando/Page_Main/div__css-text-146c3p1 r-userSelect-lrvibr'))

WebUI.click(findTestObject('Object Repository/Navegando/Page_Main/div__css-view-g5y9jx r-alignItems-1awozwy r_36202e'))

WebUI.click(findTestObject('Object Repository/Navegando/Page_Chat/a_Chat_css-view-g5y9jx r-touchAction-1otgn7_345ddd'))

WebUI.click(findTestObject('Object Repository/Navegando/Page_History/div__css-text-146c3p1 r-userSelect-lrvibr'))

WebUI.click(findTestObject('Object Repository/Navegando/Page_Suitability/a_Suitability_css-view-g5y9jx r-touchAction_9e761c'))

WebUI.click(findTestObject('Object Repository/Navegando/Page_Profile/div__css-text-146c3p1 r-fontSize-1i10wst r-_2b7afa'))

