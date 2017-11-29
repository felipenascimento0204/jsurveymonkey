package br.com.devfast.jsurveymonkey;

import br.com.devfast.jsurveymonkey.enums.StatusSurveyResponse;
import br.com.devfast.jsurveymonkey.request.GetSurveyRequest;
import br.com.devfast.jsurveymonkey.services.SurveyService;
import junit.framework.TestCase;

public class GetSurveyTest extends TestCase {
	
	private static String AUTH_TOKEN = "SURVEY_API_TOKEN_HERE";
	private static String SURVEY_ID = "SURVEY_ID_HERE";
	
	public void testGetSurvey(){
		SurveyService getSurveyService = new SurveyService();
		GetSurveyRequest getSurveyRequest = new GetSurveyRequest(SURVEY_ID);
		getSurveyRequest.setAuthenticationToken(AUTH_TOKEN);
		assertEquals(StatusSurveyResponse.SUCCESS, getSurveyService.getSurvey(getSurveyRequest).getResponseStatus());
	}

}
