package br.com.devfast.jsurveymonkey;

import br.com.devfast.jsurveymonkey.enums.StatusSurveyResponse;
import br.com.devfast.jsurveymonkey.request.CreateSurveyRequest;
import br.com.devfast.jsurveymonkey.services.SurveyService;
import junit.framework.TestCase;

public class CreateSurveyTest extends TestCase {
	
	private static String AUTH_TOKEN = ".ehbI6Xo83VVFH3H5AFH4bxt.VDCV4F45pLrHIQ1bKxxf7lKbJNUvotUw9ND2KbUcSwzpQiyvjws7NC9yB06JAW0L9Bdq7ws8.25.TpkMglD9r9MCwvhLdm3Z2u.SQ1x";
	
	public void testCreatetSurvey(){
		SurveyService getSurveyService = new SurveyService();
		CreateSurveyRequest createSurveyRequest = new CreateSurveyRequest();
		createSurveyRequest.setAuthenticationToken(AUTH_TOKEN);
		createSurveyRequest.setTitle("Test survey by integration");
		assertEquals(StatusSurveyResponse.SUCCESS, getSurveyService.requestCreateSurvey(createSurveyRequest).getStatus());
	}

}
