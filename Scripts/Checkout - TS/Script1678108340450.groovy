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

'Click icon shopping chart'
WebUI.click(findTestObject('Object Repository/Checkout/a_3'))

'Click button Chekout'
WebUI.click(findTestObject('Object Repository/Checkout/button_Checkout'))

'Input First Name'
WebUI.setText(findTestObject('Object Repository/Checkout/input_Checkout Your Information_firstName'), 'Syaeful')

'Input Last Name'
WebUI.setText(findTestObject('Object Repository/Checkout/input_Checkout Your Information_lastName'), 'Anwar')

'Input Kode POS'
WebUI.setText(findTestObject('Object Repository/Checkout/input_Checkout Your Information_postalCode'), '40254')

'Click button Continue'
WebUI.click(findTestObject('Object Repository/Checkout/input_Cancel_continue'))

'Click button Finish'
WebUI.click(findTestObject('Object Repository/Checkout/button_Finish'))

'Click button Back Home'
WebUI.click(findTestObject('Object Repository/Checkout/button_Back Home'))

