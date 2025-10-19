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

WebUI.setText(findTestObject('Object Repository/Suitability/Page_Login/input_Login_css-textinput-11aywtz r-placeho_f2d72d_15'), 
    'teste2@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Suitability/Page_Login/input_Login_css-textinput-11aywtz r-placeho_f2d72d_23'), 
    'iEJD8MEks6rvy5tk59lHxA==')

WebUI.click(findTestObject('Object Repository/Suitability/Page_Login/div_Login_css-text-146c3p1 r-color-jwli3a r_992836'))

WebUI.click(findTestObject('Object Repository/Suitability/Page_Main/div_Conversar com o Assistente_css-view-g5y_5ab073'))

WebUI.click(findTestObject('Object Repository/Suitability/Page_Suitability/div_Refaa seu perfil de investidor aqui_css_0b5dfa'))

WebUI.click(findTestObject('Object Repository/Suitability/Page_Suitability/div_D) Obter lucros rpidos, mesmo que tenha_707ccb'))

WebUI.click(findTestObject('Object Repository/Suitability/Page_Suitability/div_Refaa seu perfil de investidor aqui_css_0b5dfa_1'))

WebUI.click(findTestObject('Object Repository/Suitability/Page_Suitability/div_D) Obter lucros rpidos, mesmo que tenha_707ccb'))

WebUI.click(findTestObject('Object Repository/Suitability/Page_Suitability/div_Refaa seu perfil de investidor aqui_css_0b5dfa_2'))

WebUI.click(findTestObject('Object Repository/Suitability/Page_Suitability/div_D) Obter lucros rpidos, mesmo que tenha_707ccb'))

WebUI.click(findTestObject('Object Repository/Suitability/Page_Suitability/div_Refaa seu perfil de investidor aqui_css_0b5dfa_3'))

WebUI.click(findTestObject('Object Repository/Suitability/Page_Suitability/div_D) Mais de 5 anos_css-text-146c3p1 r-co_29fd08'))

WebUI.click(findTestObject('Object Repository/Suitability/Page_Suitability/div_Q1 A  Q2 A  Q3 A  Q4 A_css-text-146c3p1_2179ec'))

WebUI.click(findTestObject('Object Repository/Suitability/Page_Suitability/div__css-text-146c3p1 r-maxWidth-dnmrzs r-o_1f48a7'))

WebUI.click(findTestObject('Object Repository/Suitability/Page_History/div__css-text-146c3p1 r-maxWidth-dnmrzs r-o_1f48a7'))

