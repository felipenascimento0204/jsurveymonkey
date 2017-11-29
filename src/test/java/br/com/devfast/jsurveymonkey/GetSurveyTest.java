package br.com.devfast.jsurveymonkey;

import br.com.devfast.jsurveymonkey.enums.StatusSurveyResponse;
import br.com.devfast.jsurveymonkey.request.GetSurveyRequest;
import br.com.devfast.jsurveymonkey.services.SurveyService;
import junit.framework.TestCase;

public class GetSurveyTest extends TestCase {
	
	private static String AUTH_TOKEN = ".ehbI6Xo83VVFH3H5AFH4bxt.VDCV4F45pLrHIQ1bKxxf7lKbJNUvotUw9ND2KbUcSwzpQiyvjws7NC9yB06JAW0L9Bdq7ws8.25.TpkMglD9r9MCwvhLdm3Z2u.SQ1x";
	private static String SURVEY_ID = "126921666";
	
	public void testGetSurvey(){
		SurveyService getSurveyService = new SurveyService();
		GetSurveyRequest getSurveyRequest = new GetSurveyRequest(SURVEY_ID);
		getSurveyRequest.setAuthenticationToken(AUTH_TOKEN);
		assertEquals(StatusSurveyResponse.SUCCESS, getSurveyService.requestGetSurvey(getSurveyRequest).getStatus());
	}

}
