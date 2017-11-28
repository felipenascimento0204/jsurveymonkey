package br.com.devfast.jsurveymonkey;

import br.com.devfast.jsurveymonkey.enums.StatusSurveyResponse;
import br.com.devfast.jsurveymonkey.request.GetSurveyRequest;
import br.com.devfast.jsurveymonkey.services.GetSurveyService;
import junit.framework.TestCase;

public class GetSurveyTest extends TestCase {
	
	public void testGetSurvey(){
		GetSurveyService getSurveyService = new GetSurveyService();
		GetSurveyRequest getSurveyRequest = new GetSurveyRequest("126921666");
		getSurveyRequest.setAuthenticationToken(".ehbI6Xo83VVFH3H5AFH4bxt.VDCV4F45pLrHIQ1bKxxf7lKbJNUvotUw9ND2KbUcSwzpQiyvjws7NC9yB06JAW0L9Bdq7ws8.25.TpkMglD9r9MCwvhLdm3Z2u.SQ1x");
		assertEquals(StatusSurveyResponse.SUCCESS, getSurveyService.requestGetSurvey(getSurveyRequest).getStatus());
	}

}
