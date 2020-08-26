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

WebUI.navigateToUrl(Url)

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/test2/Page_HealthHub/strong_Myhealth'))

WebUI.click(findTestObject('Object Repository/test2/Page_HealthHub/a_Login with'))

WebUI.click(findTestObject('Object Repository/test2/Page_SingPass Login/div_SingPass                Singapore Gover_f889cf'))

WebUI.click(findTestObject('Object Repository/test2/Page_SingPass Login/a_PASSWORD LOGIN'))

WebUI.setText(findTestObject('Object Repository/test2/Page_SingPass Login/input_SingPass ID_loginID'), UserName)

WebUI.click(findTestObject('Object Repository/test2/Page_SingPass Login/div_SINGPASS MOBILE                        _1d32d7'))

WebUI.setEncryptedText(findTestObject('Object Repository/test2/Page_SingPass Login/input_Password_password'), Password)

WebUI.click(findTestObject('Object Repository/test2/Page_SingPass Login/button_Login'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/test2/Page_MyHealth - Personal Health/a_Medication Refill'))

WebUI.click(findTestObject('Object Repository/test2/Page_Startup - Medication Refill/div_Ng Teng Fong General Hospital'))

WebUI.click(findTestObject('Object Repository/test2/Page_NTFGH - Medication Refill/img'))

WebUI.click(findTestObject('Object Repository/test2/Page_NTFGH - Medication Refill/a_WITH PHARMACY'))

WebUI.setText(findTestObject('Object Repository/test2/Page_NTFGH - Medication Refill/input_Contact Details_contact'), PhoneNumber)

WebUI.click(findTestObject('Object Repository/test2/Page_NTFGH - Medication Refill/input_Contact Number(65)_email'))

WebUI.setText(findTestObject('Object Repository/test2/Page_NTFGH - Medication Refill/input_Contact Number(65)_email'), Email)

WebUI.click(findTestObject('Object Repository/test2/Page_NTFGH - Medication Refill/input_Email_next'))

WebUI.click(findTestObject('Object Repository/Page_NTFGH - Medication Refill/i_date_range'))

WebUI.click(findTestObject('Object Repository/Page_NTFGH - Medication Refill/div_21'))

WebUI.click(findTestObject('Object Repository/test2/Page_NTFGH - Medication Refill/input_clear_next'))

WebUI.click(findTestObject('Object Repository/test2/Page_NTFGH - Medication Refill/input_Email_next'))

WebUI.click(findTestObject('Object Repository/test2/Page_NTFGH - Medication Refill/div_All my balance medication'))

WebUI.click(findTestObject('Object Repository/test2/Page_NTFGH - Medication Refill/input_Email_next'))

WebUI.click(findTestObject('Object Repository/test2/Page_NTFGH - Medication Refill/div_Use Company  Insurance Medical Benefit Card'))

WebUI.click(findTestObject('Object Repository/test2/Page_NTFGH - Medication Refill/input_Email_next'))

WebUI.click(findTestObject('Object Repository/test2/Page_NTFGH - Medication Refill/div_        Pick up at pharmacy'))

WebUI.click(findTestObject('Object Repository/test2/Page_NTFGH - Medication Refill/span_Preferred CollectionDelivery Time'))

WebUI.click(findTestObject('Object Repository/test2/Page_NTFGH - Medication Refill/span_830am to 7pm'))

WebUI.click(findTestObject('Object Repository/test2/Page_NTFGH - Medication Refill/button_Next'))

WebUI.setText(findTestObject('Object Repository/Page_NTFGH - Medication Refill/textarea_SPECIAL REQUEST (IF ANY)_specialRequest'), 
    TextArea)

WebUI.click(findTestObject('Object Repository/TC1_Logout/Page_NTFGH - Medication Refill/a_log out'))

WebUI.closeBrowser()

