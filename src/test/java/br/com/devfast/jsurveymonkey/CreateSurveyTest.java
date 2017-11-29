package br.com.devfast.jsurveymonkey;

import br.com.devfast.jsurveymonkey.enums.StatusSurveyResponse;
import br.com.devfast.jsurveymonkey.request.CreateSurveyRequest;
import br.com.devfast.jsurveymonkey.services.SurveyService;
import junit.framework.TestCase;

public class CreateSurveyTest extends TestCase {
	
	private static String AUTH_TOKEN = "SURVEY_API_TOKEN_HERE";
	
	public void testCreatetSurvey(){
		SurveyService getSurveyService = new SurveyService();
		CreateSurveyRequest createSurveyRequest = new CreateSurveyRequest();
		createSurveyRequest.setAuthenticationToken(AUTH_TOKEN);
		createSurveyRequest.setTitle("SURVEY_TITLE_HERE");
		createSurveyRequest.setNickname("SURVEY_NICKNAME_HERE");
		createSurveyRequest.setFrom_survey_id("FROM_SURVEY_ID_HERE");
		assertEquals(StatusSurveyResponse.SUCCESS, getSurveyService.requestCreateSurvey(createSurveyRequest).getStatus());
	}

}
